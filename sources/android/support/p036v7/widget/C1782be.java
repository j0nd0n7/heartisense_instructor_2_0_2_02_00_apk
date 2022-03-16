package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p036v7.app.C1385a;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1521a;
import android.support.p036v7.widget.C1697an;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.be */
public class C1782be extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: g */
    private static final String f5956g = "ScrollingTabContainerView";

    /* renamed from: m */
    private static final Interpolator f5957m = new DecelerateInterpolator();

    /* renamed from: n */
    private static final int f5958n = 200;

    /* renamed from: a */
    Runnable f5959a;

    /* renamed from: b */
    C1697an f5960b;

    /* renamed from: c */
    int f5961c;

    /* renamed from: d */
    int f5962d;

    /* renamed from: e */
    protected C1112bo f5963e;

    /* renamed from: f */
    protected final C1787d f5964f = new C1787d();

    /* renamed from: h */
    private C1785b f5965h;

    /* renamed from: i */
    private Spinner f5966i;

    /* renamed from: j */
    private boolean f5967j;

    /* renamed from: k */
    private int f5968k;

    /* renamed from: l */
    private int f5969l;

    /* renamed from: android.support.v7.widget.be$a */
    private class C1784a extends BaseAdapter {
        C1784a() {
        }

        public int getCount() {
            return C1782be.this.f5960b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C1786c) C1782be.this.f5960b.getChildAt(i)).mo7185b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C1782be.this.mo7160a((C1385a.C1391f) getItem(i), true);
            }
            ((C1786c) view).mo7184a((C1385a.C1391f) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.be$b */
    private class C1785b implements View.OnClickListener {
        C1785b() {
        }

        public void onClick(View view) {
            ((C1786c) view).mo7185b().mo4699f();
            int childCount = C1782be.this.f5960b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C1782be.this.f5960b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.be$c */
    private class C1786c extends C1697an implements View.OnLongClickListener {

        /* renamed from: b */
        private final int[] f5975b = {16842964};

        /* renamed from: c */
        private C1385a.C1391f f5976c;

        /* renamed from: d */
        private TextView f5977d;

        /* renamed from: k */
        private ImageView f5978k;

        /* renamed from: l */
        private View f5979l;

        public C1786c(Context context, C1385a.C1391f fVar, boolean z) {
            super(context, (AttributeSet) null, C1359b.C1361b.actionBarTabStyle);
            this.f5976c = fVar;
            C1807bp a = C1807bp.m10923a(context, (AttributeSet) null, this.f5975b, C1359b.C1361b.actionBarTabStyle, 0);
            if (a.mo7316j(0)) {
                setBackgroundDrawable(a.mo7293a(0));
            }
            a.mo7308e();
            if (z) {
                setGravity(8388627);
            }
            mo7183a();
        }

        /* renamed from: a */
        public void mo7183a() {
            C1385a.C1391f fVar = this.f5976c;
            View d = fVar.mo4697d();
            if (d != null) {
                ViewParent parent = d.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d);
                    }
                    addView(d);
                }
                this.f5979l = d;
                if (this.f5977d != null) {
                    this.f5977d.setVisibility(8);
                }
                if (this.f5978k != null) {
                    this.f5978k.setVisibility(8);
                    this.f5978k.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            if (this.f5979l != null) {
                removeView(this.f5979l);
                this.f5979l = null;
            }
            Drawable b = fVar.mo4691b();
            CharSequence c = fVar.mo4695c();
            if (b != null) {
                if (this.f5978k == null) {
                    C1857q qVar = new C1857q(getContext());
                    C1697an.C1699b bVar = new C1697an.C1699b(-2, -2);
                    bVar.f5713h = 16;
                    qVar.setLayoutParams(bVar);
                    addView(qVar, 0);
                    this.f5978k = qVar;
                }
                this.f5978k.setImageDrawable(b);
                this.f5978k.setVisibility(0);
            } else if (this.f5978k != null) {
                this.f5978k.setVisibility(8);
                this.f5978k.setImageDrawable((Drawable) null);
            }
            boolean z = !TextUtils.isEmpty(c);
            if (z) {
                if (this.f5977d == null) {
                    C1664ab abVar = new C1664ab(getContext(), (AttributeSet) null, C1359b.C1361b.actionBarTabTextStyle);
                    abVar.setEllipsize(TextUtils.TruncateAt.END);
                    C1697an.C1699b bVar2 = new C1697an.C1699b(-2, -2);
                    bVar2.f5713h = 16;
                    abVar.setLayoutParams(bVar2);
                    addView(abVar);
                    this.f5977d = abVar;
                }
                this.f5977d.setText(c);
                this.f5977d.setVisibility(0);
            } else if (this.f5977d != null) {
                this.f5977d.setVisibility(8);
                this.f5977d.setText((CharSequence) null);
            }
            if (this.f5978k != null) {
                this.f5978k.setContentDescription(fVar.mo4700g());
            }
            if (z || TextUtils.isEmpty(fVar.mo4700g())) {
                setOnLongClickListener((View.OnLongClickListener) null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        /* renamed from: a */
        public void mo7184a(C1385a.C1391f fVar) {
            this.f5976c = fVar;
            mo7183a();
        }

        /* renamed from: b */
        public C1385a.C1391f mo7185b() {
            return this.f5976c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1385a.C1391f.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(C1385a.C1391f.class.getName());
            }
        }

        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.f5976c.mo4700g(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C1782be.this.f5961c > 0 && getMeasuredWidth() > C1782be.this.f5961c) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(C1782be.this.f5961c, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: android.support.v7.widget.be$d */
    protected class C1787d implements C1130bu {

        /* renamed from: b */
        private boolean f5981b = false;

        /* renamed from: c */
        private int f5982c;

        protected C1787d() {
        }

        /* renamed from: a */
        public C1787d mo7188a(C1112bo boVar, int i) {
            this.f5982c = i;
            C1782be.this.f5963e = boVar;
            return this;
        }

        /* renamed from: a */
        public void mo3893a(View view) {
            C1782be.this.setVisibility(0);
            this.f5981b = false;
        }

        /* renamed from: b */
        public void mo3894b(View view) {
            if (!this.f5981b) {
                C1782be.this.f5963e = null;
                C1782be.this.setVisibility(this.f5982c);
            }
        }

        /* renamed from: c */
        public void mo3895c(View view) {
            this.f5981b = true;
        }
    }

    public C1782be(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C1521a a = C1521a.m8870a(context);
        setContentHeight(a.mo5117e());
        this.f5962d = a.mo5119g();
        this.f5960b = m10803e();
        addView(this.f5960b, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: b */
    private boolean m10800b() {
        return this.f5966i != null && this.f5966i.getParent() == this;
    }

    /* renamed from: c */
    private void m10801c() {
        if (!m10800b()) {
            if (this.f5966i == null) {
                this.f5966i = m10804f();
            }
            removeView(this.f5960b);
            addView(this.f5966i, new ViewGroup.LayoutParams(-2, -1));
            if (this.f5966i.getAdapter() == null) {
                this.f5966i.setAdapter(new C1784a());
            }
            if (this.f5959a != null) {
                removeCallbacks(this.f5959a);
                this.f5959a = null;
            }
            this.f5966i.setSelection(this.f5969l);
        }
    }

    /* renamed from: d */
    private boolean m10802d() {
        if (m10800b()) {
            removeView(this.f5966i);
            addView(this.f5960b, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f5966i.getSelectedItemPosition());
        }
        return false;
    }

    /* renamed from: e */
    private C1697an m10803e() {
        C1697an anVar = new C1697an(getContext(), (AttributeSet) null, C1359b.C1361b.actionBarTabBarStyle);
        anVar.setMeasureWithLargestChildEnabled(true);
        anVar.setGravity(17);
        anVar.setLayoutParams(new C1697an.C1699b(-2, -1));
        return anVar;
    }

    /* renamed from: f */
    private Spinner m10804f() {
        C1866y yVar = new C1866y(getContext(), (AttributeSet) null, C1359b.C1361b.actionDropDownStyle);
        yVar.setLayoutParams(new C1697an.C1699b(-2, -1));
        yVar.setOnItemSelectedListener(this);
        return yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1786c mo7160a(C1385a.C1391f fVar, boolean z) {
        C1786c cVar = new C1786c(getContext(), fVar, z);
        if (z) {
            cVar.setBackgroundDrawable((Drawable) null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f5968k));
        } else {
            cVar.setFocusable(true);
            if (this.f5965h == null) {
                this.f5965h = new C1785b();
            }
            cVar.setOnClickListener(this.f5965h);
        }
        return cVar;
    }

    /* renamed from: a */
    public void mo7161a() {
        this.f5960b.removeAllViews();
        if (this.f5966i != null) {
            ((C1784a) this.f5966i.getAdapter()).notifyDataSetChanged();
        }
        if (this.f5967j) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo7162a(int i) {
        if (this.f5963e != null) {
            this.f5963e.mo3831d();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                C1040ar.m5920c((View) this, 0.0f);
            }
            C1112bo a = C1040ar.m5851A(this).mo3818a(1.0f);
            a.mo3819a(200);
            a.mo3822a(f5957m);
            a.mo3820a((C1130bu) this.f5964f.mo7188a(a, i));
            a.mo3833e();
            return;
        }
        C1112bo a2 = C1040ar.m5851A(this).mo3818a(0.0f);
        a2.mo3819a(200);
        a2.mo3822a(f5957m);
        a2.mo3820a((C1130bu) this.f5964f.mo7188a(a2, i));
        a2.mo3833e();
    }

    /* renamed from: a */
    public void mo7163a(C1385a.C1391f fVar, int i, boolean z) {
        C1786c a = mo7160a(fVar, false);
        this.f5960b.addView(a, i, new C1697an.C1699b(0, -1, 1.0f));
        if (this.f5966i != null) {
            ((C1784a) this.f5966i.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            a.setSelected(true);
        }
        if (this.f5967j) {
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo7164b(int i) {
        final View childAt = this.f5960b.getChildAt(i);
        if (this.f5959a != null) {
            removeCallbacks(this.f5959a);
        }
        this.f5959a = new Runnable() {
            public void run() {
                C1782be.this.smoothScrollTo(childAt.getLeft() - ((C1782be.this.getWidth() - childAt.getWidth()) / 2), 0);
                C1782be.this.f5959a = null;
            }
        };
        post(this.f5959a);
    }

    /* renamed from: b */
    public void mo7165b(C1385a.C1391f fVar, boolean z) {
        C1786c a = mo7160a(fVar, false);
        this.f5960b.addView(a, new C1697an.C1699b(0, -1, 1.0f));
        if (this.f5966i != null) {
            ((C1784a) this.f5966i.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            a.setSelected(true);
        }
        if (this.f5967j) {
            requestLayout();
        }
    }

    /* renamed from: c */
    public void mo7166c(int i) {
        ((C1786c) this.f5960b.getChildAt(i)).mo7183a();
        if (this.f5966i != null) {
            ((C1784a) this.f5966i.getAdapter()).notifyDataSetChanged();
        }
        if (this.f5967j) {
            requestLayout();
        }
    }

    /* renamed from: d */
    public void mo7167d(int i) {
        this.f5960b.removeViewAt(i);
        if (this.f5966i != null) {
            ((C1784a) this.f5966i.getAdapter()).notifyDataSetChanged();
        }
        if (this.f5967j) {
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5959a != null) {
            post(this.f5959a);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1521a a = C1521a.m8870a(getContext());
        setContentHeight(a.mo5117e());
        this.f5962d = a.mo5119g();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5959a != null) {
            removeCallbacks(this.f5959a);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C1786c) view).mo7185b().mo4699f();
    }

    public void onMeasure(int i, int i2) {
        boolean z = true;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f5960b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f5961c = -1;
        } else {
            if (childCount > 2) {
                this.f5961c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f5961c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f5961c = Math.min(this.f5961c, this.f5962d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5968k, 1073741824);
        if (z2 || !this.f5967j) {
            z = false;
        }
        if (z) {
            this.f5960b.measure(0, makeMeasureSpec);
            if (this.f5960b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m10801c();
            } else {
                m10802d();
            }
        } else {
            m10802d();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f5969l);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f5967j = z;
    }

    public void setContentHeight(int i) {
        this.f5968k = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f5969l = i;
        int childCount = this.f5960b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f5960b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo7164b(i);
            }
            i2++;
        }
        if (this.f5966i != null && i >= 0) {
            this.f5966i.setSelection(i);
        }
    }
}
