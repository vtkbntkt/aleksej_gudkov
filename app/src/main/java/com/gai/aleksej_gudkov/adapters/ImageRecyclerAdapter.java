package com.gai.aleksej_gudkov.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.gai.aleksej_gudkov.R;
import com.squareup.picasso.Picasso;


public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.ViewHolder> {

    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mImageView =
                    (ImageView) itemView.findViewById(R.id.imageView);
        }
    }


    public ImageRecyclerAdapter(String[] myDataset) {
        mDataset = myDataset;
    }


    @Override
    public ImageRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.accident_photo, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageRecyclerAdapter.ViewHolder holder, int position) {

        Context context =
                holder.mImageView.getContext();

        Picasso.with(context).load(mDataset[position]).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }


}
