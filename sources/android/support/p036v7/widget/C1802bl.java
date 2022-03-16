package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p036v7.view.C1525d;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* renamed from: android.support.v7.widget.bl */
public interface C1802bl extends SpinnerAdapter {

    /* renamed from: android.support.v7.widget.bl$a */
    public static final class C1803a {

        /* renamed from: a */
        private final Context f6093a;

        /* renamed from: b */
        private final LayoutInflater f6094b;

        /* renamed from: c */
        private LayoutInflater f6095c;

        public C1803a(@C0047z Context context) {
            this.f6093a = context;
            this.f6094b = LayoutInflater.from(context);
        }

        @C0003aa
        /* renamed from: a */
        public Resources.Theme mo7280a() {
            if (this.f6095c == null) {
                return null;
            }
            return this.f6095c.getContext().getTheme();
        }

        /* renamed from: a */
        public void mo7281a(@C0003aa Resources.Theme theme) {
            if (theme == null) {
                this.f6095c = null;
            } else if (theme == this.f6093a.getTheme()) {
                this.f6095c = this.f6094b;
            } else {
                this.f6095c = LayoutInflater.from(new C1525d(this.f6093a, theme));
            }
        }

        @C0047z
        /* renamed from: b */
        public LayoutInflater mo7282b() {
            return this.f6095c != null ? this.f6095c : this.f6094b;
        }
    }

    @C0003aa
    /* renamed from: a */
    Resources.Theme mo7278a();

    /* renamed from: a */
    void mo7279a(@C0003aa Resources.Theme theme);
}
