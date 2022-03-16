package com.woxthebox.draglistview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p036v7.widget.C1732az;
import android.support.p036v7.widget.GridLayoutManager;
import android.support.p036v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.woxthebox.draglistview.AutoScroller;

public class DragItemRecyclerView extends C1732az implements AutoScroller.AutoScrollListener {
    /* access modifiers changed from: private */
    public DragItemAdapter mAdapter;
    private AutoScroller mAutoScroller;
    private boolean mCanNotDragAboveTop;
    private boolean mCanNotDragBelowBottom;
    private boolean mClipToPadding;
    private boolean mDisableReorderWhenDragging;
    private DragItemCallback mDragCallback;
    private boolean mDragEnabled = true;
    /* access modifiers changed from: private */
    public DragItem mDragItem;
    private long mDragItemId = -1;
    /* access modifiers changed from: private */
    public int mDragItemPosition;
    private DragState mDragState = DragState.DRAG_ENDED;
    /* access modifiers changed from: private */
    public Drawable mDropTargetBackgroundDrawable;
    /* access modifiers changed from: private */
    public Drawable mDropTargetForegroundDrawable;
    /* access modifiers changed from: private */
    public boolean mHoldChangePosition;
    private DragItemListener mListener;
    private boolean mScrollingEnabled = true;
    private float mStartY;
    private int mTouchSlop;

    public interface DragItemCallback {
        boolean canDragItemAtPosition(int i);

        boolean canDropItemAtPosition(int i);
    }

    public interface DragItemListener {
        void onDragEnded(int i);

        void onDragStarted(int i, float f, float f2);

        void onDragging(int i, float f, float f2);
    }

    private enum DragState {
        DRAG_STARTED,
        DRAGGING,
        DRAG_ENDED
    }

    public DragItemRecyclerView(Context context) {
        super(context);
        init();
    }

