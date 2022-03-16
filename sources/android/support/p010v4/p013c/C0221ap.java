package android.support.p010v4.p013c;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* renamed from: android.support.v4.c.ap */
public class C0221ap extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0225c> f1314a = new ArrayList<>();

    /* renamed from: b */
    private FrameLayout f1315b;

    /* renamed from: c */
    private Context f1316c;

    /* renamed from: d */
    private C0201ai f1317d;

    /* renamed from: e */
    private int f1318e;

    /* renamed from: f */
    private TabHost.OnTabChangeListener f1319f;

    /* renamed from: g */
    private C0225c f1320g;

    /* renamed from: h */
    private boolean f1321h;

    /* renamed from: android.support.v4.c.ap$a */
    static class C0222a implements TabHost.TabContentFactory {

        /* renamed from: a */
        private final Context f1322a;

        public C0222a(Context context) {
            this.f1322a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f1322a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: android.support.v4.c.ap$b */
    static class C0223b extends View.BaseSavedState {
        public static final Parcelable.Creator<C0223b> CREATOR = new Parcelable.Creator<C0223b>() {
            /* renamed from: a */
            public C0223b createFromParcel(Parcel parcel) {
                return new C0223b(parcel);
            }

            /* renamed from: a */
            public C0223b[] newArray(int i) {
                return new C0223b[i];
            }
        };

        /* renamed from: a */
        String f1323a;

        C0223b(Parcel parcel) {
            super(parcel);
            this.f1323a = parcel.readString();
        }

        C0223b(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f1323a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f1323a);
        }
    }

    /* renamed from: android.support.v4.c.ap$c */
    static final class C0225c {
        @C0047z

        /* renamed from: a */
        final String f1324a;
        @C0047z

        /* renamed from: b */
        final Class<?> f1325b;
        @C0003aa

        /* renamed from: c */
        final Bundle f1326c;

        /* renamed from: d */
        C0186ad f1327d;

        C0225c(@C0047z String str, @C0047z Class<?> cls, @C0003aa Bundle bundle) {
            this.f1324a = str;
            this.f1325b = cls;
            this.f1326c = bundle;
        }
    }

    public C0221ap(Context context) {
        super(context, (AttributeSet) null);
        m1390a(context, (AttributeSet) null);
    }

    public C0221ap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1390a(context, attributeSet);
    }

    @C0003aa
    /* renamed from: a */
    private C0225c m1386a(String str) {
        int size = this.f1314a.size();
        for (int i = 0; i < size; i++) {
            C0225c cVar = this.f1314a.get(i);
            if (cVar.f1324a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    @C0003aa
    /* renamed from: a */
    private C0226aq m1387a(@C0003aa String str, @C0003aa C0226aq aqVar) {
        C0225c a = m1386a(str);
        if (this.f1320g != a) {
            if (aqVar == null) {
                aqVar = this.f1317d.mo1063a();
            }
            if (!(this.f1320g == null || this.f1320g.f1327d == null)) {
                aqVar.mo1242d(this.f1320g.f1327d);
            }
            if (a != null) {
                if (a.f1327d == null) {
                    a.f1327d = C0186ad.m906a(this.f1316c, a.f1325b.getName(), a.f1326c);
                    aqVar.mo1227a(this.f1318e, a.f1327d, a.f1324a);
                } else {
                    aqVar.mo1243e(a.f1327d);
                }
            }
            this.f1320g = a;
        }
        return aqVar;
    }

    /* renamed from: a */
    private void m1388a() {
        if (this.f1315b == null) {
            this.f1315b = (FrameLayout) findViewById(this.f1318e);
            if (this.f1315b == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f1318e);
            }
        }
    }

    /* renamed from: a */
    private void m1389a(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f1315b = frameLayout2;
            this.f1315b.setId(this.f1318e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: a */
    private void m1390a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f1318e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    public void mo1206a(Context context, C0201ai aiVar) {
        m1389a(context);
        super.setup();
        this.f1316c = context;
        this.f1317d = aiVar;
        m1388a();
    }

    /* renamed from: a */
    public void mo1207a(Context context, C0201ai aiVar, int i) {
        m1389a(context);
        super.setup();
        this.f1316c = context;
        this.f1317d = aiVar;
        this.f1318e = i;
        m1388a();
        this.f1315b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    public void mo1208a(@C0047z TabHost.TabSpec tabSpec, @C0047z Class<?> cls, @C0003aa Bundle bundle) {
        tabSpec.setContent(new C0222a(this.f1316c));
        String tag = tabSpec.getTag();
        C0225c cVar = new C0225c(tag, cls, bundle);
        if (this.f1321h) {
            cVar.f1327d = this.f1317d.mo1062a(tag);
            if (cVar.f1327d != null && !cVar.f1327d.mo924z()) {
                C0226aq a = this.f1317d.mo1063a();
                a.mo1242d(cVar.f1327d);
                a.mo1246h();
            }
        }
        this.f1314a.add(cVar);
        addTab(tabSpec);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0226aq aqVar = null;
        int size = this.f1314a.size();
        for (int i = 0; i < size; i++) {
            C0225c cVar = this.f1314a.get(i);
            cVar.f1327d = this.f1317d.mo1062a(cVar.f1324a);
            if (cVar.f1327d != null && !cVar.f1327d.mo924z()) {
                if (cVar.f1324a.equals(currentTabTag)) {
                    this.f1320g = cVar;
                } else {
                    if (aqVar == null) {
                        aqVar = this.f1317d.mo1063a();
                    }
                    aqVar.mo1242d(cVar.f1327d);
                }
            }
        }
        this.f1321h = true;
        C0226aq a = m1387a(currentTabTag, aqVar);
        if (a != null) {
            a.mo1246h();
            this.f1317d.mo1076c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1321h = false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0223b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0223b bVar = (C0223b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.f1323a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0223b bVar = new C0223b(super.onSaveInstanceState());
        bVar.f1323a = getCurrentTabTag();
        return bVar;
    }

    public void onTabChanged(String str) {
        C0226aq a;
        if (this.f1321h && (a = m1387a(str, (C0226aq) null)) != null) {
            a.mo1246h();
        }
        if (this.f1319f != null) {
            this.f1319f.onTabChanged(str);
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f1319f = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
