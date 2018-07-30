package com.example.android.tourguide;

/**
 * Created by this pc on 6/14/2018.
 */

public class Place {

    private String mLocationInfo;

    private int mImageResourceId;

    public Place(String defaultLocationInfo,int defaultImageResourceId)
    {
        mLocationInfo=defaultLocationInfo;
        mImageResourceId=defaultImageResourceId;
    }

    //return the location
    public String getmLocationInfo()
    {
        return mLocationInfo;
    }

    //return the imageresourceid
    public int getmImageResourceId()
    {
        return mImageResourceId;
    }


}
