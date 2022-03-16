package android.support.p010v4.p013c;

import android.app.Activity;
import android.support.annotation.C0011ag;
import android.support.p010v4.p033o.C0900o;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.c.ce */
public class C0360ce extends Activity {

    /* renamed from: a */
    private C0900o<Class<? extends C0361a>, C0361a> f1853a = new C0900o<>();

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v4.c.ce$a */
    public static class C0361a {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public <T extends C0361a> T mo1621a(Class<T> cls) {
        return (C0361a) this.f1853a.get(cls);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo1622a(C0361a aVar) {
        this.f1853a.put(aVar.getClass(), aVar);
    }
}
