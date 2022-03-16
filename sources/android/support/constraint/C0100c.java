package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.C0103d;
import android.support.constraint.C0108h;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.constraint.c */
public class C0100c {

    /* renamed from: A */
    private static final int f637A = 1;

    /* renamed from: C */
    private static SparseIntArray f638C = new SparseIntArray();

    /* renamed from: D */
    private static final int f639D = 1;

    /* renamed from: E */
    private static final int f640E = 2;

    /* renamed from: F */
    private static final int f641F = 3;

    /* renamed from: G */
    private static final int f642G = 4;

    /* renamed from: H */
    private static final int f643H = 5;

    /* renamed from: I */
    private static final int f644I = 6;

    /* renamed from: J */
    private static final int f645J = 7;

    /* renamed from: K */
    private static final int f646K = 8;

    /* renamed from: L */
    private static final int f647L = 9;

    /* renamed from: M */
    private static final int f648M = 10;

    /* renamed from: N */
    private static final int f649N = 11;

    /* renamed from: O */
    private static final int f650O = 12;

    /* renamed from: P */
    private static final int f651P = 13;

    /* renamed from: Q */
    private static final int f652Q = 14;

    /* renamed from: R */
    private static final int f653R = 15;

    /* renamed from: S */
    private static final int f654S = 16;

    /* renamed from: T */
    private static final int f655T = 17;

    /* renamed from: U */
    private static final int f656U = 18;

    /* renamed from: V */
    private static final int f657V = 19;

    /* renamed from: W */
    private static final int f658W = 20;

    /* renamed from: X */
    private static final int f659X = 21;

    /* renamed from: Y */
    private static final int f660Y = 22;

    /* renamed from: Z */
    private static final int f661Z = 23;

    /* renamed from: a */
    public static final int f662a = -1;

    /* renamed from: aA */
    private static final int f663aA = 50;

    /* renamed from: aB */
    private static final int f664aB = 51;

    /* renamed from: aC */
    private static final int f665aC = 52;

    /* renamed from: aD */
    private static final int f666aD = 53;

    /* renamed from: aE */
    private static final int f667aE = 54;

    /* renamed from: aF */
    private static final int f668aF = 55;

    /* renamed from: aG */
    private static final int f669aG = 56;

    /* renamed from: aH */
    private static final int f670aH = 57;

    /* renamed from: aI */
    private static final int f671aI = 58;

    /* renamed from: aJ */
    private static final int f672aJ = 59;

    /* renamed from: aK */
    private static final int f673aK = 60;

    /* renamed from: aL */
    private static final int f674aL = 61;

    /* renamed from: aM */
    private static final int f675aM = 62;

    /* renamed from: aN */
    private static final int f676aN = 63;

    /* renamed from: aO */
    private static final int f677aO = 69;

    /* renamed from: aP */
    private static final int f678aP = 70;

    /* renamed from: aQ */
    private static final int f679aQ = 71;

    /* renamed from: aR */
    private static final int f680aR = 72;

    /* renamed from: aS */
    private static final int f681aS = 73;

    /* renamed from: aT */
    private static final int f682aT = 74;

    /* renamed from: aU */
    private static final int f683aU = 75;

    /* renamed from: aa */
    private static final int f684aa = 24;

    /* renamed from: ab */
    private static final int f685ab = 25;

    /* renamed from: ac */
    private static final int f686ac = 26;

    /* renamed from: ad */
    private static final int f687ad = 27;

    /* renamed from: ae */
    private static final int f688ae = 28;

    /* renamed from: af */
    private static final int f689af = 29;

    /* renamed from: ag */
    private static final int f690ag = 30;

    /* renamed from: ah */
    private static final int f691ah = 31;

    /* renamed from: ai */
    private static final int f692ai = 32;

    /* renamed from: aj */
    private static final int f693aj = 33;

    /* renamed from: ak */
    private static final int f694ak = 34;

    /* renamed from: al */
    private static final int f695al = 35;

    /* renamed from: am */
    private static final int f696am = 36;

    /* renamed from: an */
    private static final int f697an = 37;

    /* renamed from: ao */
    private static final int f698ao = 38;

    /* renamed from: ap */
    private static final int f699ap = 39;

    /* renamed from: aq */
    private static final int f700aq = 40;

    /* renamed from: ar */
    private static final int f701ar = 41;

    /* renamed from: as */
    private static final int f702as = 42;

    /* renamed from: at */
    private static final int f703at = 43;

    /* renamed from: au */
    private static final int f704au = 44;

    /* renamed from: av */
    private static final int f705av = 45;

    /* renamed from: aw */
    private static final int f706aw = 46;

    /* renamed from: ax */
    private static final int f707ax = 47;

    /* renamed from: ay */
    private static final int f708ay = 48;

    /* renamed from: az */
    private static final int f709az = 49;

    /* renamed from: b */
    public static final int f710b = 0;

    /* renamed from: c */
    public static final int f711c = -2;

    /* renamed from: d */
    public static final int f712d = 1;

    /* renamed from: e */
    public static final int f713e = 0;

    /* renamed from: f */
    public static final int f714f = 0;

    /* renamed from: g */
    public static final int f715g = 0;

    /* renamed from: h */
    public static final int f716h = 1;

    /* renamed from: i */
    public static final int f717i = 0;

    /* renamed from: j */
    public static final int f718j = 1;

    /* renamed from: k */
    public static final int f719k = 0;

    /* renamed from: l */
    public static final int f720l = 4;

    /* renamed from: m */
    public static final int f721m = 8;

    /* renamed from: n */
    public static final int f722n = 1;

    /* renamed from: o */
    public static final int f723o = 2;

    /* renamed from: p */
    public static final int f724p = 3;

    /* renamed from: q */
    public static final int f725q = 4;

    /* renamed from: r */
    public static final int f726r = 5;

    /* renamed from: s */
    public static final int f727s = 6;

    /* renamed from: t */
    public static final int f728t = 7;

    /* renamed from: u */
    public static final int f729u = 0;

    /* renamed from: v */
    public static final int f730v = 1;

    /* renamed from: w */
    public static final int f731w = 2;

    /* renamed from: x */
    private static final String f732x = "ConstraintSet";

    /* renamed from: y */
    private static final boolean f733y = false;

    /* renamed from: z */
    private static final int[] f734z = {0, 4, 8};

    /* renamed from: B */
    private HashMap<Integer, C0102a> f735B = new HashMap<>();

    /* renamed from: android.support.constraint.c$a */
    private static class C0102a {

        /* renamed from: e */
        static final int f736e = -1;

        /* renamed from: A */
        public float f737A;

        /* renamed from: B */
        public int f738B;

        /* renamed from: C */
        public int f739C;

        /* renamed from: D */
        public int f740D;

        /* renamed from: E */
        public int f741E;

        /* renamed from: F */
        public int f742F;

        /* renamed from: G */
        public int f743G;

        /* renamed from: H */
        public int f744H;

        /* renamed from: I */
        public int f745I;

        /* renamed from: J */
        public int f746J;

        /* renamed from: K */
        public int f747K;

        /* renamed from: L */
        public int f748L;

        /* renamed from: M */
        public int f749M;

