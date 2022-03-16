package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0337bv;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.c.bw */
class C0340bw {

    /* renamed from: a */
    public static final String f1818a = "android.remoteinput.results";

    /* renamed from: b */
    public static final String f1819b = "android.remoteinput.resultsData";

    /* renamed from: c */
    private static final String f1820c = "resultKey";

    /* renamed from: d */
    private static final String f1821d = "label";

    /* renamed from: e */
    private static final String f1822e = "choices";

    /* renamed from: f */
    private static final String f1823f = "allowFreeFormInput";

    /* renamed from: g */
    private static final String f1824g = "extras";

    C0340bw() {
    }

    /* renamed from: a */
    static Bundle m2006a(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (!description.hasMimeType("text/vnd.android.intent") || !description.getLabel().equals("android.remoteinput.results")) {
            return null;
        }
        return (Bundle) clipData.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
    }

    /* renamed from: a */
    static Bundle m2007a(C0337bv.C0338a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString(f1820c, aVar.mo1553a());
        bundle.putCharSequence(f1821d, aVar.mo1554b());
        bundle.putCharSequenceArray(f1822e, aVar.mo1555c());
        bundle.putBoolean(f1823f, aVar.mo1556d());
        bundle.putBundle(f1824g, aVar.mo1557e());
        return bundle;
    }

    /* renamed from: a */
    static C0337bv.C0338a m2008a(Bundle bundle, C0337bv.C0338a.C0339a aVar) {
        return aVar.mo1560b(bundle.getString(f1820c), bundle.getCharSequence(f1821d), bundle.getCharSequenceArray(f1822e), bundle.getBoolean(f1823f), bundle.getBundle(f1824g));
    }

    /* renamed from: a */
    static void m2009a(C0337bv.C0338a[] aVarArr, Intent intent, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        for (C0337bv.C0338a aVar : aVarArr) {
            Object obj = bundle.get(aVar.mo1553a());
            if (obj instanceof CharSequence) {
                bundle2.putCharSequence(aVar.mo1553a(), (CharSequence) obj);
            }
        }
        Intent intent2 = new Intent();
        intent2.putExtra("android.remoteinput.resultsData", bundle2);
        intent.setClipData(ClipData.newIntent("android.remoteinput.results", intent2));
    }

    /* renamed from: a */
    static Bundle[] m2010a(C0337bv.C0338a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            bundleArr[i] = m2007a(aVarArr[i]);
        }
        return bundleArr;
    }

    /* renamed from: a */
    static C0337bv.C0338a[] m2011a(Bundle[] bundleArr, C0337bv.C0338a.C0339a aVar) {
        if (bundleArr == null) {
            return null;
        }
        C0337bv.C0338a[] b = aVar.mo1561b(bundleArr.length);
        for (int i = 0; i < bundleArr.length; i++) {
            b[i] = m2008a(bundleArr[i], aVar);
        }
        return b;
    }
}
