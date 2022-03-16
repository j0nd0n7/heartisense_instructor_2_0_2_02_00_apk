package android.support.p036v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0185ac;

/* renamed from: android.support.v7.app.p */
public class C1449p extends C0185ac {
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo766a(Dialog dialog, int i) {
        if (dialog instanceof C1448o) {
            C1448o oVar = (C1448o) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
                default:
                    return;
            }
            oVar.mo4956e(1);
            return;
        }
        super.mo766a(dialog, i);
    }

    /* renamed from: c */
    public Dialog mo775c(Bundle bundle) {
        return new C1448o(mo914q(), mo777d());
    }
}
