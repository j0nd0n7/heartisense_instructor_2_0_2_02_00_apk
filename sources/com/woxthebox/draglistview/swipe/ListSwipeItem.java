package com.woxthebox.draglistview.swipe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p036v7.widget.C1732az;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.woxthebox.draglistview.C2656R;
import com.woxthebox.draglistview.swipe.ListSwipeHelper;

public class ListSwipeItem extends RelativeLayout {
    private float mFlingSpeed;
    private View mLeftView;
    private int mLeftViewId;
    private View mRightView;
    private int mRightViewId;
    private float mStartSwipeTranslationX;
    private SwipeDirection mSwipeDirection = SwipeDirection.LEFT_AND_RIGHT;
    private SwipeInStyle mSwipeInStyle = SwipeInStyle.APPEAR;
    /* access modifiers changed from: private */
    public ListSwipeHelper.OnSwipeListener mSwipeListener;
    private boolean mSwipeStarted;
    /* access modifiers changed from: private */
    public SwipeState mSwipeState = SwipeState.IDLE;
    /* access modifiers changed from: private */
    public float mSwipeTranslationX;
    private View mSwipeView;
    private int mSwipeViewId;
    /* access modifiers changed from: private */
    public C1732az.C1774x mViewHolder;

    public enum SwipeDirection {
        LEFT,
        RIGHT,
        LEFT_AND_RIGHT,
        NONE
    }

    public enum SwipeInStyle {
        APPEAR,
        SLIDE
    }

    private enum SwipeState {
        IDLE,
        SWIPING,
        ANIMATING
    }

    public ListSwipeItem(Context context) {
        super(context);
    }

    public ListSwipeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public ListSwipeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private float getTranslateToXPosition(float f, float f2, float f3) {
        if (f3 == 0.0f && Math.abs(f - f2) < ((float) (getMeasuredWidth() / 3))) {
            return f;
        }
        if (f2 < 0.0f) {
            if (f3 > 0.0f) {
                return 0.0f;
            }
            return (float) (-getMeasuredWidth());
        } else if (f == 0.0f) {
            if (f3 < 0.0f) {
                return 0.0f;
            }
            return (float) getMeasuredWidth();
        } else if (f3 > 0.0f) {
            return (float) getMeasuredWidth();
        } else {
            return 0.0f;
        }
    }

