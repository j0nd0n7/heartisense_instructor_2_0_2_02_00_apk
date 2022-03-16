package android.support.p036v7.p043e;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.C0011ag;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.e.a */
public class C1489a implements TransformationMethod {

    /* renamed from: a */
    private Locale f4618a;

    public C1489a(Context context) {
        this.f4618a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f4618a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
