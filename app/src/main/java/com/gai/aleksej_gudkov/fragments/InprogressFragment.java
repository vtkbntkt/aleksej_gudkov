package com.gai.aleksej_gudkov.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gai.aleksej_gudkov.adapters.ApplicationRecyclerAdapter;
import com.gai.aleksej_gudkov.DetailedActivity;
import com.gai.aleksej_gudkov.R;
import com.gai.aleksej_gudkov.listeners.RecyclerTouchListener;
import com.gai.aleksej_gudkov.data.TaskCardCreator;
import com.gai.aleksej_gudkov.utility.VerticalSpaceItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class InprogressFragment extends Fragment {
    private List<TaskCardCreator> mInprogressTasks;
    private static final String INPROGRESS_TASK = "inprogressdb";

    public InprogressFragment() {

    }

    public static InprogressFragment newInstance(ArrayList<TaskCardCreator> inprogressTasks) {
        InprogressFragment inprogressFragment = new InprogressFragment();

        Bundle args = new Bundle();
        args.putParcelableArrayList(INPROGRESS_TASK, inprogressTasks);

        inprogressFragment.setArguments(args);

        return inprogressFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mInprogressTasks =
                    getArguments().getParcelableArrayList(INPROGRESS_TASK);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =
                inflater.inflate(R.layout.fragment_inprogress, container, false);

        final RecyclerView recyclerView =
                (RecyclerView) rootView.findViewById(R.id.recycler_view_inprogress);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter =
                new ApplicationRecyclerAdapter(mInprogressTasks);
        recyclerView.setAdapter(adapter);

        int verticalItemSpace =
                (int) getResources().getDimension(R.dimen.vertical_item_space);
        recyclerView.addItemDecoration(
                new VerticalSpaceItemDecoration(verticalItemSpace));

        recyclerView.addOnItemTouchListener(
                new RecyclerTouchListener(getActivity(), recyclerView, new RecyclerTouchListener.ClickListener() {

                    @Override
                    public void onClick(View view, int position) {

                        long cardId =
                                mInprogressTasks.get(position).getmItemId();
                        Intent intent =
                                new Intent(getActivity(), DetailedActivity.class);
                        intent.putExtra(DetailedActivity.CARD_ID, cardId);
                        startActivity(intent);
                    }
                }));

        return rootView;
    }
}



