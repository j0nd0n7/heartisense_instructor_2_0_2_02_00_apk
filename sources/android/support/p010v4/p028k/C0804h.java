package android.support.p010v4.p028k;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.k.h */
public interface C0804h extends IInterface {

    /* renamed from: android.support.v4.k.h$a */
    public static abstract class C0805a extends Binder implements C0804h {

        /* renamed from: a */
        static final int f2878a = 1;

        /* renamed from: b */
        private static final String f2879b = "android.support.v4.os.IResultReceiver";

        /* renamed from: android.support.v4.k.h$a$a */
        private static class C0806a implements C0804h {

            /* renamed from: a */
            private IBinder f2880a;

            C0806a(IBinder iBinder) {
                this.f2880a = iBinder;
            }

            /* renamed from: a */
            public String mo2675a() {
                return C0805a.f2879b;
            }

            /* renamed from: a */
            public void mo2672a(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0805a.f2879b);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2880a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2880a;
            }
        }

        public C0805a() {
            attachInterface(this, f2879b);
        }

        /* renamed from: a */
        public static C0804h m4087a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f2879b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0804h)) ? new C0806a(iBinder) : (C0804h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface(f2879b);
                    mo2672a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 1598968902:
                    parcel2.writeString(f2879b);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo2672a(int i, Bundle bundle);
}
