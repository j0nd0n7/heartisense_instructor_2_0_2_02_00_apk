package com.p048a.p049a.p053d.p060c;

import android.net.Uri;
import android.text.TextUtils;
import com.p048a.p049a.p053d.p054a.C1897c;
import java.io.File;

/* renamed from: com.a.a.d.c.p */
public class C2059p<T> implements C2055l<String, T> {

    /* renamed from: a */
    private final C2055l<Uri, T> f6908a;

    public C2059p(C2055l<Uri, T> lVar) {
        this.f6908a = lVar;
    }

    /* renamed from: a */
    private static Uri m11937a(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public C1897c<T> mo7901a(String str, int i, int i2) {
        Uri parse;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            parse = m11937a(str);
        } else {
            parse = Uri.parse(str);
            if (parse.getScheme() == null) {
                parse = m11937a(str);
            }
        }
        return this.f6908a.mo7901a(parse, i, i2);
    }
}
