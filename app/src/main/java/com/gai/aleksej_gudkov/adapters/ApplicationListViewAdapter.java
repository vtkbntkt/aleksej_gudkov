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

    public static class ViewHolder {
        private TextView mLikeCount;
        private TextView mTargetCompanyType;
        private TextView mAccidentAddress;
        private TextView mRegDate;
        private TextView mDaysRest;
        private ImageView mLikeImage;
        private ImageView mSymbolImage;

        public ViewHolder(View convertView) {
            mLikeCount =
                    (TextView) convertView.findViewById(R.id.like_count);
            mTargetCompanyType =
                    (TextView) convertView.findViewById(R.id.target_company_type);
            mAccidentAddress =
                    (TextView) convertView.findViewById(R.id.accident_address);
            mRegDate =
                    (TextView) convertView.findViewById(R.id.reg_date);
            mDaysRest =
                    (TextView) convertView.findViewById(R.id.days_rest);
            mLikeImage =
                    (ImageView) convertView.findViewById(R.id.image_like_button);
            mSymbolImage =
                    (ImageView) convertView.findViewById(R.id.image_symbol);
        }
    }

    public ApplicationListViewAdapter(Context context, List<TaskCardCreator> taskCard) {
        super(context, android.R.layout.simple_list_item_1, taskCard);
        mContext = context;
        mTaskCard = taskCard;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView =
                    LayoutInflater.from(mContext).inflate(R.layout.task_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mLikeCount.setText(
                mTaskCard.get(position).getmLikeCount());
        holder.mTargetCompanyType.setText(
                mTaskCard.get(position).getmTargetCompanyType());
        holder.mAccidentAddress.setText(
                mTaskCard.get(position).getmAccidentAddress());
        holder.mRegDate.setText(
                mTaskCard.get(position).getmRegDate());
        holder.mLikeImage.setImageResource(
                mTaskCard.get(position).getmLikeId());
        holder.mSymbolImage.setImageResource(
                mTaskCard.get(position).getmSymbolId());

        if (mTaskCard.get(position).getmDaysRest() != null) {
            holder.mDaysRest.setText(
                    mTaskCard.get(position).getmDaysRest());
        } else {
            holder.mDaysRest.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }

}
