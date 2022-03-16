package com.woxthebox.draglistview;

import android.content.Context;
import android.os.Handler;

class AutoScroller {
    private static final int AUTO_SCROLL_UPDATE_DELAY = 12;
    private static final int COLUMN_SCROLL_UPDATE_DELAY = 1000;
    private static final int SCROLL_SPEED_DP = 8;
    private AutoScrollMode mAutoScrollMode = AutoScrollMode.POSITION;
    private Handler mHandler = new Handler();
    private boolean mIsAutoScrolling;
    private long mLastScrollTime;
    private AutoScrollListener mListener;
    private int mScrollSpeed;

    interface AutoScrollListener {
        void onAutoScrollColumnBy(int i);

        void onAutoScrollPositionBy(int i, int i2);
    }

    enum AutoScrollMode {
        POSITION,
        COLUMN
    }

    enum ScrollDirection {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    AutoScroller(Context context, AutoScrollListener autoScrollListener) {
        this.mListener = autoScrollListener;
        this.mScrollSpeed = (int) (context.getResources().getDisplayMetrics().density * 8.0f);
    }

    /* access modifiers changed from: private */
    public void autoScrollColumnBy(final int i) {
        if (this.mIsAutoScrolling) {
            if (System.currentTimeMillis() - this.mLastScrollTime > 1000) {
                this.mListener.onAutoScrollColumnBy(i);
                this.mLastScrollTime = System.currentTimeMillis();
            } else {
                this.mListener.onAutoScrollColumnBy(0);
            }
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    AutoScroller.this.autoScrollColumnBy(i);
                }
            }, 12);
        }
    }

    /* access modifiers changed from: private */
    public void autoScrollPositionBy(final int i, final int i2) {
        if (this.mIsAutoScrolling) {
            this.mListener.onAutoScrollPositionBy(i, i2);
            this.mHandler.postDelayed(new Runnable() {
                public void run() {
                    AutoScroller.this.autoScrollPositionBy(i, i2);
                }
            }, 12);
        }
    }

    private void startAutoScrollColumnBy(int i) {
        if (!this.mIsAutoScrolling) {
            this.mIsAutoScrolling = true;
            autoScrollColumnBy(i);
        }
    }

    private void startAutoScrollPositionBy(int i, int i2) {
        if (!this.mIsAutoScrolling) {
            this.mIsAutoScrolling = true;
            autoScrollPositionBy(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAutoScrolling() {
        return this.mIsAutoScrolling;
    }

    /* access modifiers changed from: package-private */
    public void setAutoScrollMode(AutoScrollMode autoScrollMode) {
        this.mAutoScrollMode = autoScrollMode;
    }

    /* access modifiers changed from: package-private */
    public void startAutoScroll(ScrollDirection scrollDirection) {
        switch (scrollDirection) {
            case UP:
                startAutoScrollPositionBy(0, this.mScrollSpeed);
                return;
            case DOWN:
                startAutoScrollPositionBy(0, -this.mScrollSpeed);
                return;
            case LEFT:
                if (this.mAutoScrollMode == AutoScrollMode.POSITION) {
                    startAutoScrollPositionBy(this.mScrollSpeed, 0);
                    return;
                } else {
                    startAutoScrollColumnBy(1);
                    return;
                }
            case RIGHT:
                if (this.mAutoScrollMode == AutoScrollMode.POSITION) {
                    startAutoScrollPositionBy(-this.mScrollSpeed, 0);
                    return;
                } else {
                    startAutoScrollColumnBy(-1);
                    return;
                }
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public void stopAutoScroll() {
        this.mIsAutoScrolling = false;
    }
}
