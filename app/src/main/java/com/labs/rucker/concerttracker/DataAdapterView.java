package com.labs.rucker.concerttracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DataAdapterView extends RecyclerView.Adapter<DataAdapterView.ViewHolder> {
    private ArrayList<AndroidVersion> android;
    private Context context;
    private ClickListener clickListener;

    public DataAdapterView(Context context, ArrayList<AndroidVersion> android) {
        this.android = android;
        this.context = context;
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }


    @Override
    public DataAdapterView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapterView.ViewHolder viewHolder, int i) {

        viewHolder.tv_android.setText(android.get(i).getAndroid_version_name());
        // Picasso.with(context).load(android.get(i).getAndroid_image_url()).centerCrop().resize(640, 640).into(viewHolder.img_android);//240,120
        Glide.with(context).load(android.get(i).getAndroid_image_url()).override(640, 640).centerCrop().into(viewHolder.img_android);//240,120
    }

    @Override
    public int getItemCount() {

        return android.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tv_android;
        private ImageView img_android;

        public ViewHolder(View view) {
            super(view);

            //ON CLICK CODE//
            view.setOnClickListener(this);

            tv_android = (TextView) view.findViewById(R.id.tv_android);
            img_android = (ImageView) view.findViewById(R.id.img_android);
        }


        @Override
        public void onClick(View v) {
//            context.startActivity(new Intent(context, MainActivity.class));
            if (clickListener != null) {

                clickListener.itemClicked(v, getAdapterPosition());
                int adapterposition = getAdapterPosition();
            }
        }
    }

    public interface ClickListener {
        public void itemClicked(View view, int position);


    }


}