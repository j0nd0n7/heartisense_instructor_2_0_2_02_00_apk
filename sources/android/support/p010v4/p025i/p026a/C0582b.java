package android.support.p010v4.p025i.p026a;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p010v4.p025i.C0732k;
import android.support.p010v4.p025i.C0739n;
import android.support.p010v4.p025i.C0749q;
import android.support.p010v4.p025i.p026a.C0579a;
import android.support.p010v4.p025i.p026a.C0618h;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.i.a.b */
public interface C0582b extends IInterface {

    /* renamed from: android.support.v4.i.a.b$a */
    public static abstract class C0583a extends Binder implements C0582b {

        /* renamed from: A */
        static final int f2229A = 35;

        /* renamed from: B */
        static final int f2230B = 36;

        /* renamed from: C */
        static final int f2231C = 13;

        /* renamed from: D */
        static final int f2232D = 14;

        /* renamed from: E */
        static final int f2233E = 15;

        /* renamed from: F */
        static final int f2234F = 16;

        /* renamed from: G */
        static final int f2235G = 17;

        /* renamed from: H */
        static final int f2236H = 18;

        /* renamed from: I */
        static final int f2237I = 19;

        /* renamed from: J */
        static final int f2238J = 20;

        /* renamed from: K */
        static final int f2239K = 21;

        /* renamed from: L */
        static final int f2240L = 22;

        /* renamed from: M */
        static final int f2241M = 23;

        /* renamed from: N */
        static final int f2242N = 24;

        /* renamed from: O */
        static final int f2243O = 25;

        /* renamed from: P */
        static final int f2244P = 39;

        /* renamed from: Q */
        static final int f2245Q = 40;

        /* renamed from: R */
        static final int f2246R = 26;

        /* renamed from: S */
        private static final String f2247S = "android.support.v4.media.session.IMediaSession";

        /* renamed from: a */
        static final int f2248a = 1;

        /* renamed from: b */
        static final int f2249b = 2;

        /* renamed from: c */
        static final int f2250c = 3;

        /* renamed from: d */
        static final int f2251d = 4;

        /* renamed from: e */
        static final int f2252e = 5;

        /* renamed from: f */
        static final int f2253f = 6;

        /* renamed from: g */
        static final int f2254g = 7;

        /* renamed from: h */
        static final int f2255h = 8;

        /* renamed from: i */
        static final int f2256i = 9;

        /* renamed from: j */
        static final int f2257j = 10;

        /* renamed from: k */
        static final int f2258k = 11;

        /* renamed from: l */
        static final int f2259l = 12;

        /* renamed from: m */
        static final int f2260m = 27;

        /* renamed from: n */
        static final int f2261n = 28;

        /* renamed from: o */
        static final int f2262o = 29;

        /* renamed from: p */
        static final int f2263p = 30;

        /* renamed from: q */
        static final int f2264q = 31;

        /* renamed from: r */
        static final int f2265r = 32;

        /* renamed from: s */
        static final int f2266s = 37;

        /* renamed from: t */
        static final int f2267t = 38;

        /* renamed from: u */
        static final int f2268u = 41;

        /* renamed from: v */
        static final int f2269v = 42;

        /* renamed from: w */
        static final int f2270w = 43;

        /* renamed from: x */
        static final int f2271x = 44;

        /* renamed from: y */
        static final int f2272y = 33;

        /* renamed from: z */
        static final int f2273z = 34;

        /* renamed from: android.support.v4.i.a.b$a$a */
        private static class C0584a implements C0582b {

            /* renamed from: a */
            private IBinder f2274a;

            C0584a(IBinder iBinder) {
                this.f2274a = iBinder;
            }

