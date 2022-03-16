package android.support.p010v4.p029l;

import android.annotation.TargetApi;
import android.content.Context;
import android.print.PrintAttributes;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.l.c */
class C0834c extends C0833b {
    C0834c(Context context) {
        super(context);
        this.f2916j = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PrintAttributes.Builder mo2712a(PrintAttributes printAttributes) {
        PrintAttributes.Builder a = super.mo2712a(printAttributes);
        if (printAttributes.getDuplexMode() != 0) {
            a.setDuplexMode(printAttributes.getDuplexMode());
        }
        return a;
    }
}
