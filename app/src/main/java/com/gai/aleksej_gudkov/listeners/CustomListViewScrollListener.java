package com.gai.aleksej_gudkov.listeners;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * This class obtains motion events, recognizes them using GestureDetector and
 * represents as scrolling or fling .
 */
public class CustomListViewScrollListener implements View.OnTouchListener {
    private GestureDetector mGestureDetector;
    private CustomScrollListener mCustomScrollListener;
    private boolean mIsScrolling = false;

    public CustomListViewScrollListener(final Context context,
                                        final CustomScrollListener customScrollListener) {
        mCustomScrollListener = customScrollListener;
        mGestureDetector = new GestureDetector(context,
                new GestureDetector.SimpleOnGestureListener() {

                    @Override
                    public boolean onScroll(MotionEvent e1, MotionEvent e2,
                                            float distanceX, float distanceY) {
                        mIsScrolling = true;
                        mCustomScrollListener.onScroll();
                        return false;
                    }
                });
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mGestureDetector.onTouchEvent(event);

        if (event.getAction() == MotionEvent.ACTION_UP ||
                event.getAction() == MotionEvent.ACTION_CANCEL) {
            if (mIsScrolling) {
                mIsScrolling = false;
                mCustomScrollListener.onStopScroll();
            }
        }
        return false;
    }

    public interface CustomScrollListener {
        void onScroll();

        void onStopScroll();
    }
}
