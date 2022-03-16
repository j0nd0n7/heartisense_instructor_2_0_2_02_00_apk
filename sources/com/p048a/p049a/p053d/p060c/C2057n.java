package com.p048a.p049a.p053d.p060c;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.p048a.p049a.p053d.p054a.C1897c;

/* renamed from: com.a.a.d.c.n */
public class C2057n<T> implements C2055l<Integer, T> {

    /* renamed from: a */
    private static final String f6904a = "ResourceLoader";

    /* renamed from: b */
    private final C2055l<Uri, T> f6905b;

    /* renamed from: c */
    private final Resources f6906c;

    public C2057n(Context context, C2055l<Uri, T> lVar) {
        this(context.getResources(), lVar);
    }

    public C2057n(Resources resources, C2055l<Uri, T> lVar) {
        this.f6906c = resources;
        this.f6905b = lVar;
    }

    /* renamed from: a */
    public C1897c<T> mo7901a(Integer num, int i, int i2) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.f6906c.getResourcePackageName(num.intValue()) + '/' + this.f6906c.getResourceTypeName(num.intValue()) + '/' + this.f6906c.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable(f6904a, 5)) {
                Log.w(f6904a, "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri != null) {
            return this.f6905b.mo7901a(uri, i, i2);
        }
        return null;
    }
}
