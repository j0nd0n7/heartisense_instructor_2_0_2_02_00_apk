package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.view.n */
class C1177n {

    /* renamed from: android.support.v4.view.n$a */
    static class C1178a implements LayoutInflater.Factory {

        /* renamed from: a */
        final C1182q f3635a;

        C1178a(C1182q qVar) {
            this.f3635a = qVar;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f3635a.mo1103a((View) null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f3635a + "}";
        }
    }

    C1177n() {
    }

    /* renamed from: a */
    static C1182q m7031a(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof C1178a) {
            return ((C1178a) factory).f3635a;
        }
        return null;
    }

    /* renamed from: a */
    static void m7032a(LayoutInflater layoutInflater, C1182q qVar) {
        layoutInflater.setFactory(qVar != null ? new C1178a(qVar) : null);
    }
}
