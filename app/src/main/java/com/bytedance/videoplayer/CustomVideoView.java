package com.bytedance.videoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

import static android.view.View.getDefaultSize;

public class CustomVideoView extends VideoPlayer {

    int width = 1900;
    int height = 1080;
    public CustomVideoView(Context context) {
        super(context);
    }

    public CustomVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int defaultWidth = getDefaultSize(width,widthMeasureSpec);
        int defaultHeight = getDefaultSize(height,heightMeasureSpec);
        setMeasuredDimension(defaultWidth,defaultHeight);
    }
}
