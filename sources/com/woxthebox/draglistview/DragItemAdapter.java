package com.woxthebox.draglistview;

import android.support.p036v7.widget.C1732az;
import android.view.MotionEvent;
import android.view.View;
import com.woxthebox.draglistview.DragItemAdapter.ViewHolder;
import java.util.Collections;
import java.util.List;

public abstract class DragItemAdapter<T, VH extends ViewHolder> extends C1732az.C1739a<VH> {
    private long mDragItemId = -1;
    private DragStartCallback mDragStartCallback;
    private long mDropTargetId = -1;
    protected List<T> mItemList;

    interface DragStartCallback {
        boolean isDragging();

        boolean startDrag(View view, long j);
    }

    public static abstract class ViewHolder extends C1732az.C1774x {
        /* access modifiers changed from: private */
        public DragStartCallback mDragStartCallback;
        public View mGrabView;
        public long mItemId;

        public ViewHolder(final View view, int i, boolean z) {
            super(view);
            this.mGrabView = view.findViewById(i);
            if (z) {
                this.mGrabView.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        if (ViewHolder.this.mDragStartCallback == null) {
                            return false;
                        }
                        if (ViewHolder.this.mDragStartCallback.startDrag(view, ViewHolder.this.mItemId)) {
                            return true;
                        }
                        if (view == ViewHolder.this.mGrabView) {
                            return ViewHolder.this.onItemLongClicked(view);
                        }
                        return false;
                    }
                });
            } else {
                this.mGrabView.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (ViewHolder.this.mDragStartCallback == null) {
                            return false;
                        }
                        if (motionEvent.getAction() == 0 && ViewHolder.this.mDragStartCallback.startDrag(view, ViewHolder.this.mItemId)) {
                            return true;
                        }
                        if (ViewHolder.this.mDragStartCallback.isDragging() || view != ViewHolder.this.mGrabView) {
                            return false;
                        }
                        return ViewHolder.this.onItemTouch(view, motionEvent);
                    }
                });
            }
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ViewHolder.this.onItemClicked(view);
                }
            });
            if (view != this.mGrabView) {
                view.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View view) {
                        return ViewHolder.this.onItemLongClicked(view);
                    }
                });
                view.setOnTouchListener(new View.OnTouchListener() {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        return ViewHolder.this.onItemTouch(view, motionEvent);
                    }
                });
            }
        }

        public void onItemClicked(View view) {
        }

        public boolean onItemLongClicked(View view) {
            return false;
        }

        public boolean onItemTouch(View view, MotionEvent motionEvent) {
            return false;
        }

        public void setDragStartCallback(DragStartCallback dragStartCallback) {
            this.mDragStartCallback = dragStartCallback;
        }
    }

    public void addItem(int i, T t) {
        if (this.mItemList != null && this.mItemList.size() >= i) {
            this.mItemList.add(i, t);
            notifyItemInserted(i);
        }
    }

    public void changeItemPosition(int i, int i2) {
        if (this.mItemList != null && this.mItemList.size() > i && this.mItemList.size() > i2) {
            this.mItemList.add(i2, this.mItemList.remove(i));
            notifyItemMoved(i, i2);
        }
    }

    public long getDropTargetId() {
        return this.mDropTargetId;
    }

    public int getItemCount() {
        if (this.mItemList == null) {
            return 0;
        }
        return this.mItemList.size();
    }

    public List<T> getItemList() {
        return this.mItemList;
    }

    public int getPositionForItem(T t) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (this.mItemList.get(i) == t) {
                return i;
            }
        }
        return -1;
    }

    public int getPositionForItemId(long j) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (j == getItemId(i)) {
                return i;
            }
        }
        return -1;
    }

    public void onBindViewHolder(VH vh, int i) {
        long itemId = getItemId(i);
        vh.mItemId = itemId;
        vh.itemView.setVisibility(this.mDragItemId == itemId ? 4 : 0);
        vh.setDragStartCallback(this.mDragStartCallback);
    }

    public void onViewRecycled(VH vh) {
        super.onViewRecycled(vh);
        vh.setDragStartCallback((DragStartCallback) null);
    }

    public Object removeItem(int i) {
        if (this.mItemList == null || this.mItemList.size() <= i || i < 0) {
            return null;
        }
        T remove = this.mItemList.remove(i);
        notifyItemRemoved(i);
        return remove;
    }

    /* access modifiers changed from: package-private */
    public void setDragItemId(long j) {
        this.mDragItemId = j;
    }

    /* access modifiers changed from: package-private */
    public void setDragStartedListener(DragStartCallback dragStartCallback) {
        this.mDragStartCallback = dragStartCallback;
    }

    /* access modifiers changed from: package-private */
    public void setDropTargetId(long j) {
        this.mDropTargetId = j;
    }

    public void setItemList(List<T> list) {
        this.mItemList = list;
        notifyDataSetChanged();
    }

    public void swapItems(int i, int i2) {
        if (this.mItemList != null && this.mItemList.size() > i && this.mItemList.size() > i2) {
            Collections.swap(this.mItemList, i, i2);
            notifyDataSetChanged();
        }
    }
}
