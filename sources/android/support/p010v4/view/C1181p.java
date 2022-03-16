package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.support.p010v4.view.C1179o;
import android.view.LayoutInflater;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.p */
class C1181p {
    C1181p() {
    }

    /* renamed from: a */
    static void m7035a(LayoutInflater layoutInflater, C1182q qVar) {
        layoutInflater.setFactory2(qVar != null ? new C1179o.C1180a(qVar) : null);
    }
}
