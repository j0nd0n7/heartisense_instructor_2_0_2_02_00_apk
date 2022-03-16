package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.annotation.C0036o;
import android.support.p010v4.view.C1034ao;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.i */
public class C1844i extends Button implements C1034ao {

    /* renamed from: a */
    private final C1843h f6280a;

    /* renamed from: b */
    private final C1873z f6281b;

    public C1844i(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1844i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.buttonStyle);
    }

    public C1844i(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        this.f6280a = new C1843h(this);
        this.f6280a.mo7425a(attributeSet, i);
        this.f6281b = C1873z.m11265a((TextView) this);
        this.f6281b.mo6244a(attributeSet, i);
        this.f6281b.mo6243a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6280a != null) {
            this.f6280a.mo7428c();
        }
        if (this.f6281b != null) {
            this.f6281b.mo6243a();
        }
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f6280a != null) {
            return this.f6280a.mo7420a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f6280a != null) {
            return this.f6280a.mo7426b();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @C0007ae(mo1a = 14)
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f6280a != null) {
            this.f6280a.mo7424a(drawable);
        }
    }

    public void setBackgroundResource(@C0036o int i) {
        super.setBackgroundResource(i);
        if (this.f6280a != null) {
            this.f6280a.mo7421a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f6281b != null) {
            this.f6281b.mo7549a(z);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f6280a != null) {
            this.f6280a.mo7422a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f6280a != null) {
            this.f6280a.mo7423a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f6281b != null) {
            this.f6281b.mo7547a(context, i);
        }
    }
}
