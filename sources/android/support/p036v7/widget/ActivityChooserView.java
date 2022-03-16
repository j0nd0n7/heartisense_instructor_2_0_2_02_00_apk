package android.support.p036v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1147e;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1573t;
import android.support.p036v7.widget.C1831e;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup implements C1831e.C1832a {

    /* renamed from: i */
    private static final String f5142i = "ActivityChooserView";

    /* renamed from: a */
    final C1593a f5143a;

    /* renamed from: b */
    final FrameLayout f5144b;

    /* renamed from: c */
    final FrameLayout f5145c;

    /* renamed from: d */
    C1147e f5146d;

    /* renamed from: e */
    final DataSetObserver f5147e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f5148f;

    /* renamed from: g */
    boolean f5149g;

    /* renamed from: h */
    int f5150h;

    /* renamed from: j */
    private final C1594b f5151j;

    /* renamed from: k */
    private final C1697an f5152k;

    /* renamed from: l */
    private final Drawable f5153l;

    /* renamed from: m */
    private final ImageView f5154m;

    /* renamed from: n */
    private final ImageView f5155n;

    /* renamed from: o */
    private final int f5156o;

    /* renamed from: p */
    private final ViewTreeObserver.OnGlobalLayoutListener f5157p;

    /* renamed from: q */
    private C1703aq f5158q;

    /* renamed from: r */
    private boolean f5159r;

    /* renamed from: s */
    private int f5160s;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends C1697an {

        /* renamed from: a */
        private static final int[] f5165a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1807bp a = C1807bp.m10922a(context, attributeSet, f5165a);
            setBackgroundDrawable(a.mo7293a(0));
            a.mo7308e();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C1593a extends BaseAdapter {

        /* renamed from: a */
        public static final int f5166a = Integer.MAX_VALUE;

        /* renamed from: b */
        public static final int f5167b = 4;

        /* renamed from: d */
        private static final int f5168d = 0;

        /* renamed from: e */
        private static final int f5169e = 1;

        /* renamed from: f */
        private static final int f5170f = 3;

        /* renamed from: g */
        private C1831e f5172g;

        /* renamed from: h */
        private int f5173h = 4;

        /* renamed from: i */
        private boolean f5174i;

        /* renamed from: j */
        private boolean f5175j;

        /* renamed from: k */
        private boolean f5176k;

        C1593a() {
        }

        /* renamed from: a */
        public int mo5738a() {
            int i = this.f5173h;
            this.f5173h = f5166a;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f5173h = i;
            return i2;
        }

        /* renamed from: a */
        public void mo5739a(int i) {
            if (this.f5173h != i) {
                this.f5173h = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo5740a(C1831e eVar) {
            C1831e e = ActivityChooserView.this.f5143a.mo5746e();
            if (e != null && ActivityChooserView.this.isShown()) {
                e.unregisterObserver(ActivityChooserView.this.f5147e);
            }
            this.f5172g = eVar;
            if (eVar != null && ActivityChooserView.this.isShown()) {
                eVar.registerObserver(ActivityChooserView.this.f5147e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo5741a(boolean z) {
            if (this.f5176k != z) {
                this.f5176k = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo5742a(boolean z, boolean z2) {
            if (this.f5174i != z || this.f5175j != z2) {
                this.f5174i = z;
                this.f5175j = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo mo5743b() {
            return this.f5172g.mo7378c();
        }

        /* renamed from: c */
        public int mo5744c() {
            return this.f5172g.mo7376b();
        }

        /* renamed from: d */
        public int mo5745d() {
            return this.f5172g.mo7382e();
        }

        /* renamed from: e */
        public C1831e mo5746e() {
            return this.f5172g;
        }

        /* renamed from: f */
        public boolean mo5747f() {
            return this.f5174i;
        }

        public int getCount() {
            int b = this.f5172g.mo7376b();
            if (!this.f5174i && this.f5172g.mo7378c() != null) {
                b--;
            }
            int min = Math.min(b, this.f5173h);
            return this.f5176k ? min + 1 : min;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f5174i && this.f5172g.mo7378c() != null) {
                        i++;
                    }
                    return this.f5172g.mo7372a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f5176k || i != getCount() + -1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C1359b.C1366g.list_item) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1359b.C1368i.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C1359b.C1366g.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C1359b.C1366g.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f5174i || i != 0 || !this.f5175j) {
                        C1040ar.m5927d(view, false);
                        return view;
                    }
                    C1040ar.m5927d(view, true);
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C1359b.C1368i.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(C1359b.C1366g.title)).setText(ActivityChooserView.this.getContext().getString(C1359b.C1369j.abc_activity_chooser_view_see_all));
                    return inflate;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C1594b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
        C1594b() {
        }

        /* renamed from: a */
        private void m9373a() {
            if (ActivityChooserView.this.f5148f != null) {
                ActivityChooserView.this.f5148f.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == ActivityChooserView.this.f5145c) {
                ActivityChooserView.this.mo5717b();
                Intent b = ActivityChooserView.this.f5143a.mo5746e().mo7377b(ActivityChooserView.this.f5143a.mo5746e().mo7370a(ActivityChooserView.this.f5143a.mo5743b()));
                if (b != null) {
                    b.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b);
                }
            } else if (view == ActivityChooserView.this.f5144b) {
                ActivityChooserView.this.f5149g = false;
                ActivityChooserView.this.mo5715a(ActivityChooserView.this.f5150h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m9373a();
            if (ActivityChooserView.this.f5146d != null) {
                ActivityChooserView.this.f5146d.mo3962a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C1593a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    ActivityChooserView.this.mo5717b();
                    if (!ActivityChooserView.this.f5149g) {
                        if (!ActivityChooserView.this.f5143a.mo5747f()) {
                            i++;
                        }
                        Intent b = ActivityChooserView.this.f5143a.mo5746e().mo7377b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        ActivityChooserView.this.f5143a.mo5746e().mo7379c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    ActivityChooserView.this.mo5715a(C1593a.f5166a);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.f5145c) {
                if (ActivityChooserView.this.f5143a.getCount() > 0) {
                    ActivityChooserView.this.f5149g = true;
                    ActivityChooserView.this.mo5715a(ActivityChooserView.this.f5150h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5147e = new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f5143a.notifyDataSetChanged();
            }

            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f5143a.notifyDataSetInvalidated();
            }
        };
        this.f5157p = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (!ActivityChooserView.this.mo5718c()) {
                    return;
                }
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().mo5289d();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().mo5279a();
                if (ActivityChooserView.this.f5146d != null) {
                    ActivityChooserView.this.f5146d.mo3962a(true);
                }
            }
        };
        this.f5150h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ActivityChooserView, i, 0);
        this.f5150h = obtainStyledAttributes.getInt(C1359b.C1371l.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1359b.C1371l.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C1359b.C1368i.abc_activity_chooser_view, this, true);
        this.f5151j = new C1594b();
        this.f5152k = (C1697an) findViewById(C1359b.C1366g.activity_chooser_view_content);
        this.f5153l = this.f5152k.getBackground();
        this.f5145c = (FrameLayout) findViewById(C1359b.C1366g.default_activity_button);
        this.f5145c.setOnClickListener(this.f5151j);
        this.f5145c.setOnLongClickListener(this.f5151j);
        this.f5155n = (ImageView) this.f5145c.findViewById(C1359b.C1366g.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C1359b.C1366g.expand_activities_button);
        frameLayout.setOnClickListener(this.f5151j);
        frameLayout.setOnTouchListener(new C1687ak(frameLayout) {
            /* renamed from: a */
            public C1573t mo5206a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public boolean mo5207b() {
                ActivityChooserView.this.mo5716a();
                return true;
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public boolean mo5736c() {
                ActivityChooserView.this.mo5717b();
                return true;
            }
        });
        this.f5144b = frameLayout;
        this.f5154m = (ImageView) frameLayout.findViewById(C1359b.C1366g.image);
        this.f5154m.setImageDrawable(drawable);
        this.f5143a = new C1593a();
        this.f5143a.registerDataSetObserver(new DataSetObserver() {
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mo5719d();
            }
        });
        Resources resources = context.getResources();
        this.f5156o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1359b.C1364e.abc_config_prefDialogWidth));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5715a(int i) {
        if (this.f5143a.mo5746e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f5157p);
        boolean z = this.f5145c.getVisibility() == 0;
        int c = this.f5143a.mo5744c();
        int i2 = z ? 1 : 0;
        if (i == Integer.MAX_VALUE || c <= i2 + i) {
            this.f5143a.mo5741a(false);
            this.f5143a.mo5739a(i);
        } else {
            this.f5143a.mo5741a(true);
            this.f5143a.mo5739a(i - 1);
        }
        C1703aq listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.mo5290e()) {
            if (this.f5149g || !z) {
                this.f5143a.mo5742a(true, z);
            } else {
                this.f5143a.mo5742a(false, false);
            }
            listPopupWindow.mo6477h(Math.min(this.f5143a.mo5738a(), this.f5156o));
            listPopupWindow.mo5279a();
            if (this.f5146d != null) {
                this.f5146d.mo3962a(true);
            }
            listPopupWindow.mo5292g().setContentDescription(getContext().getString(C1359b.C1369j.abc_activitychooserview_choose_application));
        }
    }

    /* renamed from: a */
    public boolean mo5716a() {
        if (mo5718c() || !this.f5159r) {
            return false;
        }
        this.f5149g = false;
        mo5715a(this.f5150h);
        return true;
    }

    /* renamed from: b */
    public boolean mo5717b() {
        if (!mo5718c()) {
            return true;
        }
        getListPopupWindow().mo5289d();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f5157p);
        return true;
    }

    /* renamed from: c */
    public boolean mo5718c() {
        return getListPopupWindow().mo5290e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5719d() {
        if (this.f5143a.getCount() > 0) {
            this.f5144b.setEnabled(true);
        } else {
            this.f5144b.setEnabled(false);
        }
        int c = this.f5143a.mo5744c();
        int d = this.f5143a.mo5745d();
        if (c == 1 || (c > 1 && d > 0)) {
            this.f5145c.setVisibility(0);
            ResolveInfo b = this.f5143a.mo5743b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f5155n.setImageDrawable(b.loadIcon(packageManager));
            if (this.f5160s != 0) {
                CharSequence loadLabel = b.loadLabel(packageManager);
                this.f5145c.setContentDescription(getContext().getString(this.f5160s, new Object[]{loadLabel}));
            }
        } else {
            this.f5145c.setVisibility(8);
        }
        if (this.f5145c.getVisibility() == 0) {
            this.f5152k.setBackgroundDrawable(this.f5153l);
        } else {
            this.f5152k.setBackgroundDrawable((Drawable) null);
        }
    }

    public C1831e getDataModel() {
        return this.f5143a.mo5746e();
    }

    /* access modifiers changed from: package-private */
    public C1703aq getListPopupWindow() {
        if (this.f5158q == null) {
            this.f5158q = new C1703aq(getContext());
            this.f5158q.mo6458a((ListAdapter) this.f5143a);
            this.f5158q.mo6464b((View) this);
            this.f5158q.mo6460a(true);
            this.f5158q.mo6456a((AdapterView.OnItemClickListener) this.f5151j);
            this.f5158q.mo6459a((PopupWindow.OnDismissListener) this.f5151j);
        }
        return this.f5158q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1831e e = this.f5143a.mo5746e();
        if (e != null) {
            e.registerObserver(this.f5147e);
        }
        this.f5159r = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1831e e = this.f5143a.mo5746e();
        if (e != null) {
            e.unregisterObserver(this.f5147e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f5157p);
        }
        if (mo5718c()) {
            mo5717b();
        }
        this.f5159r = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f5152k.layout(0, 0, i3 - i, i4 - i2);
        if (!mo5718c()) {
            mo5717b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1697an anVar = this.f5152k;
        if (this.f5145c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(anVar, i, i2);
        setMeasuredDimension(anVar.getMeasuredWidth(), anVar.getMeasuredHeight());
    }

    public void setActivityChooserModel(C1831e eVar) {
        this.f5143a.mo5740a(eVar);
        if (mo5718c()) {
            mo5717b();
            mo5716a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f5160s = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f5154m.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f5154m.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f5150h = i;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f5148f = onDismissListener;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setProvider(C1147e eVar) {
        this.f5146d = eVar;
    }
}
