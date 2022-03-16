package com.imlabworld.HS_Instructor;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.ac */
public class C2334ac {

    /* renamed from: A */
    private final C2335a[][] f7749A = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.AIRWAY, C2335a.CHECKBREATH}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.COMP3, C2335a.BREATH3}};

    /* renamed from: B */
    private final boolean f7750B;

    /* renamed from: C */
    private int f7751C;

    /* renamed from: D */
    private final int[] f7752D = new int[4];

    /* renamed from: E */
    private final int[] f7753E = new int[4];

    /* renamed from: F */
    private final int[] f7754F = new int[3];

    /* renamed from: G */
    private final int[] f7755G = new int[2];

    /* renamed from: a */
    C2336b f7756a = C2336b.TEST;

    /* renamed from: b */
    final Pair<Boolean, Long>[][] f7757b = ((Pair[][]) Array.newInstance(Pair.class, new int[]{4, 5}));

    /* renamed from: c */
    final Pair<Boolean, Long>[][] f7758c = ((Pair[][]) Array.newInstance(Pair.class, new int[]{4, 6}));

    /* renamed from: d */
    final Pair<Boolean, Long>[][] f7759d = ((Pair[][]) Array.newInstance(Pair.class, new int[]{3, 5}));

    /* renamed from: e */
    final Pair<Boolean, Long>[][] f7760e = ((Pair[][]) Array.newInstance(Pair.class, new int[]{2, 6}));

    /* renamed from: f */
    boolean f7761f;

    /* renamed from: g */
    boolean f7762g;

    /* renamed from: h */
    double f7763h;

    /* renamed from: i */
    double f7764i;

    /* renamed from: j */
    double f7765j;

    /* renamed from: k */
    double f7766k;

    /* renamed from: l */
    double f7767l;

    /* renamed from: m */
    double f7768m;

    /* renamed from: n */
    double f7769n;

    /* renamed from: o */
    int f7770o;

    /* renamed from: p */
    private final C2335a[][] f7771p = {new C2335a[]{C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.CHECKBREATH, C2335a.CHECKPULSE}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.HOT2}, new C2335a[]{C2335a.AED1_BLS, C2335a.AED2_BLS, C2335a.AED3_BLS, C2335a.AED4_BLS, C2335a.AED5_BLS}, new C2335a[]{C2335a.CONT_CPR_BLS}};

    /* renamed from: q */
    private final C2335a[][] f7772q = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.AIRWAY, C2335a.CHECKBREATH, C2335a.EMERGENCY}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.HOT2}, new C2335a[]{C2335a.AED1_BLS, C2335a.AED2_BLS, C2335a.AED3_BLS, C2335a.AED4_BLS, C2335a.AED5_BLS}, new C2335a[]{C2335a.CONT_CPR_BLS}};

    /* renamed from: r */
    private final C2335a[][] f7773r = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.AIRWAY, C2335a.CHECKBREATH}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.HOT2}, new C2335a[]{C2335a.AED1_BLS, C2335a.AED2_BLS, C2335a.AED3_BLS, C2335a.AED4_BLS, C2335a.AED5_BLS}, new C2335a[]{C2335a.CONT_CPR_BLS}};

    /* renamed from: s */
    private final C2335a[][] f7774s = {new C2335a[]{C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.CHECKBREATH}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.COMP3, C2335a.BREATH3}, new C2335a[]{C2335a.AED1_LAY, C2335a.AED2_LAY, C2335a.AED3_LAY, C2335a.AED4_LAY, C2335a.AED5_LAY, C2335a.AED6_LAY}, new C2335a[]{C2335a.CONT_CPR_LAY}};

    /* renamed from: t */
    private final C2335a[][] f7775t = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.AIRWAY, C2335a.CHECKBREATH, C2335a.EMERGENCY}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.COMP3, C2335a.BREATH3}, new C2335a[]{C2335a.AED1_LAY, C2335a.AED2_LAY, C2335a.AED3_LAY, C2335a.AED4_LAY, C2335a.AED5_LAY, C2335a.AED6_LAY}, new C2335a[]{C2335a.CONT_CPR_LAY}};

    /* renamed from: u */
    private final C2335a[][] f7776u = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.AIRWAY, C2335a.CHECKBREATH}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.COMP3, C2335a.BREATH3}, new C2335a[]{C2335a.AED1_LAY, C2335a.AED2_LAY, C2335a.AED3_LAY, C2335a.AED4_LAY, C2335a.AED5_LAY, C2335a.AED6_LAY}, new C2335a[]{C2335a.CONT_CPR_LAY}};

    /* renamed from: v */
    private final C2335a[][] f7777v = {new C2335a[]{C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.CHECKBREATH, C2335a.CHECKPULSE}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.HOT2}, new C2335a[]{C2335a.COMP3, C2335a.BREATH4}};

    /* renamed from: w */
    private final C2335a[][] f7778w = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.AIRWAY, C2335a.CHECKBREATH, C2335a.EMERGENCY}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.HOT2}, new C2335a[]{C2335a.COMP3, C2335a.BREATH4}};

    /* renamed from: x */
    private final C2335a[][] f7779x = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.AIRWAY, C2335a.CHECKBREATH}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.HOT2}, new C2335a[]{C2335a.COMP3, C2335a.BREATH4}};

    /* renamed from: y */
    private final C2335a[][] f7780y = {new C2335a[]{C2335a.CHECKRESPONSE, C2335a.EMERGENCY, C2335a.CHECKBREATH}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.COMP3, C2335a.BREATH3}};

    /* renamed from: z */
    private final C2335a[][] f7781z = {new C2335a[]{C2335a.CHECKDANGER, C2335a.CHECKRESPONSE, C2335a.AIRWAY, C2335a.CHECKBREATH, C2335a.EMERGENCY}, new C2335a[]{C2335a.COMP1, C2335a.BREATH1, C2335a.COMP2, C2335a.BREATH2, C2335a.COMP3, C2335a.BREATH3}};

    /* renamed from: com.imlabworld.HS_Instructor.ac$a */
    public enum C2335a {
        CHECKDANGER(1),
        CHECKRESPONSE(2),
        EMERGENCY(3),
        AIRWAY(4),
        CHECKBREATH(5),
        CHECKPULSE(6),
        COMP1(7),
        COMP2(8),
        COMP3(9),
        BREATH1(10),
        BREATH2(11),
        BREATH3(12),
        BREATH4(13),
        HOT2(14),
        AED1_BLS(15),
        AED2_BLS(16),
        AED3_BLS(17),
        AED4_BLS(18),
        AED5_BLS(19),
        AED1_LAY(20),
        AED2_LAY(21),
        AED3_LAY(22),
        AED4_LAY(23),
        AED5_LAY(24),
        AED6_LAY(25),
        CONT_CPR_BLS(26),
        CONT_CPR_LAY(27);
        

        /* renamed from: B */
        private final int f7810B;

        private C2335a(int i) {
            this.f7810B = i;
        }

        /* renamed from: a */
        public int mo8690a() {
            return this.f7810B;
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.ac$b */
    public enum C2336b {
        TEST,
        CHECKRESULT,
        CHECKGRAPH,
        CHECKSHEET
    }

    public C2334ac() {
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                this.f7757b[i][i2] = new Pair<>(false, 0L);
            }
        }
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 6; i4++) {
                this.f7758c[i3][i4] = new Pair<>(false, 0L);
            }
        }
        for (int i5 = 0; i5 < 3; i5++) {
            for (int i6 = 0; i6 < 5; i6++) {
                this.f7759d[i5][i6] = new Pair<>(false, 0L);
            }
        }
        for (int i7 = 0; i7 < 2; i7++) {
            for (int i8 = 0; i8 < 6; i8++) {
                this.f7760e[i7][i8] = new Pair<>(false, 0L);
            }
        }
        this.f7761f = false;
        this.f7762g = false;
        this.f7770o = -1;
        this.f7750B = false;
        this.f7751C = -1;
        this.f7752D[0] = 5;
        this.f7752D[1] = 5;
        this.f7752D[2] = 5;
        this.f7752D[3] = 1;
        this.f7753E[0] = 5;
        this.f7753E[1] = 6;
        this.f7753E[2] = 6;
        this.f7753E[3] = 1;
        this.f7754F[0] = 5;
        this.f7754F[1] = 5;
        this.f7754F[2] = 2;
        this.f7755G[0] = 5;
        this.f7755G[1] = 6;
        this.f7763h = 0.0d;
        this.f7764i = 0.0d;
        this.f7765j = 0.0d;
        this.f7766k = 0.0d;
        this.f7767l = 0.0d;
        this.f7768m = 0.0d;
        this.f7769n = 0.0d;
    }

    /* renamed from: a */
    public int mo8685a() {
        return this.f7751C;
    }

    /* renamed from: a */
    public int mo8686a(C2552t tVar) {
        switch (tVar.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f7752D[0] = 4;
                this.f7753E[0] = 3;
                this.f7754F[0] = 4;
                this.f7755G[0] = 3;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                this.f7752D[0] = 5;
                this.f7753E[0] = 5;
                this.f7754F[0] = 5;
                this.f7755G[0] = 5;
                break;
        }
        switch (tVar.f9748d) {
            case 1:
                switch (tVar.f9747c) {
                    case 1:
                    case 2:
                        int i = 0;
                        int i2 = 0;
                        while (i < this.f7753E.length) {
                            int i3 = i2;
                            for (int i4 = 0; i4 < this.f7753E[i]; i4++) {
                                if (!((Boolean) this.f7758c[i][i4].first).booleanValue()) {
                                    i3++;
                                }
                            }
                            i++;
                            i2 = i3;
                        }
                        return i2;
                    case 3:
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f7755G.length) {
                            int i7 = i6;
                            for (int i8 = 0; i8 < this.f7755G[i5]; i8++) {
                                if (!((Boolean) this.f7760e[i5][i8].first).booleanValue()) {
                                    i7++;
                                }
                            }
                            i5++;
                            i6 = i7;
                        }
                        return i6;
                }
            case 2:
                switch (tVar.f9747c) {
                    case 1:
                    case 2:
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < this.f7752D.length) {
                            int i11 = i10;
                            for (int i12 = 0; i12 < this.f7752D[i9]; i12++) {
                                if (!((Boolean) this.f7757b[i9][i12].first).booleanValue()) {
                                    i11++;
                                }
                            }
                            i9++;
                            i10 = i11;
                        }
                        return i10;
                    case 3:
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < this.f7754F.length) {
                            int i15 = i14;
                            for (int i16 = 0; i16 < this.f7754F[i13]; i16++) {
                                if (!((Boolean) this.f7759d[i13][i16].first).booleanValue()) {
                                    i15++;
                                }
                            }
                            i13++;
                            i14 = i15;
                        }
                        return i14;
                }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo8687a(int i) {
        this.f7751C = i;
    }

    /* renamed from: b */
    public ArrayList<C2335a> mo8688b(C2552t tVar) {
        ArrayList<C2335a> arrayList = new ArrayList<>();
        switch (tVar.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f7752D[0] = 4;
                this.f7753E[0] = 3;
                this.f7754F[0] = 4;
                this.f7755G[0] = 3;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                this.f7752D[0] = 5;
                this.f7753E[0] = 5;
                this.f7754F[0] = 5;
                this.f7755G[0] = 5;
                break;
        }
        switch (tVar.f9748d) {
            case 1:
                switch (tVar.f9747c) {
                    case 1:
                    case 2:
                        for (int i = 0; i < this.f7753E.length; i++) {
                            for (int i2 = 0; i2 < this.f7753E[i]; i2++) {
                                if (!((Boolean) this.f7758c[i][i2].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(this.f7774s[i][i2]);
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(this.f7775t[i][i2]);
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(this.f7776u[i][i2]);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        for (int i3 = 0; i3 < this.f7755G.length; i3++) {
                            for (int i4 = 0; i4 < this.f7755G[i3]; i4++) {
                                if (!((Boolean) this.f7760e[i3][i4].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(this.f7780y[i3][i4]);
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(this.f7781z[i3][i4]);
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(this.f7749A[i3][i4]);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            case 2:
                switch (tVar.f9747c) {
                    case 1:
                    case 2:
                        for (int i5 = 0; i5 < this.f7752D.length; i5++) {
                            for (int i6 = 0; i6 < this.f7752D[i5]; i6++) {
                                if (!((Boolean) this.f7757b[i5][i6].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(this.f7771p[i5][i6]);
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(this.f7772q[i5][i6]);
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(this.f7773r[i5][i6]);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        for (int i7 = 0; i7 < this.f7754F.length; i7++) {
                            for (int i8 = 0; i8 < this.f7754F[i7]; i8++) {
                                if (!((Boolean) this.f7759d[i7][i8].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(this.f7777v[i7][i8]);
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(this.f7778w[i7][i8]);
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(this.f7779x[i7][i8]);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
        }
        return arrayList;
    }

    /* renamed from: c */
    public ArrayList<Pair<Long, C2335a>> mo8689c(C2552t tVar) {
        ArrayList<Pair<Long, C2335a>> arrayList = new ArrayList<>();
        switch (tVar.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                this.f7752D[0] = 4;
                this.f7753E[0] = 3;
                this.f7754F[0] = 4;
                this.f7755G[0] = 3;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                this.f7752D[0] = 5;
                this.f7753E[0] = 5;
                this.f7754F[0] = 5;
                this.f7755G[0] = 5;
                break;
        }
        switch (tVar.f9748d) {
            case 1:
                switch (tVar.f9747c) {
                    case 1:
                    case 2:
                        for (int i = 0; i < this.f7753E.length; i++) {
                            for (int i2 = 0; i2 < this.f7753E[i]; i2++) {
                                if (((Boolean) this.f7758c[i][i2].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(new Pair(this.f7758c[i][i2].second, this.f7774s[i][i2]));
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(new Pair(this.f7758c[i][i2].second, this.f7775t[i][i2]));
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(new Pair(this.f7758c[i][i2].second, this.f7776u[i][i2]));
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        for (int i3 = 0; i3 < this.f7755G.length; i3++) {
                            for (int i4 = 0; i4 < this.f7755G[i3]; i4++) {
                                if (((Boolean) this.f7760e[i3][i4].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(new Pair(this.f7760e[i3][i4].second, this.f7780y[i3][i4]));
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(new Pair(this.f7760e[i3][i4].second, this.f7781z[i3][i4]));
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(new Pair(this.f7760e[i3][i4].second, this.f7749A[i3][i4]));
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            case 2:
                switch (tVar.f9747c) {
                    case 1:
                    case 2:
                        for (int i5 = 0; i5 < this.f7752D.length; i5++) {
                            for (int i6 = 0; i6 < this.f7752D[i5]; i6++) {
                                if (((Boolean) this.f7757b[i5][i6].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(new Pair(this.f7757b[i5][i6].second, this.f7771p[i5][i6]));
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(new Pair(this.f7757b[i5][i6].second, this.f7772q[i5][i6]));
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(new Pair(this.f7757b[i5][i6].second, this.f7773r[i5][i6]));
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 3:
                        for (int i7 = 0; i7 < this.f7754F.length; i7++) {
                            for (int i8 = 0; i8 < this.f7754F[i7]; i8++) {
                                if (((Boolean) this.f7759d[i7][i8].first).booleanValue()) {
                                    switch (tVar.f9755k) {
                                        case 1:
                                        case 4:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            arrayList.add(new Pair(this.f7759d[i7][i8].second, this.f7777v[i7][i8]));
                                            break;
                                        case 2:
                                        case 5:
                                            arrayList.add(new Pair(this.f7759d[i7][i8].second, this.f7778w[i7][i8]));
                                            break;
                                        case 3:
                                        case 6:
                                            arrayList.add(new Pair(this.f7759d[i7][i8].second, this.f7779x[i7][i8]));
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
        }
        for (int size = arrayList.size(); size > 0; size--) {
            for (int i9 = 0; i9 < size - 1; i9++) {
                if (((Long) arrayList.get(i9).first).longValue() > ((Long) arrayList.get(i9 + 1).first).longValue()) {
                    arrayList.set(i9, arrayList.get(i9 + 1));
                    arrayList.set(i9 + 1, arrayList.get(i9));
                }
            }
        }
        return arrayList;
    }
}
