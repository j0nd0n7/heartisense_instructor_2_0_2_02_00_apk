package android.support.p010v4.p013c;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0015aj;
import android.support.annotation.C0030i;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0884g;
import android.support.p010v4.p033o.C0900o;
import android.support.p010v4.view.C1172m;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.c.ad */
public class C0186ad implements ComponentCallbacks, View.OnCreateContextMenuListener {

    /* renamed from: a */
    private static final C0900o<String, Class<?>> f1113a = new C0900o<>();

    /* renamed from: n */
    static final Object f1114n = new Object();

    /* renamed from: o */
    static final int f1115o = 0;

    /* renamed from: p */
    static final int f1116p = 1;

    /* renamed from: q */
    static final int f1117q = 2;

    /* renamed from: r */
    static final int f1118r = 3;

    /* renamed from: s */
    static final int f1119s = 4;

    /* renamed from: t */
    static final int f1120t = 5;

    /* renamed from: A */
    C0186ad f1121A;

    /* renamed from: B */
    int f1122B = -1;

    /* renamed from: C */
    int f1123C;

    /* renamed from: D */
    boolean f1124D;

    /* renamed from: E */
    boolean f1125E;

    /* renamed from: F */
    boolean f1126F;

    /* renamed from: G */
    boolean f1127G;

    /* renamed from: H */
    boolean f1128H;

    /* renamed from: I */
    int f1129I;

    /* renamed from: J */
    C0205aj f1130J;

    /* renamed from: K */
    C0200ah f1131K;

    /* renamed from: L */
    C0205aj f1132L;

    /* renamed from: M */
    C0214ak f1133M;

    /* renamed from: N */
    C0186ad f1134N;

    /* renamed from: O */
    int f1135O;

    /* renamed from: P */
    int f1136P;

    /* renamed from: Q */
    String f1137Q;

    /* renamed from: R */
    boolean f1138R;

    /* renamed from: S */
    boolean f1139S;

    /* renamed from: T */
    boolean f1140T;

    /* renamed from: U */
    boolean f1141U;

    /* renamed from: V */
    boolean f1142V;

    /* renamed from: W */
    boolean f1143W = true;

    /* renamed from: X */
    boolean f1144X;

    /* renamed from: Y */
    ViewGroup f1145Y;

    /* renamed from: Z */
    View f1146Z;

    /* renamed from: aa */
    View f1147aa;

    /* renamed from: ab */
    boolean f1148ab;

    /* renamed from: ac */
    boolean f1149ac = true;

    /* renamed from: ad */
    C0249aw f1150ad;

    /* renamed from: ae */
    boolean f1151ae;

    /* renamed from: af */
    boolean f1152af;

    /* renamed from: ag */
    C0189a f1153ag;

    /* renamed from: ah */
    boolean f1154ah;

    /* renamed from: ai */
    boolean f1155ai;

    /* renamed from: aj */
    float f1156aj;

    /* renamed from: u */
    int f1157u = 0;

    /* renamed from: v */
    Bundle f1158v;

    /* renamed from: w */
    SparseArray<Parcelable> f1159w;

    /* renamed from: x */
    int f1160x = -1;

    /* renamed from: y */
    String f1161y;

    /* renamed from: z */
    Bundle f1162z;

    /* renamed from: android.support.v4.c.ad$a */
    static class C0189a {

        /* renamed from: a */
        View f1165a;

        /* renamed from: b */
        int f1166b;

        /* renamed from: c */
        int f1167c;

        /* renamed from: d */
        int f1168d;

        /* renamed from: e */
        int f1169e;

        /* renamed from: f */
        C0357cc f1170f = null;

        /* renamed from: g */
        C0357cc f1171g = null;

        /* renamed from: h */
        boolean f1172h;

        /* renamed from: i */
        C0191c f1173i;

        /* renamed from: j */
        boolean f1174j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public Object f1175k = null;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Object f1176l = C0186ad.f1114n;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Object f1177m = null;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Object f1178n = C0186ad.f1114n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public Object f1179o = null;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Object f1180p = C0186ad.f1114n;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public Boolean f1181q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public Boolean f1182r;

        C0189a() {
        }
    }

    /* renamed from: android.support.v4.c.ad$b */
    public static class C0190b extends RuntimeException {
        public C0190b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: android.support.v4.c.ad$c */
    interface C0191c {
        /* renamed from: a */
        void mo928a();

