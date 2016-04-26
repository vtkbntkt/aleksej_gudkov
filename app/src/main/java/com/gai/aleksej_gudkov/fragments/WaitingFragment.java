package com.gai.aleksej_gudkov.fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gai.aleksej_gudkov.listeners.CustomListViewScrollListener;
import com.gai.aleksej_gudkov.DetailedActivity;
import com.gai.aleksej_gudkov.adapters.ApplicationListViewAdapter;
import com.gai.aleksej_gudkov.R;
import com.gai.aleksej_gudkov.data.TaskCardCreator;

import java.util.ArrayList;
import java.util.List;


public class WaitingFragment extends Fragment {
    private List<TaskCardCreator> mTaskCard;
    private static final String WAITING_TASK = "waitingdb";
    public ListViewScrollListener mListListener;

    public WaitingFragment() {
    }

    public static WaitingFragment newInstance(ArrayList<TaskCardCreator> taskCard) {
        WaitingFragment waitingFragment = new WaitingFragment();
        Bundle args = new Bundle();
        args.putParcelableArrayList(WAITING_TASK, taskCard);
        waitingFragment.setArguments(args);
        return waitingFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mTaskCard = getArguments().getParcelableArrayList(WAITING_TASK);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.fragment_waiting, container, false);
        ListView listview =
                (ListView) rootView.findViewById(R.id.listview);

        final ApplicationListViewAdapter adapter =
                new ApplicationListViewAdapter(getActivity(), mTaskCard);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                long cardId =
                        mTaskCard.get(position).getmItemId();
                Intent intent =
                        new Intent(getActivity(), DetailedActivity.class);
                intent.putExtra(DetailedActivity.CARD_ID, cardId);
                startActivity(intent);
            }

        });

        listview.setOnTouchListener(new CustomListViewScrollListener(getActivity(),
                new CustomListViewScrollListener.CustomScrollListener() {

                    @Override
                    public void onScroll() {
                        mListListener.scrollList();
                    }

                    @Override
                    public void onStopScroll() {
                        mListListener.stopScrollList();
                    }
                }));

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            mListListener = (ListViewScrollListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement ListViewScrollListener");
        }
    }

    public interface ListViewScrollListener {
        void scrollList();

        void stopScrollList();
    }

}
