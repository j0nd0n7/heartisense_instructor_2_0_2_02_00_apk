package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ContentFrameLayout */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private TypedValue f5182a;

    /* renamed from: b */
    private TypedValue f5183b;

    /* renamed from: c */
    private TypedValue f5184c;

    /* renamed from: d */
    private TypedValue f5185d;

    /* renamed from: e */
    private TypedValue f5186e;

    /* renamed from: f */
    private TypedValue f5187f;

    /* renamed from: g */
    private final Rect f5188g;

    /* renamed from: h */
    private C1595a f5189h;

    /* renamed from: android.support.v7.widget.ContentFrameLayout$a */
    public interface C1595a {
        /* renamed from: a */
        void mo4929a();

        /* renamed from: b */
        void mo4930b();
    }

    public ContentFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5188g = new Rect();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo5760a(int i, int i2, int i3, int i4) {
        this.f5188g.set(i, i2, i3, i4);
        if (C1040ar.m5876Z(this)) {
            requestLayout();
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo5761a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5186e == null) {
            this.f5186e = new TypedValue();
        }
        return this.f5186e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5187f == null) {
            this.f5187f = new TypedValue();
        }
        return this.f5187f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5184c == null) {
            this.f5184c = new TypedValue();
        }
        return this.f5184c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5185d == null) {
            this.f5185d = new TypedValue();
        }
        return this.f5185d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5182a == null) {
            this.f5182a = new TypedValue();
        }
        return this.f5182a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5183b == null) {
            this.f5183b = new TypedValue();
        }
        return this.f5183b;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5189h != null) {
            this.f5189h.mo4929a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5189h != null) {
            this.f5189h.mo4930b();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r11 = 5
            r1 = 1
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r5 = r0.getDisplayMetrics()
            int r0 = r5.widthPixels
            int r3 = r5.heightPixels
            if (r0 >= r3) goto L_0x00b8
            r0 = r1
        L_0x001a:
            int r6 = android.view.View.MeasureSpec.getMode(r13)
            int r7 = android.view.View.MeasureSpec.getMode(r14)
            if (r6 != r10) goto L_0x0100
            if (r0 == 0) goto L_0x00bb
            android.util.TypedValue r3 = r12.f5185d
        L_0x0028:
            if (r3 == 0) goto L_0x0100
            int r4 = r3.type
            if (r4 == 0) goto L_0x0100
            int r4 = r3.type
            if (r4 != r11) goto L_0x00bf
            float r3 = r3.getDimension(r5)
            int r3 = (int) r3
        L_0x0037:
            if (r3 <= 0) goto L_0x0100
            android.graphics.Rect r4 = r12.f5188g
            int r4 = r4.left
            android.graphics.Rect r8 = r12.f5188g
            int r8 = r8.right
            int r4 = r4 + r8
            int r3 = r3 - r4
            int r4 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = java.lang.Math.min(r3, r4)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            r4 = r1
        L_0x0050:
            if (r7 != r10) goto L_0x007d
            if (r0 == 0) goto L_0x00d1
            android.util.TypedValue r3 = r12.f5186e
        L_0x0056:
            if (r3 == 0) goto L_0x007d
            int r7 = r3.type
            if (r7 == 0) goto L_0x007d
            int r7 = r3.type
            if (r7 != r11) goto L_0x00d4
            float r3 = r3.getDimension(r5)
            int r3 = (int) r3
        L_0x0065:
            if (r3 <= 0) goto L_0x007d
            android.graphics.Rect r7 = r12.f5188g
            int r7 = r7.top
            android.graphics.Rect r8 = r12.f5188g
            int r8 = r8.bottom
            int r7 = r7 + r8
            int r3 = r3 - r7
            int r7 = android.view.View.MeasureSpec.getSize(r14)
            int r3 = java.lang.Math.min(r3, r7)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
        L_0x007d:
            super.onMeasure(r13, r14)
            int r7 = r12.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            if (r4 != 0) goto L_0x00f9
            if (r6 != r10) goto L_0x00f9
            if (r0 == 0) goto L_0x00e5
            android.util.TypedValue r0 = r12.f5183b
        L_0x0090:
            if (r0 == 0) goto L_0x00f9
            int r4 = r0.type
            if (r4 == 0) goto L_0x00f9
            int r4 = r0.type
            if (r4 != r11) goto L_0x00e8
            float r0 = r0.getDimension(r5)
            int r0 = (int) r0
        L_0x009f:
            if (r0 <= 0) goto L_0x00ab
            android.graphics.Rect r4 = r12.f5188g
            int r4 = r4.left
            android.graphics.Rect r5 = r12.f5188g
            int r5 = r5.right
            int r4 = r4 + r5
            int r0 = r0 - r4
        L_0x00ab:
            if (r7 >= r0) goto L_0x00f9
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            r2 = r1
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            super.onMeasure(r0, r14)
        L_0x00b7:
            return
        L_0x00b8:
            r0 = r2
            goto L_0x001a
        L_0x00bb:
            android.util.TypedValue r3 = r12.f5184c
            goto L_0x0028
        L_0x00bf:
            int r4 = r3.type
            r8 = 6
            if (r4 != r8) goto L_0x0103
            int r4 = r5.widthPixels
            float r4 = (float) r4
            int r8 = r5.widthPixels
            float r8 = (float) r8
            float r3 = r3.getFraction(r4, r8)
            int r3 = (int) r3
            goto L_0x0037
        L_0x00d1:
            android.util.TypedValue r3 = r12.f5187f
            goto L_0x0056
        L_0x00d4:
            int r7 = r3.type
            r8 = 6
            if (r7 != r8) goto L_0x00fd
            int r7 = r5.heightPixels
            float r7 = (float) r7
            int r8 = r5.heightPixels
            float r8 = (float) r8
            float r3 = r3.getFraction(r7, r8)
            int r3 = (int) r3
            goto L_0x0065
        L_0x00e5:
            android.util.TypedValue r0 = r12.f5182a
            goto L_0x0090
        L_0x00e8:
            int r4 = r0.type
            r6 = 6
            if (r4 != r6) goto L_0x00fb
            int r4 = r5.widthPixels
            float r4 = (float) r4
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r0 = r0.getFraction(r4, r5)
            int r0 = (int) r0
            goto L_0x009f
        L_0x00f9:
            r0 = r3
            goto L_0x00b2
        L_0x00fb:
            r0 = r2
            goto L_0x009f
        L_0x00fd:
            r3 = r2
            goto L_0x0065
        L_0x0100:
            r4 = r2
            goto L_0x0050
        L_0x0103:
            r3 = r2
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(C1595a aVar) {
        this.f5189h = aVar;
    }
}
