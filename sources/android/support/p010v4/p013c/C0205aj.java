package android.support.p010v4.p013c;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.annotation.C0030i;
import android.support.p010v4.p013c.C0186ad;
import android.support.p010v4.p013c.C0201ai;
import android.support.p010v4.p028k.C0798c;
import android.support.p010v4.p033o.C0878b;
import android.support.p010v4.p033o.C0884g;
import android.support.p010v4.p033o.C0885h;
import android.support.p010v4.p033o.C0894l;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1182q;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.c.aj */
final class C0205aj extends C0201ai implements C1182q {

    /* renamed from: K */
    static final Interpolator f1220K = new DecelerateInterpolator(2.5f);

    /* renamed from: L */
    static final Interpolator f1221L = new DecelerateInterpolator(1.5f);

    /* renamed from: M */
    static final Interpolator f1222M = new AccelerateInterpolator(2.5f);

    /* renamed from: N */
    static final Interpolator f1223N = new AccelerateInterpolator(1.5f);

    /* renamed from: O */
    static final int f1224O = 220;

    /* renamed from: P */
    public static final int f1225P = 1;

    /* renamed from: Q */
    public static final int f1226Q = 2;

    /* renamed from: R */
    public static final int f1227R = 3;

    /* renamed from: S */
    public static final int f1228S = 4;

    /* renamed from: T */
    public static final int f1229T = 5;

    /* renamed from: U */
    public static final int f1230U = 6;

    /* renamed from: b */
    static boolean f1231b = false;

    /* renamed from: c */
    static final String f1232c = "FragmentManager";

    /* renamed from: d */
    static final boolean f1233d;

    /* renamed from: e */
    static final String f1234e = "android:target_req_state";

    /* renamed from: f */
    static final String f1235f = "android:target_state";

    /* renamed from: g */
    static final String f1236g = "android:view_state";

    /* renamed from: h */
    static final String f1237h = "android:user_visible_hint";

    /* renamed from: x */
    static Field f1238x = null;

    /* renamed from: A */
    boolean f1239A;

    /* renamed from: B */
    String f1240B;

    /* renamed from: C */
    boolean f1241C;

    /* renamed from: D */
    ArrayList<C0404t> f1242D;

    /* renamed from: E */
    ArrayList<Boolean> f1243E;

    /* renamed from: F */
    ArrayList<C0186ad> f1244F;

    /* renamed from: G */
    Bundle f1245G = null;

    /* renamed from: H */
    SparseArray<Parcelable> f1246H = null;

    /* renamed from: I */
    ArrayList<C0213e> f1247I;

    /* renamed from: J */
    Runnable f1248J = new Runnable() {
        public void run() {
            C0205aj.this.mo1149j();
        }
    };

    /* renamed from: V */
    private CopyOnWriteArrayList<C0894l<C0201ai.C0203b, Boolean>> f1249V;

    /* renamed from: i */
    ArrayList<C0211c> f1250i;

    /* renamed from: j */
    Runnable[] f1251j;

    /* renamed from: k */
    boolean f1252k;

    /* renamed from: l */
    ArrayList<C0186ad> f1253l;

    /* renamed from: m */
    ArrayList<C0186ad> f1254m;

    /* renamed from: n */
    ArrayList<Integer> f1255n;

    /* renamed from: o */
    ArrayList<C0404t> f1256o;

    /* renamed from: p */
    ArrayList<C0186ad> f1257p;

    /* renamed from: q */
    ArrayList<C0404t> f1258q;

    /* renamed from: r */
    ArrayList<Integer> f1259r;

    /* renamed from: s */
    ArrayList<C0201ai.C0204c> f1260s;

    /* renamed from: t */
    int f1261t = 0;

    /* renamed from: u */
    C0200ah f1262u;

    /* renamed from: v */
    C0198af f1263v;

    /* renamed from: w */
    C0186ad f1264w;

    /* renamed from: y */
    boolean f1265y;

    /* renamed from: z */
    boolean f1266z;

    /* renamed from: android.support.v4.c.aj$a */
    static class C0208a implements Animation.AnimationListener {

        /* renamed from: a */
        private Animation.AnimationListener f1270a;

        /* renamed from: b */
        private boolean f1271b;

        /* renamed from: c */
        View f1272c;

        public C0208a(View view, Animation animation) {
            if (view != null && animation != null) {
                this.f1272c = view;
            }
        }

        public C0208a(View view, Animation animation, Animation.AnimationListener animationListener) {
            if (view != null && animation != null) {
                this.f1270a = animationListener;
                this.f1272c = view;
                this.f1271b = true;
            }
        }

        @C0030i
        public void onAnimationEnd(Animation animation) {
            if (this.f1272c != null && this.f1271b) {
                if (C1040ar.m5909ad(this.f1272c) || C0798c.m4072a()) {
                    this.f1272c.post(new Runnable() {
                        public void run() {
                            C1040ar.m5884a(C0208a.this.f1272c, 0, (Paint) null);
                        }
                    });
                } else {
                    C1040ar.m5884a(this.f1272c, 0, (Paint) null);
                }
            }
            if (this.f1270a != null) {
                this.f1270a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f1270a != null) {
                this.f1270a.onAnimationRepeat(animation);
            }
        }

