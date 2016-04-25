package com.gai.aleksej_gudkov.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gai.aleksej_gudkov.R;
import com.gai.aleksej_gudkov.data.TaskCardCreator;

import java.util.List;


public class ApplicationListViewAdapter extends
        ArrayAdapter<TaskCardCreator> {

    private Context mContext;
    private List<TaskCardCreator> mTaskCard;

    public ApplicationListViewAdapter(Context context, List<TaskCardCreator> taskCard) {
        super(context, -1, taskCard); //[Comment] What is -1?
        mContext = context;
        mTaskCard = taskCard;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE); //[Comment] LayoutInflater.from(mContext);
        //[Comment] Bad. Use viewholder for listview

        View rowView = inflater.inflate(R.layout.task_item, parent, false);

        TextView mLikeCount= //[Comment] Wrong names
                (TextView) rowView.findViewById(R.id.like_count);
        TextView mTargetCompanyType=
                (TextView) rowView.findViewById(R.id.target_company_type);
        TextView mAccidentAddress=
                (TextView) rowView.findViewById(R.id.accident_address);
        TextView mRegDate=
                (TextView) rowView.findViewById(R.id.reg_date);
        TextView mDaysRest=
                (TextView) rowView.findViewById(R.id.days_rest);
        ImageView mLikeImage= //[Comment] Bad formatting
                (ImageView) rowView.findViewById(R.id.image_like_button);
        ImageView mSymbolImage=
                (ImageView) rowView.findViewById(R.id.image_symbol);

        mLikeCount.setText(
                mTaskCard.get(position).getmLikeCount());
        mTargetCompanyType.setText(
                mTaskCard.get(position).getmTargetCompanyType());
        mAccidentAddress.setText(
                mTaskCard.get(position).getmAccidentAddress());
        mRegDate.setText(
                mTaskCard.get(position).getmRegDate());
        mLikeImage.setImageResource(
                mTaskCard.get(position).getmLikeId());
        mSymbolImage.setImageResource(
                mTaskCard.get(position).getmSymbolId());

        if (mTaskCard.get(position).getmDaysRest() != null) {
            mDaysRest.setText(
                    mTaskCard.get(position).getmDaysRest());
        } else {
            mDaysRest.setVisibility(View.INVISIBLE);
        }

        return rowView;
    }

}