    private void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2656R.styleable.ListSwipeItem);
        this.mSwipeViewId = obtainStyledAttributes.getResourceId(C2656R.styleable.ListSwipeItem_swipeViewId, -1);
        this.mLeftViewId = obtainStyledAttributes.getResourceId(C2656R.styleable.ListSwipeItem_leftViewId, -1);
        this.mRightViewId = obtainStyledAttributes.getResourceId(C2656R.styleable.ListSwipeItem_rightViewId, -1);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public void animateToSwipeTranslationX(float f, Animator.AnimatorListener... animatorListenerArr) {
        if (f != this.mSwipeTranslationX) {
            this.mSwipeState = SwipeState.ANIMATING;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "SwipeTranslationX", new float[]{this.mSwipeTranslationX, f});
            ofFloat.setDuration(250);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            for (Animator.AnimatorListener animatorListener : animatorListenerArr) {
                if (animatorListener != null) {
                    ofFloat.addListener(animatorListener);
                }
            }
            ofFloat.start();
        }
    }

    public SwipeDirection getSupportedSwipeDirection() {
        return this.mSwipeDirection;
    }

    /* access modifiers changed from: package-private */
    public SwipeDirection getSwipedDirection() {
        return this.mSwipeState != SwipeState.IDLE ? SwipeDirection.NONE : this.mSwipeView.getTranslationX() == ((float) (-getMeasuredWidth())) ? SwipeDirection.LEFT : this.mSwipeView.getTranslationX() == ((float) getMeasuredWidth()) ? SwipeDirection.RIGHT : SwipeDirection.NONE;
    }

    /* access modifiers changed from: package-private */
    public void handleSwipeMove(float f, C1732az.C1774x xVar) {
        if (!isAnimating()) {
            this.mSwipeState = SwipeState.SWIPING;
            if (!this.mSwipeStarted) {
                this.mSwipeStarted = true;
                this.mViewHolder = xVar;
                this.mViewHolder.setIsRecyclable(false);
            }
            swipeTranslationByX(f);
        }
    }

    /* access modifiers changed from: package-private */
    public void handleSwipeMoveStarted(ListSwipeHelper.OnSwipeListener onSwipeListener) {
        this.mStartSwipeTranslationX = this.mSwipeTranslationX;
        this.mSwipeListener = onSwipeListener;
    }

    /* access modifiers changed from: package-private */
    public void handleSwipeUp(Animator.AnimatorListener animatorListener) {
        if (!isAnimating() && this.mSwipeStarted) {
            C26602 r0 = new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    SwipeState unused = ListSwipeItem.this.mSwipeState = SwipeState.IDLE;
                    if (ListSwipeItem.this.mSwipeTranslationX == 0.0f) {
                        ListSwipeItem.this.resetSwipe(false);
                    }
                    if (ListSwipeItem.this.mViewHolder != null) {
                        ListSwipeItem.this.mViewHolder.setIsRecyclable(true);
                    }
                }
            };
            if (this.mFlingSpeed != 0.0f || Math.abs(this.mStartSwipeTranslationX - this.mSwipeTranslationX) >= ((float) (getMeasuredWidth() / 3))) {
                animateToSwipeTranslationX(getTranslateToXPosition(this.mStartSwipeTranslationX, this.mSwipeTranslationX, this.mFlingSpeed), r0, animatorListener);
            } else {
                animateToSwipeTranslationX(this.mStartSwipeTranslationX, r0, animatorListener);
            }
            this.mStartSwipeTranslationX = 0.0f;
            this.mFlingSpeed = 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAnimating() {
        return this.mSwipeState == SwipeState.ANIMATING;
    }

    /* access modifiers changed from: package-private */
    public boolean isSwipeStarted() {
        return this.mSwipeStarted;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mSwipeView = findViewById(this.mSwipeViewId);
        this.mLeftView = findViewById(this.mLeftViewId);
        this.mRightView = findViewById(this.mRightViewId);
        if (this.mLeftView != null) {
            this.mLeftView.setVisibility(4);
        }
        if (this.mRightView != null) {
            this.mRightView.setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    public void resetSwipe(boolean z) {
        if (!isAnimating() && this.mSwipeStarted) {
            if (this.mSwipeTranslationX == 0.0f) {
                this.mSwipeListener = null;
            } else if (z) {
                animateToSwipeTranslationX(0.0f, new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        SwipeState unused = ListSwipeItem.this.mSwipeState = SwipeState.IDLE;
                        ListSwipeHelper.OnSwipeListener unused2 = ListSwipeItem.this.mSwipeListener = null;
                    }
                });
            } else {
                setSwipeTranslationX(0.0f);
                this.mSwipeState = SwipeState.IDLE;
                this.mSwipeListener = null;
            }
            if (this.mViewHolder != null && !this.mViewHolder.isRecyclable()) {
                this.mViewHolder.setIsRecyclable(true);
            }
            this.mViewHolder = null;
            this.mFlingSpeed = 0.0f;
            this.mStartSwipeTranslationX = 0.0f;
            this.mSwipeStarted = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void setFlingSpeed(float f) {
        this.mFlingSpeed = f;
    }

    public void setSupportedSwipeDirection(SwipeDirection swipeDirection) {
        this.mSwipeDirection = swipeDirection;
    }

    public void setSwipeInStyle(SwipeInStyle swipeInStyle) {
        this.mSwipeInStyle = swipeInStyle;
    }

    /* access modifiers changed from: package-private */
    public void setSwipeListener(ListSwipeHelper.OnSwipeListener onSwipeListener) {
        this.mSwipeListener = onSwipeListener;
    }

    /* access modifiers changed from: package-private */
    public void setSwipeTranslationX(float f) {
        if ((this.mSwipeDirection == SwipeDirection.LEFT && f > 0.0f) || ((this.mSwipeDirection == SwipeDirection.RIGHT && f < 0.0f) || this.mSwipeDirection == SwipeDirection.NONE)) {
            f = 0.0f;
        }
        this.mSwipeTranslationX = f;
        this.mSwipeTranslationX = Math.min(this.mSwipeTranslationX, (float) getMeasuredWidth());
        this.mSwipeTranslationX = Math.max(this.mSwipeTranslationX, (float) (-getMeasuredWidth()));
        this.mSwipeView.setTranslationX(this.mSwipeTranslationX);
        if (this.mSwipeListener != null) {
            this.mSwipeListener.onItemSwiping(this, this.mSwipeTranslationX);
        }
        if (this.mSwipeTranslationX < 0.0f) {
            if (this.mSwipeInStyle == SwipeInStyle.SLIDE) {
                this.mRightView.setTranslationX(((float) getMeasuredWidth()) + this.mSwipeTranslationX);
            }
            this.mRightView.setVisibility(0);
            this.mLeftView.setVisibility(4);
        } else if (this.mSwipeTranslationX > 0.0f) {
            if (this.mSwipeInStyle == SwipeInStyle.SLIDE) {
                this.mLeftView.setTranslationX(((float) (-getMeasuredWidth())) + this.mSwipeTranslationX);
            }
            this.mLeftView.setVisibility(0);
            this.mRightView.setVisibility(4);
        } else {
            this.mRightView.setVisibility(4);
            this.mLeftView.setVisibility(4);
        }
    }

    public void setTag(Object obj) {
        super.setTag(obj);
        if (this.mViewHolder != null && this.mViewHolder.isRecyclable()) {
            resetSwipe(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void swipeTranslationByX(float f) {
        setSwipeTranslationX(this.mSwipeTranslationX + f);
    }
}