        /* renamed from: b */
        void mo929b();
    }

    /* renamed from: android.support.v4.c.ad$d */
    public static class C0192d implements Parcelable {
        public static final Parcelable.Creator<C0192d> CREATOR = new Parcelable.Creator<C0192d>() {
            /* renamed from: a */
            public C0192d createFromParcel(Parcel parcel) {
                return new C0192d(parcel, (ClassLoader) null);
            }

            /* renamed from: a */
            public C0192d[] newArray(int i) {
                return new C0192d[i];
            }
        };

        /* renamed from: a */
        final Bundle f1183a;

        C0192d(Bundle bundle) {
            this.f1183a = bundle;
        }

        C0192d(Parcel parcel, ClassLoader classLoader) {
            this.f1183a = parcel.readBundle();
            if (classLoader != null && this.f1183a != null) {
                this.f1183a.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1183a);
        }
    }

    /* renamed from: a */
    public static C0186ad m905a(Context context, String str) {
        return m906a(context, str, (Bundle) null);
    }

    /* renamed from: a */
    public static C0186ad m906a(Context context, String str, @C0003aa Bundle bundle) {
        try {
            Class<?> cls = f1113a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1113a.put(str, cls);
            }
            C0186ad adVar = (C0186ad) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(adVar.getClass().getClassLoader());
                adVar.f1162z = bundle;
            }
            return adVar;
        } catch (ClassNotFoundException e) {
            throw new C0190b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0190b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0190b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo764a() {
        C0191c cVar = null;
        if (this.f1153ag != null) {
            this.f1153ag.f1172h = false;
            C0191c cVar2 = this.f1153ag.f1173i;
            this.f1153ag.f1173i = null;
            cVar = cVar2;
        }
        if (cVar != null) {
            cVar.mo928a();
        }
    }

    /* renamed from: b */
    private C0189a mo772b() {
        if (this.f1153ag == null) {
            this.f1153ag = new C0189a();
        }
        return this.f1153ag;
    }

    /* renamed from: b */
    static boolean m910b(Context context, String str) {
        try {
            Class<?> cls = f1113a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f1113a.put(str, cls);
            }
            return C0186ad.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: A */
    public final boolean mo788A() {
        return this.f1125E;
    }

    /* renamed from: B */
    public final boolean mo789B() {
        return this.f1127G;
    }

    /* renamed from: C */
    public final boolean mo790C() {
        return this.f1157u >= 5;
    }

    /* renamed from: D */
    public final boolean mo791D() {
        return mo923y() && !mo792E() && this.f1146Z != null && this.f1146Z.getWindowToken() != null && this.f1146Z.getVisibility() == 0;
    }

    /* renamed from: E */
    public final boolean mo792E() {
        return this.f1138R;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: F */
    public final boolean mo793F() {
        return this.f1142V;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: G */
    public final boolean mo794G() {
        return this.f1143W;
    }

    /* renamed from: H */
    public final boolean mo795H() {
        return this.f1140T;
    }

    /* renamed from: I */
    public boolean mo796I() {
        return this.f1149ac;
    }

    /* renamed from: J */
    public C0247av mo797J() {
        if (this.f1150ad != null) {
            return this.f1150ad;
        }
        if (this.f1131K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f1152af = true;
        this.f1150ad = this.f1131K.mo1043a(this.f1161y, this.f1151ae, true);
        return this.f1150ad;
    }

    @C0003aa
    /* renamed from: K */
    public View mo798K() {
        return this.f1146Z;
    }

    @C0030i
    /* renamed from: L */
    public void mo799L() {
        this.f1144X = true;
    }

    @C0030i
    /* renamed from: M */
    public void mo800M() {
        this.f1144X = true;
    }

    @C0030i
    /* renamed from: N */
    public void mo801N() {
        this.f1144X = true;
        if (!this.f1152af) {
            this.f1152af = true;
            this.f1150ad = this.f1131K.mo1043a(this.f1161y, this.f1151ae, false);
        }
        if (this.f1150ad != null) {
            this.f1150ad.mo1304h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo802O() {
        this.f1160x = -1;
        this.f1161y = null;
        this.f1124D = false;
        this.f1125E = false;
        this.f1126F = false;
        this.f1127G = false;
        this.f1128H = false;
        this.f1129I = 0;
        this.f1130J = null;
        this.f1132L = null;
        this.f1131K = null;
        this.f1135O = 0;
        this.f1136P = 0;
        this.f1137Q = null;
        this.f1138R = false;
        this.f1139S = false;
        this.f1141U = false;
        this.f1150ad = null;
        this.f1151ae = false;
        this.f1152af = false;
    }

    /* renamed from: P */
    public void mo803P() {
    }

    /* renamed from: Q */
    public Object mo804Q() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1175k;
    }

    /* renamed from: R */
    public Object mo805R() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1176l == f1114n ? mo804Q() : this.f1153ag.f1176l;
    }

    /* renamed from: S */
    public Object mo806S() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1177m;
    }

    /* renamed from: T */
    public Object mo807T() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1178n == f1114n ? mo806S() : this.f1153ag.f1178n;
    }

    /* renamed from: U */
    public Object mo808U() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1179o;
    }

    /* renamed from: V */
    public Object mo809V() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1180p == f1114n ? mo808U() : this.f1153ag.f1180p;
    }

    /* renamed from: W */
    public boolean mo810W() {
        if (this.f1153ag == null || this.f1153ag.f1182r == null) {
            return true;
        }
        return this.f1153ag.f1182r.booleanValue();
    }

    /* renamed from: X */
    public boolean mo811X() {
        if (this.f1153ag == null || this.f1153ag.f1181q == null) {
            return true;
        }
        return this.f1153ag.f1181q.booleanValue();
    }

    /* renamed from: Y */
    public void mo812Y() {
        mo772b().f1172h = true;
    }

    /* renamed from: Z */
    public void mo813Z() {
        if (this.f1130J == null || this.f1130J.f1262u == null) {
            mo772b().f1172h = false;
        } else if (Looper.myLooper() != this.f1130J.f1262u.mo1050j().getLooper()) {
            this.f1130J.f1262u.mo1050j().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    C0186ad.this.mo764a();
                }
            });
        } else {
            mo764a();
        }
    }

    @C0003aa
    /* renamed from: a */
    public View mo814a(LayoutInflater layoutInflater, @C0003aa ViewGroup viewGroup, @C0003aa Bundle bundle) {
        return null;
    }

    /* renamed from: a */
    public Animation mo815a(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: a */
    public final CharSequence mo816a(@C0015aj int i) {
        return mo917t().getText(i);
    }

    /* renamed from: a */
    public final String mo817a(@C0015aj int i, Object... objArr) {
        return mo917t().getString(i, objArr);
    }

    /* renamed from: a */
    public void mo818a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo819a(int i, C0186ad adVar) {
        this.f1160x = i;
        if (adVar != null) {
            this.f1161y = adVar.f1161y + ":" + this.f1160x;
        } else {
            this.f1161y = "android:fragment:" + this.f1160x;
        }
    }

    /* renamed from: a */
    public void mo820a(int i, @C0047z String[] strArr, @C0047z int[] iArr) {
    }

    @C0030i
    @Deprecated
    /* renamed from: a */
    public void mo821a(Activity activity) {
        this.f1144X = true;
    }

    @C0030i
    @Deprecated
    /* renamed from: a */
    public void mo822a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1144X = true;
    }

    @C0030i
    /* renamed from: a */
    public void mo767a(Context context) {
        this.f1144X = true;
        Activity h = this.f1131K == null ? null : this.f1131K.mo1048h();
        if (h != null) {
            this.f1144X = false;
            mo821a(h);
        }
    }

    @C0030i
    /* renamed from: a */
    public void mo823a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1144X = true;
        Activity h = this.f1131K == null ? null : this.f1131K.mo1048h();
        if (h != null) {
            this.f1144X = false;
            mo822a(h, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void mo824a(Intent intent) {
        mo827a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo825a(Intent intent, int i) {
        mo826a(intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo826a(Intent intent, int i, @C0003aa Bundle bundle) {
        if (this.f1131K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f1131K.mo990a(this, intent, i, bundle);
    }

    /* renamed from: a */
    public void mo827a(Intent intent, @C0003aa Bundle bundle) {
        if (this.f1131K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f1131K.mo990a(this, intent, -1, bundle);
    }

    /* renamed from: a */
    public void mo828a(IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.f1131K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f1131K.mo991a(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo829a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f1132L != null) {
            this.f1132L.mo1107a(configuration);
        }
    }

    @C0030i
    /* renamed from: a */
    public void mo768a(@C0003aa Bundle bundle) {
        this.f1144X = true;
        mo891h(bundle);
        if (this.f1132L != null && !this.f1132L.mo1134c(1)) {
            this.f1132L.mo1159p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo830a(C0191c cVar) {
        mo772b();
        if (cVar != this.f1153ag.f1173i) {
            if (cVar == null || this.f1153ag.f1173i == null) {
                if (this.f1153ag.f1172h) {
                    this.f1153ag.f1173i = cVar;
                }
                if (cVar != null) {
                    cVar.mo929b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* renamed from: a */
    public void mo831a(C0192d dVar) {
        if (this.f1160x >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f1158v = (dVar == null || dVar.f1183a == null) ? null : dVar.f1183a;
    }

    /* renamed from: a */
    public void mo832a(C0186ad adVar) {
    }

    /* renamed from: a */
    public void mo833a(C0186ad adVar, int i) {
        this.f1121A = adVar;
        this.f1123C = i;
    }

    /* renamed from: a */
    public void mo834a(C0357cc ccVar) {
        mo772b().f1170f = ccVar;
    }

    /* renamed from: a */
    public void mo835a(Menu menu) {
    }

    /* renamed from: a */
    public void mo836a(Menu menu, MenuInflater menuInflater) {
    }

    /* renamed from: a */
    public void mo837a(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* renamed from: a */
    public void mo838a(View view, @C0003aa Bundle bundle) {
    }

    /* renamed from: a */
    public void mo839a(Object obj) {
        Object unused = mo772b().f1175k = obj;
    }

    /* renamed from: a */
    public void mo840a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1135O));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1136P));
        printWriter.print(" mTag=");
        printWriter.println(this.f1137Q);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1157u);
        printWriter.print(" mIndex=");
        printWriter.print(this.f1160x);
        printWriter.print(" mWho=");
        printWriter.print(this.f1161y);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1129I);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1124D);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1125E);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1126F);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1127G);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1138R);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1139S);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1143W);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1142V);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1140T);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f1141U);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1149ac);
        if (this.f1130J != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1130J);
        }
        if (this.f1131K != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1131K);
        }
        if (this.f1134N != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1134N);
        }
        if (this.f1162z != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1162z);
        }
        if (this.f1158v != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1158v);
        }
        if (this.f1159w != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1159w);
        }
        if (this.f1121A != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f1121A);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1123C);
        }
        if (mo854ak() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo854ak());
        }
        if (this.f1145Y != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1145Y);
        }
        if (this.f1146Z != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1146Z);
        }
        if (this.f1147aa != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f1146Z);
        }
        if (mo859ap() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo859ap());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo860aq());
        }
        if (this.f1150ad != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f1150ad.mo1289a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f1132L != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f1132L + ":");
            this.f1132L.mo1070a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final void mo841a(@C0047z String[] strArr, int i) {
        if (this.f1131K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f1131K.mo992a(this, strArr, i);
    }

    /* renamed from: a */
    public boolean mo842a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: a */
    public boolean mo843a(@C0047z String str) {
        if (this.f1131K != null) {
            return this.f1131K.mo995a(str);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aa */
    public void mo844aa() {
        if (this.f1131K == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f1132L = new C0205aj();
        this.f1132L.mo1114a(this.f1131K, (C0198af) new C0198af() {
            @C0003aa
            /* renamed from: a */
            public View mo926a(int i) {
                if (C0186ad.this.f1146Z != null) {
                    return C0186ad.this.f1146Z.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a view");
            }

            /* renamed from: a */
            public boolean mo927a() {
                return C0186ad.this.f1146Z != null;
            }
        }, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ab */
    public void mo845ab() {
        if (this.f1132L != null) {
            this.f1132L.mo1158o();
            this.f1132L.mo1149j();
        }
        this.f1157u = 4;
        this.f1144X = false;
        mo783h();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.f1132L != null) {
            this.f1132L.mo1161r();
        }
        if (this.f1150ad != null) {
            this.f1150ad.mo1303g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ac */
    public void mo846ac() {
        if (this.f1132L != null) {
            this.f1132L.mo1158o();
            this.f1132L.mo1149j();
        }
        this.f1157u = 5;
        this.f1144X = false;
        mo799L();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.f1132L != null) {
            this.f1132L.mo1162s();
            this.f1132L.mo1149j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ad */
    public void mo847ad() {
        onLowMemory();
        if (this.f1132L != null) {
            this.f1132L.mo1169y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae */
    public void mo848ae() {
        if (this.f1132L != null) {
            this.f1132L.mo1163t();
        }
        this.f1157u = 4;
        this.f1144X = false;
        mo800M();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: af */
    public void mo849af() {
        if (this.f1132L != null) {
            this.f1132L.mo1165u();
        }
        this.f1157u = 3;
        this.f1144X = false;
        mo784i();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ag */
    public void mo850ag() {
        if (this.f1132L != null) {
            this.f1132L.mo1166v();
        }
        this.f1157u = 2;
        if (this.f1151ae) {
            this.f1151ae = false;
            if (!this.f1152af) {
                this.f1152af = true;
                this.f1150ad = this.f1131K.mo1043a(this.f1161y, this.f1151ae, false);
            }
            if (this.f1150ad == null) {
                return;
            }
            if (this.f1131K.mo1053m()) {
                this.f1150ad.mo1300d();
            } else {
                this.f1150ad.mo1299c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ah */
    public void mo851ah() {
        if (this.f1132L != null) {
            this.f1132L.mo1167w();
        }
        this.f1157u = 1;
        this.f1144X = false;
        mo785j();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.f1150ad != null) {
            this.f1150ad.mo1302f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public void mo852ai() {
        if (this.f1132L != null) {
            this.f1132L.mo1168x();
        }
        this.f1157u = 0;
        this.f1144X = false;
        mo801N();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onDestroy()");
        }
        this.f1132L = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aj */
    public void mo853aj() {
        this.f1144X = false;
        mo782g();
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onDetach()");
        } else if (this.f1132L == null) {
        } else {
            if (!this.f1141U) {
                throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
            }
            this.f1132L.mo1168x();
            this.f1132L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ak */
    public int mo854ak() {
        if (this.f1153ag == null) {
            return 0;
        }
        return this.f1153ag.f1167c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: al */
    public int mo855al() {
        if (this.f1153ag == null) {
            return 0;
        }
        return this.f1153ag.f1168d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: am */
    public int mo856am() {
        if (this.f1153ag == null) {
            return 0;
        }
        return this.f1153ag.f1169e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: an */
    public C0357cc mo857an() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1170f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ao */
    public C0357cc mo858ao() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1171g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ap */
    public View mo859ap() {
        if (this.f1153ag == null) {
            return null;
        }
        return this.f1153ag.f1165a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: aq */
    public int mo860aq() {
        if (this.f1153ag == null) {
            return 0;
        }
        return this.f1153ag.f1166b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ar */
    public boolean mo861ar() {
        if (this.f1153ag == null) {
            return false;
        }
        return this.f1153ag.f1172h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: as */
    public boolean mo862as() {
        if (this.f1153ag == null) {
            return false;
        }
        return this.f1153ag.f1174j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0186ad mo863b(String str) {
        if (str.equals(this.f1161y)) {
            return this;
        }
        if (this.f1132L != null) {
            return this.f1132L.mo1120b(str);
        }
        return null;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: b */
    public LayoutInflater mo771b(Bundle bundle) {
        LayoutInflater b = this.f1131K.mo996b();
        mo920v();
        C1172m.m7024a(b, this.f1132L.mo1170z());
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo864b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f1132L != null) {
            this.f1132L.mo1158o();
        }
        return mo814a(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: b */
    public final String mo865b(@C0015aj int i) {
        return mo917t().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo866b(int i, int i2) {
        if (this.f1153ag != null || i != 0 || i2 != 0) {
            mo772b();
            this.f1153ag.f1168d = i;
            this.f1153ag.f1169e = i2;
        }
    }

    /* renamed from: b */
    public void mo867b(C0357cc ccVar) {
        mo772b().f1171g = ccVar;
    }

    /* renamed from: b */
    public void mo868b(Menu menu) {
    }

    /* renamed from: b */
    public void mo869b(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    /* renamed from: b */
    public void mo870b(Object obj) {
        Object unused = mo772b().f1176l = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo871b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1138R) {
            return false;
        }
        if (this.f1142V && this.f1143W) {
            z = true;
            mo836a(menu, menuInflater);
        }
        return this.f1132L != null ? z | this.f1132L.mo1117a(menu, menuInflater) : z;
    }

    /* renamed from: b */
    public boolean mo872b(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo873c(int i) {
        if (this.f1153ag != null || i != 0) {
            mo772b().f1167c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo874c(View view) {
        mo772b().f1165a = view;
    }

    /* renamed from: c */
    public void mo875c(Object obj) {
        Object unused = mo772b().f1177m = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo876c(Menu menu) {
        boolean z = false;
        if (this.f1138R) {
            return false;
        }
        if (this.f1142V && this.f1143W) {
            z = true;
            mo835a(menu);
        }
        return this.f1132L != null ? z | this.f1132L.mo1116a(menu) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo877c(MenuItem menuItem) {
        if (!this.f1138R) {
            if (!this.f1142V || !this.f1143W || !mo842a(menuItem)) {
                return this.f1132L != null && this.f1132L.mo1118a(menuItem);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo878d(int i) {
        mo772b().f1166b = i;
    }

    @C0030i
    /* renamed from: d */
    public void mo778d(@C0003aa Bundle bundle) {
        this.f1144X = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo879d(Menu menu) {
        if (!this.f1138R) {
            if (this.f1142V && this.f1143W) {
                mo868b(menu);
            }
            if (this.f1132L != null) {
                this.f1132L.mo1127b(menu);
            }
        }
    }

    /* renamed from: d */
    public void mo880d(Object obj) {
        Object unused = mo772b().f1178n = obj;
    }

    /* renamed from: d */
    public void mo881d(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo882d(MenuItem menuItem) {
        if (!this.f1138R) {
            if (mo872b(menuItem)) {
                return true;
            }
            return this.f1132L != null && this.f1132L.mo1129b(menuItem);
        }
    }

    /* renamed from: e */
    public void mo779e(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo883e(Object obj) {
        Object unused = mo772b().f1179o = obj;
    }

    /* renamed from: e */
    public void mo884e(boolean z) {
        this.f1140T = z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo886f(Bundle bundle) {
        if (this.f1159w != null) {
            this.f1147aa.restoreHierarchyState(this.f1159w);
            this.f1159w = null;
        }
        this.f1144X = false;
        mo894i(bundle);
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    /* renamed from: f */
    public void mo887f(Object obj) {
        Object unused = mo772b().f1180p = obj;
    }

    /* renamed from: f */
    public void mo888f(boolean z) {
        if (this.f1142V != z) {
            this.f1142V = z;
            if (mo923y() && !mo792E()) {
                this.f1131K.mo999d();
            }
        }
    }

    @C0030i
    /* renamed from: g */
    public void mo782g() {
        this.f1144X = true;
    }

    /* renamed from: g */
    public void mo889g(Bundle bundle) {
        if (this.f1160x >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f1162z = bundle;
    }

    /* renamed from: g */
    public void mo890g(boolean z) {
        if (this.f1143W != z) {
            this.f1143W = z;
            if (this.f1142V && mo923y() && !mo792E()) {
                this.f1131K.mo999d();
            }
        }
    }

    @C0030i
    /* renamed from: h */
    public void mo783h() {
        this.f1144X = true;
        if (!this.f1151ae) {
            this.f1151ae = true;
            if (!this.f1152af) {
                this.f1152af = true;
                this.f1150ad = this.f1131K.mo1043a(this.f1161y, this.f1151ae, false);
            }
            if (this.f1150ad != null) {
                this.f1150ad.mo1298b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo891h(@C0003aa Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.f1132L == null) {
                mo844aa();
            }
            this.f1132L.mo1108a(parcelable, this.f1133M);
            this.f1133M = null;
            this.f1132L.mo1159p();
        }
    }

    /* renamed from: h */
    public void mo892h(boolean z) {
        if (!this.f1149ac && z && this.f1157u < 4 && this.f1130J != null && mo923y()) {
            this.f1130J.mo1121b(this);
        }
        this.f1149ac = z;
        this.f1148ab = this.f1157u < 4 && !z;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @C0030i
    /* renamed from: i */
    public void mo784i() {
        this.f1144X = true;
    }

    @C0030i
    /* renamed from: i */
    public void mo894i(@C0003aa Bundle bundle) {
        this.f1144X = true;
    }

    /* renamed from: i */
    public void mo895i(boolean z) {
    }

    @C0030i
    /* renamed from: j */
    public void mo785j() {
        this.f1144X = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo896j(Bundle bundle) {
        if (this.f1132L != null) {
            this.f1132L.mo1158o();
        }
        this.f1157u = 1;
        this.f1144X = false;
        mo768a(bundle);
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: j */
    public void mo897j(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo898k(Bundle bundle) {
        if (this.f1132L != null) {
            this.f1132L.mo1158o();
        }
        this.f1157u = 2;
        this.f1144X = false;
        mo778d(bundle);
        if (!this.f1144X) {
            throw new C0359cd("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f1132L != null) {
            this.f1132L.mo1160q();
        }
    }

    /* renamed from: k */
    public void mo899k(boolean z) {
        Boolean unused = mo772b().f1182r = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo900k() {
        return this.f1129I > 0;
    }

    /* renamed from: l */
    public final int mo901l() {
        return this.f1135O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo902l(Bundle bundle) {
        Parcelable n;
        mo779e(bundle);
        if (this.f1132L != null && (n = this.f1132L.mo1157n()) != null) {
            bundle.putParcelable("android:support:fragments", n);
        }
    }

    /* renamed from: l */
    public void mo903l(boolean z) {
        Boolean unused = mo772b().f1181q = Boolean.valueOf(z);
    }

    /* renamed from: m */
    public final String mo904m() {
        return this.f1137Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo905m(boolean z) {
        mo895i(z);
        if (this.f1132L != null) {
            this.f1132L.mo1128b(z);
        }
    }

    /* renamed from: n */
    public final Bundle mo906n() {
        return this.f1162z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo907n(boolean z) {
        mo897j(z);
        if (this.f1132L != null) {
            this.f1132L.mo1133c(z);
        }
    }

    /* renamed from: o */
    public final C0186ad mo908o() {
        return this.f1121A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo909o(boolean z) {
        mo772b().f1174j = z;
    }

    @C0030i
    public void onConfigurationChanged(Configuration configuration) {
        this.f1144X = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo915r().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @C0030i
    public void onLowMemory() {
        this.f1144X = true;
    }

    /* renamed from: p */
    public final int mo913p() {
        return this.f1123C;
    }

    /* renamed from: q */
    public Context mo914q() {
        if (this.f1131K == null) {
            return null;
        }
        return this.f1131K.mo1049i();
    }

    /* renamed from: r */
    public final C0194ae mo915r() {
        if (this.f1131K == null) {
            return null;
        }
        return (C0194ae) this.f1131K.mo1048h();
    }

    /* renamed from: s */
    public final Object mo916s() {
        if (this.f1131K == null) {
            return null;
        }
        return this.f1131K.mo1002g();
    }

    /* renamed from: t */
    public final Resources mo917t() {
        if (this.f1131K != null) {
            return this.f1131K.mo1049i().getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0884g.m4428a(this, sb);
        if (this.f1160x >= 0) {
            sb.append(" #");
            sb.append(this.f1160x);
        }
        if (this.f1135O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1135O));
        }
        if (this.f1137Q != null) {
            sb.append(" ");
            sb.append(this.f1137Q);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final C0201ai mo919u() {
        return this.f1130J;
    }

    /* renamed from: v */
    public final C0201ai mo920v() {
        if (this.f1132L == null) {
            mo844aa();
            if (this.f1157u >= 5) {
                this.f1132L.mo1162s();
            } else if (this.f1157u >= 4) {
                this.f1132L.mo1161r();
            } else if (this.f1157u >= 2) {
                this.f1132L.mo1160q();
            } else if (this.f1157u >= 1) {
                this.f1132L.mo1159p();
            }
        }
        return this.f1132L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C0201ai mo921w() {
        return this.f1132L;
    }

    /* renamed from: x */
    public final C0186ad mo922x() {
        return this.f1134N;
    }

    /* renamed from: y */
    public final boolean mo923y() {
        return this.f1131K != null && this.f1124D;
    }

    /* renamed from: z */
    public final boolean mo924z() {
        return this.f1139S;
    }
}
