package android.support.p010v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.t */
public class C1343t extends C1211a {

    /* renamed from: l */
    private final ListView f4122l;

    public C1343t(ListView listView) {
        super(listView);
        this.f4122l = listView;
    }

    /* renamed from: a */
    public void mo4086a(int i, int i2) {
        C1344u.m7880a(this.f4122l, i2);
    }

    /* renamed from: e */
    public boolean mo4099e(int i) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4100f(int r7) {
        /*
            r6 = this;
            r0 = 0
            android.widget.ListView r1 = r6.f4122l
            int r2 = r1.getCount()
            if (r2 != 0) goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            int r3 = r1.getChildCount()
            int r4 = r1.getFirstVisiblePosition()
            int r5 = r4 + r3
            if (r7 <= 0) goto L_0x002a
            if (r5 < r2) goto L_0x0028
            int r2 = r3 + -1
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r2.getBottom()
            int r1 = r1.getHeight()
            if (r2 <= r1) goto L_0x0009
        L_0x0028:
            r0 = 1
            goto L_0x0009
        L_0x002a:
            if (r7 >= 0) goto L_0x0009
            if (r4 > 0) goto L_0x0028
            android.view.View r1 = r1.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0028
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.widget.C1343t.mo4100f(int):boolean");
    }
}
