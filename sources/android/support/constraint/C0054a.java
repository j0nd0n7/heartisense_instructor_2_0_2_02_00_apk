package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.C0108h;
import android.support.constraint.p003a.p004a.C0057b;
import android.util.AttributeSet;

/* renamed from: android.support.constraint.a */
public class C0054a extends C0099b {

    /* renamed from: a */
    public static final int f193a = 0;

    /* renamed from: b */
    public static final int f194b = 2;

    /* renamed from: c */
    public static final int f195c = 1;

    /* renamed from: d */
    public static final int f196d = 3;

    /* renamed from: e */
    public static final int f197e = 5;

    /* renamed from: f */
    public static final int f198f = 6;

    /* renamed from: l */
    private int f199l;

    /* renamed from: m */
    private int f200m;

    /* renamed from: n */
    private C0057b f201n;

    public C0054a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C0054a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C0054a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62a(AttributeSet attributeSet) {
        super.mo62a(attributeSet);
        this.f201n = new C0057b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0108h.C0111c.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0108h.C0111c.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f201n.mo88a(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f635j = this.f201n;
        mo453b();
    }

    /* renamed from: a */
    public boolean mo63a() {
        return this.f201n.mo91b();
    }

    public int getType() {
        return this.f199l;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f201n.mo88a(z);
    }

    public void setType(int i) {
        this.f199l = i;
        this.f200m = i;
        if (Build.VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                if (this.f199l == 5) {
                    this.f200m = 1;
                } else if (this.f199l == 6) {
                    this.f200m = 0;
                }
            } else if (this.f199l == 5) {
                this.f200m = 0;
            } else if (this.f199l == 6) {
                this.f200m = 1;
            }
        } else if (this.f199l == 5) {
            this.f200m = 0;
        } else if (this.f199l == 6) {
            this.f200m = 1;
        }
        this.f201n.mo86a(this.f200m);
    }
}
