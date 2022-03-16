package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.annotation.C0007ae;
import android.widget.CompoundButton;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.widget.f */
class C1298f {
    C1298f() {
    }

    /* renamed from: a */
    static ColorStateList m7627a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    /* renamed from: a */
    static void m7628a(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    /* renamed from: a */
    static void m7629a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }

    /* renamed from: b */
    static PorterDuff.Mode m7630b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }
}
