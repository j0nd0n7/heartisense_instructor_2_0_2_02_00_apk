package android.support.p010v4.p014d;

import android.content.SharedPreferences;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.d.v */
public final class C0473v {

    /* renamed from: android.support.v4.d.v$a */
    public static final class C0474a {

        /* renamed from: a */
        private static C0474a f2047a;

        /* renamed from: b */
        private final C0475a f2048b = new C0475a();

        /* renamed from: android.support.v4.d.v$a$a */
        private static class C0475a {
            C0475a() {
            }

            /* renamed from: a */
            public void mo1809a(@C0047z SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError e) {
                    editor.commit();
                }
            }
        }

        private C0474a() {
        }

        /* renamed from: a */
        public static C0474a m2516a() {
            if (f2047a == null) {
                f2047a = new C0474a();
            }
            return f2047a;
        }

        /* renamed from: a */
        public void mo1808a(@C0047z SharedPreferences.Editor editor) {
            this.f2048b.mo1809a(editor);
        }
    }

    private C0473v() {
    }
}
