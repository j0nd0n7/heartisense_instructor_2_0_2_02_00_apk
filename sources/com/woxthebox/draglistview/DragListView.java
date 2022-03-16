package com.woxthebox.draglistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p036v7.widget.C1670af;
import android.support.p036v7.widget.C1732az;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragItemRecyclerView;
import com.woxthebox.draglistview.swipe.ListSwipeHelper;

public class DragListView extends FrameLayout {
    private DragItem mDragItem;
    /* access modifiers changed from: private */
    public DragListCallback mDragListCallback;
    /* access modifiers changed from: private */
    public DragListListener mDragListListener;
    /* access modifiers changed from: private */
    public DragItemRecyclerView mRecyclerView;
    private ListSwipeHelper mSwipeHelper;
    /* access modifiers changed from: private */
    public float mTouchX;
    /* access modifiers changed from: private */
    public float mTouchY;

    public interface DragListCallback {
        boolean canDragItemAtPosition(int i);

        boolean canDropItemAtPosition(int i);
    }

    public static abstract class DragListCallbackAdapter implements DragListCallback {
        public boolean canDragItemAtPosition(int i) {
            return true;
        }

        public boolean canDropItemAtPosition(int i) {
            return true;
        }
    }

    public interface DragListListener {
        void onItemDragEnded(int i, int i2);

        void onItemDragStarted(int i);

        void onItemDragging(int i, float f, float f2);
    }

    public static abstract class DragListListenerAdapter implements DragListListener {
        public void onItemDragEnded(int i, int i2) {
        }

        public void onItemDragStarted(int i) {
        }

        public void onItemDragging(int i, float f, float f2) {
        }
    }

    public DragListView(Context context) {
        super(context);
    }

    public DragListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DragListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private DragItemRecyclerView createRecyclerView() {
        DragItemRecyclerView dragItemRecyclerView = (DragItemRecyclerView) LayoutInflater.from(getContext()).inflate(C2656R.layout.drag_item_recycler_view, this, false);
        dragItemRecyclerView.setMotionEventSplittingEnabled(false);
        dragItemRecyclerView.setItemAnimator(new C1670af());
        dragItemRecyclerView.setVerticalScrollBarEnabled(false);
        dragItemRecyclerView.setHorizontalScrollBarEnabled(false);
        dragItemRecyclerView.setDragItemListener(new DragItemRecyclerView.DragItemListener() {
            private int mDragStartPosition;

            public void onDragEnded(int i) {
                if (DragListView.this.mDragListListener != null) {
                    DragListView.this.mDragListListener.onItemDragEnded(this.mDragStartPosition, i);
                }
            }

            public void onDragStarted(int i, float f, float f2) {
                DragListView.this.getParent().requestDisallowInterceptTouchEvent(true);
                this.mDragStartPosition = i;
                if (DragListView.this.mDragListListener != null) {
                    DragListView.this.mDragListListener.onItemDragStarted(i);
                }
            }

            public void onDragging(int i, float f, float f2) {
                if (DragListView.this.mDragListListener != null) {
                    DragListView.this.mDragListListener.onItemDragging(i, f, f2);
                }
            }
        });
        dragItemRecyclerView.setDragItemCallback(new DragItemRecyclerView.DragItemCallback() {
            public boolean canDragItemAtPosition(int i) {
                return DragListView.this.mDragListCallback == null || DragListView.this.mDragListCallback.canDragItemAtPosition(i);
            }

            public boolean canDropItemAtPosition(int i) {
                return DragListView.this.mDragListCallback == null || DragListView.this.mDragListCallback.canDropItemAtPosition(i);
            }
        });
        return dragItemRecyclerView;
    }

    private boolean handleTouchEvent(MotionEvent motionEvent) {
        this.mTouchX = motionEvent.getX();
        this.mTouchY = motionEvent.getY();
        if (!isDragging()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                this.mRecyclerView.onDragEnded();
                break;
            case 2:
                this.mRecyclerView.onDragging(motionEvent.getX(), motionEvent.getY());
                break;
        }
        return true;
    }

