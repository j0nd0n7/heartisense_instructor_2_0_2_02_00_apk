package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.support.p010v4.view.C1177n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.view.o */
class C1179o {

    /* renamed from: a */
    private static final String f3636a = "LayoutInflaterCompatHC";

    /* renamed from: b */
    private static Field f3637b;

    /* renamed from: c */
    private static boolean f3638c;

    /* renamed from: android.support.v4.view.o$a */
    static class C1180a extends C1177n.C1178a implements LayoutInflater.Factory2 {
        C1180a(C1182q qVar) {
            super(qVar);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f3635a.mo1103a(view, str, context, attributeSet);
        }
    }

    C1179o() {
    }

    /* renamed from: a */
    static void m7033a(LayoutInflater layoutInflater, C1182q qVar) {
        C1180a aVar = qVar != null ? new C1180a(qVar) : null;
        layoutInflater.setFactory2(aVar);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater.Factory2) {
            m7034a(layoutInflater, (LayoutInflater.Factory2) factory);
        } else {
            m7034a(layoutInflater, (LayoutInflater.Factory2) aVar);
        }
    }

    /* renamed from: a */
    static void m7034a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f3638c) {
            try {
                f3637b = LayoutInflater.class.getDeclaredField("mFactory2");
                f3637b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f3636a, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f3638c = true;
        }
        if (f3637b != null) {
            try {
                f3637b.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(f3636a, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
