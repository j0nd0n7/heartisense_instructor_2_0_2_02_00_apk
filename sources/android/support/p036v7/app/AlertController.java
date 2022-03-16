package android.support.p036v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.C0003aa;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.widget.NestedScrollView;
import android.support.p036v7.p037a.C1359b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    private boolean f4194A = false;

    /* renamed from: B */
    private CharSequence f4195B;

    /* renamed from: C */
    private CharSequence f4196C;

    /* renamed from: D */
    private CharSequence f4197D;

    /* renamed from: E */
    private int f4198E = 0;

    /* renamed from: F */
    private Drawable f4199F;

    /* renamed from: G */
    private ImageView f4200G;

    /* renamed from: H */
    private TextView f4201H;

    /* renamed from: I */
    private TextView f4202I;

    /* renamed from: J */
    private View f4203J;

    /* renamed from: K */
    private int f4204K;

    /* renamed from: L */
    private int f4205L;

    /* renamed from: M */
    private boolean f4206M;

    /* renamed from: N */
    private int f4207N = 0;

    /* renamed from: O */
    private final View.OnClickListener f4208O = new View.OnClickListener() {
        public void onClick(View view) {
            Message obtain = (view != AlertController.this.f4211c || AlertController.this.f4212d == null) ? (view != AlertController.this.f4213e || AlertController.this.f4214f == null) ? (view != AlertController.this.f4215g || AlertController.this.f4216h == null) ? null : Message.obtain(AlertController.this.f4216h) : Message.obtain(AlertController.this.f4214f) : Message.obtain(AlertController.this.f4212d);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController.this.f4224p.obtainMessage(1, AlertController.this.f4209a).sendToTarget();
        }
    };

    /* renamed from: a */
    final C1448o f4209a;

    /* renamed from: b */
    ListView f4210b;

    /* renamed from: c */
    Button f4211c;

    /* renamed from: d */
    Message f4212d;

    /* renamed from: e */
    Button f4213e;

    /* renamed from: f */
    Message f4214f;

    /* renamed from: g */
    Button f4215g;

    /* renamed from: h */
    Message f4216h;

    /* renamed from: i */
    NestedScrollView f4217i;

    /* renamed from: j */
    ListAdapter f4218j;

    /* renamed from: k */
    int f4219k = -1;

    /* renamed from: l */
    int f4220l;

    /* renamed from: m */
    int f4221m;

    /* renamed from: n */
    int f4222n;

    /* renamed from: o */
    int f4223o;

    /* renamed from: p */
    Handler f4224p;

    /* renamed from: q */
    private final Context f4225q;

    /* renamed from: r */
    private final Window f4226r;

    /* renamed from: s */
    private CharSequence f4227s;

    /* renamed from: t */
    private CharSequence f4228t;

    /* renamed from: u */
    private View f4229u;

    /* renamed from: v */
    private int f4230v;

    /* renamed from: w */
    private int f4231w;

    /* renamed from: x */
    private int f4232x;

    /* renamed from: y */
    private int f4233y;

    /* renamed from: z */
    private int f4234z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f4248a;

        /* renamed from: b */
        private final int f4249b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.RecycleListView);
            this.f4249b = obtainStyledAttributes.getDimensionPixelOffset(C1359b.C1371l.RecycleListView_paddingBottomNoButtons, -1);
            this.f4248a = obtainStyledAttributes.getDimensionPixelOffset(C1359b.C1371l.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo4596a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f4248a, getPaddingRight(), z2 ? getPaddingBottom() : this.f4249b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C1377a {

        /* renamed from: A */
        public int f4250A;

        /* renamed from: B */
        public boolean f4251B = false;

        /* renamed from: C */
        public boolean[] f4252C;

        /* renamed from: D */
        public boolean f4253D;

        /* renamed from: E */
        public boolean f4254E;

        /* renamed from: F */
        public int f4255F = -1;

        /* renamed from: G */
        public DialogInterface.OnMultiChoiceClickListener f4256G;

        /* renamed from: H */
        public Cursor f4257H;

        /* renamed from: I */
        public String f4258I;

        /* renamed from: J */
        public String f4259J;

        /* renamed from: K */
        public boolean f4260K;

        /* renamed from: L */
        public AdapterView.OnItemSelectedListener f4261L;

        /* renamed from: M */
        public C1382a f4262M;

        /* renamed from: N */
        public boolean f4263N = true;

        /* renamed from: a */
        public final Context f4264a;

        /* renamed from: b */
        public final LayoutInflater f4265b;

        /* renamed from: c */
        public int f4266c = 0;

        /* renamed from: d */
        public Drawable f4267d;

        /* renamed from: e */
        public int f4268e = 0;

        /* renamed from: f */
        public CharSequence f4269f;

        /* renamed from: g */
        public View f4270g;

        /* renamed from: h */
        public CharSequence f4271h;

        /* renamed from: i */
        public CharSequence f4272i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f4273j;

        /* renamed from: k */
        public CharSequence f4274k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f4275l;

        /* renamed from: m */
        public CharSequence f4276m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f4277n;

        /* renamed from: o */
        public boolean f4278o;

        /* renamed from: p */
        public DialogInterface.OnCancelListener f4279p;

        /* renamed from: q */
        public DialogInterface.OnDismissListener f4280q;

        /* renamed from: r */
        public DialogInterface.OnKeyListener f4281r;

        /* renamed from: s */
        public CharSequence[] f4282s;

        /* renamed from: t */
        public ListAdapter f4283t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f4284u;

        /* renamed from: v */
        public int f4285v;

        /* renamed from: w */
        public View f4286w;

        /* renamed from: x */
        public int f4287x;

        /* renamed from: y */
        public int f4288y;

        /* renamed from: z */
        public int f4289z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C1382a {
            /* renamed from: a */
            void mo4603a(ListView listView);
        }

        public C1377a(Context context) {
            this.f4264a = context;
            this.f4278o = true;
            this.f4265b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m7967b(final AlertController alertController) {
            ListAdapter simpleCursorAdapter;
            final RecycleListView recycleListView = (RecycleListView) this.f4265b.inflate(alertController.f4220l, (ViewGroup) null);
            if (!this.f4253D) {
                int i = this.f4254E ? alertController.f4222n : alertController.f4223o;
                simpleCursorAdapter = this.f4257H != null ? new SimpleCursorAdapter(this.f4264a, i, this.f4257H, new String[]{this.f4258I}, new int[]{16908308}) : this.f4283t != null ? this.f4283t : new C1384c(this.f4264a, i, 16908308, this.f4282s);
            } else if (this.f4257H == null) {
                simpleCursorAdapter = new ArrayAdapter<CharSequence>(this.f4264a, alertController.f4221m, 16908308, this.f4282s) {
                    public View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        if (C1377a.this.f4252C != null && C1377a.this.f4252C[i]) {
                            recycleListView.setItemChecked(i, true);
                        }
                        return view2;
                    }
                };
            } else {
                final AlertController alertController2 = alertController;
                simpleCursorAdapter = new CursorAdapter(this.f4264a, this.f4257H, false) {

                    /* renamed from: d */
                    private final int f4295d;

                    /* renamed from: e */
                    private final int f4296e;

                    {
                        Cursor cursor = getCursor();
                        this.f4295d = cursor.getColumnIndexOrThrow(C1377a.this.f4258I);
                        this.f4296e = cursor.getColumnIndexOrThrow(C1377a.this.f4259J);
                    }

                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f4295d));
                        recycleListView.setItemChecked(cursor.getPosition(), cursor.getInt(this.f4296e) == 1);
                    }

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return C1377a.this.f4265b.inflate(alertController2.f4221m, viewGroup, false);
                    }
                };
            }
            if (this.f4262M != null) {
                this.f4262M.mo4603a(recycleListView);
            }
            alertController.f4218j = simpleCursorAdapter;
            alertController.f4219k = this.f4255F;
            if (this.f4284u != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        C1377a.this.f4284u.onClick(alertController.f4209a, i);
                        if (!C1377a.this.f4254E) {
                            alertController.f4209a.dismiss();
                        }
                    }
                });
            } else if (this.f4256G != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        if (C1377a.this.f4252C != null) {
                            C1377a.this.f4252C[i] = recycleListView.isItemChecked(i);
                        }
                        C1377a.this.f4256G.onClick(alertController.f4209a, i, recycleListView.isItemChecked(i));
                    }
                });
            }
            if (this.f4261L != null) {
                recycleListView.setOnItemSelectedListener(this.f4261L);
            }
            if (this.f4254E) {
                recycleListView.setChoiceMode(1);
            } else if (this.f4253D) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f4210b = recycleListView;
        }

        /* renamed from: a */
        public void mo4597a(AlertController alertController) {
            if (this.f4270g != null) {
                alertController.mo4584b(this.f4270g);
            } else {
                if (this.f4269f != null) {
                    alertController.mo4580a(this.f4269f);
                }
                if (this.f4267d != null) {
                    alertController.mo4578a(this.f4267d);
                }
                if (this.f4266c != 0) {
                    alertController.mo4587c(this.f4266c);
                }
                if (this.f4268e != 0) {
                    alertController.mo4587c(alertController.mo4589d(this.f4268e));
                }
            }
            if (this.f4271h != null) {
                alertController.mo4585b(this.f4271h);
            }
            if (this.f4272i != null) {
                alertController.mo4577a(-1, this.f4272i, this.f4273j, (Message) null);
            }
            if (this.f4274k != null) {
                alertController.mo4577a(-2, this.f4274k, this.f4275l, (Message) null);
            }
            if (this.f4276m != null) {
                alertController.mo4577a(-3, this.f4276m, this.f4277n, (Message) null);
            }
            if (!(this.f4282s == null && this.f4257H == null && this.f4283t == null)) {
                m7967b(alertController);
            }
            if (this.f4286w != null) {
                if (this.f4251B) {
                    alertController.mo4579a(this.f4286w, this.f4287x, this.f4288y, this.f4289z, this.f4250A);
                    return;
                }
                alertController.mo4588c(this.f4286w);
            } else if (this.f4285v != 0) {
                alertController.mo4576a(this.f4285v);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C1383b extends Handler {

        /* renamed from: a */
        private static final int f4302a = 1;

        /* renamed from: b */
        private WeakReference<DialogInterface> f4303b;

        public C1383b(DialogInterface dialogInterface) {
            this.f4303b = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f4303b.get(), message.what);
                    return;
                case 1:
                    ((DialogInterface) message.obj).dismiss();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C1384c extends ArrayAdapter<CharSequence> {
        public C1384c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C1448o oVar, Window window) {
        this.f4225q = context;
        this.f4209a = oVar;
        this.f4226r = window;
        this.f4224p = new C1383b(oVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C1359b.C1371l.AlertDialog, C1359b.C1361b.alertDialogStyle, 0);
        this.f4204K = obtainStyledAttributes.getResourceId(C1359b.C1371l.AlertDialog_android_layout, 0);
        this.f4205L = obtainStyledAttributes.getResourceId(C1359b.C1371l.AlertDialog_buttonPanelSideLayout, 0);
        this.f4220l = obtainStyledAttributes.getResourceId(C1359b.C1371l.AlertDialog_listLayout, 0);
        this.f4221m = obtainStyledAttributes.getResourceId(C1359b.C1371l.AlertDialog_multiChoiceItemLayout, 0);
        this.f4222n = obtainStyledAttributes.getResourceId(C1359b.C1371l.AlertDialog_singleChoiceItemLayout, 0);
        this.f4223o = obtainStyledAttributes.getResourceId(C1359b.C1371l.AlertDialog_listItemLayout, 0);
        this.f4206M = obtainStyledAttributes.getBoolean(C1359b.C1371l.AlertDialog_showTitle, true);
        obtainStyledAttributes.recycle();
        oVar.mo4956e(1);
    }

    @C0003aa
    /* renamed from: a */
    private ViewGroup m7937a(@C0003aa View view, @C0003aa View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    /* renamed from: a */
    static void m7938a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(C1040ar.m5919b(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!C1040ar.m5919b(view, 1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m7939a(ViewGroup viewGroup) {
        boolean z = false;
        View inflate = this.f4229u != null ? this.f4229u : this.f4230v != 0 ? LayoutInflater.from(this.f4225q).inflate(this.f4230v, viewGroup, false) : null;
        if (inflate != null) {
            z = true;
        }
        if (!z || !m7943a(inflate)) {
            this.f4226r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f4226r.findViewById(C1359b.C1366g.custom);
            frameLayout.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
            if (this.f4194A) {
                frameLayout.setPadding(this.f4231w, this.f4232x, this.f4233y, this.f4234z);
            }
            if (this.f4210b != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m7940a(ViewGroup viewGroup, View view, int i, int i2) {
        final View view2 = null;
        final View findViewById = this.f4226r.findViewById(C1359b.C1366g.scrollIndicatorUp);
        View findViewById2 = this.f4226r.findViewById(C1359b.C1366g.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C1040ar.m5882a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f4228t != null) {
                this.f4217i.setOnScrollChangeListener(new NestedScrollView.C1208b() {
                    /* renamed from: a */
                    public void mo4074a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m7938a(nestedScrollView, findViewById, view2);
                    }
                });
                this.f4217i.post(new Runnable() {
                    public void run() {
                        AlertController.m7938a(AlertController.this.f4217i, findViewById, view2);
                    }
                });
            } else if (this.f4210b != null) {
                this.f4210b.setOnScrollListener(new AbsListView.OnScrollListener() {
                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m7938a(absListView, findViewById, view2);
                    }

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }
                });
                this.f4210b.post(new Runnable() {
                    public void run() {
                        AlertController.m7938a(AlertController.this.f4210b, findViewById, view2);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m7941a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m7942a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1359b.C1361b.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m7943a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m7943a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m7944b(ViewGroup viewGroup) {
        if (this.f4203J != null) {
            viewGroup.addView(this.f4203J, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f4226r.findViewById(C1359b.C1366g.title_template).setVisibility(8);
            return;
        }
        this.f4200G = (ImageView) this.f4226r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f4227s)) || !this.f4206M) {
            this.f4226r.findViewById(C1359b.C1366g.title_template).setVisibility(8);
            this.f4200G.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f4201H = (TextView) this.f4226r.findViewById(C1359b.C1366g.alertTitle);
        this.f4201H.setText(this.f4227s);
        if (this.f4198E != 0) {
            this.f4200G.setImageResource(this.f4198E);
        } else if (this.f4199F != null) {
            this.f4200G.setImageDrawable(this.f4199F);
        } else {
            this.f4201H.setPadding(this.f4200G.getPaddingLeft(), this.f4200G.getPaddingTop(), this.f4200G.getPaddingRight(), this.f4200G.getPaddingBottom());
            this.f4200G.setVisibility(8);
        }
    }

    /* renamed from: c */
    private int m7945c() {
        return this.f4205L == 0 ? this.f4204K : this.f4207N == 1 ? this.f4205L : this.f4204K;
    }

    /* renamed from: c */
    private void m7946c(ViewGroup viewGroup) {
        this.f4217i = (NestedScrollView) this.f4226r.findViewById(C1359b.C1366g.scrollView);
        this.f4217i.setFocusable(false);
        this.f4217i.setNestedScrollingEnabled(false);
        this.f4202I = (TextView) viewGroup.findViewById(16908299);
        if (this.f4202I != null) {
            if (this.f4228t != null) {
                this.f4202I.setText(this.f4228t);
                return;
            }
            this.f4202I.setVisibility(8);
            this.f4217i.removeView(this.f4202I);
            if (this.f4210b != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f4217i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f4217i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f4210b, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m7947d() {
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f4226r.findViewById(C1359b.C1366g.parentPanel);
        View findViewById4 = findViewById3.findViewById(C1359b.C1366g.topPanel);
        View findViewById5 = findViewById3.findViewById(C1359b.C1366g.contentPanel);
        View findViewById6 = findViewById3.findViewById(C1359b.C1366g.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C1359b.C1366g.customPanel);
        m7939a(viewGroup);
        View findViewById7 = viewGroup.findViewById(C1359b.C1366g.topPanel);
        View findViewById8 = viewGroup.findViewById(C1359b.C1366g.contentPanel);
        View findViewById9 = viewGroup.findViewById(C1359b.C1366g.buttonPanel);
        ViewGroup a = m7937a(findViewById7, findViewById4);
        ViewGroup a2 = m7937a(findViewById8, findViewById5);
        ViewGroup a3 = m7937a(findViewById9, findViewById6);
        m7946c(a2);
        m7948d(a3);
        m7944b(a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C1359b.C1366g.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            if (this.f4217i != null) {
                this.f4217i.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f4228t == null && this.f4210b == null && !z) && !z) {
                view = a.findViewById(C1359b.C1366g.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C1359b.C1366g.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        if (this.f4210b instanceof RecycleListView) {
            ((RecycleListView) this.f4210b).mo4596a(z2, z3);
        }
        if (!z) {
            ViewGroup viewGroup2 = this.f4210b != null ? this.f4210b : this.f4217i;
            if (viewGroup2 != null) {
                m7940a(a2, (View) viewGroup2, (z3 ? 2 : 0) | (z2 ? 1 : 0), 3);
            }
        }
        ListView listView = this.f4210b;
        if (listView != null && this.f4218j != null) {
            listView.setAdapter(this.f4218j);
            int i = this.f4219k;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }

    /* renamed from: d */
    private void m7948d(ViewGroup viewGroup) {
        boolean z;
        boolean z2 = true;
        this.f4211c = (Button) viewGroup.findViewById(16908313);
        this.f4211c.setOnClickListener(this.f4208O);
        if (TextUtils.isEmpty(this.f4195B)) {
            this.f4211c.setVisibility(8);
            z = false;
        } else {
            this.f4211c.setText(this.f4195B);
            this.f4211c.setVisibility(0);
            z = true;
        }
        this.f4213e = (Button) viewGroup.findViewById(16908314);
        this.f4213e.setOnClickListener(this.f4208O);
        if (TextUtils.isEmpty(this.f4196C)) {
            this.f4213e.setVisibility(8);
        } else {
            this.f4213e.setText(this.f4196C);
            this.f4213e.setVisibility(0);
            z |= true;
        }
        this.f4215g = (Button) viewGroup.findViewById(16908315);
        this.f4215g.setOnClickListener(this.f4208O);
        if (TextUtils.isEmpty(this.f4197D)) {
            this.f4215g.setVisibility(8);
        } else {
            this.f4215g.setText(this.f4197D);
            this.f4215g.setVisibility(0);
            z |= true;
        }
        if (m7942a(this.f4225q)) {
            if (z) {
                m7941a(this.f4211c);
            } else if (z) {
                m7941a(this.f4213e);
            } else if (z) {
                m7941a(this.f4215g);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo4575a() {
        this.f4209a.setContentView(m7945c());
        m7947d();
    }

    /* renamed from: a */
    public void mo4576a(int i) {
        this.f4229u = null;
        this.f4230v = i;
        this.f4194A = false;
    }

    /* renamed from: a */
    public void mo4577a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f4224p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f4197D = charSequence;
                this.f4216h = message;
                return;
            case -2:
                this.f4196C = charSequence;
                this.f4214f = message;
                return;
            case -1:
                this.f4195B = charSequence;
                this.f4212d = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo4578a(Drawable drawable) {
        this.f4199F = drawable;
        this.f4198E = 0;
        if (this.f4200G == null) {
            return;
        }
        if (drawable != null) {
            this.f4200G.setVisibility(0);
            this.f4200G.setImageDrawable(drawable);
            return;
        }
        this.f4200G.setVisibility(8);
    }

    /* renamed from: a */
    public void mo4579a(View view, int i, int i2, int i3, int i4) {
        this.f4229u = view;
        this.f4230v = 0;
        this.f4194A = true;
        this.f4231w = i;
        this.f4232x = i2;
        this.f4233y = i3;
        this.f4234z = i4;
    }

    /* renamed from: a */
    public void mo4580a(CharSequence charSequence) {
        this.f4227s = charSequence;
        if (this.f4201H != null) {
            this.f4201H.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo4581a(int i, KeyEvent keyEvent) {
        return this.f4217i != null && this.f4217i.mo4034a(keyEvent);
    }

    /* renamed from: b */
    public ListView mo4582b() {
        return this.f4210b;
    }

    /* renamed from: b */
    public void mo4583b(int i) {
        this.f4207N = i;
    }

    /* renamed from: b */
    public void mo4584b(View view) {
        this.f4203J = view;
    }

    /* renamed from: b */
    public void mo4585b(CharSequence charSequence) {
        this.f4228t = charSequence;
        if (this.f4202I != null) {
            this.f4202I.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo4586b(int i, KeyEvent keyEvent) {
        return this.f4217i != null && this.f4217i.mo4034a(keyEvent);
    }

    /* renamed from: c */
    public void mo4587c(int i) {
        this.f4199F = null;
        this.f4198E = i;
        if (this.f4200G == null) {
            return;
        }
        if (i != 0) {
            this.f4200G.setVisibility(0);
            this.f4200G.setImageResource(this.f4198E);
            return;
        }
        this.f4200G.setVisibility(8);
    }

    /* renamed from: c */
    public void mo4588c(View view) {
        this.f4229u = view;
        this.f4230v = 0;
        this.f4194A = false;
    }

    /* renamed from: d */
    public int mo4589d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f4225q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public Button mo4590e(int i) {
        switch (i) {
            case -3:
                return this.f4215g;
            case -2:
                return this.f4213e;
            case -1:
                return this.f4211c;
            default:
                return null;
        }
    }
}
