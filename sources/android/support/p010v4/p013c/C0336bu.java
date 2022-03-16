package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0337bv;

@C0007ae(mo1a = 20)
@TargetApi(20)
/* renamed from: android.support.v4.c.bu */
class C0336bu {
    C0336bu() {
    }

    /* renamed from: a */
    static Bundle m1995a(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    /* renamed from: a */
    static void m1996a(C0337bv.C0338a[] aVarArr, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent(m1997a(aVarArr), intent, bundle);
    }

    /* renamed from: a */
    static RemoteInput[] m1997a(C0337bv.C0338a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            C0337bv.C0338a aVar = aVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(aVar.mo1553a()).setLabel(aVar.mo1554b()).setChoices(aVar.mo1555c()).setAllowFreeFormInput(aVar.mo1556d()).addExtras(aVar.mo1557e()).build();
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    static C0337bv.C0338a[] m1998a(RemoteInput[] remoteInputArr, C0337bv.C0338a.C0339a aVar) {
        if (remoteInputArr == null) {
            return null;
        }
        C0337bv.C0338a[] b = aVar.mo1561b(remoteInputArr.length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= remoteInputArr.length) {
                return b;
            }
            RemoteInput remoteInput = remoteInputArr[i2];
            b[i2] = aVar.mo1560b(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras());
            i = i2 + 1;
        }
    }
}