    public DragItemRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        init();
    }

    public DragItemRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private View findChildView(float f, float f2) {
        int childCount = getChildCount();
        if (f2 <= 0.0f && childCount > 0) {
            return getChildAt(0);
        }
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (f >= ((float) (childAt.getLeft() - marginLayoutParams.leftMargin)) && f <= ((float) (childAt.getRight() + marginLayoutParams.rightMargin)) && f2 >= ((float) (childAt.getTop() - marginLayoutParams.topMargin))) {
                if (f2 <= ((float) (marginLayoutParams.bottomMargin + childAt.getBottom()))) {
                    return childAt;
                }
            }
        }
        return null;
    }

    private void init() {
        this.mAutoScroller = new AutoScroller(getContext(), this);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        addItemDecoration(new C1732az.C1749g() {
            private void drawDecoration(Canvas canvas, C1732az azVar, Drawable drawable) {
                if (DragItemRecyclerView.this.mAdapter != null && DragItemRecyclerView.this.mAdapter.getDropTargetId() != -1 && drawable != null) {
                    for (int i = 0; i < azVar.getChildCount(); i++) {
                        View childAt = azVar.getChildAt(i);
                        int childAdapterPosition = DragItemRecyclerView.this.getChildAdapterPosition(childAt);
                        if (childAdapterPosition != -1 && DragItemRecyclerView.this.mAdapter.getItemId(childAdapterPosition) == DragItemRecyclerView.this.mAdapter.getDropTargetId()) {
                            drawable.setBounds(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            drawable.draw(canvas);
                        }
                    }
                }
            }

            public void onDraw(Canvas canvas, C1732az azVar, C1732az.C1771u uVar) {
                super.onDraw(canvas, azVar, uVar);
                drawDecoration(canvas, azVar, DragItemRecyclerView.this.mDropTargetBackgroundDrawable);
            }

            public void onDrawOver(Canvas canvas, C1732az azVar, C1732az.C1771u uVar) {
                super.onDrawOver(canvas, azVar, uVar);
                drawDecoration(canvas, azVar, DragItemRecyclerView.this.mDropTargetForegroundDrawable);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onDragItemAnimationEnd() {
        this.mAdapter.setDragItemId(-1);
        this.mAdapter.setDropTargetId(-1);
        this.mAdapter.notifyDataSetChanged();
        this.mDragState = DragState.DRAG_ENDED;
        if (this.mListener != null) {
            this.mListener.onDragEnded(this.mDragItemPosition);
        }
        this.mDragItemId = -1;
        this.mDragItem.hide();
        setEnabled(true);
        invalidate();
    }

    private boolean shouldChangeItemPosition(int i) {
        if (this.mHoldChangePosition || this.mDragItemPosition == -1 || this.mDragItemPosition == i) {
            return false;
        }
        if (this.mCanNotDragAboveTop && i == 0) {
            return false;
        }
        if (!this.mCanNotDragBelowBottom || i != this.mAdapter.getItemCount() - 1) {
            return this.mDragCallback == null || this.mDragCallback.canDropItemAtPosition(i);
        }
        return false;
    }

    private void updateDragPositionAndScroll() {
        boolean z;
        boolean z2 = false;
        View findChildView = findChildView(this.mDragItem.getX(), this.mDragItem.getY());
        int childLayoutPosition = getChildLayoutPosition(findChildView);
        if (childLayoutPosition != -1 && findChildView != null) {
            if ((getLayoutManager() instanceof LinearLayoutManager) && !(getLayoutManager() instanceof GridLayoutManager)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findChildView.getLayoutParams();
                int measuredHeight = findChildView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int top = (measuredHeight / 2) + (findChildView.getTop() - marginLayoutParams.topMargin);
                boolean z3 = this.mDragItemPosition < getChildLayoutPosition(findChildView) ? this.mDragItem.getY() > ((float) top) : this.mDragItem.getY() < ((float) top);
                if (measuredHeight > this.mDragItem.getDragItemView().getMeasuredHeight() && !z3) {
                    childLayoutPosition = this.mDragItemPosition;
                }
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
            if (shouldChangeItemPosition(childLayoutPosition)) {
                if (this.mDisableReorderWhenDragging) {
                    this.mAdapter.setDropTargetId(this.mAdapter.getItemId(childLayoutPosition));
                    this.mAdapter.notifyDataSetChanged();
                } else {
                    int t = linearLayoutManager.mo5859t();
                    View c = linearLayoutManager.mo5831c(t);
                    this.mAdapter.changeItemPosition(this.mDragItemPosition, childLayoutPosition);
                    this.mDragItemPosition = childLayoutPosition;
                    if (linearLayoutManager.mo5849j() == 1) {
                        linearLayoutManager.mo5827b(t, c.getTop() - ((ViewGroup.MarginLayoutParams) c.getLayoutParams()).topMargin);
                    } else {
                        linearLayoutManager.mo5827b(t, c.getLeft() - ((ViewGroup.MarginLayoutParams) c.getLayoutParams()).leftMargin);
                    }
                }
            }
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            int height = this.mClipToPadding ? getHeight() - getPaddingBottom() : getHeight();
            int paddingLeft = this.mClipToPadding ? getPaddingLeft() : 0;
            int width = this.mClipToPadding ? getWidth() - getPaddingRight() : getWidth();
            C1732az.C1774x findViewHolderForLayoutPosition = findViewHolderForLayoutPosition(this.mAdapter.getItemCount() - 1);
            C1732az.C1774x findViewHolderForLayoutPosition2 = findViewHolderForLayoutPosition(0);
            if (linearLayoutManager.mo5849j() == 1) {
                boolean z4 = findViewHolderForLayoutPosition != null && findViewHolderForLayoutPosition.itemView.getBottom() <= height;
                if (findViewHolderForLayoutPosition2 == null || findViewHolderForLayoutPosition2.itemView.getTop() < paddingTop) {
                    z = z4;
                } else {
                    z2 = true;
                    z = z4;
                }
            } else {
                z = findViewHolderForLayoutPosition != null && findViewHolderForLayoutPosition.itemView.getRight() <= width;
                if (findViewHolderForLayoutPosition2 != null && findViewHolderForLayoutPosition2.itemView.getLeft() >= paddingLeft) {
                    z2 = true;
                }
            }
            if (linearLayoutManager.mo5849j() == 1) {
                if (this.mDragItem.getY() > ((float) (getHeight() - (findChildView.getHeight() / 2))) && !z) {
                    this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.UP);
                } else if (this.mDragItem.getY() >= ((float) (findChildView.getHeight() / 2)) || z2) {
                    this.mAutoScroller.stopAutoScroll();
                } else {
                    this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.DOWN);
                }
            } else if (this.mDragItem.getX() > ((float) (getWidth() - (findChildView.getWidth() / 2))) && !z) {
                this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.LEFT);
            } else if (this.mDragItem.getX() >= ((float) (findChildView.getWidth() / 2)) || z2) {
                this.mAutoScroller.stopAutoScroll();
            } else {
                this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.RIGHT);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addDragItemAndStart(float f, Object obj, long j) {
        View findChildView = findChildView(0.0f, f);
        int childLayoutPosition = (findChildView != null || getChildCount() <= 0) ? getChildLayoutPosition(findChildView) : getChildLayoutPosition(getChildAt(getChildCount() - 1)) + 1;
        if (childLayoutPosition == -1) {
            childLayoutPosition = 0;
        }
        this.mDragState = DragState.DRAG_STARTED;
        this.mDragItemId = j;
        this.mAdapter.setDragItemId(this.mDragItemId);
        this.mAdapter.addItem(childLayoutPosition, obj);
        this.mDragItemPosition = childLayoutPosition;
        this.mHoldChangePosition = true;
        postDelayed(new Runnable() {
            public void run() {
                boolean unused = DragItemRecyclerView.this.mHoldChangePosition = false;
            }
        }, getItemAnimator().mo6814e());
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public long getDragItemId() {
        return this.mDragItemId;
    }

    /* access modifiers changed from: package-private */
    public boolean isDragEnabled() {
        return this.mDragEnabled;
    }

    /* access modifiers changed from: package-private */
    public boolean isDragging() {
        return this.mDragState != DragState.DRAG_ENDED;
    }

    public void onAutoScrollColumnBy(int i) {
    }

    public void onAutoScrollPositionBy(int i, int i2) {
        if (isDragging()) {
            scrollBy(i, i2);
            updateDragPositionAndScroll();
            return;
        }
        this.mAutoScroller.stopAutoScroll();
    }

    /* access modifiers changed from: package-private */
    public void onDragEnded() {
        if (this.mDragState != DragState.DRAG_ENDED) {
            this.mAutoScroller.stopAutoScroll();
            setEnabled(false);
            if (this.mDisableReorderWhenDragging) {
                int positionForItemId = this.mAdapter.getPositionForItemId(this.mAdapter.getDropTargetId());
                if (positionForItemId != -1) {
                    this.mAdapter.swapItems(this.mDragItemPosition, positionForItemId);
                    this.mDragItemPosition = positionForItemId;
                }
                this.mAdapter.setDropTargetId(-1);
            }
            post(new Runnable() {
                public void run() {
                    final C1732az.C1774x findViewHolderForAdapterPosition = DragItemRecyclerView.this.findViewHolderForAdapterPosition(DragItemRecyclerView.this.mDragItemPosition);
                    if (findViewHolderForAdapterPosition != null) {
                        DragItemRecyclerView.this.getItemAnimator().mo6356d(findViewHolderForAdapterPosition);
                        DragItemRecyclerView.this.mDragItem.endDrag(findViewHolderForAdapterPosition.itemView, new AnimatorListenerAdapter() {
                            public void onAnimationEnd(Animator animator) {
                                findViewHolderForAdapterPosition.itemView.setAlpha(1.0f);
                                DragItemRecyclerView.this.onDragItemAnimationEnd();
                            }
                        });
                        return;
                    }
                    DragItemRecyclerView.this.onDragItemAnimationEnd();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void onDragging(float f, float f2) {
        if (this.mDragState != DragState.DRAG_ENDED) {
            this.mDragState = DragState.DRAGGING;
            this.mDragItemPosition = this.mAdapter.getPositionForItemId(this.mDragItemId);
            this.mDragItem.setPosition(f, f2);
            if (!this.mAutoScroller.isAutoScrolling()) {
                updateDragPositionAndScroll();
            }
            if (this.mListener != null) {
                this.mListener.onDragging(this.mDragItemPosition, f, f2);
            }
            invalidate();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollingEnabled) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.mStartY = motionEvent.getY();
                break;
            case 2:
                if (((double) Math.abs(motionEvent.getY() - this.mStartY)) > ((double) this.mTouchSlop) * 0.5d) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public Object removeDragItemAndEnd() {
        if (this.mDragItemPosition == -1) {
            return null;
        }
        this.mAutoScroller.stopAutoScroll();
        Object removeItem = this.mAdapter.removeItem(this.mDragItemPosition);
        this.mAdapter.setDragItemId(-1);
        this.mDragState = DragState.DRAG_ENDED;
        this.mDragItemId = -1;
        invalidate();
        return removeItem;
    }

    public void setAdapter(C1732az.C1739a aVar) {
        if (!isInEditMode()) {
            if (!(aVar instanceof DragItemAdapter)) {
                throw new RuntimeException("Adapter must extend DragItemAdapter");
            } else if (!aVar.hasStableIds()) {
                throw new RuntimeException("Adapter must have stable ids");
            }
        }
        super.setAdapter(aVar);
        this.mAdapter = (DragItemAdapter) aVar;
    }

    /* access modifiers changed from: package-private */
    public void setCanNotDragAboveTopItem(boolean z) {
        this.mCanNotDragAboveTop = z;
    }

    /* access modifiers changed from: package-private */
    public void setCanNotDragBelowBottomItem(boolean z) {
        this.mCanNotDragBelowBottom = z;
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.mClipToPadding = z;
    }

    /* access modifiers changed from: package-private */
    public void setDisableReorderWhenDragging(boolean z) {
        this.mDisableReorderWhenDragging = z;
    }

    /* access modifiers changed from: package-private */
    public void setDragEnabled(boolean z) {
        this.mDragEnabled = z;
    }

    /* access modifiers changed from: package-private */
    public void setDragItem(DragItem dragItem) {
        this.mDragItem = dragItem;
    }

    /* access modifiers changed from: package-private */
    public void setDragItemCallback(DragItemCallback dragItemCallback) {
        this.mDragCallback = dragItemCallback;
    }

    /* access modifiers changed from: package-private */
    public void setDragItemListener(DragItemListener dragItemListener) {
        this.mListener = dragItemListener;
    }

    public void setDropTargetDrawables(Drawable drawable, Drawable drawable2) {
        this.mDropTargetBackgroundDrawable = drawable;
        this.mDropTargetForegroundDrawable = drawable2;
    }

    public void setLayoutManager(C1732az.C1750h hVar) {
        super.setLayoutManager(hVar);
        if (!(hVar instanceof LinearLayoutManager)) {
            throw new RuntimeException("Layout must be an instance of LinearLayoutManager");
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollingEnabled(boolean z) {
        this.mScrollingEnabled = z;
    }

    /* access modifiers changed from: package-private */
    public boolean startDrag(View view, long j, float f, float f2) {
        int positionForItemId = this.mAdapter.getPositionForItemId(j);
        if (!this.mDragEnabled) {
            return false;
        }
        if (this.mCanNotDragAboveTop && positionForItemId == 0) {
            return false;
        }
        if (this.mCanNotDragBelowBottom && positionForItemId == this.mAdapter.getItemCount() - 1) {
            return false;
        }
        if (this.mDragCallback != null && !this.mDragCallback.canDragItemAtPosition(positionForItemId)) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        this.mDragState = DragState.DRAG_STARTED;
        this.mDragItemId = j;
        this.mDragItem.startDrag(view, f, f2);
        this.mDragItemPosition = positionForItemId;
        updateDragPositionAndScroll();
        this.mAdapter.setDragItemId(this.mDragItemId);
        this.mAdapter.notifyDataSetChanged();
        if (this.mListener != null) {
            this.mListener.onDragStarted(this.mDragItemPosition, this.mDragItem.getX(), this.mDragItem.getY());
        }
        invalidate();
        return true;
    }
}
