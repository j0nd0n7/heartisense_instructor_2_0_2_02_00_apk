package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v7.app.k */
class C1425k extends C1432n {
    C1425k(Context context, Window window, C1416g gVar) {
        super(context, window, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4900c(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: d */
    public boolean mo4868d(int i) {
        return super.mo4868d(i) || this.f4436m.hasFeature(i);
    }
}
