package android.support.p010v4.p013c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.c.at */
public interface C0241at extends IInterface {

    /* renamed from: android.support.v4.c.at$a */
    public static abstract class C0242a extends Binder implements C0241at {

        /* renamed from: a */
        static final int f1386a = 1;

        /* renamed from: b */
        static final int f1387b = 2;

        /* renamed from: c */
        static final int f1388c = 3;

        /* renamed from: d */
        private static final String f1389d = "android.support.v4.app.INotificationSideChannel";

        /* renamed from: android.support.v4.c.at$a$a */
        private static class C0243a implements C0241at {

            /* renamed from: a */
            private IBinder f1390a;

            C0243a(IBinder iBinder) {
                this.f1390a = iBinder;
            }

            /* renamed from: a */
            public String mo1275a() {
                return C0242a.f1389d;
            }

            /* renamed from: a */
            public void mo1270a(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0242a.f1389d);
                    obtain.writeString(str);
                    this.f1390a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1271a(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0242a.f1389d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f1390a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1272a(String str, int i, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0242a.f1389d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1390a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f1390a;
            }
        }

        public C0242a() {
            attachInterface(this, f1389d);
        }

        /* renamed from: a */
        public static C0241at m1486a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f1389d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0241at)) ? new C0243a(iBinder) : (C0241at) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    parcel.enforceInterface(f1389d);
                    mo1272a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface(f1389d);
                    mo1271a(parcel.readString(), parcel.readInt(), parcel.readString());
                    return true;
                case 3:
                    parcel.enforceInterface(f1389d);
                    mo1270a(parcel.readString());
                    return true;
                case 1598968902:
                    parcel2.writeString(f1389d);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo1270a(String str);

    /* renamed from: a */
    void mo1271a(String str, int i, String str2);

    /* renamed from: a */
    void mo1272a(String str, int i, String str2, Notification notification);
}