    public DragItemAdapter getAdapter() {
        if (this.mRecyclerView != null) {
            return (DragItemAdapter) this.mRecyclerView.getAdapter();
        }
        return null;
    }

    public C1732az getRecyclerView() {
        return this.mRecyclerView;
    }

    public boolean isDragEnabled() {
        return this.mRecyclerView.isDragEnabled();
    }

    public boolean isDragging() {
        return this.mRecyclerView.isDragging();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mDragItem = new DragItem(getContext());
        this.mRecyclerView = createRecyclerView();
        this.mRecyclerView.setDragItem(this.mDragItem);
        addView(this.mRecyclerView);
        addView(this.mDragItem.getDragItemView());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void resetSwipedViews(View view) {
        if (this.mSwipeHelper != null) {
            this.mSwipeHelper.resetSwipedViews(view);
        }
    }

    public void setAdapter(DragItemAdapter dragItemAdapter, boolean z) {
        this.mRecyclerView.setHasFixedSize(z);
        this.mRecyclerView.setAdapter(dragItemAdapter);
        dragItemAdapter.setDragStartedListener(new DragItemAdapter.DragStartCallback() {
            public boolean isDragging() {
                return DragListView.this.mRecyclerView.isDragging();
            }

            public boolean startDrag(View view, long j) {
                return DragListView.this.mRecyclerView.startDrag(view, j, DragListView.this.mTouchX, DragListView.this.mTouchY);
            }
        });
    }

    public void setCanDragHorizontally(boolean z) {
        this.mDragItem.setCanDragHorizontally(z);
    }

    public void setCanNotDragAboveTopItem(boolean z) {
        this.mRecyclerView.setCanNotDragAboveTopItem(z);
    }

    public void setCanNotDragBelowBottomItem(boolean z) {
        this.mRecyclerView.setCanNotDragBelowBottomItem(z);
    }

    public void setCustomDragItem(DragItem dragItem) {
        removeViewAt(1);
        if (dragItem == null) {
            dragItem = new DragItem(getContext());
        }
        dragItem.setCanDragHorizontally(this.mDragItem.canDragHorizontally());
        dragItem.setSnapToTouch(this.mDragItem.isSnapToTouch());
        this.mDragItem = dragItem;
        this.mRecyclerView.setDragItem(this.mDragItem);
        addView(this.mDragItem.getDragItemView());
    }

    public void setDisableReorderWhenDragging(boolean z) {
        this.mRecyclerView.setDisableReorderWhenDragging(z);
    }

    public void setDragEnabled(boolean z) {
        this.mRecyclerView.setDragEnabled(z);
    }

    public void setDragListCallback(DragListCallback dragListCallback) {
        this.mDragListCallback = dragListCallback;
    }

    public void setDragListListener(DragListListener dragListListener) {
        this.mDragListListener = dragListListener;
    }

    public void setDropTargetDrawables(Drawable drawable, Drawable drawable2) {
        this.mRecyclerView.setDropTargetDrawables(drawable, drawable2);
    }

    public void setLayoutManager(C1732az.C1750h hVar) {
        this.mRecyclerView.setLayoutManager(hVar);
    }

    public void setScrollingEnabled(boolean z) {
        this.mRecyclerView.setScrollingEnabled(z);
    }

    public void setSnapDragItemToTouch(boolean z) {
        this.mDragItem.setSnapToTouch(z);
    }

    public void setSwipeListener(ListSwipeHelper.OnSwipeListener onSwipeListener) {
        if (this.mSwipeHelper == null) {
            this.mSwipeHelper = new ListSwipeHelper(getContext().getApplicationContext(), onSwipeListener);
        } else {
            this.mSwipeHelper.setSwipeListener(onSwipeListener);
        }
        this.mSwipeHelper.detachFromRecyclerView();
        if (onSwipeListener != null) {
            this.mSwipeHelper.attachToRecyclerView(this.mRecyclerView);
        }
    }
}
