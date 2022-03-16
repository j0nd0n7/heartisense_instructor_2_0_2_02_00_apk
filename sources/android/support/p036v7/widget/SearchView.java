package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.p010v4.p014d.p016b.C0420a;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.view.C0919a;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1167k;
import android.support.p010v4.widget.C1302h;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1524c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C1697an implements C1524c {

    /* renamed from: a */
    static final boolean f5260a = false;

    /* renamed from: b */
    static final String f5261b = "SearchView";

    /* renamed from: q */
    static final C1616a f5262q = new C1616a();

    /* renamed from: s */
    private static final String f5263s = "nm";

    /* renamed from: A */
    private int[] f5264A;

    /* renamed from: B */
    private int[] f5265B;

    /* renamed from: C */
    private final ImageView f5266C;

    /* renamed from: D */
    private final Drawable f5267D;

    /* renamed from: E */
    private final int f5268E;

    /* renamed from: F */
    private final int f5269F;

    /* renamed from: G */
    private final Intent f5270G;

    /* renamed from: H */
    private final Intent f5271H;

    /* renamed from: I */
    private final CharSequence f5272I;

    /* renamed from: J */
    private C1618c f5273J;

    /* renamed from: K */
    private C1617b f5274K;

    /* renamed from: L */
    private C1619d f5275L;

    /* renamed from: M */
    private View.OnClickListener f5276M;

    /* renamed from: N */
    private boolean f5277N;

    /* renamed from: O */
    private boolean f5278O;

    /* renamed from: P */
    private boolean f5279P;

    /* renamed from: Q */
    private CharSequence f5280Q;

    /* renamed from: R */
    private boolean f5281R;

    /* renamed from: S */
    private boolean f5282S;

    /* renamed from: T */
    private int f5283T;

    /* renamed from: U */
    private boolean f5284U;

    /* renamed from: V */
    private CharSequence f5285V;

    /* renamed from: W */
    private CharSequence f5286W;

    /* renamed from: aa */
    private boolean f5287aa;

    /* renamed from: ab */
    private int f5288ab;

    /* renamed from: ac */
    private Bundle f5289ac;

    /* renamed from: ad */
    private Runnable f5290ad;

    /* renamed from: ae */
    private final Runnable f5291ae;

    /* renamed from: af */
    private Runnable f5292af;

    /* renamed from: ag */
    private final WeakHashMap<String, Drawable.ConstantState> f5293ag;

    /* renamed from: ah */
    private final View.OnClickListener f5294ah;

    /* renamed from: ai */
    private final TextView.OnEditorActionListener f5295ai;

    /* renamed from: aj */
    private final AdapterView.OnItemClickListener f5296aj;

    /* renamed from: ak */
    private final AdapterView.OnItemSelectedListener f5297ak;

    /* renamed from: al */
    private TextWatcher f5298al;

    /* renamed from: c */
    final SearchAutoComplete f5299c;

    /* renamed from: d */
    final ImageView f5300d;

    /* renamed from: k */
    final ImageView f5301k;

    /* renamed from: l */
    final ImageView f5302l;

    /* renamed from: m */
    final ImageView f5303m;

    /* renamed from: n */
    View.OnFocusChangeListener f5304n;

    /* renamed from: o */
    C1302h f5305o;

    /* renamed from: p */
    SearchableInfo f5306p;

    /* renamed from: r */
    View.OnKeyListener f5307r;

    /* renamed from: t */
    private final View f5308t;

    /* renamed from: u */
    private final View f5309u;

    /* renamed from: v */
    private final View f5310v;

    /* renamed from: w */
    private final View f5311w;

    /* renamed from: x */
    private C1622f f5312x;

    /* renamed from: y */
    private Rect f5313y;

    /* renamed from: z */
    private Rect f5314z;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C1842g {

        /* renamed from: a */
        private int f5327a;

        /* renamed from: b */
        private SearchView f5328b;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1359b.C1361b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f5327a = getThreshold();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m9593a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int b = C0420a.m2328b(getResources());
            int a = C0420a.m2327a(getResources());
            if (b < 960 || a < 720 || configuration.orientation != 2) {
                return (b >= 600 || (b >= 640 && a >= 480)) ? 192 : 160;
            }
            return 256;
        }

        public boolean enoughToFilter() {
            return this.f5327a <= 0 || super.enoughToFilter();
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f5328b.mo5910o();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5328b.clearFocus();
                        this.f5328b.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f5328b.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.m9556a(getContext())) {
                    SearchView.f5262q.mo5961a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f5328b = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f5327a = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C1616a {

        /* renamed from: a */
        private Method f5329a;

        /* renamed from: b */
        private Method f5330b;

        /* renamed from: c */
        private Method f5331c;

        /* renamed from: d */
        private Method f5332d;

        C1616a() {
            try {
                this.f5329a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f5329a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f5330b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f5330b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                this.f5331c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f5331c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            Class<InputMethodManager> cls2 = InputMethodManager.class;
            try {
                this.f5332d = cls2.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
                this.f5332d.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5959a(InputMethodManager inputMethodManager, View view, int i) {
            if (this.f5332d != null) {
                try {
                    this.f5332d.invoke(inputMethodManager, new Object[]{Integer.valueOf(i), null});
                    return;
                } catch (Exception e) {
                }
            }
            inputMethodManager.showSoftInput(view, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5960a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f5329a != null) {
                try {
                    this.f5329a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5961a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f5331c != null) {
                try {
                    this.f5331c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception e) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5962b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f5330b != null) {
                try {
                    this.f5330b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C1617b {
        /* renamed from: a */
        boolean mo5963a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C1618c {
        /* renamed from: a */
        boolean mo5964a(String str);

        /* renamed from: b */
        boolean mo5965b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C1619d {
        /* renamed from: a */
        boolean mo5966a(int i);

        /* renamed from: b */
        boolean mo5967b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    static class C1620e extends C0919a {
        public static final Parcelable.Creator<C1620e> CREATOR = C0808j.m4090a(new C0810k<C1620e>() {
            /* renamed from: b */
            public C1620e mo2679a(Parcel parcel, ClassLoader classLoader) {
                return new C1620e(parcel, classLoader);
            }

            /* renamed from: b */
            public C1620e[] mo2680a(int i) {
                return new C1620e[i];
            }
        });

        /* renamed from: b */
        boolean f5333b;

        public C1620e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5333b = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        C1620e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f5333b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f5333b));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    private static class C1622f extends TouchDelegate {

        /* renamed from: a */
        private final View f5334a;

        /* renamed from: b */
        private final Rect f5335b = new Rect();

        /* renamed from: c */
        private final Rect f5336c = new Rect();

        /* renamed from: d */
        private final Rect f5337d = new Rect();

        /* renamed from: e */
        private final int f5338e;

        /* renamed from: f */
        private boolean f5339f;

        public C1622f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5338e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo5971a(rect, rect2);
            this.f5334a = view;
        }

        /* renamed from: a */
        public void mo5971a(Rect rect, Rect rect2) {
            this.f5335b.set(rect);
            this.f5337d.set(rect);
            this.f5337d.inset(-this.f5338e, -this.f5338e);
            this.f5336c.set(rect2);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                r1 = 1
                r0 = 0
                float r2 = r7.getX()
                int r3 = (int) r2
                float r2 = r7.getY()
                int r4 = (int) r2
                int r2 = r7.getAction()
                switch(r2) {
                    case 0: goto L_0x003c;
                    case 1: goto L_0x0048;
                    case 2: goto L_0x0048;
                    case 3: goto L_0x0056;
                    default: goto L_0x0013;
                }
            L_0x0013:
                r2 = r0
            L_0x0014:
                if (r2 == 0) goto L_0x003b
                if (r1 == 0) goto L_0x005b
                android.graphics.Rect r0 = r6.f5336c
                boolean r0 = r0.contains(r3, r4)
                if (r0 != 0) goto L_0x005b
                android.view.View r0 = r6.f5334a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f5334a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                float r1 = (float) r1
                r7.setLocation(r0, r1)
            L_0x0035:
                android.view.View r0 = r6.f5334a
                boolean r0 = r0.dispatchTouchEvent(r7)
            L_0x003b:
                return r0
            L_0x003c:
                android.graphics.Rect r2 = r6.f5335b
                boolean r2 = r2.contains(r3, r4)
                if (r2 == 0) goto L_0x0013
                r6.f5339f = r1
                r2 = r1
                goto L_0x0014
            L_0x0048:
                boolean r2 = r6.f5339f
                if (r2 == 0) goto L_0x0014
                android.graphics.Rect r5 = r6.f5337d
                boolean r5 = r5.contains(r3, r4)
                if (r5 != 0) goto L_0x0014
                r1 = r0
                goto L_0x0014
            L_0x0056:
                boolean r2 = r6.f5339f
                r6.f5339f = r0
                goto L_0x0014
            L_0x005b:
                android.graphics.Rect r0 = r6.f5336c
                int r0 = r0.left
                int r0 = r3 - r0
                float r0 = (float) r0
                android.graphics.Rect r1 = r6.f5336c
                int r1 = r1.top
                int r1 = r4 - r1
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                goto L_0x0035
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.SearchView.C1622f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5313y = new Rect();
        this.f5314z = new Rect();
        this.f5264A = new int[2];
        this.f5265B = new int[2];
        this.f5290ad = new Runnable() {
            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) SearchView.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    SearchView.f5262q.mo5959a(inputMethodManager, SearchView.this, 0);
                }
            }
        };
        this.f5291ae = new Runnable() {
            public void run() {
                SearchView.this.mo5897g();
            }
        };
        this.f5292af = new Runnable() {
            public void run() {
                if (SearchView.this.f5305o != null && (SearchView.this.f5305o instanceof C1796bi)) {
                    SearchView.this.f5305o.mo4367a((Cursor) null);
                }
            }
        };
        this.f5293ag = new WeakHashMap<>();
        this.f5294ah = new View.OnClickListener() {
            public void onClick(View view) {
                if (view == SearchView.this.f5300d) {
                    SearchView.this.mo5908m();
                } else if (view == SearchView.this.f5302l) {
                    SearchView.this.mo5907i();
                } else if (view == SearchView.this.f5301k) {
                    SearchView.this.mo5906h();
                } else if (view == SearchView.this.f5303m) {
                    SearchView.this.mo5909n();
                } else if (view == SearchView.this.f5299c) {
                    SearchView.this.mo5916q();
                }
            }
        };
        this.f5307r = new View.OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f5306p == null) {
                    return false;
                }
                if (SearchView.this.f5299c.isPopupShowing() && SearchView.this.f5299c.getListSelection() != -1) {
                    return SearchView.this.mo5890a(view, i, keyEvent);
                }
                if (SearchView.this.f5299c.m9593a() || !C1167k.m6999a(keyEvent) || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo5885a(0, (String) null, SearchView.this.f5299c.getText().toString());
                return true;
            }
        };
        this.f5295ai = new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo5906h();
                return true;
            }
        };
        this.f5296aj = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo5889a(i, 0, (String) null);
            }
        };
        this.f5297ak = new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo5888a(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f5298al = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo5891b(charSequence);
            }
        };
        C1807bp a = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo7312g(C1359b.C1371l.SearchView_layout, C1359b.C1368i.abc_search_view), this, true);
        this.f5299c = (SearchAutoComplete) findViewById(C1359b.C1366g.search_src_text);
        this.f5299c.setSearchView(this);
        this.f5308t = findViewById(C1359b.C1366g.search_edit_frame);
        this.f5309u = findViewById(C1359b.C1366g.search_plate);
        this.f5310v = findViewById(C1359b.C1366g.submit_area);
        this.f5300d = (ImageView) findViewById(C1359b.C1366g.search_button);
        this.f5301k = (ImageView) findViewById(C1359b.C1366g.search_go_btn);
        this.f5302l = (ImageView) findViewById(C1359b.C1366g.search_close_btn);
        this.f5303m = (ImageView) findViewById(C1359b.C1366g.search_voice_btn);
        this.f5266C = (ImageView) findViewById(C1359b.C1366g.search_mag_icon);
        C1040ar.m5889a(this.f5309u, a.mo7293a(C1359b.C1371l.SearchView_queryBackground));
        C1040ar.m5889a(this.f5310v, a.mo7293a(C1359b.C1371l.SearchView_submitBackground));
        this.f5300d.setImageDrawable(a.mo7293a(C1359b.C1371l.SearchView_searchIcon));
        this.f5301k.setImageDrawable(a.mo7293a(C1359b.C1371l.SearchView_goIcon));
        this.f5302l.setImageDrawable(a.mo7293a(C1359b.C1371l.SearchView_closeIcon));
        this.f5303m.setImageDrawable(a.mo7293a(C1359b.C1371l.SearchView_voiceIcon));
        this.f5266C.setImageDrawable(a.mo7293a(C1359b.C1371l.SearchView_searchIcon));
        this.f5267D = a.mo7293a(C1359b.C1371l.SearchView_searchHintIcon);
        this.f5268E = a.mo7312g(C1359b.C1371l.SearchView_suggestionRowLayout, C1359b.C1368i.abc_search_dropdown_item_icons_2line);
        this.f5269F = a.mo7312g(C1359b.C1371l.SearchView_commitIcon, 0);
        this.f5300d.setOnClickListener(this.f5294ah);
        this.f5302l.setOnClickListener(this.f5294ah);
        this.f5301k.setOnClickListener(this.f5294ah);
        this.f5303m.setOnClickListener(this.f5294ah);
        this.f5299c.setOnClickListener(this.f5294ah);
        this.f5299c.addTextChangedListener(this.f5298al);
        this.f5299c.setOnEditorActionListener(this.f5295ai);
        this.f5299c.setOnItemClickListener(this.f5296aj);
        this.f5299c.setOnItemSelectedListener(this.f5297ak);
        this.f5299c.setOnKeyListener(this.f5307r);
        this.f5299c.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.f5304n != null) {
                    SearchView.this.f5304n.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo7295a(C1359b.C1371l.SearchView_iconifiedByDefault, true));
        int e = a.mo7306e(C1359b.C1371l.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f5272I = a.mo7304d(C1359b.C1371l.SearchView_defaultQueryHint);
        this.f5280Q = a.mo7304d(C1359b.C1371l.SearchView_queryHint);
        int a2 = a.mo7291a(C1359b.C1371l.SearchView_android_imeOptions, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo7291a(C1359b.C1371l.SearchView_android_inputType, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo7295a(C1359b.C1371l.SearchView_android_focusable, true));
        a.mo7308e();
        this.f5270G = new Intent("android.speech.action.WEB_SEARCH");
        this.f5270G.addFlags(268435456);
        this.f5270G.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f5271H = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5271H.addFlags(268435456);
        this.f5311w = findViewById(this.f5299c.getDropDownAnchor());
        if (this.f5311w != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                m9563r();
            } else {
                m9564s();
            }
        }
        m9555a(this.f5277N);
        m9570y();
    }

    /* renamed from: A */
    private void m9549A() {
        this.f5299c.dismissDropDown();
    }

    /* renamed from: a */
    private Intent m9550a(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: a */
    private Intent m9551a(Cursor cursor, int i, String str) {
        int i2;
        String a;
        try {
            String a2 = C1796bi.m10873a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f5306p.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String a3 = C1796bi.m10873a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f5306p.getSuggestIntentData();
            }
            if (!(a3 == null || (a = C1796bi.m10873a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            return m9552a(a2, a3 == null ? null : Uri.parse(a3), C1796bi.m10873a(cursor, "suggest_intent_extra_data"), C1796bi.m10873a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException e2) {
                i2 = -1;
            }
            Log.w(f5261b, "Search suggestions cursor at row " + i2 + " returned exception.", runtimeException);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m9552a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5286W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f5289ac != null) {
            intent.putExtra("app_data", this.f5289ac);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f5306p.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m9553a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e(f5261b, "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: a */
    private void m9554a(View view, Rect rect) {
        view.getLocationInWindow(this.f5264A);
        getLocationInWindow(this.f5265B);
        int i = this.f5264A[1] - this.f5265B[1];
        int i2 = this.f5264A[0] - this.f5265B[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    /* renamed from: a */
    private void m9555a(boolean z) {
        boolean z2 = true;
        int i = 8;
        this.f5278O = z;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f5299c.getText());
        this.f5300d.setVisibility(i2);
        m9558b(z3);
        this.f5308t.setVisibility(z ? 8 : 0);
        if (this.f5266C.getDrawable() != null && !this.f5277N) {
            i = 0;
        }
        this.f5266C.setVisibility(i);
        m9568w();
        if (z3) {
            z2 = false;
        }
        m9561c(z2);
        m9567v();
    }

    /* renamed from: a */
    static boolean m9556a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m9557b(Intent intent, SearchableInfo searchableInfo) {
        String str = null;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f5289ac != null) {
            bundle.putParcelable("app_data", this.f5289ac);
        }
        Intent intent3 = new Intent(intent);
        String str2 = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: b */
    private void m9558b(boolean z) {
        int i = 8;
        if (this.f5279P && m9566u() && hasFocus() && (z || !this.f5284U)) {
            i = 0;
        }
        this.f5301k.setVisibility(i);
    }

    /* renamed from: b */
    private boolean m9559b(int i, int i2, String str) {
        Cursor a = this.f5305o.mo4363a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m9553a(m9551a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m9560c(CharSequence charSequence) {
        if (!this.f5277N || this.f5267D == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f5299c.getTextSize()) * 1.25d);
        this.f5267D.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f5267D), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m9561c(boolean z) {
        int i;
        if (!this.f5284U || mo5894d() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f5301k.setVisibility(8);
        }
        this.f5303m.setVisibility(i);
    }

    /* renamed from: e */
    private void m9562e(int i) {
        Editable text = this.f5299c.getText();
        Cursor a = this.f5305o.mo4363a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence c = this.f5305o.mo4175c(a);
                if (c != null) {
                    setQuery(c);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1359b.C1364e.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1359b.C1364e.abc_search_view_preferred_width);
    }

    @TargetApi(11)
    /* renamed from: r */
    private void m9563r() {
        this.f5311w.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SearchView.this.mo5915p();
            }
        });
    }

    /* renamed from: s */
    private void m9564s() {
        this.f5311w.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                SearchView.this.mo5915p();
            }
        });
    }

    private void setQuery(CharSequence charSequence) {
        this.f5299c.setText(charSequence);
        this.f5299c.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private boolean m9565t() {
        if (this.f5306p == null || !this.f5306p.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f5306p.getVoiceSearchLaunchWebSearch()) {
            intent = this.f5270G;
        } else if (this.f5306p.getVoiceSearchLaunchRecognizer()) {
            intent = this.f5271H;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: u */
    private boolean m9566u() {
        return (this.f5279P || this.f5284U) && !mo5894d();
    }

    /* renamed from: v */
    private void m9567v() {
        int i = 8;
        if (m9566u() && (this.f5301k.getVisibility() == 0 || this.f5303m.getVisibility() == 0)) {
            i = 0;
        }
        this.f5310v.setVisibility(i);
    }

    /* renamed from: w */
    private void m9568w() {
        boolean z = true;
        int i = 0;
        boolean z2 = !TextUtils.isEmpty(this.f5299c.getText());
        if (!z2 && (!this.f5277N || this.f5287aa)) {
            z = false;
        }
        ImageView imageView = this.f5302l;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f5302l.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: x */
    private void m9569x() {
        post(this.f5291ae);
    }

    /* renamed from: y */
    private void m9570y() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f5299c;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m9560c(queryHint));
    }

    /* renamed from: z */
    private void m9571z() {
        int i = 1;
        this.f5299c.setThreshold(this.f5306p.getSuggestThreshold());
        this.f5299c.setImeOptions(this.f5306p.getImeOptions());
        int inputType = this.f5306p.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f5306p.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f5299c.setInputType(inputType);
        if (this.f5305o != null) {
            this.f5305o.mo4367a((Cursor) null);
        }
        if (this.f5306p.getSuggestAuthority() != null) {
            this.f5305o = new C1796bi(getContext(), this, this.f5306p, this.f5293ag);
            this.f5299c.setAdapter(this.f5305o);
            C1796bi biVar = (C1796bi) this.f5305o;
            if (this.f5281R) {
                i = 2;
            }
            biVar.mo7219c(i);
        }
    }

    /* renamed from: a */
    public void mo5124a() {
        if (!this.f5287aa) {
            this.f5287aa = true;
            this.f5288ab = this.f5299c.getImeOptions();
            this.f5299c.setImeOptions(this.f5288ab | 33554432);
            this.f5299c.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5885a(int i, String str, String str2) {
        getContext().startActivity(m9552a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5886a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo5887a(CharSequence charSequence, boolean z) {
        this.f5299c.setText(charSequence);
        if (charSequence != null) {
            this.f5299c.setSelection(this.f5299c.length());
            this.f5286W = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo5906h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5888a(int i) {
        if (this.f5275L != null && this.f5275L.mo5966a(i)) {
            return false;
        }
        m9562e(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5889a(int i, int i2, String str) {
        if (this.f5275L != null && this.f5275L.mo5967b(i)) {
            return false;
        }
        m9559b(i, 0, (String) null);
        setImeVisibility(false);
        m9549A();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5890a(View view, int i, KeyEvent keyEvent) {
        if (this.f5306p == null || this.f5305o == null || keyEvent.getAction() != 0 || !C1167k.m6999a(keyEvent)) {
            return false;
        }
        if (i == 66 || i == 84 || i == 61) {
            return mo5889a(this.f5299c.getListSelection(), 0, (String) null);
        }
        if (i == 21 || i == 22) {
            this.f5299c.setSelection(i == 21 ? 0 : this.f5299c.length());
            this.f5299c.setListSelection(0);
            this.f5299c.clearListSelection();
            f5262q.mo5961a(this.f5299c, true);
            return true;
        }
        if (!(i == 19 && this.f5299c.getListSelection() == 0)) {
        }
        return false;
    }

    /* renamed from: b */
    public void mo5125b() {
        mo5887a((CharSequence) "", false);
        clearFocus();
        m9555a(true);
        this.f5299c.setImeOptions(this.f5288ab);
        this.f5287aa = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5891b(CharSequence charSequence) {
        boolean z = true;
        Editable text = this.f5299c.getText();
        this.f5286W = text;
        boolean z2 = !TextUtils.isEmpty(text);
        m9558b(z2);
        if (z2) {
            z = false;
        }
        m9561c(z);
        m9568w();
        m9567v();
        if (this.f5273J != null && !TextUtils.equals(charSequence, this.f5285V)) {
            this.f5273J.mo5965b(charSequence.toString());
        }
        this.f5285V = charSequence.toString();
    }

    /* renamed from: c */
    public boolean mo5892c() {
        return this.f5277N;
    }

    public void clearFocus() {
        this.f5282S = true;
        setImeVisibility(false);
        super.clearFocus();
        this.f5299c.clearFocus();
        this.f5282S = false;
    }

    /* renamed from: d */
    public boolean mo5894d() {
        return this.f5278O;
    }

    /* renamed from: e */
    public boolean mo5895e() {
        return this.f5279P;
    }

    /* renamed from: f */
    public boolean mo5896f() {
        return this.f5281R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo5897g() {
        int[] iArr = this.f5299c.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f5309u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5310v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f5299c.getImeOptions();
    }

    public int getInputType() {
        return this.f5299c.getInputType();
    }

    public int getMaxWidth() {
        return this.f5283T;
    }

    public CharSequence getQuery() {
        return this.f5299c.getText();
    }

    @C0003aa
    public CharSequence getQueryHint() {
        return this.f5280Q != null ? this.f5280Q : (this.f5306p == null || this.f5306p.getHintId() == 0) ? this.f5272I : getContext().getText(this.f5306p.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f5269F;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f5268E;
    }

    public C1302h getSuggestionsAdapter() {
        return this.f5305o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5906h() {
        Editable text = this.f5299c.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f5273J == null || !this.f5273J.mo5964a(text.toString())) {
                if (this.f5306p != null) {
                    mo5885a(0, (String) null, text.toString());
                }
                setImeVisibility(false);
                m9549A();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5907i() {
        if (!TextUtils.isEmpty(this.f5299c.getText())) {
            this.f5299c.setText("");
            this.f5299c.requestFocus();
            setImeVisibility(true);
        } else if (!this.f5277N) {
        } else {
            if (this.f5274K == null || !this.f5274K.mo5963a()) {
                clearFocus();
                m9555a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5908m() {
        m9555a(false);
        this.f5299c.requestFocus();
        setImeVisibility(true);
        if (this.f5276M != null) {
            this.f5276M.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5909n() {
        if (this.f5306p != null) {
            SearchableInfo searchableInfo = this.f5306p;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m9550a(this.f5270G, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m9557b(this.f5271H, searchableInfo));
                }
            } catch (ActivityNotFoundException e) {
                Log.w(f5261b, "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5910o() {
        m9555a(mo5894d());
        m9569x();
        if (this.f5299c.hasFocus()) {
            mo5916q();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f5291ae);
        post(this.f5292af);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m9554a((View) this.f5299c, this.f5313y);
            this.f5314z.set(this.f5313y.left, 0, this.f5313y.right, i4 - i2);
            if (this.f5312x == null) {
                this.f5312x = new C1622f(this.f5314z, this.f5313y, this.f5299c);
                setTouchDelegate(this.f5312x);
                return;
            }
            this.f5312x.mo5971a(this.f5314z, this.f5313y);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (mo5894d()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.f5283T <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.f5283T, size);
                    break;
                }
            case 0:
                if (this.f5283T <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.f5283T;
                    break;
                }
            case 1073741824:
                if (this.f5283T > 0) {
                    size = Math.min(this.f5283T, size);
                    break;
                }
                break;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
                size2 = Math.min(getPreferredHeight(), size2);
                break;
            case 0:
                size2 = getPreferredHeight();
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1620e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1620e eVar = (C1620e) parcelable;
        super.onRestoreInstanceState(eVar.mo3092a());
        m9555a(eVar.f5333b);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1620e eVar = new C1620e(super.onSaveInstanceState());
        eVar.f5333b = mo5894d();
        return eVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m9569x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5915p() {
        if (this.f5311w.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f5309u.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C1819bu.m11063a(this);
            int dimensionPixelSize = this.f5277N ? resources.getDimensionPixelSize(C1359b.C1364e.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C1359b.C1364e.abc_dropdownitem_icon_width) : 0;
            this.f5299c.getDropDownBackground().getPadding(rect);
            this.f5299c.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f5299c.setDropDownWidth((dimensionPixelSize + ((this.f5311w.getWidth() + rect.left) + rect.right)) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5916q() {
        f5262q.mo5960a(this.f5299c);
        f5262q.mo5962b(this.f5299c);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f5282S || !isFocusable()) {
            return false;
        }
        if (mo5894d()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f5299c.requestFocus(i, rect);
        if (requestFocus) {
            m9555a(false);
        }
        return requestFocus;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setAppSearchData(Bundle bundle) {
        this.f5289ac = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo5907i();
        } else {
            mo5908m();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f5277N != z) {
            this.f5277N = z;
            m9555a(z);
            m9570y();
        }
    }

    public void setImeOptions(int i) {
        this.f5299c.setImeOptions(i);
    }

    /* access modifiers changed from: package-private */
    public void setImeVisibility(boolean z) {
        if (z) {
            post(this.f5290ad);
            return;
        }
        removeCallbacks(this.f5290ad);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void setInputType(int i) {
        this.f5299c.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f5283T = i;
        requestLayout();
    }

    public void setOnCloseListener(C1617b bVar) {
        this.f5274K = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f5304n = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C1618c cVar) {
        this.f5273J = cVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f5276M = onClickListener;
    }

    public void setOnSuggestionListener(C1619d dVar) {
        this.f5275L = dVar;
    }

    public void setQueryHint(@C0003aa CharSequence charSequence) {
        this.f5280Q = charSequence;
        m9570y();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f5281R = z;
        if (this.f5305o instanceof C1796bi) {
            ((C1796bi) this.f5305o).mo7219c(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f5306p = searchableInfo;
        if (this.f5306p != null) {
            m9571z();
            m9570y();
        }
        this.f5284U = m9565t();
        if (this.f5284U) {
            this.f5299c.setPrivateImeOptions(f5263s);
        }
        m9555a(mo5894d());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f5279P = z;
        m9555a(mo5894d());
    }

    public void setSuggestionsAdapter(C1302h hVar) {
        this.f5305o = hVar;
        this.f5299c.setAdapter(this.f5305o);
    }
}
