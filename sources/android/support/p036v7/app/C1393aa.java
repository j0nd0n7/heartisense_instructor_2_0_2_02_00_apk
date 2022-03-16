package android.support.p036v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.C0020ao;
import android.support.annotation.C0047z;
import android.support.p010v4.p014d.C0471u;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.aa */
class C1393aa {

    /* renamed from: a */
    private static final String f4314a = "TwilightManager";

    /* renamed from: b */
    private static final int f4315b = 6;

    /* renamed from: c */
    private static final int f4316c = 22;

    /* renamed from: d */
    private static C1393aa f4317d;

    /* renamed from: e */
    private final Context f4318e;

    /* renamed from: f */
    private final LocationManager f4319f;

    /* renamed from: g */
    private final C1394a f4320g = new C1394a();

    /* renamed from: android.support.v7.app.aa$a */
    private static class C1394a {

        /* renamed from: a */
        boolean f4321a;

        /* renamed from: b */
        long f4322b;

        /* renamed from: c */
        long f4323c;

        /* renamed from: d */
        long f4324d;

        /* renamed from: e */
        long f4325e;

        /* renamed from: f */
        long f4326f;

        C1394a() {
        }
    }

    @C0020ao
    C1393aa(@C0047z Context context, @C0047z LocationManager locationManager) {
        this.f4318e = context;
        this.f4319f = locationManager;
    }

    /* renamed from: a */
    private Location m8067a(String str) {
        if (this.f4319f != null) {
            try {
                if (this.f4319f.isProviderEnabled(str)) {
                    return this.f4319f.getLastKnownLocation(str);
                }
            } catch (Exception e) {
                Log.d(f4314a, "Failed to get last known location", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    static C1393aa m8068a(@C0047z Context context) {
        if (f4317d == null) {
            Context applicationContext = context.getApplicationContext();
            f4317d = new C1393aa(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f4317d;
    }

    /* renamed from: a */
    private void m8069a(@C0047z Location location) {
        long j;
        C1394a aVar = this.f4320g;
        long currentTimeMillis = System.currentTimeMillis();
        C1475z a = C1475z.m8682a();
        a.mo4978a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f4583c;
        a.mo4978a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f4585e == 1;
        long j3 = a.f4584d;
        long j4 = a.f4583c;
        a.mo4978a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a.f4584d;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f4321a = z;
        aVar.f4322b = j2;
        aVar.f4323c = j3;
        aVar.f4324d = j4;
        aVar.f4325e = j5;
        aVar.f4326f = j;
    }

    @C0020ao
    /* renamed from: a */
    static void m8070a(C1393aa aaVar) {
        f4317d = aaVar;
    }

    /* renamed from: b */
    private Location m8071b() {
        Location location = null;
        Location a = C0471u.m2512a(this.f4318e, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m8067a("network") : null;
        if (C0471u.m2512a(this.f4318e, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m8067a("gps");
        }
        if (location != null && a != null) {
            return location.getTime() > a.getTime() ? location : a;
        }
        if (location == null) {
            location = a;
        }
        return location;
    }

    /* renamed from: c */
    private boolean m8072c() {
        return this.f4320g != null && this.f4320g.f4326f > System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4704a() {
        C1394a aVar = this.f4320g;
        if (m8072c()) {
            return aVar.f4321a;
        }
        Location b = m8071b();
        if (b != null) {
            m8069a(b);
            return aVar.f4321a;
        }
        Log.i(f4314a, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
