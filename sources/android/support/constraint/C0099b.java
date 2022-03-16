package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.C0108h;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.p003a.p004a.C0078l;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: android.support.constraint.b */
public abstract class C0099b extends View {

    /* renamed from: a */
    private String f631a;

    /* renamed from: g */
    protected int[] f632g = new int[32];

    /* renamed from: h */
    protected int f633h;

    /* renamed from: i */
    protected Context f634i;

    /* renamed from: j */
    protected C0078l f635j;

    /* renamed from: k */
    protected boolean f636k = false;

    public C0099b(Context context) {
        super(context);
        this.f634i = context;
        mo62a((AttributeSet) null);
    }

    public C0099b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f634i = context;
        mo62a(attributeSet);
    }

    public C0099b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f634i = context;
        mo62a(attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r0 = ((android.support.constraint.ConstraintLayout) getParent()).mo30a(0, (java.lang.Object) r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m530a(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            r2 = 0
            if (r7 != 0) goto L_0x0005
        L_0x0004:
            return
        L_0x0005:
            android.content.Context r0 = r6.f634i
            if (r0 == 0) goto L_0x0004
            java.lang.String r3 = r7.trim()
            java.lang.Class<android.support.constraint.h$b> r0 = android.support.constraint.C0108h.C0110b.class
            java.lang.reflect.Field r0 = r0.getField(r3)     // Catch:{ Exception -> 0x0058 }
            r1 = 0
            int r1 = r0.getInt(r1)     // Catch:{ Exception -> 0x0058 }
        L_0x0018:
            if (r1 != 0) goto L_0x002c
            android.content.Context r0 = r6.f634i
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "id"
            android.content.Context r4 = r6.f634i
            java.lang.String r4 = r4.getPackageName()
            int r1 = r0.getIdentifier(r3, r1, r4)
        L_0x002c:
            if (r1 != 0) goto L_0x007a
            boolean r0 = r6.isInEditMode()
            if (r0 == 0) goto L_0x007a
            android.view.ViewParent r0 = r6.getParent()
            boolean r0 = r0 instanceof android.support.constraint.ConstraintLayout
            if (r0 == 0) goto L_0x007a
            android.view.ViewParent r0 = r6.getParent()
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            java.lang.Object r0 = r0.mo30a((int) r2, (java.lang.Object) r3)
            if (r0 == 0) goto L_0x007a
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x007a
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0052:
            if (r0 == 0) goto L_0x005b
            r6.setTag(r0, r5)
            goto L_0x0004
        L_0x0058:
            r0 = move-exception
            r1 = r2
            goto L_0x0018
        L_0x005b:
            java.lang.String r0 = "ConstraintHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not find id of \""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = "\""
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            goto L_0x0004
        L_0x007a:
            r0 = r1
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.C0099b.m530a(java.lang.String):void");
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m530a(str.substring(i));
                    return;
                } else {
                    m530a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo452a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f631a);
        }
        if (this.f635j != null) {
            this.f635j.mo143e();
            for (int i = 0; i < this.f633h; i++) {
                View a = constraintLayout.mo29a(this.f632g[i]);
                if (a != null) {
                    this.f635j.mo332f(constraintLayout.mo28a(a));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0108h.C0111c.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f631a = obtainStyledAttributes.getString(index);
                    setIds(this.f631a);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo453b() {
        if (this.f635j != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0052a) {
                ((ConstraintLayout.C0052a) layoutParams).f105aD = this.f635j;
            }
        }
    }

    /* renamed from: b */
    public void mo454b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo455c(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f632g, this.f633h);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f636k) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f633h = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i, Object obj) {
        if (this.f633h + 1 > this.f632g.length) {
            this.f632g = Arrays.copyOf(this.f632g, this.f632g.length * 2);
        }
        this.f632g[this.f633h] = i;
        this.f633h++;
    }
}
