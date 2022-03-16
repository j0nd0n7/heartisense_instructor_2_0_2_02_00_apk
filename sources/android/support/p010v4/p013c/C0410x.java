package android.support.p010v4.p013c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;

/* renamed from: android.support.v4.c.x */
abstract class C0410x extends C0409w {

    /* renamed from: b */
    boolean f1934b;

    C0410x() {
    }

    @C0007ae(mo1a = 16)
    public void startActivityForResult(Intent intent, int i, @C0003aa Bundle bundle) {
        if (!this.f1934b && i != -1) {
            m2299b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @C0007ae(mo1a = 16)
    public void startIntentSenderForResult(IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1933a && i != -1) {
            m2299b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
