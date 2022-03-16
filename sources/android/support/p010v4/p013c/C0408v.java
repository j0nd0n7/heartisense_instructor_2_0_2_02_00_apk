package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.util.AttributeSet;
import android.view.View;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.c.v */
abstract class C0408v extends C0360ce {

    /* renamed from: a */
    boolean f1933a;

    C0408v() {
    }

    /* renamed from: b */
    static void m2299b(int i) {
        if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo937a(View view, String str, Context context, AttributeSet attributeSet);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT < 11 && getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo937a((View) null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4) {
        if (!this.f1933a && i != -1) {
            m2299b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
