package com.p048a.p049a.p071e;

import android.content.Context;
import com.p048a.p049a.p071e.C2150c;

/* renamed from: com.a.a.e.d */
public class C2152d {
    /* renamed from: a */
    public C2150c mo8088a(Context context, C2150c.C2151a aVar) {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? new C2153e(context, aVar) : new C2158i();
    }
}
