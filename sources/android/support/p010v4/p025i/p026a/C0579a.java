package android.support.p010v4.p025i.p026a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p010v4.p025i.C0739n;
import android.support.p010v4.p025i.p026a.C0618h;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.i.a.a */
public interface C0579a extends IInterface {

    /* renamed from: android.support.v4.i.a.a$a */
    public static abstract class C0580a extends Binder implements C0579a {

        /* renamed from: a */
        static final int f2217a = 1;

        /* renamed from: b */
        static final int f2218b = 2;

        /* renamed from: c */
        static final int f2219c = 3;

        /* renamed from: d */
        static final int f2220d = 4;

        /* renamed from: e */
        static final int f2221e = 5;

        /* renamed from: f */
        static final int f2222f = 6;

        /* renamed from: g */
        static final int f2223g = 7;

        /* renamed from: h */
        static final int f2224h = 8;

        /* renamed from: i */
        static final int f2225i = 9;

        /* renamed from: j */
        static final int f2226j = 10;

        /* renamed from: k */
        private static final String f2227k = "android.support.v4.media.session.IMediaControllerCallback";

        /* renamed from: android.support.v4.i.a.a$a$a */
        private static class C0581a implements C0579a {

            /* renamed from: a */
            private IBinder f2228a;

            C0581a(IBinder iBinder) {
                this.f2228a = iBinder;
            }

            /* renamed from: a */
            public void mo2039a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    this.f2228a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2040a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    obtain.writeInt(i);
                    this.f2228a.transact(9, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2041a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2228a.transact(7, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2042a(C0660p pVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    if (pVar != null) {
                        obtain.writeInt(1);
                        pVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2228a.transact(8, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2043a(C0662q qVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    if (qVar != null) {
                        obtain.writeInt(1);
                        qVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2228a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2044a(C0739n nVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    if (nVar != null) {
                        obtain.writeInt(1);
                        nVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2228a.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2045a(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2228a.transact(6, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2046a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2228a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2047a(List<C0618h.C0635f> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    obtain.writeTypedList(list);
                    this.f2228a.transact(5, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo2048a(boolean z) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0580a.f2227k);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.f2228a.transact(10, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2228a;
            }

            /* renamed from: b */
            public String mo2052b() {
                return C0580a.f2227k;
            }
        }

        public C0580a() {
            attachInterface(this, f2227k);
        }

        /* renamed from: a */
        public static C0579a m2908a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2227k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0579a)) ? new C0581a(iBinder) : (C0579a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.support.v4.i.a.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: android.support.v4.i.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.support.v4.i.a.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r0v36 */
        /* JADX WARNING: type inference failed for: r0v37 */
        /* JADX WARNING: type inference failed for: r0v38 */
        /* JADX WARNING: type inference failed for: r0v39 */
        /* JADX WARNING: type inference failed for: r0v40 */
        /* JADX WARNING: type inference failed for: r0v41 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                switch(r5) {
                    case 1: goto L_0x0010;
                    case 2: goto L_0x002b;
                    case 3: goto L_0x0034;
                    case 4: goto L_0x004b;
                    case 5: goto L_0x0062;
                    case 6: goto L_0x0071;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x00a0;
                    case 9: goto L_0x00b8;
                    case 10: goto L_0x00c6;
                    case 1598968902: goto L_0x000a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                boolean r1 = super.onTransact(r5, r6, r7, r8)
            L_0x0009:
                return r1
            L_0x000a:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r7.writeString(r0)
                goto L_0x0009
            L_0x0010:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                java.lang.String r2 = r6.readString()
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x0027
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0027:
                r4.mo2046a(r2, r0)
                goto L_0x0009
            L_0x002b:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                r4.mo2039a()
                goto L_0x0009
            L_0x0034:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0047
                android.os.Parcelable$Creator<android.support.v4.i.a.q> r0 = android.support.p010v4.p025i.p026a.C0662q.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.support.v4.i.a.q r0 = (android.support.p010v4.p025i.p026a.C0662q) r0
            L_0x0047:
                r4.mo2043a((android.support.p010v4.p025i.p026a.C0662q) r0)
                goto L_0x0009
            L_0x004b:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x005e
                android.os.Parcelable$Creator<android.support.v4.i.n> r0 = android.support.p010v4.p025i.C0739n.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.support.v4.i.n r0 = (android.support.p010v4.p025i.C0739n) r0
            L_0x005e:
                r4.mo2044a((android.support.p010v4.p025i.C0739n) r0)
                goto L_0x0009
            L_0x0062:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                android.os.Parcelable$Creator<android.support.v4.i.a.h$f> r0 = android.support.p010v4.p025i.p026a.C0618h.C0635f.CREATOR
                java.util.ArrayList r0 = r6.createTypedArrayList(r0)
                r4.mo2047a((java.util.List<android.support.p010v4.p025i.p026a.C0618h.C0635f>) r0)
                goto L_0x0009
            L_0x0071:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x0084
                android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            L_0x0084:
                r4.mo2045a((java.lang.CharSequence) r0)
                goto L_0x0009
            L_0x0088:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x009b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x009b:
                r4.mo2041a((android.os.Bundle) r0)
                goto L_0x0009
            L_0x00a0:
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r2)
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x00b3
                android.os.Parcelable$Creator<android.support.v4.i.a.p> r0 = android.support.p010v4.p025i.p026a.C0660p.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.support.v4.i.a.p r0 = (android.support.p010v4.p025i.p026a.C0660p) r0
            L_0x00b3:
                r4.mo2042a((android.support.p010v4.p025i.p026a.C0660p) r0)
                goto L_0x0009
            L_0x00b8:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                r4.mo2040a((int) r0)
                goto L_0x0009
            L_0x00c6:
                java.lang.String r0 = "android.support.v4.media.session.IMediaControllerCallback"
                r6.enforceInterface(r0)
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x00d7
                r0 = r1
            L_0x00d2:
                r4.mo2048a((boolean) r0)
                goto L_0x0009
            L_0x00d7:
                r0 = 0
                goto L_0x00d2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p025i.p026a.C0579a.C0580a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo2039a();

    /* renamed from: a */
    void mo2040a(int i);

    /* renamed from: a */
    void mo2041a(Bundle bundle);

    /* renamed from: a */
    void mo2042a(C0660p pVar);

    /* renamed from: a */
    void mo2043a(C0662q qVar);

    /* renamed from: a */
    void mo2044a(C0739n nVar);

    /* renamed from: a */
    void mo2045a(CharSequence charSequence);

    /* renamed from: a */
    void mo2046a(String str, Bundle bundle);

    /* renamed from: a */
    void mo2047a(List<C0618h.C0635f> list);

    /* renamed from: a */
    void mo2048a(boolean z);
}
