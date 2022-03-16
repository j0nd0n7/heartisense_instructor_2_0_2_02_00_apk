package android.support.p036v7.widget;

import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.bd */
class C1781bd {
    C1781bd() {
    }

    /* renamed from: a */
    static int m10797a(C1732az.C1771u uVar, C1719av avVar, View view, View view2, C1732az.C1750h hVar, boolean z) {
        if (hVar.mo6839H() == 0 || uVar.mo7056i() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(hVar.mo6912e(view) - hVar.mo6912e(view2)) + 1;
        }
        return Math.min(avVar.mo6552f(), avVar.mo6545b(view2) - avVar.mo6540a(view));
    }

    /* renamed from: a */
    static int m10798a(C1732az.C1771u uVar, C1719av avVar, View view, View view2, C1732az.C1750h hVar, boolean z, boolean z2) {
        if (hVar.mo6839H() == 0 || uVar.mo7056i() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (uVar.mo7056i() - Math.max(hVar.mo6912e(view), hVar.mo6912e(view2))) - 1) : Math.max(0, Math.min(hVar.mo6912e(view), hVar.mo6912e(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(avVar.mo6545b(view2) - avVar.mo6540a(view))) / ((float) (Math.abs(hVar.mo6912e(view) - hVar.mo6912e(view2)) + 1)))) + ((float) (avVar.mo6546c() - avVar.mo6540a(view))));
    }

    /* renamed from: b */
    static int m10799b(C1732az.C1771u uVar, C1719av avVar, View view, View view2, C1732az.C1750h hVar, boolean z) {
        if (hVar.mo6839H() == 0 || uVar.mo7056i() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return uVar.mo7056i();
        }
        return (int) ((((float) (avVar.mo6545b(view2) - avVar.mo6540a(view))) / ((float) (Math.abs(hVar.mo6912e(view) - hVar.mo6912e(view2)) + 1))) * ((float) uVar.mo7056i()));
    }
}
