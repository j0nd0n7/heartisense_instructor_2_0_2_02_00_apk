package android.support.p010v4.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.ab */
public class C1008ab {

    /* renamed from: a */
    private final View f3373a;

    /* renamed from: b */
    private ViewParent f3374b;

    /* renamed from: c */
    private boolean f3375c;

    /* renamed from: d */
    private int[] f3376d;

    public C1008ab(View view) {
        this.f3373a = view;
    }

    /* renamed from: a */
    public void mo3562a(View view) {
        C1040ar.m5873W(this.f3373a);
    }

    /* renamed from: a */
    public void mo3563a(boolean z) {
        if (this.f3375c) {
            C1040ar.m5873W(this.f3373a);
        }
        this.f3375c = z;
    }

    /* renamed from: a */
    public boolean mo3564a() {
        return this.f3375c;
    }

    /* renamed from: a */
    public boolean mo3565a(float f, float f2) {
        if (!mo3564a() || this.f3374b == null) {
            return false;
        }
        return C1103bk.m6570a(this.f3374b, this.f3373a, f, f2);
    }

    /* renamed from: a */
    public boolean mo3566a(float f, float f2, boolean z) {
        if (!mo3564a() || this.f3374b == null) {
            return false;
        }
        return C1103bk.m6571a(this.f3374b, this.f3373a, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo3567a(int i) {
        if (mo3570b()) {
            return true;
        }
        if (mo3564a()) {
            View view = this.f3373a;
            for (ViewParent parent = this.f3373a.getParent(); parent != null; parent = parent.getParent()) {
                if (C1103bk.m6572a(parent, view, this.f3373a, i)) {
                    this.f3374b = parent;
                    C1103bk.m6574b(parent, view, this.f3373a, i);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3568a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        if (!mo3564a() || this.f3374b == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            if (iArr != null) {
                this.f3373a.getLocationInWindow(iArr);
                int i7 = iArr[0];
                i5 = iArr[1];
                i6 = i7;
            } else {
                i5 = 0;
                i6 = 0;
            }
            C1103bk.m6568a(this.f3374b, this.f3373a, i, i2, i3, i4);
            if (iArr != null) {
                this.f3373a.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i6;
                iArr[1] = iArr[1] - i5;
            }
            return true;
        } else if (iArr == null) {
            return false;
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo3569a(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int i4;
        if (!mo3564a() || this.f3374b == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f3373a.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i3 = iArr2[1];
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f3376d == null) {
                    this.f3376d = new int[2];
                }
                iArr = this.f3376d;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C1103bk.m6569a(this.f3374b, this.f3373a, i, i2, iArr);
            if (iArr2 != null) {
                this.f3373a.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i3;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo3570b() {
        return this.f3374b != null;
    }

    /* renamed from: c */
    public void mo3571c() {
        if (this.f3374b != null) {
            C1103bk.m6567a(this.f3374b, this.f3373a);
            this.f3374b = null;
        }
    }

    /* renamed from: d */
    public void mo3572d() {
        C1040ar.m5873W(this.f3373a);
    }
}
