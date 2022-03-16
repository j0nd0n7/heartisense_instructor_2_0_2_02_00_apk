package android.support.p010v4.p013c;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.p010v4.p014d.C0434d;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.c.cf */
public final class C0362cf implements Iterable<Intent> {

    /* renamed from: a */
    private static final String f1854a = "TaskStackBuilder";

    /* renamed from: b */
    private static final C0364b f1855b;

    /* renamed from: c */
    private final ArrayList<Intent> f1856c = new ArrayList<>();

    /* renamed from: d */
    private final Context f1857d;

    /* renamed from: android.support.v4.c.cf$a */
    public interface C0363a {
        /* renamed from: b_ */
        Intent mo1637b_();
    }

    /* renamed from: android.support.v4.c.cf$b */
    interface C0364b {
        /* renamed from: a */
        PendingIntent mo1638a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle);
    }

    /* renamed from: android.support.v4.c.cf$c */
    static class C0365c implements C0364b {
        C0365c() {
        }

        /* renamed from: a */
        public PendingIntent mo1638a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            return PendingIntent.getActivity(context, i, intent, i2);
        }
    }

    /* renamed from: android.support.v4.c.cf$d */
    static class C0366d implements C0364b {
        C0366d() {
        }

        /* renamed from: a */
        public PendingIntent mo1638a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C0368cg.m2109a(context, i, intentArr, i2);
        }
    }

    /* renamed from: android.support.v4.c.cf$e */
    static class C0367e implements C0364b {
        C0367e() {
        }

        /* renamed from: a */
        public PendingIntent mo1638a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return C0369ch.m2110a(context, i, intentArr, i2, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f1855b = new C0366d();
        } else {
            f1855b = new C0365c();
        }
    }

    private C0362cf(Context context) {
        this.f1857d = context;
    }

    /* renamed from: a */
    public static C0362cf m2089a(Context context) {
        return new C0362cf(context);
    }

    @Deprecated
    /* renamed from: b */
    public static C0362cf m2090b(Context context) {
        return m2089a(context);
    }

    /* renamed from: a */
    public int mo1623a() {
        return this.f1856c.size();
    }

    /* renamed from: a */
    public PendingIntent mo1624a(int i, int i2) {
        return mo1625a(i, i2, (Bundle) null);
    }

    /* renamed from: a */
    public PendingIntent mo1625a(int i, int i2, Bundle bundle) {
        if (this.f1856c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f1856c.toArray(new Intent[this.f1856c.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return f1855b.mo1638a(this.f1857d, intentArr, i, i2, bundle);
    }

    @Deprecated
    /* renamed from: a */
    public Intent mo1626a(int i) {
        return mo1632b(i);
    }

    /* renamed from: a */
    public C0362cf mo1627a(Activity activity) {
        Intent intent = null;
        if (activity instanceof C0363a) {
            intent = ((C0363a) activity).mo1637b_();
        }
        Intent b = intent == null ? C0251ax.m1548b(activity) : intent;
        if (b != null) {
            ComponentName component = b.getComponent();
            if (component == null) {
                component = b.resolveActivity(this.f1857d.getPackageManager());
            }
            mo1628a(component);
            mo1629a(b);
        }
        return this;
    }

    /* renamed from: a */
    public C0362cf mo1628a(ComponentName componentName) {
        int size = this.f1856c.size();
        try {
            Intent a = C0251ax.m1544a(this.f1857d, componentName);
            while (a != null) {
                this.f1856c.add(size, a);
                a = C0251ax.m1544a(this.f1857d, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f1854a, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0362cf mo1629a(Intent intent) {
        this.f1856c.add(intent);
        return this;
    }

    /* renamed from: a */
    public C0362cf mo1630a(Class<?> cls) {
        return mo1628a(new ComponentName(this.f1857d, cls));
    }

    /* renamed from: a */
    public void mo1631a(Bundle bundle) {
        if (this.f1856c.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1856c.toArray(new Intent[this.f1856c.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!C0434d.m2376a(this.f1857d, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f1857d.startActivity(intent);
        }
    }

    /* renamed from: b */
    public Intent mo1632b(int i) {
        return this.f1856c.get(i);
    }

    /* renamed from: b */
    public C0362cf mo1633b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f1857d.getPackageManager());
        }
        if (component != null) {
            mo1628a(component);
        }
        mo1629a(intent);
        return this;
    }

    /* renamed from: b */
    public void mo1634b() {
        mo1631a((Bundle) null);
    }

    /* renamed from: c */
    public Intent[] mo1635c() {
        Intent[] intentArr = new Intent[this.f1856c.size()];
        if (intentArr.length == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.f1856c.get(0)).addFlags(268484608);
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= intentArr.length) {
                return intentArr;
            }
            intentArr[i2] = new Intent(this.f1856c.get(i2));
            i = i2 + 1;
        }
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1856c.iterator();
    }
}
