package edu.uwyo.bdolling.mobilepresentation;

import android.graphics.Color;

/**
 * Created by Kegan on 4/24/2016.
 */
public class WatchUtil {
    private static WatchUtil instance = null;
    private WatchUtilListener watchFace;

    private WatchUtil(){}

    public static WatchUtil getInstance()
    {
        if(instance == null)
        {
            instance = new WatchUtil();
        }
        return instance;
    }

    public void setWatchFace(WatchUtilListener w)
    {
        watchFace = w;
    }

    public void setColor(int c)
    {
        watchFace.setColor(c);
    }
}
