package android.support.p010v4.p013c;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: android.support.v4.c.au */
public class C0244au extends C0186ad {

    /* renamed from: a */
    static final int f1391a = 16711681;

    /* renamed from: b */
    static final int f1392b = 16711682;

    /* renamed from: c */
    static final int f1393c = 16711683;

    /* renamed from: ak */
    private final AdapterView.OnItemClickListener f1394ak = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0244au.this.mo1278a((ListView) adapterView, view, i, j);
        }
    };

    /* renamed from: d */
    ListAdapter f1395d;

    /* renamed from: e */
    ListView f1396e;

    /* renamed from: f */
    View f1397f;

    /* renamed from: g */
    TextView f1398g;

    /* renamed from: h */
    View f1399h;

    /* renamed from: i */
    View f1400i;

    /* renamed from: j */
    CharSequence f1401j;

    /* renamed from: k */
    boolean f1402k;

    /* renamed from: l */
    private final Handler f1403l = new Handler();

    /* renamed from: m */
    private final Runnable f1404m = new Runnable() {
        public void run() {
            C0244au.this.f1396e.focusableViewAvailable(C0244au.this.f1396e);
        }
    };

    /* renamed from: a */
    private void m1491a(boolean z, boolean z2) {
        m1492e();
        if (this.f1399h == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f1402k != z) {
            this.f1402k = z;
            if (z) {
                if (z2) {
                    this.f1399h.startAnimation(AnimationUtils.loadAnimation(mo914q(), 17432577));
                    this.f1400i.startAnimation(AnimationUtils.loadAnimation(mo914q(), 17432576));
                } else {
                    this.f1399h.clearAnimation();
                    this.f1400i.clearAnimation();
                }
                this.f1399h.setVisibility(8);
                this.f1400i.setVisibility(0);
                return;
            }
            if (z2) {
                this.f1399h.startAnimation(AnimationUtils.loadAnimation(mo914q(), 17432576));
                this.f1400i.startAnimation(AnimationUtils.loadAnimation(mo914q(), 17432577));
            } else {
                this.f1399h.clearAnimation();
                this.f1400i.clearAnimation();
            }
            this.f1399h.setVisibility(0);
            this.f1400i.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m1492e() {
        if (this.f1396e == null) {
            View K = mo798K();
            if (K == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (K instanceof ListView) {
                this.f1396e = (ListView) K;
            } else {
                this.f1398g = (TextView) K.findViewById(f1391a);
                if (this.f1398g == null) {
                    this.f1397f = K.findViewById(16908292);
                } else {
                    this.f1398g.setVisibility(8);
                }
                this.f1399h = K.findViewById(f1392b);
                this.f1400i = K.findViewById(f1393c);
                View findViewById = K.findViewById(16908298);
                if (findViewById instanceof ListView) {
                    this.f1396e = (ListView) findViewById;
                    if (this.f1397f != null) {
                        this.f1396e.setEmptyView(this.f1397f);
                    } else if (this.f1401j != null) {
                        this.f1398g.setText(this.f1401j);
                        this.f1396e.setEmptyView(this.f1398g);
                    }
                } else if (findViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                } else {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
            }
            this.f1402k = true;
            this.f1396e.setOnItemClickListener(this.f1394ak);
            if (this.f1395d != null) {
                ListAdapter listAdapter = this.f1395d;
                this.f1395d = null;
                mo1277a(listAdapter);
            } else if (this.f1399h != null) {
                m1491a(false, false);
            }
            this.f1403l.post(this.f1404m);
        }
    }

    /* renamed from: a */
    public int mo764a() {
        m1492e();
        return this.f1396e.getSelectedItemPosition();
    }

    /* renamed from: a */
    public View mo814a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context q = mo914q();
        FrameLayout frameLayout = new FrameLayout(q);
        LinearLayout linearLayout = new LinearLayout(q);
        linearLayout.setId(f1392b);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(q, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(q);
        frameLayout2.setId(f1393c);
        TextView textView = new TextView(q);
        textView.setId(f1391a);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(q);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: a */
    public void mo838a(View view, Bundle bundle) {
        super.mo838a(view, bundle);
        m1492e();
    }

    /* renamed from: a */
    public void mo1277a(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f1395d != null;
        this.f1395d = listAdapter;
        if (this.f1396e != null) {
            this.f1396e.setAdapter(listAdapter);
            if (!this.f1402k && !z2) {
                if (mo798K().getWindowToken() != null) {
                    z = true;
                }
                m1491a(true, z);
            }
        }
    }

    /* renamed from: a */
    public void mo1278a(ListView listView, View view, int i, long j) {
    }

    /* renamed from: a */
    public void mo1279a(CharSequence charSequence) {
        m1492e();
        if (this.f1398g == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        this.f1398g.setText(charSequence);
        if (this.f1401j == null) {
            this.f1396e.setEmptyView(this.f1398g);
        }
        this.f1401j = charSequence;
    }

    /* renamed from: a */
    public void mo1280a(boolean z) {
        m1491a(z, true);
    }

    /* renamed from: b */
    public long mo772b() {
        m1492e();
        return this.f1396e.getSelectedItemId();
    }

    /* renamed from: b */
    public void mo1281b(boolean z) {
        m1491a(z, false);
    }

    /* renamed from: c */
    public ListView mo1282c() {
        m1492e();
        return this.f1396e;
    }

    /* renamed from: d */
    public ListAdapter mo1283d() {
        return this.f1395d;
    }

    /* renamed from: e */
    public void mo1284e(int i) {
        m1492e();
        this.f1396e.setSelection(i);
    }

    /* renamed from: j */
    public void mo785j() {
        this.f1403l.removeCallbacks(this.f1404m);
        this.f1396e = null;
        this.f1402k = false;
        this.f1400i = null;
        this.f1399h = null;
        this.f1397f = null;
        this.f1398g = null;
        super.mo785j();
    }
}