        @C0030i
        public void onAnimationStart(Animation animation) {
            if (this.f1270a != null) {
                this.f1270a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.c.aj$b */
    static class C0210b {

        /* renamed from: a */
        public static final int[] f1274a = {16842755, 16842960, 16842961};

        /* renamed from: b */
        public static final int f1275b = 1;

        /* renamed from: c */
        public static final int f1276c = 0;

        /* renamed from: d */
        public static final int f1277d = 2;

        C0210b() {
        }
    }

    /* renamed from: android.support.v4.c.aj$c */
    interface C0211c {
        /* renamed from: a */
        boolean mo1176a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.c.aj$d */
    private class C0212d implements C0211c {

        /* renamed from: a */
        final String f1278a;

        /* renamed from: b */
        final int f1279b;

        /* renamed from: c */
        final int f1280c;

        C0212d(String str, int i, int i2) {
            this.f1278a = str;
            this.f1279b = i;
            this.f1280c = i2;
        }

        /* renamed from: a */
        public boolean mo1176a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2) {
            return C0205aj.this.mo1119a(arrayList, arrayList2, this.f1278a, this.f1279b, this.f1280c);
        }
    }

    /* renamed from: android.support.v4.c.aj$e */
    static class C0213e implements C0186ad.C0191c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final boolean f1282a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0404t f1283b;

        /* renamed from: c */
        private int f1284c;

        C0213e(C0404t tVar, boolean z) {
            this.f1282a = z;
            this.f1283b = tVar;
        }

        /* renamed from: a */
        public void mo928a() {
            this.f1284c--;
            if (this.f1284c == 0) {
                this.f1283b.f1899c.m1234B();
            }
        }

        /* renamed from: b */
        public void mo929b() {
            this.f1284c++;
        }

        /* renamed from: c */
        public boolean mo1177c() {
            return this.f1284c == 0;
        }

        /* renamed from: d */
        public void mo1178d() {
            boolean z = false;
            boolean z2 = this.f1284c > 0;
            C0205aj ajVar = this.f1283b.f1899c;
            int size = ajVar.f1254m.size();
            for (int i = 0; i < size; i++) {
                C0186ad adVar = ajVar.f1254m.get(i);
                adVar.mo830a((C0186ad.C0191c) null);
                if (z2 && adVar.mo861ar()) {
                    adVar.mo813Z();
                }
            }
            C0205aj ajVar2 = this.f1283b.f1899c;
            C0404t tVar = this.f1283b;
            boolean z3 = this.f1282a;
            if (!z2) {
                z = true;
            }
            ajVar2.m1243a(tVar, z3, z, true);
        }

        /* renamed from: e */
        public void mo1179e() {
            this.f1283b.f1899c.m1243a(this.f1283b, this.f1282a, false, false);
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 11) {
            z = true;
        }
        f1233d = z;
    }

    C0205aj() {
    }

    /* renamed from: A */
    private void m1233A() {
        if (this.f1266z) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f1240B != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f1240B);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m1234B() {
        boolean z = true;
        synchronized (this) {
            boolean z2 = this.f1247I != null && !this.f1247I.isEmpty();
            if (this.f1250i == null || this.f1250i.size() != 1) {
                z = false;
            }
            if (z2 || z) {
                this.f1262u.mo1050j().removeCallbacks(this.f1248J);
                this.f1262u.mo1050j().post(this.f1248J);
            }
        }
    }

    /* renamed from: C */
    private void m1235C() {
        this.f1252k = false;
        this.f1243E.clear();
        this.f1242D.clear();
    }

    /* renamed from: D */
    private void m1236D() {
        if (this.f1247I != null) {
            while (!this.f1247I.isEmpty()) {
                this.f1247I.remove(0).mo1178d();
            }
        }
    }

    /* renamed from: E */
    private void m1237E() {
        int size = this.f1253l == null ? 0 : this.f1253l.size();
        for (int i = 0; i < size; i++) {
            C0186ad adVar = this.f1253l.get(i);
            if (!(adVar == null || adVar.mo859ap() == null)) {
                int aq = adVar.mo860aq();
                View ap = adVar.mo859ap();
                adVar.mo874c((View) null);
                Animation animation = ap.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                mo1109a(adVar, aq, 0, 0, false);
            }
        }
    }

    /* renamed from: a */
    private int m1238a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0878b<C0186ad> bVar) {
        int i3;
        int i4 = i2 - 1;
        int i5 = i2;
        while (i4 >= i) {
            C0404t tVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (tVar.mo1693m() && !tVar.mo1686a(arrayList, i4 + 1, i2)) {
                if (this.f1247I == null) {
                    this.f1247I = new ArrayList<>();
                }
                C0213e eVar = new C0213e(tVar, booleanValue);
                this.f1247I.add(eVar);
                tVar.mo1681a((C0186ad.C0191c) eVar);
                if (booleanValue) {
                    tVar.mo1692l();
                } else {
                    tVar.mo1689c(false);
                }
                int i6 = i5 - 1;
                if (i4 != i6) {
                    arrayList.remove(i4);
                    arrayList.add(i6, tVar);
                }
                m1252b(bVar);
                i3 = i6;
            } else {
                i3 = i5;
            }
            i4--;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: a */
    static Animation m1239a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1221L);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    /* renamed from: a */
    static Animation m1240a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1220K);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f1221L);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1243a(C0404t tVar, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(tVar);
        arrayList2.add(Boolean.valueOf(z));
        m1255b(arrayList, arrayList2, 0, 1);
        if (z2) {
            C0227ar.m1436a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo1106a(this.f1261t, true);
        }
        if (this.f1253l != null) {
            int size = this.f1253l.size();
            for (int i = 0; i < size; i++) {
                C0186ad adVar = this.f1253l.get(i);
                if (adVar != null && adVar.f1146Z != null && adVar.f1154ah && tVar.mo1691f(adVar.f1136P)) {
                    if (Build.VERSION.SDK_INT >= 11 && adVar.f1156aj > 0.0f) {
                        adVar.f1146Z.setAlpha(adVar.f1156aj);
                    }
                    if (z3) {
                        adVar.f1156aj = 0.0f;
                    } else {
                        adVar.f1156aj = -1.0f;
                        adVar.f1154ah = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1244a(C0878b<C0186ad> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            C0186ad b = bVar.mo2806b(i);
            if (!b.f1124D) {
                View K = b.mo798K();
                if (Build.VERSION.SDK_INT < 11) {
                    b.mo798K().setVisibility(4);
                } else {
                    b.f1156aj = K.getAlpha();
                    K.setAlpha(0.0f);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1245a(RuntimeException runtimeException) {
        Log.e(f1232c, runtimeException.getMessage());
        Log.e(f1232c, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0885h(f1232c));
        if (this.f1262u != null) {
            try {
                this.f1262u.mo993a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(f1232c, "Failed dumping state", e);
            }
        } else {
            try {
                mo1070a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(f1232c, "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    private void m1246a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        int i = 0;
        int size = this.f1247I == null ? 0 : this.f1247I.size();
        while (i < size) {
            C0213e eVar = this.f1247I.get(i);
            if (arrayList != null && !eVar.f1282a && (indexOf2 = arrayList.indexOf(eVar.f1283b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                eVar.mo1179e();
            } else if (eVar.mo1177c() || (arrayList != null && eVar.f1283b.mo1686a(arrayList, 0, arrayList.size()))) {
                this.f1247I.remove(i);
                i--;
                size--;
                if (arrayList == null || eVar.f1282a || (indexOf = arrayList.indexOf(eVar.f1283b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    eVar.mo1178d();
                } else {
                    eVar.mo1179e();
                }
            }
            i++;
            size = size;
        }
    }

    /* renamed from: a */
    private void m1247a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        boolean z = arrayList.get(i).f1898D;
        if (this.f1244F == null) {
            this.f1244F = new ArrayList<>();
        } else {
            this.f1244F.clear();
        }
        if (this.f1254m != null) {
            this.f1244F.addAll(this.f1254m);
        }
        int i4 = i;
        boolean z2 = false;
        while (i4 < i2) {
            C0404t tVar = arrayList.get(i4);
            if (!arrayList2.get(i4).booleanValue()) {
                tVar.mo1685a(this.f1244F);
            } else {
                tVar.mo1688b(this.f1244F);
            }
            i4++;
            z2 = z2 || tVar.f1907s;
        }
        this.f1244F.clear();
        if (!z) {
            C0227ar.m1436a(this, arrayList, arrayList2, i, i2, false);
        }
        m1255b(arrayList, arrayList2, i, i2);
        if (z) {
            C0878b bVar = new C0878b();
            m1252b((C0878b<C0186ad>) bVar);
            i3 = m1238a(arrayList, arrayList2, i, i2, (C0878b<C0186ad>) bVar);
            m1244a((C0878b<C0186ad>) bVar);
        } else {
            i3 = i2;
        }
        if (i3 != i && z) {
            C0227ar.m1436a(this, arrayList, arrayList2, i, i3, true);
            mo1106a(this.f1261t, true);
        }
        while (i < i2) {
            C0404t tVar2 = arrayList.get(i);
            if (arrayList2.get(i).booleanValue() && tVar2.f1911w >= 0) {
                mo1135d(tVar2.f1911w);
                tVar2.f1911w = -1;
            }
            i++;
        }
        if (z2) {
            mo1152l();
        }
    }

    /* renamed from: a */
    static boolean m1248a(View view, Animation animation) {
        return Build.VERSION.SDK_INT >= 19 && C1040ar.m5941i(view) == 0 && C1040ar.m5868R(view) && m1249a(animation);
    }

    /* renamed from: a */
    static boolean m1249a(Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return false;
        }
        List<Animation> animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m1250a(String str, int i, int i2) {
        mo1149j();
        m1257d(true);
        boolean a = mo1119a(this.f1242D, this.f1243E, str, i, i2);
        if (a) {
            this.f1252k = true;
            try {
                m1254b(this.f1242D, this.f1243E);
            } finally {
                m1235C();
            }
        }
        mo1150k();
        return a;
    }

    /* renamed from: b */
    public static int m1251b(int i, boolean z) {
        switch (i) {
            case C0226aq.f1332I:
                return z ? 1 : 2;
            case C0226aq.f1334K:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    private void m1252b(C0878b<C0186ad> bVar) {
        if (this.f1261t >= 1) {
            int min = Math.min(this.f1261t, 4);
            int size = this.f1254m == null ? 0 : this.f1254m.size();
            for (int i = 0; i < size; i++) {
                C0186ad adVar = this.f1254m.get(i);
                if (adVar.f1157u < min) {
                    mo1109a(adVar, min, adVar.mo854ak(), adVar.mo855al(), false);
                    if (adVar.f1146Z != null && !adVar.f1138R && adVar.f1154ah) {
                        bVar.add(adVar);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m1253b(View view, Animation animation) {
        Animation.AnimationListener animationListener;
        if (view != null && animation != null && m1248a(view, animation)) {
            try {
                if (f1238x == null) {
                    f1238x = Animation.class.getDeclaredField("mListener");
                    f1238x.setAccessible(true);
                }
                animationListener = (Animation.AnimationListener) f1238x.get(animation);
            } catch (NoSuchFieldException e) {
                Log.e(f1232c, "No field with the name mListener is found in Animation class", e);
                animationListener = null;
            } catch (IllegalAccessException e2) {
                Log.e(f1232c, "Cannot access Animation's mListener field", e2);
                animationListener = null;
            }
            C1040ar.m5884a(view, 2, (Paint) null);
            animation.setAnimationListener(new C0208a(view, animation, animationListener));
        }
    }

    /* renamed from: b */
    private void m1254b(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2) {
        int i;
        int i2 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1246a(arrayList, arrayList2);
            int size = arrayList.size();
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).f1898D) {
                    if (i3 != i2) {
                        m1247a(arrayList, arrayList2, i3, i2);
                    }
                    int i4 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i4 < size && arrayList2.get(i4).booleanValue() && !arrayList.get(i4).f1898D) {
                            i4++;
                        }
                    }
                    int i5 = i4;
                    m1247a(arrayList, arrayList2, i2, i5);
                    i3 = i5;
                    i = i5 - 1;
                } else {
                    i = i2;
                }
                i2 = i + 1;
            }
            if (i3 != size) {
                m1247a(arrayList, arrayList2, i3, size);
            }
        }
    }

    /* renamed from: b */
    private static void m1255b(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0404t tVar = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                tVar.mo1690e(-1);
                tVar.mo1689c(i == i2 + -1);
            } else {
                tVar.mo1690e(1);
                tVar.mo1692l();
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r3 <= 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1256c(java.util.ArrayList<android.support.p010v4.p013c.C0404t> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            r1 = 0
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.c.aj$c> r0 = r4.f1250i     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000e
            java.util.ArrayList<android.support.v4.c.aj$c> r0 = r4.f1250i     // Catch:{ all -> 0x003e }
            int r0 = r0.size()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0011
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r0 = r1
        L_0x0010:
            return r0
        L_0x0011:
            java.util.ArrayList<android.support.v4.c.aj$c> r0 = r4.f1250i     // Catch:{ all -> 0x003e }
            int r3 = r0.size()     // Catch:{ all -> 0x003e }
            r2 = r1
        L_0x0018:
            if (r2 >= r3) goto L_0x0029
            java.util.ArrayList<android.support.v4.c.aj$c> r0 = r4.f1250i     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x003e }
            android.support.v4.c.aj$c r0 = (android.support.p010v4.p013c.C0205aj.C0211c) r0     // Catch:{ all -> 0x003e }
            r0.mo1176a(r5, r6)     // Catch:{ all -> 0x003e }
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0018
        L_0x0029:
            java.util.ArrayList<android.support.v4.c.aj$c> r0 = r4.f1250i     // Catch:{ all -> 0x003e }
            r0.clear()     // Catch:{ all -> 0x003e }
            android.support.v4.c.ah r0 = r4.f1262u     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r0.mo1050j()     // Catch:{ all -> 0x003e }
            java.lang.Runnable r2 = r4.f1248J     // Catch:{ all -> 0x003e }
            r0.removeCallbacks(r2)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            if (r3 <= 0) goto L_0x0041
            r0 = 1
            goto L_0x0010
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            r0 = r1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p013c.C0205aj.m1256c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: d */
    private void m1257d(boolean z) {
        if (this.f1252k) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.f1262u.mo1050j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m1233A();
            }
            if (this.f1242D == null) {
                this.f1242D = new ArrayList<>();
                this.f1243E = new ArrayList<>();
            }
            this.f1252k = true;
            try {
                m1246a((ArrayList<C0404t>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1252k = false;
            }
        }
    }

    /* renamed from: e */
    public static int m1258e(int i) {
        switch (i) {
            case C0226aq.f1332I:
                return 8194;
            case C0226aq.f1334K:
                return C0226aq.f1334K;
            case 8194:
                return C0226aq.f1332I;
            default:
                return 0;
        }
    }

    /* renamed from: o */
    private C0186ad m1259o(C0186ad adVar) {
        ViewGroup viewGroup = adVar.f1145Y;
        View view = adVar.f1146Z;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f1254m.indexOf(adVar) - 1; indexOf >= 0; indexOf--) {
            C0186ad adVar2 = this.f1254m.get(indexOf);
            if (adVar2.f1145Y == viewGroup && adVar2.f1146Z != null) {
                return adVar2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int mo1102a(C0404t tVar) {
        int i;
        synchronized (this) {
            if (this.f1259r == null || this.f1259r.size() <= 0) {
                if (this.f1258q == null) {
                    this.f1258q = new ArrayList<>();
                }
                i = this.f1258q.size();
                if (f1231b) {
                    Log.v(f1232c, "Setting back stack index " + i + " to " + tVar);
                }
                this.f1258q.add(tVar);
            } else {
                i = this.f1259r.remove(this.f1259r.size() - 1).intValue();
                if (f1231b) {
                    Log.v(f1232c, "Adding back stack index " + i + " with " + tVar);
                }
                this.f1258q.set(i, tVar);
            }
        }
        return i;
    }

    /* renamed from: a */
    public C0186ad.C0192d mo1059a(C0186ad adVar) {
        Bundle n;
        if (adVar.f1160x < 0) {
            m1245a((RuntimeException) new IllegalStateException("Fragment " + adVar + " is not currently in the FragmentManager"));
        }
        if (adVar.f1157u <= 0 || (n = mo1156n(adVar)) == null) {
            return null;
        }
        return new C0186ad.C0192d(n);
    }

    /* renamed from: a */
    public C0186ad mo1060a(int i) {
        if (this.f1254m != null) {
            for (int size = this.f1254m.size() - 1; size >= 0; size--) {
                C0186ad adVar = this.f1254m.get(size);
                if (adVar != null && adVar.f1135O == i) {
                    return adVar;
                }
            }
        }
        if (this.f1253l != null) {
            for (int size2 = this.f1253l.size() - 1; size2 >= 0; size2--) {
                C0186ad adVar2 = this.f1253l.get(size2);
                if (adVar2 != null && adVar2.f1135O == i) {
                    return adVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0186ad mo1061a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f1253l.size()) {
            m1245a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        C0186ad adVar = this.f1253l.get(i);
        if (adVar != null) {
            return adVar;
        }
        m1245a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return adVar;
    }

    /* renamed from: a */
    public C0186ad mo1062a(String str) {
        if (!(this.f1254m == null || str == null)) {
            for (int size = this.f1254m.size() - 1; size >= 0; size--) {
                C0186ad adVar = this.f1254m.get(size);
                if (adVar != null && str.equals(adVar.f1137Q)) {
                    return adVar;
                }
            }
        }
        if (!(this.f1253l == null || str == null)) {
            for (int size2 = this.f1253l.size() - 1; size2 >= 0; size2--) {
                C0186ad adVar2 = this.f1253l.get(size2);
                if (adVar2 != null && str.equals(adVar2.f1137Q)) {
                    return adVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0226aq mo1063a() {
        return new C0404t(this);
    }

    /* renamed from: a */
    public View mo1103a(View view, String str, Context context, AttributeSet attributeSet) {
        C0186ad adVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0210b.f1274a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0186ad.m910b(this.f1262u.mo1049i(), string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        C0186ad a = resourceId != -1 ? mo1060a(resourceId) : null;
        if (a == null && string2 != null) {
            a = mo1062a(string2);
        }
        if (a == null && id != -1) {
            a = mo1060a(id);
        }
        if (f1231b) {
            Log.v(f1232c, "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a);
        }
        if (a == null) {
            C0186ad a2 = C0186ad.m905a(context, string);
            a2.f1126F = true;
            a2.f1135O = resourceId != 0 ? resourceId : id;
            a2.f1136P = id;
            a2.f1137Q = string2;
            a2.f1127G = true;
            a2.f1130J = this;
            a2.f1131K = this.f1262u;
            a2.mo823a(this.f1262u.mo1049i(), attributeSet, a2.f1158v);
            mo1113a(a2, true);
            adVar = a2;
        } else if (a.f1127G) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            a.f1127G = true;
            a.f1131K = this.f1262u;
            if (!a.f1141U) {
                a.mo823a(this.f1262u.mo1049i(), attributeSet, a.f1158v);
            }
            adVar = a;
        }
        if (this.f1261t >= 1 || !adVar.f1126F) {
            mo1130c(adVar);
        } else {
            mo1109a(adVar, 1, 0, 0, false);
        }
        if (adVar.f1146Z == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            adVar.f1146Z.setId(resourceId);
        }
        if (adVar.f1146Z.getTag() == null) {
            adVar.f1146Z.setTag(string2);
        }
        return adVar.f1146Z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Animation mo1104a(C0186ad adVar, int i, boolean z, int i2) {
        Animation loadAnimation;
        Animation a = adVar.mo815a(i, z, adVar.mo854ak());
        if (a != null) {
            return a;
        }
        if (adVar.mo854ak() != 0 && (loadAnimation = AnimationUtils.loadAnimation(this.f1262u.mo1049i(), adVar.mo854ak())) != null) {
            return loadAnimation;
        }
        if (i == 0) {
            return null;
        }
        int b = m1251b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m1240a(this.f1262u.mo1049i(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1240a(this.f1262u.mo1049i(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1240a(this.f1262u.mo1049i(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1240a(this.f1262u.mo1049i(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1239a(this.f1262u.mo1049i(), 0.0f, 1.0f);
            case 6:
                return m1239a(this.f1262u.mo1049i(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f1262u.mo1000e()) {
                    i2 = this.f1262u.mo1001f();
                }
                return i2 == 0 ? null : null;
        }
    }

    /* renamed from: a */
    public void mo1064a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        mo1115a((C0211c) new C0212d((String) null, i, i2), false);
    }

    /* renamed from: a */
    public void mo1105a(int i, C0404t tVar) {
        synchronized (this) {
            if (this.f1258q == null) {
                this.f1258q = new ArrayList<>();
            }
            int size = this.f1258q.size();
            if (i < size) {
                if (f1231b) {
                    Log.v(f1232c, "Setting back stack index " + i + " to " + tVar);
                }
                this.f1258q.set(i, tVar);
            } else {
                while (size < i) {
                    this.f1258q.add((Object) null);
                    if (this.f1259r == null) {
                        this.f1259r = new ArrayList<>();
                    }
                    if (f1231b) {
                        Log.v(f1232c, "Adding available back stack index " + size);
                    }
                    this.f1259r.add(Integer.valueOf(size));
                    size++;
                }
                if (f1231b) {
                    Log.v(f1232c, "Adding back stack index " + i + " with " + tVar);
                }
                this.f1258q.add(tVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1106a(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (this.f1262u == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1261t) {
            this.f1261t = i;
            if (this.f1253l != null) {
                if (this.f1254m != null) {
                    int size = this.f1254m.size();
                    int i2 = 0;
                    z2 = false;
                    while (i2 < size) {
                        C0186ad adVar = this.f1254m.get(i2);
                        mo1138e(adVar);
                        i2++;
                        z2 = adVar.f1150ad != null ? adVar.f1150ad.mo1290a() | z2 : z2;
                    }
                } else {
                    z2 = false;
                }
                int size2 = this.f1253l.size();
                int i3 = 0;
                while (i3 < size2) {
                    C0186ad adVar2 = this.f1253l.get(i3);
                    if (adVar2 != null && ((adVar2.f1125E || adVar2.f1139S) && !adVar2.f1154ah)) {
                        mo1138e(adVar2);
                        if (adVar2.f1150ad != null) {
                            z3 = adVar2.f1150ad.mo1290a() | z2;
                            i3++;
                            z2 = z3;
                        }
                    }
                    z3 = z2;
                    i3++;
                    z2 = z3;
                }
                if (!z2) {
                    mo1146i();
                }
                if (this.f1265y && this.f1262u != null && this.f1261t == 5) {
                    this.f1262u.mo999d();
                    this.f1265y = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1107a(Configuration configuration) {
        if (this.f1254m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f1254m.size()) {
                    C0186ad adVar = this.f1254m.get(i2);
                    if (adVar != null) {
                        adVar.mo829a(configuration);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1065a(Bundle bundle, String str, C0186ad adVar) {
        if (adVar.f1160x < 0) {
            m1245a((RuntimeException) new IllegalStateException("Fragment " + adVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, adVar.f1160x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1108a(Parcelable parcelable, C0214ak akVar) {
        List<C0214ak> list;
        if (parcelable != null) {
            C0215al alVar = (C0215al) parcelable;
            if (alVar.f1287a != null) {
                if (akVar != null) {
                    List<C0186ad> a = akVar.mo1180a();
                    List<C0214ak> b = akVar.mo1181b();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        C0186ad adVar = a.get(i);
                        if (f1231b) {
                            Log.v(f1232c, "restoreAllState: re-attaching retained " + adVar);
                        }
                        C0218an anVar = alVar.f1287a[adVar.f1160x];
                        anVar.f1306l = adVar;
                        adVar.f1159w = null;
                        adVar.f1129I = 0;
                        adVar.f1127G = false;
                        adVar.f1124D = false;
                        adVar.f1121A = null;
                        if (anVar.f1305k != null) {
                            anVar.f1305k.setClassLoader(this.f1262u.mo1049i().getClassLoader());
                            adVar.f1159w = anVar.f1305k.getSparseParcelableArray(f1236g);
                            adVar.f1158v = anVar.f1305k;
                        }
                    }
                    list = b;
                } else {
                    list = null;
                }
                this.f1253l = new ArrayList<>(alVar.f1287a.length);
                if (this.f1255n != null) {
                    this.f1255n.clear();
                }
                int i2 = 0;
                while (i2 < alVar.f1287a.length) {
                    C0218an anVar2 = alVar.f1287a[i2];
                    if (anVar2 != null) {
                        C0186ad a2 = anVar2.mo1198a(this.f1262u, this.f1264w, (list == null || i2 >= list.size()) ? null : list.get(i2));
                        if (f1231b) {
                            Log.v(f1232c, "restoreAllState: active #" + i2 + ": " + a2);
                        }
                        this.f1253l.add(a2);
                        anVar2.f1306l = null;
                    } else {
                        this.f1253l.add((Object) null);
                        if (this.f1255n == null) {
                            this.f1255n = new ArrayList<>();
                        }
                        if (f1231b) {
                            Log.v(f1232c, "restoreAllState: avail #" + i2);
                        }
                        this.f1255n.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
                if (akVar != null) {
                    List<C0186ad> a3 = akVar.mo1180a();
                    int size2 = a3 != null ? a3.size() : 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        C0186ad adVar2 = a3.get(i3);
                        if (adVar2.f1122B >= 0) {
                            if (adVar2.f1122B < this.f1253l.size()) {
                                adVar2.f1121A = this.f1253l.get(adVar2.f1122B);
                            } else {
                                Log.w(f1232c, "Re-attaching retained fragment " + adVar2 + " target no longer exists: " + adVar2.f1122B);
                                adVar2.f1121A = null;
                            }
                        }
                    }
                }
                if (alVar.f1288b != null) {
                    this.f1254m = new ArrayList<>(alVar.f1288b.length);
                    for (int i4 = 0; i4 < alVar.f1288b.length; i4++) {
                        C0186ad adVar3 = this.f1253l.get(alVar.f1288b[i4]);
                        if (adVar3 == null) {
                            m1245a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + alVar.f1288b[i4]));
                        }
                        adVar3.f1124D = true;
                        if (f1231b) {
                            Log.v(f1232c, "restoreAllState: added #" + i4 + ": " + adVar3);
                        }
                        if (this.f1254m.contains(adVar3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f1254m.add(adVar3);
                    }
                } else {
                    this.f1254m = null;
                }
                if (alVar.f1289c != null) {
                    this.f1256o = new ArrayList<>(alVar.f1289c.length);
                    for (int i5 = 0; i5 < alVar.f1289c.length; i5++) {
                        C0404t a4 = alVar.f1289c[i5].mo1697a(this);
                        if (f1231b) {
                            Log.v(f1232c, "restoreAllState: back stack #" + i5 + " (index " + a4.f1911w + "): " + a4);
                            PrintWriter printWriter = new PrintWriter(new C0885h(f1232c));
                            a4.mo1684a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1256o.add(a4);
                        if (a4.f1911w >= 0) {
                            mo1105a(a4.f1911w, a4);
                        }
                    }
                    return;
                }
                this.f1256o = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x030c, code lost:
        r1 = android.support.p010v4.p028k.C0802f.f2876a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x032c, code lost:
        if (r12 >= 1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0330, code lost:
        if (r10.f1239A == false) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0336, code lost:
        if (r11.mo859ap() == null) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0338, code lost:
        r0 = r11.mo859ap();
        r11.mo874c((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0346, code lost:
        if (r11.mo859ap() == null) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0348, code lost:
        r11.mo878d(r12);
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0373, code lost:
        if (r12 >= 4) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0377, code lost:
        if (f1231b == false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0379, code lost:
        android.util.Log.v(f1232c, "movefrom STARTED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0391, code lost:
        r11.mo849af();
        mo1139e(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0397, code lost:
        if (r12 >= 3) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x039b, code lost:
        if (f1231b == false) goto L_0x03b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039d, code lost:
        android.util.Log.v(f1232c, "movefrom STOPPED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03b5, code lost:
        r11.mo850ag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03b9, code lost:
        if (r12 >= 2) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03bd, code lost:
        if (f1231b == false) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03bf, code lost:
        android.util.Log.v(f1232c, "movefrom ACTIVITY_CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d9, code lost:
        if (r11.f1146Z == null) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03e1, code lost:
        if (r10.f1262u.mo994a(r11) == false) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03e5, code lost:
        if (r11.f1159w != null) goto L_0x03ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03e7, code lost:
        mo1155m(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03ea, code lost:
        r11.mo851ah();
        mo1141f(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03f2, code lost:
        if (r11.f1146Z == null) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03f6, code lost:
        if (r11.f1145Y == null) goto L_0x0436;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03fa, code lost:
        if (r10.f1261t <= 0) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03fe, code lost:
        if (r10.f1239A != false) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0406, code lost:
        if (r11.f1146Z.getVisibility() != 0) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x040d, code lost:
        if (r11.f1156aj < 0.0f) goto L_0x0480;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x040f, code lost:
        r0 = mo1104a(r11, r13, false, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0413, code lost:
        r11.f1156aj = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0416, code lost:
        if (r0 == null) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0418, code lost:
        r11.mo874c(r11.f1146Z);
        r11.mo878d(r12);
        r0.setAnimationListener(new android.support.p010v4.p013c.C0205aj.C02072(r10, r11.f1146Z, r0));
        r11.f1146Z.startAnimation(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x042f, code lost:
        r11.f1145Y.removeView(r11.f1146Z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0436, code lost:
        r11.f1145Y = null;
        r11.f1146Z = null;
        r11.f1147aa = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0440, code lost:
        if (f1231b == false) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0442, code lost:
        android.util.Log.v(f1232c, "movefrom CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x045c, code lost:
        if (r11.f1141U != false) goto L_0x0475;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x045e, code lost:
        r11.mo852ai();
        mo1143g(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0464, code lost:
        r11.mo853aj();
        mo1145h(r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x046a, code lost:
        if (r15 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x046e, code lost:
        if (r11.f1141U != false) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0470, code lost:
        mo1142g(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0475, code lost:
        r11.f1157u = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0478, code lost:
        r11.f1131K = null;
        r11.f1134N = null;
        r11.f1130J = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0480, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0482, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0199, code lost:
        if (r12 <= 1) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019d, code lost:
        if (f1231b == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019f, code lost:
        android.util.Log.v(f1232c, "moveto ACTIVITY_CREATED: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b9, code lost:
        if (r11.f1126F != false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bd, code lost:
        if (r11.f1136P == 0) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c2, code lost:
        if (r11.f1136P != -1) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c4, code lost:
        m1245a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("Cannot create fragment " + r11 + " for a container view with no id"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e5, code lost:
        r0 = (android.view.ViewGroup) r10.f1263v.mo926a(r11.f1136P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ef, code lost:
        if (r0 != null) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f3, code lost:
        if (r11.f1128H != false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r1 = r11.mo917t().getResourceName(r11.f1136P);
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1109a(final android.support.p010v4.p013c.C0186ad r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            r9 = 4
            r6 = 3
            r5 = 1
            r7 = 0
            r3 = 0
            boolean r0 = r11.f1124D
            if (r0 == 0) goto L_0x000d
            boolean r0 = r11.f1139S
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            if (r12 <= r5) goto L_0x0010
            r12 = r5
        L_0x0010:
            boolean r0 = r11.f1125E
            if (r0 == 0) goto L_0x001a
            int r0 = r11.f1157u
            if (r12 <= r0) goto L_0x001a
            int r12 = r11.f1157u
        L_0x001a:
            boolean r0 = r11.f1148ab
            if (r0 == 0) goto L_0x0025
            int r0 = r11.f1157u
            if (r0 >= r9) goto L_0x0025
            if (r12 <= r6) goto L_0x0025
            r12 = r6
        L_0x0025:
            int r0 = r11.f1157u
            if (r0 >= r12) goto L_0x0321
            boolean r0 = r11.f1126F
            if (r0 == 0) goto L_0x0032
            boolean r0 = r11.f1127G
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            android.view.View r0 = r11.mo859ap()
            if (r0 == 0) goto L_0x0045
            r11.mo874c((android.view.View) r7)
            int r2 = r11.mo860aq()
            r0 = r10
            r1 = r11
            r4 = r3
            r0.mo1109a((android.support.p010v4.p013c.C0186ad) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0045:
            int r0 = r11.f1157u
            switch(r0) {
                case 0: goto L_0x0085;
                case 1: goto L_0x0199;
                case 2: goto L_0x029a;
                case 3: goto L_0x029f;
                case 4: goto L_0x02c3;
                default: goto L_0x004a;
            }
        L_0x004a:
            int r0 = r11.f1157u
            if (r0 == r12) goto L_0x0031
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " not updated inline; "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "expected state "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = " found "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r11.f1157u
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r11.f1157u = r12
            goto L_0x0031
        L_0x0085:
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x00a1:
            android.os.Bundle r0 = r11.f1158v
            if (r0 == 0) goto L_0x00e9
            android.os.Bundle r0 = r11.f1158v
            android.support.v4.c.ah r1 = r10.f1262u
            android.content.Context r1 = r1.mo1049i()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r11.f1158v
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r11.f1159w = r0
            android.os.Bundle r0 = r11.f1158v
            java.lang.String r1 = "android:target_state"
            android.support.v4.c.ad r0 = r10.mo1061a((android.os.Bundle) r0, (java.lang.String) r1)
            r11.f1121A = r0
            android.support.v4.c.ad r0 = r11.f1121A
            if (r0 == 0) goto L_0x00d6
            android.os.Bundle r0 = r11.f1158v
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r3)
            r11.f1123C = r0
        L_0x00d6:
            android.os.Bundle r0 = r11.f1158v
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r5)
            r11.f1149ac = r0
            boolean r0 = r11.f1149ac
            if (r0 != 0) goto L_0x00e9
            r11.f1148ab = r5
            if (r12 <= r6) goto L_0x00e9
            r12 = r6
        L_0x00e9:
            android.support.v4.c.ah r0 = r10.f1262u
            r11.f1131K = r0
            android.support.v4.c.ad r0 = r10.f1264w
            r11.f1134N = r0
            android.support.v4.c.ad r0 = r10.f1264w
            if (r0 == 0) goto L_0x0132
            android.support.v4.c.ad r0 = r10.f1264w
            android.support.v4.c.aj r0 = r0.f1132L
        L_0x00f9:
            r11.f1130J = r0
            android.support.v4.c.ah r0 = r10.f1262u
            android.content.Context r0 = r0.mo1049i()
            r10.mo1110a((android.support.p010v4.p013c.C0186ad) r11, (android.content.Context) r0, (boolean) r3)
            r11.f1144X = r3
            android.support.v4.c.ah r0 = r10.f1262u
            android.content.Context r0 = r0.mo1049i()
            r11.mo767a((android.content.Context) r0)
            boolean r0 = r11.f1144X
            if (r0 != 0) goto L_0x0139
            android.support.v4.c.cd r0 = new android.support.v4.c.cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0132:
            android.support.v4.c.ah r0 = r10.f1262u
            android.support.v4.c.aj r0 = r0.mo1051k()
            goto L_0x00f9
        L_0x0139:
            android.support.v4.c.ad r0 = r11.f1134N
            if (r0 != 0) goto L_0x02ed
            android.support.v4.c.ah r0 = r10.f1262u
            r0.mo997b((android.support.p010v4.p013c.C0186ad) r11)
        L_0x0142:
            android.support.v4.c.ah r0 = r10.f1262u
            android.content.Context r0 = r0.mo1049i()
            r10.mo1122b((android.support.p010v4.p013c.C0186ad) r11, (android.content.Context) r0, (boolean) r3)
            boolean r0 = r11.f1141U
            if (r0 != 0) goto L_0x02f4
            android.os.Bundle r0 = r11.f1158v
            r11.mo896j((android.os.Bundle) r0)
            android.os.Bundle r0 = r11.f1158v
            r10.mo1111a((android.support.p010v4.p013c.C0186ad) r11, (android.os.Bundle) r0, (boolean) r3)
        L_0x0159:
            r11.f1141U = r3
            boolean r0 = r11.f1126F
            if (r0 == 0) goto L_0x0199
            android.os.Bundle r0 = r11.f1158v
            android.view.LayoutInflater r0 = r11.mo771b((android.os.Bundle) r0)
            android.os.Bundle r1 = r11.f1158v
            android.view.View r0 = r11.mo864b(r0, r7, r1)
            r11.f1146Z = r0
            android.view.View r0 = r11.f1146Z
            if (r0 == 0) goto L_0x0307
            android.view.View r0 = r11.f1146Z
            r11.f1147aa = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 < r1) goto L_0x02fd
            android.view.View r0 = r11.f1146Z
            android.support.p010v4.view.C1040ar.m5922c((android.view.View) r0, (boolean) r3)
        L_0x0180:
            boolean r0 = r11.f1138R
            if (r0 == 0) goto L_0x018b
            android.view.View r0 = r11.f1146Z
            r1 = 8
            r0.setVisibility(r1)
        L_0x018b:
            android.view.View r0 = r11.f1146Z
            android.os.Bundle r1 = r11.f1158v
            r11.mo838a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r11.f1146Z
            android.os.Bundle r1 = r11.f1158v
            r10.mo1112a((android.support.p010v4.p013c.C0186ad) r11, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r3)
        L_0x0199:
            if (r12 <= r5) goto L_0x029a
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x01b7:
            boolean r0 = r11.f1126F
            if (r0 != 0) goto L_0x0285
            int r0 = r11.f1136P
            if (r0 == 0) goto L_0x0482
            int r0 = r11.f1136P
            r1 = -1
            if (r0 != r1) goto L_0x01e5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " for a container view with no id"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r10.m1245a((java.lang.RuntimeException) r0)
        L_0x01e5:
            android.support.v4.c.af r0 = r10.f1263v
            int r1 = r11.f1136P
            android.view.View r0 = r0.mo926a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0234
            boolean r1 = r11.f1128H
            if (r1 != 0) goto L_0x0234
            android.content.res.Resources r1 = r11.mo917t()     // Catch:{ NotFoundException -> 0x030b }
            int r2 = r11.f1136P     // Catch:{ NotFoundException -> 0x030b }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x030b }
        L_0x01ff:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "No view found for id 0x"
            java.lang.StringBuilder r4 = r4.append(r8)
            int r8 = r11.f1136P
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = " ("
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = ") for fragment "
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            r10.m1245a((java.lang.RuntimeException) r2)
        L_0x0234:
            r11.f1145Y = r0
            android.os.Bundle r1 = r11.f1158v
            android.view.LayoutInflater r1 = r11.mo771b((android.os.Bundle) r1)
            android.os.Bundle r2 = r11.f1158v
            android.view.View r1 = r11.mo864b(r1, r0, r2)
            r11.f1146Z = r1
            android.view.View r1 = r11.f1146Z
            if (r1 == 0) goto L_0x031d
            android.view.View r1 = r11.f1146Z
            r11.f1147aa = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            if (r1 < r2) goto L_0x0310
            android.view.View r1 = r11.f1146Z
            android.support.p010v4.view.C1040ar.m5922c((android.view.View) r1, (boolean) r3)
        L_0x0257:
            if (r0 == 0) goto L_0x025e
            android.view.View r1 = r11.f1146Z
            r0.addView(r1)
        L_0x025e:
            boolean r0 = r11.f1138R
            if (r0 == 0) goto L_0x0269
            android.view.View r0 = r11.f1146Z
            r1 = 8
            r0.setVisibility(r1)
        L_0x0269:
            android.view.View r0 = r11.f1146Z
            android.os.Bundle r1 = r11.f1158v
            r11.mo838a((android.view.View) r0, (android.os.Bundle) r1)
            android.view.View r0 = r11.f1146Z
            android.os.Bundle r1 = r11.f1158v
            r10.mo1112a((android.support.p010v4.p013c.C0186ad) r11, (android.view.View) r0, (android.os.Bundle) r1, (boolean) r3)
            android.view.View r0 = r11.f1146Z
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x031a
            android.view.ViewGroup r0 = r11.f1145Y
            if (r0 == 0) goto L_0x031a
        L_0x0283:
            r11.f1154ah = r5
        L_0x0285:
            android.os.Bundle r0 = r11.f1158v
            r11.mo898k((android.os.Bundle) r0)
            android.os.Bundle r0 = r11.f1158v
            r10.mo1123b((android.support.p010v4.p013c.C0186ad) r11, (android.os.Bundle) r0, (boolean) r3)
            android.view.View r0 = r11.f1146Z
            if (r0 == 0) goto L_0x0298
            android.os.Bundle r0 = r11.f1158v
            r11.mo886f((android.os.Bundle) r0)
        L_0x0298:
            r11.f1158v = r7
        L_0x029a:
            r0 = 2
            if (r12 <= r0) goto L_0x029f
            r11.f1157u = r6
        L_0x029f:
            if (r12 <= r6) goto L_0x02c3
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02bd:
            r11.mo845ab()
            r10.mo1124b((android.support.p010v4.p013c.C0186ad) r11, (boolean) r3)
        L_0x02c3:
            if (r12 <= r9) goto L_0x004a
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x02e1
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02e1:
            r11.mo846ac()
            r10.mo1132c((android.support.p010v4.p013c.C0186ad) r11, (boolean) r3)
            r11.f1158v = r7
            r11.f1159w = r7
            goto L_0x004a
        L_0x02ed:
            android.support.v4.c.ad r0 = r11.f1134N
            r0.mo832a((android.support.p010v4.p013c.C0186ad) r11)
            goto L_0x0142
        L_0x02f4:
            android.os.Bundle r0 = r11.f1158v
            r11.mo891h((android.os.Bundle) r0)
            r11.f1157u = r5
            goto L_0x0159
        L_0x02fd:
            android.view.View r0 = r11.f1146Z
            android.view.ViewGroup r0 = android.support.p010v4.p013c.C0256az.m1569a(r0)
            r11.f1146Z = r0
            goto L_0x0180
        L_0x0307:
            r11.f1147aa = r7
            goto L_0x0199
        L_0x030b:
            r1 = move-exception
            java.lang.String r1 = "unknown"
            goto L_0x01ff
        L_0x0310:
            android.view.View r1 = r11.f1146Z
            android.view.ViewGroup r1 = android.support.p010v4.p013c.C0256az.m1569a(r1)
            r11.f1146Z = r1
            goto L_0x0257
        L_0x031a:
            r5 = r3
            goto L_0x0283
        L_0x031d:
            r11.f1147aa = r7
            goto L_0x0285
        L_0x0321:
            int r0 = r11.f1157u
            if (r0 <= r12) goto L_0x004a
            int r0 = r11.f1157u
            switch(r0) {
                case 1: goto L_0x032c;
                case 2: goto L_0x03b8;
                case 3: goto L_0x0397;
                case 4: goto L_0x0373;
                case 5: goto L_0x034e;
                default: goto L_0x032a;
            }
        L_0x032a:
            goto L_0x004a
        L_0x032c:
            if (r12 >= r5) goto L_0x004a
            boolean r0 = r10.f1239A
            if (r0 == 0) goto L_0x0342
            android.view.View r0 = r11.mo859ap()
            if (r0 == 0) goto L_0x0342
            android.view.View r0 = r11.mo859ap()
            r11.mo874c((android.view.View) r7)
            r0.clearAnimation()
        L_0x0342:
            android.view.View r0 = r11.mo859ap()
            if (r0 == 0) goto L_0x043e
            r11.mo878d((int) r12)
            r12 = r5
            goto L_0x004a
        L_0x034e:
            r0 = 5
            if (r12 >= r0) goto L_0x0373
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x036d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x036d:
            r11.mo848ae()
            r10.mo1137d(r11, r3)
        L_0x0373:
            if (r12 >= r9) goto L_0x0397
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x0391
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0391:
            r11.mo849af()
            r10.mo1139e(r11, r3)
        L_0x0397:
            if (r12 >= r6) goto L_0x03b8
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x03b5
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STOPPED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03b5:
            r11.mo850ag()
        L_0x03b8:
            r0 = 2
            if (r12 >= r0) goto L_0x032c
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x03d7
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x03d7:
            android.view.View r0 = r11.f1146Z
            if (r0 == 0) goto L_0x03ea
            android.support.v4.c.ah r0 = r10.f1262u
            boolean r0 = r0.mo994a((android.support.p010v4.p013c.C0186ad) r11)
            if (r0 == 0) goto L_0x03ea
            android.util.SparseArray<android.os.Parcelable> r0 = r11.f1159w
            if (r0 != 0) goto L_0x03ea
            r10.mo1155m(r11)
        L_0x03ea:
            r11.mo851ah()
            r10.mo1141f(r11, r3)
            android.view.View r0 = r11.f1146Z
            if (r0 == 0) goto L_0x0436
            android.view.ViewGroup r0 = r11.f1145Y
            if (r0 == 0) goto L_0x0436
            int r0 = r10.f1261t
            if (r0 <= 0) goto L_0x0480
            boolean r0 = r10.f1239A
            if (r0 != 0) goto L_0x0480
            android.view.View r0 = r11.f1146Z
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0480
            float r0 = r11.f1156aj
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0480
            android.view.animation.Animation r0 = r10.mo1104a((android.support.p010v4.p013c.C0186ad) r11, (int) r13, (boolean) r3, (int) r14)
        L_0x0413:
            r1 = 0
            r11.f1156aj = r1
            if (r0 == 0) goto L_0x042f
            android.view.View r1 = r11.f1146Z
            r11.mo874c((android.view.View) r1)
            r11.mo878d((int) r12)
            android.view.View r1 = r11.f1146Z
            android.support.v4.c.aj$2 r2 = new android.support.v4.c.aj$2
            r2.<init>(r1, r0, r11)
            r0.setAnimationListener(r2)
            android.view.View r1 = r11.f1146Z
            r1.startAnimation(r0)
        L_0x042f:
            android.view.ViewGroup r0 = r11.f1145Y
            android.view.View r1 = r11.f1146Z
            r0.removeView(r1)
        L_0x0436:
            r11.f1145Y = r7
            r11.f1146Z = r7
            r11.f1147aa = r7
            goto L_0x032c
        L_0x043e:
            boolean r0 = f1231b
            if (r0 == 0) goto L_0x045a
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x045a:
            boolean r0 = r11.f1141U
            if (r0 != 0) goto L_0x0475
            r11.mo852ai()
            r10.mo1143g(r11, r3)
        L_0x0464:
            r11.mo853aj()
            r10.mo1145h(r11, r3)
            if (r15 != 0) goto L_0x004a
            boolean r0 = r11.f1141U
            if (r0 != 0) goto L_0x0478
            r10.mo1142g(r11)
            goto L_0x004a
        L_0x0475:
            r11.f1157u = r3
            goto L_0x0464
        L_0x0478:
            r11.f1131K = r7
            r11.f1134N = r7
            r11.f1130J = r7
            goto L_0x004a
        L_0x0480:
            r0 = r7
            goto L_0x0413
        L_0x0482:
            r0 = r7
            goto L_0x0234
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p013c.C0205aj.mo1109a(android.support.v4.c.ad, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1110a(C0186ad adVar, Context context, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1110a(adVar, context, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1089a((C0201ai) this, adVar, context);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1111a(C0186ad adVar, Bundle bundle, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1111a(adVar, bundle, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1090a((C0201ai) this, adVar, bundle);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1112a(C0186ad adVar, View view, Bundle bundle, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1112a(adVar, view, bundle, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1091a(this, adVar, view, bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1113a(C0186ad adVar, boolean z) {
        if (this.f1254m == null) {
            this.f1254m = new ArrayList<>();
        }
        if (f1231b) {
            Log.v(f1232c, "add: " + adVar);
        }
        mo1140f(adVar);
        if (adVar.f1139S) {
            return;
        }
        if (this.f1254m.contains(adVar)) {
            throw new IllegalStateException("Fragment already added: " + adVar);
        }
        this.f1254m.add(adVar);
        adVar.f1124D = true;
        adVar.f1125E = false;
        if (adVar.f1146Z == null) {
            adVar.f1155ai = false;
        }
        if (adVar.f1142V && adVar.f1143W) {
            this.f1265y = true;
        }
        if (z) {
            mo1130c(adVar);
        }
    }

    /* renamed from: a */
    public void mo1114a(C0200ah ahVar, C0198af afVar, C0186ad adVar) {
        if (this.f1262u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1262u = ahVar;
        this.f1263v = afVar;
        this.f1264w = adVar;
    }

    /* renamed from: a */
    public void mo1066a(C0201ai.C0203b bVar) {
        if (this.f1249V != null) {
            synchronized (this.f1249V) {
                int size = this.f1249V.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f1249V.get(i).f3081a == bVar) {
                        this.f1249V.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1067a(C0201ai.C0203b bVar, boolean z) {
        if (this.f1249V == null) {
            this.f1249V = new CopyOnWriteArrayList<>();
        }
        this.f1249V.add(new C0894l(bVar, Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public void mo1068a(C0201ai.C0204c cVar) {
        if (this.f1260s == null) {
            this.f1260s = new ArrayList<>();
        }
        this.f1260s.add(cVar);
    }

    /* renamed from: a */
    public void mo1115a(C0211c cVar, boolean z) {
        if (!z) {
            m1233A();
        }
        synchronized (this) {
            if (this.f1239A || this.f1262u == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f1250i == null) {
                this.f1250i = new ArrayList<>();
            }
            this.f1250i.add(cVar);
            m1234B();
        }
    }

    /* renamed from: a */
    public void mo1069a(String str, int i) {
        mo1115a((C0211c) new C0212d(str, -1, i), false);
    }

    /* renamed from: a */
    public void mo1070a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f1253l != null && (size6 = this.f1253l.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                C0186ad adVar = this.f1253l.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(adVar);
                if (adVar != null) {
                    adVar.mo840a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.f1254m != null && (size5 = this.f1254m.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f1254m.get(i2).toString());
            }
        }
        if (this.f1257p != null && (size4 = this.f1257p.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f1257p.get(i3).toString());
            }
        }
        if (this.f1256o != null && (size3 = this.f1256o.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0404t tVar = this.f1256o.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(tVar.toString());
                tVar.mo1683a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f1258q != null && (size2 = this.f1258q.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f1258q.get(i5));
                }
            }
            if (this.f1259r != null && this.f1259r.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1259r.toArray()));
            }
        }
        if (this.f1250i != null && (size = this.f1250i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f1250i.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1262u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1263v);
        if (this.f1264w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1264w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1261t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1266z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1239A);
        if (this.f1265y) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1265y);
        }
        if (this.f1240B != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1240B);
        }
        if (this.f1255n != null && this.f1255n.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f1255n.toArray()));
        }
    }

    /* renamed from: a */
    public boolean mo1116a(Menu menu) {
        if (this.f1254m == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1254m.size(); i++) {
            C0186ad adVar = this.f1254m.get(i);
            if (adVar != null && adVar.mo876c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo1117a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        ArrayList<C0186ad> arrayList = null;
        if (this.f1254m != null) {
            int i = 0;
            z = false;
            while (i < this.f1254m.size()) {
                C0186ad adVar = this.f1254m.get(i);
                if (adVar != null && adVar.mo871b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(adVar);
                }
                i++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f1257p != null) {
            for (int i2 = 0; i2 < this.f1257p.size(); i2++) {
                C0186ad adVar2 = this.f1257p.get(i2);
                if (arrayList == null || !arrayList.contains(adVar2)) {
                    adVar2.mo803P();
                }
            }
        }
        this.f1257p = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo1118a(MenuItem menuItem) {
        if (this.f1254m == null) {
            return false;
        }
        for (int i = 0; i < this.f1254m.size(); i++) {
            C0186ad adVar = this.f1254m.get(i);
            if (adVar != null && adVar.mo877c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1119a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.f1256o == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f1256o.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1256o.remove(size));
            arrayList2.add(true);
        } else {
            int i4 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f1256o.size() - 1;
                while (i3 >= 0) {
                    C0404t tVar = this.f1256o.get(i3);
                    if ((str != null && str.equals(tVar.mo1087n())) || (i >= 0 && i == tVar.f1911w)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0404t tVar2 = this.f1256o.get(i3);
                        if ((str == null || !str.equals(tVar2.mo1087n())) && (i < 0 || i != tVar2.f1911w)) {
                            break;
                        }
                        i3--;
                    }
                }
                i4 = i3;
            }
            if (i4 == this.f1256o.size() - 1) {
                return false;
            }
            for (int size3 = this.f1256o.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1256o.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* renamed from: b */
    public C0186ad mo1120b(String str) {
        C0186ad b;
        if (!(this.f1253l == null || str == null)) {
            for (int size = this.f1253l.size() - 1; size >= 0; size--) {
                C0186ad adVar = this.f1253l.get(size);
                if (adVar != null && (b = adVar.mo863b(str)) != null) {
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public C0201ai.C0202a mo1071b(int i) {
        return this.f1256o.get(i);
    }

    /* renamed from: b */
    public void mo1121b(C0186ad adVar) {
        if (!adVar.f1148ab) {
            return;
        }
        if (this.f1252k) {
            this.f1241C = true;
            return;
        }
        adVar.f1148ab = false;
        mo1109a(adVar, this.f1261t, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1122b(C0186ad adVar, Context context, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1122b(adVar, context, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1093b((C0201ai) this, adVar, context);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1123b(C0186ad adVar, Bundle bundle, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1123b(adVar, bundle, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1094b((C0201ai) this, adVar, bundle);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1124b(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1124b(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1088a(this, adVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1073b(C0201ai.C0204c cVar) {
        if (this.f1260s != null) {
            this.f1260s.remove(cVar);
        }
    }

    /* renamed from: b */
    public void mo1125b(C0211c cVar, boolean z) {
        m1257d(z);
        if (cVar.mo1176a(this.f1242D, this.f1243E)) {
            this.f1252k = true;
            try {
                m1254b(this.f1242D, this.f1243E);
            } finally {
                m1235C();
            }
        }
        mo1150k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1126b(C0404t tVar) {
        if (this.f1256o == null) {
            this.f1256o = new ArrayList<>();
        }
        this.f1256o.add(tVar);
        mo1152l();
    }

    /* renamed from: b */
    public void mo1127b(Menu menu) {
        if (this.f1254m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f1254m.size()) {
                    C0186ad adVar = this.f1254m.get(i2);
                    if (adVar != null) {
                        adVar.mo879d(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1128b(boolean z) {
        if (this.f1254m != null) {
            for (int size = this.f1254m.size() - 1; size >= 0; size--) {
                C0186ad adVar = this.f1254m.get(size);
                if (adVar != null) {
                    adVar.mo905m(z);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo1074b(int i, int i2) {
        m1233A();
        mo1149j();
        if (i >= 0) {
            return m1250a((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: b */
    public boolean mo1129b(MenuItem menuItem) {
        if (this.f1254m == null) {
            return false;
        }
        for (int i = 0; i < this.f1254m.size(); i++) {
            C0186ad adVar = this.f1254m.get(i);
            if (adVar != null && adVar.mo882d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo1075b(String str, int i) {
        m1233A();
        return m1250a(str, -1, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1130c(C0186ad adVar) {
        mo1109a(adVar, this.f1261t, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1131c(C0186ad adVar, Bundle bundle, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1131c(adVar, bundle, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1096c(this, adVar, bundle);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1132c(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1132c(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1092b(this, adVar);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo1133c(boolean z) {
        if (this.f1254m != null) {
            for (int size = this.f1254m.size() - 1; size >= 0; size--) {
                C0186ad adVar = this.f1254m.get(size);
                if (adVar != null) {
                    adVar.mo907n(z);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo1076c() {
        boolean j = mo1149j();
        m1236D();
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo1134c(int i) {
        return this.f1261t >= i;
    }

    /* renamed from: d */
    public void mo1077d() {
        mo1115a((C0211c) new C0212d((String) null, -1, 0), false);
    }

    /* renamed from: d */
    public void mo1135d(int i) {
        synchronized (this) {
            this.f1258q.set(i, (Object) null);
            if (this.f1259r == null) {
                this.f1259r = new ArrayList<>();
            }
            if (f1231b) {
                Log.v(f1232c, "Freeing back stack index " + i);
            }
            this.f1259r.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1136d(C0186ad adVar) {
        if (adVar.f1146Z != null) {
            Animation a = mo1104a(adVar, adVar.mo855al(), !adVar.f1138R, adVar.mo856am());
            if (a != null) {
                m1253b(adVar.f1146Z, a);
                adVar.f1146Z.startAnimation(a);
                m1253b(adVar.f1146Z, a);
                a.start();
            }
            adVar.f1146Z.setVisibility((!adVar.f1138R || adVar.mo862as()) ? 0 : 8);
            if (adVar.mo862as()) {
                adVar.mo909o(false);
            }
        }
        if (adVar.f1124D && adVar.f1142V && adVar.f1143W) {
            this.f1265y = true;
        }
        adVar.f1155ai = false;
        adVar.mo881d(adVar.f1138R);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1137d(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1137d(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1095c(this, adVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r0 = r0.f1146Z;
        r1 = r9.f1145Y;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1138e(android.support.p010v4.p013c.C0186ad r9) {
        /*
            r8 = this;
            r7 = 1
            r6 = 0
            r5 = 0
            if (r9 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            int r2 = r8.f1261t
            boolean r0 = r9.f1125E
            if (r0 == 0) goto L_0x0016
            boolean r0 = r9.mo900k()
            if (r0 == 0) goto L_0x007c
            int r2 = java.lang.Math.min(r2, r7)
        L_0x0016:
            int r3 = r9.mo855al()
            int r4 = r9.mo856am()
            r0 = r8
            r1 = r9
            r0.mo1109a((android.support.p010v4.p013c.C0186ad) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
            android.view.View r0 = r9.f1146Z
            if (r0 == 0) goto L_0x0074
            android.support.v4.c.ad r0 = r8.m1259o(r9)
            if (r0 == 0) goto L_0x0045
            android.view.View r0 = r0.f1146Z
            android.view.ViewGroup r1 = r9.f1145Y
            int r0 = r1.indexOfChild(r0)
            android.view.View r2 = r9.f1146Z
            int r2 = r1.indexOfChild(r2)
            if (r2 >= r0) goto L_0x0045
            r1.removeViewAt(r2)
            android.view.View r2 = r9.f1146Z
            r1.addView(r2, r0)
        L_0x0045:
            boolean r0 = r9.f1154ah
            if (r0 == 0) goto L_0x0074
            android.view.ViewGroup r0 = r9.f1145Y
            if (r0 == 0) goto L_0x0074
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 >= r1) goto L_0x0081
            android.view.View r0 = r9.f1146Z
            r0.setVisibility(r5)
        L_0x0058:
            r9.f1156aj = r6
            r9.f1154ah = r5
            int r0 = r9.mo855al()
            int r1 = r9.mo856am()
            android.view.animation.Animation r0 = r8.mo1104a((android.support.p010v4.p013c.C0186ad) r9, (int) r0, (boolean) r7, (int) r1)
            if (r0 == 0) goto L_0x0074
            android.view.View r1 = r9.f1146Z
            r8.m1253b((android.view.View) r1, (android.view.animation.Animation) r0)
            android.view.View r1 = r9.f1146Z
            r1.startAnimation(r0)
        L_0x0074:
            boolean r0 = r9.f1155ai
            if (r0 == 0) goto L_0x0005
            r8.mo1136d((android.support.p010v4.p013c.C0186ad) r9)
            goto L_0x0005
        L_0x007c:
            int r2 = java.lang.Math.min(r2, r5)
            goto L_0x0016
        L_0x0081:
            float r0 = r9.f1156aj
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            android.view.View r0 = r9.f1146Z
            float r1 = r9.f1156aj
            r0.setAlpha(r1)
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p013c.C0205aj.mo1138e(android.support.v4.c.ad):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1139e(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1139e(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1097d(this, adVar);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo1078e() {
        m1233A();
        return m1250a((String) null, -1, 0);
    }

    /* renamed from: f */
    public int mo1079f() {
        if (this.f1256o != null) {
            return this.f1256o.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1140f(C0186ad adVar) {
        if (adVar.f1160x < 0) {
            if (this.f1255n == null || this.f1255n.size() <= 0) {
                if (this.f1253l == null) {
                    this.f1253l = new ArrayList<>();
                }
                adVar.mo819a(this.f1253l.size(), this.f1264w);
                this.f1253l.add(adVar);
            } else {
                adVar.mo819a(this.f1255n.remove(this.f1255n.size() - 1).intValue(), this.f1264w);
                this.f1253l.set(adVar.f1160x, adVar);
            }
            if (f1231b) {
                Log.v(f1232c, "Allocated fragment index " + adVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1141f(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1141f(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1098e(this, adVar);
                }
            }
        }
    }

    /* renamed from: g */
    public List<C0186ad> mo1080g() {
        return this.f1253l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1142g(C0186ad adVar) {
        if (adVar.f1160x >= 0) {
            if (f1231b) {
                Log.v(f1232c, "Freeing fragment index " + adVar);
            }
            this.f1253l.set(adVar.f1160x, (Object) null);
            if (this.f1255n == null) {
                this.f1255n = new ArrayList<>();
            }
            this.f1255n.add(Integer.valueOf(adVar.f1160x));
            this.f1262u.mo1046b(adVar.f1161y);
            adVar.mo802O();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1143g(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1143g(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1099f(this, adVar);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo1144h(C0186ad adVar) {
        if (f1231b) {
            Log.v(f1232c, "remove: " + adVar + " nesting=" + adVar.f1129I);
        }
        boolean z = !adVar.mo900k();
        if (!adVar.f1139S || z) {
            if (this.f1254m != null) {
                this.f1254m.remove(adVar);
            }
            if (adVar.f1142V && adVar.f1143W) {
                this.f1265y = true;
            }
            adVar.f1124D = false;
            adVar.f1125E = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1145h(C0186ad adVar, boolean z) {
        if (this.f1264w != null) {
            C0201ai u = this.f1264w.mo919u();
            if (u instanceof C0205aj) {
                ((C0205aj) u).mo1145h(adVar, true);
            }
        }
        if (this.f1249V != null) {
            Iterator<C0894l<C0201ai.C0203b, Boolean>> it = this.f1249V.iterator();
            while (it.hasNext()) {
                C0894l next = it.next();
                if (!z || ((Boolean) next.f3082b).booleanValue()) {
                    ((C0201ai.C0203b) next.f3081a).mo1100g(this, adVar);
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo1081h() {
        return this.f1239A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1146i() {
        if (this.f1253l != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f1253l.size()) {
                    C0186ad adVar = this.f1253l.get(i2);
                    if (adVar != null) {
                        mo1121b(adVar);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public void mo1147i(C0186ad adVar) {
        boolean z = true;
        if (f1231b) {
            Log.v(f1232c, "hide: " + adVar);
        }
        if (!adVar.f1138R) {
            adVar.f1138R = true;
            if (adVar.f1155ai) {
                z = false;
            }
            adVar.f1155ai = z;
        }
    }

    /* renamed from: j */
    public void mo1148j(C0186ad adVar) {
        boolean z = false;
        if (f1231b) {
            Log.v(f1232c, "show: " + adVar);
        }
        if (adVar.f1138R) {
            adVar.f1138R = false;
            if (!adVar.f1155ai) {
                z = true;
            }
            adVar.f1155ai = z;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public boolean mo1149j() {
        m1257d(true);
        boolean z = false;
        while (m1256c(this.f1242D, this.f1243E)) {
            this.f1252k = true;
            try {
                m1254b(this.f1242D, this.f1243E);
                m1235C();
                z = true;
            } catch (Throwable th) {
                m1235C();
                throw th;
            }
        }
        mo1150k();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo1150k() {
        if (this.f1241C) {
            boolean z = false;
            for (int i = 0; i < this.f1253l.size(); i++) {
                C0186ad adVar = this.f1253l.get(i);
                if (!(adVar == null || adVar.f1150ad == null)) {
                    z |= adVar.f1150ad.mo1290a();
                }
            }
            if (!z) {
                this.f1241C = false;
                mo1146i();
            }
        }
    }

    /* renamed from: k */
    public void mo1151k(C0186ad adVar) {
        if (f1231b) {
            Log.v(f1232c, "detach: " + adVar);
        }
        if (!adVar.f1139S) {
            adVar.f1139S = true;
            if (adVar.f1124D) {
                if (this.f1254m != null) {
                    if (f1231b) {
                        Log.v(f1232c, "remove from detach: " + adVar);
                    }
                    this.f1254m.remove(adVar);
                }
                if (adVar.f1142V && adVar.f1143W) {
                    this.f1265y = true;
                }
                adVar.f1124D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1152l() {
        if (this.f1260s != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f1260s.size()) {
                    this.f1260s.get(i2).mo1101a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public void mo1153l(C0186ad adVar) {
        if (f1231b) {
            Log.v(f1232c, "attach: " + adVar);
        }
        if (adVar.f1139S) {
            adVar.f1139S = false;
            if (!adVar.f1124D) {
                if (this.f1254m == null) {
                    this.f1254m = new ArrayList<>();
                }
                if (this.f1254m.contains(adVar)) {
                    throw new IllegalStateException("Fragment already added: " + adVar);
                }
                if (f1231b) {
                    Log.v(f1232c, "add from attach: " + adVar);
                }
                this.f1254m.add(adVar);
                adVar.f1124D = true;
                if (adVar.f1142V && adVar.f1143W) {
                    this.f1265y = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C0214ak mo1154m() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        C0214ak m;
        ArrayList arrayList3;
        if (this.f1253l != null) {
            int i = 0;
            arrayList2 = null;
            arrayList = null;
            while (i < this.f1253l.size()) {
                C0186ad adVar = this.f1253l.get(i);
                if (adVar != null) {
                    if (adVar.f1140T) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(adVar);
                        adVar.f1141U = true;
                        adVar.f1122B = adVar.f1121A != null ? adVar.f1121A.f1160x : -1;
                        if (f1231b) {
                            Log.v(f1232c, "retainNonConfig: keeping retained " + adVar);
                        }
                    }
                    if (adVar.f1132L == null || (m = adVar.f1132L.mo1154m()) == null) {
                        z = false;
                    } else {
                        if (arrayList2 == null) {
                            arrayList3 = new ArrayList();
                            for (int i2 = 0; i2 < i; i2++) {
                                arrayList3.add((Object) null);
                            }
                        } else {
                            arrayList3 = arrayList2;
                        }
                        arrayList3.add(m);
                        arrayList2 = arrayList3;
                        z = true;
                    }
                    if (arrayList2 != null && !z) {
                        arrayList2.add((Object) null);
                    }
                }
                i++;
                arrayList = arrayList;
            }
        } else {
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList == null && arrayList2 == null) {
            return null;
        }
        return new C0214ak(arrayList, arrayList2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo1155m(C0186ad adVar) {
        if (adVar.f1147aa != null) {
            if (this.f1246H == null) {
                this.f1246H = new SparseArray<>();
            } else {
                this.f1246H.clear();
            }
            adVar.f1147aa.saveHierarchyState(this.f1246H);
            if (this.f1246H.size() > 0) {
                adVar.f1159w = this.f1246H;
                this.f1246H = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Bundle mo1156n(C0186ad adVar) {
        Bundle bundle;
        if (this.f1245G == null) {
            this.f1245G = new Bundle();
        }
        adVar.mo902l(this.f1245G);
        mo1131c(adVar, this.f1245G, false);
        if (!this.f1245G.isEmpty()) {
            bundle = this.f1245G;
            this.f1245G = null;
        } else {
            bundle = null;
        }
        if (adVar.f1146Z != null) {
            mo1155m(adVar);
        }
        if (adVar.f1159w != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f1236g, adVar.f1159w);
        }
        if (!adVar.f1149ac) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f1237h, adVar.f1149ac);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Parcelable mo1157n() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        C0406u[] uVarArr = null;
        m1236D();
        m1237E();
        mo1149j();
        if (f1233d) {
            this.f1266z = true;
        }
        if (this.f1253l == null || this.f1253l.size() <= 0) {
            return null;
        }
        int size3 = this.f1253l.size();
        C0218an[] anVarArr = new C0218an[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            C0186ad adVar = this.f1253l.get(i);
            if (adVar != null) {
                if (adVar.f1160x < 0) {
                    m1245a((RuntimeException) new IllegalStateException("Failure saving state: active " + adVar + " has cleared index: " + adVar.f1160x));
                }
                C0218an anVar = new C0218an(adVar);
                anVarArr[i] = anVar;
                if (adVar.f1157u <= 0 || anVar.f1305k != null) {
                    anVar.f1305k = adVar.f1158v;
                } else {
                    anVar.f1305k = mo1156n(adVar);
                    if (adVar.f1121A != null) {
                        if (adVar.f1121A.f1160x < 0) {
                            m1245a((RuntimeException) new IllegalStateException("Failure saving state: " + adVar + " has target not in fragment manager: " + adVar.f1121A));
                        }
                        if (anVar.f1305k == null) {
                            anVar.f1305k = new Bundle();
                        }
                        mo1065a(anVar.f1305k, f1235f, adVar.f1121A);
                        if (adVar.f1123C != 0) {
                            anVar.f1305k.putInt(f1234e, adVar.f1123C);
                        }
                    }
                }
                if (f1231b) {
                    Log.v(f1232c, "Saved state of " + adVar + ": " + anVar.f1305k);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (z2) {
            if (this.f1254m == null || (size2 = this.f1254m.size()) <= 0) {
                iArr = null;
            } else {
                iArr = new int[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    iArr[i2] = this.f1254m.get(i2).f1160x;
                    if (iArr[i2] < 0) {
                        m1245a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.f1254m.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                    if (f1231b) {
                        Log.v(f1232c, "saveAllState: adding fragment #" + i2 + ": " + this.f1254m.get(i2));
                    }
                }
            }
            if (this.f1256o != null && (size = this.f1256o.size()) > 0) {
                uVarArr = new C0406u[size];
                for (int i3 = 0; i3 < size; i3++) {
                    uVarArr[i3] = new C0406u(this.f1256o.get(i3));
                    if (f1231b) {
                        Log.v(f1232c, "saveAllState: adding back stack #" + i3 + ": " + this.f1256o.get(i3));
                    }
                }
            }
            C0215al alVar = new C0215al();
            alVar.f1287a = anVarArr;
            alVar.f1288b = iArr;
            alVar.f1289c = uVarArr;
            return alVar;
        } else if (!f1231b) {
            return null;
        } else {
            Log.v(f1232c, "saveAllState: no fragments!");
            return null;
        }
    }

    /* renamed from: o */
    public void mo1158o() {
        this.f1266z = false;
    }

    /* renamed from: p */
    public void mo1159p() {
        this.f1266z = false;
        this.f1252k = true;
        mo1106a(1, false);
        this.f1252k = false;
    }

    /* renamed from: q */
    public void mo1160q() {
        this.f1266z = false;
        this.f1252k = true;
        mo1106a(2, false);
        this.f1252k = false;
    }

    /* renamed from: r */
    public void mo1161r() {
        this.f1266z = false;
        this.f1252k = true;
        mo1106a(4, false);
        this.f1252k = false;
    }

    /* renamed from: s */
    public void mo1162s() {
        this.f1266z = false;
        this.f1252k = true;
        mo1106a(5, false);
        this.f1252k = false;
    }

    /* renamed from: t */
    public void mo1163t() {
        this.f1252k = true;
        mo1106a(4, false);
        this.f1252k = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f1264w != null) {
            C0884g.m4428a(this.f1264w, sb);
        } else {
            C0884g.m4428a(this.f1262u, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1165u() {
        this.f1266z = true;
        this.f1252k = true;
        mo1106a(3, false);
        this.f1252k = false;
    }

    /* renamed from: v */
    public void mo1166v() {
        this.f1252k = true;
        mo1106a(2, false);
        this.f1252k = false;
    }

    /* renamed from: w */
    public void mo1167w() {
        this.f1252k = true;
        mo1106a(1, false);
        this.f1252k = false;
    }

    /* renamed from: x */
    public void mo1168x() {
        this.f1239A = true;
        mo1149j();
        this.f1252k = true;
        mo1106a(0, false);
        this.f1252k = false;
        this.f1262u = null;
        this.f1263v = null;
        this.f1264w = null;
    }

    /* renamed from: y */
    public void mo1169y() {
        if (this.f1254m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f1254m.size()) {
                    C0186ad adVar = this.f1254m.get(i2);
                    if (adVar != null) {
                        adVar.mo847ad();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C1182q mo1170z() {
        return this;
    }
}
