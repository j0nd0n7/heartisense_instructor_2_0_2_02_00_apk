package android.support.p010v4.p013c;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.c.w */
abstract class C0409w extends C0408v {
    C0409w() {
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo937a(view, str, context, attributeSet);
        return (a != null || Build.VERSION.SDK_INT < 11) ? a : super.onCreateView(view, str, context, attributeSet);
    }
}
