package android.support.p010v4.p028k;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.annotation.C0011ag;
import android.support.p010v4.p028k.C0804h;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.k.n */
public class C0813n implements Parcelable {
    public static final Parcelable.Creator<C0813n> CREATOR = new Parcelable.Creator<C0813n>() {
        /* renamed from: a */
        public C0813n createFromParcel(Parcel parcel) {
            return new C0813n(parcel);
        }

        /* renamed from: a */
        public C0813n[] newArray(int i) {
            return new C0813n[i];
        }
    };

    /* renamed from: a */
    final boolean f2883a;

    /* renamed from: b */
    final Handler f2884b;

    /* renamed from: c */
    C0804h f2885c;

    /* renamed from: android.support.v4.k.n$a */
    class C0815a extends C0804h.C0805a {
        C0815a() {
        }

        /* renamed from: a */
        public void mo2672a(int i, Bundle bundle) {
            if (C0813n.this.f2884b != null) {
                C0813n.this.f2884b.post(new C0816b(i, bundle));
            } else {
                C0813n.this.mo1970a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.k.n$b */
    class C0816b implements Runnable {

        /* renamed from: a */
        final int f2887a;

        /* renamed from: b */
        final Bundle f2888b;

        C0816b(int i, Bundle bundle) {
            this.f2887a = i;
            this.f2888b = bundle;
        }

        public void run() {
            C0813n.this.mo1970a(this.f2887a, this.f2888b);
        }
    }

    public C0813n(Handler handler) {
        this.f2883a = true;
        this.f2884b = handler;
    }

    C0813n(Parcel parcel) {
        this.f2883a = false;
        this.f2884b = null;
        this.f2885c = C0804h.C0805a.m4087a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1970a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo2684b(int i, Bundle bundle) {
        if (this.f2883a) {
            if (this.f2884b != null) {
                this.f2884b.post(new C0816b(i, bundle));
            } else {
                mo1970a(i, bundle);
            }
        } else if (this.f2885c != null) {
            try {
                this.f2885c.mo2672a(i, bundle);
            } catch (RemoteException e) {
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f2885c == null) {
                this.f2885c = new C0815a();
            }
            parcel.writeStrongBinder(this.f2885c.asBinder());
        }
    }
}
