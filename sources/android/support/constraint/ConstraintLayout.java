package android.support.constraint;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.constraint.C0108h;
import android.support.constraint.p003a.C0092f;
import android.support.constraint.p003a.p004a.C0056a;
import android.support.constraint.p003a.p004a.C0060e;
import android.support.constraint.p003a.p004a.C0070h;
import android.support.constraint.p003a.p004a.C0074i;
import android.support.constraint.p003a.p004a.C0076k;
import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: a */
    static final boolean f31a = false;

    /* renamed from: b */
    public static final String f32b = "ConstraintLayout-1.1.3";

    /* renamed from: i */
    public static final int f33i = 0;

    /* renamed from: j */
    private static final boolean f34j = false;

    /* renamed from: k */
    private static final String f35k = "ConstraintLayout";

    /* renamed from: l */
    private static final boolean f36l = true;

    /* renamed from: m */
    private static final boolean f37m = false;

    /* renamed from: A */
    private C0092f f38A;

    /* renamed from: c */
    SparseArray<View> f39c = new SparseArray<>();

    /* renamed from: d */
    C0074i f40d = new C0074i();

    /* renamed from: e */
    int f41e = -1;

    /* renamed from: f */
    int f42f = -1;

    /* renamed from: g */
    int f43g = 0;

    /* renamed from: h */
    int f44h = 0;

    /* renamed from: n */
    private ArrayList<C0099b> f45n = new ArrayList<>(4);

    /* renamed from: o */
    private final ArrayList<C0070h> f46o = new ArrayList<>(100);

    /* renamed from: p */
    private int f47p = 0;

    /* renamed from: q */
    private int f48q = 0;

    /* renamed from: r */
    private int f49r = ActivityChooserView.C1593a.f5166a;

    /* renamed from: s */
    private int f50s = ActivityChooserView.C1593a.f5166a;

    /* renamed from: t */
    private boolean f51t = f36l;

    /* renamed from: u */
    private int f52u = 7;

    /* renamed from: v */
    private C0100c f53v = null;

    /* renamed from: w */
    private int f54w = -1;

    /* renamed from: x */
    private HashMap<String, Integer> f55x = new HashMap<>();

    /* renamed from: y */
    private int f56y = -1;

    /* renamed from: z */
    private int f57z = -1;

    /* renamed from: android.support.constraint.ConstraintLayout$a */
    public static class C0052a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public static final int f58a = 0;

        /* renamed from: b */
        public static final int f59b = 0;

        /* renamed from: c */
        public static final int f60c = -1;

        /* renamed from: d */
        public static final int f61d = 0;

        /* renamed from: e */
        public static final int f62e = 1;

        /* renamed from: f */
        public static final int f63f = 1;

        /* renamed from: g */
        public static final int f64g = 2;

        /* renamed from: h */
        public static final int f65h = 3;

        /* renamed from: i */
        public static final int f66i = 4;

        /* renamed from: j */
        public static final int f67j = 5;

        /* renamed from: k */
        public static final int f68k = 6;

        /* renamed from: l */
        public static final int f69l = 7;

        /* renamed from: m */
        public static final int f70m = 1;

        /* renamed from: n */
        public static final int f71n = 0;

        /* renamed from: o */
        public static final int f72o = 2;

        /* renamed from: p */
        public static final int f73p = 0;

        /* renamed from: q */
        public static final int f74q = 1;

        /* renamed from: r */
        public static final int f75r = 2;

        /* renamed from: A */
        public int f76A = -1;

        /* renamed from: B */
        public int f77B = -1;

        /* renamed from: C */
        public int f78C = -1;

        /* renamed from: D */
        public int f79D = -1;

        /* renamed from: E */
        public int f80E = -1;

        /* renamed from: F */
        public int f81F = 0;

        /* renamed from: G */
        public float f82G = 0.0f;

        /* renamed from: H */
        public int f83H = -1;

        /* renamed from: I */
        public int f84I = -1;

        /* renamed from: J */
        public int f85J = -1;

        /* renamed from: K */
        public int f86K = -1;

        /* renamed from: L */
        public int f87L = -1;

        /* renamed from: M */
        public int f88M = -1;

        /* renamed from: N */
        public int f89N = -1;

        /* renamed from: O */
        public int f90O = -1;

        /* renamed from: P */
        public int f91P = -1;

        /* renamed from: Q */
        public int f92Q = -1;

        /* renamed from: R */
        public float f93R = 0.5f;

        /* renamed from: S */
        public float f94S = 0.5f;

        /* renamed from: T */
        public String f95T = null;

        /* renamed from: U */
        float f96U = 0.0f;

        /* renamed from: V */
        int f97V = 1;

        /* renamed from: W */
        public float f98W = -1.0f;

        /* renamed from: X */
        public float f99X = -1.0f;

        /* renamed from: Y */
        public int f100Y = 0;

        /* renamed from: Z */
        public int f101Z = 0;

        /* renamed from: aA */
        int f102aA;

        /* renamed from: aB */
        int f103aB;

        /* renamed from: aC */
        float f104aC;

        /* renamed from: aD */
        C0070h f105aD = new C0070h();

        /* renamed from: aE */
        public boolean f106aE = false;

        /* renamed from: aa */
        public int f107aa = 0;

        /* renamed from: ab */
        public int f108ab = 0;

        /* renamed from: ac */
        public int f109ac = 0;

        /* renamed from: ad */
        public int f110ad = 0;

        /* renamed from: ae */
        public int f111ae = 0;

        /* renamed from: af */
        public int f112af = 0;

        /* renamed from: ag */
        public float f113ag = 1.0f;

        /* renamed from: ah */
        public float f114ah = 1.0f;

        /* renamed from: ai */
        public int f115ai = -1;

        /* renamed from: aj */
        public int f116aj = -1;

        /* renamed from: ak */
        public int f117ak = -1;

        /* renamed from: al */
        public boolean f118al = false;

        /* renamed from: am */
        public boolean f119am = false;

        /* renamed from: an */
        boolean f120an = ConstraintLayout.f36l;

        /* renamed from: ao */
        boolean f121ao = ConstraintLayout.f36l;

        /* renamed from: ap */
        boolean f122ap = false;

        /* renamed from: aq */
        boolean f123aq = false;

        /* renamed from: ar */
        boolean f124ar = false;

        /* renamed from: as */
        boolean f125as = false;

        /* renamed from: at */
        int f126at = -1;

        /* renamed from: au */
        int f127au = -1;

        /* renamed from: av */
        int f128av = -1;

        /* renamed from: aw */
        int f129aw = -1;

        /* renamed from: ax */
        int f130ax = -1;

        /* renamed from: ay */
        int f131ay = -1;

        /* renamed from: az */
        float f132az = 0.5f;

        /* renamed from: s */
        public int f133s = -1;

        /* renamed from: t */
        public int f134t = -1;

        /* renamed from: u */
        public float f135u = -1.0f;

        /* renamed from: v */
        public int f136v = -1;

        /* renamed from: w */
        public int f137w = -1;

        /* renamed from: x */
        public int f138x = -1;

        /* renamed from: y */
        public int f139y = -1;

        /* renamed from: z */
        public int f140z = -1;

        /* renamed from: android.support.constraint.ConstraintLayout$a$a */
        private static class C0053a {

            /* renamed from: A */
            public static final int f141A = 26;

            /* renamed from: B */
            public static final int f142B = 27;

            /* renamed from: C */
            public static final int f143C = 28;

            /* renamed from: D */
            public static final int f144D = 29;

            /* renamed from: E */
            public static final int f145E = 30;

            /* renamed from: F */
            public static final int f146F = 31;

            /* renamed from: G */
            public static final int f147G = 32;

            /* renamed from: H */
            public static final int f148H = 33;

            /* renamed from: I */
            public static final int f149I = 34;

            /* renamed from: J */
            public static final int f150J = 35;

            /* renamed from: K */
            public static final int f151K = 36;

            /* renamed from: L */
            public static final int f152L = 37;

            /* renamed from: M */
            public static final int f153M = 38;

            /* renamed from: N */
            public static final int f154N = 39;

            /* renamed from: O */
            public static final int f155O = 40;

            /* renamed from: P */
            public static final int f156P = 41;

            /* renamed from: Q */
            public static final int f157Q = 42;

            /* renamed from: R */
            public static final int f158R = 43;

            /* renamed from: S */
            public static final int f159S = 44;

            /* renamed from: T */
            public static final int f160T = 45;

            /* renamed from: U */
            public static final int f161U = 46;

            /* renamed from: V */
            public static final int f162V = 47;

            /* renamed from: W */
            public static final int f163W = 48;

            /* renamed from: X */
            public static final int f164X = 49;

            /* renamed from: Y */
            public static final int f165Y = 50;

            /* renamed from: Z */
            public static final SparseIntArray f166Z = new SparseIntArray();

            /* renamed from: a */
            public static final int f167a = 0;

            /* renamed from: b */
            public static final int f168b = 1;

            /* renamed from: c */
            public static final int f169c = 2;

            /* renamed from: d */
            public static final int f170d = 3;

            /* renamed from: e */
            public static final int f171e = 4;

            /* renamed from: f */
            public static final int f172f = 5;

            /* renamed from: g */
            public static final int f173g = 6;

            /* renamed from: h */
            public static final int f174h = 7;

            /* renamed from: i */
            public static final int f175i = 8;

            /* renamed from: j */
            public static final int f176j = 9;

            /* renamed from: k */
            public static final int f177k = 10;

            /* renamed from: l */
            public static final int f178l = 11;

            /* renamed from: m */
            public static final int f179m = 12;

            /* renamed from: n */
            public static final int f180n = 13;

            /* renamed from: o */
            public static final int f181o = 14;

            /* renamed from: p */
            public static final int f182p = 15;

            /* renamed from: q */
            public static final int f183q = 16;

            /* renamed from: r */
            public static final int f184r = 17;

            /* renamed from: s */
            public static final int f185s = 18;

            /* renamed from: t */
            public static final int f186t = 19;

            /* renamed from: u */
            public static final int f187u = 20;

            /* renamed from: v */
            public static final int f188v = 21;

            /* renamed from: w */
            public static final int f189w = 22;

            /* renamed from: x */
            public static final int f190x = 23;

            /* renamed from: y */
            public static final int f191y = 24;

            /* renamed from: z */
            public static final int f192z = 25;

            static {
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_android_orientation, 1);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f166Z.append(C0108h.C0111c.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }

            private C0053a() {
            }
        }

        public C0052a(int i, int i2) {
            super(i, i2);
        }

        public C0052a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (C0053a.f166Z.get(index)) {
                    case 1:
                        this.f117ak = obtainStyledAttributes.getInt(index, this.f117ak);
                        break;
                    case 2:
                        this.f80E = obtainStyledAttributes.getResourceId(index, this.f80E);
                        if (this.f80E != -1) {
                            break;
                        } else {
                            this.f80E = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f81F = obtainStyledAttributes.getDimensionPixelSize(index, this.f81F);
                        break;
                    case 4:
                        this.f82G = obtainStyledAttributes.getFloat(index, this.f82G) % 360.0f;
                        if (this.f82G >= 0.0f) {
                            break;
                        } else {
                            this.f82G = (360.0f - this.f82G) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f133s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f133s);
                        break;
                    case 6:
                        this.f134t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f134t);
                        break;
                    case 7:
                        this.f135u = obtainStyledAttributes.getFloat(index, this.f135u);
                        break;
                    case 8:
                        this.f136v = obtainStyledAttributes.getResourceId(index, this.f136v);
                        if (this.f136v != -1) {
                            break;
                        } else {
                            this.f136v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f137w = obtainStyledAttributes.getResourceId(index, this.f137w);
                        if (this.f137w != -1) {
                            break;
                        } else {
                            this.f137w = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f138x = obtainStyledAttributes.getResourceId(index, this.f138x);
                        if (this.f138x != -1) {
                            break;
                        } else {
                            this.f138x = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f139y = obtainStyledAttributes.getResourceId(index, this.f139y);
                        if (this.f139y != -1) {
                            break;
                        } else {
                            this.f139y = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f140z = obtainStyledAttributes.getResourceId(index, this.f140z);
                        if (this.f140z != -1) {
                            break;
                        } else {
                            this.f140z = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f76A = obtainStyledAttributes.getResourceId(index, this.f76A);
                        if (this.f76A != -1) {
                            break;
                        } else {
                            this.f76A = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f77B = obtainStyledAttributes.getResourceId(index, this.f77B);
                        if (this.f77B != -1) {
                            break;
                        } else {
                            this.f77B = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f78C = obtainStyledAttributes.getResourceId(index, this.f78C);
                        if (this.f78C != -1) {
                            break;
                        } else {
                            this.f78C = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f79D = obtainStyledAttributes.getResourceId(index, this.f79D);
                        if (this.f79D != -1) {
                            break;
                        } else {
                            this.f79D = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f83H = obtainStyledAttributes.getResourceId(index, this.f83H);
                        if (this.f83H != -1) {
                            break;
                        } else {
                            this.f83H = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f84I = obtainStyledAttributes.getResourceId(index, this.f84I);
                        if (this.f84I != -1) {
                            break;
                        } else {
                            this.f84I = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f85J = obtainStyledAttributes.getResourceId(index, this.f85J);
                        if (this.f85J != -1) {
                            break;
                        } else {
                            this.f85J = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f86K = obtainStyledAttributes.getResourceId(index, this.f86K);
                        if (this.f86K != -1) {
                            break;
                        } else {
                            this.f86K = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f87L = obtainStyledAttributes.getDimensionPixelSize(index, this.f87L);
                        break;
                    case 22:
                        this.f88M = obtainStyledAttributes.getDimensionPixelSize(index, this.f88M);
                        break;
                    case 23:
                        this.f89N = obtainStyledAttributes.getDimensionPixelSize(index, this.f89N);
                        break;
                    case 24:
                        this.f90O = obtainStyledAttributes.getDimensionPixelSize(index, this.f90O);
                        break;
                    case 25:
                        this.f91P = obtainStyledAttributes.getDimensionPixelSize(index, this.f91P);
                        break;
                    case 26:
                        this.f92Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f92Q);
                        break;
                    case 27:
                        this.f118al = obtainStyledAttributes.getBoolean(index, this.f118al);
                        break;
                    case 28:
                        this.f119am = obtainStyledAttributes.getBoolean(index, this.f119am);
                        break;
                    case 29:
                        this.f93R = obtainStyledAttributes.getFloat(index, this.f93R);
                        break;
                    case 30:
                        this.f94S = obtainStyledAttributes.getFloat(index, this.f94S);
                        break;
                    case 31:
                        this.f107aa = obtainStyledAttributes.getInt(index, 0);
                        if (this.f107aa != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.f35k, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.f108ab = obtainStyledAttributes.getInt(index, 0);
                        if (this.f108ab != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.f35k, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f109ac = obtainStyledAttributes.getDimensionPixelSize(index, this.f109ac);
                            break;
                        } catch (Exception e) {
                            if (obtainStyledAttributes.getInt(index, this.f109ac) != -2) {
                                break;
                            } else {
                                this.f109ac = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f111ae = obtainStyledAttributes.getDimensionPixelSize(index, this.f111ae);
                            break;
                        } catch (Exception e2) {
                            if (obtainStyledAttributes.getInt(index, this.f111ae) != -2) {
                                break;
                            } else {
                                this.f111ae = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f113ag = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f113ag));
                        break;
                    case 36:
                        try {
                            this.f110ad = obtainStyledAttributes.getDimensionPixelSize(index, this.f110ad);
                            break;
                        } catch (Exception e3) {
                            if (obtainStyledAttributes.getInt(index, this.f110ad) != -2) {
                                break;
                            } else {
                                this.f110ad = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f112af = obtainStyledAttributes.getDimensionPixelSize(index, this.f112af);
                            break;
                        } catch (Exception e4) {
                            if (obtainStyledAttributes.getInt(index, this.f112af) != -2) {
                                break;
                            } else {
                                this.f112af = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f114ah = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f114ah));
                        break;
                    case 44:
                        this.f95T = obtainStyledAttributes.getString(index);
                        this.f96U = Float.NaN;
                        this.f97V = -1;
                        if (this.f95T == null) {
                            break;
                        } else {
                            int length = this.f95T.length();
                            int indexOf = this.f95T.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i = 0;
                            } else {
                                String substring = this.f95T.substring(0, indexOf);
                                if (substring.equalsIgnoreCase("W")) {
                                    this.f97V = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.f97V = 1;
                                }
                                i = indexOf + 1;
                            }
                            int indexOf2 = this.f95T.indexOf(58);
                            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                String substring2 = this.f95T.substring(i, indexOf2);
                                String substring3 = this.f95T.substring(indexOf2 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring2);
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.f97V != 1) {
                                                this.f96U = Math.abs(parseFloat / parseFloat2);
                                                break;
                                            } else {
                                                this.f96U = Math.abs(parseFloat2 / parseFloat);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException e5) {
                                        break;
                                    }
                                }
                            } else {
                                String substring4 = this.f95T.substring(i);
                                if (substring4.length() <= 0) {
                                    break;
                                } else {
                                    try {
                                        this.f96U = Float.parseFloat(substring4);
                                        break;
                                    } catch (NumberFormatException e6) {
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 45:
                        this.f98W = obtainStyledAttributes.getFloat(index, this.f98W);
                        break;
                    case 46:
                        this.f99X = obtainStyledAttributes.getFloat(index, this.f99X);
                        break;
                    case 47:
                        this.f100Y = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.f101Z = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.f115ai = obtainStyledAttributes.getDimensionPixelOffset(index, this.f115ai);
                        break;
                    case 50:
                        this.f116aj = obtainStyledAttributes.getDimensionPixelOffset(index, this.f116aj);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            mo60b();
        }

        public C0052a(C0052a aVar) {
            super(aVar);
            this.f133s = aVar.f133s;
            this.f134t = aVar.f134t;
            this.f135u = aVar.f135u;
            this.f136v = aVar.f136v;
            this.f137w = aVar.f137w;
            this.f138x = aVar.f138x;
            this.f139y = aVar.f139y;
            this.f140z = aVar.f140z;
            this.f76A = aVar.f76A;
            this.f77B = aVar.f77B;
            this.f78C = aVar.f78C;
            this.f79D = aVar.f79D;
            this.f80E = aVar.f80E;
            this.f81F = aVar.f81F;
            this.f82G = aVar.f82G;
            this.f83H = aVar.f83H;
            this.f84I = aVar.f84I;
            this.f85J = aVar.f85J;
            this.f86K = aVar.f86K;
            this.f87L = aVar.f87L;
            this.f88M = aVar.f88M;
            this.f89N = aVar.f89N;
            this.f90O = aVar.f90O;
            this.f91P = aVar.f91P;
            this.f92Q = aVar.f92Q;
            this.f93R = aVar.f93R;
            this.f94S = aVar.f94S;
            this.f95T = aVar.f95T;
            this.f96U = aVar.f96U;
            this.f97V = aVar.f97V;
            this.f98W = aVar.f98W;
            this.f99X = aVar.f99X;
            this.f100Y = aVar.f100Y;
            this.f101Z = aVar.f101Z;
            this.f118al = aVar.f118al;
            this.f119am = aVar.f119am;
            this.f107aa = aVar.f107aa;
            this.f108ab = aVar.f108ab;
            this.f109ac = aVar.f109ac;
            this.f111ae = aVar.f111ae;
            this.f110ad = aVar.f110ad;
            this.f112af = aVar.f112af;
            this.f113ag = aVar.f113ag;
            this.f114ah = aVar.f114ah;
            this.f115ai = aVar.f115ai;
            this.f116aj = aVar.f116aj;
            this.f117ak = aVar.f117ak;
            this.f120an = aVar.f120an;
            this.f121ao = aVar.f121ao;
            this.f122ap = aVar.f122ap;
            this.f123aq = aVar.f123aq;
            this.f126at = aVar.f126at;
            this.f127au = aVar.f127au;
            this.f128av = aVar.f128av;
            this.f129aw = aVar.f129aw;
            this.f130ax = aVar.f130ax;
            this.f131ay = aVar.f131ay;
            this.f132az = aVar.f132az;
            this.f105aD = aVar.f105aD;
        }

        public C0052a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo59a() {
            if (this.f105aD != null) {
                this.f105aD.mo273s();
            }
        }

        /* renamed from: b */
        public void mo60b() {
            this.f123aq = false;
            this.f120an = ConstraintLayout.f36l;
            this.f121ao = ConstraintLayout.f36l;
            if (this.width == -2 && this.f118al) {
                this.f120an = false;
                this.f107aa = 1;
            }
            if (this.height == -2 && this.f119am) {
                this.f121ao = false;
                this.f108ab = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.f120an = false;
                if (this.width == 0 && this.f107aa == 1) {
                    this.width = -2;
                    this.f118al = ConstraintLayout.f36l;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f121ao = false;
                if (this.height == 0 && this.f108ab == 1) {
                    this.height = -2;
                    this.f119am = ConstraintLayout.f36l;
                }
            }
            if (this.f135u != -1.0f || this.f133s != -1 || this.f134t != -1) {
                this.f123aq = ConstraintLayout.f36l;
                this.f120an = ConstraintLayout.f36l;
                this.f121ao = ConstraintLayout.f36l;
                if (!(this.f105aD instanceof C0076k)) {
                    this.f105aD = new C0076k();
                }
                ((C0076k) this.f105aD).mo86a(this.f117ak);
            }
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            boolean z = false;
            int i2 = this.leftMargin;
            int i3 = this.rightMargin;
            super.resolveLayoutDirection(i);
            this.f128av = -1;
            this.f129aw = -1;
            this.f126at = -1;
            this.f127au = -1;
            this.f130ax = -1;
            this.f131ay = -1;
            this.f130ax = this.f87L;
            this.f131ay = this.f89N;
            this.f132az = this.f93R;
            this.f102aA = this.f133s;
            this.f103aB = this.f134t;
            this.f104aC = this.f135u;
            if (1 == getLayoutDirection()) {
                if (this.f83H != -1) {
                    this.f128av = this.f83H;
                    z = true;
                } else if (this.f84I != -1) {
                    this.f129aw = this.f84I;
                    z = true;
                }
                if (this.f85J != -1) {
                    this.f127au = this.f85J;
                    z = true;
                }
                if (this.f86K != -1) {
                    this.f126at = this.f86K;
                    z = true;
                }
                if (this.f91P != -1) {
                    this.f131ay = this.f91P;
                }
                if (this.f92Q != -1) {
                    this.f130ax = this.f92Q;
                }
                if (z) {
                    this.f132az = 1.0f - this.f93R;
                }
                if (this.f123aq && this.f117ak == 1) {
                    if (this.f135u != -1.0f) {
                        this.f104aC = 1.0f - this.f135u;
                        this.f102aA = -1;
                        this.f103aB = -1;
                    } else if (this.f133s != -1) {
                        this.f103aB = this.f133s;
                        this.f102aA = -1;
                        this.f104aC = -1.0f;
                    } else if (this.f134t != -1) {
                        this.f102aA = this.f134t;
                        this.f103aB = -1;
                        this.f104aC = -1.0f;
                    }
                }
            } else {
                if (this.f83H != -1) {
                    this.f127au = this.f83H;
                }
                if (this.f84I != -1) {
                    this.f126at = this.f84I;
                }
                if (this.f85J != -1) {
                    this.f128av = this.f85J;
                }
                if (this.f86K != -1) {
                    this.f129aw = this.f86K;
                }
                if (this.f91P != -1) {
                    this.f130ax = this.f91P;
                }
                if (this.f92Q != -1) {
                    this.f131ay = this.f92Q;
                }
            }
            if (this.f85J == -1 && this.f86K == -1 && this.f84I == -1 && this.f83H == -1) {
                if (this.f138x != -1) {
                    this.f128av = this.f138x;
                    if (this.rightMargin <= 0 && i3 > 0) {
                        this.rightMargin = i3;
                    }
                } else if (this.f139y != -1) {
                    this.f129aw = this.f139y;
                    if (this.rightMargin <= 0 && i3 > 0) {
                        this.rightMargin = i3;
                    }
                }
                if (this.f136v != -1) {
                    this.f126at = this.f136v;
                    if (this.leftMargin <= 0 && i2 > 0) {
                        this.leftMargin = i2;
                    }
                } else if (this.f137w != -1) {
                    this.f127au = this.f137w;
                    if (this.leftMargin <= 0 && i2 > 0) {
                        this.leftMargin = i2;
                    }
                }
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m29b((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29b(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29b(attributeSet);
    }

    /* renamed from: a */
    private void m25a(int i, int i2) {
        int i3;
        int i4;
        int baseline;
        int childMeasureSpec;
        boolean z;
        int childMeasureSpec2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0052a aVar = (C0052a) childAt.getLayoutParams();
                C0070h hVar = aVar.f105aD;
                if (!aVar.f123aq && !aVar.f124ar) {
                    hVar.mo258i(childAt.getVisibility());
                    int i6 = aVar.width;
                    int i7 = aVar.height;
                    boolean z2 = false;
                    boolean z3 = false;
                    if (aVar.f120an || aVar.f121ao || (!aVar.f120an && aVar.f107aa == 1) || aVar.width == -1 || (!aVar.f121ao && (aVar.f108ab == 1 || aVar.height == -1))) {
                        if (i6 == 0) {
                            int childMeasureSpec3 = getChildMeasureSpec(i, paddingLeft, -2);
                            z = f36l;
                            childMeasureSpec = childMeasureSpec3;
                        } else if (i6 == -1) {
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, -1);
                            z = false;
                        } else {
                            if (i6 == -2) {
                                z2 = f36l;
                            }
                            childMeasureSpec = getChildMeasureSpec(i, paddingLeft, i6);
                            z = z2;
                        }
                        if (i7 == 0) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -2);
                            z3 = f36l;
                        } else if (i7 == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, -1);
                        } else {
                            z3 = i7 == -2 ? f36l : false;
                            childMeasureSpec2 = getChildMeasureSpec(i2, paddingTop, i7);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        if (this.f38A != null) {
                            this.f38A.f570a++;
                        }
                        hVar.mo240b(i6 == -2 ? f36l : false);
                        hVar.mo246c(i7 == -2 ? f36l : false);
                        i4 = childAt.getMeasuredWidth();
                        boolean z4 = z;
                        i3 = childAt.getMeasuredHeight();
                        z2 = z4;
                    } else {
                        i3 = i7;
                        i4 = i6;
                    }
                    hVar.mo271r(i4);
                    hVar.mo274s(i3);
                    if (z2) {
                        hVar.mo281v(i4);
                    }
                    if (z3) {
                        hVar.mo283w(i3);
                    }
                    if (aVar.f122ap && (baseline = childAt.getBaseline()) != -1) {
                        hVar.mo286y(baseline);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private final C0070h m26b(int i) {
        if (i == 0) {
            return this.f40d;
        }
        View view = this.f39c.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f40d;
        }
        if (view == null) {
            return null;
        }
        return ((C0052a) view.getLayoutParams()).f105aD;
    }

    /* renamed from: b */
    private void m27b() {
        boolean z = false;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = f36l;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f46o.clear();
            m30c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28b(int r23, int r24) {
        /*
            r22 = this;
            int r2 = r22.getPaddingTop()
            int r3 = r22.getPaddingBottom()
            int r15 = r2 + r3
            int r2 = r22.getPaddingLeft()
            int r3 = r22.getPaddingRight()
            int r16 = r2 + r3
            int r17 = r22.getChildCount()
            r2 = 0
            r6 = r2
        L_0x001a:
            r0 = r17
            if (r6 >= r0) goto L_0x00db
            r0 = r22
            android.view.View r7 = r0.getChildAt(r6)
            int r2 = r7.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x0030
        L_0x002c:
            int r2 = r6 + 1
            r6 = r2
            goto L_0x001a
        L_0x0030:
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r2 = (android.support.constraint.ConstraintLayout.C0052a) r2
            android.support.constraint.a.a.h r8 = r2.f105aD
            boolean r3 = r2.f123aq
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2.f124ar
            if (r3 != 0) goto L_0x002c
            int r3 = r7.getVisibility()
            r8.mo258i(r3)
            int r5 = r2.width
            int r9 = r2.height
            if (r5 == 0) goto L_0x004f
            if (r9 != 0) goto L_0x005e
        L_0x004f:
            android.support.constraint.a.a.p r2 = r8.mo280v()
            r2.mo357e()
            android.support.constraint.a.a.p r2 = r8.mo282w()
            r2.mo357e()
            goto L_0x002c
        L_0x005e:
            r3 = 0
            r4 = 0
            r10 = -2
            if (r5 != r10) goto L_0x0064
            r3 = 1
        L_0x0064:
            r0 = r23
            r1 = r16
            int r10 = getChildMeasureSpec(r0, r1, r5)
            r11 = -2
            if (r9 != r11) goto L_0x0070
            r4 = 1
        L_0x0070:
            r0 = r24
            int r11 = getChildMeasureSpec(r0, r15, r9)
            r7.measure(r10, r11)
            r0 = r22
            android.support.constraint.a.f r10 = r0.f38A
            if (r10 == 0) goto L_0x008b
            r0 = r22
            android.support.constraint.a.f r10 = r0.f38A
            long r12 = r10.f570a
            r18 = 1
            long r12 = r12 + r18
            r10.f570a = r12
        L_0x008b:
            r10 = -2
            if (r5 != r10) goto L_0x00d7
            r5 = 1
        L_0x008f:
            r8.mo240b((boolean) r5)
            r5 = -2
            if (r9 != r5) goto L_0x00d9
            r5 = 1
        L_0x0096:
            r8.mo246c((boolean) r5)
            int r5 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            r8.mo271r(r5)
            r8.mo274s(r9)
            if (r3 == 0) goto L_0x00ac
            r8.mo281v(r5)
        L_0x00ac:
            if (r4 == 0) goto L_0x00b1
            r8.mo283w(r9)
        L_0x00b1:
            boolean r3 = r2.f122ap
            if (r3 == 0) goto L_0x00bf
            int r3 = r7.getBaseline()
            r4 = -1
            if (r3 == r4) goto L_0x00bf
            r8.mo286y(r3)
        L_0x00bf:
            boolean r3 = r2.f120an
            if (r3 == 0) goto L_0x002c
            boolean r2 = r2.f121ao
            if (r2 == 0) goto L_0x002c
            android.support.constraint.a.a.p r2 = r8.mo280v()
            r2.mo354a(r5)
            android.support.constraint.a.a.p r2 = r8.mo282w()
            r2.mo354a(r9)
            goto L_0x002c
        L_0x00d7:
            r5 = 0
            goto L_0x008f
        L_0x00d9:
            r5 = 0
            goto L_0x0096
        L_0x00db:
            r0 = r22
            android.support.constraint.a.a.i r2 = r0.f40d
            r2.mo301aH()
            r2 = 0
            r14 = r2
        L_0x00e4:
            r0 = r17
            if (r14 >= r0) goto L_0x0315
            r0 = r22
            android.view.View r18 = r0.getChildAt(r14)
            int r2 = r18.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x00fa
        L_0x00f6:
            int r2 = r14 + 1
            r14 = r2
            goto L_0x00e4
        L_0x00fa:
            android.view.ViewGroup$LayoutParams r2 = r18.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r2 = (android.support.constraint.ConstraintLayout.C0052a) r2
            android.support.constraint.a.a.h r0 = r2.f105aD
            r19 = r0
            boolean r3 = r2.f123aq
            if (r3 != 0) goto L_0x00f6
            boolean r3 = r2.f124ar
            if (r3 != 0) goto L_0x00f6
            int r3 = r18.getVisibility()
            r0 = r19
            r0.mo258i(r3)
            int r9 = r2.width
            int r8 = r2.height
            if (r9 == 0) goto L_0x011d
            if (r8 != 0) goto L_0x00f6
        L_0x011d:
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            r0 = r19
            android.support.constraint.a.a.e r3 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
            android.support.constraint.a.a.o r10 = r3.mo103a()
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            r0 = r19
            android.support.constraint.a.a.e r3 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
            android.support.constraint.a.a.o r11 = r3.mo103a()
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            r0 = r19
            android.support.constraint.a.a.e r3 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
            android.support.constraint.a.a.e r3 = r3.mo124g()
            if (r3 == 0) goto L_0x0291
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            r0 = r19
            android.support.constraint.a.a.e r3 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
            android.support.constraint.a.a.e r3 = r3.mo124g()
            if (r3 == 0) goto L_0x0291
            r3 = 1
        L_0x0152:
            android.support.constraint.a.a.e$c r4 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            r0 = r19
            android.support.constraint.a.a.e r4 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r4)
            android.support.constraint.a.a.o r20 = r4.mo103a()
            android.support.constraint.a.a.e$c r4 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            r0 = r19
            android.support.constraint.a.a.e r4 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r4)
            android.support.constraint.a.a.o r21 = r4.mo103a()
            android.support.constraint.a.a.e$c r4 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            r0 = r19
            android.support.constraint.a.a.e r4 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r4)
            android.support.constraint.a.a.e r4 = r4.mo124g()
            if (r4 == 0) goto L_0x0294
            android.support.constraint.a.a.e$c r4 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            r0 = r19
            android.support.constraint.a.a.e r4 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r4)
            android.support.constraint.a.a.e r4 = r4.mo124g()
            if (r4 == 0) goto L_0x0294
            r4 = 1
            r13 = r4
        L_0x0188:
            if (r9 != 0) goto L_0x0190
            if (r8 != 0) goto L_0x0190
            if (r3 == 0) goto L_0x0190
            if (r13 != 0) goto L_0x00f6
        L_0x0190:
            r5 = 0
            r6 = 0
            r0 = r22
            android.support.constraint.a.a.i r4 = r0.f40d
            android.support.constraint.a.a.h$b r4 = r4.mo229av()
            android.support.constraint.a.a.h$b r7 = android.support.constraint.p003a.p004a.C0070h.C0073b.WRAP_CONTENT
            if (r4 == r7) goto L_0x0298
            r4 = 1
        L_0x019f:
            r0 = r22
            android.support.constraint.a.a.i r7 = r0.f40d
            android.support.constraint.a.a.h$b r7 = r7.mo230aw()
            android.support.constraint.a.a.h$b r12 = android.support.constraint.p003a.p004a.C0070h.C0073b.WRAP_CONTENT
            if (r7 == r12) goto L_0x029b
            r7 = 1
        L_0x01ac:
            if (r4 != 0) goto L_0x01b5
            android.support.constraint.a.a.p r12 = r19.mo280v()
            r12.mo357e()
        L_0x01b5:
            if (r7 != 0) goto L_0x01be
            android.support.constraint.a.a.p r12 = r19.mo282w()
            r12.mo357e()
        L_0x01be:
            if (r9 != 0) goto L_0x02af
            if (r4 == 0) goto L_0x029e
            boolean r12 = r19.mo270q()
            if (r12 == 0) goto L_0x029e
            if (r3 == 0) goto L_0x029e
            boolean r3 = r10.mo360h()
            if (r3 == 0) goto L_0x029e
            boolean r3 = r11.mo360h()
            if (r3 == 0) goto L_0x029e
            float r3 = r11.mo352d()
            float r9 = r10.mo352d()
            float r3 = r3 - r9
            int r9 = (int) r3
            android.support.constraint.a.a.p r3 = r19.mo280v()
            r3.mo354a(r9)
            r0 = r23
            r1 = r16
            int r3 = getChildMeasureSpec(r0, r1, r9)
            r10 = r4
            r11 = r5
            r12 = r9
            r9 = r3
        L_0x01f3:
            if (r8 != 0) goto L_0x02df
            if (r7 == 0) goto L_0x02d3
            boolean r3 = r19.mo272r()
            if (r3 == 0) goto L_0x02d3
            if (r13 == 0) goto L_0x02d3
            boolean r3 = r20.mo360h()
            if (r3 == 0) goto L_0x02d3
            boolean r3 = r21.mo360h()
            if (r3 == 0) goto L_0x02d3
            float r3 = r21.mo352d()
            float r4 = r20.mo352d()
            float r3 = r3 - r4
            int r4 = (int) r3
            android.support.constraint.a.a.p r3 = r19.mo282w()
            r3.mo354a(r4)
            r0 = r24
            int r3 = getChildMeasureSpec(r0, r15, r4)
            r5 = r4
            r4 = r7
        L_0x0224:
            r0 = r18
            r0.measure(r9, r3)
            r0 = r22
            android.support.constraint.a.f r3 = r0.f38A
            if (r3 == 0) goto L_0x023b
            r0 = r22
            android.support.constraint.a.f r3 = r0.f38A
            long r8 = r3.f570a
            r20 = 1
            long r8 = r8 + r20
            r3.f570a = r8
        L_0x023b:
            r3 = -2
            if (r12 != r3) goto L_0x02fd
            r3 = 1
        L_0x023f:
            r0 = r19
            r0.mo240b((boolean) r3)
            r3 = -2
            if (r5 != r3) goto L_0x0300
            r3 = 1
        L_0x0248:
            r0 = r19
            r0.mo246c((boolean) r3)
            int r3 = r18.getMeasuredWidth()
            int r5 = r18.getMeasuredHeight()
            r0 = r19
            r0.mo271r(r3)
            r0 = r19
            r0.mo274s(r5)
            if (r11 == 0) goto L_0x0266
            r0 = r19
            r0.mo281v(r3)
        L_0x0266:
            if (r6 == 0) goto L_0x026d
            r0 = r19
            r0.mo283w(r5)
        L_0x026d:
            if (r10 == 0) goto L_0x0303
            android.support.constraint.a.a.p r6 = r19.mo280v()
            r6.mo354a(r3)
        L_0x0276:
            if (r4 == 0) goto L_0x030c
            android.support.constraint.a.a.p r3 = r19.mo282w()
            r3.mo354a(r5)
        L_0x027f:
            boolean r2 = r2.f122ap
            if (r2 == 0) goto L_0x00f6
            int r2 = r18.getBaseline()
            r3 = -1
            if (r2 == r3) goto L_0x00f6
            r0 = r19
            r0.mo286y(r2)
            goto L_0x00f6
        L_0x0291:
            r3 = 0
            goto L_0x0152
        L_0x0294:
            r4 = 0
            r13 = r4
            goto L_0x0188
        L_0x0298:
            r4 = 0
            goto L_0x019f
        L_0x029b:
            r7 = 0
            goto L_0x01ac
        L_0x029e:
            r3 = -2
            r0 = r23
            r1 = r16
            int r3 = getChildMeasureSpec(r0, r1, r3)
            r5 = 1
            r4 = 0
            r10 = r4
            r11 = r5
            r12 = r9
            r9 = r3
            goto L_0x01f3
        L_0x02af:
            r3 = -1
            if (r9 != r3) goto L_0x02c1
            r3 = -1
            r0 = r23
            r1 = r16
            int r3 = getChildMeasureSpec(r0, r1, r3)
            r10 = r4
            r11 = r5
            r12 = r9
            r9 = r3
            goto L_0x01f3
        L_0x02c1:
            r3 = -2
            if (r9 != r3) goto L_0x0318
            r3 = 1
        L_0x02c5:
            r0 = r23
            r1 = r16
            int r5 = getChildMeasureSpec(r0, r1, r9)
            r10 = r4
            r11 = r3
            r12 = r9
            r9 = r5
            goto L_0x01f3
        L_0x02d3:
            r3 = -2
            r0 = r24
            int r3 = getChildMeasureSpec(r0, r15, r3)
            r6 = 1
            r4 = 0
            r5 = r8
            goto L_0x0224
        L_0x02df:
            r3 = -1
            if (r8 != r3) goto L_0x02ed
            r3 = -1
            r0 = r24
            int r3 = getChildMeasureSpec(r0, r15, r3)
            r4 = r7
            r5 = r8
            goto L_0x0224
        L_0x02ed:
            r3 = -2
            if (r8 != r3) goto L_0x0316
            r3 = 1
        L_0x02f1:
            r0 = r24
            int r4 = getChildMeasureSpec(r0, r15, r8)
            r6 = r3
            r5 = r8
            r3 = r4
            r4 = r7
            goto L_0x0224
        L_0x02fd:
            r3 = 0
            goto L_0x023f
        L_0x0300:
            r3 = 0
            goto L_0x0248
        L_0x0303:
            android.support.constraint.a.a.p r3 = r19.mo280v()
            r3.mo355c()
            goto L_0x0276
        L_0x030c:
            android.support.constraint.a.a.p r3 = r19.mo282w()
            r3.mo355c()
            goto L_0x027f
        L_0x0315:
            return
        L_0x0316:
            r3 = r6
            goto L_0x02f1
        L_0x0318:
            r3 = r5
            goto L_0x02c5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m28b(int, int):void");
    }

    /* renamed from: b */
    private void m29b(AttributeSet attributeSet) {
        this.f40d.mo204a((Object) this);
        this.f39c.put(getId(), this);
        this.f53v = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0108h.C0111c.ConstraintLayout_Layout_android_minWidth) {
                    this.f47p = obtainStyledAttributes.getDimensionPixelOffset(index, this.f47p);
                } else if (index == C0108h.C0111c.ConstraintLayout_Layout_android_minHeight) {
                    this.f48q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f48q);
                } else if (index == C0108h.C0111c.ConstraintLayout_Layout_android_maxWidth) {
                    this.f49r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f49r);
                } else if (index == C0108h.C0111c.ConstraintLayout_Layout_android_maxHeight) {
                    this.f50s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f50s);
                } else if (index == C0108h.C0111c.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f52u = obtainStyledAttributes.getInt(index, this.f52u);
                } else if (index == C0108h.C0111c.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f53v = new C0100c();
                        this.f53v.mo485b(getContext(), resourceId);
                    } catch (Resources.NotFoundException e) {
                        this.f53v = null;
                    }
                    this.f54w = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f40d.mo290E(this.f52u);
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x040d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30c() {
        /*
            r14 = this;
            boolean r12 = r14.isInEditMode()
            int r13 = r14.getChildCount()
            if (r12 == 0) goto L_0x0048
            r0 = 0
            r1 = r0
        L_0x000c:
            if (r1 >= r13) goto L_0x0048
            android.view.View r2 = r14.getChildAt(r1)
            android.content.res.Resources r0 = r14.getResources()     // Catch:{ NotFoundException -> 0x041a }
            int r3 = r2.getId()     // Catch:{ NotFoundException -> 0x041a }
            java.lang.String r0 = r0.getResourceName(r3)     // Catch:{ NotFoundException -> 0x041a }
            r3 = 0
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x041a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x041a }
            r14.mo31a(r3, r0, r4)     // Catch:{ NotFoundException -> 0x041a }
            r3 = 47
            int r3 = r0.indexOf(r3)     // Catch:{ NotFoundException -> 0x041a }
            r4 = -1
            if (r3 == r4) goto L_0x0039
            int r3 = r3 + 1
            java.lang.String r0 = r0.substring(r3)     // Catch:{ NotFoundException -> 0x041a }
        L_0x0039:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x041a }
            android.support.constraint.a.a.h r2 = r14.m26b((int) r2)     // Catch:{ NotFoundException -> 0x041a }
            r2.mo245c((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x041a }
        L_0x0044:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x000c
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 >= r13) goto L_0x005c
            android.view.View r1 = r14.getChildAt(r0)
            android.support.constraint.a.a.h r1 = r14.mo28a((android.view.View) r1)
            if (r1 != 0) goto L_0x0058
        L_0x0055:
            int r0 = r0 + 1
            goto L_0x0049
        L_0x0058:
            r1.mo273s()
            goto L_0x0055
        L_0x005c:
            int r0 = r14.f54w
            r1 = -1
            if (r0 == r1) goto L_0x0081
            r0 = 0
            r1 = r0
        L_0x0063:
            if (r1 >= r13) goto L_0x0081
            android.view.View r0 = r14.getChildAt(r1)
            int r2 = r0.getId()
            int r3 = r14.f54w
            if (r2 != r3) goto L_0x007d
            boolean r2 = r0 instanceof android.support.constraint.C0103d
            if (r2 == 0) goto L_0x007d
            android.support.constraint.d r0 = (android.support.constraint.C0103d) r0
            android.support.constraint.c r0 = r0.getConstraintSet()
            r14.f53v = r0
        L_0x007d:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0063
        L_0x0081:
            android.support.constraint.c r0 = r14.f53v
            if (r0 == 0) goto L_0x008a
            android.support.constraint.c r0 = r14.f53v
            r0.mo492c((android.support.constraint.ConstraintLayout) r14)
        L_0x008a:
            android.support.constraint.a.a.i r0 = r14.f40d
            r0.mo369aP()
            java.util.ArrayList<android.support.constraint.b> r0 = r14.f45n
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x00aa
            r0 = 0
            r1 = r0
        L_0x0099:
            if (r1 >= r2) goto L_0x00aa
            java.util.ArrayList<android.support.constraint.b> r0 = r14.f45n
            java.lang.Object r0 = r0.get(r1)
            android.support.constraint.b r0 = (android.support.constraint.C0099b) r0
            r0.mo452a((android.support.constraint.ConstraintLayout) r14)
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0099
        L_0x00aa:
            r0 = 0
            r1 = r0
        L_0x00ac:
            if (r1 >= r13) goto L_0x00bf
            android.view.View r0 = r14.getChildAt(r1)
            boolean r2 = r0 instanceof android.support.constraint.C0107g
            if (r2 == 0) goto L_0x00bb
            android.support.constraint.g r0 = (android.support.constraint.C0107g) r0
            r0.mo547a((android.support.constraint.ConstraintLayout) r14)
        L_0x00bb:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00ac
        L_0x00bf:
            r0 = 0
            r11 = r0
        L_0x00c1:
            if (r11 >= r13) goto L_0x0419
            android.view.View r2 = r14.getChildAt(r11)
            android.support.constraint.a.a.h r0 = r14.mo28a((android.view.View) r2)
            if (r0 != 0) goto L_0x00d1
        L_0x00cd:
            int r0 = r11 + 1
            r11 = r0
            goto L_0x00c1
        L_0x00d1:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r8 = r1
            android.support.constraint.ConstraintLayout$a r8 = (android.support.constraint.ConstraintLayout.C0052a) r8
            r8.mo60b()
            boolean r1 = r8.f106aE
            if (r1 == 0) goto L_0x0129
            r1 = 0
            r8.f106aE = r1
        L_0x00e2:
            int r1 = r2.getVisibility()
            r0.mo258i(r1)
            boolean r1 = r8.f125as
            if (r1 == 0) goto L_0x00f2
            r1 = 8
            r0.mo258i(r1)
        L_0x00f2:
            r0.mo204a((java.lang.Object) r2)
            android.support.constraint.a.a.i r1 = r14.f40d
            r1.mo371f(r0)
            boolean r1 = r8.f121ao
            if (r1 == 0) goto L_0x0102
            boolean r1 = r8.f120an
            if (r1 != 0) goto L_0x0107
        L_0x0102:
            java.util.ArrayList<android.support.constraint.a.a.h> r1 = r14.f46o
            r1.add(r0)
        L_0x0107:
            boolean r1 = r8.f123aq
            if (r1 == 0) goto L_0x016d
            android.support.constraint.a.a.k r0 = (android.support.constraint.p003a.p004a.C0076k) r0
            int r3 = r8.f102aA
            int r2 = r8.f103aB
            float r1 = r8.f104aC
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 17
            if (r4 >= r5) goto L_0x011f
            int r3 = r8.f133s
            int r2 = r8.f134t
            float r1 = r8.f135u
        L_0x011f:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x015d
            r0.mo320e((float) r1)
            goto L_0x00cd
        L_0x0129:
            if (r12 == 0) goto L_0x00e2
            android.content.res.Resources r1 = r14.getResources()     // Catch:{ NotFoundException -> 0x015b }
            int r3 = r2.getId()     // Catch:{ NotFoundException -> 0x015b }
            java.lang.String r1 = r1.getResourceName(r3)     // Catch:{ NotFoundException -> 0x015b }
            r3 = 0
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x015b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x015b }
            r14.mo31a(r3, r1, r4)     // Catch:{ NotFoundException -> 0x015b }
            java.lang.String r3 = "id/"
            int r3 = r1.indexOf(r3)     // Catch:{ NotFoundException -> 0x015b }
            int r3 = r3 + 3
            java.lang.String r1 = r1.substring(r3)     // Catch:{ NotFoundException -> 0x015b }
            int r3 = r2.getId()     // Catch:{ NotFoundException -> 0x015b }
            android.support.constraint.a.a.h r3 = r14.m26b((int) r3)     // Catch:{ NotFoundException -> 0x015b }
            r3.mo245c((java.lang.String) r1)     // Catch:{ NotFoundException -> 0x015b }
            goto L_0x00e2
        L_0x015b:
            r1 = move-exception
            goto L_0x00e2
        L_0x015d:
            r1 = -1
            if (r3 == r1) goto L_0x0165
            r0.mo321e((int) r3)
            goto L_0x00cd
        L_0x0165:
            r1 = -1
            if (r2 == r1) goto L_0x00cd
            r0.mo323f(r2)
            goto L_0x00cd
        L_0x016d:
            int r1 = r8.f136v
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f137w
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f138x
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f139y
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f84I
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f83H
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f85J
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f86K
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f140z
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f76A
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f77B
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f78C
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f79D
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f115ai
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f116aj
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.f80E
            r2 = -1
            if (r1 != r2) goto L_0x01c7
            int r1 = r8.width
            r2 = -1
            if (r1 == r2) goto L_0x01c7
            int r1 = r8.height
            r2 = -1
            if (r1 != r2) goto L_0x00cd
        L_0x01c7:
            int r7 = r8.f126at
            int r6 = r8.f127au
            int r4 = r8.f128av
            int r3 = r8.f129aw
            int r5 = r8.f130ax
            int r2 = r8.f131ay
            float r1 = r8.f132az
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 17
            if (r9 >= r10) goto L_0x041d
            int r7 = r8.f136v
            int r6 = r8.f137w
            int r4 = r8.f138x
            int r3 = r8.f139y
            int r5 = r8.f87L
            int r2 = r8.f89N
            float r1 = r8.f93R
            r9 = -1
            if (r7 != r9) goto L_0x01f6
            r9 = -1
            if (r6 != r9) goto L_0x01f6
            int r9 = r8.f84I
            r10 = -1
            if (r9 == r10) goto L_0x02a9
            int r7 = r8.f84I
        L_0x01f6:
            r9 = -1
            if (r4 != r9) goto L_0x041d
            r9 = -1
            if (r3 != r9) goto L_0x041d
            int r9 = r8.f85J
            r10 = -1
            if (r9 == r10) goto L_0x02b2
            int r4 = r8.f85J
            r9 = r1
            r10 = r4
            r1 = r6
            r6 = r2
            r2 = r7
            r7 = r3
        L_0x0209:
            int r3 = r8.f80E
            r4 = -1
            if (r3 == r4) goto L_0x02c1
            int r1 = r8.f80E
            android.support.constraint.a.a.h r1 = r14.m26b((int) r1)
            if (r1 == 0) goto L_0x021d
            float r2 = r8.f82G
            int r3 = r8.f81F
            r0.mo202a((android.support.constraint.p003a.p004a.C0070h) r1, (float) r2, (int) r3)
        L_0x021d:
            if (r12 == 0) goto L_0x0230
            int r1 = r8.f115ai
            r2 = -1
            if (r1 != r2) goto L_0x0229
            int r1 = r8.f116aj
            r2 = -1
            if (r1 == r2) goto L_0x0230
        L_0x0229:
            int r1 = r8.f115ai
            int r2 = r8.f116aj
            r0.mo235b(r1, r2)
        L_0x0230:
            boolean r1 = r8.f120an
            if (r1 != 0) goto L_0x03f6
            int r1 = r8.width
            r2 = -1
            if (r1 != r2) goto L_0x03eb
            android.support.constraint.a.a.h$b r1 = android.support.constraint.p003a.p004a.C0070h.C0073b.MATCH_PARENT
            r0.mo201a((android.support.constraint.p003a.p004a.C0070h.C0073b) r1)
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            int r2 = r8.leftMargin
            r1.f249g = r2
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            int r2 = r8.rightMargin
            r1.f249g = r2
        L_0x0252:
            boolean r1 = r8.f121ao
            if (r1 != 0) goto L_0x040d
            int r1 = r8.height
            r2 = -1
            if (r1 != r2) goto L_0x0402
            android.support.constraint.a.a.h$b r1 = android.support.constraint.p003a.p004a.C0070h.C0073b.MATCH_PARENT
            r0.mo237b((android.support.constraint.p003a.p004a.C0070h.C0073b) r1)
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            int r2 = r8.topMargin
            r1.f249g = r2
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            int r2 = r8.bottomMargin
            r1.f249g = r2
        L_0x0274:
            java.lang.String r1 = r8.f95T
            if (r1 == 0) goto L_0x027d
            java.lang.String r1 = r8.f95T
            r0.mo250d((java.lang.String) r1)
        L_0x027d:
            float r1 = r8.f98W
            r0.mo241c((float) r1)
            float r1 = r8.f99X
            r0.mo247d((float) r1)
            int r1 = r8.f100Y
            r0.mo156A(r1)
            int r1 = r8.f101Z
            r0.mo158B(r1)
            int r1 = r8.f107aa
            int r2 = r8.f109ac
            int r3 = r8.f111ae
            float r4 = r8.f113ag
            r0.mo189a((int) r1, (int) r2, (int) r3, (float) r4)
            int r1 = r8.f108ab
            int r2 = r8.f110ad
            int r3 = r8.f112af
            float r4 = r8.f114ah
            r0.mo236b(r1, r2, r3, r4)
            goto L_0x00cd
        L_0x02a9:
            int r9 = r8.f83H
            r10 = -1
            if (r9 == r10) goto L_0x01f6
            int r6 = r8.f83H
            goto L_0x01f6
        L_0x02b2:
            int r9 = r8.f86K
            r10 = -1
            if (r9 == r10) goto L_0x041d
            int r3 = r8.f86K
            r9 = r1
            r10 = r4
            r1 = r6
            r6 = r2
            r2 = r7
            r7 = r3
            goto L_0x0209
        L_0x02c1:
            r3 = -1
            if (r2 == r3) goto L_0x038e
            android.support.constraint.a.a.h r2 = r14.m26b((int) r2)
            if (r2 == 0) goto L_0x02d3
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            int r4 = r8.leftMargin
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
        L_0x02d3:
            r1 = -1
            if (r10 == r1) goto L_0x03a2
            android.support.constraint.a.a.h r2 = r14.m26b((int) r10)
            if (r2 == 0) goto L_0x02e6
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            int r4 = r8.rightMargin
            r5 = r6
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
        L_0x02e6:
            int r1 = r8.f140z
            r2 = -1
            if (r1 == r2) goto L_0x03b7
            int r1 = r8.f140z
            android.support.constraint.a.a.h r2 = r14.m26b((int) r1)
            if (r2 == 0) goto L_0x02fe
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            int r4 = r8.topMargin
            int r5 = r8.f88M
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
        L_0x02fe:
            int r1 = r8.f77B
            r2 = -1
            if (r1 == r2) goto L_0x03d1
            int r1 = r8.f77B
            android.support.constraint.a.a.h r2 = r14.m26b((int) r1)
            if (r2 == 0) goto L_0x0316
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            int r4 = r8.bottomMargin
            int r5 = r8.f90O
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
        L_0x0316:
            int r1 = r8.f79D
            r2 = -1
            if (r1 == r2) goto L_0x036a
            android.util.SparseArray<android.view.View> r1 = r14.f39c
            int r2 = r8.f79D
            java.lang.Object r1 = r1.get(r2)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f79D
            android.support.constraint.a.a.h r2 = r14.m26b((int) r2)
            if (r2 == 0) goto L_0x036a
            if (r1 == 0) goto L_0x036a
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof android.support.constraint.ConstraintLayout.C0052a
            if (r3 == 0) goto L_0x036a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.constraint.ConstraintLayout$a r1 = (android.support.constraint.ConstraintLayout.C0052a) r1
            r3 = 1
            r8.f122ap = r3
            r3 = 1
            r1.f122ap = r3
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.BASELINE
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.BASELINE
            android.support.constraint.a.a.e r2 = r2.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r3)
            r3 = 0
            r4 = -1
            android.support.constraint.a.a.e$b r5 = android.support.constraint.p003a.p004a.C0060e.C0063b.STRONG
            r6 = 0
            r7 = 1
            r1.mo111a(r2, r3, r4, r5, r6, r7)
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            r1.mo127j()
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            android.support.constraint.a.a.e r1 = r0.mo185a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1)
            r1.mo127j()
        L_0x036a:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0378
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0378
            r0.mo186a((float) r9)
        L_0x0378:
            float r1 = r8.f94S
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x021d
            float r1 = r8.f94S
            r2 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x021d
            float r1 = r8.f94S
            r0.mo234b((float) r1)
            goto L_0x021d
        L_0x038e:
            r2 = -1
            if (r1 == r2) goto L_0x02d3
            android.support.constraint.a.a.h r2 = r14.m26b((int) r1)
            if (r2 == 0) goto L_0x02d3
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.LEFT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            int r4 = r8.leftMargin
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
            goto L_0x02d3
        L_0x03a2:
            r1 = -1
            if (r7 == r1) goto L_0x02e6
            android.support.constraint.a.a.h r2 = r14.m26b((int) r7)
            if (r2 == 0) goto L_0x02e6
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.RIGHT
            int r4 = r8.rightMargin
            r5 = r6
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
            goto L_0x02e6
        L_0x03b7:
            int r1 = r8.f76A
            r2 = -1
            if (r1 == r2) goto L_0x02fe
            int r1 = r8.f76A
            android.support.constraint.a.a.h r2 = r14.m26b((int) r1)
            if (r2 == 0) goto L_0x02fe
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.TOP
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            int r4 = r8.topMargin
            int r5 = r8.f88M
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
            goto L_0x02fe
        L_0x03d1:
            int r1 = r8.f78C
            r2 = -1
            if (r1 == r2) goto L_0x0316
            int r1 = r8.f78C
            android.support.constraint.a.a.h r2 = r14.m26b((int) r1)
            if (r2 == 0) goto L_0x0316
            android.support.constraint.a.a.e$c r1 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            android.support.constraint.a.a.e$c r3 = android.support.constraint.p003a.p004a.C0060e.C0064c.BOTTOM
            int r4 = r8.bottomMargin
            int r5 = r8.f90O
            r0.mo194a((android.support.constraint.p003a.p004a.C0060e.C0064c) r1, (android.support.constraint.p003a.p004a.C0070h) r2, (android.support.constraint.p003a.p004a.C0060e.C0064c) r3, (int) r4, (int) r5)
            goto L_0x0316
        L_0x03eb:
            android.support.constraint.a.a.h$b r1 = android.support.constraint.p003a.p004a.C0070h.C0073b.MATCH_CONSTRAINT
            r0.mo201a((android.support.constraint.p003a.p004a.C0070h.C0073b) r1)
            r1 = 0
            r0.mo271r(r1)
            goto L_0x0252
        L_0x03f6:
            android.support.constraint.a.a.h$b r1 = android.support.constraint.p003a.p004a.C0070h.C0073b.FIXED
            r0.mo201a((android.support.constraint.p003a.p004a.C0070h.C0073b) r1)
            int r1 = r8.width
            r0.mo271r(r1)
            goto L_0x0252
        L_0x0402:
            android.support.constraint.a.a.h$b r1 = android.support.constraint.p003a.p004a.C0070h.C0073b.MATCH_CONSTRAINT
            r0.mo237b((android.support.constraint.p003a.p004a.C0070h.C0073b) r1)
            r1 = 0
            r0.mo274s(r1)
            goto L_0x0274
        L_0x040d:
            android.support.constraint.a.a.h$b r1 = android.support.constraint.p003a.p004a.C0070h.C0073b.FIXED
            r0.mo237b((android.support.constraint.p003a.p004a.C0070h.C0073b) r1)
            int r1 = r8.height
            r0.mo274s(r1)
            goto L_0x0274
        L_0x0419:
            return
        L_0x041a:
            r0 = move-exception
            goto L_0x0044
        L_0x041d:
            r9 = r1
            r10 = r4
            r1 = r6
            r6 = r2
            r2 = r7
            r7 = r3
            goto L_0x0209
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.ConstraintLayout.m30c():void");
    }

    /* renamed from: c */
    private void m31c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        C0070h.C0073b bVar = C0070h.C0073b.FIXED;
        C0070h.C0073b bVar2 = C0070h.C0073b.FIXED;
        getLayoutParams();
        switch (mode) {
            case Integer.MIN_VALUE:
                bVar = C0070h.C0073b.WRAP_CONTENT;
                break;
            case 0:
                bVar = C0070h.C0073b.WRAP_CONTENT;
                size = 0;
                break;
            case 1073741824:
                size = Math.min(this.f49r, size) - paddingLeft;
                break;
            default:
                size = 0;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                bVar2 = C0070h.C0073b.WRAP_CONTENT;
                break;
            case 0:
                bVar2 = C0070h.C0073b.WRAP_CONTENT;
                size2 = 0;
                break;
            case 1073741824:
                size2 = Math.min(this.f50s, size2) - paddingTop;
                break;
            default:
                size2 = 0;
                break;
        }
        this.f40d.mo276t(0);
        this.f40d.mo278u(0);
        this.f40d.mo201a(bVar);
        this.f40d.mo271r(size);
        this.f40d.mo237b(bVar2);
        this.f40d.mo274s(size2);
        this.f40d.mo276t((this.f47p - getPaddingLeft()) - getPaddingRight());
        this.f40d.mo278u((this.f48q - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: d */
    private void m32d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof C0107g) {
                ((C0107g) childAt).mo548b(this);
            }
        }
        int size = this.f45n.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.f45n.get(i2).mo455c(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0052a generateDefaultLayoutParams() {
        return new C0052a(-2, -2);
    }

    /* renamed from: a */
    public C0052a generateLayoutParams(AttributeSet attributeSet) {
        return new C0052a(getContext(), attributeSet);
    }

    /* renamed from: a */
    public final C0070h mo28a(View view) {
        if (view == this) {
            return this.f40d;
        }
        if (view == null) {
            return null;
        }
        return ((C0052a) view.getLayoutParams()).f105aD;
    }

    /* renamed from: a */
    public View mo29a(int i) {
        return this.f39c.get(i);
    }

    /* renamed from: a */
    public Object mo30a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            if (this.f55x != null && this.f55x.containsKey(str)) {
                return this.f55x.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo31a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f55x == null) {
                this.f55x = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f55x.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* renamed from: a */
    public void mo32a(C0092f fVar) {
        this.f38A = fVar;
        this.f40d.mo294a(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33a(String str) {
        this.f40d.mo299aF();
        if (this.f38A != null) {
            this.f38A.f572c++;
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0052a;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int parseInt2 = (int) ((((float) Integer.parseInt(split[1])) / 1920.0f) * height);
                        int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                        int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(C0538a.f2113c);
                        canvas.drawLine((float) i2, (float) parseInt2, (float) (i2 + parseInt3), (float) parseInt2, paint);
                        canvas.drawLine((float) (i2 + parseInt3), (float) parseInt2, (float) (i2 + parseInt3), (float) (parseInt2 + parseInt4), paint);
                        canvas.drawLine((float) (i2 + parseInt3), (float) (parseInt2 + parseInt4), (float) i2, (float) (parseInt2 + parseInt4), paint);
                        canvas.drawLine((float) i2, (float) (parseInt2 + parseInt4), (float) i2, (float) parseInt2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine((float) i2, (float) parseInt2, (float) (i2 + parseInt3), (float) (parseInt2 + parseInt4), paint);
                        canvas.drawLine((float) i2, (float) (parseInt2 + parseInt4), (float) (i2 + parseInt3), (float) parseInt2, paint);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0052a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f50s;
    }

    public int getMaxWidth() {
        return this.f49r;
    }

    public int getMinHeight() {
        return this.f48q;
    }

    public int getMinWidth() {
        return this.f47p;
    }

    public int getOptimizationLevel() {
        return this.f40d.mo295aB();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0052a aVar = (C0052a) childAt.getLayoutParams();
            C0070h hVar = aVar.f105aD;
            if ((childAt.getVisibility() != 8 || aVar.f123aq || aVar.f124ar || isInEditMode) && !aVar.f125as) {
                int S = hVar.mo177S();
                int T = hVar.mo178T();
                int M = S + hVar.mo171M();
                int Q = T + hVar.mo175Q();
                childAt.layout(S, T, M, Q);
                if ((childAt instanceof C0107g) && (content = ((C0107g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(S, T, M, Q);
                }
            }
        }
        int size = this.f45n.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f45n.get(i6).mo454b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        int baseline;
        System.currentTimeMillis();
        int i8 = 0;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.f40d.mo262l(paddingLeft);
        this.f40d.mo263m(paddingTop);
        this.f40d.mo254g(this.f49r);
        this.f40d.mo256h(this.f50s);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f40d.mo308d(getLayoutDirection() == 1 ? f36l : false);
        }
        m31c(i, i2);
        int M = this.f40d.mo171M();
        int Q = this.f40d.mo175Q();
        boolean z3 = false;
        if (this.f51t) {
            this.f51t = false;
            m27b();
            z3 = f36l;
        }
        boolean z4 = (this.f52u & 8) == 8;
        if (z4) {
            this.f40d.mo300aG();
            this.f40d.mo310j(M, Q);
            m28b(i, i2);
        } else {
            m25a(i, i2);
        }
        m32d();
        if (getChildCount() > 0 && z3) {
            C0056a.m70a(this.f40d);
        }
        if (this.f40d.f443bb) {
            if (this.f40d.f444bc && mode == Integer.MIN_VALUE) {
                if (this.f40d.f446be < size) {
                    this.f40d.mo271r(this.f40d.f446be);
                }
                this.f40d.mo201a(C0070h.C0073b.FIXED);
            }
            if (this.f40d.f445bd && mode2 == Integer.MIN_VALUE) {
                if (this.f40d.f447bf < size2) {
                    this.f40d.mo274s(this.f40d.f447bf);
                }
                this.f40d.mo237b(C0070h.C0073b.FIXED);
            }
        }
        if ((this.f52u & 32) == 32) {
            int M2 = this.f40d.mo171M();
            int Q2 = this.f40d.mo175Q();
            if (this.f56y != M2 && mode == 1073741824) {
                C0056a.m72a(this.f40d.f442ba, 0, M2);
            }
            if (this.f57z != Q2 && mode2 == 1073741824) {
                C0056a.m72a(this.f40d.f442ba, 1, Q2);
            }
            if (this.f40d.f444bc && this.f40d.f446be > size) {
                C0056a.m72a(this.f40d.f442ba, 0, size);
            }
            if (this.f40d.f445bd && this.f40d.f447bf > size2) {
                C0056a.m72a(this.f40d.f442ba, 1, size2);
            }
        }
        if (getChildCount() > 0) {
            mo33a("First pass");
        }
        int i9 = 0;
        int size3 = this.f46o.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            boolean z5 = false;
            boolean z6 = this.f40d.mo229av() == C0070h.C0073b.WRAP_CONTENT;
            boolean z7 = this.f40d.mo230aw() == C0070h.C0073b.WRAP_CONTENT;
            int max = Math.max(this.f40d.mo171M(), this.f47p);
            int max2 = Math.max(this.f40d.mo175Q(), this.f48q);
            int i10 = 0;
            while (i10 < size3) {
                C0070h hVar = this.f46o.get(i10);
                View view = (View) hVar.mo218ak();
                if (view == null) {
                    i4 = i9;
                    i5 = i8;
                } else {
                    C0052a aVar = (C0052a) view.getLayoutParams();
                    if (aVar.f124ar) {
                        i4 = i9;
                        i5 = i8;
                    } else if (aVar.f123aq) {
                        i4 = i9;
                        i5 = i8;
                    } else if (view.getVisibility() == 8) {
                        i4 = i9;
                        i5 = i8;
                    } else if (!z4 || !hVar.mo280v().mo360h() || !hVar.mo282w().mo360h()) {
                        view.measure((aVar.width != -2 || !aVar.f120an) ? View.MeasureSpec.makeMeasureSpec(hVar.mo171M(), 1073741824) : getChildMeasureSpec(i, paddingRight, aVar.width), (aVar.height != -2 || !aVar.f121ao) ? View.MeasureSpec.makeMeasureSpec(hVar.mo175Q(), 1073741824) : getChildMeasureSpec(i2, paddingBottom, aVar.height));
                        if (this.f38A != null) {
                            this.f38A.f571b++;
                        }
                        int i11 = i8 + 1;
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        if (measuredWidth != hVar.mo171M()) {
                            hVar.mo271r(measuredWidth);
                            if (z4) {
                                hVar.mo280v().mo354a(measuredWidth);
                            }
                            i6 = (!z6 || hVar.mo212ae() <= max) ? max : Math.max(max, hVar.mo212ae() + hVar.mo185a(C0060e.C0064c.RIGHT).mo122e());
                            z = f36l;
                        } else {
                            i6 = max;
                            z = z5;
                        }
                        if (measuredHeight != hVar.mo175Q()) {
                            hVar.mo274s(measuredHeight);
                            if (z4) {
                                hVar.mo282w().mo354a(measuredHeight);
                            }
                            i7 = (!z7 || hVar.mo213af() <= max2) ? max2 : Math.max(max2, hVar.mo213af() + hVar.mo185a(C0060e.C0064c.BOTTOM).mo122e());
                            z2 = f36l;
                        } else {
                            z2 = z;
                            i7 = max2;
                        }
                        if (!(!aVar.f122ap || (baseline = view.getBaseline()) == -1 || baseline == hVar.mo217aj())) {
                            hVar.mo286y(baseline);
                            z2 = f36l;
                        }
                        if (Build.VERSION.SDK_INT >= 11) {
                            i4 = combineMeasuredStates(i9, view.getMeasuredState());
                            max2 = i7;
                            z5 = z2;
                            i5 = i11;
                            max = i6;
                        } else {
                            max2 = i7;
                            z5 = z2;
                            i4 = i9;
                            i5 = i11;
                            max = i6;
                        }
                    } else {
                        i4 = i9;
                        i5 = i8;
                    }
                }
                i10++;
                i9 = i4;
                i8 = i5;
            }
            if (z5) {
                this.f40d.mo271r(M);
                this.f40d.mo274s(Q);
                if (z4) {
                    this.f40d.mo301aH();
                }
                mo33a("2nd pass");
                boolean z8 = false;
                if (this.f40d.mo171M() < max) {
                    this.f40d.mo271r(max);
                    z8 = f36l;
                }
                if (this.f40d.mo175Q() < max2) {
                    this.f40d.mo274s(max2);
                    z8 = f36l;
                }
                if (z8) {
                    mo33a("3rd pass");
                }
            }
            int i12 = 0;
            int i13 = 0;
            while (i12 < size3) {
                C0070h hVar2 = this.f46o.get(i12);
                View view2 = (View) hVar2.mo218ak();
                if (view2 == null) {
                    i3 = i13;
                } else if ((view2.getMeasuredWidth() == hVar2.mo171M() && view2.getMeasuredHeight() == hVar2.mo175Q()) || hVar2.mo163E() == 8) {
                    i3 = i13;
                } else {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(hVar2.mo171M(), 1073741824), View.MeasureSpec.makeMeasureSpec(hVar2.mo175Q(), 1073741824));
                    if (this.f38A != null) {
                        this.f38A.f571b++;
                    }
                    i3 = i13 + 1;
                }
                i12++;
                i13 = i3;
            }
        }
        int M3 = this.f40d.mo171M() + paddingRight;
        int Q3 = this.f40d.mo175Q() + paddingBottom;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = resolveSizeAndState(M3, i, i9);
            int resolveSizeAndState2 = resolveSizeAndState(Q3, i2, i9 << 16);
            int i14 = resolveSizeAndState & C1040ar.f3484r;
            int i15 = resolveSizeAndState2 & C1040ar.f3484r;
            int min = Math.min(this.f49r, i14);
            int min2 = Math.min(this.f50s, i15);
            if (this.f40d.mo296aC()) {
                min |= 16777216;
            }
            if (this.f40d.mo297aD()) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f56y = min;
            this.f57z = min2;
            return;
        }
        setMeasuredDimension(M3, Q3);
        this.f56y = M3;
        this.f57z = Q3;
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0070h a = mo28a(view);
        if ((view instanceof C0106f) && !(a instanceof C0076k)) {
            C0052a aVar = (C0052a) view.getLayoutParams();
            aVar.f105aD = new C0076k();
            aVar.f123aq = f36l;
            ((C0076k) aVar.f105aD).mo86a(aVar.f117ak);
        }
        if (view instanceof C0099b) {
            C0099b bVar = (C0099b) view;
            bVar.mo453b();
            ((C0052a) view.getLayoutParams()).f124ar = f36l;
            if (!this.f45n.contains(bVar)) {
                this.f45n.add(bVar);
            }
        }
        this.f39c.put(view.getId(), view);
        this.f51t = f36l;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f39c.remove(view.getId());
        C0070h a = mo28a(view);
        this.f40d.mo372g(a);
        this.f45n.remove(view);
        this.f46o.remove(a);
        this.f51t = f36l;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f51t = f36l;
        this.f56y = -1;
        this.f57z = -1;
        this.f41e = -1;
        this.f42f = -1;
        this.f43g = 0;
        this.f44h = 0;
    }

    public void setConstraintSet(C0100c cVar) {
        this.f53v = cVar;
    }

    public void setId(int i) {
        this.f39c.remove(getId());
        super.setId(i);
        this.f39c.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f50s) {
            this.f50s = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f49r) {
            this.f49r = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f48q) {
            this.f48q = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f47p) {
            this.f47p = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f40d.mo290E(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
