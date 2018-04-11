package com.example.android.tourguide;

/**
 * Created by Capri on 03.04.2018.
 */

public class Place {
    private String mPlaceName;
    private int mImageResourceId;

    public Place(String placeName, int imageResourceId) {
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "Place{" +
                "mPlaceName='" + mPlaceName + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
