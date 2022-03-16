package android.support.p036v7.widget.p046a;

import android.graphics.Canvas;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p042d.C1484b;
import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.a.c */
class C1659c {

    /* renamed from: android.support.v7.widget.a.c$a */
    static class C1660a implements C1658b {
        C1660a() {
        }

        /* renamed from: a */
        private void m9938a(Canvas canvas, C1732az azVar, View view, float f, float f2) {
            canvas.save();
            canvas.translate(f, f2);
            azVar.drawChild(canvas, view, 0);
            canvas.restore();
        }

        /* renamed from: a */
        public void mo6239a(Canvas canvas, C1732az azVar, View view, float f, float f2, int i, boolean z) {
            if (i != 2) {
                m9938a(canvas, azVar, view, f, f2);
            }
        }

        /* renamed from: a */
        public void mo6240a(View view) {
            view.setVisibility(0);
        }

        /* renamed from: b */
        public void mo6241b(Canvas canvas, C1732az azVar, View view, float f, float f2, int i, boolean z) {
            if (i == 2) {
                m9938a(canvas, azVar, view, f, f2);
            }
        }

        /* renamed from: b */
        public void mo6242b(View view) {
            view.setVisibility(4);
        }
    }

    /* renamed from: android.support.v7.widget.a.c$b */
    static class C1661b implements C1658b {
        C1661b() {
        }

        /* renamed from: a */
        public void mo6239a(Canvas canvas, C1732az azVar, View view, float f, float f2, int i, boolean z) {
            C1040ar.m5881a(view, f);
            C1040ar.m5914b(view, f2);
        }

        /* renamed from: a */
        public void mo6240a(View view) {
            C1040ar.m5881a(view, 0.0f);
            C1040ar.m5914b(view, 0.0f);
        }

        /* renamed from: b */
        public void mo6241b(Canvas canvas, C1732az azVar, View view, float f, float f2, int i, boolean z) {
        }

        /* renamed from: b */
        public void mo6242b(View view) {
        }
    }

    /* renamed from: android.support.v7.widget.a.c$c */
    static class C1662c extends C1661b {
        C1662c() {
        }

        /* renamed from: a */
        private float m9947a(C1732az azVar, View view) {
            int childCount = azVar.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = azVar.getChildAt(i);
                if (childAt != view) {
                    float K = C1040ar.m5861K(childAt);
                    if (K > f) {
                        f = K;
                    }
                }
            }
            return f;
        }

        /* renamed from: a */
        public void mo6239a(Canvas canvas, C1732az azVar, View view, float f, float f2, int i, boolean z) {
            if (z && view.getTag(C1484b.C1487c.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(C1040ar.m5861K(view));
                C1040ar.m5952m(view, 1.0f + m9947a(azVar, view));
                view.setTag(C1484b.C1487c.item_touch_helper_previous_elevation, valueOf);
            }
            super.mo6239a(canvas, azVar, view, f, f2, i, z);
        }

        /* renamed from: a */
        public void mo6240a(View view) {
            Object tag = view.getTag(C1484b.C1487c.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                C1040ar.m5952m(view, ((Float) tag).floatValue());
            }
            view.setTag(C1484b.C1487c.item_touch_helper_previous_elevation, (Object) null);
            super.mo6240a(view);
        }
    }

    C1659c() {
    }
}
