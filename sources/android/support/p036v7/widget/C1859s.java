package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0016ak;
import android.support.annotation.C0027f;
import android.support.annotation.C0047z;
import android.support.p010v4.widget.C1214aa;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.s */
class C1859s extends PopupWindow {

    /* renamed from: a */
    private static final String f6321a = "AppCompatPopupWindow";

    /* renamed from: b */
    private static final boolean f6322b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: c */
    private boolean f6323c;

    public C1859s(@C0047z Context context, @C0003aa AttributeSet attributeSet, @C0027f int i) {
        super(context, attributeSet, i);
        m11234a(context, attributeSet, i, 0);
    }

    @TargetApi(11)
    public C1859s(@C0047z Context context, @C0003aa AttributeSet attributeSet, @C0027f int i, @C0016ak int i2) {
        super(context, attributeSet, i, i2);
        m11234a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m11234a(Context context, AttributeSet attributeSet, int i, int i2) {
        C1807bp a = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.PopupWindow, i, i2);
        if (a.mo7316j(C1359b.C1371l.PopupWindow_overlapAnchor)) {
            mo7481a(a.mo7295a(C1359b.C1371l.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo7293a(C1359b.C1371l.PopupWindow_android_popupBackground));
        int i3 = Build.VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && a.mo7316j(C1359b.C1371l.PopupWindow_android_popupAnimationStyle)) {
            setAnimationStyle(a.mo7312g(C1359b.C1371l.PopupWindow_android_popupAnimationStyle, -1));
        }
        a.mo7308e();
        if (Build.VERSION.SDK_INT < 14) {
            m11235a((PopupWindow) this);
        }
    }

    /* renamed from: a */
    private static void m11235a(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() {
                public void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference != null && weakReference.get() != null) {
                            onScrollChangedListener.onScrollChanged();
                        }
                    } catch (IllegalAccessException e) {
                    }
                }
            });
        } catch (Exception e) {
            Log.d(f6321a, "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo7481a(boolean z) {
        if (f6322b) {
            this.f6323c = z;
        } else {
            C1214aa.m7231a((PopupWindow) this, z);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo7482a() {
        return f6322b ? this.f6323c : C1214aa.m7232a(this);
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f6322b && this.f6323c) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @TargetApi(19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f6322b && this.f6323c) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (!f6322b || !this.f6323c) ? i2 : i2 - view.getHeight(), i3, i4);
    }
}
