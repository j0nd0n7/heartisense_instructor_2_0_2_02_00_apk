package android.support.p010v4.p020g.p021a;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.g.a.a */
public abstract class C0520a {

    /* renamed from: a */
    public static final String f2095a = "android.hardware.display.category.PRESENTATION";

    /* renamed from: b */
    private static final WeakHashMap<Context, C0520a> f2096b = new WeakHashMap<>();

    /* renamed from: android.support.v4.g.a.a$a */
    private static class C0521a extends C0520a {

        /* renamed from: b */
        private final Object f2097b;

        public C0521a(Context context) {
            this.f2097b = C0523b.m2726a(context);
        }

        /* renamed from: a */
        public Display mo1901a(int i) {
            return C0523b.m2725a(this.f2097b, i);
        }

        /* renamed from: a */
        public Display[] mo1902a() {
            return C0523b.m2727a(this.f2097b);
        }

        /* renamed from: a */
        public Display[] mo1903a(String str) {
            return C0523b.m2728a(this.f2097b, str);
        }
    }

    /* renamed from: android.support.v4.g.a.a$b */
    private static class C0522b extends C0520a {

        /* renamed from: b */
        private final WindowManager f2098b;

        public C0522b(Context context) {
            this.f2098b = (WindowManager) context.getSystemService("window");
        }

        /* renamed from: a */
        public Display mo1901a(int i) {
            Display defaultDisplay = this.f2098b.getDefaultDisplay();
            if (defaultDisplay.getDisplayId() == i) {
                return defaultDisplay;
            }
            return null;
        }

        /* renamed from: a */
        public Display[] mo1902a() {
            return new Display[]{this.f2098b.getDefaultDisplay()};
        }

        /* renamed from: a */
        public Display[] mo1903a(String str) {
            return str == null ? mo1902a() : new Display[0];
        }
    }

    C0520a() {
    }

    /* renamed from: a */
    public static C0520a m2715a(Context context) {
        C0520a aVar;
        synchronized (f2096b) {
            aVar = f2096b.get(context);
            if (aVar == null) {
                aVar = Build.VERSION.SDK_INT >= 17 ? new C0521a(context) : new C0522b(context);
                f2096b.put(context, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public abstract Display mo1901a(int i);

    /* renamed from: a */
    public abstract Display[] mo1902a();

    /* renamed from: a */
    public abstract Display[] mo1903a(String str);
}
