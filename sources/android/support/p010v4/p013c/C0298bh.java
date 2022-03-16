package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0337bv;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0007ae(mo1a = 9)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
@TargetApi(9)
/* renamed from: android.support.v4.c.bh */
public class C0298bh {

    /* renamed from: a */
    private static Method f1705a;

    /* renamed from: android.support.v4.c.bh$a */
    public static abstract class C0299a {

        /* renamed from: android.support.v4.c.bh$a$a */
        public interface C0300a {
            /* renamed from: a */
            C0299a mo1335a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0337bv.C0338a[] aVarArr, boolean z);

            /* renamed from: b */
            C0299a[] mo1337b(int i);
        }

        /* renamed from: a */
        public abstract int mo1328a();

        /* renamed from: b */
        public abstract CharSequence mo1329b();

        /* renamed from: c */
        public abstract PendingIntent mo1330c();

        /* renamed from: d */
        public abstract Bundle mo1331d();

        /* renamed from: e */
        public abstract boolean mo1332e();

        /* renamed from: g */
        public abstract C0337bv.C0338a[] mo1334g();
    }

    /* renamed from: android.support.v4.c.bh$b */
    public static abstract class C0301b {

        /* renamed from: android.support.v4.c.bh$b$a */
        public interface C0302a {
            /* renamed from: b */
            C0301b mo1441b(String[] strArr, C0337bv.C0338a aVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract String[] mo1432a();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract PendingIntent mo1434c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract PendingIntent mo1435d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract String[] mo1436e();

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract String mo1437f();

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract long mo1438g();

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract C0337bv.C0338a mo1439h();
    }

    /* renamed from: a */
    public static Notification m1868a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        if (f1705a == null) {
            try {
                f1705a = Notification.class.getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            f1705a.invoke(notification, new Object[]{context, charSequence, charSequence2, pendingIntent});
            notification.fullScreenIntent = pendingIntent2;
            return notification;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
