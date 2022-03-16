package android.support.p010v4.p013c;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: android.support.v4.c.an */
final class C0218an implements Parcelable {
    public static final Parcelable.Creator<C0218an> CREATOR = new Parcelable.Creator<C0218an>() {
        /* renamed from: a */
        public C0218an createFromParcel(Parcel parcel) {
            return new C0218an(parcel);
        }

        /* renamed from: a */
        public C0218an[] newArray(int i) {
            return new C0218an[i];
        }
    };

    /* renamed from: a */
    final String f1295a;

    /* renamed from: b */
    final int f1296b;

    /* renamed from: c */
    final boolean f1297c;

    /* renamed from: d */
    final int f1298d;

    /* renamed from: e */
    final int f1299e;

    /* renamed from: f */
    final String f1300f;

    /* renamed from: g */
    final boolean f1301g;

    /* renamed from: h */
    final boolean f1302h;

    /* renamed from: i */
    final Bundle f1303i;

    /* renamed from: j */
    final boolean f1304j;

    /* renamed from: k */
    Bundle f1305k;

    /* renamed from: l */
    C0186ad f1306l;

    public C0218an(Parcel parcel) {
        boolean z = true;
        this.f1295a = parcel.readString();
        this.f1296b = parcel.readInt();
        this.f1297c = parcel.readInt() != 0;
        this.f1298d = parcel.readInt();
        this.f1299e = parcel.readInt();
        this.f1300f = parcel.readString();
        this.f1301g = parcel.readInt() != 0;
        this.f1302h = parcel.readInt() != 0;
        this.f1303i = parcel.readBundle();
        this.f1304j = parcel.readInt() == 0 ? false : z;
        this.f1305k = parcel.readBundle();
    }

    public C0218an(C0186ad adVar) {
        this.f1295a = adVar.getClass().getName();
        this.f1296b = adVar.f1160x;
        this.f1297c = adVar.f1126F;
        this.f1298d = adVar.f1135O;
        this.f1299e = adVar.f1136P;
        this.f1300f = adVar.f1137Q;
        this.f1301g = adVar.f1140T;
        this.f1302h = adVar.f1139S;
        this.f1303i = adVar.f1162z;
        this.f1304j = adVar.f1138R;
    }

    /* renamed from: a */
    public C0186ad mo1198a(C0200ah ahVar, C0186ad adVar, C0214ak akVar) {
        if (this.f1306l == null) {
            Context i = ahVar.mo1049i();
            if (this.f1303i != null) {
                this.f1303i.setClassLoader(i.getClassLoader());
            }
            this.f1306l = C0186ad.m906a(i, this.f1295a, this.f1303i);
            if (this.f1305k != null) {
                this.f1305k.setClassLoader(i.getClassLoader());
                this.f1306l.f1158v = this.f1305k;
            }
            this.f1306l.mo819a(this.f1296b, adVar);
            this.f1306l.f1126F = this.f1297c;
            this.f1306l.f1128H = true;
            this.f1306l.f1135O = this.f1298d;
            this.f1306l.f1136P = this.f1299e;
            this.f1306l.f1137Q = this.f1300f;
            this.f1306l.f1140T = this.f1301g;
            this.f1306l.f1139S = this.f1302h;
            this.f1306l.f1138R = this.f1304j;
            this.f1306l.f1130J = ahVar.f1212d;
            if (C0205aj.f1231b) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f1306l);
            }
        }
        this.f1306l.f1133M = akVar;
        return this.f1306l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f1295a);
        parcel.writeInt(this.f1296b);
        parcel.writeInt(this.f1297c ? 1 : 0);
        parcel.writeInt(this.f1298d);
        parcel.writeInt(this.f1299e);
        parcel.writeString(this.f1300f);
        parcel.writeInt(this.f1301g ? 1 : 0);
        parcel.writeInt(this.f1302h ? 1 : 0);
        parcel.writeBundle(this.f1303i);
        if (!this.f1304j) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.f1305k);
    }
}