            /* renamed from: a */
            public void mo2053a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeInt(i);
                    this.f2274a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2054a(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f2274a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2055a(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeLong(j);
                    this.f2274a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2056a(Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2057a(C0579a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f2274a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2058a(C0732k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (kVar != null) {
                        obtain.writeInt(1);
                        kVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2059a(C0732k kVar, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (kVar != null) {
                        obtain.writeInt(1);
                        kVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f2274a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2060a(C0749q qVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (qVar != null) {
                        obtain.writeInt(1);
                        qVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2061a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2062a(String str, Bundle bundle, C0618h.C0637g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (gVar != null) {
                        obtain.writeInt(1);
                        gVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2063a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f2274a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo2064a() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public boolean mo2065a(KeyEvent keyEvent) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2274a;
            }

            /* renamed from: b */
            public String mo2066b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2067b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeInt(i);
                    this.f2274a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2068b(int i, int i2, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f2274a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2069b(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeLong(j);
                    this.f2274a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2070b(Uri uri, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2071b(C0579a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f2274a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2072b(C0732k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    if (kVar != null) {
                        obtain.writeInt(1);
                        kVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo2073b(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public String mo2074c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public void mo2075c(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public PendingIntent mo2076d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public void mo2077d(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public long mo2078e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public void mo2079e(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2274a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public C0660p mo2080f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C0660p.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public C0739n mo2081g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C0739n.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public C0662q mo2082h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? C0662q.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public List<C0618h.C0635f> mo2083i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(C0618h.C0635f.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public CharSequence mo2084j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public Bundle mo2085k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public int mo2086l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public int mo2087m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public boolean mo2088n() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public void mo2089o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public void mo2090p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public void mo2091q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public void mo2092r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public void mo2093s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public void mo2094t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public void mo2095u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public void mo2096v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0583a.f2247S);
                    this.f2274a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public String mo2100w() {
                return C0583a.f2247S;
            }
        }

        public C0583a() {
            attachInterface(this, f2247S);
        }

        /* renamed from: a */
        public static C0582b m2964a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2247S);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0582b)) ? new C0584a(iBinder) : (C0582b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface(f2247S);
                    mo2062a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? C0618h.C0637g.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(f2247S);
                    boolean a = mo2065a(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(a ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(f2247S);
                    mo2057a(C0579a.C0580a.m2908a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(f2247S);
                    mo2071b(C0579a.C0580a.m2908a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(f2247S);
                    boolean a2 = mo2064a();
                    parcel2.writeNoException();
                    if (a2) {
                        z = true;
                    }
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f2247S);
                    String b = mo2066b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    return true;
                case 7:
                    parcel.enforceInterface(f2247S);
                    String c = mo2074c();
                    parcel2.writeNoException();
                    parcel2.writeString(c);
                    return true;
                case 8:
                    parcel.enforceInterface(f2247S);
                    PendingIntent d = mo2076d();
                    parcel2.writeNoException();
                    if (d != null) {
                        parcel2.writeInt(1);
                        d.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 9:
                    parcel.enforceInterface(f2247S);
                    long e = mo2078e();
                    parcel2.writeNoException();
                    parcel2.writeLong(e);
                    return true;
                case 10:
                    parcel.enforceInterface(f2247S);
                    C0660p f = mo2080f();
                    parcel2.writeNoException();
                    if (f != null) {
                        parcel2.writeInt(1);
                        f.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 11:
                    parcel.enforceInterface(f2247S);
                    mo2054a(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(f2247S);
                    mo2068b(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(f2247S);
                    mo2090p();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(f2247S);
                    mo2075c(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(f2247S);
                    mo2077d(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(f2247S);
                    mo2070b(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(f2247S);
                    mo2055a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(f2247S);
                    mo2091q();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(f2247S);
                    mo2092r();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(f2247S);
                    mo2093s();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(f2247S);
                    mo2094t();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(f2247S);
                    mo2095u();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(f2247S);
                    mo2096v();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(f2247S);
                    mo2069b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(f2247S);
                    mo2060a(parcel.readInt() != 0 ? C0749q.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(f2247S);
                    mo2079e(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(f2247S);
                    C0739n g = mo2081g();
                    parcel2.writeNoException();
                    if (g != null) {
                        parcel2.writeInt(1);
                        g.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 28:
                    parcel.enforceInterface(f2247S);
                    C0662q h = mo2082h();
                    parcel2.writeNoException();
                    if (h != null) {
                        parcel2.writeInt(1);
                        h.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 29:
                    parcel.enforceInterface(f2247S);
                    List<C0618h.C0635f> i3 = mo2083i();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(i3);
                    return true;
                case 30:
                    parcel.enforceInterface(f2247S);
                    CharSequence j = mo2084j();
                    parcel2.writeNoException();
                    if (j != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(j, parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 31:
                    parcel.enforceInterface(f2247S);
                    Bundle k = mo2085k();
                    parcel2.writeNoException();
                    if (k != null) {
                        parcel2.writeInt(1);
                        k.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 32:
                    parcel.enforceInterface(f2247S);
                    int l = mo2086l();
                    parcel2.writeNoException();
                    parcel2.writeInt(l);
                    return true;
                case 33:
                    parcel.enforceInterface(f2247S);
                    mo2089o();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface(f2247S);
                    mo2061a(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(f2247S);
                    mo2073b(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(f2247S);
                    mo2056a(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(f2247S);
                    int m = mo2087m();
                    parcel2.writeNoException();
                    parcel2.writeInt(m);
                    return true;
                case 38:
                    parcel.enforceInterface(f2247S);
                    boolean n = mo2088n();
                    parcel2.writeNoException();
                    if (n) {
                        z = true;
                    }
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface(f2247S);
                    mo2067b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(f2247S);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    mo2063a(z);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(f2247S);
                    mo2058a(parcel.readInt() != 0 ? C0732k.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(f2247S);
                    mo2059a(parcel.readInt() != 0 ? C0732k.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(f2247S);
                    mo2072b(parcel.readInt() != 0 ? C0732k.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(f2247S);
                    mo2053a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString(f2247S);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo2053a(int i);

    /* renamed from: a */
    void mo2054a(int i, int i2, String str);

    /* renamed from: a */
    void mo2055a(long j);

    /* renamed from: a */
    void mo2056a(Uri uri, Bundle bundle);

    /* renamed from: a */
    void mo2057a(C0579a aVar);

    /* renamed from: a */
    void mo2058a(C0732k kVar);

    /* renamed from: a */
    void mo2059a(C0732k kVar, int i);

    /* renamed from: a */
    void mo2060a(C0749q qVar);

    /* renamed from: a */
    void mo2061a(String str, Bundle bundle);

    /* renamed from: a */
    void mo2062a(String str, Bundle bundle, C0618h.C0637g gVar);

    /* renamed from: a */
    void mo2063a(boolean z);

    /* renamed from: a */
    boolean mo2064a();

    /* renamed from: a */
    boolean mo2065a(KeyEvent keyEvent);

    /* renamed from: b */
    String mo2066b();

    /* renamed from: b */
    void mo2067b(int i);

    /* renamed from: b */
    void mo2068b(int i, int i2, String str);

    /* renamed from: b */
    void mo2069b(long j);

    /* renamed from: b */
    void mo2070b(Uri uri, Bundle bundle);

    /* renamed from: b */
    void mo2071b(C0579a aVar);

    /* renamed from: b */
    void mo2072b(C0732k kVar);

    /* renamed from: b */
    void mo2073b(String str, Bundle bundle);

    /* renamed from: c */
    String mo2074c();

    /* renamed from: c */
    void mo2075c(String str, Bundle bundle);

    /* renamed from: d */
    PendingIntent mo2076d();

    /* renamed from: d */
    void mo2077d(String str, Bundle bundle);

    /* renamed from: e */
    long mo2078e();

    /* renamed from: e */
    void mo2079e(String str, Bundle bundle);

    /* renamed from: f */
    C0660p mo2080f();

    /* renamed from: g */
    C0739n mo2081g();

    /* renamed from: h */
    C0662q mo2082h();

    /* renamed from: i */
    List<C0618h.C0635f> mo2083i();

    /* renamed from: j */
    CharSequence mo2084j();

    /* renamed from: k */
    Bundle mo2085k();

    /* renamed from: l */
    int mo2086l();

    /* renamed from: m */
    int mo2087m();

    /* renamed from: n */
    boolean mo2088n();

    /* renamed from: o */
    void mo2089o();

    /* renamed from: p */
    void mo2090p();

    /* renamed from: q */
    void mo2091q();

    /* renamed from: r */
    void mo2092r();

    /* renamed from: s */
    void mo2093s();

    /* renamed from: t */
    void mo2094t();

    /* renamed from: u */
    void mo2095u();

    /* renamed from: v */
    void mo2096v();
}
