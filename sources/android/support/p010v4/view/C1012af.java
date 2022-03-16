package android.support.p010v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.af */
public abstract class C1012af {

    /* renamed from: a */
    public static final int f3379a = -1;

    /* renamed from: b */
    public static final int f3380b = -2;

    /* renamed from: c */
    private final DataSetObservable f3381c = new DataSetObservable();

    /* renamed from: d */
    private DataSetObserver f3382d;

    /* renamed from: a */
    public int mo3584a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public Parcelable mo1188a() {
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public Object mo3585a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: a */
    public Object mo1190a(ViewGroup viewGroup, int i) {
        return mo3585a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo3586a(DataSetObserver dataSetObserver) {
        this.f3381c.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo1191a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo3587a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo3588a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: a */
    public void mo1192a(ViewGroup viewGroup) {
        mo3587a((View) viewGroup);
    }

    /* renamed from: a */
    public void mo1193a(ViewGroup viewGroup, int i, Object obj) {
        mo3588a((View) viewGroup, i, obj);
    }

    /* renamed from: a */
    public abstract boolean mo1194a(View view, Object obj);

    /* renamed from: b */
    public abstract int mo3589b();

    /* renamed from: b */
    public void mo3590b(DataSetObserver dataSetObserver) {
        this.f3381c.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    /* renamed from: b */
    public void mo3591b(View view) {
    }

    @Deprecated
    /* renamed from: b */
    public void mo3592b(View view, int i, Object obj) {
    }

    /* renamed from: b */
    public void mo1196b(ViewGroup viewGroup) {
        mo3591b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo1197b(ViewGroup viewGroup, int i, Object obj) {
        mo3592b((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public CharSequence mo3593c(int i) {
        return null;
    }

    /* renamed from: c */
    public void mo3594c() {
        synchronized (this) {
            if (this.f3382d != null) {
                this.f3382d.onChanged();
            }
        }
        this.f3381c.notifyChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3595c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f3382d = dataSetObserver;
        }
    }

    /* renamed from: d */
    public float mo3596d(int i) {
        return 1.0f;
    }
}
