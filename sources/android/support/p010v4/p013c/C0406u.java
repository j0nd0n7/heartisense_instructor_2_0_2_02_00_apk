package android.support.p010v4.p013c;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v4.p013c.C0404t;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.v4.c.u */
final class C0406u implements Parcelable {
    public static final Parcelable.Creator<C0406u> CREATOR = new Parcelable.Creator<C0406u>() {
        /* renamed from: a */
        public C0406u createFromParcel(Parcel parcel) {
            return new C0406u(parcel);
        }

        /* renamed from: a */
        public C0406u[] newArray(int i) {
            return new C0406u[i];
        }
    };

    /* renamed from: a */
    final int[] f1921a;

    /* renamed from: b */
    final int f1922b;

    /* renamed from: c */
    final int f1923c;

    /* renamed from: d */
    final String f1924d;

    /* renamed from: e */
    final int f1925e;

    /* renamed from: f */
    final int f1926f;

    /* renamed from: g */
    final CharSequence f1927g;

    /* renamed from: h */
    final int f1928h;

    /* renamed from: i */
    final CharSequence f1929i;

    /* renamed from: j */
    final ArrayList<String> f1930j;

    /* renamed from: k */
    final ArrayList<String> f1931k;

    /* renamed from: l */
    final boolean f1932l;

    public C0406u(Parcel parcel) {
        this.f1921a = parcel.createIntArray();
        this.f1922b = parcel.readInt();
        this.f1923c = parcel.readInt();
        this.f1924d = parcel.readString();
        this.f1925e = parcel.readInt();
        this.f1926f = parcel.readInt();
        this.f1927g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1928h = parcel.readInt();
        this.f1929i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1930j = parcel.createStringArrayList();
        this.f1931k = parcel.createStringArrayList();
        this.f1932l = parcel.readInt() != 0;
    }

    public C0406u(C0404t tVar) {
        int size = tVar.f1900l.size();
        this.f1921a = new int[(size * 6)];
        if (!tVar.f1907s) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0404t.C0405a aVar = tVar.f1900l.get(i2);
            int i3 = i + 1;
            this.f1921a[i] = aVar.f1915a;
            int i4 = i3 + 1;
            this.f1921a[i3] = aVar.f1916b != null ? aVar.f1916b.f1160x : -1;
            int i5 = i4 + 1;
            this.f1921a[i4] = aVar.f1917c;
            int i6 = i5 + 1;
            this.f1921a[i5] = aVar.f1918d;
            int i7 = i6 + 1;
            this.f1921a[i6] = aVar.f1919e;
            i = i7 + 1;
            this.f1921a[i7] = aVar.f1920f;
        }
        this.f1922b = tVar.f1905q;
        this.f1923c = tVar.f1906r;
        this.f1924d = tVar.f1909u;
        this.f1925e = tVar.f1911w;
        this.f1926f = tVar.f1912x;
        this.f1927g = tVar.f1913y;
        this.f1928h = tVar.f1914z;
        this.f1929i = tVar.f1895A;
        this.f1930j = tVar.f1896B;
        this.f1931k = tVar.f1897C;
        this.f1932l = tVar.f1898D;
    }

    /* renamed from: a */
    public C0404t mo1697a(C0205aj ajVar) {
        int i = 0;
        C0404t tVar = new C0404t(ajVar);
        int i2 = 0;
        while (i < this.f1921a.length) {
            C0404t.C0405a aVar = new C0404t.C0405a();
            int i3 = i + 1;
            aVar.f1915a = this.f1921a[i];
            if (C0205aj.f1231b) {
                Log.v("FragmentManager", "Instantiate " + tVar + " op #" + i2 + " base fragment #" + this.f1921a[i3]);
            }
            int i4 = i3 + 1;
            int i5 = this.f1921a[i3];
            if (i5 >= 0) {
                aVar.f1916b = ajVar.f1253l.get(i5);
            } else {
                aVar.f1916b = null;
            }
            int i6 = i4 + 1;
            aVar.f1917c = this.f1921a[i4];
            int i7 = i6 + 1;
            aVar.f1918d = this.f1921a[i6];
            int i8 = i7 + 1;
            aVar.f1919e = this.f1921a[i7];
            aVar.f1920f = this.f1921a[i8];
            tVar.f1901m = aVar.f1917c;
            tVar.f1902n = aVar.f1918d;
            tVar.f1903o = aVar.f1919e;
            tVar.f1904p = aVar.f1920f;
            tVar.mo1682a(aVar);
            i2++;
            i = i8 + 1;
        }
        tVar.f1905q = this.f1922b;
        tVar.f1906r = this.f1923c;
        tVar.f1909u = this.f1924d;
        tVar.f1911w = this.f1925e;
        tVar.f1907s = true;
        tVar.f1912x = this.f1926f;
        tVar.f1913y = this.f1927g;
        tVar.f1914z = this.f1928h;
        tVar.f1895A = this.f1929i;
        tVar.f1896B = this.f1930j;
        tVar.f1897C = this.f1931k;
        tVar.f1898D = this.f1932l;
        tVar.mo1690e(1);
        return tVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeIntArray(this.f1921a);
        parcel.writeInt(this.f1922b);
        parcel.writeInt(this.f1923c);
        parcel.writeString(this.f1924d);
        parcel.writeInt(this.f1925e);
        parcel.writeInt(this.f1926f);
        TextUtils.writeToParcel(this.f1927g, parcel, 0);
        parcel.writeInt(this.f1928h);
        TextUtils.writeToParcel(this.f1929i, parcel, 0);
        parcel.writeStringList(this.f1930j);
        parcel.writeStringList(this.f1931k);
        if (this.f1932l) {
            i2 = 1;
        }
        parcel.writeInt(i2);
    }
}
