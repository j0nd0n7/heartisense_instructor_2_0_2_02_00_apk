package com.woxthebox.draglistview;

import android.content.Context;
import android.content.res.Resources;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.widget.C1670af;
import android.support.p036v7.widget.C1732az;
import android.support.p036v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.woxthebox.draglistview.AutoScroller;
import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragItemRecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class BoardView extends HorizontalScrollView implements AutoScroller.AutoScrollListener {
    private static final int SCROLL_ANIMATION_DURATION = 325;
    private AutoScroller mAutoScroller;
    /* access modifiers changed from: private */
    public BoardListener mBoardListener;
    private LinearLayout mColumnLayout;
    private int mColumnWidth;
    /* access modifiers changed from: private */
    public DragItemRecyclerView mCurrentRecyclerView;
    private boolean mDragEnabled = true;
    /* access modifiers changed from: private */
    public DragItem mDragItem;
    /* access modifiers changed from: private */
    public int mDragStartColumn;
    /* access modifiers changed from: private */
    public int mDragStartRow;
    private GestureDetector mGestureDetector;
    private boolean mHasLaidOut;
    private SparseArray<View> mHeaders = new SparseArray<>();
    /* access modifiers changed from: private */
    public int mLastDragColumn = -1;
    /* access modifiers changed from: private */
    public int mLastDragRow = -1;
    /* access modifiers changed from: private */
    public ArrayList<DragItemRecyclerView> mLists = new ArrayList<>();
    private FrameLayout mRootLayout;
    private Scroller mScroller;
    private boolean mSnapToColumnWhenDragging = true;
    private boolean mSnapToColumnWhenScrolling = true;
    private float mTouchX;
    private float mTouchY;

    public interface BoardListener {
        void onItemChangedColumn(int i, int i2);

        void onItemChangedPosition(int i, int i2, int i3, int i4);

        void onItemDragEnded(int i, int i2, int i3, int i4);

        void onItemDragStarted(int i, int i2);
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private float mStartScrollX;

        private GestureListener() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.mStartScrollX = (float) BoardView.this.getScrollX();
            return super.onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int access$1100 = BoardView.this.getCurrentColumn(motionEvent2.getX() + ((float) BoardView.this.getScrollX()));
            if (f < 0.0f) {
                if (((float) BoardView.this.getScrollX()) >= this.mStartScrollX) {
                    access$1100++;
                }
            } else if (((float) BoardView.this.getScrollX()) <= this.mStartScrollX) {
                access$1100--;
            }
            if (access$1100 < 0 || access$1100 > BoardView.this.mLists.size() - 1) {
                access$1100 = access$1100 < 0 ? 0 : BoardView.this.mLists.size() - 1;
            }
            BoardView.this.scrollToColumn(access$1100, true);
            return true;
        }
    }

    public BoardView(Context context) {
        super(context);
    }

    public BoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private int getClosestColumn() {
        int i = 0;
        int scrollX = getScrollX() + (getMeasuredWidth() / 2);
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            int i4 = i;
            if (i4 >= this.mLists.size()) {
                return i3;
            }
            int abs = Math.abs((((View) this.mLists.get(i4).getParent()).getLeft() + (this.mColumnWidth / 2)) - scrollX);
            if (abs < i2) {
                i2 = abs;
                i3 = i4;
            }
            i = i4 + 1;
        }
    }

    /* access modifiers changed from: private */
    public int getColumnOfList(DragItemRecyclerView dragItemRecyclerView) {
        int i = 0;
        for (int i2 = 0; i2 < this.mLists.size(); i2++) {
            if (this.mLists.get(i2) == dragItemRecyclerView) {
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public int getCurrentColumn(float f) {
        for (int i = 0; i < this.mLists.size(); i++) {
            View view = (View) this.mLists.get(i).getParent();
            if (((float) view.getLeft()) <= f && ((float) view.getRight()) > f) {
                return i;
            }
        }
        return 0;
    }

    private DragItemRecyclerView getCurrentRecyclerView(float f) {
        Iterator<DragItemRecyclerView> it = this.mLists.iterator();
        while (it.hasNext()) {
            DragItemRecyclerView next = it.next();
            View view = (View) next.getParent();
            if (((float) view.getLeft()) <= f && ((float) view.getRight()) > f) {
                return next;
            }
        }
        return this.mCurrentRecyclerView;
    }

    /* access modifiers changed from: private */
    public float getListTouchX(DragItemRecyclerView dragItemRecyclerView) {
        return (((float) getScrollX()) + this.mTouchX) - ((float) ((View) dragItemRecyclerView.getParent()).getLeft());
    }

    /* access modifiers changed from: private */
    public float getListTouchY(DragItemRecyclerView dragItemRecyclerView) {
        return this.mTouchY - ((float) dragItemRecyclerView.getTop());
    }

    private boolean handleTouchEvent(MotionEvent motionEvent) {
        if (this.mLists.size() == 0) {
            return false;
        }
        this.mTouchX = motionEvent.getX();
        this.mTouchY = motionEvent.getY();
        if (isDragging()) {
            switch (motionEvent.getAction()) {
                case 1:
                case 3:
                    this.mAutoScroller.stopAutoScroll();
                    this.mCurrentRecyclerView.onDragEnded();
                    if (snapToColumnWhenScrolling()) {
                        scrollToColumn(getColumnOfList(this.mCurrentRecyclerView), true);
                    }
                    invalidate();
                    break;
                case 2:
                    if (!this.mAutoScroller.isAutoScrolling()) {
                        updateScrollPosition();
                        break;
                    }
                    break;
            }
            return true;
        } else if (snapToColumnWhenScrolling() && this.mGestureDetector.onTouchEvent(motionEvent)) {
            return true;
        } else {
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.mScroller.isFinished()) {
                        return false;
                    }
                    this.mScroller.forceFinished(true);
                    return false;
                case 1:
                case 3:
                    if (!snapToColumnWhenScrolling()) {
                        return false;
                    }
                    scrollToColumn(getClosestColumn(), true);
                    return false;
                default:
                    return false;
            }
        }
    }

    private boolean isDragging() {
        return this.mCurrentRecyclerView != null && this.mCurrentRecyclerView.isDragging();
    }

    private boolean snapToColumnWhenDragging() {
        return this.mSnapToColumnWhenDragging && (getResources().getConfiguration().orientation == 1);
    }

    private boolean snapToColumnWhenScrolling() {
        return this.mSnapToColumnWhenScrolling && (getResources().getConfiguration().orientation == 1);
    }

    private void updateScrollPosition() {
        DragItemRecyclerView currentRecyclerView = getCurrentRecyclerView(this.mTouchX + ((float) getScrollX()));
        if (this.mCurrentRecyclerView != currentRecyclerView) {
            int columnOfList = getColumnOfList(this.mCurrentRecyclerView);
            int columnOfList2 = getColumnOfList(currentRecyclerView);
            long dragItemId = this.mCurrentRecyclerView.getDragItemId();
            Object removeDragItemAndEnd = this.mCurrentRecyclerView.removeDragItemAndEnd();
            if (removeDragItemAndEnd != null) {
                this.mCurrentRecyclerView = currentRecyclerView;
                this.mCurrentRecyclerView.addDragItemAndStart(getListTouchY(this.mCurrentRecyclerView), removeDragItemAndEnd, dragItemId);
                this.mDragItem.setOffset((float) ((View) this.mCurrentRecyclerView.getParent()).getLeft(), (float) this.mCurrentRecyclerView.getTop());
                if (this.mBoardListener != null) {
                    this.mBoardListener.onItemChangedColumn(columnOfList, columnOfList2);
                }
            }
        }
        this.mCurrentRecyclerView.onDragging(getListTouchX(this.mCurrentRecyclerView), getListTouchY(this.mCurrentRecyclerView));
        float f = ((float) getResources().getDisplayMetrics().widthPixels) * 0.14f;
        if (this.mTouchX > ((float) getWidth()) - f && getScrollX() < this.mColumnLayout.getWidth()) {
            this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.LEFT);
        } else if (this.mTouchX >= f || getScrollX() <= 0) {
            this.mAutoScroller.stopAutoScroll();
        } else {
            this.mAutoScroller.startAutoScroll(AutoScroller.ScrollDirection.RIGHT);
        }
        invalidate();
    }

    public DragItemRecyclerView addColumnList(DragItemAdapter dragItemAdapter, View view, boolean z) {
        final DragItemRecyclerView dragItemRecyclerView = (DragItemRecyclerView) LayoutInflater.from(getContext()).inflate(C2656R.layout.drag_item_recycler_view, this, false);
        dragItemRecyclerView.setHorizontalScrollBarEnabled(false);
        dragItemRecyclerView.setVerticalScrollBarEnabled(false);
        dragItemRecyclerView.setMotionEventSplittingEnabled(false);
        dragItemRecyclerView.setDragItem(this.mDragItem);
        dragItemRecyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        dragItemRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dragItemRecyclerView.setHasFixedSize(z);
        dragItemRecyclerView.setItemAnimator(new C1670af());
        dragItemRecyclerView.setDragItemListener(new DragItemRecyclerView.DragItemListener() {
            public void onDragEnded(int i) {
                int unused = BoardView.this.mLastDragColumn = -1;
                int unused2 = BoardView.this.mLastDragRow = -1;
                if (BoardView.this.mBoardListener != null) {
                    BoardView.this.mBoardListener.onItemDragEnded(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow, BoardView.this.getColumnOfList(dragItemRecyclerView), i);
                }
            }

            public void onDragStarted(int i, float f, float f2) {
                int unused = BoardView.this.mDragStartColumn = BoardView.this.getColumnOfList(dragItemRecyclerView);
                int unused2 = BoardView.this.mDragStartRow = i;
                DragItemRecyclerView unused3 = BoardView.this.mCurrentRecyclerView = dragItemRecyclerView;
                BoardView.this.mDragItem.setOffset(((View) BoardView.this.mCurrentRecyclerView.getParent()).getX(), BoardView.this.mCurrentRecyclerView.getY());
                if (BoardView.this.mBoardListener != null) {
                    BoardView.this.mBoardListener.onItemDragStarted(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow);
                }
                BoardView.this.invalidate();
            }

            public void onDragging(int i, float f, float f2) {
                int access$200 = BoardView.this.getColumnOfList(dragItemRecyclerView);
                boolean z = (access$200 == BoardView.this.mLastDragColumn && i == BoardView.this.mLastDragRow) ? false : true;
                if (BoardView.this.mBoardListener != null && z) {
                    int unused = BoardView.this.mLastDragColumn = access$200;
                    int unused2 = BoardView.this.mLastDragRow = i;
                    BoardView.this.mBoardListener.onItemChangedPosition(BoardView.this.mDragStartColumn, BoardView.this.mDragStartRow, access$200, i);
                }
            }
        });
        dragItemRecyclerView.setAdapter(dragItemAdapter);
        dragItemRecyclerView.setDragEnabled(this.mDragEnabled);
        dragItemAdapter.setDragStartedListener(new DragItemAdapter.DragStartCallback() {
            public boolean isDragging() {
                return dragItemRecyclerView.isDragging();
            }

            public boolean startDrag(View view, long j) {
                return dragItemRecyclerView.startDrag(view, j, BoardView.this.getListTouchX(dragItemRecyclerView), BoardView.this.getListTouchY(dragItemRecyclerView));
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(this.mColumnWidth, -1));
        if (view != null) {
            linearLayout.addView(view);
            this.mHeaders.put(this.mLists.size(), view);
        }
        linearLayout.addView(dragItemRecyclerView);
        this.mLists.add(dragItemRecyclerView);
        this.mColumnLayout.addView(linearLayout);
        return dragItemRecyclerView;
    }

    public void addItem(int i, int i2, Object obj, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() >= i2) {
            ((DragItemAdapter) this.mLists.get(i).getAdapter()).addItem(i2, obj);
            if (z) {
                scrollToItem(i, i2, false);
            }
        }
    }

    public void clearBoard() {
        for (int size = this.mLists.size() - 1; size >= 0; size--) {
            this.mColumnLayout.removeViewAt(size);
            this.mHeaders.remove(size);
            this.mLists.remove(size);
        }
    }

    public void computeScroll() {
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            super.computeScroll();
            return;
        }
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(getScrollX() == currX && getScrollY() == currY)) {
            scrollTo(currX, currY);
        }
        if (this.mAutoScroller.isAutoScrolling()) {
            this.mDragItem.setPosition(getListTouchX(this.mCurrentRecyclerView), getListTouchY(this.mCurrentRecyclerView));
        }
        C1040ar.m5924d(this);
    }

    public DragItemAdapter getAdapter(int i) {
        if (i < 0 || i >= this.mLists.size()) {
            return null;
        }
        return (DragItemAdapter) this.mLists.get(i).getAdapter();
    }

    public int getColumnCount() {
        return this.mLists.size();
    }

    public View getHeaderView(int i) {
        return this.mHeaders.get(i);
    }

    public int getItemCount() {
        int i = 0;
        Iterator<DragItemRecyclerView> it = this.mLists.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = it.next().getAdapter().getItemCount() + i2;
        }
    }

    public int getItemCount(int i) {
        if (this.mLists.size() > i) {
            return this.mLists.get(i).getAdapter().getItemCount();
        }
        return 0;
    }

    public C1732az getRecyclerView(int i) {
        if (i < 0 || i >= this.mLists.size()) {
            return null;
        }
        return this.mLists.get(i);
    }

    public boolean isDragEnabled() {
        return this.mDragEnabled;
    }

    public void moveItem(int i, int i2, int i3, int i4, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i2 && this.mLists.size() > i3 && this.mLists.get(i3).getAdapter().getItemCount() >= i4) {
            ((DragItemAdapter) this.mLists.get(i3).getAdapter()).addItem(i4, ((DragItemAdapter) this.mLists.get(i).getAdapter()).removeItem(i2));
            if (z) {
                scrollToItem(i3, i4, false);
            }
        }
    }

    public void moveItem(long j, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.mLists.size(); i3++) {
            C1732az.C1739a adapter = this.mLists.get(i3).getAdapter();
            int itemCount = adapter.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                if (adapter.getItemId(i4) == j) {
                    moveItem(i3, i4, i, i2, z);
                    return;
                }
            }
        }
    }

    public void onAutoScrollColumnBy(int i) {
        if (isDragging()) {
            int columnOfList = getColumnOfList(getCurrentRecyclerView((float) ((getWidth() / 2) + getScrollX()))) + i;
            if (i != 0 && columnOfList >= 0 && columnOfList < this.mLists.size()) {
                scrollToColumn(columnOfList, true);
            }
            updateScrollPosition();
            return;
        }
        this.mAutoScroller.stopAutoScroll();
    }

    public void onAutoScrollPositionBy(int i, int i2) {
        if (isDragging()) {
            scrollBy(i, i2);
            updateScrollPosition();
            return;
        }
        this.mAutoScroller.stopAutoScroll();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        boolean z = true;
        super.onFinishInflate();
        Resources resources = getResources();
        if (resources.getConfiguration().orientation != 1) {
            z = false;
        }
        if (z) {
            this.mColumnWidth = (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.87d);
        } else {
            this.mColumnWidth = (int) (resources.getDisplayMetrics().density * 320.0f);
        }
        this.mGestureDetector = new GestureDetector(getContext(), new GestureListener());
        this.mScroller = new Scroller(getContext(), new DecelerateInterpolator(1.1f));
        this.mAutoScroller = new AutoScroller(getContext(), this);
        this.mAutoScroller.setAutoScrollMode(snapToColumnWhenDragging() ? AutoScroller.AutoScrollMode.COLUMN : AutoScroller.AutoScrollMode.POSITION);
        this.mDragItem = new DragItem(getContext());
        this.mRootLayout = new FrameLayout(getContext());
        this.mRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.mColumnLayout = new LinearLayout(getContext());
        this.mColumnLayout.setOrientation(0);
        this.mColumnLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.mColumnLayout.setMotionEventSplittingEnabled(false);
        this.mRootLayout.addView(this.mColumnLayout);
        this.mRootLayout.addView(this.mDragItem.getDragItemView());
        addView(this.mRootLayout);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.mHasLaidOut && snapToColumnWhenScrolling()) {
            scrollToColumn(getClosestColumn(), false);
        }
        this.mHasLaidOut = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void removeColumn(int i) {
        if (i >= 0 && this.mLists.size() > i) {
            this.mColumnLayout.removeViewAt(i);
            this.mHeaders.remove(i);
            this.mLists.remove(i);
        }
    }

    public void removeItem(int i, int i2) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i2) {
            ((DragItemAdapter) this.mLists.get(i).getAdapter()).removeItem(i2);
        }
    }

    public void replaceItem(int i, int i2, Object obj, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i2) {
            DragItemAdapter dragItemAdapter = (DragItemAdapter) this.mLists.get(i).getAdapter();
            dragItemAdapter.removeItem(i2);
            dragItemAdapter.addItem(i2, obj);
            if (z) {
                scrollToItem(i, i2, false);
            }
        }
    }

    public void scrollToColumn(int i, boolean z) {
        if (this.mLists.size() > i) {
            View view = (View) this.mLists.get(i).getParent();
            int left = view.getLeft() - ((getMeasuredWidth() - view.getMeasuredWidth()) / 2);
            int measuredWidth = this.mRootLayout.getMeasuredWidth() - getMeasuredWidth();
            if (left < 0) {
                left = 0;
            }
            int i2 = left > measuredWidth ? measuredWidth : left;
            if (getScrollX() != i2) {
                this.mScroller.forceFinished(true);
                if (z) {
                    this.mScroller.startScroll(getScrollX(), getScrollY(), i2 - getScrollX(), 0, SCROLL_ANIMATION_DURATION);
                    C1040ar.m5924d(this);
                    return;
                }
                scrollTo(i2, getScrollY());
            }
        }
    }

    public void scrollToItem(int i, int i2, boolean z) {
        if (!isDragging() && this.mLists.size() > i && this.mLists.get(i).getAdapter().getItemCount() > i2) {
            this.mScroller.forceFinished(true);
            scrollToColumn(i, z);
            if (z) {
                this.mLists.get(i).smoothScrollToPosition(i2);
            } else {
                this.mLists.get(i).scrollToPosition(i2);
            }
        }
    }

    public void setBoardListener(BoardListener boardListener) {
        this.mBoardListener = boardListener;
    }

    public void setColumnWidth(int i) {
        this.mColumnWidth = i;
    }

    public void setCustomDragItem(DragItem dragItem) {
        if (dragItem == null) {
            dragItem = new DragItem(getContext());
        }
        dragItem.setSnapToTouch(this.mDragItem.isSnapToTouch());
        this.mDragItem = dragItem;
        this.mRootLayout.removeViewAt(1);
        this.mRootLayout.addView(this.mDragItem.getDragItemView());
    }

    public void setDragEnabled(boolean z) {
        this.mDragEnabled = z;
        if (this.mLists.size() > 0) {
            Iterator<DragItemRecyclerView> it = this.mLists.iterator();
            while (it.hasNext()) {
                it.next().setDragEnabled(this.mDragEnabled);
            }
        }
    }

    public void setSnapDragItemToTouch(boolean z) {
        this.mDragItem.setSnapToTouch(z);
    }

    public void setSnapToColumnWhenDragging(boolean z) {
        this.mSnapToColumnWhenDragging = z;
        this.mAutoScroller.setAutoScrollMode(snapToColumnWhenDragging() ? AutoScroller.AutoScrollMode.COLUMN : AutoScroller.AutoScrollMode.POSITION);
    }

    public void setSnapToColumnsWhenScrolling(boolean z) {
        this.mSnapToColumnWhenScrolling = z;
    }
}
