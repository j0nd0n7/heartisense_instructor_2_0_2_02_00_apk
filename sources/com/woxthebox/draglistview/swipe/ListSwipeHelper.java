package com.woxthebox.draglistview.swipe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.p036v7.widget.C1732az;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.woxthebox.draglistview.swipe.ListSwipeItem;

public class ListSwipeHelper extends C1732az.C1759m implements C1732az.C1758l {
    private GestureDetector mGestureDetector;
    private GestureListener mGestureListener = new GestureListener();
    /* access modifiers changed from: private */
    public C1732az mRecyclerView;
    /* access modifiers changed from: private */
    public OnSwipeListener mSwipeListener;
    /* access modifiers changed from: private */
    public ListSwipeItem mSwipeView;
    /* access modifiers changed from: private */
    public int mTouchSlop;

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private boolean mSwipeStarted;

        private GestureListener() {
        }

        private boolean canStartSwipe(MotionEvent motionEvent, MotionEvent motionEvent2) {
            return (motionEvent == null || motionEvent2 == null || ListSwipeHelper.this.mSwipeView == null || ListSwipeHelper.this.mRecyclerView.getScrollState() != 0 || ListSwipeHelper.this.mSwipeView.getSupportedSwipeDirection() == ListSwipeItem.SwipeDirection.NONE) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isSwipeStarted() {
            return this.mSwipeStarted;
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.mSwipeStarted = false;
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!canStartSwipe(motionEvent, motionEvent2)) {
                return false;
            }
            ListSwipeHelper.this.mSwipeView.setFlingSpeed(f);
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent == null || motionEvent2 == null || ListSwipeHelper.this.mSwipeView == null || ListSwipeHelper.this.mRecyclerView.getScrollState() != 0) {
                return false;
            }
            float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
            float abs2 = Math.abs(motionEvent2.getY() - motionEvent.getY());
            if (!this.mSwipeStarted && abs > ((float) (ListSwipeHelper.this.mTouchSlop * 2)) && abs * 0.5f > abs2) {
                this.mSwipeStarted = true;
                ListSwipeHelper.this.mRecyclerView.requestDisallowInterceptTouchEvent(true);
                ListSwipeHelper.this.mSwipeView.handleSwipeMoveStarted(ListSwipeHelper.this.mSwipeListener);
                if (ListSwipeHelper.this.mSwipeListener != null) {
                    ListSwipeHelper.this.mSwipeListener.onItemSwipeStarted(ListSwipeHelper.this.mSwipeView);
                }
            }
            if (this.mSwipeStarted) {
                ListSwipeHelper.this.mSwipeView.handleSwipeMove(-f, ListSwipeHelper.this.mRecyclerView.getChildViewHolder(ListSwipeHelper.this.mSwipeView));
            }
            return this.mSwipeStarted;
        }
    }

    public interface OnSwipeListener {
        void onItemSwipeEnded(ListSwipeItem listSwipeItem, ListSwipeItem.SwipeDirection swipeDirection);

        void onItemSwipeStarted(ListSwipeItem listSwipeItem);

        void onItemSwiping(ListSwipeItem listSwipeItem, float f);
    }

    public static abstract class OnSwipeListenerAdapter implements OnSwipeListener {
        public void onItemSwipeEnded(ListSwipeItem listSwipeItem, ListSwipeItem.SwipeDirection swipeDirection) {
        }

        public void onItemSwipeStarted(ListSwipeItem listSwipeItem) {
        }

        public void onItemSwiping(ListSwipeItem listSwipeItem, float f) {
        }
    }

    public ListSwipeHelper(Context context, OnSwipeListener onSwipeListener) {
        this.mSwipeListener = onSwipeListener;
        this.mGestureDetector = new GestureDetector(context, this.mGestureListener);
    }

    private void handleTouch(C1732az azVar, MotionEvent motionEvent) {
        this.mGestureDetector.onTouchEvent(motionEvent);
        switch (motionEvent.getAction()) {
            case 0:
                View findChildViewUnder = azVar.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                if ((findChildViewUnder instanceof ListSwipeItem) && ((ListSwipeItem) findChildViewUnder).getSupportedSwipeDirection() != ListSwipeItem.SwipeDirection.NONE) {
                    this.mSwipeView = (ListSwipeItem) findChildViewUnder;
                    return;
                }
                return;
            case 1:
            case 3:
                if (this.mSwipeView != null) {
                    final ListSwipeItem listSwipeItem = this.mSwipeView;
                    listSwipeItem.handleSwipeUp(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            if (listSwipeItem.isSwipeStarted()) {
                                ListSwipeHelper.this.resetSwipedViews(listSwipeItem);
                            }
                            if (ListSwipeHelper.this.mSwipeListener != null) {
                                ListSwipeHelper.this.mSwipeListener.onItemSwipeEnded(listSwipeItem, listSwipeItem.getSwipedDirection());
                            }
                        }
                    });
                } else {
                    resetSwipedViews((View) null);
                }
                this.mSwipeView = null;
                this.mRecyclerView.requestDisallowInterceptTouchEvent(false);
                return;
            default:
                return;
        }
    }

    public void attachToRecyclerView(C1732az azVar) {
        this.mRecyclerView = azVar;
        this.mRecyclerView.addOnItemTouchListener(this);
        this.mRecyclerView.addOnScrollListener(this);
        this.mTouchSlop = ViewConfiguration.get(this.mRecyclerView.getContext()).getScaledTouchSlop();
    }

    public void detachFromRecyclerView() {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.removeOnItemTouchListener(this);
            this.mRecyclerView.removeOnScrollListener(this);
        }
        this.mRecyclerView = null;
    }

    public boolean onInterceptTouchEvent(C1732az azVar, MotionEvent motionEvent) {
        handleTouch(azVar, motionEvent);
        return this.mGestureListener.isSwipeStarted();
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onScrollStateChanged(C1732az azVar, int i) {
        resetSwipedViews((View) null);
    }

    public void onTouchEvent(C1732az azVar, MotionEvent motionEvent) {
        handleTouch(azVar, motionEvent);
    }

    public void resetSwipedViews(View view) {
        int childCount = this.mRecyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mRecyclerView.getChildAt(i);
            if ((childAt instanceof ListSwipeItem) && childAt != view) {
                ((ListSwipeItem) childAt).resetSwipe(true);
            }
        }
    }

    public void setSwipeListener(OnSwipeListener onSwipeListener) {
        this.mSwipeListener = onSwipeListener;
    }
}
