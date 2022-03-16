package com.woxthebox.draglistview;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

public class DragItem {
    protected static final int ANIMATION_DURATION = 250;
    private float mAnimationDx;
    private float mAnimationDy;
    private boolean mCanDragHorizontally = true;
    private View mDragView;
    private float mOffsetX;
    private float mOffsetY;
    private float mPosTouchDx;
    private float mPosTouchDy;
    private float mPosX;
    private float mPosY;
    private boolean mSnapToTouch = true;

    public DragItem(Context context) {
        this.mDragView = new View(context);
        hide();
    }

    public DragItem(Context context, int i) {
        this.mDragView = View.inflate(context, i, (ViewGroup) null);
        hide();
    }

    private void show() {
        this.mDragView.setVisibility(0);
    }

    private void updatePosition() {
        if (this.mCanDragHorizontally) {
            this.mDragView.setX(((this.mPosX + this.mOffsetX) + this.mAnimationDx) - ((float) (this.mDragView.getMeasuredWidth() / 2)));
        }
        this.mDragView.setY(((this.mPosY + this.mOffsetY) + this.mAnimationDy) - ((float) (this.mDragView.getMeasuredHeight() / 2)));
        this.mDragView.invalidate();
    }

    /* access modifiers changed from: package-private */
    public boolean canDragHorizontally() {
        return this.mCanDragHorizontally;
    }

    /* access modifiers changed from: package-private */
    public void endDrag(View view, AnimatorListenerAdapter animatorListenerAdapter) {
        onEndDragAnimation(this.mDragView);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("X", new float[]{this.mPosX, (view.getX() - ((float) ((this.mDragView.getMeasuredWidth() - view.getMeasuredWidth()) / 2))) + ((float) (this.mDragView.getMeasuredWidth() / 2))}), PropertyValuesHolder.ofFloat("Y", new float[]{this.mPosY, (view.getY() - ((float) ((this.mDragView.getMeasuredHeight() - view.getMeasuredHeight()) / 2))) + ((float) (this.mDragView.getMeasuredHeight() / 2))})});
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
        ofPropertyValuesHolder.setDuration(250);
        ofPropertyValuesHolder.addListener(animatorListenerAdapter);
        ofPropertyValuesHolder.start();
    }

    /* access modifiers changed from: package-private */
    public View getDragItemView() {
        return this.mDragView;
    }

    /* access modifiers changed from: package-private */
    public float getX() {
        return this.mPosX;
    }

    /* access modifiers changed from: package-private */
    public float getY() {
        return this.mPosY;
    }

    /* access modifiers changed from: package-private */
    public void hide() {
        this.mDragView.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public boolean isSnapToTouch() {
        return this.mSnapToTouch;
    }

    public void onBindDragView(View view, View view2) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (Build.VERSION.SDK_INT >= 16) {
            view2.setBackground(new BitmapDrawable(view.getResources(), createBitmap));
        } else {
            view2.setBackgroundDrawable(new BitmapDrawable(view.getResources(), createBitmap));
        }
    }

    public void onEndDragAnimation(View view) {
    }

    public void onMeasureDragView(View view, View view2) {
        view2.setLayoutParams(new FrameLayout.LayoutParams(view.getMeasuredWidth(), view.getMeasuredHeight()));
        view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
    }

    public void onStartDragAnimation(View view) {
    }

    /* access modifiers changed from: package-private */
    public void setAnimationDY(float f) {
        this.mAnimationDy = f;
        updatePosition();
    }

    /* access modifiers changed from: package-private */
    public void setAnimationDx(float f) {
        this.mAnimationDx = f;
        updatePosition();
    }

    /* access modifiers changed from: package-private */
    public void setCanDragHorizontally(boolean z) {
        this.mCanDragHorizontally = z;
    }

    /* access modifiers changed from: package-private */
    public void setOffset(float f, float f2) {
        this.mOffsetX = f;
        this.mOffsetY = f2;
        updatePosition();
    }

    /* access modifiers changed from: package-private */
    public void setPosition(float f, float f2) {
        this.mPosX = this.mPosTouchDx + f;
        this.mPosY = this.mPosTouchDy + f2;
        updatePosition();
    }

    /* access modifiers changed from: package-private */
    public void setSnapToTouch(boolean z) {
        this.mSnapToTouch = z;
    }

    /* access modifiers changed from: package-private */
    public void setX(float f) {
        this.mPosX = f;
        updatePosition();
    }

    /* access modifiers changed from: package-private */
    public void setY(float f) {
        this.mPosY = f;
        updatePosition();
    }

    /* access modifiers changed from: package-private */
    public void startDrag(View view, float f, float f2) {
        show();
        onBindDragView(view, this.mDragView);
        onMeasureDragView(view, this.mDragView);
        onStartDragAnimation(this.mDragView);
        float x = (view.getX() - ((float) ((this.mDragView.getMeasuredWidth() - view.getMeasuredWidth()) / 2))) + ((float) (this.mDragView.getMeasuredWidth() / 2));
        float y = (view.getY() - ((float) ((this.mDragView.getMeasuredHeight() - view.getMeasuredHeight()) / 2))) + ((float) (this.mDragView.getMeasuredHeight() / 2));
        if (this.mSnapToTouch) {
            this.mPosTouchDx = 0.0f;
            this.mPosTouchDy = 0.0f;
            setPosition(f, f2);
            setAnimationDx(x - f);
            setAnimationDY(y - f2);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("AnimationDx", new float[]{this.mAnimationDx, 0.0f}), PropertyValuesHolder.ofFloat("AnimationDY", new float[]{this.mAnimationDy, 0.0f})});
            ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator());
            ofPropertyValuesHolder.setDuration(250);
            ofPropertyValuesHolder.start();
            return;
        }
        this.mPosTouchDx = x - f;
        this.mPosTouchDy = y - f2;
        setPosition(f, f2);
    }
}
