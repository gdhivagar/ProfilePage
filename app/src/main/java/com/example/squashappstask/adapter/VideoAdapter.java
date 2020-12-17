package com.example.squashappstask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.squashappstask.R;
import com.example.squashappstask.model.VideoLikesModel;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {
    private List<VideoLikesModel> videoLikesModelArrayList;
    private Context context;

    public VideoAdapter(Context context, List<VideoLikesModel> videoModels) {
        this.videoLikesModelArrayList = videoModels;
        this.context = context;
    }

    @Override
    public VideoAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_video, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoAdapter.ViewHolder viewHolder, int i) {

        VideoLikesModel videoLikesModel = videoLikesModelArrayList.get(i);

        if (videoLikesModel != null) {
            viewHolder.tvCount.setText(videoLikesModel.getVideoCount());
            viewHolder.imgVideo.setImageResource(videoLikesModel.getVideoImage());
        }

    }

    @Override
    public int getItemCount() {
        return videoLikesModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCount;
        private ImageView imgVideo;

        public ViewHolder(View view) {
            super(view);

            tvCount = (TextView) view.findViewById(R.id.tvCount);
            imgVideo = (ImageView) view.findViewById(R.id.imgVideo);
        }
    }

}