        /* renamed from: N */
        public int f750N;

        /* renamed from: O */
        public int f751O;

        /* renamed from: P */
        public int f752P;

        /* renamed from: Q */
        public int f753Q;

        /* renamed from: R */
        public float f754R;

        /* renamed from: S */
        public float f755S;

        /* renamed from: T */
        public int f756T;

        /* renamed from: U */
        public int f757U;

        /* renamed from: V */
        public float f758V;

        /* renamed from: W */
        public boolean f759W;

        /* renamed from: X */
        public float f760X;

        /* renamed from: Y */
        public float f761Y;

        /* renamed from: Z */
        public float f762Z;

        /* renamed from: a */
        boolean f763a;

        /* renamed from: aa */
        public float f764aa;

        /* renamed from: ab */
        public float f765ab;

        /* renamed from: ac */
        public float f766ac;

        /* renamed from: ad */
        public float f767ad;

        /* renamed from: ae */
        public float f768ae;

        /* renamed from: af */
        public float f769af;

        /* renamed from: ag */
        public float f770ag;

        /* renamed from: ah */
        public float f771ah;

        /* renamed from: ai */
        public boolean f772ai;

        /* renamed from: aj */
        public boolean f773aj;

        /* renamed from: ak */
        public int f774ak;

        /* renamed from: al */
        public int f775al;

        /* renamed from: am */
        public int f776am;

        /* renamed from: an */
        public int f777an;

        /* renamed from: ao */
        public int f778ao;

        /* renamed from: ap */
        public int f779ap;

        /* renamed from: aq */
        public float f780aq;

        /* renamed from: ar */
        public float f781ar;

        /* renamed from: as */
        public boolean f782as;

        /* renamed from: at */
        public int f783at;

        /* renamed from: au */
        public int f784au;

        /* renamed from: av */
        public int[] f785av;

        /* renamed from: aw */
        public String f786aw;

        /* renamed from: b */
        public int f787b;

        /* renamed from: c */
        public int f788c;

        /* renamed from: d */
        int f789d;

        /* renamed from: f */
        public int f790f;

        /* renamed from: g */
        public int f791g;

        /* renamed from: h */
        public float f792h;

        /* renamed from: i */
        public int f793i;

        /* renamed from: j */
        public int f794j;

        /* renamed from: k */
        public int f795k;

        /* renamed from: l */
        public int f796l;

        /* renamed from: m */
        public int f797m;

        /* renamed from: n */
        public int f798n;

        /* renamed from: o */
        public int f799o;

        /* renamed from: p */
        public int f800p;

        /* renamed from: q */
        public int f801q;

        /* renamed from: r */
        public int f802r;

        /* renamed from: s */
        public int f803s;

        /* renamed from: t */
        public int f804t;

        /* renamed from: u */
        public int f805u;

        /* renamed from: v */
        public float f806v;

        /* renamed from: w */
        public float f807w;

        /* renamed from: x */
        public String f808x;

        /* renamed from: y */
        public int f809y;

        /* renamed from: z */
        public int f810z;

