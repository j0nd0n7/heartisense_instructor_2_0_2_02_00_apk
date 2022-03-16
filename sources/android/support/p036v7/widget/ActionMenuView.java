package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0016ak;
import android.support.p036v7.view.menu.ActionMenuItemView;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1555k;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.view.menu.C1569q;
import android.support.p036v7.widget.C1697an;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends C1697an implements C1550h.C1552b, C1569q {

    /* renamed from: a */
    static final int f5119a = 56;

    /* renamed from: b */
    static final int f5120b = 4;

    /* renamed from: k */
    private static final String f5121k = "ActionMenuView";

    /* renamed from: c */
    C1550h.C1551a f5122c;

    /* renamed from: d */
    C1588e f5123d;

    /* renamed from: l */
    private C1550h f5124l;

    /* renamed from: m */
    private Context f5125m;

    /* renamed from: n */
    private int f5126n;

    /* renamed from: o */
    private boolean f5127o;

    /* renamed from: p */
    private C1821d f5128p;

    /* renamed from: q */
    private C1567p.C1568a f5129q;

    /* renamed from: r */
    private boolean f5130r;

    /* renamed from: s */
    private int f5131s;

    /* renamed from: t */
    private int f5132t;

    /* renamed from: u */
    private int f5133u;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface C1584a {
        /* renamed from: d */
        boolean mo5189d();

        /* renamed from: e */
        boolean mo5190e();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    private class C1585b implements C1567p.C1568a {
        C1585b() {
        }

        /* renamed from: a */
        public void mo4932a(C1550h hVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo4933a(C1550h hVar) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C1586c extends C1697an.C1699b {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f5135a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f5136b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f5137c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f5138d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f5139e;

        /* renamed from: f */
        boolean f5140f;

        public C1586c(int i, int i2) {
            super(i, i2);
            this.f5135a = false;
        }

        C1586c(int i, int i2, boolean z) {
            super(i, i2);
            this.f5135a = z;
        }

        public C1586c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1586c(C1586c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f5135a = cVar.f5135a;
        }

        public C1586c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    private class C1587d implements C1550h.C1551a {
        C1587d() {
        }

        /* renamed from: a */
        public void mo4719a(C1550h hVar) {
            if (ActionMenuView.this.f5122c != null) {
                ActionMenuView.this.f5122c.mo4719a(hVar);
            }
        }

        /* renamed from: a */
        public boolean mo4724a(C1550h hVar, MenuItem menuItem) {
            return ActionMenuView.this.f5123d != null && ActionMenuView.this.f5123d.mo5714a(menuItem);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface C1588e {
        /* renamed from: a */
        boolean mo5714a(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5132t = (int) (56.0f * f);
        this.f5133u = (int) (f * 4.0f);
        this.f5125m = context;
        this.f5126n = 0;
    }

    /* renamed from: a */
    static int m9328a(View view, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        C1586c cVar = (C1586c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo5187b();
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i5 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i5++;
            }
            if (z2 && i5 < 2) {
                i5 = 2;
            }
        }
        if (!cVar.f5135a && z2) {
            z = true;
        }
        cVar.f5138d = z;
        cVar.f5136b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01de  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9329c(int r35, int r36) {
        /*
            r34 = this;
            int r23 = android.view.View.MeasureSpec.getMode(r36)
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            int r17 = android.view.View.MeasureSpec.getSize(r36)
            int r7 = r34.getPaddingLeft()
            int r8 = r34.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r34.getPaddingTop()
            int r9 = r34.getPaddingBottom()
            int r19 = r8 + r9
            r8 = -2
            r0 = r36
            r1 = r19
            int r24 = getChildMeasureSpec(r0, r1, r8)
            int r25 = r6 - r7
            r0 = r34
            int r6 = r0.f5132t
            int r9 = r25 / r6
            r0 = r34
            int r6 = r0.f5132t
            int r6 = r25 % r6
            if (r9 != 0) goto L_0x0041
            r6 = 0
            r0 = r34
            r1 = r25
            r0.setMeasuredDimension(r1, r6)
        L_0x0040:
            return
        L_0x0041:
            r0 = r34
            int r7 = r0.f5132t
            int r6 = r6 / r9
            int r26 = r7 + r6
            r16 = 0
            r15 = 0
            r10 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            int r27 = r34.getChildCount()
            r6 = 0
            r18 = r6
        L_0x0057:
            r0 = r18
            r1 = r27
            if (r0 >= r1) goto L_0x0103
            r0 = r34
            r1 = r18
            android.view.View r8 = r0.getChildAt(r1)
            int r6 = r8.getVisibility()
            r14 = 8
            if (r6 != r14) goto L_0x007e
            r8 = r7
            r6 = r12
            r12 = r16
            r13 = r9
            r9 = r15
        L_0x0073:
            int r14 = r18 + 1
            r18 = r14
            r15 = r9
            r16 = r12
            r9 = r13
            r12 = r6
            r7 = r8
            goto L_0x0057
        L_0x007e:
            boolean r0 = r8 instanceof android.support.p036v7.view.menu.ActionMenuItemView
            r20 = r0
            int r14 = r7 + 1
            if (r20 == 0) goto L_0x009a
            r0 = r34
            int r6 = r0.f5133u
            r7 = 0
            r0 = r34
            int r0 = r0.f5133u
            r21 = r0
            r22 = 0
            r0 = r21
            r1 = r22
            r8.setPadding(r6, r7, r0, r1)
        L_0x009a:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            r7 = 0
            r6.f5140f = r7
            r7 = 0
            r6.f5137c = r7
            r7 = 0
            r6.f5136b = r7
            r7 = 0
            r6.f5138d = r7
            r7 = 0
            r6.leftMargin = r7
            r7 = 0
            r6.rightMargin = r7
            if (r20 == 0) goto L_0x00ff
            r7 = r8
            android.support.v7.view.menu.ActionMenuItemView r7 = (android.support.p036v7.view.menu.ActionMenuItemView) r7
            boolean r7 = r7.mo5187b()
            if (r7 == 0) goto L_0x00ff
            r7 = 1
        L_0x00be:
            r6.f5139e = r7
            boolean r7 = r6.f5135a
            if (r7 == 0) goto L_0x0101
            r7 = 1
        L_0x00c5:
            r0 = r26
            r1 = r24
            r2 = r19
            int r20 = m9328a(r8, r0, r7, r1, r2)
            r0 = r20
            int r15 = java.lang.Math.max(r15, r0)
            boolean r7 = r6.f5138d
            if (r7 == 0) goto L_0x0321
            int r7 = r10 + 1
        L_0x00db:
            boolean r6 = r6.f5135a
            if (r6 == 0) goto L_0x031e
            r6 = 1
        L_0x00e0:
            int r11 = r9 - r20
            int r8 = r8.getMeasuredHeight()
            r0 = r16
            int r10 = java.lang.Math.max(r0, r8)
            r8 = 1
            r0 = r20
            if (r0 != r8) goto L_0x0312
            r8 = 1
            int r8 = r8 << r18
            long r8 = (long) r8
            long r8 = r8 | r12
            r12 = r10
            r13 = r11
            r10 = r7
            r11 = r6
            r6 = r8
            r9 = r15
            r8 = r14
            goto L_0x0073
        L_0x00ff:
            r7 = 0
            goto L_0x00be
        L_0x0101:
            r7 = r9
            goto L_0x00c5
        L_0x0103:
            if (r11 == 0) goto L_0x0140
            r6 = 2
            if (r7 != r6) goto L_0x0140
            r6 = 1
            r8 = r6
        L_0x010a:
            r18 = 0
            r20 = r12
            r19 = r9
        L_0x0110:
            if (r10 <= 0) goto L_0x030e
            if (r19 <= 0) goto L_0x030e
            r14 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r9 = 0
            r6 = 0
            r22 = r6
        L_0x011d:
            r0 = r22
            r1 = r27
            if (r0 >= r1) goto L_0x0163
            r0 = r34
            r1 = r22
            android.view.View r6 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            boolean r0 = r6.f5138d
            r28 = r0
            if (r28 != 0) goto L_0x0143
            r6 = r9
            r9 = r14
        L_0x0139:
            int r14 = r22 + 1
            r22 = r14
            r14 = r9
            r9 = r6
            goto L_0x011d
        L_0x0140:
            r6 = 0
            r8 = r6
            goto L_0x010a
        L_0x0143:
            int r0 = r6.f5136b
            r28 = r0
            r0 = r28
            if (r0 >= r14) goto L_0x0153
            int r9 = r6.f5136b
            r6 = 1
            int r6 = r6 << r22
            long r12 = (long) r6
            r6 = 1
            goto L_0x0139
        L_0x0153:
            int r6 = r6.f5136b
            if (r6 != r14) goto L_0x030a
            r6 = 1
            int r6 = r6 << r22
            long r0 = (long) r6
            r28 = r0
            long r12 = r12 | r28
            int r6 = r9 + 1
            r9 = r14
            goto L_0x0139
        L_0x0163:
            long r20 = r20 | r12
            r0 = r19
            if (r9 <= r0) goto L_0x01ee
            r12 = r20
        L_0x016b:
            if (r11 != 0) goto L_0x0273
            r6 = 1
            if (r7 != r6) goto L_0x0273
            r6 = 1
        L_0x0171:
            if (r19 <= 0) goto L_0x02bf
            r8 = 0
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x02bf
            int r7 = r7 + -1
            r0 = r19
            if (r0 < r7) goto L_0x0184
            if (r6 != 0) goto L_0x0184
            r7 = 1
            if (r15 <= r7) goto L_0x02bf
        L_0x0184:
            int r7 = java.lang.Long.bitCount(r12)
            float r7 = (float) r7
            if (r6 != 0) goto L_0x0304
            r8 = 1
            long r8 = r8 & r12
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x01a8
            r6 = 0
            r0 = r34
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            boolean r6 = r6.f5139e
            if (r6 != 0) goto L_0x01a8
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 - r6
        L_0x01a8:
            r6 = 1
            int r8 = r27 + -1
            int r6 = r6 << r8
            long r8 = (long) r6
            long r8 = r8 & r12
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0304
            int r6 = r27 + -1
            r0 = r34
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            boolean r6 = r6.f5139e
            if (r6 != 0) goto L_0x0304
            r6 = 1056964608(0x3f000000, float:0.5)
            float r6 = r7 - r6
        L_0x01ca:
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0276
            int r7 = r19 * r26
            float r7 = (float) r7
            float r6 = r7 / r6
            int r6 = (int) r6
            r7 = r6
        L_0x01d6:
            r6 = 0
            r9 = r6
            r8 = r18
        L_0x01da:
            r0 = r27
            if (r9 >= r0) goto L_0x02c1
            r6 = 1
            int r6 = r6 << r9
            long r10 = (long) r6
            long r10 = r10 & r12
            r14 = 0
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x027a
            r6 = r8
        L_0x01e9:
            int r8 = r9 + 1
            r9 = r8
            r8 = r6
            goto L_0x01da
        L_0x01ee:
            int r22 = r14 + 1
            r6 = 0
            r14 = r6
            r9 = r19
            r18 = r20
        L_0x01f6:
            r0 = r27
            if (r14 >= r0) goto L_0x026a
            r0 = r34
            android.view.View r20 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r6 = r20.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            r21 = 1
            int r21 = r21 << r14
            r0 = r21
            long r0 = (long) r0
            r28 = r0
            long r28 = r28 & r12
            r30 = 0
            int r21 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r21 != 0) goto L_0x022a
            int r6 = r6.f5136b
            r0 = r22
            if (r6 != r0) goto L_0x0307
            r6 = 1
            int r6 = r6 << r14
            long r0 = (long) r6
            r20 = r0
            long r18 = r18 | r20
            r6 = r9
        L_0x0225:
            int r9 = r14 + 1
            r14 = r9
            r9 = r6
            goto L_0x01f6
        L_0x022a:
            if (r8 == 0) goto L_0x0257
            boolean r0 = r6.f5139e
            r21 = r0
            if (r21 == 0) goto L_0x0257
            r21 = 1
            r0 = r21
            if (r9 != r0) goto L_0x0257
            r0 = r34
            int r0 = r0.f5133u
            r21 = r0
            int r21 = r21 + r26
            r28 = 0
            r0 = r34
            int r0 = r0.f5133u
            r29 = r0
            r30 = 0
            r0 = r20
            r1 = r21
            r2 = r28
            r3 = r29
            r4 = r30
            r0.setPadding(r1, r2, r3, r4)
        L_0x0257:
            int r0 = r6.f5136b
            r20 = r0
            int r20 = r20 + 1
            r0 = r20
            r6.f5136b = r0
            r20 = 1
            r0 = r20
            r6.f5140f = r0
            int r6 = r9 + -1
            goto L_0x0225
        L_0x026a:
            r6 = 1
            r20 = r18
            r18 = r6
            r19 = r9
            goto L_0x0110
        L_0x0273:
            r6 = 0
            goto L_0x0171
        L_0x0276:
            r6 = 0
            r7 = r6
            goto L_0x01d6
        L_0x027a:
            r0 = r34
            android.view.View r10 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r6 = r10.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            boolean r10 = r10 instanceof android.support.p036v7.view.menu.ActionMenuItemView
            if (r10 == 0) goto L_0x029d
            r6.f5137c = r7
            r8 = 1
            r6.f5140f = r8
            if (r9 != 0) goto L_0x029a
            boolean r8 = r6.f5139e
            if (r8 != 0) goto L_0x029a
            int r8 = -r7
            int r8 = r8 / 2
            r6.leftMargin = r8
        L_0x029a:
            r6 = 1
            goto L_0x01e9
        L_0x029d:
            boolean r10 = r6.f5135a
            if (r10 == 0) goto L_0x02ae
            r6.f5137c = r7
            r8 = 1
            r6.f5140f = r8
            int r8 = -r7
            int r8 = r8 / 2
            r6.rightMargin = r8
            r6 = 1
            goto L_0x01e9
        L_0x02ae:
            if (r9 == 0) goto L_0x02b4
            int r10 = r7 / 2
            r6.leftMargin = r10
        L_0x02b4:
            int r10 = r27 + -1
            if (r9 == r10) goto L_0x02bc
            int r10 = r7 / 2
            r6.rightMargin = r10
        L_0x02bc:
            r6 = r8
            goto L_0x01e9
        L_0x02bf:
            r8 = r18
        L_0x02c1:
            if (r8 == 0) goto L_0x02f0
            r6 = 0
            r7 = r6
        L_0x02c5:
            r0 = r27
            if (r7 >= r0) goto L_0x02f0
            r0 = r34
            android.view.View r8 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.p036v7.widget.ActionMenuView.C1586c) r6
            boolean r9 = r6.f5140f
            if (r9 != 0) goto L_0x02dd
        L_0x02d9:
            int r6 = r7 + 1
            r7 = r6
            goto L_0x02c5
        L_0x02dd:
            int r9 = r6.f5136b
            int r9 = r9 * r26
            int r6 = r6.f5137c
            int r6 = r6 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r0 = r24
            r8.measure(r6, r0)
            goto L_0x02d9
        L_0x02f0:
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r6) goto L_0x0301
        L_0x02f6:
            r0 = r34
            r1 = r25
            r2 = r16
            r0.setMeasuredDimension(r1, r2)
            goto L_0x0040
        L_0x0301:
            r16 = r17
            goto L_0x02f6
        L_0x0304:
            r6 = r7
            goto L_0x01ca
        L_0x0307:
            r6 = r9
            goto L_0x0225
        L_0x030a:
            r6 = r9
            r9 = r14
            goto L_0x0139
        L_0x030e:
            r12 = r20
            goto L_0x016b
        L_0x0312:
            r8 = r14
            r9 = r15
            r32 = r12
            r12 = r10
            r13 = r11
            r11 = r6
            r10 = r7
            r6 = r32
            goto L_0x0073
        L_0x031e:
            r6 = r11
            goto L_0x00e0
        L_0x0321:
            r7 = r10
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.ActionMenuView.m9329c(int, int):void");
    }

    /* renamed from: a */
    public C1586c generateLayoutParams(AttributeSet attributeSet) {
        return new C1586c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1586c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return mo5703j();
        }
        C1586c cVar = layoutParams instanceof C1586c ? new C1586c((C1586c) layoutParams) : new C1586c(layoutParams);
        if (cVar.f5713h > 0) {
            return cVar;
        }
        cVar.f5713h = 16;
        return cVar;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo5209a(C1550h hVar) {
        this.f5124l = hVar;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo5682a(C1567p.C1568a aVar, C1550h.C1551a aVar2) {
        this.f5129q = aVar;
        this.f5122c = aVar2;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo5683a() {
        return this.f5127o;
    }

    /* access modifiers changed from: protected */
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo5684a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C1584a)) {
            z = false | ((C1584a) childAt).mo5190e();
        }
        return (i <= 0 || !(childAt2 instanceof C1584a)) ? z : ((C1584a) childAt2).mo5189d() | z;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo5210a(C1555k kVar) {
        return this.f5124l.mo5343a((MenuItem) kVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1586c mo5703j() {
        C1586c cVar = new C1586c(-2, -2);
        cVar.f5713h = 16;
        return cVar;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: c */
    public C1586c mo5688c() {
        C1586c b = mo5703j();
        b.f5135a = true;
        return b;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C1586c);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: d */
    public C1550h mo5690d() {
        return this.f5124l;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public boolean mo5692e() {
        return this.f5128p != null && this.f5128p.mo7354e();
    }

    /* renamed from: f */
    public boolean mo5693f() {
        return this.f5128p != null && this.f5128p.mo7355g();
    }

    /* renamed from: g */
    public boolean mo5694g() {
        return this.f5128p != null && this.f5128p.mo7358j();
    }

    public Menu getMenu() {
        if (this.f5124l == null) {
            Context context = getContext();
            this.f5124l = new C1550h(context);
            this.f5124l.mo5334a((C1550h.C1551a) new C1587d());
            this.f5128p = new C1821d(context);
            this.f5128p.mo7351c(true);
            this.f5128p.mo5262a(this.f5129q != null ? this.f5129q : new C1585b());
            this.f5124l.mo5337a((C1567p) this.f5128p, this.f5125m);
            this.f5128p.mo7349a(this);
        }
        return this.f5124l;
    }

    @C0003aa
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f5128p.mo7352d();
    }

    public int getPopupTheme() {
        return this.f5126n;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int getWindowAnimations() {
        return 0;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: h */
    public boolean mo5701h() {
        return this.f5128p != null && this.f5128p.mo7359k();
    }

    /* renamed from: i */
    public void mo5702i() {
        if (this.f5128p != null) {
            this.f5128p.mo7356h();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f5128p != null) {
            this.f5128p.mo5269b(false);
            if (this.f5128p.mo7358j()) {
                this.f5128p.mo7355g();
                this.f5128p.mo7354e();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5702i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int width;
        int i10;
        if (!this.f5130r) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = 0;
        int i13 = 0;
        int paddingRight = ((i3 - i) - getPaddingRight()) - getPaddingLeft();
        boolean z3 = false;
        boolean a = C1819bu.m11063a(this);
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                z2 = z3;
                i8 = i13;
                i7 = paddingRight;
                i9 = i12;
            } else {
                C1586c cVar = (C1586c) childAt.getLayoutParams();
                if (cVar.f5135a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo5684a(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i10 = cVar.leftMargin + getPaddingLeft();
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i15 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i15, width, measuredHeight + i15);
                    i7 = paddingRight - measuredWidth;
                    z2 = true;
                    i8 = i13;
                    i9 = i12;
                } else {
                    int measuredWidth2 = childAt.getMeasuredWidth() + cVar.leftMargin + cVar.rightMargin;
                    int i16 = i12 + measuredWidth2;
                    int i17 = paddingRight - measuredWidth2;
                    if (mo5684a(i14)) {
                        i16 += dividerWidth;
                    }
                    boolean z4 = z3;
                    i7 = i17;
                    i8 = i13 + 1;
                    i9 = i16;
                    z2 = z4;
                }
            }
            i14++;
            i12 = i9;
            paddingRight = i7;
            i13 = i8;
            z3 = z2;
        }
        if (childCount != 1 || z3) {
            int i18 = i13 - (z3 ? 0 : 1);
            int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
            if (a) {
                int width2 = getWidth() - getPaddingRight();
                int i19 = 0;
                while (i19 < childCount) {
                    View childAt2 = getChildAt(i19);
                    C1586c cVar2 = (C1586c) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() == 8) {
                        i6 = width2;
                    } else if (cVar2.f5135a) {
                        i6 = width2;
                    } else {
                        int i20 = width2 - cVar2.rightMargin;
                        int measuredWidth3 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i21 = i11 - (measuredHeight2 / 2);
                        childAt2.layout(i20 - measuredWidth3, i21, i20, measuredHeight2 + i21);
                        i6 = i20 - ((cVar2.leftMargin + measuredWidth3) + max);
                    }
                    i19++;
                    width2 = i6;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            int i22 = 0;
            while (i22 < childCount) {
                View childAt3 = getChildAt(i22);
                C1586c cVar3 = (C1586c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8) {
                    i5 = paddingLeft;
                } else if (cVar3.f5135a) {
                    i5 = paddingLeft;
                } else {
                    int i23 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i23, i24, i23 + measuredWidth4, measuredHeight3 + i24);
                    i5 = cVar3.rightMargin + measuredWidth4 + max + i23;
                }
                i22++;
                paddingLeft = i5;
            }
            return;
        }
        View childAt4 = getChildAt(0);
        int measuredWidth5 = childAt4.getMeasuredWidth();
        int measuredHeight4 = childAt4.getMeasuredHeight();
        int i25 = ((i3 - i) / 2) - (measuredWidth5 / 2);
        int i26 = i11 - (measuredHeight4 / 2);
        childAt4.layout(i25, i26, measuredWidth5 + i25, measuredHeight4 + i26);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f5130r;
        this.f5130r = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f5130r) {
            this.f5131s = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f5130r || this.f5124l == null || size == this.f5131s)) {
            this.f5131s = size;
            this.f5124l.mo5362c(true);
        }
        int childCount = getChildCount();
        if (!this.f5130r || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C1586c cVar = (C1586c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m9329c(i, i2);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f5128p.mo7353d(z);
    }

    public void setOnMenuItemClickListener(C1588e eVar) {
        this.f5123d = eVar;
    }

    public void setOverflowIcon(@C0003aa Drawable drawable) {
        getMenu();
        this.f5128p.mo7348a(drawable);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setOverflowReserved(boolean z) {
        this.f5127o = z;
    }

    public void setPopupTheme(@C0016ak int i) {
        if (this.f5126n != i) {
            this.f5126n = i;
            if (i == 0) {
                this.f5125m = getContext();
            } else {
                this.f5125m = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setPresenter(C1821d dVar) {
        this.f5128p = dVar;
        this.f5128p.mo7349a(this);
    }
}
