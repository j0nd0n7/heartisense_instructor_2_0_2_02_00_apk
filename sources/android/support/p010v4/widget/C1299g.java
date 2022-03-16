package android.support.p010v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v4.widget.g */
public class C1299g extends ProgressBar {

    /* renamed from: e */
    private static final int f3998e = 500;

    /* renamed from: f */
    private static final int f3999f = 500;

    /* renamed from: a */
    long f4000a;

    /* renamed from: b */
    boolean f4001b;

    /* renamed from: c */
    boolean f4002c;

    /* renamed from: d */
    boolean f4003d;

    /* renamed from: g */
    private final Runnable f4004g;

    /* renamed from: h */
    private final Runnable f4005h;

    public C1299g(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1299g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4000a = -1;
        this.f4001b = false;
        this.f4002c = false;
        this.f4003d = false;
        this.f4004g = new Runnable() {
            public void run() {
                C1299g.this.f4001b = false;
                C1299g.this.f4000a = -1;
                C1299g.this.setVisibility(8);
            }
        };
        this.f4005h = new Runnable() {
            public void run() {
                C1299g.this.f4002c = false;
                if (!C1299g.this.f4003d) {
                    C1299g.this.f4000a = System.currentTimeMillis();
                    C1299g.this.setVisibility(0);
                }
            }
        };
    }

    /* renamed from: c */
    private void m7631c() {
        removeCallbacks(this.f4004g);
        removeCallbacks(this.f4005h);
    }

    /* renamed from: a */
    public void mo4357a() {
        this.f4003d = true;
        removeCallbacks(this.f4005h);
        long currentTimeMillis = System.currentTimeMillis() - this.f4000a;
        if (currentTimeMillis >= 500 || this.f4000a == -1) {
            setVisibility(8);
        } else if (!this.f4001b) {
            postDelayed(this.f4004g, 500 - currentTimeMillis);
            this.f4001b = true;
        }
    }

    /* renamed from: b */
    public void mo4358b() {
        this.f4000a = -1;
        this.f4003d = false;
        removeCallbacks(this.f4004g);
        if (!this.f4002c) {
            postDelayed(this.f4005h, 500);
            this.f4002c = true;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7631c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7631c();
    }
}
