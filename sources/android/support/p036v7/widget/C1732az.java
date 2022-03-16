package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0020ao;
import android.support.annotation.C0030i;
import android.support.annotation.C0047z;
import android.support.p010v4.p025i.C0755t;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.p028k.C0817o;
import android.support.p010v4.view.C0919a;
import android.support.p010v4.view.C1007aa;
import android.support.p010v4.view.C1008ab;
import android.support.p010v4.view.C1033an;
import android.support.p010v4.view.C1035ap;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1066b;
import android.support.p010v4.view.C1200x;
import android.support.p010v4.view.p034a.C0922a;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0992u;
import android.support.p010v4.widget.C1224af;
import android.support.p010v4.widget.C1323m;
import android.support.p036v7.p042d.C1484b;
import android.support.p036v7.widget.ActivityChooserView;
import android.support.p036v7.widget.C1665ac;
import android.support.p036v7.widget.C1692al;
import android.support.p036v7.widget.C1812bs;
import android.support.p036v7.widget.C1816bt;
import android.support.p036v7.widget.C1839f;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.az */
public class C1732az extends ViewGroup implements C1007aa, C1033an {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    /* access modifiers changed from: private */
    public static final boolean ALLOW_THREAD_GAP_WORK = (Build.VERSION.SDK_INT >= 21);
    private static final int[] CLIP_TO_PADDING_ATTR = {16842987};
    static final boolean DEBUG = false;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (Build.VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20);
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (Build.VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (Build.VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    C1777ba mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private C1758l mActiveOnItemTouchListener;
    C1739a mAdapter;
    C1839f mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private C1323m mBottomGlow;
    private C1742d mChildDrawingOrderCallback;
    C1665ac mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    private int mDispatchScrollCounter;
    private int mEatRequestLayout;
    private int mEatenAccessibilityChangeFlags;
    @C0020ao
    boolean mFirstLayoutComplete;
    C1692al mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    boolean mIsAttached;
    C1743e mItemAnimator;
    private C1743e.C1746c mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C1749g> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    @C0020ao
    C1750h mLayout;
    boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    boolean mLayoutRequestEaten;
    private C1323m mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1764q mObserver;
    private List<C1756j> mOnChildAttachStateListeners;
    private C1757k mOnFlingListener;
    private final ArrayList<C1758l> mOnItemTouchListeners;
    @C0020ao
    final List<C1774x> mPendingAccessibilityImportanceChange;
    private C1765r mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C1692al.C1694a mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1762o mRecycler;
    C1763p mRecyclerListener;
    private C1323m mRightGlow;
    private final int[] mScrollConsumed;
    private float mScrollFactor;
    private C1759m mScrollListener;
    private List<C1759m> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C1008ab mScrollingChildHelper;
    final C1771u mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private C1323m mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C1773w mViewFlinger;
    private final C1816bt.C1818b mViewInfoProcessCallback;
    final C1816bt mViewInfoStore;

    /* renamed from: android.support.v7.widget.az$a */
    public static abstract class C1739a<VH extends C1774x> {
        private boolean mHasStableIds = false;
        private final C1740b mObservable = new C1740b();

        public final void bindViewHolder(VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C0817o.m4100a(C1732az.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof C1755i) {
                ((C1755i) layoutParams).f5880f = true;
            }
            C0817o.m4099a();
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            C0817o.m4100a(C1732az.TRACE_CREATE_VIEW_TAG);
            VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.mItemViewType = i;
            C0817o.m4099a();
            return onCreateViewHolder;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo6791a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo6792b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo6789a(i, 1);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo6790a(i, 1, obj);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo6793b(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo6795d(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo6789a(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo6790a(i, i2, obj);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo6793b(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo6794c(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo6794c(i, 1);
        }

        public void onAttachedToRecyclerView(C1732az azVar) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(C1732az azVar) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C1741c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void unregisterAdapterDataObserver(C1741c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }
    }

    /* renamed from: android.support.v7.widget.az$b */
    static class C1740b extends Observable<C1741c> {
        C1740b() {
        }

        /* renamed from: a */
        public void mo6789a(int i, int i2) {
            mo6790a(i, i2, (Object) null);
        }

        /* renamed from: a */
        public void mo6790a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1741c) this.mObservers.get(size)).mo6799a(i, i2, obj);
            }
        }

        /* renamed from: a */
        public boolean mo6791a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo6792b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1741c) this.mObservers.get(size)).mo6796a();
            }
        }

