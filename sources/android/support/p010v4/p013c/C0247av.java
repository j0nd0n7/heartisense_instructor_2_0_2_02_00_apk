package android.support.p010v4.p013c;

import android.os.Bundle;
import android.support.p010v4.p014d.C0453q;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.c.av */
public abstract class C0247av {

    /* renamed from: android.support.v4.c.av$a */
    public interface C0248a<D> {
        /* renamed from: a */
        C0453q<D> mo1293a(int i, Bundle bundle);

        /* renamed from: a */
        void mo1294a(C0453q<D> qVar);

        /* renamed from: a */
        void mo1295a(C0453q<D> qVar, D d);
    }

    /* renamed from: a */
    public static void m1506a(boolean z) {
        C0249aw.f1408b = z;
    }

    /* renamed from: a */
    public abstract <D> C0453q<D> mo1287a(int i, Bundle bundle, C0248a<D> aVar);

    /* renamed from: a */
    public abstract void mo1288a(int i);

    /* renamed from: a */
    public abstract void mo1289a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: a */
    public boolean mo1290a() {
        return false;
    }

    /* renamed from: b */
    public abstract <D> C0453q<D> mo1291b(int i);

    /* renamed from: b */
    public abstract <D> C0453q<D> mo1292b(int i, Bundle bundle, C0248a<D> aVar);
}