        private C0102a() {
            this.f763a = false;
            this.f790f = -1;
            this.f791g = -1;
            this.f792h = -1.0f;
            this.f793i = -1;
            this.f794j = -1;
            this.f795k = -1;
            this.f796l = -1;
            this.f797m = -1;
            this.f798n = -1;
            this.f799o = -1;
            this.f800p = -1;
            this.f801q = -1;
            this.f802r = -1;
            this.f803s = -1;
            this.f804t = -1;
            this.f805u = -1;
            this.f806v = 0.5f;
            this.f807w = 0.5f;
            this.f808x = null;
            this.f809y = -1;
            this.f810z = 0;
            this.f737A = 0.0f;
            this.f738B = -1;
            this.f739C = -1;
            this.f740D = -1;
            this.f741E = -1;
            this.f742F = -1;
            this.f743G = -1;
            this.f744H = -1;
            this.f745I = -1;
            this.f746J = -1;
            this.f747K = 0;
            this.f748L = -1;
            this.f749M = -1;
            this.f750N = -1;
            this.f751O = -1;
            this.f752P = -1;
            this.f753Q = -1;
            this.f754R = 0.0f;
            this.f755S = 0.0f;
            this.f756T = 0;
            this.f757U = 0;
            this.f758V = 1.0f;
            this.f759W = false;
            this.f760X = 0.0f;
            this.f761Y = 0.0f;
            this.f762Z = 0.0f;
            this.f764aa = 0.0f;
            this.f765ab = 1.0f;
            this.f766ac = 1.0f;
            this.f767ad = Float.NaN;
            this.f768ae = Float.NaN;
            this.f769af = 0.0f;
            this.f770ag = 0.0f;
            this.f771ah = 0.0f;
            this.f772ai = false;
            this.f773aj = false;
            this.f774ak = 0;
            this.f775al = 0;
            this.f776am = -1;
            this.f777an = -1;
            this.f778ao = -1;
            this.f779ap = -1;
            this.f780aq = 1.0f;
            this.f781ar = 1.0f;
            this.f782as = false;
            this.f783at = -1;
            this.f784au = -1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m613a(int i, ConstraintLayout.C0052a aVar) {
            this.f789d = i;
            this.f793i = aVar.f136v;
            this.f794j = aVar.f137w;
            this.f795k = aVar.f138x;
            this.f796l = aVar.f139y;
            this.f797m = aVar.f140z;
            this.f798n = aVar.f76A;
            this.f799o = aVar.f77B;
            this.f800p = aVar.f78C;
            this.f801q = aVar.f79D;
            this.f802r = aVar.f83H;
            this.f803s = aVar.f84I;
            this.f804t = aVar.f85J;
            this.f805u = aVar.f86K;
            this.f806v = aVar.f93R;
            this.f807w = aVar.f94S;
            this.f808x = aVar.f95T;
            this.f809y = aVar.f80E;
            this.f810z = aVar.f81F;
            this.f737A = aVar.f82G;
            this.f738B = aVar.f115ai;
            this.f739C = aVar.f116aj;
            this.f740D = aVar.f117ak;
            this.f792h = aVar.f135u;
            this.f790f = aVar.f133s;
            this.f791g = aVar.f134t;
            this.f787b = aVar.width;
            this.f788c = aVar.height;
            this.f741E = aVar.leftMargin;
            this.f742F = aVar.rightMargin;
            this.f743G = aVar.topMargin;
            this.f744H = aVar.bottomMargin;
            this.f754R = aVar.f99X;
            this.f755S = aVar.f98W;
            this.f757U = aVar.f101Z;
            this.f756T = aVar.f100Y;
            this.f772ai = aVar.f118al;
            this.f773aj = aVar.f119am;
            this.f774ak = aVar.f107aa;
            this.f775al = aVar.f108ab;
            this.f772ai = aVar.f118al;
            this.f776am = aVar.f111ae;
            this.f777an = aVar.f112af;
            this.f778ao = aVar.f109ac;
            this.f779ap = aVar.f110ad;
            this.f780aq = aVar.f113ag;
            this.f781ar = aVar.f114ah;
            if (Build.VERSION.SDK_INT >= 17) {
                this.f745I = aVar.getMarginEnd();
                this.f746J = aVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m614a(int i, C0103d.C0104a aVar) {
            m613a(i, (ConstraintLayout.C0052a) aVar);
            this.f758V = aVar.f813aF;
            this.f761Y = aVar.f816aI;
            this.f762Z = aVar.f817aJ;
            this.f764aa = aVar.f818aK;
            this.f765ab = aVar.f819aL;
            this.f766ac = aVar.f820aM;
            this.f767ad = aVar.f821aN;
            this.f768ae = aVar.f822aO;
            this.f769af = aVar.f823aP;
            this.f770ag = aVar.f824aQ;
            this.f771ah = aVar.f825aR;
            this.f760X = aVar.f815aH;
            this.f759W = aVar.f814aG;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m615a(C0099b bVar, int i, C0103d.C0104a aVar) {
            m614a(i, aVar);
            if (bVar instanceof C0054a) {
                this.f784au = 1;
                C0054a aVar2 = (C0054a) bVar;
                this.f783at = aVar2.getType();
                this.f785av = aVar2.getReferencedIds();
            }
        }

        /* renamed from: a */
        public C0102a clone() {
            C0102a aVar = new C0102a();
            aVar.f763a = this.f763a;
            aVar.f787b = this.f787b;
            aVar.f788c = this.f788c;
            aVar.f790f = this.f790f;
            aVar.f791g = this.f791g;
            aVar.f792h = this.f792h;
            aVar.f793i = this.f793i;
            aVar.f794j = this.f794j;
            aVar.f795k = this.f795k;
            aVar.f796l = this.f796l;
            aVar.f797m = this.f797m;
            aVar.f798n = this.f798n;
            aVar.f799o = this.f799o;
            aVar.f800p = this.f800p;
            aVar.f801q = this.f801q;
            aVar.f802r = this.f802r;
            aVar.f803s = this.f803s;
            aVar.f804t = this.f804t;
            aVar.f805u = this.f805u;
            aVar.f806v = this.f806v;
            aVar.f807w = this.f807w;
            aVar.f808x = this.f808x;
            aVar.f738B = this.f738B;
            aVar.f739C = this.f739C;
            aVar.f806v = this.f806v;
            aVar.f806v = this.f806v;
            aVar.f806v = this.f806v;
            aVar.f806v = this.f806v;
            aVar.f806v = this.f806v;
            aVar.f740D = this.f740D;
            aVar.f741E = this.f741E;
            aVar.f742F = this.f742F;
            aVar.f743G = this.f743G;
            aVar.f744H = this.f744H;
            aVar.f745I = this.f745I;
            aVar.f746J = this.f746J;
            aVar.f747K = this.f747K;
            aVar.f748L = this.f748L;
            aVar.f749M = this.f749M;
            aVar.f750N = this.f750N;
            aVar.f751O = this.f751O;
            aVar.f752P = this.f752P;
            aVar.f753Q = this.f753Q;
            aVar.f754R = this.f754R;
            aVar.f755S = this.f755S;
            aVar.f756T = this.f756T;
            aVar.f757U = this.f757U;
            aVar.f758V = this.f758V;
            aVar.f759W = this.f759W;
            aVar.f760X = this.f760X;
            aVar.f761Y = this.f761Y;
            aVar.f762Z = this.f762Z;
            aVar.f764aa = this.f764aa;
            aVar.f765ab = this.f765ab;
            aVar.f766ac = this.f766ac;
            aVar.f767ad = this.f767ad;
            aVar.f768ae = this.f768ae;
            aVar.f769af = this.f769af;
            aVar.f770ag = this.f770ag;
            aVar.f771ah = this.f771ah;
            aVar.f772ai = this.f772ai;
            aVar.f773aj = this.f773aj;
            aVar.f774ak = this.f774ak;
            aVar.f775al = this.f775al;
            aVar.f776am = this.f776am;
            aVar.f777an = this.f777an;
            aVar.f778ao = this.f778ao;
            aVar.f779ap = this.f779ap;
            aVar.f780aq = this.f780aq;
            aVar.f781ar = this.f781ar;
            aVar.f783at = this.f783at;
            aVar.f784au = this.f784au;
            if (this.f785av != null) {
                aVar.f785av = Arrays.copyOf(this.f785av, this.f785av.length);
            }
            aVar.f809y = this.f809y;
            aVar.f810z = this.f810z;
            aVar.f737A = this.f737A;
            aVar.f782as = this.f782as;
            return aVar;
        }

        /* renamed from: a */
        public void mo532a(ConstraintLayout.C0052a aVar) {
            aVar.f136v = this.f793i;
            aVar.f137w = this.f794j;
            aVar.f138x = this.f795k;
            aVar.f139y = this.f796l;
            aVar.f140z = this.f797m;
            aVar.f76A = this.f798n;
            aVar.f77B = this.f799o;
            aVar.f78C = this.f800p;
            aVar.f79D = this.f801q;
            aVar.f83H = this.f802r;
            aVar.f84I = this.f803s;
            aVar.f85J = this.f804t;
            aVar.f86K = this.f805u;
            aVar.leftMargin = this.f741E;
            aVar.rightMargin = this.f742F;
            aVar.topMargin = this.f743G;
            aVar.bottomMargin = this.f744H;
            aVar.f91P = this.f753Q;
            aVar.f92Q = this.f752P;
            aVar.f93R = this.f806v;
            aVar.f94S = this.f807w;
            aVar.f80E = this.f809y;
            aVar.f81F = this.f810z;
            aVar.f82G = this.f737A;
            aVar.f95T = this.f808x;
            aVar.f115ai = this.f738B;
            aVar.f116aj = this.f739C;
            aVar.f99X = this.f754R;
            aVar.f98W = this.f755S;
            aVar.f101Z = this.f757U;
            aVar.f100Y = this.f756T;
            aVar.f118al = this.f772ai;
            aVar.f119am = this.f773aj;
            aVar.f107aa = this.f774ak;
            aVar.f108ab = this.f775al;
            aVar.f111ae = this.f776am;
            aVar.f112af = this.f777an;
            aVar.f109ac = this.f778ao;
            aVar.f110ad = this.f779ap;
            aVar.f113ag = this.f780aq;
            aVar.f114ah = this.f781ar;
            aVar.f117ak = this.f740D;
            aVar.f135u = this.f792h;
            aVar.f133s = this.f790f;
            aVar.f134t = this.f791g;
            aVar.width = this.f787b;
            aVar.height = this.f788c;
            if (Build.VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.f746J);
                aVar.setMarginEnd(this.f745I);
            }
            aVar.mo60b();
        }
    }

    static {
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_editor_absoluteX, 6);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_editor_absoluteY, 7);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintGuide_begin, 17);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintGuide_end, 18);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintGuide_percent, 19);
        f638C.append(C0108h.C0111c.ConstraintSet_android_orientation, 27);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_goneMarginLeft, 13);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_goneMarginTop, 16);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_goneMarginRight, 14);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_goneMarginBottom, 11);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_goneMarginStart, 15);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_goneMarginEnd, 12);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintVertical_weight, 40);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintVertical_bias, 37);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintDimensionRatio, 5);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintLeft_creator, 75);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintTop_creator, 75);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintRight_creator, 75);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintBottom_creator, 75);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintBaseline_creator, 75);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_marginLeft, 24);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_marginRight, 28);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_marginStart, 31);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_marginEnd, 8);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_marginTop, 34);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_marginBottom, 2);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_width, 23);
        f638C.append(C0108h.C0111c.ConstraintSet_android_layout_height, 21);
        f638C.append(C0108h.C0111c.ConstraintSet_android_visibility, 22);
        f638C.append(C0108h.C0111c.ConstraintSet_android_alpha, 43);
        f638C.append(C0108h.C0111c.ConstraintSet_android_elevation, 44);
        f638C.append(C0108h.C0111c.ConstraintSet_android_rotationX, 45);
        f638C.append(C0108h.C0111c.ConstraintSet_android_rotationY, 46);
        f638C.append(C0108h.C0111c.ConstraintSet_android_rotation, 60);
        f638C.append(C0108h.C0111c.ConstraintSet_android_scaleX, 47);
        f638C.append(C0108h.C0111c.ConstraintSet_android_scaleY, 48);
        f638C.append(C0108h.C0111c.ConstraintSet_android_transformPivotX, 49);
        f638C.append(C0108h.C0111c.ConstraintSet_android_transformPivotY, 50);
        f638C.append(C0108h.C0111c.ConstraintSet_android_translationX, 51);
        f638C.append(C0108h.C0111c.ConstraintSet_android_translationY, 52);
        f638C.append(C0108h.C0111c.ConstraintSet_android_translationZ, 53);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintWidth_default, 54);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHeight_default, 55);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintWidth_max, 56);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHeight_max, 57);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintWidth_min, 58);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHeight_min, 59);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintCircle, 61);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintCircleRadius, 62);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintCircleAngle, 63);
        f638C.append(C0108h.C0111c.ConstraintSet_android_id, 38);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintWidth_percent, 69);
        f638C.append(C0108h.C0111c.ConstraintSet_layout_constraintHeight_percent, 70);
        f638C.append(C0108h.C0111c.ConstraintSet_chainUseRtl, 71);
        f638C.append(C0108h.C0111c.ConstraintSet_barrierDirection, 72);
        f638C.append(C0108h.C0111c.ConstraintSet_constraint_referenced_ids, 73);
        f638C.append(C0108h.C0111c.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: a */
    private static int m536a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    private C0102a m537a(Context context, AttributeSet attributeSet) {
        C0102a aVar = new C0102a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintSet);
        m539a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    private void m538a(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr == null || fArr.length == iArr.length) {
            if (fArr != null) {
                m541f(iArr[0]).f755S = fArr[0];
            }
            m541f(iArr[0]).f756T = i5;
            mo468a(iArr[0], i6, i, i2, -1);
            int i8 = 1;
            while (true) {
                int i9 = i8;
                if (i9 < iArr.length) {
                    int i10 = iArr[i9];
                    mo468a(iArr[i9], i6, iArr[i9 - 1], i7, -1);
                    mo468a(iArr[i9 - 1], i7, iArr[i9], i6, -1);
                    if (fArr != null) {
                        m541f(iArr[i9]).f755S = fArr[i9];
                    }
                    i8 = i9 + 1;
                } else {
                    mo468a(iArr[iArr.length - 1], i7, i3, i4, -1);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: a */
    private void m539a(C0102a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f638C.get(index)) {
                case 1:
                    aVar.f801q = m536a(typedArray, index, aVar.f801q);
                    break;
                case 2:
                    aVar.f744H = typedArray.getDimensionPixelSize(index, aVar.f744H);
                    break;
                case 3:
                    aVar.f800p = m536a(typedArray, index, aVar.f800p);
                    break;
                case 4:
                    aVar.f799o = m536a(typedArray, index, aVar.f799o);
                    break;
                case 5:
                    aVar.f808x = typedArray.getString(index);
                    break;
                case 6:
                    aVar.f738B = typedArray.getDimensionPixelOffset(index, aVar.f738B);
                    break;
                case 7:
                    aVar.f739C = typedArray.getDimensionPixelOffset(index, aVar.f739C);
                    break;
                case 8:
                    aVar.f745I = typedArray.getDimensionPixelSize(index, aVar.f745I);
                    break;
                case 9:
                    aVar.f805u = m536a(typedArray, index, aVar.f805u);
                    break;
                case 10:
                    aVar.f804t = m536a(typedArray, index, aVar.f804t);
                    break;
                case 11:
                    aVar.f751O = typedArray.getDimensionPixelSize(index, aVar.f751O);
                    break;
                case 12:
                    aVar.f752P = typedArray.getDimensionPixelSize(index, aVar.f752P);
                    break;
                case 13:
                    aVar.f748L = typedArray.getDimensionPixelSize(index, aVar.f748L);
                    break;
                case 14:
                    aVar.f750N = typedArray.getDimensionPixelSize(index, aVar.f750N);
                    break;
                case 15:
                    aVar.f753Q = typedArray.getDimensionPixelSize(index, aVar.f753Q);
                    break;
                case 16:
                    aVar.f749M = typedArray.getDimensionPixelSize(index, aVar.f749M);
                    break;
                case 17:
                    aVar.f790f = typedArray.getDimensionPixelOffset(index, aVar.f790f);
                    break;
                case 18:
                    aVar.f791g = typedArray.getDimensionPixelOffset(index, aVar.f791g);
                    break;
                case 19:
                    aVar.f792h = typedArray.getFloat(index, aVar.f792h);
                    break;
                case 20:
                    aVar.f806v = typedArray.getFloat(index, aVar.f806v);
                    break;
                case 21:
                    aVar.f788c = typedArray.getLayoutDimension(index, aVar.f788c);
                    break;
                case 22:
                    aVar.f747K = typedArray.getInt(index, aVar.f747K);
                    aVar.f747K = f734z[aVar.f747K];
                    break;
                case 23:
                    aVar.f787b = typedArray.getLayoutDimension(index, aVar.f787b);
                    break;
                case 24:
                    aVar.f741E = typedArray.getDimensionPixelSize(index, aVar.f741E);
                    break;
                case 25:
                    aVar.f793i = m536a(typedArray, index, aVar.f793i);
                    break;
                case 26:
                    aVar.f794j = m536a(typedArray, index, aVar.f794j);
                    break;
                case 27:
                    aVar.f740D = typedArray.getInt(index, aVar.f740D);
                    break;
                case 28:
                    aVar.f742F = typedArray.getDimensionPixelSize(index, aVar.f742F);
                    break;
                case 29:
                    aVar.f795k = m536a(typedArray, index, aVar.f795k);
                    break;
                case 30:
                    aVar.f796l = m536a(typedArray, index, aVar.f796l);
                    break;
                case 31:
                    aVar.f746J = typedArray.getDimensionPixelSize(index, aVar.f746J);
                    break;
                case 32:
                    aVar.f802r = m536a(typedArray, index, aVar.f802r);
                    break;
                case 33:
                    aVar.f803s = m536a(typedArray, index, aVar.f803s);
                    break;
                case 34:
                    aVar.f743G = typedArray.getDimensionPixelSize(index, aVar.f743G);
                    break;
                case 35:
                    aVar.f798n = m536a(typedArray, index, aVar.f798n);
                    break;
                case 36:
                    aVar.f797m = m536a(typedArray, index, aVar.f797m);
                    break;
                case 37:
                    aVar.f807w = typedArray.getFloat(index, aVar.f807w);
                    break;
                case 38:
                    aVar.f789d = typedArray.getResourceId(index, aVar.f789d);
                    break;
                case 39:
                    aVar.f755S = typedArray.getFloat(index, aVar.f755S);
                    break;
                case 40:
                    aVar.f754R = typedArray.getFloat(index, aVar.f754R);
                    break;
                case 41:
                    aVar.f756T = typedArray.getInt(index, aVar.f756T);
                    break;
                case 42:
                    aVar.f757U = typedArray.getInt(index, aVar.f757U);
                    break;
                case 43:
                    aVar.f758V = typedArray.getFloat(index, aVar.f758V);
                    break;
                case 44:
                    aVar.f759W = true;
                    aVar.f760X = typedArray.getDimension(index, aVar.f760X);
                    break;
                case 45:
                    aVar.f762Z = typedArray.getFloat(index, aVar.f762Z);
                    break;
                case 46:
                    aVar.f764aa = typedArray.getFloat(index, aVar.f764aa);
                    break;
                case 47:
                    aVar.f765ab = typedArray.getFloat(index, aVar.f765ab);
                    break;
                case 48:
                    aVar.f766ac = typedArray.getFloat(index, aVar.f766ac);
                    break;
                case 49:
                    aVar.f767ad = typedArray.getFloat(index, aVar.f767ad);
                    break;
                case 50:
                    aVar.f768ae = typedArray.getFloat(index, aVar.f768ae);
                    break;
                case 51:
                    aVar.f769af = typedArray.getDimension(index, aVar.f769af);
                    break;
                case 52:
                    aVar.f770ag = typedArray.getDimension(index, aVar.f770ag);
                    break;
                case 53:
                    aVar.f771ah = typedArray.getDimension(index, aVar.f771ah);
                    break;
                case 60:
                    aVar.f761Y = typedArray.getFloat(index, aVar.f761Y);
                    break;
                case 61:
                    aVar.f809y = m536a(typedArray, index, aVar.f809y);
                    break;
                case 62:
                    aVar.f810z = typedArray.getDimensionPixelSize(index, aVar.f810z);
                    break;
                case 63:
                    aVar.f737A = typedArray.getFloat(index, aVar.f737A);
                    break;
                case 69:
                    aVar.f780aq = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f781ar = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(f732x, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar.f783at = typedArray.getInt(index, aVar.f783at);
                    break;
                case 73:
                    aVar.f786aw = typedArray.getString(index);
                    break;
                case 74:
                    aVar.f782as = typedArray.getBoolean(index, aVar.f782as);
                    break;
                case 75:
                    Log.w(f732x, "unused attribute 0x" + Integer.toHexString(index) + "   " + f638C.get(index));
                    break;
                default:
                    Log.w(f732x, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f638C.get(index));
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r0 = ((android.support.constraint.ConstraintLayout) r11.getParent()).mo30a(0, (java.lang.Object) r8);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m540a(android.view.View r11, java.lang.String r12) {
        /*
            r10 = this;
            r2 = 0
            java.lang.String r0 = ","
            java.lang.String[] r6 = r12.split(r0)
            android.content.Context r7 = r11.getContext()
            int r0 = r6.length
            int[] r5 = new int[r0]
            r1 = r2
            r3 = r2
        L_0x0010:
            int r0 = r6.length
            if (r1 >= r0) goto L_0x0066
            r0 = r6[r1]
            java.lang.String r8 = r0.trim()
            java.lang.Class<android.support.constraint.h$b> r0 = android.support.constraint.C0108h.C0110b.class
            java.lang.reflect.Field r0 = r0.getField(r8)     // Catch:{ Exception -> 0x0063 }
            r4 = 0
            int r4 = r0.getInt(r4)     // Catch:{ Exception -> 0x0063 }
        L_0x0024:
            if (r4 != 0) goto L_0x0034
            android.content.res.Resources r0 = r7.getResources()
            java.lang.String r4 = "id"
            java.lang.String r9 = r7.getPackageName()
            int r4 = r0.getIdentifier(r8, r4, r9)
        L_0x0034:
            if (r4 != 0) goto L_0x0070
            boolean r0 = r11.isInEditMode()
            if (r0 == 0) goto L_0x0070
            android.view.ViewParent r0 = r11.getParent()
            boolean r0 = r0 instanceof android.support.constraint.ConstraintLayout
            if (r0 == 0) goto L_0x0070
            android.view.ViewParent r0 = r11.getParent()
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            java.lang.Object r0 = r0.mo30a((int) r2, (java.lang.Object) r8)
            if (r0 == 0) goto L_0x0070
            boolean r8 = r0 instanceof java.lang.Integer
            if (r8 == 0) goto L_0x0070
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x005a:
            int r4 = r3 + 1
            r5[r3] = r0
            int r0 = r1 + 1
            r1 = r0
            r3 = r4
            goto L_0x0010
        L_0x0063:
            r0 = move-exception
            r4 = r2
            goto L_0x0024
        L_0x0066:
            int r0 = r6.length
            if (r3 == r0) goto L_0x006e
            int[] r0 = java.util.Arrays.copyOf(r5, r3)
        L_0x006d:
            return r0
        L_0x006e:
            r0 = r5
            goto L_0x006d
        L_0x0070:
            r0 = r4
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.C0100c.m540a(android.view.View, java.lang.String):int[]");
    }

    /* renamed from: f */
    private C0102a m541f(int i) {
        if (!this.f735B.containsKey(Integer.valueOf(i))) {
            this.f735B.put(Integer.valueOf(i), new C0102a());
        }
        return this.f735B.get(Integer.valueOf(i));
    }

    /* renamed from: g */
    private String m542g(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: a */
    public C0102a mo461a(int i) {
        return m541f(i);
    }

    /* renamed from: a */
    public void mo462a(int i, float f) {
        m541f(i).f806v = f;
    }

    /* renamed from: a */
    public void mo463a(int i, float f, float f2) {
        C0102a f3 = m541f(i);
        f3.f768ae = f2;
        f3.f767ad = f;
    }

    /* renamed from: a */
    public void mo464a(int i, int i2) {
        if (i2 == 0) {
            mo469a(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            mo469a(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    /* renamed from: a */
    public void mo465a(int i, int i2, int i3) {
        C0102a f = m541f(i);
        switch (i2) {
            case 1:
                f.f741E = i3;
                return;
            case 2:
                f.f742F = i3;
                return;
            case 3:
                f.f743G = i3;
                return;
            case 4:
                f.f744H = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                f.f746J = i3;
                return;
            case 7:
                f.f745I = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: a */
    public void mo466a(int i, int i2, int i3, float f) {
        C0102a f2 = m541f(i);
        f2.f809y = i2;
        f2.f810z = i3;
        f2.f737A = f;
    }

    /* renamed from: a */
    public void mo467a(int i, int i2, int i3, int i4) {
        if (!this.f735B.containsKey(Integer.valueOf(i))) {
            this.f735B.put(Integer.valueOf(i), new C0102a());
        }
        C0102a aVar = this.f735B.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f793i = i3;
                    aVar.f794j = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f794j = i3;
                    aVar.f793i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m542g(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    aVar.f795k = i3;
                    aVar.f796l = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f796l = i3;
                    aVar.f795k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    aVar.f797m = i3;
                    aVar.f798n = -1;
                    aVar.f801q = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.f798n = i3;
                    aVar.f797m = -1;
                    aVar.f801q = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    aVar.f800p = i3;
                    aVar.f799o = -1;
                    aVar.f801q = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.f799o = i3;
                    aVar.f800p = -1;
                    aVar.f801q = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    aVar.f801q = i3;
                    aVar.f800p = -1;
                    aVar.f799o = -1;
                    aVar.f797m = -1;
                    aVar.f798n = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    aVar.f803s = i3;
                    aVar.f802r = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.f802r = i3;
                    aVar.f803s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    aVar.f805u = i3;
                    aVar.f804t = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.f804t = i3;
                    aVar.f805u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m542g(i2) + " to " + m542g(i4) + " unknown");
        }
    }

    /* renamed from: a */
    public void mo468a(int i, int i2, int i3, int i4, int i5) {
        if (!this.f735B.containsKey(Integer.valueOf(i))) {
            this.f735B.put(Integer.valueOf(i), new C0102a());
        }
        C0102a aVar = this.f735B.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f793i = i3;
                    aVar.f794j = -1;
                } else if (i4 == 2) {
                    aVar.f794j = i3;
                    aVar.f793i = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + m542g(i4) + " undefined");
                }
                aVar.f741E = i5;
                return;
            case 2:
                if (i4 == 1) {
                    aVar.f795k = i3;
                    aVar.f796l = -1;
                } else if (i4 == 2) {
                    aVar.f796l = i3;
                    aVar.f795k = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
                aVar.f742F = i5;
                return;
            case 3:
                if (i4 == 3) {
                    aVar.f797m = i3;
                    aVar.f798n = -1;
                    aVar.f801q = -1;
                } else if (i4 == 4) {
                    aVar.f798n = i3;
                    aVar.f797m = -1;
                    aVar.f801q = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
                aVar.f743G = i5;
                return;
            case 4:
                if (i4 == 4) {
                    aVar.f800p = i3;
                    aVar.f799o = -1;
                    aVar.f801q = -1;
                } else if (i4 == 3) {
                    aVar.f799o = i3;
                    aVar.f800p = -1;
                    aVar.f801q = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
                aVar.f744H = i5;
                return;
            case 5:
                if (i4 == 5) {
                    aVar.f801q = i3;
                    aVar.f800p = -1;
                    aVar.f799o = -1;
                    aVar.f797m = -1;
                    aVar.f798n = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    aVar.f803s = i3;
                    aVar.f802r = -1;
                } else if (i4 == 7) {
                    aVar.f802r = i3;
                    aVar.f803s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
                aVar.f746J = i5;
                return;
            case 7:
                if (i4 == 7) {
                    aVar.f805u = i3;
                    aVar.f804t = -1;
                } else if (i4 == 6) {
                    aVar.f804t = i3;
                    aVar.f805u = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m542g(i4) + " undefined");
                }
                aVar.f745I = i5;
                return;
            default:
                throw new IllegalArgumentException(m542g(i2) + " to " + m542g(i4) + " unknown");
        }
    }

    /* renamed from: a */
    public void mo469a(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else if (i3 == 1 || i3 == 2) {
            mo468a(i, 1, i2, i3, i4);
            mo468a(i, 2, i5, i6, i7);
            this.f735B.get(Integer.valueOf(i)).f806v = f;
        } else if (i3 == 6 || i3 == 7) {
            mo468a(i, 6, i2, i3, i4);
            mo468a(i, 7, i5, i6, i7);
            this.f735B.get(Integer.valueOf(i)).f806v = f;
        } else {
            mo468a(i, 3, i2, i3, i4);
            mo468a(i, 4, i5, i6, i7);
            this.f735B.get(Integer.valueOf(i)).f807w = f;
        }
    }

    /* renamed from: a */
    public void mo470a(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr == null || fArr.length == iArr.length) {
            if (fArr != null) {
                m541f(iArr[0]).f754R = fArr[0];
            }
            m541f(iArr[0]).f757U = i5;
            mo468a(iArr[0], 3, i, i2, 0);
            int i6 = 1;
            while (true) {
                int i7 = i6;
                if (i7 < iArr.length) {
                    int i8 = iArr[i7];
                    mo468a(iArr[i7], 3, iArr[i7 - 1], 4, 0);
                    mo468a(iArr[i7 - 1], 4, iArr[i7], 3, 0);
                    if (fArr != null) {
                        m541f(iArr[i7]).f754R = fArr[i7];
                    }
                    i6 = i7 + 1;
                } else {
                    mo468a(iArr[iArr.length - 1], 4, i3, i4, 0);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    /* renamed from: a */
    public void mo471a(int i, int i2, int... iArr) {
        C0102a f = m541f(i);
        f.f784au = 1;
        f.f783at = i2;
        f.f763a = false;
        f.f785av = iArr;
    }

    /* renamed from: a */
    public void mo472a(int i, String str) {
        m541f(i).f808x = str;
    }

    /* renamed from: a */
    public void mo473a(int i, boolean z) {
        m541f(i).f759W = z;
    }

    /* renamed from: a */
    public void mo474a(Context context, int i) {
        mo475a((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: a */
    public void mo475a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f735B.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0052a aVar = (ConstraintLayout.C0052a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f735B.containsKey(Integer.valueOf(id))) {
                this.f735B.put(Integer.valueOf(id), new C0102a());
            }
            C0102a aVar2 = this.f735B.get(Integer.valueOf(id));
            aVar2.m613a(id, aVar);
            aVar2.f747K = childAt.getVisibility();
            if (Build.VERSION.SDK_INT >= 17) {
                aVar2.f758V = childAt.getAlpha();
                aVar2.f761Y = childAt.getRotation();
                aVar2.f762Z = childAt.getRotationX();
                aVar2.f764aa = childAt.getRotationY();
                aVar2.f765ab = childAt.getScaleX();
                aVar2.f766ac = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    aVar2.f767ad = pivotX;
                    aVar2.f768ae = pivotY;
                }
                aVar2.f769af = childAt.getTranslationX();
                aVar2.f770ag = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar2.f771ah = childAt.getTranslationZ();
                    if (aVar2.f759W) {
                        aVar2.f760X = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof C0054a) {
                C0054a aVar3 = (C0054a) childAt;
                aVar2.f782as = aVar3.mo63a();
                aVar2.f785av = aVar3.getReferencedIds();
                aVar2.f783at = aVar3.getType();
            }
        }
    }

    /* renamed from: a */
    public void mo476a(C0100c cVar) {
        this.f735B.clear();
        for (Integer next : cVar.f735B.keySet()) {
            this.f735B.put(next, cVar.f735B.get(next).clone());
        }
    }

    /* renamed from: a */
    public void mo477a(C0103d dVar) {
        int childCount = dVar.getChildCount();
        this.f735B.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = dVar.getChildAt(i);
            C0103d.C0104a aVar = (C0103d.C0104a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f735B.containsKey(Integer.valueOf(id))) {
                this.f735B.put(Integer.valueOf(id), new C0102a());
            }
            C0102a aVar2 = this.f735B.get(Integer.valueOf(id));
            if (childAt instanceof C0099b) {
                aVar2.m615a((C0099b) childAt, id, aVar);
            }
            aVar2.m614a(id, aVar);
        }
    }

    /* renamed from: b */
    public void mo478b(int i) {
        this.f735B.remove(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo479b(int i, float f) {
        m541f(i).f807w = f;
    }

    /* renamed from: b */
    public void mo480b(int i, float f, float f2) {
        C0102a f3 = m541f(i);
        f3.f769af = f;
        f3.f770ag = f2;
    }

    /* renamed from: b */
    public void mo481b(int i, int i2) {
        if (i2 == 0) {
            mo469a(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            mo469a(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    /* renamed from: b */
    public void mo482b(int i, int i2, int i3) {
        C0102a f = m541f(i);
        switch (i2) {
            case 1:
                f.f748L = i3;
                return;
            case 2:
                f.f750N = i3;
                return;
            case 3:
                f.f749M = i3;
                return;
            case 4:
                f.f751O = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                f.f753Q = i3;
                return;
            case 7:
                f.f752P = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: b */
    public void mo483b(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo468a(i, 1, i2, i3, i4);
        mo468a(i, 2, i5, i6, i7);
        this.f735B.get(Integer.valueOf(i)).f806v = f;
    }

    /* renamed from: b */
    public void mo484b(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m538a(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    /* renamed from: b */
    public void mo485b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case 0:
                        xml.getName();
                        break;
                    case 2:
                        String name = xml.getName();
                        C0102a a = m537a(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            a.f763a = true;
                        }
                        this.f735B.put(Integer.valueOf(a.f789d), a);
                        break;
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo486b(ConstraintLayout constraintLayout) {
        mo492c(constraintLayout);
        constraintLayout.setConstraintSet((C0100c) null);
    }

    /* renamed from: c */
    public void mo487c(int i, float f) {
        m541f(i).f758V = f;
    }

    /* renamed from: c */
    public void mo488c(int i, int i2) {
        if (i2 == 0) {
            mo469a(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            mo469a(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    /* renamed from: c */
    public void mo489c(int i, int i2, int i3) {
        mo468a(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        mo468a(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            mo468a(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            mo468a(i3, 1, i, 2, 0);
        }
    }

    /* renamed from: c */
    public void mo490c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo468a(i, 6, i2, i3, i4);
        mo468a(i, 7, i5, i6, i7);
        this.f735B.get(Integer.valueOf(i)).f806v = f;
    }

    /* renamed from: c */
    public void mo491c(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m538a(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo492c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f735B.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (this.f735B.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0102a aVar = this.f735B.get(Integer.valueOf(id));
                if (childAt instanceof C0054a) {
                    aVar.f784au = 1;
                }
                if (aVar.f784au != -1) {
                    switch (aVar.f784au) {
                        case 1:
                            C0054a aVar2 = (C0054a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f783at);
                            aVar2.setAllowsGoneWidget(aVar.f782as);
                            if (aVar.f785av == null) {
                                if (aVar.f786aw != null) {
                                    aVar.f785av = m540a((View) aVar2, aVar.f786aw);
                                    aVar2.setReferencedIds(aVar.f785av);
                                    break;
                                }
                            } else {
                                aVar2.setReferencedIds(aVar.f785av);
                                break;
                            }
                            break;
                    }
                }
                ConstraintLayout.C0052a aVar3 = (ConstraintLayout.C0052a) childAt.getLayoutParams();
                aVar.mo532a(aVar3);
                childAt.setLayoutParams(aVar3);
                childAt.setVisibility(aVar.f747K);
                if (Build.VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(aVar.f758V);
                    childAt.setRotation(aVar.f761Y);
                    childAt.setRotationX(aVar.f762Z);
                    childAt.setRotationY(aVar.f764aa);
                    childAt.setScaleX(aVar.f765ab);
                    childAt.setScaleY(aVar.f766ac);
                    if (!Float.isNaN(aVar.f767ad)) {
                        childAt.setPivotX(aVar.f767ad);
                    }
                    if (!Float.isNaN(aVar.f768ae)) {
                        childAt.setPivotY(aVar.f768ae);
                    }
                    childAt.setTranslationX(aVar.f769af);
                    childAt.setTranslationY(aVar.f770ag);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.f771ah);
                        if (aVar.f759W) {
                            childAt.setElevation(aVar.f760X);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0102a aVar4 = this.f735B.get(num);
            if (aVar4.f784au != -1) {
                switch (aVar4.f784au) {
                    case 1:
                        C0054a aVar5 = new C0054a(constraintLayout.getContext());
                        aVar5.setId(num.intValue());
                        if (aVar4.f785av != null) {
                            aVar5.setReferencedIds(aVar4.f785av);
                        } else if (aVar4.f786aw != null) {
                            aVar4.f785av = m540a((View) aVar5, aVar4.f786aw);
                            aVar5.setReferencedIds(aVar4.f785av);
                        }
                        aVar5.setType(aVar4.f783at);
                        ConstraintLayout.C0052a a = constraintLayout.generateDefaultLayoutParams();
                        aVar5.mo453b();
                        aVar4.mo532a(a);
                        constraintLayout.addView(aVar5, a);
                        break;
                }
            }
            if (aVar4.f763a) {
                C0106f fVar = new C0106f(constraintLayout.getContext());
                fVar.setId(num.intValue());
                ConstraintLayout.C0052a a2 = constraintLayout.generateDefaultLayoutParams();
                aVar4.mo532a(a2);
                constraintLayout.addView(fVar, a2);
            }
        }
    }

    /* renamed from: c */
    public boolean mo493c(int i) {
        return m541f(i).f759W;
    }

    /* renamed from: d */
    public void mo494d(int i) {
        if (this.f735B.containsKey(Integer.valueOf(i))) {
            C0102a aVar = this.f735B.get(Integer.valueOf(i));
            int i2 = aVar.f798n;
            int i3 = aVar.f799o;
            if (!(i2 == -1 && i3 == -1)) {
                if (i2 != -1 && i3 != -1) {
                    mo468a(i2, 4, i3, 3, 0);
                    mo468a(i3, 3, i2, 4, 0);
                } else if (!(i2 == -1 && i3 == -1)) {
                    if (aVar.f800p != -1) {
                        mo468a(i2, 4, aVar.f800p, 4, 0);
                    } else if (aVar.f797m != -1) {
                        mo468a(i3, 3, aVar.f797m, 3, 0);
                    }
                }
            }
        }
        mo496d(i, 3);
        mo496d(i, 4);
    }

    /* renamed from: d */
    public void mo495d(int i, float f) {
        m541f(i).f760X = f;
        m541f(i).f759W = true;
    }

    /* renamed from: d */
    public void mo496d(int i, int i2) {
        if (this.f735B.containsKey(Integer.valueOf(i))) {
            C0102a aVar = this.f735B.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    aVar.f794j = -1;
                    aVar.f793i = -1;
                    aVar.f741E = -1;
                    aVar.f748L = -1;
                    return;
                case 2:
                    aVar.f796l = -1;
                    aVar.f795k = -1;
                    aVar.f742F = -1;
                    aVar.f750N = -1;
                    return;
                case 3:
                    aVar.f798n = -1;
                    aVar.f797m = -1;
                    aVar.f743G = -1;
                    aVar.f749M = -1;
                    return;
                case 4:
                    aVar.f799o = -1;
                    aVar.f800p = -1;
                    aVar.f744H = -1;
                    aVar.f751O = -1;
                    return;
                case 5:
                    aVar.f801q = -1;
                    return;
                case 6:
                    aVar.f802r = -1;
                    aVar.f803s = -1;
                    aVar.f746J = -1;
                    aVar.f753Q = -1;
                    return;
                case 7:
                    aVar.f804t = -1;
                    aVar.f805u = -1;
                    aVar.f745I = -1;
                    aVar.f752P = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: d */
    public void mo497d(int i, int i2, int i3) {
        mo468a(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        mo468a(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            mo468a(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            mo468a(i3, 6, i, 7, 0);
        }
    }

    /* renamed from: d */
    public void mo498d(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        mo468a(i, 3, i2, i3, i4);
        mo468a(i, 4, i5, i6, i7);
        this.f735B.get(Integer.valueOf(i)).f807w = f;
    }

    /* renamed from: e */
    public void mo499e(int i) {
        if (this.f735B.containsKey(Integer.valueOf(i))) {
            C0102a aVar = this.f735B.get(Integer.valueOf(i));
            int i2 = aVar.f794j;
            int i3 = aVar.f795k;
            if (i2 == -1 && i3 == -1) {
                int i4 = aVar.f802r;
                int i5 = aVar.f804t;
                if (!(i4 == -1 && i5 == -1)) {
                    if (i4 != -1 && i5 != -1) {
                        mo468a(i4, 7, i5, 6, 0);
                        mo468a(i5, 6, i2, 7, 0);
                    } else if (!(i2 == -1 && i5 == -1)) {
                        if (aVar.f796l != -1) {
                            mo468a(i2, 7, aVar.f796l, 7, 0);
                        } else if (aVar.f793i != -1) {
                            mo468a(i5, 6, aVar.f793i, 6, 0);
                        }
                    }
                }
                mo496d(i, 6);
                mo496d(i, 7);
                return;
            }
            if (i2 != -1 && i3 != -1) {
                mo468a(i2, 2, i3, 1, 0);
                mo468a(i3, 1, i2, 2, 0);
            } else if (!(i2 == -1 && i3 == -1)) {
                if (aVar.f796l != -1) {
                    mo468a(i2, 2, aVar.f796l, 2, 0);
                } else if (aVar.f793i != -1) {
                    mo468a(i3, 1, aVar.f793i, 1, 0);
                }
            }
            mo496d(i, 1);
            mo496d(i, 2);
        }
    }

    /* renamed from: e */
    public void mo500e(int i, float f) {
        m541f(i).f761Y = f;
    }

    /* renamed from: e */
    public void mo501e(int i, int i2) {
        m541f(i).f747K = i2;
    }

    /* renamed from: e */
    public void mo502e(int i, int i2, int i3) {
        mo468a(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        mo468a(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            mo468a(i2, 4, i, 3, 0);
        }
        if (i2 != 0) {
            mo468a(i3, 3, i, 4, 0);
        }
    }

    /* renamed from: f */
    public void mo503f(int i, float f) {
        m541f(i).f762Z = f;
    }

    /* renamed from: f */
    public void mo504f(int i, int i2) {
        m541f(i).f788c = i2;
    }

    /* renamed from: g */
    public void mo505g(int i, float f) {
        m541f(i).f764aa = f;
    }

    /* renamed from: g */
    public void mo506g(int i, int i2) {
        m541f(i).f787b = i2;
    }

    /* renamed from: h */
    public void mo507h(int i, float f) {
        m541f(i).f765ab = f;
    }

    /* renamed from: h */
    public void mo508h(int i, int i2) {
        m541f(i).f777an = i2;
    }

    /* renamed from: i */
    public void mo509i(int i, float f) {
        m541f(i).f766ac = f;
    }

    /* renamed from: i */
    public void mo510i(int i, int i2) {
        m541f(i).f776am = i2;
    }

    /* renamed from: j */
    public void mo511j(int i, float f) {
        m541f(i).f767ad = f;
    }

    /* renamed from: j */
    public void mo512j(int i, int i2) {
        m541f(i).f779ap = i2;
    }

    /* renamed from: k */
    public void mo513k(int i, float f) {
        m541f(i).f768ae = f;
    }

    /* renamed from: k */
    public void mo514k(int i, int i2) {
        m541f(i).f778ao = i2;
    }

    /* renamed from: l */
    public void mo515l(int i, float f) {
        m541f(i).f769af = f;
    }

    /* renamed from: l */
    public void mo516l(int i, int i2) {
        m541f(i).f775al = i2;
    }

    /* renamed from: m */
    public void mo517m(int i, float f) {
        m541f(i).f770ag = f;
    }

    /* renamed from: m */
    public void mo518m(int i, int i2) {
        m541f(i).f774ak = i2;
    }

    /* renamed from: n */
    public void mo519n(int i, float f) {
        m541f(i).f771ah = f;
    }

    /* renamed from: n */
    public void mo520n(int i, int i2) {
        m541f(i).f756T = i2;
    }

    /* renamed from: o */
    public void mo521o(int i, float f) {
        m541f(i).f780aq = f;
    }

    /* renamed from: o */
    public void mo522o(int i, int i2) {
        m541f(i).f757U = i2;
    }

    /* renamed from: p */
    public void mo523p(int i, float f) {
        m541f(i).f781ar = f;
    }

    /* renamed from: p */
    public void mo524p(int i, int i2) {
        C0102a f = m541f(i);
        f.f763a = true;
        f.f740D = i2;
    }

    /* renamed from: q */
    public void mo525q(int i, float f) {
        m541f(i).f755S = f;
    }

    /* renamed from: q */
    public void mo526q(int i, int i2) {
        m541f(i).f790f = i2;
        m541f(i).f791g = -1;
        m541f(i).f792h = -1.0f;
    }

    /* renamed from: r */
    public void mo527r(int i, float f) {
        m541f(i).f754R = f;
    }

    /* renamed from: r */
    public void mo528r(int i, int i2) {
        m541f(i).f791g = i2;
        m541f(i).f790f = -1;
        m541f(i).f792h = -1.0f;
    }

    /* renamed from: s */
    public void mo529s(int i, float f) {
        m541f(i).f792h = f;
        m541f(i).f791g = -1;
        m541f(i).f790f = -1;
    }

    /* renamed from: s */
    public void mo530s(int i, int i2) {
    }
}