        /* renamed from: b */
        public void mo6793b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1741c) this.mObservers.get(size)).mo6800b(i, i2);
            }
        }

        /* renamed from: c */
        public void mo6794c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1741c) this.mObservers.get(size)).mo6801c(i, i2);
            }
        }

        /* renamed from: d */
        public void mo6795d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1741c) this.mObservers.get(size)).mo6798a(i, i2, 1);
            }
        }
    }

    /* renamed from: android.support.v7.widget.az$c */
    public static abstract class C1741c {
        /* renamed from: a */
        public void mo6796a() {
        }

        /* renamed from: a */
        public void mo6797a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo6798a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo6799a(int i, int i2, Object obj) {
            mo6797a(i, i2);
        }

        /* renamed from: b */
        public void mo6800b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo6801c(int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.az$d */
    public interface C1742d {
        /* renamed from: a */
        int mo6200a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.az$e */
    public static abstract class C1743e {

        /* renamed from: h */
        public static final int f5837h = 2;

        /* renamed from: i */
        public static final int f5838i = 8;

        /* renamed from: j */
        public static final int f5839j = 4;

        /* renamed from: k */
        public static final int f5840k = 2048;

        /* renamed from: l */
        public static final int f5841l = 4096;

        /* renamed from: a */
        private C1746c f5842a = null;

        /* renamed from: b */
        private ArrayList<C1745b> f5843b = new ArrayList<>();

        /* renamed from: c */
        private long f5844c = 120;

        /* renamed from: d */
        private long f5845d = 120;

        /* renamed from: e */
        private long f5846e = 250;

        /* renamed from: f */
        private long f5847f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v7.widget.az$e$a */
        public @interface C1744a {
        }

        /* renamed from: android.support.v7.widget.az$e$b */
        public interface C1745b {
            /* renamed from: a */
            void mo6825a();
        }

        /* renamed from: android.support.v7.widget.az$e$c */
        interface C1746c {
            /* renamed from: a */
            void mo6826a(C1774x xVar);
        }

        /* renamed from: android.support.v7.widget.az$e$d */
        public static class C1747d {

            /* renamed from: a */
            public int f5848a;

            /* renamed from: b */
            public int f5849b;

            /* renamed from: c */
            public int f5850c;

            /* renamed from: d */
            public int f5851d;

            /* renamed from: e */
            public int f5852e;

            /* renamed from: a */
            public C1747d mo6827a(C1774x xVar) {
                return mo6828a(xVar, 0);
            }

            /* renamed from: a */
            public C1747d mo6828a(C1774x xVar, int i) {
                View view = xVar.itemView;
                this.f5848a = view.getLeft();
                this.f5849b = view.getTop();
                this.f5850c = view.getRight();
                this.f5851d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m10425e(C1774x xVar) {
            int access$1400 = xVar.mFlags & 14;
            if (xVar.isInvalid()) {
                return 4;
            }
            if ((access$1400 & 4) != 0) {
                return access$1400;
            }
            int oldPosition = xVar.getOldPosition();
            int adapterPosition = xVar.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? access$1400 : access$1400 | 2048;
        }

        @C0047z
        /* renamed from: a */
        public C1747d mo6802a(@C0047z C1771u uVar, @C0047z C1774x xVar) {
            return mo6823j().mo6827a(xVar);
        }

        @C0047z
        /* renamed from: a */
        public C1747d mo6803a(@C0047z C1771u uVar, @C0047z C1774x xVar, int i, @C0047z List<Object> list) {
            return mo6823j().mo6827a(xVar);
        }

        /* renamed from: a */
        public abstract void mo6343a();

        /* renamed from: a */
        public void mo6804a(long j) {
            this.f5846e = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6805a(C1746c cVar) {
            this.f5842a = cVar;
        }

        /* renamed from: a */
        public final boolean mo6806a(C1745b bVar) {
            boolean b = mo6351b();
            if (bVar != null) {
                if (!b) {
                    bVar.mo6825a();
                } else {
                    this.f5843b.add(bVar);
                }
            }
            return b;
        }

        /* renamed from: a */
        public abstract boolean mo6807a(@C0047z C1774x xVar, @C0047z C1747d dVar, @C0003aa C1747d dVar2);

        /* renamed from: a */
        public abstract boolean mo6808a(@C0047z C1774x xVar, @C0047z C1774x xVar2, @C0047z C1747d dVar, @C0047z C1747d dVar2);

        /* renamed from: a */
        public boolean mo6349a(@C0047z C1774x xVar, @C0047z List<Object> list) {
            return mo6824j(xVar);
        }

        /* renamed from: b */
        public void mo6809b(long j) {
            this.f5844c = j;
        }

        /* renamed from: b */
        public abstract boolean mo6351b();

        /* renamed from: b */
        public abstract boolean mo6810b(@C0047z C1774x xVar, @C0003aa C1747d dVar, @C0047z C1747d dVar2);

        /* renamed from: c */
        public void mo6811c(long j) {
            this.f5845d = j;
        }

        /* renamed from: c */
        public abstract boolean mo6812c(@C0047z C1774x xVar, @C0047z C1747d dVar, @C0047z C1747d dVar2);

        /* renamed from: d */
        public abstract void mo6355d();

        /* renamed from: d */
        public void mo6813d(long j) {
            this.f5847f = j;
        }

        /* renamed from: d */
        public abstract void mo6356d(C1774x xVar);

        /* renamed from: e */
        public long mo6814e() {
            return this.f5846e;
        }

        /* renamed from: f */
        public long mo6815f() {
            return this.f5844c;
        }

        /* renamed from: f */
        public final void mo6816f(C1774x xVar) {
            mo6818g(xVar);
            if (this.f5842a != null) {
                this.f5842a.mo6826a(xVar);
            }
        }

        /* renamed from: g */
        public long mo6817g() {
            return this.f5845d;
        }

        /* renamed from: g */
        public void mo6818g(C1774x xVar) {
        }

        /* renamed from: h */
        public long mo6819h() {
            return this.f5847f;
        }

        /* renamed from: h */
        public final void mo6820h(C1774x xVar) {
            mo6822i(xVar);
        }

        /* renamed from: i */
        public final void mo6821i() {
            int size = this.f5843b.size();
            for (int i = 0; i < size; i++) {
                this.f5843b.get(i).mo6825a();
            }
            this.f5843b.clear();
        }

        /* renamed from: i */
        public void mo6822i(C1774x xVar) {
        }

        /* renamed from: j */
        public C1747d mo6823j() {
            return new C1747d();
        }

        /* renamed from: j */
        public boolean mo6824j(@C0047z C1774x xVar) {
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.az$f */
    private class C1748f implements C1743e.C1746c {
        C1748f() {
        }

        /* renamed from: a */
        public void mo6826a(C1774x xVar) {
            xVar.setIsRecyclable(true);
            if (xVar.mShadowedHolder != null && xVar.mShadowingHolder == null) {
                xVar.mShadowedHolder = null;
            }
            xVar.mShadowingHolder = null;
            if (!xVar.shouldBeKeptAsChild() && !C1732az.this.removeAnimatingView(xVar.itemView) && xVar.isTmpDetached()) {
                C1732az.this.removeDetachedView(xVar.itemView, false);
            }
        }
    }

    /* renamed from: android.support.v7.widget.az$g */
    public static abstract class C1749g {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, C1732az azVar) {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, C1732az azVar, C1771u uVar) {
            getItemOffsets(rect, ((C1755i) view.getLayoutParams()).mo6956h(), azVar);
        }

        @Deprecated
        public void onDraw(Canvas canvas, C1732az azVar) {
        }

        public void onDraw(Canvas canvas, C1732az azVar, C1771u uVar) {
            onDraw(canvas, azVar);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, C1732az azVar) {
        }

        public void onDrawOver(Canvas canvas, C1732az azVar, C1771u uVar) {
            onDrawOver(canvas, azVar);
        }
    }

    /* renamed from: android.support.v7.widget.az$h */
    public static abstract class C1750h {

        /* renamed from: A */
        boolean f5854A = false;

        /* renamed from: B */
        boolean f5855B = false;

        /* renamed from: C */
        int f5856C;

        /* renamed from: D */
        boolean f5857D;

        /* renamed from: a */
        private final C1812bs.C1814b f5858a = new C1812bs.C1814b() {
            /* renamed from: a */
            public int mo6944a() {
                return C1750h.this.mo6839H();
            }

            /* renamed from: a */
            public int mo6945a(View view) {
                return C1750h.this.mo6934o(view) - ((C1755i) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public View mo6946a(int i) {
                return C1750h.this.mo6928j(i);
            }

            /* renamed from: b */
            public int mo6947b(View view) {
                return ((C1755i) view.getLayoutParams()).rightMargin + C1750h.this.mo6936q(view);
            }

            /* renamed from: b */
            public View mo6948b() {
                return C1750h.this.f5867v;
            }

            /* renamed from: c */
            public int mo6949c() {
                return C1750h.this.mo6844M();
            }

            /* renamed from: d */
            public int mo6950d() {
                return C1750h.this.mo6842K() - C1750h.this.mo6846O();
            }
        };

        /* renamed from: b */
        private final C1812bs.C1814b f5859b = new C1812bs.C1814b() {
            /* renamed from: a */
            public int mo6944a() {
                return C1750h.this.mo6839H();
            }

            /* renamed from: a */
            public int mo6945a(View view) {
                return C1750h.this.mo6935p(view) - ((C1755i) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public View mo6946a(int i) {
                return C1750h.this.mo6928j(i);
            }

            /* renamed from: b */
            public int mo6947b(View view) {
                return ((C1755i) view.getLayoutParams()).bottomMargin + C1750h.this.mo6937r(view);
            }

            /* renamed from: b */
            public View mo6948b() {
                return C1750h.this.f5867v;
            }

            /* renamed from: c */
            public int mo6949c() {
                return C1750h.this.mo6845N();
            }

            /* renamed from: d */
            public int mo6950d() {
                return C1750h.this.mo6843L() - C1750h.this.mo6847P();
            }
        };

        /* renamed from: c */
        private boolean f5860c = true;

        /* renamed from: d */
        private boolean f5861d = true;

        /* renamed from: e */
        private int f5862e;

        /* renamed from: f */
        private int f5863f;

        /* renamed from: g */
        private int f5864g;

        /* renamed from: h */
        private int f5865h;

        /* renamed from: u */
        C1665ac f5866u;

        /* renamed from: v */
        C1732az f5867v;

        /* renamed from: w */
        C1812bs f5868w = new C1812bs(this.f5858a);

        /* renamed from: x */
        C1812bs f5869x = new C1812bs(this.f5859b);
        @C0003aa

        /* renamed from: y */
        C1768t f5870y;

        /* renamed from: z */
        boolean f5871z = false;

        /* renamed from: android.support.v7.widget.az$h$a */
        public interface C1753a {
            /* renamed from: b */
            void mo6388b(int i, int i2);
        }

        /* renamed from: android.support.v7.widget.az$h$b */
        public static class C1754b {

            /* renamed from: a */
            public int f5874a;

            /* renamed from: b */
            public int f5875b;

            /* renamed from: c */
            public boolean f5876c;

            /* renamed from: d */
            public boolean f5877d;
        }

        /* renamed from: a */
        public static int m10459a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                    return Math.min(size, Math.max(i2, i3));
                case 1073741824:
                    return size;
                default:
                    return Math.max(i2, i3);
            }
        }

        /* renamed from: a */
        public static int m10460a(int i, int i2, int i3, int i4, boolean z) {
            int i5 = 0;
            int max = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i5 = 1073741824;
                    max = i4;
                } else if (i4 == -1) {
                    switch (i2) {
                        case Integer.MIN_VALUE:
                        case 1073741824:
                            i5 = max;
                            break;
                        case 0:
                            i2 = 0;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    max = i5;
                    i5 = i2;
                } else {
                    if (i4 == -2) {
                        max = 0;
                    }
                    max = 0;
                }
            } else if (i4 >= 0) {
                i5 = 1073741824;
                max = i4;
            } else if (i4 == -1) {
                i5 = i2;
            } else {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i5 = Integer.MIN_VALUE;
                    }
                }
                max = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(max, i5);
        }

        @Deprecated
        /* renamed from: a */
        public static int m10461a(int i, int i2, int i3, boolean z) {
            int i4 = 1073741824;
            int max = Math.max(0, i - i2);
            if (z) {
                if (i3 < 0) {
                    i4 = 0;
                    i3 = 0;
                }
            } else if (i3 < 0) {
                if (i3 == -1) {
                    i3 = max;
                } else if (i3 == -2) {
                    i4 = Integer.MIN_VALUE;
                    i3 = max;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i4);
        }

        /* renamed from: a */
        public static C1754b m10462a(Context context, AttributeSet attributeSet, int i, int i2) {
            C1754b bVar = new C1754b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484b.C1488d.RecyclerView, i, i2);
            bVar.f5874a = obtainStyledAttributes.getInt(C1484b.C1488d.RecyclerView_android_orientation, 1);
            bVar.f5875b = obtainStyledAttributes.getInt(C1484b.C1488d.RecyclerView_spanCount, 1);
            bVar.f5876c = obtainStyledAttributes.getBoolean(C1484b.C1488d.RecyclerView_reverseLayout, false);
            bVar.f5877d = obtainStyledAttributes.getBoolean(C1484b.C1488d.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* renamed from: a */
        private void m10463a(int i, View view) {
            this.f5866u.mo6263e(i);
        }

        /* renamed from: a */
        private void m10465a(C1762o oVar, int i, View view) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f5867v.mAdapter.hasStableIds()) {
                    mo6926i(i);
                    oVar.mo7003d(view);
                    this.f5867v.mViewInfoStore.mo7344h(childViewHolderInt);
                    return;
                }
                mo6924h(i);
                oVar.mo6993b(childViewHolderInt);
            }
        }

        /* renamed from: a */
        private void m10466a(View view, int i, boolean z) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.f5867v.mViewInfoStore.mo7341e(childViewHolderInt);
            } else {
                this.f5867v.mViewInfoStore.mo7342f(childViewHolderInt);
            }
            C1755i iVar = (C1755i) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f5866u.mo6252a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f5867v) {
                int b = this.f5866u.mo6256b(view);
                if (i == -1) {
                    i = this.f5866u.mo6255b();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5867v.indexOfChild(view));
                } else if (b != i) {
                    this.f5867v.mLayout.mo6918f(b, i);
                }
            } else {
                this.f5866u.mo6253a(view, i, false);
                iVar.f5880f = true;
                if (this.f5870y != null && this.f5870y.mo7028h()) {
                    this.f5870y.mo7021b(view);
                }
            }
            if (iVar.f5881g) {
                childViewHolderInt.itemView.invalidate();
                iVar.f5881g = false;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m10467b(C1768t tVar) {
            if (this.f5870y == tVar) {
                this.f5870y = null;
            }
        }

        /* renamed from: b */
        private static boolean m10468b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            switch (mode) {
                case Integer.MIN_VALUE:
                    return size >= i;
                case 0:
                    return true;
                case 1073741824:
                    return size == i;
                default:
                    return false;
            }
        }

        /* renamed from: b */
        private int[] m10469b(C1732az azVar, View view, Rect rect, boolean z) {
            int min;
            int[] iArr = new int[2];
            int M = mo6844M();
            int N = mo6845N();
            int K = mo6842K() - mo6846O();
            int L = mo6843L() - mo6847P();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = left + rect.width();
            int height = top + rect.height();
            int min2 = Math.min(0, left - M);
            int min3 = Math.min(0, top - N);
            int max = Math.max(0, width - K);
            int max2 = Math.max(0, height - L);
            if (mo6836E() == 1) {
                if (max == 0) {
                    max = Math.max(min2, width - K);
                }
                min = max;
            } else {
                min = min2 != 0 ? min2 : Math.min(left - M, max);
            }
            int min4 = min3 != 0 ? min3 : Math.min(top - N, max2);
            iArr[0] = min;
            iArr[1] = min4;
            return iArr;
        }

        /* renamed from: d */
        private boolean m10470d(C1732az azVar, int i, int i2) {
            View focusedChild = azVar.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int M = mo6844M();
            int N = mo6845N();
            int K = mo6842K() - mo6846O();
            int L = mo6843L() - mo6847P();
            Rect rect = this.f5867v.mTempRect;
            mo6871a(focusedChild, rect);
            return rect.left - i < K && rect.right - i > M && rect.top - i2 < L && rect.bottom - i2 > N;
        }

        /* renamed from: A */
        public final boolean mo6832A() {
            return this.f5861d;
        }

        /* renamed from: B */
        public boolean mo6833B() {
            return this.f5854A;
        }

        /* renamed from: C */
        public boolean mo6834C() {
            return this.f5867v != null && this.f5867v.mClipToPadding;
        }

        /* renamed from: D */
        public boolean mo6835D() {
            return this.f5870y != null && this.f5870y.mo7028h();
        }

        /* renamed from: E */
        public int mo6836E() {
            return C1040ar.m5947k(this.f5867v);
        }

        /* renamed from: F */
        public void mo6837F() {
            for (int H = mo6839H() - 1; H >= 0; H--) {
                this.f5866u.mo6250a(H);
            }
        }

        /* renamed from: G */
        public int mo6838G() {
            return -1;
        }

        /* renamed from: H */
        public int mo6839H() {
            if (this.f5866u != null) {
                return this.f5866u.mo6255b();
            }
            return 0;
        }

        /* renamed from: I */
        public int mo6840I() {
            return this.f5862e;
        }

        /* renamed from: J */
        public int mo6841J() {
            return this.f5863f;
        }

        /* renamed from: K */
        public int mo6842K() {
            return this.f5864g;
        }

        /* renamed from: L */
        public int mo6843L() {
            return this.f5865h;
        }

        /* renamed from: M */
        public int mo6844M() {
            if (this.f5867v != null) {
                return this.f5867v.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: N */
        public int mo6845N() {
            if (this.f5867v != null) {
                return this.f5867v.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: O */
        public int mo6846O() {
            if (this.f5867v != null) {
                return this.f5867v.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: P */
        public int mo6847P() {
            if (this.f5867v != null) {
                return this.f5867v.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: Q */
        public int mo6848Q() {
            if (this.f5867v != null) {
                return C1040ar.m5960r(this.f5867v);
            }
            return 0;
        }

        /* renamed from: R */
        public int mo6849R() {
            if (this.f5867v != null) {
                return C1040ar.m5961s(this.f5867v);
            }
            return 0;
        }

        /* renamed from: S */
        public boolean mo6850S() {
            return this.f5867v != null && this.f5867v.isFocused();
        }

        /* renamed from: T */
        public boolean mo6851T() {
            return this.f5867v != null && this.f5867v.hasFocus();
        }

        /* renamed from: U */
        public View mo6852U() {
            View focusedChild;
            if (this.f5867v == null || (focusedChild = this.f5867v.getFocusedChild()) == null || this.f5866u.mo6260c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: V */
        public int mo6853V() {
            C1739a adapter = this.f5867v != null ? this.f5867v.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: W */
        public boolean mo6854W() {
            return this.f5860c;
        }

        /* renamed from: X */
        public int mo6855X() {
            return C1040ar.m5967y(this.f5867v);
        }

        /* renamed from: Y */
        public int mo6856Y() {
            return C1040ar.m5968z(this.f5867v);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Z */
        public void mo6857Z() {
            if (this.f5870y != null) {
                this.f5870y.mo7025f();
            }
        }

        /* renamed from: a */
        public int mo5777a(int i, C1762o oVar, C1771u uVar) {
            return 0;
        }

        /* renamed from: a */
        public int mo5778a(C1762o oVar, C1771u uVar) {
            if (this.f5867v == null || this.f5867v.mAdapter == null || !mo5847h()) {
                return 1;
            }
            return this.f5867v.mAdapter.getItemCount();
        }

        /* renamed from: a */
        public abstract C1755i mo5779a();

        /* renamed from: a */
        public C1755i mo5780a(Context context, AttributeSet attributeSet) {
            return new C1755i(context, attributeSet);
        }

        /* renamed from: a */
        public C1755i mo5781a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C1755i ? new C1755i((C1755i) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1755i((ViewGroup.MarginLayoutParams) layoutParams) : new C1755i(layoutParams);
        }

        @C0003aa
        /* renamed from: a */
        public View mo5783a(View view, int i, C1762o oVar, C1771u uVar) {
            return null;
        }

        /* renamed from: a */
        public void mo5817a(int i, int i2, C1771u uVar, C1753a aVar) {
        }

        /* renamed from: a */
        public void mo5818a(int i, C1753a aVar) {
        }

        /* renamed from: a */
        public void mo6858a(int i, C1762o oVar) {
            m10465a(oVar, i, mo6928j(i));
        }

        /* renamed from: a */
        public void mo5785a(Rect rect, int i, int i2) {
            mo6922g(m10459a(i, rect.width() + mo6844M() + mo6846O(), mo6855X()), m10459a(i2, rect.height() + mo6845N() + mo6847P(), mo6856Y()));
        }

        /* renamed from: a */
        public void mo5819a(Parcelable parcelable) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6859a(C0949h hVar) {
            mo6863a(this.f5867v.mRecycler, this.f5867v.mState, hVar);
        }

        /* renamed from: a */
        public void mo6860a(C1739a aVar, C1739a aVar2) {
        }

        /* renamed from: a */
        public void mo6861a(C1762o oVar) {
            for (int H = mo6839H() - 1; H >= 0; H--) {
                m10465a(oVar, H, mo6928j(H));
            }
        }

        /* renamed from: a */
        public void mo6862a(C1762o oVar, C1771u uVar, int i, int i2) {
            this.f5867v.defaultOnMeasure(i, i2);
        }

        /* renamed from: a */
        public void mo6863a(C1762o oVar, C1771u uVar, C0949h hVar) {
            if (C1040ar.m5919b((View) this.f5867v, -1) || C1040ar.m5902a((View) this.f5867v, -1)) {
                hVar.mo3183d(8192);
                hVar.mo3223l(true);
            }
            if (C1040ar.m5919b((View) this.f5867v, 1) || C1040ar.m5902a((View) this.f5867v, 1)) {
                hVar.mo3183d(4096);
                hVar.mo3223l(true);
            }
            hVar.mo3169b((Object) C0949h.C0962m.m5261a(mo5778a(oVar, uVar), mo5799b(oVar, uVar), mo6916e(oVar, uVar), mo6907d(oVar, uVar)));
        }

        /* renamed from: a */
        public void mo5789a(C1762o oVar, C1771u uVar, View view, C0949h hVar) {
            hVar.mo3180c((Object) C0949h.C0963n.m5267a(mo5847h() ? mo6912e(view) : 0, 1, mo5845g() ? mo6912e(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void mo6864a(C1762o oVar, C1771u uVar, AccessibilityEvent accessibilityEvent) {
            boolean z = true;
            C0992u b = C0922a.m4609b(accessibilityEvent);
            if (this.f5867v != null && b != null) {
                if (!C1040ar.m5919b((View) this.f5867v, 1) && !C1040ar.m5919b((View) this.f5867v, -1) && !C1040ar.m5902a((View) this.f5867v, -1) && !C1040ar.m5902a((View) this.f5867v, 1)) {
                    z = false;
                }
                b.mo3445e(z);
                if (this.f5867v.mAdapter != null) {
                    b.mo3428a(this.f5867v.mAdapter.getItemCount());
                }
            }
        }

        /* renamed from: a */
        public void mo6865a(C1768t tVar) {
            if (!(this.f5870y == null || tVar == this.f5870y || !this.f5870y.mo7028h())) {
                this.f5870y.mo7025f();
            }
            this.f5870y = tVar;
            this.f5870y.mo7020a(this.f5867v, this);
        }

        /* renamed from: a */
        public void mo5790a(C1771u uVar) {
        }

        /* renamed from: a */
        public void mo5792a(C1732az azVar) {
        }

        /* renamed from: a */
        public void mo5793a(C1732az azVar, int i, int i2) {
        }

        /* renamed from: a */
        public void mo5794a(C1732az azVar, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo5795a(C1732az azVar, int i, int i2, Object obj) {
            mo6904c(azVar, i, i2);
        }

        @C0030i
        /* renamed from: a */
        public void mo5820a(C1732az azVar, C1762o oVar) {
            mo6914e(azVar);
        }

        /* renamed from: a */
        public void mo5821a(C1732az azVar, C1771u uVar, int i) {
            Log.e(C1732az.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: a */
        public void mo6866a(View view) {
            if (this.f5867v.mItemAnimator != null) {
                this.f5867v.mItemAnimator.mo6356d(C1732az.getChildViewHolderInt(view));
            }
        }

        /* renamed from: a */
        public void mo6867a(View view, int i) {
            m10466a(view, i, true);
        }

        /* renamed from: a */
        public void mo6868a(View view, int i, int i2) {
            C1755i iVar = (C1755i) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f5867v.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.top;
            int a = m10460a(mo6842K(), mo6840I(), itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i + mo6844M() + mo6846O(), iVar.width, mo5845g());
            int a2 = m10460a(mo6843L(), mo6841J(), itemDecorInsetsForChild.bottom + i3 + i2 + mo6845N() + mo6847P(), iVar.height, mo5847h());
            if (mo6900b(view, a, a2, iVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public void mo6869a(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C1755i) view.getLayoutParams()).f5879e;
            view.layout(rect.left + i, rect.top + i2, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: a */
        public void mo6870a(View view, int i, C1755i iVar) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f5867v.mViewInfoStore.mo7341e(childViewHolderInt);
            } else {
                this.f5867v.mViewInfoStore.mo7342f(childViewHolderInt);
            }
            this.f5866u.mo6252a(view, i, iVar, childViewHolderInt.isRemoved());
        }

        /* renamed from: a */
        public void mo6871a(View view, Rect rect) {
            C1732az.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6872a(View view, C0949h hVar) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f5866u.mo6260c(childViewHolderInt.itemView)) {
                mo5789a(this.f5867v.mRecycler, this.f5867v.mState, view, hVar);
            }
        }

        /* renamed from: a */
        public void mo6873a(View view, C1762o oVar) {
            m10465a(oVar, this.f5866u.mo6256b(view), view);
        }

        /* renamed from: a */
        public void mo6874a(View view, boolean z, Rect rect) {
            Matrix x;
            if (z) {
                Rect rect2 = ((C1755i) view.getLayoutParams()).f5879e;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, rect2.bottom + view.getHeight());
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f5867v == null || (x = C1040ar.m5966x(view)) == null || x.isIdentity())) {
                RectF rectF = this.f5867v.mTempRectF;
                rectF.set(rect);
                x.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo5823a(AccessibilityEvent accessibilityEvent) {
            mo6864a(this.f5867v.mRecycler, this.f5867v.mState, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo6875a(Runnable runnable) {
            if (this.f5867v != null) {
                C1040ar.m5895a((View) this.f5867v, runnable);
            }
        }

        /* renamed from: a */
        public void mo5824a(String str) {
            if (this.f5867v != null) {
                this.f5867v.assertNotInLayoutOrScroll(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6876a(int i, Bundle bundle) {
            return mo6877a(this.f5867v.mRecycler, this.f5867v.mState, i, bundle);
        }

        /* renamed from: a */
        public boolean mo5797a(C1755i iVar) {
            return iVar != null;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
            r3 = r0;
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo6877a(android.support.p036v7.widget.C1732az.C1762o r7, android.support.p036v7.widget.C1732az.C1771u r8, int r9, android.os.Bundle r10) {
            /*
                r6 = this;
                r4 = -1
                r2 = 1
                r1 = 0
                android.support.v7.widget.az r0 = r6.f5867v
                if (r0 != 0) goto L_0x0008
            L_0x0007:
                return r1
            L_0x0008:
                switch(r9) {
                    case 4096: goto L_0x004a;
                    case 8192: goto L_0x0018;
                    default: goto L_0x000b;
                }
            L_0x000b:
                r0 = r1
                r3 = r1
            L_0x000d:
                if (r3 != 0) goto L_0x0011
                if (r0 == 0) goto L_0x0007
            L_0x0011:
                android.support.v7.widget.az r1 = r6.f5867v
                r1.scrollBy(r0, r3)
                r1 = r2
                goto L_0x0007
            L_0x0018:
                android.support.v7.widget.az r0 = r6.f5867v
                boolean r0 = android.support.p010v4.view.C1040ar.m5919b((android.view.View) r0, (int) r4)
                if (r0 == 0) goto L_0x007f
                int r0 = r6.mo6843L()
                int r3 = r6.mo6845N()
                int r0 = r0 - r3
                int r3 = r6.mo6847P()
                int r0 = r0 - r3
                int r0 = -r0
            L_0x002f:
                android.support.v7.widget.az r3 = r6.f5867v
                boolean r3 = android.support.p010v4.view.C1040ar.m5902a((android.view.View) r3, (int) r4)
                if (r3 == 0) goto L_0x007a
                int r3 = r6.mo6842K()
                int r4 = r6.mo6844M()
                int r3 = r3 - r4
                int r4 = r6.mo6846O()
                int r3 = r3 - r4
                int r3 = -r3
                r5 = r3
                r3 = r0
                r0 = r5
                goto L_0x000d
            L_0x004a:
                android.support.v7.widget.az r0 = r6.f5867v
                boolean r0 = android.support.p010v4.view.C1040ar.m5919b((android.view.View) r0, (int) r2)
                if (r0 == 0) goto L_0x007d
                int r0 = r6.mo6843L()
                int r3 = r6.mo6845N()
                int r0 = r0 - r3
                int r3 = r6.mo6847P()
                int r0 = r0 - r3
            L_0x0060:
                android.support.v7.widget.az r3 = r6.f5867v
                boolean r3 = android.support.p010v4.view.C1040ar.m5902a((android.view.View) r3, (int) r2)
                if (r3 == 0) goto L_0x007a
                int r3 = r6.mo6842K()
                int r4 = r6.mo6844M()
                int r3 = r3 - r4
                int r4 = r6.mo6846O()
                int r3 = r3 - r4
                r5 = r3
                r3 = r0
                r0 = r5
                goto L_0x000d
            L_0x007a:
                r3 = r0
                r0 = r1
                goto L_0x000d
            L_0x007d:
                r0 = r1
                goto L_0x0060
            L_0x007f:
                r0 = r1
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1732az.C1750h.mo6877a(android.support.v7.widget.az$o, android.support.v7.widget.az$u, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean mo6878a(C1762o oVar, C1771u uVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo6879a(C1732az azVar, C1771u uVar, View view, View view2) {
            return mo6882a(azVar, view, view2);
        }

        /* renamed from: a */
        public boolean mo6880a(C1732az azVar, View view, Rect rect, boolean z) {
            return mo6881a(azVar, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo6881a(C1732az azVar, View view, Rect rect, boolean z, boolean z2) {
            int[] b = m10469b(azVar, view, rect, z);
            int i = b[0];
            int i2 = b[1];
            if (z2 && !m10470d(azVar, i, i2)) {
                return false;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            if (z) {
                azVar.scrollBy(i, i2);
            } else {
                azVar.smoothScrollBy(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo6882a(C1732az azVar, View view, View view2) {
            return mo6835D() || azVar.isComputingLayout();
        }

        /* renamed from: a */
        public boolean mo6883a(C1732az azVar, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6884a(View view, int i, int i2, C1755i iVar) {
            return !this.f5860c || !m10468b(view.getMeasuredWidth(), i, iVar.width) || !m10468b(view.getMeasuredHeight(), i2, iVar.height);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6885a(View view, int i, Bundle bundle) {
            return mo6878a(this.f5867v.mRecycler, this.f5867v.mState, view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo6886a(@C0047z View view, boolean z, boolean z2) {
            boolean z3 = this.f5868w.mo7322a(view, 24579) && this.f5869x.mo7322a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: aa */
        public void mo6887aa() {
            this.f5871z = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ab */
        public boolean mo6888ab() {
            int H = mo6839H();
            for (int i = 0; i < H; i++) {
                ViewGroup.LayoutParams layoutParams = mo6928j(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public int mo5798b(int i, C1762o oVar, C1771u uVar) {
            return 0;
        }

        /* renamed from: b */
        public int mo5799b(C1762o oVar, C1771u uVar) {
            if (this.f5867v == null || this.f5867v.mAdapter == null || !mo5845g()) {
                return 1;
            }
            return this.f5867v.mAdapter.getItemCount();
        }

        /* renamed from: b */
        public void mo6889b(int i, C1762o oVar) {
            View j = mo6928j(i);
            mo6924h(i);
            oVar.mo6986a(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6890b(C1762o oVar) {
            int e = oVar.mo7004e();
            for (int i = e - 1; i >= 0; i--) {
                View e2 = oVar.mo7005e(i);
                C1774x childViewHolderInt = C1732az.getChildViewHolderInt(e2);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f5867v.removeDetachedView(e2, false);
                    }
                    if (this.f5867v.mItemAnimator != null) {
                        this.f5867v.mItemAnimator.mo6356d(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    oVar.mo6999c(e2);
                }
            }
            oVar.mo7007f();
            if (e > 0) {
                this.f5867v.invalidate();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6891b(C1732az azVar) {
            if (azVar == null) {
                this.f5867v = null;
                this.f5866u = null;
                this.f5864g = 0;
                this.f5865h = 0;
            } else {
                this.f5867v = azVar;
                this.f5866u = azVar.mChildHelper;
                this.f5864g = azVar.getWidth();
                this.f5865h = azVar.getHeight();
            }
            this.f5862e = 1073741824;
            this.f5863f = 1073741824;
        }

        /* renamed from: b */
        public void mo5801b(C1732az azVar, int i, int i2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6892b(C1732az azVar, C1762o oVar) {
            this.f5854A = false;
            mo5820a(azVar, oVar);
        }

        /* renamed from: b */
        public void mo6893b(View view) {
            mo6867a(view, -1);
        }

        /* renamed from: b */
        public void mo6894b(View view, int i) {
            m10466a(view, i, false);
        }

        /* renamed from: b */
        public void mo6895b(View view, int i, int i2) {
            C1755i iVar = (C1755i) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f5867v.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.top;
            int a = m10460a(mo6842K(), mo6840I(), itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i + mo6844M() + mo6846O() + iVar.leftMargin + iVar.rightMargin, iVar.width, mo5845g());
            int a2 = m10460a(mo6843L(), mo6841J(), itemDecorInsetsForChild.bottom + i3 + i2 + mo6845N() + mo6847P() + iVar.topMargin + iVar.bottomMargin, iVar.height, mo5847h());
            if (mo6900b(view, a, a2, iVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: b */
        public void mo6896b(View view, int i, int i2, int i3, int i4) {
            C1755i iVar = (C1755i) view.getLayoutParams();
            Rect rect = iVar.f5879e;
            view.layout(rect.left + i + iVar.leftMargin, rect.top + i2 + iVar.topMargin, (i3 - rect.right) - iVar.rightMargin, (i4 - rect.bottom) - iVar.bottomMargin);
        }

        /* renamed from: b */
        public void mo6897b(View view, Rect rect) {
            if (this.f5867v == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(this.f5867v.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: b */
        public void mo6898b(View view, C1762o oVar) {
            mo6911d(view);
            oVar.mo6986a(view);
        }

        /* renamed from: b */
        public void mo6899b(String str) {
            if (this.f5867v != null) {
                this.f5867v.assertInLayoutOrScroll(str);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6900b(View view, int i, int i2, C1755i iVar) {
            return view.isLayoutRequested() || !this.f5860c || !m10468b(view.getWidth(), i, iVar.width) || !m10468b(view.getHeight(), i2, iVar.height);
        }

        /* renamed from: b */
        public boolean mo6901b(Runnable runnable) {
            if (this.f5867v != null) {
                return this.f5867v.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: c */
        public int mo5830c(C1771u uVar) {
            return 0;
        }

        /* renamed from: c */
        public View mo5831c(int i) {
            int H = mo6839H();
            for (int i2 = 0; i2 < H; i2++) {
                View j = mo6928j(i2);
                C1774x childViewHolderInt = C1732az.getChildViewHolderInt(j);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f5867v.mState.mo7050c() || !childViewHolderInt.isRemoved())) {
                    return j;
                }
            }
            return null;
        }

        /* renamed from: c */
        public void mo6902c(C1762o oVar) {
            for (int H = mo6839H() - 1; H >= 0; H--) {
                if (!C1732az.getChildViewHolderInt(mo6928j(H)).shouldIgnore()) {
                    mo6889b(H, oVar);
                }
            }
        }

        /* renamed from: c */
        public void mo5803c(C1762o oVar, C1771u uVar) {
            Log.e(C1732az.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6903c(C1732az azVar) {
            this.f5854A = true;
            mo6910d(azVar);
        }

        /* renamed from: c */
        public void mo6904c(C1732az azVar, int i, int i2) {
        }

        /* renamed from: c */
        public void mo6905c(View view) {
            mo6894b(view, -1);
        }

        /* renamed from: c */
        public void mo6906c(View view, int i) {
            mo6870a(view, i, (C1755i) view.getLayoutParams());
        }

        /* renamed from: d */
        public int mo6907d(C1762o oVar, C1771u uVar) {
            return 0;
        }

        /* renamed from: d */
        public int mo5834d(C1771u uVar) {
            return 0;
        }

        /* renamed from: d */
        public View mo6908d(View view, int i) {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6909d(int i, int i2) {
            this.f5864g = View.MeasureSpec.getSize(i);
            this.f5862e = View.MeasureSpec.getMode(i);
            if (this.f5862e == 0 && !C1732az.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f5864g = 0;
            }
            this.f5865h = View.MeasureSpec.getSize(i2);
            this.f5863f = View.MeasureSpec.getMode(i2);
            if (this.f5863f == 0 && !C1732az.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f5865h = 0;
            }
        }

        @C0030i
        /* renamed from: d */
        public void mo6910d(C1732az azVar) {
        }

        /* renamed from: d */
        public void mo6911d(View view) {
            this.f5866u.mo6251a(view);
        }

        /* renamed from: d */
        public boolean mo5804d() {
            return false;
        }

        /* renamed from: e */
        public int mo5837e(C1771u uVar) {
            return 0;
        }

        /* renamed from: e */
        public int mo6912e(View view) {
            return ((C1755i) view.getLayoutParams()).mo6956h();
        }

        /* renamed from: e */
        public void mo5838e(int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6913e(int i, int i2) {
            int i3 = ActivityChooserView.C1593a.f5166a;
            int i4 = Integer.MIN_VALUE;
            int H = mo6839H();
            if (H == 0) {
                this.f5867v.defaultOnMeasure(i, i2);
                return;
            }
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < H; i7++) {
                View j = mo6928j(i7);
                Rect rect = this.f5867v.mTempRect;
                mo6871a(j, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i5) {
                    i5 = rect.right;
                }
                if (rect.top < i3) {
                    i3 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.f5867v.mTempRect.set(i6, i3, i5, i4);
            mo5785a(this.f5867v.mTempRect, i, i2);
        }

        @Deprecated
        /* renamed from: e */
        public void mo6914e(C1732az azVar) {
        }

        /* renamed from: e */
        public void mo6915e(boolean z) {
            this.f5855B = z;
        }

        /* renamed from: e */
        public boolean mo6916e(C1762o oVar, C1771u uVar) {
            return false;
        }

        /* renamed from: f */
        public int mo5840f(C1771u uVar) {
            return 0;
        }

        /* renamed from: f */
        public int mo6917f(View view) {
            return C1732az.getChildViewHolderInt(view).getItemViewType();
        }

        /* renamed from: f */
        public Parcelable mo5841f() {
            return null;
        }

        /* renamed from: f */
        public void mo6918f(int i, int i2) {
            View j = mo6928j(i);
            if (j == null) {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i);
            }
            mo6926i(i);
            mo6906c(j, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6919f(C1732az azVar) {
            mo6909d(View.MeasureSpec.makeMeasureSpec(azVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(azVar.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public final void mo6920f(boolean z) {
            if (z != this.f5861d) {
                this.f5861d = z;
                this.f5856C = 0;
                if (this.f5867v != null) {
                    this.f5867v.mRecycler.mo6991b();
                }
            }
        }

        /* renamed from: g */
        public int mo5844g(C1771u uVar) {
            return 0;
        }

        @C0003aa
        /* renamed from: g */
        public View mo6921g(View view) {
            View findContainingItemView;
            if (this.f5867v == null || (findContainingItemView = this.f5867v.findContainingItemView(view)) == null || this.f5866u.mo6260c(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        /* renamed from: g */
        public void mo6922g(int i, int i2) {
            this.f5867v.setMeasuredDimension(i, i2);
        }

        /* renamed from: g */
        public void mo6923g(boolean z) {
            this.f5860c = z;
        }

        /* renamed from: g */
        public boolean mo5845g() {
            return false;
        }

        /* renamed from: h */
        public int mo5846h(C1771u uVar) {
            return 0;
        }

        /* renamed from: h */
        public void mo6924h(int i) {
            if (mo6928j(i) != null) {
                this.f5866u.mo6250a(i);
            }
        }

        /* renamed from: h */
        public void mo6925h(View view) {
            int b = this.f5866u.mo6256b(view);
            if (b >= 0) {
                m10463a(b, view);
            }
        }

        /* renamed from: h */
        public boolean mo5847h() {
            return false;
        }

        /* renamed from: i */
        public void mo6926i(int i) {
            m10463a(i, mo6928j(i));
        }

        /* renamed from: i */
        public void mo6927i(View view) {
            mo6906c(view, -1);
        }

        /* renamed from: j */
        public View mo6928j(int i) {
            if (this.f5866u != null) {
                return this.f5866u.mo6257b(i);
            }
            return null;
        }

        /* renamed from: j */
        public void mo6929j(View view) {
            this.f5867v.removeDetachedView(view, false);
        }

        /* renamed from: k */
        public void mo5994k(int i) {
            if (this.f5867v != null) {
                this.f5867v.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: k */
        public void mo6930k(View view) {
            if (view.getParent() != this.f5867v || this.f5867v.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored");
            }
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.f5867v.mViewInfoStore.mo7343g(childViewHolderInt);
        }

        /* renamed from: l */
        public void mo5996l(int i) {
            if (this.f5867v != null) {
                this.f5867v.offsetChildrenVertical(i);
            }
        }

        /* renamed from: l */
        public void mo6931l(View view) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        /* renamed from: m */
        public int mo6932m(View view) {
            Rect rect = ((C1755i) view.getLayoutParams()).f5879e;
            return rect.right + view.getMeasuredWidth() + rect.left;
        }

        /* renamed from: m */
        public void mo5999m(int i) {
        }

        /* renamed from: n */
        public int mo6933n(View view) {
            Rect rect = ((C1755i) view.getLayoutParams()).f5879e;
            return rect.bottom + view.getMeasuredHeight() + rect.top;
        }

        /* renamed from: o */
        public int mo6934o(View view) {
            return view.getLeft() - mo6940u(view);
        }

        /* renamed from: p */
        public int mo6935p(View view) {
            return view.getTop() - mo6938s(view);
        }

        /* renamed from: q */
        public int mo6936q(View view) {
            return view.getRight() + mo6941v(view);
        }

        /* renamed from: r */
        public int mo6937r(View view) {
            return view.getBottom() + mo6939t(view);
        }

        /* renamed from: s */
        public int mo6938s(View view) {
            return ((C1755i) view.getLayoutParams()).f5879e.top;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public boolean mo5858s() {
            return false;
        }

        /* renamed from: t */
        public int mo6939t(View view) {
            return ((C1755i) view.getLayoutParams()).f5879e.bottom;
        }

        /* renamed from: u */
        public int mo6940u(View view) {
            return ((C1755i) view.getLayoutParams()).f5879e.left;
        }

        /* renamed from: v */
        public int mo6941v(View view) {
            return ((C1755i) view.getLayoutParams()).f5879e.right;
        }

        /* renamed from: y */
        public void mo6942y() {
            if (this.f5867v != null) {
                this.f5867v.requestLayout();
            }
        }

        /* renamed from: z */
        public boolean mo6943z() {
            return this.f5855B;
        }
    }

    /* renamed from: android.support.v7.widget.az$i */
    public static class C1755i extends ViewGroup.MarginLayoutParams {

        /* renamed from: d */
        C1774x f5878d;

        /* renamed from: e */
        final Rect f5879e = new Rect();

        /* renamed from: f */
        boolean f5880f = true;

        /* renamed from: g */
        boolean f5881g = false;

        public C1755i(int i, int i2) {
            super(i, i2);
        }

        public C1755i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1755i(C1755i iVar) {
            super(iVar);
        }

        public C1755i(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1755i(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: c */
        public boolean mo6951c() {
            return this.f5878d.needsUpdate();
        }

        /* renamed from: d */
        public boolean mo6952d() {
            return this.f5878d.isInvalid();
        }

        /* renamed from: e */
        public boolean mo6953e() {
            return this.f5878d.isRemoved();
        }

        /* renamed from: f */
        public boolean mo6954f() {
            return this.f5878d.isUpdated();
        }

        @Deprecated
        /* renamed from: g */
        public int mo6955g() {
            return this.f5878d.getPosition();
        }

        /* renamed from: h */
        public int mo6956h() {
            return this.f5878d.getLayoutPosition();
        }

        /* renamed from: i */
        public int mo6957i() {
            return this.f5878d.getAdapterPosition();
        }
    }

    /* renamed from: android.support.v7.widget.az$j */
    public interface C1756j {
        /* renamed from: a */
        void mo6182a(View view);

        /* renamed from: b */
        void mo6187b(View view);
    }

    /* renamed from: android.support.v7.widget.az$k */
    public static abstract class C1757k {
        /* renamed from: a */
        public abstract boolean mo6958a(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.az$l */
    public interface C1758l {
        boolean onInterceptTouchEvent(C1732az azVar, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(C1732az azVar, MotionEvent motionEvent);
    }

    /* renamed from: android.support.v7.widget.az$m */
    public static abstract class C1759m {
        public void onScrollStateChanged(C1732az azVar, int i) {
        }

        public void onScrolled(C1732az azVar, int i, int i2) {
        }
    }

    /* renamed from: android.support.v7.widget.az$n */
    public static class C1760n {

        /* renamed from: b */
        private static final int f5882b = 5;

        /* renamed from: a */
        SparseArray<C1761a> f5883a = new SparseArray<>();

        /* renamed from: c */
        private int f5884c = 0;

        /* renamed from: android.support.v7.widget.az$n$a */
        static class C1761a {

            /* renamed from: a */
            ArrayList<C1774x> f5885a = new ArrayList<>();

            /* renamed from: b */
            int f5886b = 5;

            /* renamed from: c */
            long f5887c = 0;

            /* renamed from: d */
            long f5888d = 0;

            C1761a() {
            }
        }

        /* renamed from: c */
        private C1761a m10649c(int i) {
            C1761a aVar = this.f5883a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1761a aVar2 = new C1761a();
            this.f5883a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: a */
        public int mo6961a(int i) {
            return m10649c(i).f5885a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo6962a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public void mo6963a() {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f5883a.size()) {
                    this.f5883a.valueAt(i2).f5885a.clear();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo6964a(int i, int i2) {
            C1761a c = m10649c(i);
            c.f5886b = i2;
            ArrayList<C1774x> arrayList = c.f5885a;
            if (arrayList != null) {
                while (arrayList.size() > i2) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6965a(int i, long j) {
            C1761a c = m10649c(i);
            c.f5887c = mo6962a(c.f5887c, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6966a(C1739a aVar) {
            this.f5884c++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6967a(C1739a aVar, C1739a aVar2, boolean z) {
            if (aVar != null) {
                mo6974c();
            }
            if (!z && this.f5884c == 0) {
                mo6963a();
            }
            if (aVar2 != null) {
                mo6966a(aVar2);
            }
        }

        /* renamed from: a */
        public void mo6968a(C1774x xVar) {
            int itemViewType = xVar.getItemViewType();
            ArrayList<C1774x> arrayList = m10649c(itemViewType).f5885a;
            if (this.f5883a.get(itemViewType).f5886b > arrayList.size()) {
                xVar.resetInternal();
                arrayList.add(xVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6969a(int i, long j, long j2) {
            long j3 = m10649c(i).f5887c;
            return j3 == 0 || j3 + j < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6970b() {
            int i = 0;
            for (int i2 = 0; i2 < this.f5883a.size(); i2++) {
                ArrayList<C1774x> arrayList = this.f5883a.valueAt(i2).f5885a;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        /* renamed from: b */
        public C1774x mo6971b(int i) {
            C1761a aVar = this.f5883a.get(i);
            if (aVar == null || aVar.f5885a.isEmpty()) {
                return null;
            }
            ArrayList<C1774x> arrayList = aVar.f5885a;
            return arrayList.remove(arrayList.size() - 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6972b(int i, long j) {
            C1761a c = m10649c(i);
            c.f5888d = mo6962a(c.f5888d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6973b(int i, long j, long j2) {
            long j3 = m10649c(i).f5888d;
            return j3 == 0 || j3 + j < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6974c() {
            this.f5884c--;
        }
    }

    /* renamed from: android.support.v7.widget.az$o */
    public final class C1762o {

        /* renamed from: f */
        static final int f5889f = 2;

        /* renamed from: a */
        final ArrayList<C1774x> f5890a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C1774x> f5891b = null;

        /* renamed from: c */
        final ArrayList<C1774x> f5892c = new ArrayList<>();

        /* renamed from: d */
        int f5893d = 2;

        /* renamed from: e */
        C1760n f5894e;

        /* renamed from: h */
        private final List<C1774x> f5896h = Collections.unmodifiableList(this.f5890a);

        /* renamed from: i */
        private int f5897i = 2;

        /* renamed from: j */
        private C1772v f5898j;

        public C1762o() {
        }

        /* renamed from: a */
        private void m10664a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m10664a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        private boolean m10665a(C1774x xVar, int i, int i2, long j) {
            xVar.mOwnerRecyclerView = C1732az.this;
            int itemViewType = xVar.getItemViewType();
            long nanoTime = C1732az.this.getNanoTime();
            if (j != C1732az.FOREVER_NS && !this.f5894e.mo6973b(itemViewType, nanoTime, j)) {
                return false;
            }
            C1732az.this.mAdapter.bindViewHolder(xVar, i);
            this.f5894e.mo6972b(xVar.getItemViewType(), C1732az.this.getNanoTime() - nanoTime);
            m10667e(xVar.itemView);
            if (C1732az.this.mState.mo7050c()) {
                xVar.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* renamed from: e */
        private void m10666e(C1774x xVar) {
            if (xVar.itemView instanceof ViewGroup) {
                m10664a((ViewGroup) xVar.itemView, false);
            }
        }

        /* renamed from: e */
        private void m10667e(View view) {
            if (C1732az.this.isAccessibilityEnabled()) {
                if (C1040ar.m5928e(view) == 0) {
                    C1040ar.m5926d(view, 1);
                }
                if (!C1040ar.m5918b(view)) {
                    C1040ar.m5893a(view, C1732az.this.mAccessibilityDelegate.mo7108c());
                }
            }
        }

        /* access modifiers changed from: package-private */
        @C0003aa
        /* renamed from: a */
        public C1774x mo6975a(int i, boolean z, long j) {
            C1774x xVar;
            boolean z2;
            C1774x xVar2;
            boolean z3;
            boolean a;
            C1755i iVar;
            boolean z4;
            C1732az findNestedRecyclerView;
            View a2;
            boolean z5 = true;
            if (i < 0 || i >= C1732az.this.mState.mo7056i()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + C1732az.this.mState.mo7056i());
            }
            if (C1732az.this.mState.mo7050c()) {
                C1774x f = mo7006f(i);
                z2 = f != null;
                xVar = f;
            } else {
                xVar = null;
                z2 = false;
            }
            if (xVar == null && (xVar = mo6990b(i, z)) != null) {
                if (!mo6988a(xVar)) {
                    if (!z) {
                        xVar.addFlags(4);
                        if (xVar.isScrap()) {
                            C1732az.this.removeDetachedView(xVar.itemView, false);
                            xVar.unScrap();
                        } else if (xVar.wasReturnedFromScrap()) {
                            xVar.clearReturnedFromScrapFlag();
                        }
                        mo6993b(xVar);
                    }
                    xVar = null;
                } else {
                    z2 = true;
                }
            }
            if (xVar == null) {
                int b = C1732az.this.mAdapterHelper.mo7402b(i);
                if (b < 0 || b >= C1732az.this.mAdapter.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ")." + "state:" + C1732az.this.mState.mo7056i());
                }
                int itemViewType = C1732az.this.mAdapter.getItemViewType(b);
                if (!C1732az.this.mAdapter.hasStableIds() || (xVar = mo6976a(C1732az.this.mAdapter.getItemId(b), itemViewType, z)) == null) {
                    z4 = z2;
                } else {
                    xVar.mPosition = b;
                    z4 = true;
                }
                if (!(xVar != null || this.f5898j == null || (a2 = this.f5898j.mo7058a(this, i, itemViewType)) == null)) {
                    xVar = C1732az.this.getChildViewHolder(a2);
                    if (xVar == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                    } else if (xVar.shouldIgnore()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                    }
                }
                if (xVar == null && (xVar = mo7008g().mo6971b(itemViewType)) != null) {
                    xVar.resetInternal();
                    if (C1732az.FORCE_INVALIDATE_DISPLAY_LIST) {
                        m10666e(xVar);
                    }
                }
                if (xVar == null) {
                    long nanoTime = C1732az.this.getNanoTime();
                    if (j != C1732az.FOREVER_NS && !this.f5894e.mo6969a(itemViewType, nanoTime, j)) {
                        return null;
                    }
                    xVar = C1732az.this.mAdapter.createViewHolder(C1732az.this, itemViewType);
                    if (C1732az.ALLOW_THREAD_GAP_WORK && (findNestedRecyclerView = C1732az.findNestedRecyclerView(xVar.itemView)) != null) {
                        xVar.mNestedRecyclerView = new WeakReference<>(findNestedRecyclerView);
                    }
                    this.f5894e.mo6965a(itemViewType, C1732az.this.getNanoTime() - nanoTime);
                }
                xVar2 = xVar;
                z3 = z4;
            } else {
                xVar2 = xVar;
                z3 = z2;
            }
            if (z3 && !C1732az.this.mState.mo7050c() && xVar2.hasAnyOfTheFlags(8192)) {
                xVar2.setFlags(0, 8192);
                if (C1732az.this.mState.f5927l) {
                    C1732az.this.recordAnimationInfoIfBouncedHiddenView(xVar2, C1732az.this.mItemAnimator.mo6803a(C1732az.this.mState, xVar2, C1743e.m10425e(xVar2) | 4096, xVar2.getUnmodifiedPayloads()));
                }
            }
            if (!C1732az.this.mState.mo7050c() || !xVar2.isBound()) {
                a = (!xVar2.isBound() || xVar2.needsUpdate() || xVar2.isInvalid()) ? m10665a(xVar2, C1732az.this.mAdapterHelper.mo7402b(i), i, j) : false;
            } else {
                xVar2.mPreLayoutPosition = i;
                a = false;
            }
            ViewGroup.LayoutParams layoutParams = xVar2.itemView.getLayoutParams();
            if (layoutParams == null) {
                iVar = (C1755i) C1732az.this.generateDefaultLayoutParams();
                xVar2.itemView.setLayoutParams(iVar);
            } else if (!C1732az.this.checkLayoutParams(layoutParams)) {
                iVar = (C1755i) C1732az.this.generateLayoutParams(layoutParams);
                xVar2.itemView.setLayoutParams(iVar);
            } else {
                iVar = (C1755i) layoutParams;
            }
            iVar.f5878d = xVar2;
            if (!z3 || !a) {
                z5 = false;
            }
            iVar.f5881g = z5;
            return xVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1774x mo6976a(long j, int i, boolean z) {
            for (int size = this.f5890a.size() - 1; size >= 0; size--) {
                C1774x xVar = this.f5890a.get(size);
                if (xVar.getItemId() == j && !xVar.wasReturnedFromScrap()) {
                    if (i == xVar.getItemViewType()) {
                        xVar.addFlags(32);
                        if (!xVar.isRemoved() || C1732az.this.mState.mo7050c()) {
                            return xVar;
                        }
                        xVar.setFlags(2, 14);
                        return xVar;
                    } else if (!z) {
                        this.f5890a.remove(size);
                        C1732az.this.removeDetachedView(xVar.itemView, false);
                        mo6999c(xVar.itemView);
                    }
                }
            }
            for (int size2 = this.f5892c.size() - 1; size2 >= 0; size2--) {
                C1774x xVar2 = this.f5892c.get(size2);
                if (xVar2.getItemId() == j) {
                    if (i == xVar2.getItemViewType()) {
                        if (z) {
                            return xVar2;
                        }
                        this.f5892c.remove(size2);
                        return xVar2;
                    } else if (!z) {
                        mo7001d(size2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo6977a(int i, boolean z) {
            return mo6975a(i, z, (long) C1732az.FOREVER_NS).itemView;
        }

        /* renamed from: a */
        public void mo6978a() {
            this.f5890a.clear();
            mo7000d();
        }

        /* renamed from: a */
        public void mo6979a(int i) {
            this.f5897i = i;
            mo6991b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6980a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i3 = -1;
                i4 = i2;
                i5 = i;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f5892c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C1774x xVar = this.f5892c.get(i6);
                if (xVar != null && xVar.mPosition >= i5 && xVar.mPosition <= i4) {
                    if (xVar.mPosition == i) {
                        xVar.offsetPosition(i2 - i, false);
                    } else {
                        xVar.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6981a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f5892c.size() - 1; size >= 0; size--) {
                C1774x xVar = this.f5892c.get(size);
                if (xVar != null) {
                    if (xVar.mPosition >= i3) {
                        xVar.offsetPosition(-i2, z);
                    } else if (xVar.mPosition >= i) {
                        xVar.addFlags(8);
                        mo7001d(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6982a(C1739a aVar, C1739a aVar2, boolean z) {
            mo6978a();
            mo7008g().mo6967a(aVar, aVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6983a(C1760n nVar) {
            if (this.f5894e != null) {
                this.f5894e.mo6974c();
            }
            this.f5894e = nVar;
            if (nVar != null) {
                this.f5894e.mo6966a(C1732az.this.getAdapter());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6984a(C1772v vVar) {
            this.f5898j = vVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6985a(C1774x xVar, boolean z) {
            C1732az.clearNestedRecyclerViewIfNotNested(xVar);
            C1040ar.m5893a(xVar.itemView, (C1066b) null);
            if (z) {
                mo7002d(xVar);
            }
            xVar.mOwnerRecyclerView = null;
            mo7008g().mo6968a(xVar);
        }

        /* renamed from: a */
        public void mo6986a(View view) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                C1732az.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            mo6993b(childViewHolderInt);
        }

        /* renamed from: a */
        public void mo6987a(View view, int i) {
            C1755i iVar;
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
            }
            int b = C1732az.this.mAdapterHelper.mo7402b(i);
            if (b < 0 || b >= C1732az.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b + ")." + "state:" + C1732az.this.mState.mo7056i());
            }
            m10665a(childViewHolderInt, b, i, C1732az.FOREVER_NS);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                iVar = (C1755i) C1732az.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(iVar);
            } else if (!C1732az.this.checkLayoutParams(layoutParams)) {
                iVar = (C1755i) C1732az.this.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(iVar);
            } else {
                iVar = (C1755i) layoutParams;
            }
            iVar.f5880f = true;
            iVar.f5878d = childViewHolderInt;
            iVar.f5881g = childViewHolderInt.itemView.getParent() == null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6988a(C1774x xVar) {
            if (xVar.isRemoved()) {
                return C1732az.this.mState.mo7050c();
            }
            if (xVar.mPosition < 0 || xVar.mPosition >= C1732az.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + xVar);
            } else if (C1732az.this.mState.mo7050c() || C1732az.this.mAdapter.getItemViewType(xVar.mPosition) == xVar.getItemViewType()) {
                return !C1732az.this.mAdapter.hasStableIds() || xVar.getItemId() == C1732az.this.mAdapter.getItemId(xVar.mPosition);
            } else {
                return false;
            }
        }

        /* renamed from: b */
        public int mo6989b(int i) {
            if (i >= 0 && i < C1732az.this.mState.mo7056i()) {
                return !C1732az.this.mState.mo7050c() ? i : C1732az.this.mAdapterHelper.mo7402b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State " + "item count is " + C1732az.this.mState.mo7056i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1774x mo6990b(int i, boolean z) {
            View c;
            int i2 = 0;
            int size = this.f5890a.size();
            int i3 = 0;
            while (i3 < size) {
                C1774x xVar = this.f5890a.get(i3);
                if (xVar.wasReturnedFromScrap() || xVar.getLayoutPosition() != i || xVar.isInvalid() || (!C1732az.this.mState.f5924i && xVar.isRemoved())) {
                    i3++;
                } else {
                    xVar.addFlags(32);
                    return xVar;
                }
            }
            if (z || (c = C1732az.this.mChildHelper.mo6259c(i)) == null) {
                int size2 = this.f5892c.size();
                while (i2 < size2) {
                    C1774x xVar2 = this.f5892c.get(i2);
                    if (xVar2.isInvalid() || xVar2.getLayoutPosition() != i) {
                        i2++;
                    } else if (z) {
                        return xVar2;
                    } else {
                        this.f5892c.remove(i2);
                        return xVar2;
                    }
                }
                return null;
            }
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(c);
            C1732az.this.mChildHelper.mo6264e(c);
            int b = C1732az.this.mChildHelper.mo6256b(c);
            if (b == -1) {
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt);
            }
            C1732az.this.mChildHelper.mo6263e(b);
            mo7003d(c);
            childViewHolderInt.addFlags(8224);
            return childViewHolderInt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6991b() {
            this.f5893d = (C1732az.this.mLayout != null ? C1732az.this.mLayout.f5856C : 0) + this.f5897i;
            for (int size = this.f5892c.size() - 1; size >= 0 && this.f5892c.size() > this.f5893d; size--) {
                mo7001d(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6992b(int i, int i2) {
            int size = this.f5892c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1774x xVar = this.f5892c.get(i3);
                if (xVar != null && xVar.mPosition >= i) {
                    xVar.offsetPosition(i2, true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6993b(C1774x xVar) {
            boolean z;
            boolean z2 = false;
            if (xVar.isScrap() || xVar.itemView.getParent() != null) {
                throw new IllegalArgumentException("Scrapped or attached views may not be recycled. isScrap:" + xVar.isScrap() + " isAttached:" + (xVar.itemView.getParent() != null));
            } else if (xVar.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + xVar);
            } else if (xVar.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            } else {
                boolean access$700 = xVar.doesTransientStatePreventRecycling();
                if ((C1732az.this.mAdapter != null && access$700 && C1732az.this.mAdapter.onFailedToRecycleView(xVar)) || xVar.isRecyclable()) {
                    if (this.f5893d <= 0 || xVar.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f5892c.size();
                        if (size >= this.f5893d && size > 0) {
                            mo7001d(0);
                            size--;
                        }
                        if (C1732az.ALLOW_THREAD_GAP_WORK && size > 0 && !C1732az.this.mPrefetchRegistry.mo6387a(xVar.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!C1732az.this.mPrefetchRegistry.mo6387a(this.f5892c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f5892c.add(size, xVar);
                        z = true;
                    }
                    if (!z) {
                        mo6985a(xVar, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                C1732az.this.mViewInfoStore.mo7343g(xVar);
                if (!z && !z2 && access$700) {
                    xVar.mOwnerRecyclerView = null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6994b(View view) {
            mo6993b(C1732az.getChildViewHolderInt(view));
        }

        /* renamed from: c */
        public View mo6995c(int i) {
            return mo6977a(i, false);
        }

        /* renamed from: c */
        public List<C1774x> mo6996c() {
            return this.f5896h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6997c(int i, int i2) {
            int i3;
            int i4 = i + i2;
            for (int size = this.f5892c.size() - 1; size >= 0; size--) {
                C1774x xVar = this.f5892c.get(size);
                if (xVar != null && (i3 = xVar.mPosition) >= i && i3 < i4) {
                    xVar.addFlags(2);
                    mo7001d(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6998c(C1774x xVar) {
            if (xVar.mInChangeScrap) {
                this.f5891b.remove(xVar);
            } else {
                this.f5890a.remove(xVar);
            }
            C1762o unused = xVar.mScrapContainer = null;
            boolean unused2 = xVar.mInChangeScrap = false;
            xVar.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6999c(View view) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            C1762o unused = childViewHolderInt.mScrapContainer = null;
            boolean unused2 = childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            mo6993b(childViewHolderInt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7000d() {
            for (int size = this.f5892c.size() - 1; size >= 0; size--) {
                mo7001d(size);
            }
            this.f5892c.clear();
            if (C1732az.ALLOW_THREAD_GAP_WORK) {
                C1732az.this.mPrefetchRegistry.mo6384a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7001d(int i) {
            mo6985a(this.f5892c.get(i), true);
            this.f5892c.remove(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7002d(C1774x xVar) {
            if (C1732az.this.mRecyclerListener != null) {
                C1732az.this.mRecyclerListener.mo7013a(xVar);
            }
            if (C1732az.this.mAdapter != null) {
                C1732az.this.mAdapter.onViewRecycled(xVar);
            }
            if (C1732az.this.mState != null) {
                C1732az.this.mViewInfoStore.mo7343g(xVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7003d(View view) {
            C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !C1732az.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f5891b == null) {
                    this.f5891b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f5891b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || C1732az.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f5890a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo7004e() {
            return this.f5890a.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public View mo7005e(int i) {
            return this.f5890a.get(i).itemView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1774x mo7006f(int i) {
            int size;
            int b;
            int i2 = 0;
            if (this.f5891b == null || (size = this.f5891b.size()) == 0) {
                return null;
            }
            int i3 = 0;
            while (i3 < size) {
                C1774x xVar = this.f5891b.get(i3);
                if (xVar.wasReturnedFromScrap() || xVar.getLayoutPosition() != i) {
                    i3++;
                } else {
                    xVar.addFlags(32);
                    return xVar;
                }
            }
            if (C1732az.this.mAdapter.hasStableIds() && (b = C1732az.this.mAdapterHelper.mo7402b(i)) > 0 && b < C1732az.this.mAdapter.getItemCount()) {
                long itemId = C1732az.this.mAdapter.getItemId(b);
                while (i2 < size) {
                    C1774x xVar2 = this.f5891b.get(i2);
                    if (xVar2.wasReturnedFromScrap() || xVar2.getItemId() != itemId) {
                        i2++;
                    } else {
                        xVar2.addFlags(32);
                        return xVar2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo7007f() {
            this.f5890a.clear();
            if (this.f5891b != null) {
                this.f5891b.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C1760n mo7008g() {
            if (this.f5894e == null) {
                this.f5894e = new C1760n();
            }
            return this.f5894e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo7009h() {
            int size = this.f5892c.size();
            for (int i = 0; i < size; i++) {
                C1774x xVar = this.f5892c.get(i);
                if (xVar != null) {
                    xVar.addFlags(512);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo7010i() {
            if (C1732az.this.mAdapter == null || !C1732az.this.mAdapter.hasStableIds()) {
                mo7000d();
                return;
            }
            int size = this.f5892c.size();
            for (int i = 0; i < size; i++) {
                C1774x xVar = this.f5892c.get(i);
                if (xVar != null) {
                    xVar.addFlags(6);
                    xVar.addChangePayload((Object) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo7011j() {
            int size = this.f5892c.size();
            for (int i = 0; i < size; i++) {
                this.f5892c.get(i).clearOldPosition();
            }
            int size2 = this.f5890a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f5890a.get(i2).clearOldPosition();
            }
            if (this.f5891b != null) {
                int size3 = this.f5891b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f5891b.get(i3).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo7012k() {
            int size = this.f5892c.size();
            for (int i = 0; i < size; i++) {
                C1755i iVar = (C1755i) this.f5892c.get(i).itemView.getLayoutParams();
                if (iVar != null) {
                    iVar.f5880f = true;
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.az$p */
    public interface C1763p {
        /* renamed from: a */
        void mo7013a(C1774x xVar);
    }

    /* renamed from: android.support.v7.widget.az$q */
    private class C1764q extends C1741c {
        C1764q() {
        }

        /* renamed from: a */
        public void mo6796a() {
            C1732az.this.assertNotInLayoutOrScroll((String) null);
            C1732az.this.mState.f5923h = true;
            C1732az.this.setDataSetChangedAfterLayout();
            if (!C1732az.this.mAdapterHelper.mo7408d()) {
                C1732az.this.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo6798a(int i, int i2, int i3) {
            C1732az.this.assertNotInLayoutOrScroll((String) null);
            if (C1732az.this.mAdapterHelper.mo7400a(i, i2, i3)) {
                mo7014b();
            }
        }

        /* renamed from: a */
        public void mo6799a(int i, int i2, Object obj) {
            C1732az.this.assertNotInLayoutOrScroll((String) null);
            if (C1732az.this.mAdapterHelper.mo7401a(i, i2, obj)) {
                mo7014b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7014b() {
            if (!C1732az.POST_UPDATES_ON_ANIMATION || !C1732az.this.mHasFixedSize || !C1732az.this.mIsAttached) {
                C1732az.this.mAdapterUpdateDuringMeasure = true;
                C1732az.this.requestLayout();
                return;
            }
            C1040ar.m5895a((View) C1732az.this, C1732az.this.mUpdateChildViewsRunnable);
        }

        /* renamed from: b */
        public void mo6800b(int i, int i2) {
            C1732az.this.assertNotInLayoutOrScroll((String) null);
            if (C1732az.this.mAdapterHelper.mo7404b(i, i2)) {
                mo7014b();
            }
        }

        /* renamed from: c */
        public void mo6801c(int i, int i2) {
            C1732az.this.assertNotInLayoutOrScroll((String) null);
            if (C1732az.this.mAdapterHelper.mo7407c(i, i2)) {
                mo7014b();
            }
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.az$r */
    public static class C1765r extends C0919a {
        public static final Parcelable.Creator<C1765r> CREATOR = C0808j.m4090a(new C0810k<C1765r>() {
            /* renamed from: b */
            public C1765r mo2679a(Parcel parcel, ClassLoader classLoader) {
                return new C1765r(parcel, classLoader);
            }

            /* renamed from: b */
            public C1765r[] mo2680a(int i) {
                return new C1765r[i];
            }
        });

        /* renamed from: b */
        Parcelable f5900b;

        C1765r(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5900b = parcel.readParcelable(classLoader == null ? C1750h.class.getClassLoader() : classLoader);
        }

        C1765r(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7015a(C1765r rVar) {
            this.f5900b = rVar.f5900b;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f5900b, 0);
        }
    }

    /* renamed from: android.support.v7.widget.az$s */
    public static class C1767s implements C1758l {
        public boolean onInterceptTouchEvent(C1732az azVar, MotionEvent motionEvent) {
            return false;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        public void onTouchEvent(C1732az azVar, MotionEvent motionEvent) {
        }
    }

    /* renamed from: android.support.v7.widget.az$t */
    public static abstract class C1768t {

        /* renamed from: a */
        private int f5901a = -1;

        /* renamed from: b */
        private C1732az f5902b;

        /* renamed from: c */
        private C1750h f5903c;

        /* renamed from: d */
        private boolean f5904d;

        /* renamed from: e */
        private boolean f5905e;

        /* renamed from: f */
        private View f5906f;

        /* renamed from: g */
        private final C1769a f5907g = new C1769a(0, 0);

        /* renamed from: android.support.v7.widget.az$t$a */
        public static class C1769a {

            /* renamed from: a */
            public static final int f5908a = Integer.MIN_VALUE;

            /* renamed from: b */
            private int f5909b;

            /* renamed from: c */
            private int f5910c;

            /* renamed from: d */
            private int f5911d;

            /* renamed from: e */
            private int f5912e;

            /* renamed from: f */
            private Interpolator f5913f;

            /* renamed from: g */
            private boolean f5914g;

            /* renamed from: h */
            private int f5915h;

            public C1769a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            public C1769a(int i, int i2, int i3) {
                this(i, i2, i3, (Interpolator) null);
            }

            public C1769a(int i, int i2, int i3, Interpolator interpolator) {
                this.f5912e = -1;
                this.f5914g = false;
                this.f5915h = 0;
                this.f5909b = i;
                this.f5910c = i2;
                this.f5911d = i3;
                this.f5913f = interpolator;
            }

            /* renamed from: f */
            private void m10737f() {
                if (this.f5913f != null && this.f5911d < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f5911d < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo7031a(int i) {
                this.f5912e = i;
            }

            /* renamed from: a */
            public void mo7032a(int i, int i2, int i3, Interpolator interpolator) {
                this.f5909b = i;
                this.f5910c = i2;
                this.f5911d = i3;
                this.f5913f = interpolator;
                this.f5914g = true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo7033a(C1732az azVar) {
                if (this.f5912e >= 0) {
                    int i = this.f5912e;
                    this.f5912e = -1;
                    azVar.jumpToPositionForSmoothScroller(i);
                    this.f5914g = false;
                } else if (this.f5914g) {
                    m10737f();
                    if (this.f5913f != null) {
                        azVar.mViewFlinger.mo7063a(this.f5909b, this.f5910c, this.f5911d, this.f5913f);
                    } else if (this.f5911d == Integer.MIN_VALUE) {
                        azVar.mViewFlinger.mo7066b(this.f5909b, this.f5910c);
                    } else {
                        azVar.mViewFlinger.mo7061a(this.f5909b, this.f5910c, this.f5911d);
                    }
                    this.f5915h++;
                    if (this.f5915h > 10) {
                        Log.e(C1732az.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5914g = false;
                } else {
                    this.f5915h = 0;
                }
            }

            /* renamed from: a */
            public void mo7034a(Interpolator interpolator) {
                this.f5914g = true;
                this.f5913f = interpolator;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo7035a() {
                return this.f5912e >= 0;
            }

            /* renamed from: b */
            public int mo7036b() {
                return this.f5909b;
            }

            /* renamed from: b */
            public void mo7037b(int i) {
                this.f5914g = true;
                this.f5909b = i;
            }

            /* renamed from: c */
            public int mo7038c() {
                return this.f5910c;
            }

            /* renamed from: c */
            public void mo7039c(int i) {
                this.f5914g = true;
                this.f5910c = i;
            }

            /* renamed from: d */
            public int mo7040d() {
                return this.f5911d;
            }

            /* renamed from: d */
            public void mo7041d(int i) {
                this.f5914g = true;
                this.f5911d = i;
            }

            /* renamed from: e */
            public Interpolator mo7042e() {
                return this.f5913f;
            }
        }

        /* renamed from: android.support.v7.widget.az$t$b */
        public interface C1770b {
            /* renamed from: d */
            PointF mo5835d(int i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m10718a(int i, int i2) {
            C1732az azVar = this.f5902b;
            if (!this.f5905e || this.f5901a == -1 || azVar == null) {
                mo7025f();
            }
            this.f5904d = false;
            if (this.f5906f != null) {
                if (mo7018a(this.f5906f) == this.f5901a) {
                    mo6442a(this.f5906f, azVar.mState, this.f5907g);
                    this.f5907g.mo7033a(azVar);
                    mo7025f();
                } else {
                    Log.e(C1732az.TAG, "Passed over target position while smooth scrolling.");
                    this.f5906f = null;
                }
            }
            if (this.f5905e) {
                mo6440a(i, i2, azVar.mState, this.f5907g);
                boolean a = this.f5907g.mo7035a();
                this.f5907g.mo7033a(azVar);
                if (!a) {
                    return;
                }
                if (this.f5905e) {
                    this.f5904d = true;
                    azVar.mViewFlinger.mo7059a();
                    return;
                }
                mo7025f();
            }
        }

        /* renamed from: a */
        public int mo7018a(View view) {
            return this.f5902b.getChildLayoutPosition(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo6439a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo6440a(int i, int i2, C1771u uVar, C1769a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7019a(PointF pointF) {
            double sqrt = Math.sqrt((double) ((pointF.x * pointF.x) + (pointF.y * pointF.y)));
            pointF.x = (float) (((double) pointF.x) / sqrt);
            pointF.y = (float) (((double) pointF.y) / sqrt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7020a(C1732az azVar, C1750h hVar) {
            this.f5902b = azVar;
            this.f5903c = hVar;
            if (this.f5901a == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            int unused = this.f5902b.mState.f5932q = this.f5901a;
            this.f5905e = true;
            this.f5904d = true;
            this.f5906f = mo7024e(mo7029i());
            mo6439a();
            this.f5902b.mViewFlinger.mo7059a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo6442a(View view, C1771u uVar, C1769a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo6445b();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo7021b(View view) {
            if (mo7018a(view) == mo7029i()) {
                this.f5906f = view;
            }
        }

        /* renamed from: d */
        public void mo7022d(int i) {
            this.f5901a = i;
        }

        @C0003aa
        /* renamed from: e */
        public C1750h mo7023e() {
            return this.f5903c;
        }

        /* renamed from: e */
        public View mo7024e(int i) {
            return this.f5902b.mLayout.mo5831c(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo7025f() {
            if (this.f5905e) {
                mo6445b();
                int unused = this.f5902b.mState.f5932q = -1;
                this.f5906f = null;
                this.f5901a = -1;
                this.f5904d = false;
                this.f5905e = false;
                this.f5903c.m10467b(this);
                this.f5903c = null;
                this.f5902b = null;
            }
        }

        @Deprecated
        /* renamed from: f */
        public void mo7026f(int i) {
            this.f5902b.scrollToPosition(i);
        }

        /* renamed from: g */
        public boolean mo7027g() {
            return this.f5904d;
        }

        /* renamed from: h */
        public boolean mo7028h() {
            return this.f5905e;
        }

        /* renamed from: i */
        public int mo7029i() {
            return this.f5901a;
        }

        /* renamed from: j */
        public int mo7030j() {
            return this.f5902b.mLayout.mo6839H();
        }
    }

    /* renamed from: android.support.v7.widget.az$u */
    public static class C1771u {

        /* renamed from: a */
        static final int f5916a = 1;

        /* renamed from: b */
        static final int f5917b = 2;

        /* renamed from: c */
        static final int f5918c = 4;

        /* renamed from: d */
        int f5919d = 0;

        /* renamed from: e */
        int f5920e = 0;

        /* renamed from: f */
        int f5921f = 1;

        /* renamed from: g */
        int f5922g = 0;

        /* renamed from: h */
        boolean f5923h = false;

        /* renamed from: i */
        boolean f5924i = false;

        /* renamed from: j */
        boolean f5925j = false;

        /* renamed from: k */
        boolean f5926k = false;

        /* renamed from: l */
        boolean f5927l = false;

        /* renamed from: m */
        boolean f5928m = false;

        /* renamed from: n */
        int f5929n;

        /* renamed from: o */
        long f5930o;

        /* renamed from: p */
        int f5931p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f5932q = -1;

        /* renamed from: r */
        private SparseArray<Object> f5933r;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1771u mo7043a() {
            this.f5932q = -1;
            if (this.f5933r != null) {
                this.f5933r.clear();
            }
            this.f5922g = 0;
            this.f5923h = false;
            this.f5926k = false;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7044a(int i) {
            if ((this.f5921f & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f5921f));
            }
        }

        /* renamed from: a */
        public void mo7045a(int i, Object obj) {
            if (this.f5933r == null) {
                this.f5933r = new SparseArray<>();
            }
            this.f5933r.put(i, obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7046a(C1739a aVar) {
            this.f5921f = 1;
            this.f5922g = aVar.getItemCount();
            this.f5923h = false;
            this.f5924i = false;
            this.f5925j = false;
            this.f5926k = false;
        }

        /* renamed from: b */
        public void mo7047b(int i) {
            if (this.f5933r != null) {
                this.f5933r.remove(i);
            }
        }

        /* renamed from: b */
        public boolean mo7048b() {
            return this.f5926k;
        }

        /* renamed from: c */
        public <T> T mo7049c(int i) {
            if (this.f5933r == null) {
                return null;
            }
            return this.f5933r.get(i);
        }

        /* renamed from: c */
        public boolean mo7050c() {
            return this.f5924i;
        }

        /* renamed from: d */
        public boolean mo7051d() {
            return this.f5928m;
        }

        /* renamed from: e */
        public boolean mo7052e() {
            return this.f5927l;
        }

        /* renamed from: f */
        public int mo7053f() {
            return this.f5932q;
        }

        /* renamed from: g */
        public boolean mo7054g() {
            return this.f5932q != -1;
        }

        /* renamed from: h */
        public boolean mo7055h() {
            return this.f5923h;
        }

        /* renamed from: i */
        public int mo7056i() {
            return this.f5924i ? this.f5919d - this.f5920e : this.f5922g;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5932q + ", mData=" + this.f5933r + ", mItemCount=" + this.f5922g + ", mPreviousLayoutItemCount=" + this.f5919d + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5920e + ", mStructureChanged=" + this.f5923h + ", mInPreLayout=" + this.f5924i + ", mRunSimpleAnimations=" + this.f5927l + ", mRunPredictiveAnimations=" + this.f5928m + '}';
        }
    }

    /* renamed from: android.support.v7.widget.az$v */
    public static abstract class C1772v {
        /* renamed from: a */
        public abstract View mo7058a(C1762o oVar, int i, int i2);
    }

    /* renamed from: android.support.v7.widget.az$w */
    class C1773w implements Runnable {

        /* renamed from: a */
        Interpolator f5934a = C1732az.sQuinticInterpolator;

        /* renamed from: c */
        private int f5936c;

        /* renamed from: d */
        private int f5937d;

        /* renamed from: e */
        private C1224af f5938e;

        /* renamed from: f */
        private boolean f5939f = false;

        /* renamed from: g */
        private boolean f5940g = false;

        public C1773w() {
            this.f5938e = C1224af.m7263a(C1732az.this.getContext(), C1732az.sQuinticInterpolator);
        }

        /* renamed from: a */
        private float m10767a(float f) {
            return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
        }

        /* renamed from: b */
        private int m10768b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? C1732az.this.getWidth() : C1732az.this.getHeight();
            int i6 = width / 2;
            float a = (m10767a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width))) * ((float) i6)) + ((float) i6);
            if (sqrt > 0) {
                i5 = Math.round(1000.0f * Math.abs(a / ((float) sqrt))) * 4;
            } else {
                i5 = (int) (((((float) (z ? abs : abs2)) / ((float) width)) + 1.0f) * 300.0f);
            }
            return Math.min(i5, C1732az.MAX_SCROLL_DURATION);
        }

        /* renamed from: c */
        private void m10769c() {
            this.f5940g = false;
            this.f5939f = true;
        }

        /* renamed from: d */
        private void m10770d() {
            this.f5939f = false;
            if (this.f5940g) {
                mo7059a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7059a() {
            if (this.f5939f) {
                this.f5940g = true;
                return;
            }
            C1732az.this.removeCallbacks(this);
            C1040ar.m5895a((View) C1732az.this, (Runnable) this);
        }

        /* renamed from: a */
        public void mo7060a(int i, int i2) {
            C1732az.this.setScrollState(2);
            this.f5937d = 0;
            this.f5936c = 0;
            this.f5938e.mo4126a(0, 0, i, i2, Integer.MIN_VALUE, ActivityChooserView.C1593a.f5166a, Integer.MIN_VALUE, ActivityChooserView.C1593a.f5166a);
            mo7059a();
        }

        /* renamed from: a */
        public void mo7061a(int i, int i2, int i3) {
            mo7063a(i, i2, i3, C1732az.sQuinticInterpolator);
        }

        /* renamed from: a */
        public void mo7062a(int i, int i2, int i3, int i4) {
            mo7061a(i, i2, m10768b(i, i2, i3, i4));
        }

        /* renamed from: a */
        public void mo7063a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.f5934a != interpolator) {
                this.f5934a = interpolator;
                this.f5938e = C1224af.m7263a(C1732az.this.getContext(), interpolator);
            }
            C1732az.this.setScrollState(2);
            this.f5937d = 0;
            this.f5936c = 0;
            this.f5938e.mo4125a(0, 0, i, i2, i3);
            mo7059a();
        }

        /* renamed from: a */
        public void mo7064a(int i, int i2, Interpolator interpolator) {
            int b = m10768b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = C1732az.sQuinticInterpolator;
            }
            mo7063a(i, i2, b, interpolator);
        }

        /* renamed from: b */
        public void mo7065b() {
            C1732az.this.removeCallbacks(this);
            this.f5938e.mo4137h();
        }

        /* renamed from: b */
        public void mo7066b(int i, int i2) {
            mo7062a(i, i2, 0, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0150  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r15 = this;
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$h r0 = r0.mLayout
                if (r0 != 0) goto L_0x000a
                r15.mo7065b()
            L_0x0009:
                return
            L_0x000a:
                r15.m10769c()
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                r0.consumePendingUpdateOperations()
                android.support.v4.widget.af r7 = r15.f5938e
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$h r0 = r0.mLayout
                android.support.v7.widget.az$t r8 = r0.f5870y
                boolean r0 = r7.mo4136g()
                if (r0 == 0) goto L_0x0157
                int r9 = r7.mo4130b()
                int r10 = r7.mo4132c()
                int r0 = r15.f5936c
                int r11 = r9 - r0
                int r0 = r15.f5937d
                int r12 = r10 - r0
                r3 = 0
                r1 = 0
                r15.f5936c = r9
                r15.f5937d = r10
                r2 = 0
                r0 = 0
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$a r4 = r4.mAdapter
                if (r4 == 0) goto L_0x018e
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.eatRequestLayout()
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.onEnterLayoutOrScroll()
                java.lang.String r4 = "RV Scroll"
                android.support.p010v4.p028k.C0817o.m4100a(r4)
                if (r11 == 0) goto L_0x0061
                android.support.v7.widget.az r2 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$h r2 = r2.mLayout
                android.support.v7.widget.az r3 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$o r3 = r3.mRecycler
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$u r4 = r4.mState
                int r3 = r2.mo5777a((int) r11, (android.support.p036v7.widget.C1732az.C1762o) r3, (android.support.p036v7.widget.C1732az.C1771u) r4)
                int r2 = r11 - r3
            L_0x0061:
                if (r12 == 0) goto L_0x0075
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$h r0 = r0.mLayout
                android.support.v7.widget.az r1 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$o r1 = r1.mRecycler
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$u r4 = r4.mState
                int r1 = r0.mo5798b((int) r12, (android.support.p036v7.widget.C1732az.C1762o) r1, (android.support.p036v7.widget.C1732az.C1771u) r4)
                int r0 = r12 - r1
            L_0x0075:
                android.support.p010v4.p028k.C0817o.m4099a()
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.repositionShadowingViews()
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.onExitLayoutOrScroll()
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r5 = 0
                r4.resumeRequestLayout(r5)
                if (r8 == 0) goto L_0x018e
                boolean r4 = r8.mo7027g()
                if (r4 != 0) goto L_0x018e
                boolean r4 = r8.mo7028h()
                if (r4 == 0) goto L_0x018e
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$u r4 = r4.mState
                int r4 = r4.mo7056i()
                if (r4 != 0) goto L_0x0170
                r8.mo7025f()
                r14 = r2
                r2 = r1
                r1 = r14
            L_0x00a6:
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                java.util.ArrayList<android.support.v7.widget.az$g> r4 = r4.mItemDecorations
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x00b5
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.invalidate()
            L_0x00b5:
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                int r4 = r4.getOverScrollMode()
                r5 = 2
                if (r4 == r5) goto L_0x00c3
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.considerReleasingGlowsOnScroll(r11, r12)
            L_0x00c3:
                if (r1 != 0) goto L_0x00c7
                if (r0 == 0) goto L_0x00fe
            L_0x00c7:
                float r4 = r7.mo4135f()
                int r5 = (int) r4
                r4 = 0
                if (r1 == r9) goto L_0x01bd
                if (r1 >= 0) goto L_0x0193
                int r4 = -r5
            L_0x00d2:
                r6 = r4
            L_0x00d3:
                r4 = 0
                if (r0 == r10) goto L_0x01ba
                if (r0 >= 0) goto L_0x019b
                int r5 = -r5
            L_0x00d9:
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                int r4 = r4.getOverScrollMode()
                r13 = 2
                if (r4 == r13) goto L_0x00e7
                android.support.v7.widget.az r4 = android.support.p036v7.widget.C1732az.this
                r4.absorbGlows(r6, r5)
            L_0x00e7:
                if (r6 != 0) goto L_0x00f1
                if (r1 == r9) goto L_0x00f1
                int r1 = r7.mo4133d()
                if (r1 != 0) goto L_0x00fe
            L_0x00f1:
                if (r5 != 0) goto L_0x00fb
                if (r0 == r10) goto L_0x00fb
                int r0 = r7.mo4134e()
                if (r0 != 0) goto L_0x00fe
            L_0x00fb:
                r7.mo4137h()
            L_0x00fe:
                if (r3 != 0) goto L_0x0102
                if (r2 == 0) goto L_0x0107
            L_0x0102:
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                r0.dispatchOnScrolled(r3, r2)
            L_0x0107:
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                boolean r0 = r0.awakenScrollBars()
                if (r0 != 0) goto L_0x0114
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                r0.invalidate()
            L_0x0114:
                if (r12 == 0) goto L_0x01a0
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$h r0 = r0.mLayout
                boolean r0 = r0.mo5847h()
                if (r0 == 0) goto L_0x01a0
                if (r2 != r12) goto L_0x01a0
                r0 = 1
                r1 = r0
            L_0x0124:
                if (r11 == 0) goto L_0x01a3
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.az$h r0 = r0.mLayout
                boolean r0 = r0.mo5845g()
                if (r0 == 0) goto L_0x01a3
                if (r3 != r11) goto L_0x01a3
                r0 = 1
            L_0x0133:
                if (r11 != 0) goto L_0x0137
                if (r12 == 0) goto L_0x013b
            L_0x0137:
                if (r0 != 0) goto L_0x013b
                if (r1 == 0) goto L_0x01a5
            L_0x013b:
                r0 = 1
            L_0x013c:
                boolean r1 = r7.mo4128a()
                if (r1 != 0) goto L_0x0144
                if (r0 != 0) goto L_0x01a7
            L_0x0144:
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                r1 = 0
                r0.setScrollState(r1)
                boolean r0 = android.support.p036v7.widget.C1732az.ALLOW_THREAD_GAP_WORK
                if (r0 == 0) goto L_0x0157
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.al$a r0 = r0.mPrefetchRegistry
                r0.mo6384a()
            L_0x0157:
                if (r8 == 0) goto L_0x016b
                boolean r0 = r8.mo7027g()
                if (r0 == 0) goto L_0x0164
                r0 = 0
                r1 = 0
                r8.m10718a((int) r0, (int) r1)
            L_0x0164:
                boolean r0 = r15.f5940g
                if (r0 != 0) goto L_0x016b
                r8.mo7025f()
            L_0x016b:
                r15.m10770d()
                goto L_0x0009
            L_0x0170:
                int r5 = r8.mo7029i()
                if (r5 < r4) goto L_0x0187
                int r4 = r4 + -1
                r8.mo7022d(r4)
                int r4 = r11 - r2
                int r5 = r12 - r0
                r8.m10718a((int) r4, (int) r5)
                r14 = r2
                r2 = r1
                r1 = r14
                goto L_0x00a6
            L_0x0187:
                int r4 = r11 - r2
                int r5 = r12 - r0
                r8.m10718a((int) r4, (int) r5)
            L_0x018e:
                r14 = r2
                r2 = r1
                r1 = r14
                goto L_0x00a6
            L_0x0193:
                if (r1 <= 0) goto L_0x0198
                r4 = r5
                goto L_0x00d2
            L_0x0198:
                r4 = 0
                goto L_0x00d2
            L_0x019b:
                if (r0 > 0) goto L_0x00d9
                r5 = 0
                goto L_0x00d9
            L_0x01a0:
                r0 = 0
                r1 = r0
                goto L_0x0124
            L_0x01a3:
                r0 = 0
                goto L_0x0133
            L_0x01a5:
                r0 = 0
                goto L_0x013c
            L_0x01a7:
                r15.mo7059a()
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.al r0 = r0.mGapWorker
                if (r0 == 0) goto L_0x0157
                android.support.v7.widget.az r0 = android.support.p036v7.widget.C1732az.this
                android.support.v7.widget.al r0 = r0.mGapWorker
                android.support.v7.widget.az r1 = android.support.p036v7.widget.C1732az.this
                r0.mo6379a((android.support.p036v7.widget.C1732az) r1, (int) r11, (int) r12)
                goto L_0x0157
            L_0x01ba:
                r5 = r4
                goto L_0x00d9
            L_0x01bd:
                r6 = r4
                goto L_0x00d3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1732az.C1773w.run():void");
        }
    }

    /* renamed from: android.support.v7.widget.az$x */
    public static abstract class C1774x {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        /* access modifiers changed from: private */
        public int mFlags;
        /* access modifiers changed from: private */
        public boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<C1732az> mNestedRecyclerView;
        int mOldPosition = -1;
        C1732az mOwnerRecyclerView;
        List<Object> mPayloads = null;
        @C0020ao
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        /* access modifiers changed from: private */
        public C1762o mScrapContainer = null;
        C1774x mShadowedHolder = null;
        C1774x mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C1774x(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C1040ar.m5923c(this.itemView);
        }

        /* access modifiers changed from: private */
        public void onEnteredHiddenState(C1732az azVar) {
            this.mWasImportantForAccessibilityBeforeHidden = C1040ar.m5928e(this.itemView);
            azVar.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: private */
        public void onLeftHiddenState(C1732az azVar) {
            azVar.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((this.mFlags & 1024) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags |= i;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            if (this.mPayloads != null) {
                this.mPayloads.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            if (this.mOwnerRecyclerView == null) {
                return -1;
            }
            return this.mOwnerRecyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            return this.mPreLayoutPosition == -1 ? this.mPosition : this.mPreLayoutPosition;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            return (this.mFlags & 1024) == 0 ? (this.mPayloads == null || this.mPayloads.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads : FULLUPDATE_PAYLOADS;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (this.mFlags & i) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C1040ar.m5923c(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C1755i) this.itemView.getLayoutParams()).f5880f = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            C1732az.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (this.mFlags & (i2 ^ -1)) | (i & i2);
        }

        public final void setIsRecyclable(boolean z) {
            this.mIsRecyclableCount = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            if (this.mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && this.mIsRecyclableCount == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(C1762o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ").append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.mo6998c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public C1732az(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1732az(Context context, @C0003aa AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1732az(Context context, @C0003aa AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        this.mObserver = new C1764q();
        this.mRecycler = new C1762o();
        this.mViewInfoStore = new C1816bt();
        this.mUpdateChildViewsRunnable = new Runnable() {
            public void run() {
                if (C1732az.this.mFirstLayoutComplete && !C1732az.this.isLayoutRequested()) {
                    if (!C1732az.this.mIsAttached) {
                        C1732az.this.requestLayout();
                    } else if (C1732az.this.mLayoutFrozen) {
                        C1732az.this.mLayoutRequestEaten = true;
                    } else {
                        C1732az.this.consumePendingUpdateOperations();
                    }
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mEatRequestLayout = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mItemAnimator = new C1670af();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C1773w();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1692al.C1694a() : null;
        this.mState = new C1771u();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1748f();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        this.mNestedOffsets = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() {
            public void run() {
                if (C1732az.this.mItemAnimator != null) {
                    C1732az.this.mItemAnimator.mo6343a();
                }
                C1732az.this.mPostedAnimatorRunner = false;
            }
        };
        this.mViewInfoProcessCallback = new C1816bt.C1818b() {
            /* renamed from: a */
            public void mo6747a(C1774x xVar) {
                C1732az.this.mLayout.mo6898b(xVar.itemView, C1732az.this.mRecycler);
            }

            /* renamed from: a */
            public void mo6748a(C1774x xVar, @C0047z C1743e.C1747d dVar, @C0003aa C1743e.C1747d dVar2) {
                C1732az.this.mRecycler.mo6998c(xVar);
                C1732az.this.animateDisappearance(xVar, dVar, dVar2);
            }

            /* renamed from: b */
            public void mo6749b(C1774x xVar, C1743e.C1747d dVar, C1743e.C1747d dVar2) {
                C1732az.this.animateAppearance(xVar, dVar, dVar2);
            }

            /* renamed from: c */
            public void mo6750c(C1774x xVar, @C0047z C1743e.C1747d dVar, @C0047z C1743e.C1747d dVar2) {
                xVar.setIsRecyclable(false);
                if (C1732az.this.mDataSetHasChangedAfterLayout) {
                    if (C1732az.this.mItemAnimator.mo6808a(xVar, xVar, dVar, dVar2)) {
                        C1732az.this.postAnimationRunner();
                    }
                } else if (C1732az.this.mItemAnimator.mo6812c(xVar, dVar, dVar2)) {
                    C1732az.this.postAnimationRunner();
                }
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CLIP_TO_PADDING_ATTR, i, 0);
            this.mClipToPadding = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.mClipToPadding = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo6805a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        if (C1040ar.m5928e(this) == 0) {
            C1040ar.m5926d((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1777ba(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1484b.C1488d.RecyclerView, i, 0);
            String string = obtainStyledAttributes2.getString(C1484b.C1488d.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(C1484b.C1488d.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            obtainStyledAttributes2.recycle();
            createLayoutManager(context, string, attributeSet, i, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    private void addAnimatingView(C1774x xVar) {
        View view = xVar.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.mo6998c(getChildViewHolder(view));
        if (xVar.isTmpDetached()) {
            this.mChildHelper.mo6252a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.mo6254a(view, true);
        } else {
            this.mChildHelper.mo6262d(view);
        }
    }

    private void animateChange(@C0047z C1774x xVar, @C0047z C1774x xVar2, @C0047z C1743e.C1747d dVar, @C0047z C1743e.C1747d dVar2, boolean z, boolean z2) {
        xVar.setIsRecyclable(false);
        if (z) {
            addAnimatingView(xVar);
        }
        if (xVar != xVar2) {
            if (z2) {
                addAnimatingView(xVar2);
            }
            xVar.mShadowedHolder = xVar2;
            addAnimatingView(xVar);
            this.mRecycler.mo6998c(xVar);
            xVar2.setIsRecyclable(false);
            xVar2.mShadowingHolder = xVar;
        }
        if (this.mItemAnimator.mo6808a(xVar, xVar2, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelTouch() {
        resetTouch();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(@C0047z C1774x xVar) {
        if (xVar.mNestedRecyclerView != null) {
            View view = (View) xVar.mNestedRecyclerView.get();
            while (view != null) {
                if (view != xVar.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            xVar.mNestedRecyclerView = null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createLayoutManager(android.content.Context r9, java.lang.String r10, android.util.AttributeSet r11, int r12, int r13) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x0054
            java.lang.String r0 = r10.trim()
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0054
            java.lang.String r3 = r8.getFullClassName(r9, r0)
            boolean r0 = r8.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            if (r0 == 0) goto L_0x0055
            java.lang.Class r0 = r8.getClass()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
        L_0x001e:
            java.lang.Class r0 = r0.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.Class<android.support.v7.widget.az$h> r1 = android.support.p036v7.widget.C1732az.C1750h.class
            java.lang.Class r4 = r0.asSubclass(r1)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            r1 = 0
            java.lang.Class<?>[] r0 = LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE     // Catch:{ NoSuchMethodException -> 0x005a }
            java.lang.reflect.Constructor r2 = r4.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x005a }
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x005a }
            r5 = 0
            r0[r5] = r9     // Catch:{ NoSuchMethodException -> 0x005a }
            r5 = 1
            r0[r5] = r11     // Catch:{ NoSuchMethodException -> 0x005a }
            r5 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch:{ NoSuchMethodException -> 0x005a }
            r0[r5] = r6     // Catch:{ NoSuchMethodException -> 0x005a }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch:{ NoSuchMethodException -> 0x005a }
            r0[r5] = r6     // Catch:{ NoSuchMethodException -> 0x005a }
            r1 = r2
        L_0x0047:
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            android.support.v7.widget.az$h r0 = (android.support.p036v7.widget.C1732az.C1750h) r0     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            r8.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
        L_0x0054:
            return
        L_0x0055:
            java.lang.ClassLoader r0 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            goto L_0x001e
        L_0x005a:
            r0 = move-exception
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0066 }
            java.lang.reflect.Constructor r0 = r4.getConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x0066 }
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x0047
        L_0x0066:
            r1 = move-exception
            r1.initCause(r0)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.String r4 = r11.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.String r4 = ": Error creating LayoutManager "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            java.lang.String r2 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            r0.<init>(r2, r1)     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x008b, InvocationTargetException -> 0x00ad, InstantiationException -> 0x00cf, IllegalAccessException -> 0x00f1, ClassCastException -> 0x0113 }
        L_0x008b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r11.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00ad:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r11.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ": Could not instantiate the LayoutManager: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00cf:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r11.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ": Could not instantiate the LayoutManager: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00f1:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r11.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0113:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r11.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1732az.createLayoutManager(android.content.Context, java.lang.String, android.util.AttributeSet, int, int):void");
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        return (this.mMinMaxLayoutPositions[0] == i && this.mMinMaxLayoutPositions[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C0922a.m4610b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo7044a(1);
        this.mState.f5926k = false;
        eatRequestLayout();
        this.mViewInfoStore.mo7330a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C1771u uVar = this.mState;
        if (!this.mState.f5927l || !this.mItemsChanged) {
            z = false;
        }
        uVar.f5925j = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        this.mState.f5924i = this.mState.f5928m;
        this.mState.f5922g = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f5927l) {
            int b = this.mChildHelper.mo6255b();
            for (int i = 0; i < b; i++) {
                C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6257b(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.mo7332a(childViewHolderInt, this.mItemAnimator.mo6803a(this.mState, childViewHolderInt, C1743e.m10425e(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f5925j && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.mo7331a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f5928m) {
            saveOldPositions();
            boolean z2 = this.mState.f5923h;
            this.mState.f5923h = false;
            this.mLayout.mo5803c(this.mRecycler, this.mState);
            this.mState.f5923h = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo6255b(); i2++) {
                C1774x childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo6257b(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.mo7340d(childViewHolderInt2)) {
                    int e = C1743e.m10425e(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e |= 4096;
                    }
                    C1743e.C1747d a = this.mItemAnimator.mo6803a(this.mState, childViewHolderInt2, e, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a);
                    } else {
                        this.mViewInfoStore.mo7337b(childViewHolderInt2, a);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        resumeRequestLayout(false);
        this.mState.f5921f = 2;
    }

    private void dispatchLayoutStep2() {
        eatRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo7044a(6);
        this.mAdapterHelper.mo7409e();
        this.mState.f5922g = this.mAdapter.getItemCount();
        this.mState.f5920e = 0;
        this.mState.f5924i = false;
        this.mLayout.mo5803c(this.mRecycler, this.mState);
        this.mState.f5923h = false;
        this.mPendingSavedState = null;
        this.mState.f5927l = this.mState.f5927l && this.mItemAnimator != null;
        this.mState.f5921f = 4;
        onExitLayoutOrScroll();
        resumeRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo7044a(4);
        eatRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.f5921f = 1;
        if (this.mState.f5927l) {
            for (int b = this.mChildHelper.mo6255b() - 1; b >= 0; b--) {
                C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6257b(b));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C1743e.C1747d a = this.mItemAnimator.mo6802a(this.mState, childViewHolderInt);
                    C1774x a2 = this.mViewInfoStore.mo7329a(changedHolderKey);
                    if (a2 == null || a2.shouldIgnore()) {
                        this.mViewInfoStore.mo7339c(childViewHolderInt, a);
                    } else {
                        boolean a3 = this.mViewInfoStore.mo7334a(a2);
                        boolean a4 = this.mViewInfoStore.mo7334a(childViewHolderInt);
                        if (!a3 || a2 != childViewHolderInt) {
                            C1743e.C1747d b2 = this.mViewInfoStore.mo7335b(a2);
                            this.mViewInfoStore.mo7339c(childViewHolderInt, a);
                            C1743e.C1747d c = this.mViewInfoStore.mo7338c(childViewHolderInt);
                            if (b2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a2);
                            } else {
                                animateChange(a2, childViewHolderInt, b2, c, a3, a4);
                            }
                        } else {
                            this.mViewInfoStore.mo7339c(childViewHolderInt, a);
                        }
                    }
                }
            }
            this.mViewInfoStore.mo7333a(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo6890b(this.mRecycler);
        this.mState.f5919d = this.mState.f5922g;
        this.mDataSetHasChangedAfterLayout = false;
        this.mState.f5927l = false;
        this.mState.f5928m = false;
        this.mLayout.f5871z = false;
        if (this.mRecycler.f5891b != null) {
            this.mRecycler.f5891b.clear();
        }
        if (this.mLayout.f5857D) {
            this.mLayout.f5856C = 0;
            this.mLayout.f5857D = false;
            this.mRecycler.mo6991b();
        }
        this.mLayout.mo5790a(this.mState);
        onExitLayoutOrScroll();
        resumeRequestLayout(false);
        this.mViewInfoStore.mo7330a();
        if (didChildRangeChange(this.mMinMaxLayoutPositions[0], this.mMinMaxLayoutPositions[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchOnItemTouch(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.mActiveOnItemTouchListener != null) {
            if (action == 0) {
                this.mActiveOnItemTouchListener = null;
            } else {
                this.mActiveOnItemTouchListener.onTouchEvent(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.mActiveOnItemTouchListener = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.mOnItemTouchListeners.size();
            for (int i = 0; i < size; i++) {
                C1758l lVar = this.mOnItemTouchListeners.get(i);
                if (lVar.onInterceptTouchEvent(this, motionEvent)) {
                    this.mActiveOnItemTouchListener = lVar;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.mActiveOnItemTouchListener = null;
        }
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C1758l lVar = this.mOnItemTouchListeners.get(i);
            if (!lVar.onInterceptTouchEvent(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mActiveOnItemTouchListener = lVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int b = this.mChildHelper.mo6255b();
        if (b == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = ActivityChooserView.C1593a.f5166a;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        while (i3 < b) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6257b(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
            i3++;
            i = i;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @C0003aa
    static C1732az findNestedRecyclerView(@C0047z View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C1732az) {
            return (C1732az) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1732az findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @C0003aa
    private View findNextViewToFocus() {
        int i = this.mState.f5929n != -1 ? this.mState.f5929n : 0;
        int i2 = this.mState.mo7056i();
        int i3 = i;
        while (i3 < i2) {
            C1774x findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition == null) {
                break;
            } else if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            } else {
                i3++;
            }
        }
        for (int min = Math.min(i2, i) - 1; min >= 0; min--) {
            C1774x findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
            if (findViewHolderForAdapterPosition2 == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        return null;
    }

    static C1774x getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C1755i) view.getLayoutParams()).f5878d;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C1755i iVar = (C1755i) view.getLayoutParams();
        Rect rect2 = iVar.f5879e;
        int left = (view.getLeft() - rect2.left) - iVar.leftMargin;
        int top = (view.getTop() - rect2.top) - iVar.topMargin;
        int right = view.getRight() + rect2.right + iVar.rightMargin;
        int bottom = view.getBottom();
        rect.set(left, top, right, iVar.bottomMargin + rect2.bottom + bottom);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int i;
        int id = view.getId();
        while (true) {
            i = id;
            View view2 = view;
            if (view2.isFocused() || !(view2 instanceof ViewGroup) || !view2.hasFocus()) {
                return i;
            }
            view = ((ViewGroup) view2).getFocusedChild();
            id = view.getId() != -1 ? view.getId() : i;
        }
        return i;
    }

    private String getFullClassName(Context context, String str) {
        return str.charAt(0) == '.' ? context.getPackageName() + str : !str.contains(".") ? C1732az.class.getPackage().getName() + '.' + str : str;
    }

    private float getScrollFactor() {
        if (this.mScrollFactor == Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (!getContext().getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 0.0f;
            }
            this.mScrollFactor = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
        }
        return this.mScrollFactor;
    }

    private C1008ab getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1008ab(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C1774x xVar, C1774x xVar2) {
        int b = this.mChildHelper.mo6255b();
        int i = 0;
        while (i < b) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6257b(i));
            if (childViewHolderInt == xVar || getChangedHolderKey(childViewHolderInt) != j) {
                i++;
            } else if (this.mAdapter == null || !this.mAdapter.hasStableIds()) {
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + xVar);
            } else {
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + xVar);
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + xVar2 + " cannot be found but it is necessary for " + xVar);
    }

    private boolean hasUpdatedView() {
        int b = this.mChildHelper.mo6255b();
        for (int i = 0; i < b; i++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6257b(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1665ac(new C1665ac.C1667b() {
            /* renamed from: a */
            public int mo6275a() {
                return C1732az.this.getChildCount();
            }

            /* renamed from: a */
            public int mo6276a(View view) {
                return C1732az.this.indexOfChild(view);
            }

            /* renamed from: a */
            public void mo6277a(int i) {
                View childAt = C1732az.this.getChildAt(i);
                if (childAt != null) {
                    C1732az.this.dispatchChildDetached(childAt);
                }
                C1732az.this.removeViewAt(i);
            }

            /* renamed from: a */
            public void mo6278a(View view, int i) {
                C1732az.this.addView(view, i);
                C1732az.this.dispatchChildAttached(view);
            }

            /* renamed from: a */
            public void mo6279a(View view, int i, ViewGroup.LayoutParams layoutParams) {
                C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.clearTmpDetachFlag();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt);
                    }
                }
                C1732az.this.attachViewToParent(view, i, layoutParams);
            }

            /* renamed from: b */
            public C1774x mo6280b(View view) {
                return C1732az.getChildViewHolderInt(view);
            }

            /* renamed from: b */
            public View mo6281b(int i) {
                return C1732az.this.getChildAt(i);
            }

            /* renamed from: b */
            public void mo6282b() {
                int a = mo6275a();
                for (int i = 0; i < a; i++) {
                    C1732az.this.dispatchChildDetached(mo6281b(i));
                }
                C1732az.this.removeAllViews();
            }

            /* renamed from: c */
            public void mo6283c(int i) {
                C1774x childViewHolderInt;
                View b = mo6281b(i);
                if (!(b == null || (childViewHolderInt = C1732az.getChildViewHolderInt(b)) == null)) {
                    if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                        childViewHolderInt.addFlags(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt);
                    }
                }
                C1732az.this.detachViewFromParent(i);
            }

            /* renamed from: c */
            public void mo6284c(View view) {
                C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onEnteredHiddenState(C1732az.this);
                }
            }

            /* renamed from: d */
            public void mo6285d(View view) {
                C1774x childViewHolderInt = C1732az.getChildViewHolderInt(view);
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(C1732az.this);
                }
            }
        });
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        boolean z = false;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i != 2 && i != 1) {
            return isPreferredNextFocusAbsolute(view, view2, i);
        }
        boolean z2 = this.mLayout.mo6836E() == 1;
        if (i == 2) {
            z = true;
        }
        if (isPreferredNextFocusAbsolute(view, view2, z ^ z2 ? 66 : 17)) {
            return true;
        }
        return i == 2 ? isPreferredNextFocusAbsolute(view, view2, C0755t.f2804k) : isPreferredNextFocusAbsolute(view, view2, 33);
    }

    private boolean isPreferredNextFocusAbsolute(View view, View view2, int i) {
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        switch (i) {
            case 17:
                return (this.mTempRect.right > this.mTempRect2.right || this.mTempRect.left >= this.mTempRect2.right) && this.mTempRect.left > this.mTempRect2.left;
            case 33:
                return (this.mTempRect.bottom > this.mTempRect2.bottom || this.mTempRect.top >= this.mTempRect2.bottom) && this.mTempRect.top > this.mTempRect2.top;
            case 66:
                return (this.mTempRect.left < this.mTempRect2.left || this.mTempRect.right <= this.mTempRect2.left) && this.mTempRect.right < this.mTempRect2.right;
            case C0755t.f2804k:
                return (this.mTempRect.top < this.mTempRect2.top || this.mTempRect.bottom <= this.mTempRect2.top) && this.mTempRect.bottom < this.mTempRect2.bottom;
            default:
                throw new IllegalArgumentException("direction must be absolute. received:" + i);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int b = C1200x.m7133b(motionEvent);
        if (motionEvent.getPointerId(b) == this.mScrollPointerId) {
            int i = b == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo5804d();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z = true;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo7396a();
            this.mLayout.mo5792a(this);
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo7403b();
        } else {
            this.mAdapterHelper.mo7409e();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f5927l = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f5871z) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.hasStableIds());
        C1771u uVar = this.mState;
        if (!this.mState.f5927l || !z2 || this.mDataSetHasChangedAfterLayout || !predictiveItemAnimationsEnabled()) {
            z = false;
        }
        uVar.f5928m = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (r7.mBottomGlow.mo4471a(r11 / ((float) getHeight()), 1.0f - (r8 / ((float) getWidth()))) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r7.mTopGlow.mo4471a((-r11) / ((float) getHeight()), r8 / ((float) getWidth())) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r8, float r9, float r10, float r11) {
        /*
            r7 = this;
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            r5 = 0
            r1 = 0
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0050
            r7.ensureLeftGlow()
            android.support.v4.widget.m r2 = r7.mLeftGlow
            float r3 = -r9
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r10 / r4
            float r4 = r6 - r4
            boolean r2 = r2.mo4471a((float) r3, (float) r4)
            if (r2 == 0) goto L_0x0025
            r1 = r0
        L_0x0025:
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x006f
            r7.ensureTopGlow()
            android.support.v4.widget.m r2 = r7.mTopGlow
            float r3 = -r11
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            boolean r2 = r2.mo4471a((float) r3, (float) r4)
            if (r2 == 0) goto L_0x008e
        L_0x0042:
            if (r0 != 0) goto L_0x004c
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x004f
        L_0x004c:
            android.support.p010v4.view.C1040ar.m5924d(r7)
        L_0x004f:
            return
        L_0x0050:
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x0025
            r7.ensureRightGlow()
            android.support.v4.widget.m r2 = r7.mRightGlow
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r9 / r3
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r10 / r4
            boolean r2 = r2.mo4471a((float) r3, (float) r4)
            if (r2 == 0) goto L_0x0025
            r1 = r0
            goto L_0x0025
        L_0x006f:
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x008e
            r7.ensureBottomGlow()
            android.support.v4.widget.m r2 = r7.mBottomGlow
            int r3 = r7.getHeight()
            float r3 = (float) r3
            float r3 = r11 / r3
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            float r4 = r6 - r4
            boolean r2 = r2.mo4471a((float) r3, (float) r4)
            if (r2 != 0) goto L_0x0042
        L_0x008e:
            r0 = r1
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1732az.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View view;
        View view2 = null;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo6260c(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo6255b() == 0) {
                        requestFocus();
                        return;
                    }
                }
                C1774x findViewHolderForItemId = (this.mState.f5930o == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f5930o);
                if (findViewHolderForItemId != null && !this.mChildHelper.mo6260c(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                    view2 = findViewHolderForItemId.itemView;
                } else if (this.mChildHelper.mo6255b() > 0) {
                    view2 = findNextViewToFocus();
                }
                if (view2 != null) {
                    if (((long) this.mState.f5931p) == -1 || (view = view2.findViewById(this.mState.f5931p)) == null || !view.isFocusable()) {
                        view = view2;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z = false;
        if (this.mLeftGlow != null) {
            z = this.mLeftGlow.mo4475c();
        }
        if (this.mTopGlow != null) {
            z |= this.mTopGlow.mo4475c();
        }
        if (this.mRightGlow != null) {
            z |= this.mRightGlow.mo4475c();
        }
        if (this.mBottomGlow != null) {
            z |= this.mBottomGlow.mo4475c();
        }
        if (z) {
            C1040ar.m5924d(this);
        }
    }

    private void requestChildOnScreen(@C0047z View view, @C0003aa View view2) {
        boolean z = true;
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1755i) {
            C1755i iVar = (C1755i) layoutParams;
            if (!iVar.f5880f) {
                Rect rect = iVar.f5879e;
                this.mTempRect.left -= rect.left;
                this.mTempRect.right += rect.right;
                this.mTempRect.top -= rect.top;
                Rect rect2 = this.mTempRect;
                rect2.bottom = rect.bottom + rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        C1750h hVar = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 != null) {
            z = false;
        }
        hVar.mo6881a(this, view, rect3, z2, z);
    }

    private void resetFocusInfo() {
        this.mState.f5930o = -1;
        this.mState.f5929n = -1;
        this.mState.f5931p = -1;
    }

    private void resetTouch() {
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.clear();
        }
        stopNestedScroll();
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        C1774x findContainingViewHolder = focusedChild == null ? null : findContainingViewHolder(focusedChild);
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f5930o = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1;
        this.mState.f5929n = this.mDataSetHasChangedAfterLayout ? -1 : findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAdapterPosition();
        this.mState.f5931p = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(C1739a aVar, boolean z, boolean z2) {
        if (this.mAdapter != null) {
            this.mAdapter.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo7396a();
        C1739a aVar2 = this.mAdapter;
        this.mAdapter = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.mObserver);
            aVar.onAttachedToRecyclerView(this);
        }
        if (this.mLayout != null) {
            this.mLayout.mo6860a(aVar2, this.mAdapter);
        }
        this.mRecycler.mo6982a(aVar2, this.mAdapter, z);
        this.mState.f5923h = true;
        markKnownViewsInvalid();
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo7065b();
        if (this.mLayout != null) {
            this.mLayout.mo6857Z();
        }
    }

    /* access modifiers changed from: package-private */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            this.mLeftGlow.mo4472a(-i);
        } else if (i > 0) {
            ensureRightGlow();
            this.mRightGlow.mo4472a(i);
        }
        if (i2 < 0) {
            ensureTopGlow();
            this.mTopGlow.mo4472a(-i2);
        } else if (i2 > 0) {
            ensureBottomGlow();
            this.mBottomGlow.mo4472a(i2);
        }
        if (i != 0 || i2 != 0) {
            C1040ar.m5924d(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (this.mLayout == null || !this.mLayout.mo6883a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(C1749g gVar) {
        addItemDecoration(gVar, -1);
    }

    public void addItemDecoration(C1749g gVar, int i) {
        if (this.mLayout != null) {
            this.mLayout.mo5824a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(gVar);
        } else {
            this.mItemDecorations.add(i, gVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(C1756j jVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(jVar);
    }

    public void addOnItemTouchListener(C1758l lVar) {
        this.mOnItemTouchListeners.add(lVar);
    }

    public void addOnScrollListener(C1759m mVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(mVar);
    }

    /* access modifiers changed from: package-private */
    public void animateAppearance(@C0047z C1774x xVar, @C0003aa C1743e.C1747d dVar, @C0047z C1743e.C1747d dVar2) {
        xVar.setIsRecyclable(false);
        if (this.mItemAnimator.mo6810b(xVar, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void animateDisappearance(@C0047z C1774x xVar, @C0047z C1743e.C1747d dVar, @C0003aa C1743e.C1747d dVar2) {
        addAnimatingView(xVar);
        xVar.setIsRecyclable(false);
        if (this.mItemAnimator.mo6807a(xVar, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: package-private */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling");
        }
        throw new IllegalStateException(str);
    }

    /* access modifiers changed from: package-private */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(""));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean canReuseUpdatedViewHolder(C1774x xVar) {
        return this.mItemAnimator == null || this.mItemAnimator.mo6349a(xVar, xVar.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1755i) && this.mLayout.mo5797a((C1755i) layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void clearOldPositions() {
        int c = this.mChildHelper.mo6258c();
        for (int i = 0; i < c; i++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.mo7011j();
    }

    public void clearOnChildAttachStateChangeListeners() {
        if (this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.clear();
        }
    }

    public void clearOnScrollListeners() {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        if (this.mLayout != null && this.mLayout.mo5845g()) {
            return this.mLayout.mo5837e(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        if (this.mLayout != null && this.mLayout.mo5845g()) {
            return this.mLayout.mo5830c(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        if (this.mLayout != null && this.mLayout.mo5845g()) {
            return this.mLayout.mo5844g(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        if (this.mLayout != null && this.mLayout.mo5847h()) {
            return this.mLayout.mo5840f(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        if (this.mLayout != null && this.mLayout.mo5847h()) {
            return this.mLayout.mo5834d(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        if (this.mLayout != null && this.mLayout.mo5847h()) {
            return this.mLayout.mo5846h(this.mState);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z = false;
        if (this.mLeftGlow != null && !this.mLeftGlow.mo4469a() && i > 0) {
            z = this.mLeftGlow.mo4475c();
        }
        if (this.mRightGlow != null && !this.mRightGlow.mo4469a() && i < 0) {
            z |= this.mRightGlow.mo4475c();
        }
        if (this.mTopGlow != null && !this.mTopGlow.mo4469a() && i2 > 0) {
            z |= this.mTopGlow.mo4475c();
        }
        if (this.mBottomGlow != null && !this.mBottomGlow.mo4469a() && i2 < 0) {
            z |= this.mBottomGlow.mo4475c();
        }
        if (z) {
            C1040ar.m5924d(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C0817o.m4100a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C0817o.m4099a();
        } else if (!this.mAdapterHelper.mo7408d()) {
        } else {
            if (this.mAdapterHelper.mo7399a(4) && !this.mAdapterHelper.mo7399a(11)) {
                C0817o.m4100a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                eatRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo7403b();
                if (!this.mLayoutRequestEaten) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo7406c();
                    }
                }
                resumeRequestLayout(true);
                onExitLayoutOrScroll();
                C0817o.m4099a();
            } else if (this.mAdapterHelper.mo7408d()) {
                C0817o.m4100a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                C0817o.m4099a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C1750h.m10459a(i, getPaddingLeft() + getPaddingRight(), C1040ar.m5967y(this)), C1750h.m10459a(i2, getPaddingTop() + getPaddingBottom(), C1040ar.m5968z(this)));
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildAttached(View view) {
        C1774x childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (!(this.mAdapter == null || childViewHolderInt == null)) {
            this.mAdapter.onViewAttachedToWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo6182a(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchChildDetached(View view) {
        C1774x childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (!(this.mAdapter == null || childViewHolderInt == null)) {
            this.mAdapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        if (this.mOnChildAttachStateListeners != null) {
            for (int size = this.mOnChildAttachStateListeners.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo6187b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f5926k = false;
            if (this.mState.f5921f == 1) {
                dispatchLayoutStep1();
                this.mLayout.mo6919f(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.mo7410f() && this.mLayout.mo6842K() == getWidth() && this.mLayout.mo6843L() == getHeight()) {
                this.mLayout.mo6919f(this);
            } else {
                this.mLayout.mo6919f(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo3566a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo3565a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo3569a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo3568a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrollStateChanged(int i) {
        if (this.mLayout != null) {
            this.mLayout.mo5999m(i);
        }
        onScrollStateChanged(i);
        if (this.mScrollListener != null) {
            this.mScrollListener.onScrollStateChanged(this, i);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        onScrolled(i, i2);
        if (this.mScrollListener != null) {
            this.mScrollListener.onScrolled(this, i, i2);
        }
        if (this.mScrollListeners != null) {
            for (int size = this.mScrollListeners.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: package-private */
    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C1774x xVar = this.mPendingAccessibilityImportanceChange.get(size);
            if (xVar.itemView.getParent() == this && !xVar.shouldIgnore() && (i = xVar.mPendingAccessibilityState) != -1) {
                C1040ar.m5926d(xVar.itemView, i);
                xVar.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        if (this.mLeftGlow == null || this.mLeftGlow.mo4469a()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) (paddingBottom + (-getHeight())), 0.0f);
            z = this.mLeftGlow != null && this.mLeftGlow.mo4473a(canvas);
            canvas.restoreToCount(save);
        }
        if (this.mTopGlow != null && !this.mTopGlow.mo4469a()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            z |= this.mTopGlow != null && this.mTopGlow.mo4473a(canvas);
            canvas.restoreToCount(save2);
        }
        if (this.mRightGlow != null && !this.mRightGlow.mo4469a()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            z |= this.mRightGlow != null && this.mRightGlow.mo4473a(canvas);
            canvas.restoreToCount(save3);
        }
        if (this.mBottomGlow != null && !this.mBottomGlow.mo4469a()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            if (this.mBottomGlow != null && this.mBottomGlow.mo4473a(canvas)) {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo6351b()) {
            z2 = z;
        }
        if (z2) {
            C1040ar.m5924d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    public void eatRequestLayout() {
        this.mEatRequestLayout++;
        if (this.mEatRequestLayout == 1 && !this.mLayoutFrozen) {
            this.mLayoutRequestEaten = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            this.mBottomGlow = new C1323m(getContext());
            if (this.mClipToPadding) {
                this.mBottomGlow.mo4468a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mBottomGlow.mo4468a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            this.mLeftGlow = new C1323m(getContext());
            if (this.mClipToPadding) {
                this.mLeftGlow.mo4468a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mLeftGlow.mo4468a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            this.mRightGlow = new C1323m(getContext());
            if (this.mClipToPadding) {
                this.mRightGlow.mo4468a((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mRightGlow.mo4468a(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            this.mTopGlow = new C1323m(getContext());
            if (this.mClipToPadding) {
                this.mTopGlow.mo4468a((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mTopGlow.mo4468a(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public View findChildViewUnder(float f, float f2) {
        for (int b = this.mChildHelper.mo6255b() - 1; b >= 0; b--) {
            View b2 = this.mChildHelper.mo6257b(b);
            float v = C1040ar.m5964v(b2);
            float w = C1040ar.m5965w(b2);
            if (f >= ((float) b2.getLeft()) + v && f <= v + ((float) b2.getRight()) && f2 >= ((float) b2.getTop()) + w && f2 <= ((float) b2.getBottom()) + w) {
                return b2;
            }
        }
        return null;
    }

    @C0003aa
    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        View view2 = view;
        while (parent != null && parent != this && (parent instanceof View)) {
            View view3 = (View) parent;
            view2 = view3;
            parent = view3.getParent();
        }
        if (parent == this) {
            return view2;
        }
        return null;
    }

    @C0003aa
    public C1774x findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C1774x findViewHolderForAdapterPosition(int i) {
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int c = this.mChildHelper.mo6258c();
        int i2 = 0;
        C1774x xVar = null;
        while (i2 < c) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i2));
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || getAdapterPositionFor(childViewHolderInt) != i) {
                childViewHolderInt = xVar;
            } else if (!this.mChildHelper.mo6260c(childViewHolderInt.itemView)) {
                return childViewHolderInt;
            }
            i2++;
            xVar = childViewHolderInt;
        }
        return xVar;
    }

    public C1774x findViewHolderForItemId(long j) {
        if (this.mAdapter == null || !this.mAdapter.hasStableIds()) {
            return null;
        }
        int c = this.mChildHelper.mo6258c();
        int i = 0;
        C1774x xVar = null;
        while (i < c) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i));
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || childViewHolderInt.getItemId() != j) {
                childViewHolderInt = xVar;
            } else if (!this.mChildHelper.mo6260c(childViewHolderInt.itemView)) {
                return childViewHolderInt;
            }
            i++;
            xVar = childViewHolderInt;
        }
        return xVar;
    }

    public C1774x findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C1774x findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* access modifiers changed from: package-private */
    public C1774x findViewHolderForPosition(int i, boolean z) {
        int c = this.mChildHelper.mo6258c();
        C1774x xVar = null;
        for (int i2 = 0; i2 < c; i2++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo6260c(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                xVar = childViewHolderInt;
            }
        }
        return xVar;
    }

    public boolean fling(int i, int i2) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutFrozen) {
            return false;
        } else {
            boolean g = this.mLayout.mo5845g();
            boolean h = this.mLayout.mo5847h();
            if (!g || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!h || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if ((i == 0 && i2 == 0) || dispatchNestedPreFling((float) i, (float) i2)) {
                return false;
            }
            boolean z = g || h;
            dispatchNestedFling((float) i, (float) i2, z);
            if (this.mOnFlingListener != null && this.mOnFlingListener.mo6958a(i, i2)) {
                return true;
            }
            if (!z) {
                return false;
            }
            this.mViewFlinger.mo7060a(Math.max(-this.mMaxFlingVelocity, Math.min(i, this.mMaxFlingVelocity)), Math.max(-this.mMaxFlingVelocity, Math.min(i2, this.mMaxFlingVelocity)));
            return true;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        boolean z2 = true;
        View d = this.mLayout.mo6908d(view, i);
        if (d != null) {
            return d;
        }
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutFrozen;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                eatRequestLayout();
                view2 = this.mLayout.mo5783a(view, i, this.mRecycler, this.mState);
                resumeRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo5847h()) {
                int i2 = i == 2 ? C0755t.f2804k : 33;
                boolean z4 = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                    z = z4;
                } else {
                    z = z4;
                }
            } else {
                z = false;
            }
            if (z || !this.mLayout.mo5845g()) {
                z2 = z;
            } else {
                int i3 = (i == 2) ^ (this.mLayout.mo6836E() == 1) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                eatRequestLayout();
                this.mLayout.mo5783a(view, i, this.mRecycler, this.mState);
                resumeRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!isPreferredNextFocus(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, (View) null);
            return view;
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this.mLayout != null) {
            return this.mLayout.mo5779a();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (this.mLayout != null) {
            return this.mLayout.mo5780a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this.mLayout != null) {
            return this.mLayout.mo5781a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager");
    }

    public C1739a getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: package-private */
    public int getAdapterPositionFor(C1774x xVar) {
        if (xVar.hasAnyOfTheFlags(524) || !xVar.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.mo7405c(xVar.mPosition);
    }

    public int getBaseline() {
        return this.mLayout != null ? this.mLayout.mo6838G() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getChangedHolderKey(C1774x xVar) {
        return this.mAdapter.hasStableIds() ? xVar.getItemId() : (long) xVar.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        C1774x childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        return this.mChildDrawingOrderCallback == null ? super.getChildDrawingOrder(i, i2) : this.mChildDrawingOrderCallback.mo6200a(i, i2);
    }

    public long getChildItemId(View view) {
        C1774x childViewHolderInt;
        if (this.mAdapter == null || !this.mAdapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        C1774x childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C1774x getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C1777ba getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C1743e getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: package-private */
    public Rect getItemDecorInsetsForChild(View view) {
        C1755i iVar = (C1755i) view.getLayoutParams();
        if (!iVar.f5880f) {
            return iVar.f5879e;
        }
        if (this.mState.mo7050c() && (iVar.mo6954f() || iVar.mo6952d())) {
            return iVar.f5879e;
        }
        Rect rect = iVar.f5879e;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            rect.left += this.mTempRect.left;
            rect.top += this.mTempRect.top;
            rect.right += this.mTempRect.right;
            rect.bottom += this.mTempRect.bottom;
        }
        iVar.f5880f = false;
        return rect;
    }

    public C1750h getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    @C0003aa
    public C1757k getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C1760n getRecycledViewPool() {
        return this.mRecycler.mo7008g();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo3570b();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo7408d();
    }

    /* access modifiers changed from: package-private */
    public void initAdapterManager() {
        this.mAdapterHelper = new C1839f(new C1839f.C1840a() {
            /* renamed from: a */
            public C1774x mo6751a(int i) {
                C1774x findViewHolderForPosition = C1732az.this.findViewHolderForPosition(i, true);
                if (findViewHolderForPosition != null && !C1732az.this.mChildHelper.mo6260c(findViewHolderForPosition.itemView)) {
                    return findViewHolderForPosition;
                }
                return null;
            }

            /* renamed from: a */
            public void mo6752a(int i, int i2) {
                C1732az.this.offsetPositionRecordsForRemove(i, i2, true);
                C1732az.this.mItemsAddedOrRemoved = true;
                C1732az.this.mState.f5920e += i2;
            }

            /* renamed from: a */
            public void mo6753a(int i, int i2, Object obj) {
                C1732az.this.viewRangeUpdate(i, i2, obj);
                C1732az.this.mItemsChanged = true;
            }

            /* renamed from: a */
            public void mo6754a(C1839f.C1841b bVar) {
                mo6758c(bVar);
            }

            /* renamed from: b */
            public void mo6755b(int i, int i2) {
                C1732az.this.offsetPositionRecordsForRemove(i, i2, false);
                C1732az.this.mItemsAddedOrRemoved = true;
            }

            /* renamed from: b */
            public void mo6756b(C1839f.C1841b bVar) {
                mo6758c(bVar);
            }

            /* renamed from: c */
            public void mo6757c(int i, int i2) {
                C1732az.this.offsetPositionRecordsForInsert(i, i2);
                C1732az.this.mItemsAddedOrRemoved = true;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo6758c(C1839f.C1841b bVar) {
                switch (bVar.f6267f) {
                    case 1:
                        C1732az.this.mLayout.mo5793a(C1732az.this, bVar.f6268g, bVar.f6270i);
                        return;
                    case 2:
                        C1732az.this.mLayout.mo5801b(C1732az.this, bVar.f6268g, bVar.f6270i);
                        return;
                    case 4:
                        C1732az.this.mLayout.mo5795a(C1732az.this, bVar.f6268g, bVar.f6270i, bVar.f6269h);
                        return;
                    case 8:
                        C1732az.this.mLayout.mo5794a(C1732az.this, bVar.f6268g, bVar.f6270i, 1);
                        return;
                    default:
                        return;
                }
            }

            /* renamed from: d */
            public void mo6759d(int i, int i2) {
                C1732az.this.offsetPositionRecordsForMove(i, i2);
                C1732az.this.mItemsAddedOrRemoved = true;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            if (this.mLayout != null) {
                this.mLayout.mo5824a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isAccessibilityEnabled() {
        return this.mAccessibilityManager != null && this.mAccessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        return this.mItemAnimator != null && this.mItemAnimator.mo6351b();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public boolean isLayoutFrozen() {
        return this.mLayoutFrozen;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo3564a();
    }

    /* access modifiers changed from: package-private */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            this.mLayout.mo5838e(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: package-private */
    public void markItemDecorInsetsDirty() {
        int c = this.mChildHelper.mo6258c();
        for (int i = 0; i < c; i++) {
            ((C1755i) this.mChildHelper.mo6261d(i).getLayoutParams()).f5880f = true;
        }
        this.mRecycler.mo7012k();
    }

    /* access modifiers changed from: package-private */
    public void markKnownViewsInvalid() {
        int c = this.mChildHelper.mo6258c();
        for (int i = 0; i < c; i++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo7010i();
    }

    public void offsetChildrenHorizontal(int i) {
        int b = this.mChildHelper.mo6255b();
        for (int i2 = 0; i2 < b; i2++) {
            this.mChildHelper.mo6257b(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int b = this.mChildHelper.mo6255b();
        for (int i2 = 0; i2 < b; i2++) {
            this.mChildHelper.mo6257b(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int c = this.mChildHelper.mo6258c();
        for (int i3 = 0; i3 < c; i3++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f5923h = true;
            }
        }
        this.mRecycler.mo6992b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int c = this.mChildHelper.mo6258c();
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i6 = 0; i6 < c; i6++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i6));
            if (childViewHolderInt != null && childViewHolderInt.mPosition >= i5 && childViewHolderInt.mPosition <= i4) {
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i3, false);
                }
                this.mState.f5923h = true;
            }
        }
        this.mRecycler.mo6980a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int c = this.mChildHelper.mo6258c();
        for (int i4 = 0; i4 < c; i4++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                if (childViewHolderInt.mPosition >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f5923h = true;
                } else if (childViewHolderInt.mPosition >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f5923h = true;
                }
            }
        }
        this.mRecycler.mo6981a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            super.onAttachedToWindow()
            r4.mLayoutOrScrollCounter = r1
            r4.mIsAttached = r0
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0068
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0068
        L_0x0013:
            r4.mFirstLayoutComplete = r0
            android.support.v7.widget.az$h r0 = r4.mLayout
            if (r0 == 0) goto L_0x001e
            android.support.v7.widget.az$h r0 = r4.mLayout
            r0.mo6903c((android.support.p036v7.widget.C1732az) r4)
        L_0x001e:
            r4.mPostedAnimatorRunner = r1
            boolean r0 = ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<android.support.v7.widget.al> r0 = android.support.p036v7.widget.C1692al.f5656a
            java.lang.Object r0 = r0.get()
            android.support.v7.widget.al r0 = (android.support.p036v7.widget.C1692al) r0
            r4.mGapWorker = r0
            android.support.v7.widget.al r0 = r4.mGapWorker
            if (r0 != 0) goto L_0x0062
            android.support.v7.widget.al r0 = new android.support.v7.widget.al
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = android.support.p010v4.view.C1040ar.m5912ag(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x006a
            if (r0 == 0) goto L_0x006a
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x006a
        L_0x0051:
            android.support.v7.widget.al r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r2 / r0
            long r2 = (long) r0
            r1.f5660d = r2
            java.lang.ThreadLocal<android.support.v7.widget.al> r0 = android.support.p036v7.widget.C1692al.f5656a
            android.support.v7.widget.al r1 = r4.mGapWorker
            r0.set(r1)
        L_0x0062:
            android.support.v7.widget.al r0 = r4.mGapWorker
            r0.mo6378a((android.support.p036v7.widget.C1732az) r4)
        L_0x0067:
            return
        L_0x0068:
            r0 = r1
            goto L_0x0013
        L_0x006a:
            r0 = r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1732az.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo6355d();
        }
        stopScroll();
        this.mIsAttached = false;
        if (this.mLayout != null) {
            this.mLayout.mo6892b(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo7336b();
        if (ALLOW_THREAD_GAP_WORK) {
            this.mGapWorker.mo6380b(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: package-private */
    public void onExitLayoutOrScroll() {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter < 1) {
            this.mLayoutOrScrollCounter = 0;
            dispatchContentChangedIfNecessary();
            dispatchPendingImportantForAccessibilityChanges();
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.mLayout != null && !this.mLayoutFrozen && (motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            float f = this.mLayout.mo5847h() ? -C1200x.m7141f(motionEvent, 9) : 0.0f;
            float f2 = this.mLayout.mo5845g() ? C1200x.m7141f(motionEvent, 10) : 0.0f;
            if (!(f == 0.0f && f2 == 0.0f)) {
                float scrollFactor = getScrollFactor();
                scrollByInternal((int) (f2 * scrollFactor), (int) (f * scrollFactor), motionEvent);
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i = -1;
        boolean z2 = true;
        if (this.mLayoutFrozen) {
            return false;
        }
        if (dispatchOnItemTouchIntercept(motionEvent)) {
            cancelTouch();
            return true;
        } else if (this.mLayout == null) {
            return false;
        } else {
            boolean g = this.mLayout.mo5845g();
            boolean h = this.mLayout.mo5847h();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int a = C1200x.m7131a(motionEvent);
            int b = C1200x.m7133b(motionEvent);
            switch (a) {
                case 0:
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    if (this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    this.mNestedOffsets[1] = 0;
                    iArr[0] = 0;
                    int i2 = g ? 1 : 0;
                    if (h) {
                        i2 |= 2;
                    }
                    startNestedScroll(i2);
                    break;
                case 1:
                    this.mVelocityTracker.clear();
                    stopNestedScroll();
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        if (this.mScrollState != 1) {
                            int i3 = x2 - this.mInitialTouchX;
                            int i4 = y2 - this.mInitialTouchY;
                            if (!g || Math.abs(i3) <= this.mTouchSlop) {
                                z = false;
                            } else {
                                this.mLastTouchX = ((i3 < 0 ? -1 : 1) * this.mTouchSlop) + this.mInitialTouchX;
                                z = true;
                            }
                            if (h && Math.abs(i4) > this.mTouchSlop) {
                                int i5 = this.mInitialTouchY;
                                int i6 = this.mTouchSlop;
                                if (i4 >= 0) {
                                    i = 1;
                                }
                                this.mLastTouchY = i5 + (i * i6);
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                                break;
                            }
                        }
                    } else {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    break;
                case 3:
                    cancelTouch();
                    break;
                case 5:
                    this.mScrollPointerId = motionEvent.getPointerId(b);
                    int x3 = (int) (motionEvent.getX(b) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(b) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                    break;
                case 6:
                    onPointerUp(motionEvent);
                    break;
            }
            if (this.mScrollState != 1) {
                z2 = false;
            }
            return z2;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0817o.m4100a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C0817o.m4099a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = false;
        if (this.mLayout == null) {
            defaultOnMeasure(i, i2);
        } else if (this.mLayout.f5855B) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLayout.mo6862a(this.mRecycler, this.mState, i, i2);
            if (!z && this.mAdapter != null) {
                if (this.mState.f5921f == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo6909d(i, i2);
                this.mState.f5926k = true;
                dispatchLayoutStep2();
                this.mLayout.mo6913e(i, i2);
                if (this.mLayout.mo5858s()) {
                    this.mLayout.mo6909d(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f5926k = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo6913e(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo6862a(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                eatRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                if (this.mState.f5928m) {
                    this.mState.f5924i = true;
                } else {
                    this.mAdapterHelper.mo7409e();
                    this.mState.f5924i = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                resumeRequestLayout(false);
            }
            if (this.mAdapter != null) {
                this.mState.f5922g = this.mAdapter.getItemCount();
            } else {
                this.mState.f5922g = 0;
            }
            eatRequestLayout();
            this.mLayout.mo6862a(this.mRecycler, this.mState, i, i2);
            resumeRequestLayout(false);
            this.mState.f5924i = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1765r)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (C1765r) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.mo3092a());
        if (this.mLayout != null && this.mPendingSavedState.f5900b != null) {
            this.mLayout.mo5819a(this.mPendingSavedState.f5900b);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1765r rVar = new C1765r(super.onSaveInstanceState());
        if (this.mPendingSavedState != null) {
            rVar.mo7015a(this.mPendingSavedState);
        } else if (this.mLayout != null) {
            rVar.f5900b = this.mLayout.mo5841f();
        } else {
            rVar.f5900b = null;
        }
        return rVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        boolean z;
        boolean z2 = false;
        if (this.mLayoutFrozen || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchOnItemTouch(motionEvent)) {
            cancelTouch();
            return true;
        } else if (this.mLayout == null) {
            return false;
        } else {
            boolean g = this.mLayout.mo5845g();
            boolean h = this.mLayout.mo5847h();
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            int a = C1200x.m7131a(motionEvent);
            int b = C1200x.m7133b(motionEvent);
            if (a == 0) {
                int[] iArr = this.mNestedOffsets;
                this.mNestedOffsets[1] = 0;
                iArr[0] = 0;
            }
            obtain.offsetLocation((float) this.mNestedOffsets[0], (float) this.mNestedOffsets[1]);
            switch (a) {
                case 0:
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    int i3 = g ? 1 : 0;
                    if (h) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3);
                    break;
                case 1:
                    this.mVelocityTracker.addMovement(obtain);
                    this.mVelocityTracker.computeCurrentVelocity(1000, (float) this.mMaxFlingVelocity);
                    float f = g ? -C1035ap.m5841a(this.mVelocityTracker, this.mScrollPointerId) : 0.0f;
                    float f2 = h ? -C1035ap.m5842b(this.mVelocityTracker, this.mScrollPointerId) : 0.0f;
                    if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                        setScrollState(0);
                    }
                    resetTouch();
                    z2 = true;
                    break;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i4 = this.mLastTouchX - x2;
                        int i5 = this.mLastTouchY - y2;
                        if (dispatchNestedPreScroll(i4, i5, this.mScrollConsumed, this.mScrollOffset)) {
                            i4 -= this.mScrollConsumed[0];
                            i5 -= this.mScrollConsumed[1];
                            obtain.offsetLocation((float) this.mScrollOffset[0], (float) this.mScrollOffset[1]);
                            int[] iArr2 = this.mNestedOffsets;
                            iArr2[0] = iArr2[0] + this.mScrollOffset[0];
                            int[] iArr3 = this.mNestedOffsets;
                            iArr3[1] = iArr3[1] + this.mScrollOffset[1];
                        }
                        if (this.mScrollState != 1) {
                            if (!g || Math.abs(i) <= this.mTouchSlop) {
                                z = false;
                            } else {
                                i = i > 0 ? i - this.mTouchSlop : i + this.mTouchSlop;
                                z = true;
                            }
                            if (h && Math.abs(i2) > this.mTouchSlop) {
                                i2 = i2 > 0 ? i2 - this.mTouchSlop : i2 + this.mTouchSlop;
                                z = true;
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.mScrollState == 1) {
                            this.mLastTouchX = x2 - this.mScrollOffset[0];
                            this.mLastTouchY = y2 - this.mScrollOffset[1];
                            if (scrollByInternal(g ? i : 0, h ? i2 : 0, obtain)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            if (!(this.mGapWorker == null || (i == 0 && i2 == 0))) {
                                this.mGapWorker.mo6379a(this, i, i2);
                                break;
                            }
                        }
                    } else {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    break;
                case 3:
                    cancelTouch();
                    break;
                case 5:
                    this.mScrollPointerId = motionEvent.getPointerId(b);
                    int x3 = (int) (motionEvent.getX(b) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(b) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                    break;
                case 6:
                    onPointerUp(motionEvent);
                    break;
            }
            if (!z2) {
                this.mVelocityTracker.addMovement(obtain);
            }
            obtain.recycle();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C1040ar.m5895a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void recordAnimationInfoIfBouncedHiddenView(C1774x xVar, C1743e.C1747d dVar) {
        xVar.setFlags(0, 8192);
        if (this.mState.f5925j && xVar.isUpdated() && !xVar.isRemoved() && !xVar.shouldIgnore()) {
            this.mViewInfoStore.mo7331a(getChangedHolderKey(xVar), xVar);
        }
        this.mViewInfoStore.mo7332a(xVar, dVar);
    }

    /* access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo6355d();
        }
        if (this.mLayout != null) {
            this.mLayout.mo6902c(this.mRecycler);
            this.mLayout.mo6890b(this.mRecycler);
        }
        this.mRecycler.mo6978a();
    }

    /* access modifiers changed from: package-private */
    public boolean removeAnimatingView(View view) {
        eatRequestLayout();
        boolean f = this.mChildHelper.mo6265f(view);
        if (f) {
            C1774x childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo6998c(childViewHolderInt);
            this.mRecycler.mo6993b(childViewHolderInt);
        }
        resumeRequestLayout(!f);
        return f;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1774x childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt);
            }
        }
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C1749g gVar) {
        if (this.mLayout != null) {
            this.mLayout.mo5824a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(gVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnChildAttachStateChangeListener(C1756j jVar) {
        if (this.mOnChildAttachStateListeners != null) {
            this.mOnChildAttachStateListeners.remove(jVar);
        }
    }

    public void removeOnItemTouchListener(C1758l lVar) {
        this.mOnItemTouchListeners.remove(lVar);
        if (this.mActiveOnItemTouchListener == lVar) {
            this.mActiveOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C1759m mVar) {
        if (this.mScrollListeners != null) {
            this.mScrollListeners.remove(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void repositionShadowingViews() {
        int b = this.mChildHelper.mo6255b();
        for (int i = 0; i < b; i++) {
            View b2 = this.mChildHelper.mo6257b(i);
            C1774x childViewHolder = getChildViewHolder(b2);
            if (!(childViewHolder == null || childViewHolder.mShadowingHolder == null)) {
                View view = childViewHolder.mShadowingHolder.itemView;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.mo6879a(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo6880a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mEatRequestLayout != 0 || this.mLayoutFrozen) {
            this.mLayoutRequestEaten = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void resumeRequestLayout(boolean z) {
        if (this.mEatRequestLayout < 1) {
            this.mEatRequestLayout = 1;
        }
        if (!z) {
            this.mLayoutRequestEaten = false;
        }
        if (this.mEatRequestLayout == 1) {
            if (z && this.mLayoutRequestEaten && !this.mLayoutFrozen && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutFrozen) {
                this.mLayoutRequestEaten = false;
            }
        }
        this.mEatRequestLayout--;
    }

    /* access modifiers changed from: package-private */
    public void saveOldPositions() {
        int c = this.mChildHelper.mo6258c();
        for (int i = 0; i < c; i++) {
            C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutFrozen) {
            boolean g = this.mLayout.mo5845g();
            boolean h = this.mLayout.mo5847h();
            if (g || h) {
                if (!g) {
                    i = 0;
                }
                if (!h) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            eatRequestLayout();
            onEnterLayoutOrScroll();
            C0817o.m4100a(TRACE_SCROLL_TAG);
            if (i != 0) {
                i7 = this.mLayout.mo5777a(i, this.mRecycler, this.mState);
                i6 = i - i7;
            } else {
                i7 = 0;
                i6 = 0;
            }
            if (i2 != 0) {
                i8 = this.mLayout.mo5798b(i2, this.mRecycler, this.mState);
                i9 = i2 - i8;
            } else {
                i8 = 0;
                i9 = 0;
            }
            C0817o.m4099a();
            repositionShadowingViews();
            onExitLayoutOrScroll();
            resumeRequestLayout(false);
            i5 = i9;
            i4 = i7;
            i3 = i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        if (dispatchNestedScroll(i4, i3, i6, i5, this.mScrollOffset)) {
            this.mLastTouchX -= this.mScrollOffset[0];
            this.mLastTouchY -= this.mScrollOffset[1];
            if (motionEvent != null) {
                motionEvent.offsetLocation((float) this.mScrollOffset[0], (float) this.mScrollOffset[1]);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[0] = iArr[0] + this.mScrollOffset[0];
            int[] iArr2 = this.mNestedOffsets;
            iArr2[1] = iArr2[1] + this.mScrollOffset[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                pullGlows(motionEvent.getX(), (float) i6, motionEvent.getY(), (float) i5);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i4 == 0 && i3 == 0)) {
            dispatchOnScrolled(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (i4 == 0 && i3 == 0) ? false : true;
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutFrozen) {
            stopScroll();
            if (this.mLayout == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            this.mLayout.mo5838e(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1777ba baVar) {
        this.mAccessibilityDelegate = baVar;
        C1040ar.m5893a((View) this, (C1066b) this.mAccessibilityDelegate);
    }

    public void setAdapter(C1739a aVar) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1742d dVar) {
        if (dVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = dVar;
            setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
        }
    }

    /* access modifiers changed from: package-private */
    @C0020ao
    public boolean setChildImportantForAccessibilityInternal(C1774x xVar, int i) {
        if (isComputingLayout()) {
            xVar.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(xVar);
            return false;
        }
        C1040ar.m5926d(xVar.itemView, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void setDataSetChangedAfterLayout() {
        if (!this.mDataSetHasChangedAfterLayout) {
            this.mDataSetHasChangedAfterLayout = true;
            int c = this.mChildHelper.mo6258c();
            for (int i = 0; i < c; i++) {
                C1774x childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo6261d(i));
                if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.addFlags(512);
                }
            }
            this.mRecycler.mo7009h();
            markKnownViewsInvalid();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C1743e eVar) {
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo6355d();
            this.mItemAnimator.mo6805a((C1743e.C1746c) null);
        }
        this.mItemAnimator = eVar;
        if (this.mItemAnimator != null) {
            this.mItemAnimator.mo6805a(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo6979a(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.mLayoutFrozen) {
            assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.mLayoutFrozen = false;
                if (!(!this.mLayoutRequestEaten || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutRequestEaten = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutFrozen = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void setLayoutManager(C1750h hVar) {
        if (hVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                if (this.mItemAnimator != null) {
                    this.mItemAnimator.mo6355d();
                }
                this.mLayout.mo6902c(this.mRecycler);
                this.mLayout.mo6890b(this.mRecycler);
                this.mRecycler.mo6978a();
                if (this.mIsAttached) {
                    this.mLayout.mo6892b(this, this.mRecycler);
                }
                this.mLayout.mo6891b((C1732az) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo6978a();
            }
            this.mChildHelper.mo6249a();
            this.mLayout = hVar;
            if (hVar != null) {
                if (hVar.f5867v != null) {
                    throw new IllegalArgumentException("LayoutManager " + hVar + " is already attached to a RecyclerView: " + hVar.f5867v);
                }
                this.mLayout.mo6891b(this);
                if (this.mIsAttached) {
                    this.mLayout.mo6903c(this);
                }
            }
            this.mRecycler.mo6991b();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo3563a(z);
    }

    public void setOnFlingListener(@C0003aa C1757k kVar) {
        this.mOnFlingListener = kVar;
    }

    @Deprecated
    public void setOnScrollListener(C1759m mVar) {
        this.mScrollListener = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C1760n nVar) {
        this.mRecycler.mo6983a(nVar);
    }

    public void setRecyclerListener(C1763p pVar) {
        this.mRecyclerListener = pVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                break;
            case 1:
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
                break;
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C1772v vVar) {
        this.mRecycler.mo6984a(vVar);
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int c = accessibilityEvent != null ? C0922a.m4611c(accessibilityEvent) : 0;
        if (c != 0) {
            i = c;
        }
        this.mEatenAccessibilityChangeFlags = i | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        int i3 = 0;
        if (this.mLayout == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutFrozen) {
            if (!this.mLayout.mo5845g()) {
                i = 0;
            }
            if (this.mLayout.mo5847h()) {
                i3 = i2;
            }
            if (i != 0 || i3 != 0) {
                this.mViewFlinger.mo7064a(i, i3, interpolator);
            }
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutFrozen) {
            if (this.mLayout == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                this.mLayout.mo5821a(this, this.mState, i);
            }
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo3567a(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo3571c();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(C1739a aVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(aVar, true, z);
        setDataSetChangedAfterLayout();
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int c = this.mChildHelper.mo6258c();
        int i3 = i + i2;
        for (int i4 = 0; i4 < c; i4++) {
            View d = this.mChildHelper.mo6261d(i4);
            C1774x childViewHolderInt = getChildViewHolderInt(d);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i && childViewHolderInt.mPosition < i3) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C1755i) d.getLayoutParams()).f5880f = true;
            }
        }
        this.mRecycler.mo6997c(i, i2);
    }
}
