package com.example.squashappstask.model;

public class VideoLikesModel {
    private String videoCount;
    private int videoImage;

    public VideoLikesModel(String count, int img) {
        this.videoCount = count;
        this.videoImage = img;
    }

    public String getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(String videoCount) {
        this.videoCount = videoCount;
    }

    public int getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(int videoImage) {
        this.videoImage = videoImage;
    }
}
