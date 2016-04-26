package com.gai.aleksej_gudkov.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gai.aleksej_gudkov.R;
import com.gai.aleksej_gudkov.data.TaskCardCreator;

import java.util.List;


public class ApplicationRecyclerAdapter extends
        RecyclerView.Adapter<ApplicationRecyclerAdapter.TaskCardHolder> {

    private List<TaskCardCreator> mInprogressTasks;

    public static class TaskCardHolder extends RecyclerView.ViewHolder {
        private TextView mLikeCount;
        private TextView mTargetCompanyType;
        private TextView mAccidentAddress;
        private TextView mRegDate;
        private TextView mDaysRest;
        private ImageView mLikeImage;
        private ImageView mSymbolImage;

        public TaskCardHolder(View v) {
            super(v);
            mLikeCount =
                    (TextView) itemView.findViewById(R.id.like_count);
            mTargetCompanyType =
                    (TextView) itemView.findViewById(R.id.target_company_type);
            mAccidentAddress =
                    (TextView) itemView.findViewById(R.id.accident_address);
            mRegDate =
                    (TextView) itemView.findViewById(R.id.reg_date);
            mDaysRest =
                    (TextView) itemView.findViewById(R.id.days_rest);
            mLikeImage =
                    (ImageView) itemView.findViewById(R.id.image_like_button);
            mSymbolImage =
                    (ImageView) itemView.findViewById(R.id.image_symbol);

        }

    }

    public ApplicationRecyclerAdapter(List<TaskCardCreator> mInprogressTasks) {
        this.mInprogressTasks = mInprogressTasks;
    }


    @Override
    public ApplicationRecyclerAdapter.TaskCardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item, parent, false);
        return new TaskCardHolder(v);
    }


    @Override
    public void onBindViewHolder(ApplicationRecyclerAdapter.TaskCardHolder holder, int position) {
        holder.mLikeCount.setText(
                mInprogressTasks.get(position).getmLikeCount());
        holder.mTargetCompanyType.setText(
                mInprogressTasks.get(position).getmTargetCompanyType());
        holder.mAccidentAddress.setText(
                mInprogressTasks.get(position).getmAccidentAddress());
        holder.mRegDate.setText(
                mInprogressTasks.get(position).getmRegDate());
        holder.mLikeImage.setImageResource(
                mInprogressTasks.get(position).getmLikeId());
        holder.mSymbolImage.setImageResource(
                mInprogressTasks.get(position).getmSymbolId());
        if (mInprogressTasks.get(position).getmDaysRest() != null) {
            holder.mDaysRest.setText(
                    mInprogressTasks.get(position).getmDaysRest());
        } else {
            holder.mDaysRest.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mInprogressTasks == null ? 0 : mInprogressTasks.size();
    }
}
