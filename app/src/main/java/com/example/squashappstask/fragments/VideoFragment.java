package com.example.squashappstask.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.squashappstask.R;
import com.example.squashappstask.adapter.VideoAdapter;
import com.example.squashappstask.model.VideoLikesModel;

import java.util.ArrayList;
import java.util.List;

public class VideoFragment extends Fragment {

    private View view;
    private List<VideoLikesModel> videoLikesModelList = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_video, container, false);

        initVideoUrls();

        RecyclerView rv_video = view.findViewById(R.id.rv_video);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rv_video.setLayoutManager(gridLayoutManager);
        VideoAdapter videoAdapter = new VideoAdapter(getContext(), videoLikesModelList);
        rv_video.setAdapter(videoAdapter);


        return view;
    }

    private void initVideoUrls() {
        if (videoLikesModelList == null) {
            videoLikesModelList = new ArrayList<VideoLikesModel>();
            videoLikesModelList.add(new VideoLikesModel("19202", R.drawable.msd_one));
            videoLikesModelList.add(new VideoLikesModel("12343", R.drawable.msd_two));
            videoLikesModelList.add(new VideoLikesModel("20323", R.drawable.msd_three));
            videoLikesModelList.add(new VideoLikesModel("19202", R.drawable.msd_one));
            videoLikesModelList.add(new VideoLikesModel("12343", R.drawable.msd_two));
            videoLikesModelList.add(new VideoLikesModel("20323", R.drawable.msd_three));
            videoLikesModelList.add(new VideoLikesModel("19202", R.drawable.msd_one));
            videoLikesModelList.add(new VideoLikesModel("12343", R.drawable.msd_two));
            videoLikesModelList.add(new VideoLikesModel("20323", R.drawable.msd_three));
        }
    }

}