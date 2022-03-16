package com.imlabworld.HS_Instructor;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.HS_Instructor.C2396at;
import com.imlabworld.HS_Instructor.C2402au;
import com.imlabworld.HS_Instructor.C2411ax;
import com.imlabworld.HS_Instructor.C2418ay;
import com.imlabworld.HS_Instructor.C2421az;
import com.imlabworld.HS_Instructor.C2426b;
import com.imlabworld.HS_Instructor.C2429ba;
import com.imlabworld.HS_Instructor.C2433bb;
import com.imlabworld.HS_Instructor.C2436bc;
import com.imlabworld.HS_Instructor.C2439bd;
import com.imlabworld.HS_Instructor.C2442be;
import com.imlabworld.HS_Instructor.C2445bf;
import com.imlabworld.HS_Instructor.C2449bg;
import com.imlabworld.HS_Instructor.C2452bh;
import com.imlabworld.HS_Instructor.C2456bi;
import com.imlabworld.HS_Instructor.C2459bj;
import com.imlabworld.HS_Instructor.C2462bk;
import com.imlabworld.HS_Instructor.C2465bl;
import com.imlabworld.HS_Instructor.C2469bm;
import com.imlabworld.HS_Instructor.C2472bn;
import com.imlabworld.HS_Instructor.C2482bo;
import com.imlabworld.HS_Instructor.C2488bp;
import com.imlabworld.HS_Instructor.C2507bq;
import com.imlabworld.HS_Instructor.C2515br;
import com.imlabworld.p079a.C2590az;
import com.imlabworld.p079a.C2597e;
import com.imlabworld.p079a.C2608p;
import com.imlabworld.p079a.C2614s;
import com.imlabworld.p079a.C2615t;
import com.imlabworld.p079a.C2616u;
import com.imlabworld.p079a.C2621y;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class UI_A_Main extends C2343ai implements View.OnClickListener, C2396at.C2400d, C2402au.C2404a, C2411ax.C2417c, C2418ay.C2420b, C2421az.C2424b, C2429ba.C2432c, C2433bb.C2435b, C2436bc.C2438b, C2439bd.C2441b, C2442be.C2444b, C2445bf.C2448b, C2449bg.C2451b, C2452bh.C2455b, C2456bi.C2458b, C2459bj.C2461b, C2462bk.C2464b, C2469bm.C2470a, C2472bn.C2476d, C2482bo.C2484b, C2488bp.C2490a, C2507bq.C2509b, C2515br.C2526c {

    /* renamed from: ax */
    private final String f7658ax = "UI_A_Main";
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public final Handler f7659ay = new Handler() {
        public void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 3:
                        if (UI_A_Main.this.f7925aq && !UI_A_Main.this.f7923ao) {
                            UI_A_Main.this.f7926ar++;
                            if (UI_A_Main.this.f7926ar > UI_A_Main.this.f7927as.getDuration() / 1000) {
                                for (int i = 0; i < 6; i++) {
                                    UI_A_Main.this.mo8626i(i);
                                    if (UI_A_Main.this.f7928at[i].f7851a.f9568a) {
                                        UI_A_Main.this.f7928at[i].f7874x = 10;
                                    }
                                }
                                UI_A_Main.this.mo8618e(10);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
            }
        }
    };

    /* renamed from: com.imlabworld.HS_Instructor.UI_A_Main$19 */
    static /* synthetic */ class C229419 {

        /* renamed from: p */
        static final /* synthetic */ int[] f7691p = new int[C2411ax.C2416b.values().length];

        static {
            f7694s = new int[C2421az.C2423a.values().length];
            try {
                f7694s[C2421az.C2423a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f7694s[C2421az.C2423a.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            f7693r = new int[C2396at.C2397a.values().length];
            try {
                f7693r[C2396at.C2397a.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            f7692q = new int[C2429ba.C2430a.values().length];
            try {
                f7692q[C2429ba.C2430a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f7692q[C2429ba.C2430a.FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f7692q[C2429ba.C2430a.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f7691p[C2411ax.C2416b.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f7690o = new int[C2449bg.C2450a.values().length];
            try {
                f7690o[C2449bg.C2450a.COMPLETE_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f7690o[C2449bg.C2450a.NEW_CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            f7689n = new int[C2459bj.C2460a.values().length];
            try {
                f7689n[C2459bj.C2460a.ASSIGN.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f7689n[C2459bj.C2460a.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f7689n[C2459bj.C2460a.DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            f7688m = new int[C2445bf.C2447a.values().length];
            try {
                f7688m[C2445bf.C2447a.ASSIGN.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f7688m[C2445bf.C2447a.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            try {
                f7688m[C2445bf.C2447a.UNPAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError e15) {
            }
            try {
                f7688m[C2445bf.C2447a.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError e16) {
            }
            f7687l = new int[C2452bh.C2454a.values().length];
            try {
                f7687l[C2452bh.C2454a.ASSIGN.ordinal()] = 1;
            } catch (NoSuchFieldError e17) {
            }
            try {
                f7687l[C2452bh.C2454a.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError e18) {
            }
            try {
                f7687l[C2452bh.C2454a.UNPAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError e19) {
            }
            try {
                f7687l[C2452bh.C2454a.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError e20) {
            }
            f7686k = new int[C2442be.C2443a.values().length];
            try {
                f7686k[C2442be.C2443a.ASSIGN.ordinal()] = 1;
            } catch (NoSuchFieldError e21) {
            }
            f7685j = new int[C2456bi.C2457a.values().length];
            try {
                f7685j[C2456bi.C2457a.REGISTER.ordinal()] = 1;
            } catch (NoSuchFieldError e22) {
            }
            try {
                f7685j[C2456bi.C2457a.PREV.ordinal()] = 2;
            } catch (NoSuchFieldError e23) {
            }
            try {
                f7685j[C2456bi.C2457a.CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError e24) {
            }
            try {
                f7685j[C2456bi.C2457a.CALIBRATION.ordinal()] = 4;
            } catch (NoSuchFieldError e25) {
            }
            try {
                f7685j[C2456bi.C2457a.ASSIGN.ordinal()] = 5;
            } catch (NoSuchFieldError e26) {
            }
            try {
                f7685j[C2456bi.C2457a.DISCONNECT.ordinal()] = 6;
            } catch (NoSuchFieldError e27) {
            }
            try {
                f7685j[C2456bi.C2457a.START.ordinal()] = 7;
            } catch (NoSuchFieldError e28) {
            }
            f7684i = new int[C2439bd.C2440a.values().length];
            try {
                f7684i[C2439bd.C2440a.SAVE.ordinal()] = 1;
            } catch (NoSuchFieldError e29) {
            }
            f7683h = new int[C2433bb.C2434a.values().length];
            try {
                f7683h[C2433bb.C2434a.CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError e30) {
            }
            try {
                f7683h[C2433bb.C2434a.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError e31) {
            }
            try {
                f7683h[C2433bb.C2434a.SCORE.ordinal()] = 3;
            } catch (NoSuchFieldError e32) {
            }
            f7682g = new int[C2436bc.C2437a.values().length];
            try {
                f7682g[C2436bc.C2437a.CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError e33) {
            }
            try {
                f7682g[C2436bc.C2437a.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError e34) {
            }
            f7681f = new int[C2418ay.C2419a.values().length];
            try {
                f7681f[C2418ay.C2419a.SETTING.ordinal()] = 1;
            } catch (NoSuchFieldError e35) {
            }
            try {
                f7681f[C2418ay.C2419a.DATAMANAGEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError e36) {
            }
            try {
                f7681f[C2418ay.C2419a.START.ordinal()] = 3;
            } catch (NoSuchFieldError e37) {
            }
            try {
                f7681f[C2418ay.C2419a.ASSIGN.ordinal()] = 4;
            } catch (NoSuchFieldError e38) {
            }
            try {
                f7681f[C2418ay.C2419a.OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError e39) {
            }
            try {
                f7681f[C2418ay.C2419a.CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError e40) {
            }
            f7680e = new int[C2462bk.C2463a.values().length];
            try {
                f7680e[C2462bk.C2463a.CHANGE_KIT.ordinal()] = 1;
            } catch (NoSuchFieldError e41) {
            }
            try {
                f7680e[C2462bk.C2463a.CONNECT.ordinal()] = 2;
            } catch (NoSuchFieldError e42) {
            }
            try {
                f7680e[C2462bk.C2463a.DISCONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError e43) {
            }
            f7679d = new int[C2465bl.C2468b.values().length];
            try {
                f7679d[C2465bl.C2468b.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError e44) {
            }
            try {
                f7679d[C2465bl.C2468b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError e45) {
            }
            f7678c = new int[C2507bq.C2508a.values().length];
            try {
                f7678c[C2507bq.C2508a.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError e46) {
            }
            try {
                f7678c[C2507bq.C2508a.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError e47) {
            }
            try {
                f7678c[C2507bq.C2508a.CHANGE_ROLE.ordinal()] = 3;
            } catch (NoSuchFieldError e48) {
            }
            f7677b = new int[C2482bo.C2483a.values().length];
            try {
                f7677b[C2482bo.C2483a.START.ordinal()] = 1;
            } catch (NoSuchFieldError e49) {
            }
            try {
                f7677b[C2482bo.C2483a.QUIT.ordinal()] = 2;
            } catch (NoSuchFieldError e50) {
            }
            f7676a = new int[C2472bn.C2473a.values().length];
            try {
                f7676a[C2472bn.C2473a.SETTING.ordinal()] = 1;
            } catch (NoSuchFieldError e51) {
            }
            try {
                f7676a[C2472bn.C2473a.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError e52) {
            }
            try {
                f7676a[C2472bn.C2473a.RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError e53) {
            }
        }
    }

    /* renamed from: A */
    private void m13033A() {
        if (this.f7937x.getVisibility() == 0 || this.f7936w.getVisibility() == 0) {
            m13072u();
        } else if (this.f7894L.getVisibility() == 0) {
            m13081z();
        }
        this.f7900R.setVisibility(0);
        this.f7901S.mo8816a(this.f7928at);
        this.f7932s.push(C2557y.f9835g.f10131E);
        mo8617e();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m13034A(int i) {
        if (this.f7928at[i].f7851a.mo9322b()) {
            m13048H(i);
            mo8704e(i, this.f7928at[i].f7874x);
        } else {
            this.f7928at[i].f7874x = 22;
            m13080y(i);
        }
        mo8623h();
    }

    /* renamed from: B */
    private void m13035B() {
        this.f7900R.setVisibility(4);
        mo8615d();
    }

    /* renamed from: B */
    private void m13036B(int i) {
        this.f7928at[i].f7836I = false;
        if (C2557y.f9847s[i] != null) {
            C2557y.f9847s[i].mo10022c();
        }
        C2557y.f9847s[i] = null;
        System.gc();
    }

    /* renamed from: C */
    private void m13037C() {
        this.f7896N.setVisibility(0);
        this.f7897O.mo8938a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m13038C(int i) {
        this.f7892J.setVisibility(4);
        if (this.f7928at[i].f7851a.f9568a) {
            try {
                Thread.sleep(50);
                mo8710a(i, C2426b.C2428a.STOP_CODE);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: D */
    private void m13039D() {
        this.f7896N.setVisibility(4);
    }

    /* renamed from: D */
    private void m13040D(int i) {
        this.f7928at[i].f7846S.mo10032a();
        if (this.f7928at[i].f7874x != 13) {
            try {
                Thread.sleep(50);
                this.f7928at[i].f7832E = 0;
                mo8713h(i, 1);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    private void m13041E() {
        this.f7898P.setVisibility(4);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m13042E(int i) {
        this.f7928at[i].f7846S.mo10034b();
        try {
            Thread.sleep(50);
            this.f7928at[i].f7832E = 0;
            mo8713h(i, 2);
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m13043F() {
        if (C2557y.f9811B.mo9548c() == -1) {
            this.f7887E.setText("LMS " + C2557y.f9835g.f10153a);
        } else {
            this.f7887E.setText("LMS " + C2557y.f9835g.f10472gA);
        }
        for (int i = 0; i < 6; i++) {
            this.f7922an[i].setText(C2557y.f9835g.f10357ds);
        }
        this.f7907Y.setText(C2557y.f9835g.f10473gB);
        this.f7914af.setText(C2557y.f9835g.f10276cQ);
        this.f7916ah.setText(C2557y.f9835g.f10203ax);
        this.f7891I.mo9056e();
        this.f7901S.mo8814a();
        this.f7895M.mo8843a();
        this.f7893K.mo8857a();
        this.f7889G.mo8909c();
        this.f7899Q.mo8915a();
        this.f7897O.mo8937a();
        this.f7933t.mo8960a();
        this.f7934u.mo8952b();
        this.f7935v.mo8969a();
        for (int i2 = 0; i2 < 6; i2++) {
            this.f7928at[i2].f7863m.mo8982a();
            this.f7928at[i2].f7865o.mo8997c();
            this.f7928at[i2].f7862l.mo9005a();
            this.f7928at[i2].f7860j.mo9015a();
            this.f7928at[i2].f7864n.mo9028a();
        }
    }

    /* renamed from: F */
    private void m13044F(final int i) {
        m13040D(i);
        new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10222bP).setMessage(C2557y.f9835g.f10242bj).setPositiveButton(C2557y.f9835g.f10211bE, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                UI_A_Main.this.m13046G(i);
            }
        }).setNegativeButton(C2557y.f9835g.f10212bF, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                UI_A_Main.this.m13042E(i);
            }
        }).show().setCanceledOnTouchOutside(false);
    }

    /* renamed from: G */
    private void m13045G() {
        mo8702a(C2337ad.Connect);
        this.f7932s = new Stack();
        this.f7932s.push(C2557y.f9835g.f10273cN);
        this.f7932s.push(C2557y.f9835g.f10273cN);
        mo8617e();
        for (int i = 0; i < 6; i++) {
            mo8706l(i);
        }
        for (int i2 = 0; i2 < 6; i2++) {
            if (this.f7928at[i2].f7851a.mo9322b()) {
                try {
                    Thread.sleep(50);
                    this.f7928at[i2].f7832E = 0;
                    mo8712g(i2, 12);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (C2557y.f9832d.f9745a == 3) {
            for (int i3 = 0; i3 < 6; i3++) {
                this.f7928at[i3].f7874x = 13;
            }
            m13075w();
            this.f7889G.mo8907a();
            return;
        }
        m13077x();
        this.f7889G.mo8908b();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m13046G(int i) {
        this.f7928at[i].f7846S.mo10035c();
        if (this.f7928at[i].f7851a.f9568a) {
            try {
                Thread.sleep(50);
                this.f7928at[i].f7832E = 0;
                mo8719u(i);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: H */
    private int m13047H() {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            if (this.f7928at[i2].f7851a.mo9322b()) {
                if (this.f7928at[i2].f7874x == 9 || this.f7928at[i2].f7874x == 10 || this.f7928at[i2].f7874x == 18 || this.f7928at[i2].f7874x == 19 || this.f7928at[i2].f7874x == 20 || this.f7928at[i2].f7874x == 11) {
                    i++;
                }
                if (this.f7928at[i2].f7874x == 11) {
                    i--;
                }
            }
        }
        return i;
    }

    /* renamed from: H */
    private void m13048H(int i) {
        C2590az a = C2557y.f9832d.mo9677a(this.f7928at[i].f7874x);
        int b = C2557y.f9832d.mo9679b(this.f7928at[i].f7874x);
        C2556x.f9808y = b;
        this.f7928at[i].f7846S = new C2621y(new C2597e(a, b, C2557y.f9832d.f9755k, C2557y.f9832d.f9747c, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i), C2556x.f9801r[i], C2556x.f9802s[i], C2556x.f9803t[i], C2556x.f9804u[i]);
        C2556x.f9788e = this.f7928at[i].f7846S.mo9825u();
        C2556x.f9789f = this.f7928at[i].f7846S.mo9826v();
    }

    /* renamed from: I */
    private void m13049I() {
        this.f7925aq = false;
        if (C2557y.f9846r != null) {
            C2557y.f9846r.mo10022c();
        }
        C2557y.f9846r = null;
        System.gc();
    }

    /* renamed from: J */
    private void m13050J() {
        this.f7892J.setVisibility(4);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 6) {
                if (this.f7928at[i2].f7851a.f9568a) {
                    try {
                        Thread.sleep(50);
                        mo8710a(i2, C2426b.C2428a.STOP_CODE);
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: K */
    private void m13051K() {
        for (int i = 0; i < 6; i++) {
            m13040D(i);
        }
        new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10222bP).setMessage(C2557y.f9835g.f10242bj).setPositiveButton(C2557y.f9835g.f10211bE, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                for (int i2 = 0; i2 < 6; i2++) {
                    UI_A_Main.this.m13046G(i2);
                }
            }
        }).setNegativeButton(C2557y.f9835g.f10212bF, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                for (int i2 = 0; i2 < 6; i2++) {
                    UI_A_Main.this.m13042E(i2);
                }
            }
        }).show().setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    private void m13052a(int i, boolean z, C2553u uVar, C2552t tVar) {
        int b = m13055b(i, z, uVar, tVar);
        if (z) {
            switch (tVar.f9747c) {
                case 1:
                case 2:
                    switch (tVar.f9748d) {
                        case 1:
                            m13067o(i, b);
                            m13063k(i, b);
                            m13064l(i, b);
                            m13065m(i, b);
                            break;
                        case 2:
                            m13066n(i, b);
                            m13063k(i, b);
                            m13064l(i, b);
                            m13065m(i, b);
                            break;
                    }
                case 3:
                    switch (tVar.f9748d) {
                        case 1:
                            m13069q(i, b);
                            break;
                        case 2:
                            m13068p(i, b);
                            break;
                    }
            }
        } else {
            m13063k(i, b);
            m13064l(i, b);
            m13065m(i, b);
        }
        this.f7901S.mo8816a(this.f7928at);
    }

    /* renamed from: b */
    private int m13055b(int i, boolean z, C2553u uVar, C2552t tVar) {
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        int l = tVar.mo9700l();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if (uVar == null) {
            int a = this.f7930av.mo9571a(new C2553u(C2557y.f9835g.f10523gz, ""));
            C2553u j = this.f7930av.mo9602j(a);
            j.f9760b += a;
            this.f7930av.mo9589c(j);
            if (C2557y.f9852x != null) {
                this.f7930av.mo9564a(new C2539g(C2557y.f9852x.mo9455a(), a));
                i4 = C2557y.f9852x.mo9455a();
            } else {
                this.f7930av.mo9564a(new C2539g(1, a));
                i4 = 1;
            }
            mo8701a(i, j.mo9718c());
            this.f7901S.mo8815a(i, i4, a);
            i2 = a;
            i3 = i4;
        } else {
            int b = uVar.mo9715b();
            if (b < 1) {
                uVar.mo9713a(C2557y.f9835g.f10523gz);
                b = this.f7930av.mo9571a(uVar);
                C2553u j2 = this.f7930av.mo9602j(b);
                j2.f9760b += b;
                this.f7930av.mo9589c(j2);
            }
            int i6 = b;
            ArrayList<C2539g> f = this.f7930av.mo9596f(i6);
            if (f != null) {
                i2 = i6;
                i3 = f.get(0).f9635a;
            } else if (C2557y.f9852x != null) {
                this.f7930av.mo9564a(new C2539g(C2557y.f9852x.mo9455a(), i6));
                i2 = i6;
                i3 = C2557y.f9852x.mo9455a();
            } else {
                this.f7930av.mo9564a(new C2539g(1, i6));
                i2 = i6;
                i3 = 1;
            }
        }
        if (C2556x.f9806w[i] != null) {
            i5 = C2556x.f9806w[i].f7770o;
        }
        switch (tVar.f9747c) {
            case 1:
                l = tVar.mo9700l();
                break;
            case 2:
                l = tVar.mo9702m();
                break;
            case 3:
                l = tVar.mo9704n();
                break;
        }
        return this.f7930av.mo9568a(new C2544l(i3, i2, i5, timestamp, l, tVar.f9747c, tVar.f9755k, tVar.f9748d, z ? 1 : 0, -1, 0));
    }

    /* renamed from: b */
    private void m13058b(ArrayList<C2543k> arrayList, ArrayList<C2553u> arrayList2, ArrayList<C2539g> arrayList3, ArrayList<C2544l> arrayList4) {
        this.f7898P.setVisibility(0);
        this.f7899Q.mo8916a(arrayList, arrayList2, arrayList3, arrayList4);
    }

    /* renamed from: i */
    private void m13061i(int i, int i2) {
        this.f7928at[i].f7832E = 0;
        if (this.f7928at[i].f7851a.mo9322b()) {
            try {
                Thread.sleep(50);
                this.f7928at[i].f7832E = 0;
                switch (i2) {
                    case 16:
                    case 17:
                        mo8712g(i, 7);
                        break;
                    default:
                        mo8712g(i, i2);
                        break;
                }
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        switch (i2) {
            case 16:
            case 17:
                mo8710a(i, C2426b.C2428a.START_CODE);
                break;
        }
        if (this.f7928at[i].f7851a.mo9322b()) {
            if (i2 == 16 || i2 == 17) {
                m13048H(i);
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                    mo8703d(i, i2);
                    return;
                case 16:
                    mo8704e(i, i2);
                    this.f7893K.mo8862a(i, this.f7928at);
                    return;
                case 17:
                    mo8705f(i, i2);
                    this.f7893K.mo8862a(i, this.f7928at);
                    return;
                default:
                    return;
            }
        } else {
            this.f7928at[i].f7874x = 22;
            m13080y(i);
        }
    }

    /* renamed from: j */
    private void m13062j(int i, int i2) {
        mo8702a(C2337ad.TEST);
        this.f7892J.setVisibility(0);
        if (this.f7928at[i].f7851a.f9568a) {
            m13070r(i, i2);
            C2556x.f9805v[i] = this.f7928at[i].f7846S.mo9819o();
            C2556x.f9807x[i] = null;
            try {
                Thread.sleep(50);
                mo8710a(i, C2426b.C2428a.START_CODE);
                Thread.sleep(100);
                this.f7928at[i].f7832E = 0;
                mo8712g(i, 13);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f7928at[i].f7849V = false;
        }
    }

    /* renamed from: k */
    private void m13063k(int i, int i2) {
        double j = C2556x.f9807x[i].mo9904j();
        double g = C2556x.f9807x[i].mo9898g();
        double h = C2556x.f9807x[i].mo9900h();
        double i3 = C2556x.f9807x[i].mo9902i();
        double a = C2556x.f9807x[i].mo9886a();
        double c = C2556x.f9807x[i].mo9890c();
        double b = C2556x.f9807x[i].mo9888b();
        double d = C2556x.f9807x[i].mo9892d();
        double e = C2556x.f9807x[i].mo9894e();
        double f = C2556x.f9807x[i].mo9896f();
        this.f7930av.mo9570a(new C2550r(i2, j, g, h, i3, a, c, b, d, e, f));
    }

    /* renamed from: l */
    private void m13064l(int i, int i2) {
        int i3 = 0;
        Iterator<C2614s> it = C2556x.f9805v[i].mo9974b().iterator();
        while (it.hasNext()) {
            C2614s next = it.next();
            int a = next.mo9979a();
            int c = next.mo9986c();
            double b = next.mo9984b();
            int i4 = next.mo9992i();
            int j = next.mo9993j();
            double k = next.mo9994k();
            int[] d = next.mo9987d();
            int h = next.mo9991h();
            this.f7930av.mo9565a(new C2541i(i2, i3, a, c, b, i4, j, k, d[0], d[1], d[2], d[3], h));
            i3++;
        }
    }

    /* renamed from: m */
    private void m13065m(int i, int i2) {
        int i3 = 0;
        Iterator<C2615t> it = C2556x.f9805v[i].mo9976c().iterator();
        while (it.hasNext()) {
            C2615t next = it.next();
            this.f7930av.mo9566a(new C2542j(i2, i3, next.mo10000a(), next.mo10005b(), next.mo10008c(), next.mo10010d(), next.mo10012e(), next.mo10014f(), next.mo10015g(), next.mo10016h() ? 1 : 0));
            i3++;
        }
    }

    /* renamed from: n */
    private void m13066n(int i, int i2) {
        int i3;
        int i4;
        int i5;
        Pair<Boolean, Long>[][] pairArr = C2556x.f9806w[i].f7757b;
        int i6 = 0;
        int i7 = 0;
        switch (C2557y.f9832d.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                int i8 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i9 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                int i10 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                i7 = 0;
                i6 = ((Boolean) pairArr[0][3].first).booleanValue() ? 1 : 0;
                i3 = i10;
                i4 = i9;
                i5 = i8;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                int i11 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i12 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                int i13 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                int i14 = ((Boolean) pairArr[0][3].first).booleanValue() ? 1 : 0;
                i7 = ((Boolean) pairArr[0][4].first).booleanValue() ? 1 : 0;
                i6 = i14;
                i3 = i13;
                i4 = i12;
                i5 = i11;
                break;
            default:
                i3 = 0;
                i4 = 0;
                i5 = 0;
                break;
        }
        this.f7930av.mo9563a(new C2538f(i2, i5, i4, i3, i6, i7, ((Boolean) pairArr[1][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][1].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][2].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][3].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][4].first).booleanValue() ? 1 : 0, 0, ((Boolean) pairArr[2][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][1].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][2].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][3].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][4].first).booleanValue() ? 1 : 0, 0, ((Boolean) pairArr[3][0].first).booleanValue() ? 1 : 0, C2556x.f9806w[i].f7761f ? 1 : 0, C2556x.f9806w[i].f7762g ? 1 : 0, C2556x.f9806w[i].f7763h));
    }

    /* renamed from: o */
    private void m13067o(int i, int i2) {
        int i3;
        int i4;
        Pair<Boolean, Long>[][] pairArr = C2556x.f9806w[i].f7758c;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        switch (C2557y.f9832d.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                int i8 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i9 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                i6 = 0;
                i7 = 0;
                i5 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                i3 = i9;
                i4 = i8;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                int i10 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i11 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                int i12 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                int i13 = ((Boolean) pairArr[0][3].first).booleanValue() ? 1 : 0;
                i7 = ((Boolean) pairArr[0][4].first).booleanValue() ? 1 : 0;
                i6 = i13;
                i5 = i12;
                i3 = i11;
                i4 = i10;
                break;
            default:
                i3 = 0;
                i4 = 0;
                break;
        }
        this.f7930av.mo9563a(new C2538f(i2, i4, i3, i5, i6, i7, ((Boolean) pairArr[1][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][1].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][2].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][3].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][4].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][5].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][1].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][2].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][3].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][4].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][5].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[3][0].first).booleanValue() ? 1 : 0, C2556x.f9806w[i].f7761f ? 1 : 0, C2556x.f9806w[i].f7762g ? 1 : 0, C2556x.f9806w[i].f7763h));
    }

    /* renamed from: p */
    private void m13068p(int i, int i2) {
        int i3;
        int i4;
        int i5;
        Pair<Boolean, Long>[][] pairArr = C2556x.f9806w[i].f7759d;
        int i6 = 0;
        int i7 = 0;
        switch (C2557y.f9832d.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                int i8 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i9 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                int i10 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                i7 = 0;
                i6 = ((Boolean) pairArr[0][3].first).booleanValue() ? 1 : 0;
                i3 = i10;
                i4 = i9;
                i5 = i8;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                int i11 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i12 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                int i13 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                int i14 = ((Boolean) pairArr[0][3].first).booleanValue() ? 1 : 0;
                i7 = ((Boolean) pairArr[0][4].first).booleanValue() ? 1 : 0;
                i6 = i14;
                i3 = i13;
                i4 = i12;
                i5 = i11;
                break;
            default:
                i3 = 0;
                i4 = 0;
                i5 = 0;
                break;
        }
        this.f7930av.mo9569a(new C2545m(i2, i5, i4, i3, i6, i7, ((Boolean) pairArr[1][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][1].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][2].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][3].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][4].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[2][1].first).booleanValue() ? 1 : 0, C2556x.f9806w[i].f7761f ? 1 : 0, C2556x.f9806w[i].f7762g ? 1 : 0, C2556x.f9806w[i].f7763h, C2556x.f9806w[i].f7764i, C2556x.f9806w[i].f7765j, C2556x.f9806w[i].f7766k, C2556x.f9806w[i].f7767l, C2556x.f9806w[i].f7768m, C2556x.f9806w[i].f7769n));
    }

    /* renamed from: q */
    private void m13069q(int i, int i2) {
        int i3;
        int i4;
        Pair<Boolean, Long>[][] pairArr = C2556x.f9806w[i].f7760e;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        switch (C2557y.f9832d.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                int i8 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i9 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                i6 = 0;
                i7 = 0;
                i5 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                i3 = i9;
                i4 = i8;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                int i10 = ((Boolean) pairArr[0][0].first).booleanValue() ? 1 : 0;
                int i11 = ((Boolean) pairArr[0][1].first).booleanValue() ? 1 : 0;
                int i12 = ((Boolean) pairArr[0][2].first).booleanValue() ? 1 : 0;
                int i13 = ((Boolean) pairArr[0][3].first).booleanValue() ? 1 : 0;
                i7 = ((Boolean) pairArr[0][4].first).booleanValue() ? 1 : 0;
                i6 = i13;
                i5 = i12;
                i3 = i11;
                i4 = i10;
                break;
            default:
                i3 = 0;
                i4 = 0;
                break;
        }
        this.f7930av.mo9569a(new C2545m(i2, i4, i3, i5, i6, i7, ((Boolean) pairArr[1][0].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][1].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][2].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][3].first).booleanValue() ? 1 : 0, 0, ((Boolean) pairArr[1][4].first).booleanValue() ? 1 : 0, ((Boolean) pairArr[1][5].first).booleanValue() ? 1 : 0, C2556x.f9806w[i].f7761f ? 1 : 0, C2556x.f9806w[i].f7762g ? 1 : 0, C2556x.f9806w[i].f7763h, C2556x.f9806w[i].f7764i, C2556x.f9806w[i].f7765j, C2556x.f9806w[i].f7766k, C2556x.f9806w[i].f7767l, C2556x.f9806w[i].f7768m, C2556x.f9806w[i].f7769n));
    }

    /* renamed from: r */
    private void m13070r(int i, int i2) {
        C2590az a = C2557y.f9832d.mo9677a(this.f7928at[i].f7874x);
        int b = C2557y.f9832d.mo9679b(this.f7928at[i].f7874x);
        C2556x.f9808y = b;
        this.f7928at[i].f7846S = new C2621y(new C2597e(a, b, C2557y.f9832d.f9755k, i2, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i), C2556x.f9801r[i], C2556x.f9802s[i], C2556x.f9803t[i], C2556x.f9804u[i]);
        C2556x.f9788e = this.f7928at[i].f7846S.mo9825u();
        C2556x.f9789f = this.f7928at[i].f7846S.mo9826v();
    }

    /* renamed from: t */
    private void m13071t() {
        if (this.f7900R.getVisibility() == 0) {
            m13035B();
        } else if (this.f7894L.getVisibility() == 0) {
            m13081z();
        }
        this.f7936w.setVisibility(4);
        this.f7937x.setVisibility(0);
        this.f7934u.mo8951a();
        if (((String) this.f7932s.peek()).equals(C2557y.f9835g.f10279cT)) {
            this.f7932s.pop();
        }
        this.f7932s.push(C2557y.f9835g.f10342dd);
        mo8617e();
    }

    /* renamed from: u */
    private void m13072u() {
        Log.e("-_-", "framgment: " + this.f7939z.getBackStackEntryCount());
        this.f7937x.setVisibility(4);
        this.f7936w.setVisibility(4);
        mo8615d();
    }

    /* renamed from: v */
    private int m13073v(int i) {
        int i2 = 16;
        if (C2557y.f9832d.f9746b == 2) {
            i2 = 16;
        }
        switch (C2557y.f9832d.f9755k) {
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
                if (C2557y.f9832d.f9748d == 1) {
                    switch (i) {
                        case 0:
                            return 2;
                        case 1:
                            return 3;
                        case 2:
                            return 5;
                        case 3:
                            return i2;
                        case 4:
                            return 8;
                    }
                } else {
                    switch (i) {
                        case 0:
                            return 2;
                        case 1:
                            return 3;
                        case 2:
                            return 6;
                        case 3:
                            return i2;
                        case 4:
                            return 8;
                    }
                }
            case 2:
            case 5:
                switch (i) {
                    case 0:
                        return 1;
                    case 1:
                        return 2;
                    case 2:
                        return 4;
                    case 3:
                        return 5;
                    case 4:
                        return 3;
                    case 5:
                        return i2;
                    case 6:
                        return 8;
                }
            case 3:
            case 6:
                switch (i) {
                    case 0:
                        return 1;
                    case 1:
                        return 2;
                    case 2:
                        return 3;
                    case 3:
                        return 4;
                    case 4:
                        return 5;
                    case 5:
                        return i2;
                    case 6:
                        return 8;
                }
        }
        return 2;
    }

    /* renamed from: v */
    private void m13074v() {
        this.f7892J.setVisibility(4);
        mo8615d();
    }

    /* renamed from: w */
    private void m13075w() {
        this.f7890H.setVisibility(0);
        this.f7891I.mo9044a();
        this.f7891I.mo9049a(this.f7928at);
    }

    /* renamed from: w */
    private void m13076w(int i) {
        this.f7892J.setVisibility(0);
        this.f7893K.mo8866c(i);
        this.f7932s.push(C2557y.f9835g.f10358dt);
        mo8617e();
    }

    /* renamed from: x */
    private void m13077x() {
        this.f7890H.setVisibility(4);
    }

    /* renamed from: x */
    private void m13078x(int i) {
        this.f7892J.setVisibility(0);
        this.f7893K.mo8858a(i);
        this.f7932s.push(C2557y.f9835g.f10358dt);
        mo8617e();
    }

    /* renamed from: y */
    private void m13079y() {
        if (this.f7937x.getVisibility() == 0 || this.f7936w.getVisibility() == 0) {
            m13072u();
        } else if (this.f7900R.getVisibility() == 0) {
            m13035B();
        }
        this.f7894L.setVisibility(0);
        this.f7895M.mo8844b();
        this.f7932s.push(C2557y.f9835g.f10519gv);
        mo8617e();
    }

    /* renamed from: y */
    private void m13080y(int i) {
        mo8706l(i);
        if (this.f7928at[i].f7851a.mo9322b()) {
            try {
                Thread.sleep(50);
                this.f7928at[i].f7832E = 0;
                mo8712g(i, 12);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: z */
    private void m13081z() {
        this.f7894L.setVisibility(4);
        mo8615d();
    }

    /* renamed from: z */
    private void m13082z(int i) {
        try {
            Thread.sleep(50);
            mo8710a(i, C2426b.C2428a.START_CODE);
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f7928at[i].f7846S = new C2621y(new C2597e(C2590az.CALIBRATION, 0, C2557y.f9832d.f9755k, C2557y.f9832d.f9747c, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i), C2556x.f9801r[i], C2556x.f9802s[i], C2556x.f9803t[i], C2556x.f9804u[i]);
        this.f7928at[i].f7875y = true;
        mo8708n(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8589a(final int i, final int i2) {
        if (this.f7923ao) {
            return;
        }
        if (this.f7924ap[i] == null || !this.f7924ap[i].isShowing()) {
            this.f7924ap[i] = new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage((("" + C2557y.f9835g.f10136J) + C2557y.f9835g.f10169aP) + "(" + this.f7928at[i].f7848U.mo9553b() + ")").setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i2) {
                        case 10:
                        case 18:
                        case 19:
                            UI_A_Main.this.f7928at[i].f7874x = 10;
                            UI_A_Main.this.mo8620f(i);
                            return;
                        case 16:
                        case 17:
                            UI_A_Main.this.m13034A(i);
                            return;
                        default:
                            return;
                    }
                }
            }).show();
            this.f7924ap[i].setCanceledOnTouchOutside(false);
        }
    }

    /* renamed from: a */
    public void mo8590a(int i, C2411ax.C2416b bVar) {
        int i2 = C229419.f7691p[bVar.ordinal()];
    }

    /* renamed from: a */
    public void mo8591a(int i, C2442be.C2443a aVar) {
        switch (aVar) {
            case ASSIGN:
                if (this.f7900R.getVisibility() == 4) {
                    m13033A();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8592a(int i, C2445bf.C2447a aVar) {
        switch (aVar) {
            case ASSIGN:
                if (this.f7900R.getVisibility() == 4) {
                    m13033A();
                    return;
                }
                return;
            case PAUSE:
                m13040D(i);
                return;
            case UNPAUSE:
                m13042E(i);
                return;
            case SKIP:
                m13044F(i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8593a(int i, C2449bg.C2450a aVar) {
        switch (aVar) {
            case COMPLETE_COMPLETE:
                Log.e("Cali before", C2556x.f9803t[i] + " " + C2556x.f9804u[i] + " " + this.f7928at[i].f7865o.mo8999e());
                C2556x.f9804u[i] = C2556x.f9803t[i] + this.f7928at[i].f7865o.mo8999e();
                int e = (this.f7928at[i].f7865o.mo8999e() - 50) / 10;
                Log.e("Cali after", C2556x.f9803t[i] + " " + C2556x.f9804u[i] + " " + this.f7928at[i].f7865o.mo8999e());
                C2547o oVar = this.f7928at[i].f7848U;
                if (C2557y.f9832d.f9747c == 1) {
                    oVar.mo9554b(e);
                } else if (C2557y.f9832d.f9747c == 2) {
                    oVar.mo9557c(e);
                } else {
                    oVar.mo9559d(e);
                }
                this.f7929au.mo9628b(oVar);
                this.f7928at[i].f7848U = this.f7929au.mo9620a(oVar.mo9550a());
                this.f7928at[i].f7860j.mo9018a(false);
                mo8710a(i, C2426b.C2428a.STOP_CODE);
                mo8612c(i);
                return;
            case NEW_CANCEL:
                mo8612c(i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8594a(int i, C2452bh.C2454a aVar) {
        switch (aVar) {
            case ASSIGN:
                if (this.f7900R.getVisibility() == 4) {
                    m13033A();
                    return;
                }
                return;
            case PAUSE:
                m13040D(i);
                return;
            case UNPAUSE:
                m13042E(i);
                return;
            case SKIP:
                m13044F(i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8595a(final int i, C2456bi.C2457a aVar) {
        boolean z = false;
        switch (aVar) {
            case REGISTER:
                mo8715q(i);
                this.f7928at[i].f7873w = false;
                startActivityForResult(new Intent(this, UI_Select_Port.class), i);
                return;
            case PREV:
                mo8714p(i);
                this.f7928at[i].f7873w = true;
                return;
            case CHANGE:
                mo8715q(i);
                this.f7928at[i].f7873w = false;
                startActivityForResult(new Intent(this, UI_Select_Port.class), i);
                return;
            case CALIBRATION:
                m13082z(i);
                return;
            case ASSIGN:
                if (this.f7900R.getVisibility() == 4) {
                    m13033A();
                    return;
                }
                return;
            case DISCONNECT:
                new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10218bL).setMessage(C2557y.f9835g.f10250br).setPositiveButton(C2557y.f9835g.f10211bE, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (UI_A_Main.this.f7928at[i].f7851a.mo9322b()) {
                            UI_A_Main.this.f7928at[i].f7851a.mo9325e();
                            UI_A_Main.this.mo8706l(i);
                        }
                    }
                }).setNegativeButton(C2557y.f9835g.f10212bF, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                return;
            case START:
                int i2 = 0;
                while (i2 < 6) {
                    if (this.f7928at[i2].f7874x != 22) {
                        switch (this.f7928at[i2].f7874x) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 16:
                            case 17:
                                this.f7928at[i].f7874x = this.f7928at[i2].f7874x;
                                m13061i(i, this.f7928at[i2].f7874x);
                                z = true;
                                break;
                            case 9:
                            case 10:
                            case 11:
                            case 18:
                            case 19:
                            case 20:
                                this.f7928at[i].f7874x = 10;
                                mo8620f(i);
                                z = true;
                                break;
                        }
                    }
                    if (!z) {
                        i2++;
                    } else {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8596a(int i, C2459bj.C2460a aVar) {
        switch (aVar) {
            case ASSIGN:
                if (this.f7900R.getVisibility() == 4) {
                    m13033A();
                    return;
                }
                return;
            case RETRY:
                this.f7928at[i].f7874x = 10;
                mo8620f(i);
                mo8702a(C2337ad.FullCPRScenarioCPR);
                return;
            case DETAIL:
                m13078x(i);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8597a(final int i, C2462bk.C2463a aVar) {
        switch (aVar) {
            case CHANGE_KIT:
                this.f7891I.mo9045a(i);
                return;
            case CONNECT:
                this.f7928at[i].f7874x = C2608p.f10611n;
                mo8715q(i);
                this.f7928at[i].f7873w = false;
                startActivityForResult(new Intent(this, UI_Select_Port.class), i);
                return;
            case DISCONNECT:
                int i2 = 0;
                for (int i3 = 0; i3 < 6; i3++) {
                    if (this.f7928at[i3].f7851a.f9568a) {
                        i2++;
                    }
                }
                if (i2 > 1) {
                    new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10563ht).setMessage(C2557y.f9835g.f10564hu).setPositiveButton(C2557y.f9835g.f10567hx, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (UI_A_Main.this.f7928at[i].f7851a.mo9322b()) {
                                UI_A_Main.this.f7928at[i].f7851a.mo9325e();
                                UI_A_Main.this.mo8706l(i);
                            }
                        }
                    }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    return;
                }
                switch (this.f7891I.mo9058g()) {
                    case MAIN:
                        new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10563ht).setMessage(C2557y.f9835g.f10565hv).setPositiveButton(C2557y.f9835g.f10567hx, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                if (UI_A_Main.this.f7928at[i].f7851a.mo9322b()) {
                                    UI_A_Main.this.f7928at[i].f7851a.mo9325e();
                                    UI_A_Main.this.mo8706l(i);
                                }
                            }
                        }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                        return;
                    case READY:
                        new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10563ht).setMessage(C2557y.f9835g.f10566hw).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                        return;
                    default:
                        return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8598a(final int i, C2507bq.C2508a aVar, String str, String str2) {
        switch (aVar) {
            case NEXT:
                m13038C(i);
                this.f7928at[i].f7846S.mo10035c();
                if (C2556x.f9807x[i] == null) {
                    C2556x.f9807x[i] = mo8699a(C2556x.f9805v[i].mo9976c(), C2556x.f9805v[i].mo9974b());
                }
                this.f7891I.mo9055d();
                return;
            case PAUSE:
                if (str.equals("")) {
                    str = "User";
                }
                m13040D(i);
                this.f7891I.mo9059h();
                new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10497gZ).setMessage(C2557y.f9835g.f10544ha + "\n(" + str + " / " + str2 + ")").setPositiveButton(C2557y.f9835g.f10546hc, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        UI_A_Main.this.m13042E(i);
                        UI_A_Main.this.f7891I.mo9060i();
                    }
                }).setNegativeButton(C2557y.f9835g.f10545hb, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        UI_A_Main.this.m13038C(i);
                        UI_A_Main.this.f7891I.mo9048a(true);
                    }
                }).show().setCanceledOnTouchOutside(false);
                break;
            case CHANGE_ROLE:
                break;
            default:
                return;
        }
        this.f7928at[i].f7846S.mo10035c();
        if (C2556x.f9807x[i] == null) {
            C2556x.f9807x[i] = mo8699a(C2556x.f9805v[i].mo9976c(), C2556x.f9805v[i].mo9974b());
        }
        this.f7891I.mo9054c(0);
    }

    /* renamed from: a */
    public void mo8599a(int i, C2553u uVar, C2552t tVar, boolean z) {
        m13052a(i, true, uVar, tVar);
        if (z) {
            this.f7891I.mo9050b();
        } else {
            this.f7891I.mo9048a(false);
        }
    }

    /* renamed from: a */
    public void mo8600a(C2396at.C2397a aVar) {
        switch (aVar) {
            case COMPLETE:
                for (int i = 0; i < 6; i++) {
                    if (C2557y.f9854z[i] != null) {
                        mo8701a(i, C2557y.f9854z[i].mo9718c());
                    } else {
                        mo8701a(i, (String) null);
                    }
                }
                m13035B();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8601a(C2418ay.C2419a aVar) {
        switch (aVar) {
            case SETTING:
                if (this.f7937x.getVisibility() == 4 && this.f7936w.getVisibility() == 4) {
                    if (C2557y.f9832d.f9745a == 3) {
                        this.f7891I.mo9044a();
                    }
                    mo8619f();
                    return;
                }
                return;
            case DATAMANAGEMENT:
                if (this.f7894L.getVisibility() == 4) {
                    m13079y();
                    return;
                }
                return;
            case START:
                if (this.f7937x.getVisibility() == 0 || this.f7936w.getVisibility() == 0) {
                    m13072u();
                } else if (this.f7894L.getVisibility() == 0) {
                    m13081z();
                } else if (this.f7900R.getVisibility() == 0) {
                    m13035B();
                }
                for (int i = 0; i < 6; i++) {
                    mo8613c(i, 1);
                    mo8626i(i);
                    this.f7928at[i].f7874x = 22;
                }
                m13050J();
                m13045G();
                return;
            case ASSIGN:
                if (this.f7900R.getVisibility() == 4) {
                    m13033A();
                    return;
                }
                return;
            case OPEN:
                this.f7884B.removeView(this.f7888F);
                this.f7884B.mo10058a((View) this.f7888F, 0.0f, 0.0f, 525.0f, 1600.0f);
                return;
            case CLOSE:
                this.f7884B.removeView(this.f7888F);
                this.f7884B.mo10058a((View) this.f7888F, -400.0f, 0.0f, 525.0f, 1600.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8602a(C2421az.C2423a aVar) {
        switch (aVar) {
            case SUCCESS:
                m13041E();
                new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10204ay).setMessage(C2557y.f9835g.f10527hC).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                break;
            case FAIL:
                m13041E();
                if (!m13435c(C2557y.f9812C)) {
                    if (!m13436d(C2557y.f9812C)) {
                        if (!m13437e(C2557y.f9812C)) {
                            if (!m13438f(C2557y.f9812C)) {
                                new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10543hS).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                                break;
                            } else {
                                new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10161aH).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                                break;
                            }
                        } else {
                            new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10164aK).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                            break;
                        }
                    } else {
                        new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10163aJ).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                        break;
                    }
                } else {
                    new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10162aI).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    break;
                }
        }
        this.f7895M.mo8844b();
    }

    /* renamed from: a */
    public void mo8603a(C2429ba.C2430a aVar) {
        switch (aVar) {
            case SUCCESS:
                this.f7886D.setText(C2557y.f9811B.mo9549d());
                this.f7887E.setText("LMS " + C2557y.f9835g.f10472gA);
                this.f7891I.mo9052b(this.f7928at);
                m13039D();
                return;
            case FAIL:
                if (m13433a(C2557y.f9812C)) {
                    new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10159aF).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                } else if (m13434b(C2557y.f9812C)) {
                    new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10160aG).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                } else if (m13438f(C2557y.f9812C)) {
                    new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10161aH).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                }
                this.f7897O.mo8939b();
                return;
            case CANCEL:
                m13039D();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8604a(C2433bb.C2434a aVar) {
        switch (aVar) {
            case CHANGE:
                mo8619f();
                m13043F();
                for (int i = 0; i < 6; i++) {
                    if (this.f7928at[i].f7851a.mo9322b()) {
                        try {
                            Thread.sleep(50);
                            this.f7928at[i].f7832E = 0;
                            mo8712g(i, 12);
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case COMPLETE:
                m13072u();
                for (int i2 = 0; i2 < 6; i2++) {
                    mo8613c(i2, 1);
                    mo8626i(i2);
                    this.f7928at[i2].f7874x = 22;
                }
                m13050J();
                m13045G();
                m13043F();
                return;
            case SCORE:
                this.f7938y.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8605a(C2436bc.C2437a aVar) {
        switch (aVar) {
            case CHANGE:
                for (int i = 0; i < 6; i++) {
                    mo8709o(i);
                    mo8706l(i);
                }
                m13071t();
                m13043F();
                for (int i2 = 0; i2 < 6; i2++) {
                    if (this.f7928at[i2].f7851a.mo9322b()) {
                        try {
                            Thread.sleep(50);
                            this.f7928at[i2].f7832E = 0;
                            mo8712g(i2, 12);
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return;
            case COMPLETE:
                for (int i3 = 0; i3 < 6; i3++) {
                    mo8709o(i3);
                    mo8706l(i3);
                }
                m13072u();
                for (int i4 = 0; i4 < 6; i4++) {
                    mo8613c(i4, 1);
                    mo8626i(i4);
                    this.f7928at[i4].f7874x = 22;
                }
                m13050J();
                m13045G();
                m13043F();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8606a(C2439bd.C2440a aVar) {
        switch (aVar) {
            case SAVE:
                this.f7938y.setVisibility(4);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8607a(C2472bn.C2473a aVar) {
        switch (aVar) {
            case SETTING:
                if (this.f7937x.getVisibility() == 4 && this.f7936w.getVisibility() == 4) {
                    mo8619f();
                    return;
                }
                return;
            case NEXT:
                this.f7891I.mo9048a(false);
                return;
            case RESULT:
                if (this.f7894L.getVisibility() == 4) {
                    m13079y();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8608a(C2482bo.C2483a aVar, int i, int i2) {
        switch (aVar) {
            case START:
                m13062j(i, i2);
                this.f7891I.mo9053c();
                return;
            case QUIT:
                this.f7891I.mo9050b();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo8609a(ArrayList<C2543k> arrayList, ArrayList<C2553u> arrayList2, ArrayList<C2539g> arrayList3, ArrayList<C2544l> arrayList4) {
        m13058b(arrayList, arrayList2, arrayList3, arrayList4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8610b(int i) {
        this.f7928at[i].f7873w = false;
        mo8715q(i);
        this.f7928at[i].f7851a.mo9325e();
        this.f7928at[i].f7834G = false;
        if (C2557y.f9845q[i] != null) {
            C2557y.f9845q[i].mo10022c();
        }
        C2557y.f9845q[i] = null;
        if (C2557y.f9848t[i] != null) {
            C2557y.f9848t[i].mo10022c();
        }
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10022c();
        }
        this.f7928at[i].f7833F = 0;
        if (this.f7928at[i].f7848U != null) {
            mo8933g(this.f7928at[i].f7848U.mo9553b());
        } else {
            mo8933g("null");
        }
        mo8706l(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8611b(final int i, final int i2) {
        if (this.f7923ao) {
            return;
        }
        if (this.f7924ap[i] == null || !this.f7924ap[i].isShowing()) {
            this.f7924ap[i] = new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage((("" + C2557y.f9835g.f10137K) + C2557y.f9835g.f10169aP) + "(" + this.f7928at[i].f7848U.mo9553b() + ")").setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    switch (i2) {
                        case 10:
                        case 18:
                        case 19:
                            UI_A_Main.this.f7928at[i].f7874x = 10;
                            UI_A_Main.this.mo8620f(i);
                            return;
                        case 16:
                        case 17:
                            UI_A_Main.this.m13034A(i);
                            return;
                        default:
                            return;
                    }
                }
            }).show();
            this.f7924ap[i].setCanceledOnTouchOutside(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8612c(int i) {
        this.f7928at[i].f7875y = false;
        switch (this.f7928at[i].f7874x) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 16:
            case 17:
                m13061i(i, this.f7928at[i].f7874x);
                return;
            case 9:
            case 10:
                mo8620f(i);
                return;
            case 22:
                m13080y(i);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8613c(int i, int i2) {
        mo8623h();
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        if (C2557y.f9829a != null) {
            C2557y.f9829a.stop(C2557y.f9831c);
        }
        if (this.f7928at[i].f7851a.mo9322b()) {
            switch (this.f7928at[0].f7874x) {
                case 16:
                case 17:
                    if (i2 == 1) {
                        try {
                            Thread.sleep(50);
                            mo8710a(i, C2426b.C2428a.STOP_CODE);
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.gc();
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8614c() {
        if (this.f7932s.size() > 2) {
            if (this.f7896N.getVisibility() == 0) {
                m13039D();
                return true;
            } else if (this.f7937x.getVisibility() == 0 || this.f7936w.getVisibility() == 0) {
                m13072u();
                return true;
            } else if (this.f7894L.getVisibility() == 0) {
                m13081z();
                return true;
            } else if (this.f7900R.getVisibility() == 0) {
                m13035B();
                return true;
            } else if (this.f7892J.getVisibility() == 0) {
                m13074v();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8615d() {
        this.f7932s.pop();
        this.f7885C.setText((CharSequence) this.f7932s.peek());
        this.f7904V.setText((CharSequence) this.f7932s.get(this.f7932s.size() - 2));
        if (this.f7932s.size() == 2) {
            this.f7902T.setVisibility(4);
        } else {
            this.f7902T.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8616d(int i) {
        mo8702a(C2337ad.SpecificSkills);
        mo8614c();
        int i2 = 5;
        if ((C2557y.f9832d.f9755k == 1 || C2557y.f9832d.f9755k == 4 || C2557y.f9832d.f9755k == 7 || C2557y.f9832d.f9755k == 8 || C2557y.f9832d.f9755k == 10 || C2557y.f9832d.f9755k == 9) && C2557y.f9832d.f9748d == 1) {
            i2 = 5;
            this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_response_gray);
            this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_emergency_gray);
            this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_checkbreath_gray);
            this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_cpr_gray);
            this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_aed_gray);
        } else if ((C2557y.f9832d.f9755k == 1 || C2557y.f9832d.f9755k == 4 || C2557y.f9832d.f9755k == 7 || C2557y.f9832d.f9755k == 8 || C2557y.f9832d.f9755k == 10 || C2557y.f9832d.f9755k == 9) && C2557y.f9832d.f9748d == 2) {
            i2 = 5;
            this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_response_gray);
            this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_emergency_gray);
            this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_checkpulse_gray);
            this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_cpr_gray);
            this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_aed_gray);
        } else if (C2557y.f9832d.f9755k == 2 || C2557y.f9832d.f9755k == 5) {
            i2 = 7;
            this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_checkdanger_gray);
            this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_response_gray);
            this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_airway_gray);
            this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_checkbreath_gray);
            this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_emergency_gray);
            this.f7909aa[5].setImageResource(C2656R.drawable.btn_state_cpr_gray);
            this.f7909aa[6].setImageResource(C2656R.drawable.btn_state_aed_gray);
        } else if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
            i2 = 7;
            this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_checkdanger_gray);
            this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_response_gray);
            this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_emergency_gray);
            this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_airway_gray);
            this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_checkbreath_gray);
            this.f7909aa[5].setImageResource(C2656R.drawable.btn_state_cpr_gray);
            this.f7909aa[6].setImageResource(C2656R.drawable.btn_state_aed_gray);
        }
        for (int i3 = 0; i3 < 7; i3++) {
            if (i3 < i2) {
                this.f7909aa[i3].setVisibility(0);
            } else {
                this.f7909aa[i3].setVisibility(4);
            }
        }
        if ((C2557y.f9832d.f9755k != 1 && C2557y.f9832d.f9755k != 4 && C2557y.f9832d.f9755k != 7 && C2557y.f9832d.f9755k != 8 && C2557y.f9832d.f9755k != 10 && C2557y.f9832d.f9755k != 9) || C2557y.f9832d.f9748d != 1) {
            if ((C2557y.f9832d.f9755k != 1 && C2557y.f9832d.f9755k != 4 && C2557y.f9832d.f9755k != 7 && C2557y.f9832d.f9755k != 8 && C2557y.f9832d.f9755k != 10 && C2557y.f9832d.f9755k != 9) || C2557y.f9832d.f9748d != 2) {
                if (C2557y.f9832d.f9755k != 2 && C2557y.f9832d.f9755k != 5) {
                    if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                        switch (i) {
                            case 1:
                                this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_checkdanger_red);
                                break;
                            case 2:
                                this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_response_red);
                                break;
                            case 3:
                                this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_emergency_red);
                                break;
                            case 4:
                                this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_airway_red);
                                break;
                            case 5:
                                this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_checkbreath_red);
                                break;
                            case 8:
                                this.f7909aa[6].setImageResource(C2656R.drawable.btn_state_aed_red);
                                break;
                            case 16:
                            case 17:
                                this.f7909aa[5].setImageResource(C2656R.drawable.btn_state_cpr_red);
                                break;
                        }
                    }
                } else {
                    switch (i) {
                        case 1:
                            this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_checkdanger_red);
                            break;
                        case 2:
                            this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_response_red);
                            break;
                        case 3:
                            this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_emergency_red);
                            break;
                        case 4:
                            this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_airway_red);
                            break;
                        case 5:
                            this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_checkbreath_red);
                            break;
                        case 8:
                            this.f7909aa[6].setImageResource(C2656R.drawable.btn_state_aed_red);
                            break;
                        case 16:
                        case 17:
                            this.f7909aa[5].setImageResource(C2656R.drawable.btn_state_cpr_red);
                            break;
                    }
                }
            } else {
                switch (i) {
                    case 2:
                        this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_response_red);
                        break;
                    case 3:
                        this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_emergency_red);
                        break;
                    case 6:
                        this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_checkpulse_red);
                        break;
                    case 8:
                        this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_aed_red);
                        break;
                    case 16:
                    case 17:
                        this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_cpr_red);
                        break;
                }
            }
        } else {
            switch (i) {
                case 2:
                    this.f7909aa[0].setImageResource(C2656R.drawable.btn_state_response_red);
                    break;
                case 3:
                    this.f7909aa[1].setImageResource(C2656R.drawable.btn_state_emergency_red);
                    break;
                case 5:
                    this.f7909aa[2].setImageResource(C2656R.drawable.btn_state_checkbreath_red);
                    break;
                case 8:
                    this.f7909aa[4].setImageResource(C2656R.drawable.btn_state_aed_red);
                    break;
                case 16:
                case 17:
                    this.f7909aa[3].setImageResource(C2656R.drawable.btn_state_cpr_red);
                    break;
            }
        }
        for (int i4 = 0; i4 < 6; i4++) {
            if (this.f7928at[i4].f7851a.mo9322b()) {
                try {
                    Thread.sleep(50);
                    this.f7928at[i4].f7832E = 0;
                    switch (i) {
                        case 16:
                        case 17:
                            mo8712g(i4, 7);
                            break;
                        default:
                            mo8712g(i4, i);
                            break;
                    }
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        switch (i) {
            case 1:
                mo8625i();
                break;
            case 2:
                mo8627j();
                break;
            case 3:
                mo8630k();
                break;
            case 4:
                mo8632l();
                break;
            case 5:
                mo8633m();
                break;
            case 6:
                mo8634n();
                break;
            case 8:
                mo8638p();
                break;
            case 16:
            case 17:
                mo8635o();
                break;
        }
        for (int i5 = 0; i5 < 6; i5++) {
            if (this.f7928at[i5].f7851a.mo9322b()) {
                if (i == 16 || i == 17) {
                    m13048H(i5);
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        mo8703d(i5, i);
                        break;
                    case 16:
                        mo8704e(i5, i);
                        this.f7893K.mo8862a(i5, this.f7928at);
                        break;
                    case 17:
                        mo8705f(i5, i);
                        this.f7893K.mo8862a(i5, this.f7928at);
                        break;
                }
            } else {
                this.f7928at[i5].f7874x = 22;
                m13080y(i5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8617e() {
        this.f7885C.setText((CharSequence) this.f7932s.peek());
        this.f7904V.setText((CharSequence) this.f7932s.get(this.f7932s.size() - 2));
        if (this.f7932s.size() == 2) {
            this.f7902T.setVisibility(4);
        } else {
            this.f7902T.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8618e(int i) {
        mo8702a(C2337ad.FullCPRScenarioPreCPR);
        mo8614c();
        if (i == 9) {
        }
        if (i == 9 || i == 10) {
            for (int i2 = 0; i2 < 6; i2++) {
                if (this.f7928at[i2].f7851a.mo9322b()) {
                    try {
                        Thread.sleep(50);
                        this.f7928at[i2].f7832E = 0;
                        mo8712g(i2, i);
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        switch (i) {
            case 9:
                mo8639q();
                break;
            case 10:
                mo8640r();
                break;
        }
        for (int i3 = 0; i3 < 6; i3++) {
            if (this.f7928at[i3].f7851a.mo9322b()) {
                switch (i) {
                    case 9:
                    case 10:
                        mo8703d(i3, i);
                        break;
                }
                this.f7893K.mo8862a(i3, this.f7928at);
            } else {
                this.f7928at[i3].f7874x = 22;
                m13080y(i3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8619f() {
        if (this.f7900R.getVisibility() == 0) {
            m13035B();
        } else if (this.f7894L.getVisibility() == 0) {
            m13081z();
        }
        this.f7936w.setVisibility(0);
        this.f7937x.setVisibility(4);
        this.f7933t.mo8961b();
        if (((String) this.f7932s.peek()).equals(C2557y.f9835g.f10342dd)) {
            this.f7932s.pop();
        }
        this.f7932s.push(C2557y.f9835g.f10279cT);
        mo8617e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8620f(int i) {
        if (this.f7928at[i].f7851a.mo9322b()) {
            mo8703d(i, 10);
            this.f7893K.mo8862a(i, this.f7928at);
            try {
                Thread.sleep(50);
                mo8710a(i, C2426b.C2428a.START_CODE);
                Thread.sleep(100);
                this.f7928at[i].f7832E = 0;
                mo8712g(i, 10);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m13048H(i);
            C2556x.f9805v[i] = this.f7928at[i].f7846S.mo9819o();
            C2556x.f9807x[i] = null;
        }
        C2556x.f9788e = this.f7928at[i].f7846S.mo9825u();
        C2556x.f9789f = this.f7928at[i].f7846S.mo9826v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8621g() {
        this.f7884B = (ScalableLayout) findViewById(C2656R.C2657id.main_bg);
        this.f7885C = (TextView) findViewById(C2656R.C2657id.main_title_txt);
        this.f7886D = (TextView) findViewById(C2656R.C2657id.main_instructor_name_txt);
        this.f7887E = (TextView) findViewById(C2656R.C2657id.main_login_btn);
        this.f7902T = (ScalableLayout) findViewById(C2656R.C2657id.main_back_sc);
        this.f7903U = (ImageView) findViewById(C2656R.C2657id.main_back_btn);
        this.f7904V = (TextView) findViewById(C2656R.C2657id.main_back_txt);
        this.f7888F = (ScalableLayout) findViewById(C2656R.C2657id.navigation_bar);
        this.f7936w = (ScalableLayout) findViewById(C2656R.C2657id.fragment_education_setting);
        this.f7937x = (ScalableLayout) findViewById(C2656R.C2657id.fragment_basic_setting);
        this.f7938y = (ScalableLayout) findViewById(C2656R.C2657id.fragment_score_setting);
        this.f7890H = (ScalableLayout) findViewById(C2656R.C2657id.fragment_test_main);
        this.f7892J = (ScalableLayout) findViewById(C2656R.C2657id.fragment_detail);
        this.f7894L = (ScalableLayout) findViewById(C2656R.C2657id.fragment_data_management);
        this.f7900R = (ScalableLayout) findViewById(C2656R.C2657id.fragment_assign);
        this.f7896N = (ScalableLayout) findViewById(C2656R.C2657id.fragment_login);
        this.f7898P = (ScalableLayout) findViewById(C2656R.C2657id.fragment_senddata);
        this.f7922an[0] = (TextView) findViewById(C2656R.C2657id.fragment_slot1_default_txt);
        this.f7922an[1] = (TextView) findViewById(C2656R.C2657id.fragment_slot2_default_txt);
        this.f7922an[2] = (TextView) findViewById(C2656R.C2657id.fragment_slot3_default_txt);
        this.f7922an[3] = (TextView) findViewById(C2656R.C2657id.fragment_slot4_default_txt);
        this.f7922an[4] = (TextView) findViewById(C2656R.C2657id.fragment_slot5_default_txt);
        this.f7922an[5] = (TextView) findViewById(C2656R.C2657id.fragment_slot6_default_txt);
        this.f7928at[0].f7853c = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1);
        this.f7928at[1].f7853c = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2);
        this.f7928at[2].f7853c = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3);
        this.f7928at[3].f7853c = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4);
        this.f7928at[4].f7853c = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5);
        this.f7928at[5].f7853c = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6);
        this.f7928at[0].f7854d = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1_connect);
        this.f7928at[1].f7854d = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2_connect);
        this.f7928at[2].f7854d = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3_connect);
        this.f7928at[3].f7854d = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4_connect);
        this.f7928at[4].f7854d = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5_connect);
        this.f7928at[5].f7854d = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6_connect);
        this.f7928at[0].f7855e = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1_basic);
        this.f7928at[1].f7855e = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2_basic);
        this.f7928at[2].f7855e = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3_basic);
        this.f7928at[3].f7855e = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4_basic);
        this.f7928at[4].f7855e = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5_basic);
        this.f7928at[5].f7855e = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6_basic);
        this.f7928at[0].f7856f = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1_compression);
        this.f7928at[1].f7856f = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2_compression);
        this.f7928at[2].f7856f = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3_compression);
        this.f7928at[3].f7856f = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4_compression);
        this.f7928at[4].f7856f = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5_compression);
        this.f7928at[5].f7856f = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6_compression);
        this.f7928at[0].f7857g = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1_breath);
        this.f7928at[1].f7857g = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2_breath);
        this.f7928at[2].f7857g = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3_breath);
        this.f7928at[3].f7857g = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4_breath);
        this.f7928at[4].f7857g = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5_breath);
        this.f7928at[5].f7857g = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6_breath);
        this.f7928at[0].f7858h = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1_result);
        this.f7928at[1].f7858h = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2_result);
        this.f7928at[2].f7858h = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3_result);
        this.f7928at[3].f7858h = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4_result);
        this.f7928at[4].f7858h = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5_result);
        this.f7928at[5].f7858h = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6_result);
        this.f7928at[0].f7859i = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot1_calibration);
        this.f7928at[1].f7859i = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot2_calibration);
        this.f7928at[2].f7859i = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot3_calibration);
        this.f7928at[3].f7859i = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot4_calibration);
        this.f7928at[4].f7859i = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot5_calibration);
        this.f7928at[5].f7859i = (ScalableLayout) findViewById(C2656R.C2657id.fragment_slot6_calibration);
        this.f7909aa[0] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_1);
        this.f7909aa[1] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_2);
        this.f7909aa[2] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_3);
        this.f7909aa[3] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_4);
        this.f7909aa[4] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_5);
        this.f7909aa[5] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_6);
        this.f7909aa[6] = (ImageView) findViewById(C2656R.C2657id.specific_control_icon_7);
        this.f7908Z = (ScalableLayout) findViewById(C2656R.C2657id.specific_control_sc);
        this.f7905W = (ScalableLayout) findViewById(C2656R.C2657id.connect_control_sc);
        this.f7906X = (ImageView) findViewById(C2656R.C2657id.connect_start_btn);
        this.f7907Y = (TextView) findViewById(C2656R.C2657id.connect_start_txt);
        this.f7910ab = (ScalableLayout) findViewById(C2656R.C2657id.fullcpr_control_sc);
        this.f7911ac = (ScalableLayout) findViewById(C2656R.C2657id.fullcpr_control_cpr_sc);
        this.f7912ad = (ScalableLayout) findViewById(C2656R.C2657id.fullcpr_control_result_sc);
        this.f7913ae = (ImageView) findViewById(C2656R.C2657id.fullcpr_control_cpr_stop_btn);
        this.f7914af = (TextView) findViewById(C2656R.C2657id.fullcpr_control_cpr_stop_txt);
        this.f7915ag = (ImageView) findViewById(C2656R.C2657id.fullcpr_control_result_retry_btn);
        this.f7916ah = (TextView) findViewById(C2656R.C2657id.fullcpr_control_result_retry_txt);
        this.f7917ai = (ScalableLayout) findViewById(C2656R.C2657id.watch_sc);
        this.f7919ak = (ImageView) findViewById(C2656R.C2657id.watch_img);
        this.f7918aj = (TextView) findViewById(C2656R.C2657id.watch_txt);
        this.f7920al = (ImageView) findViewById(C2656R.C2657id.watch_close);
        this.f7921am = (AnimationDrawable) this.f7919ak.getBackground();
        for (int i = 0; i < 7; i++) {
            this.f7909aa[i].setOnClickListener(this);
        }
        this.f7887E.setOnClickListener(this);
        if (C2557y.f9811B.mo9548c() == -1) {
            this.f7886D.setText("");
            this.f7887E.setText("LMS " + C2557y.f9835g.f10153a);
        } else {
            this.f7886D.setText(C2557y.f9811B.mo9549d());
            this.f7887E.setText("LMS " + C2557y.f9835g.f10472gA);
        }
        String str = "";
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 128).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        this.f7903U.setOnClickListener(this);
        this.f7904V.setOnClickListener(this);
        this.f7920al.setOnClickListener(this);
        this.f7906X.setOnClickListener(this);
        this.f7913ae.setOnClickListener(this);
        this.f7915ag.setOnClickListener(this);
        for (int i2 = 0; i2 < 6; i2++) {
            this.f7928at[i2].f7860j = C2456bi.m13535a(i2, 1, (String) null);
            this.f7928at[i2].f7861k = C2442be.m13502a(i2, 2, (String) null);
            this.f7928at[i2].f7862l = C2452bh.m13527a(i2, 16, (String) null);
            this.f7928at[i2].f7863m = C2445bf.m13507a(i2, 17, (String) null);
            this.f7928at[i2].f7864n = C2459bj.m13547a(i2, 11, (String) null);
            this.f7928at[i2].f7865o = C2449bg.m13515a(i2, 0, (String) null);
        }
        this.f7883A = this.f7939z.beginTransaction();
        for (int i3 = 0; i3 < 6; i3++) {
            this.f7883A.add(this.f7928at[i3].f7854d.getId(), this.f7928at[i3].f7860j);
            this.f7883A.add(this.f7928at[i3].f7855e.getId(), this.f7928at[i3].f7861k);
            this.f7883A.add(this.f7928at[i3].f7856f.getId(), this.f7928at[i3].f7862l);
            this.f7883A.add(this.f7928at[i3].f7857g.getId(), this.f7928at[i3].f7863m);
            this.f7883A.add(this.f7928at[i3].f7858h.getId(), this.f7928at[i3].f7864n);
            this.f7883A.add(this.f7928at[i3].f7859i.getId(), this.f7928at[i3].f7865o);
        }
        this.f7883A.commit();
        this.f7889G = C2418ay.m13397a(str);
        this.f7933t = C2436bc.m13475a("1");
        this.f7934u = C2433bb.m13458a("1");
        this.f7935v = C2439bd.m13495a("1");
        this.f7891I = C2465bl.m13561a("1");
        this.f7893K = C2405av.m13353a("1");
        this.f7895M = C2402au.m13344a("1");
        this.f7901S = C2396at.m13309a("1");
        this.f7897O = C2429ba.m13445a("1");
        this.f7899Q = C2421az.m13404a("1");
        this.f7883A = this.f7939z.beginTransaction();
        this.f7883A.add(this.f7888F.getId(), this.f7889G);
        this.f7883A.add(C2656R.C2657id.fragment_education_setting, this.f7933t);
        this.f7883A.add(C2656R.C2657id.fragment_basic_setting, this.f7934u);
        this.f7883A.add(C2656R.C2657id.fragment_score_setting, this.f7935v);
        this.f7883A.add(C2656R.C2657id.fragment_test_main, this.f7891I);
        this.f7883A.add(C2656R.C2657id.fragment_detail, this.f7893K);
        this.f7883A.add(C2656R.C2657id.fragment_data_management, this.f7895M);
        this.f7883A.add(C2656R.C2657id.fragment_assign, this.f7901S);
        this.f7883A.add(C2656R.C2657id.fragment_login, this.f7897O);
        this.f7883A.add(C2656R.C2657id.fragment_senddata, this.f7899Q);
        this.f7883A.commit();
        this.f7932s.push(C2557y.f9835g.f10273cN);
        this.f7932s.push(C2557y.f9835g.f10273cN);
        this.f7932s.push(C2557y.f9835g.f10279cT);
        this.f7936w.setVisibility(0);
        this.f7937x.setVisibility(4);
        this.f7938y.setVisibility(4);
        this.f7890H.setVisibility(4);
        this.f7892J.setVisibility(4);
        this.f7894L.setVisibility(4);
        this.f7900R.setVisibility(4);
        this.f7896N.setVisibility(4);
        this.f7898P.setVisibility(4);
        for (int i4 = 0; i4 < 6; i4++) {
            this.f7922an[i4].setText(C2557y.f9835g.f10357ds);
            this.f7928at[i4].f7853c.setOnClickListener(this);
        }
        this.f7907Y.setText(C2557y.f9835g.f10473gB);
        this.f7914af.setText(C2557y.f9835g.f10276cQ);
        this.f7916ah.setText(C2557y.f9835g.f10203ax);
        mo8617e();
        mo8623h();
        for (int i5 = 0; i5 < 6; i5++) {
            mo8717s(i5);
            this.f7928at[i5].f7851a.mo9315a(this.f7928at[i5].f7852b);
            this.f7928at[i5].f7846S = new C2621y(new C2597e(C2590az.ADJUST_ZERO, 1, C2557y.f9832d.f9755k, C2557y.f9832d.f9747c, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i), C2556x.f9801r[i5], C2556x.f9802s[i5], C2556x.f9803t[i5], C2556x.f9804u[i5]);
            C2556x.f9788e = this.f7928at[i5].f7846S.mo9825u();
            C2556x.f9789f = this.f7928at[i5].f7846S.mo9826v();
            mo8700a(i5, C2337ad.Connect);
            C2557y.f9848t[i5] = new C2616u(this.f7928at[i5].f7867q, 1.0d);
            C2557y.f9849u[i5] = new C2616u(this.f7928at[i5].f7868r, 0.5d);
        }
        mo8702a(C2337ad.Connect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8622g(int i) {
        if (this.f7928at[i].f7851a.mo9322b()) {
            try {
                Thread.sleep(50);
                mo8710a(i, C2426b.C2428a.STOP_CODE);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.f7928at[i].f7836I = true;
        this.f7928at[i].f7837J = 0;
        if (C2557y.f9847s[i] != null) {
            C2557y.f9847s[i].mo10022c();
        }
        C2557y.f9847s[i] = null;
        C2557y.f9847s[i] = new C2616u(this.f7928at[i].f7866p, 1.0d);
        C2557y.f9847s[i].mo10021b();
        mo8629j(C2557y.f9835g.f10150X);
        if (this.f7928at[i].f7851a.mo9322b()) {
            mo8703d(i, 20);
            this.f7893K.mo8862a(i, this.f7928at);
            return;
        }
        this.f7928at[i].f7874x = 22;
        m13080y(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8623h() {
        if (this.f7921am != null) {
            this.f7921am.stop();
        }
        this.f7917ai.setVisibility(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8624h(int i) {
        if (m13047H() == 0) {
            mo8702a(C2337ad.FullCPRScenarioResult);
        }
        if (this.f7928at[i].f7851a.mo9322b()) {
            mo8707m(i);
            this.f7893K.mo8865b(i, this.f7928at);
            if (C2556x.f9805v[i].mo9972a() == -1) {
                m13052a(i, false, C2557y.f9854z[i], C2557y.f9832d);
            }
            try {
                Thread.sleep(50);
                this.f7928at[i].f7832E = 0;
                mo8718t(i);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            this.f7928at[i].f7874x = 22;
            m13080y(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8625i() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_anz);
                        } else {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_en);
                        }
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkdanger_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        if ((C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) && C2557y.f9832d.f9754j.equals("en")) {
            mo8629j(C2557y.f9835g.f10308cw);
        } else {
            mo8629j(C2557y.f9835g.f10299cn);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8626i(int i) {
        mo8623h();
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        switch (this.f7928at[i].f7874x) {
            case 9:
                m13049I();
                return;
            case 20:
                m13036B(i);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8627j() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_anz);
                        } else {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_en);
                        }
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.response_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        if ((C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) && C2557y.f9832d.f9754j.equals("en")) {
            mo8629j(C2557y.f9835g.f10310cy);
        } else {
            mo8629j(C2557y.f9835g.f10228bV);
        }
    }

    /* renamed from: j */
    public void mo8628j(int i) {
        this.f7891I.mo9054c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8629j(String str) {
        this.f7917ai.setVisibility(0);
        this.f7918aj.setText(str);
        this.f7919ak.setBackgroundResource(C2656R.drawable.img_watch);
        this.f7921am = (AnimationDrawable) this.f7919ak.getBackground();
        this.f7921am.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8630k() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_anz);
                        } else {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_en);
                        }
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.emergency_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        if ((C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) && C2557y.f9832d.f9754j.equals("en")) {
            mo8629j(C2557y.f9835g.f10260cA);
        } else {
            mo8629j(C2557y.f9835g.f10230bX);
        }
    }

    /* renamed from: k */
    public void mo8631k(int i) {
        this.f7891I.mo9048a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8632l() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_anz);
                        } else {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_en);
                        }
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.airway_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        if ((C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) && C2557y.f9832d.f9754j.equals("en")) {
            mo8629j(C2557y.f9835g.f10262cC);
        } else {
            mo8629j(C2557y.f9835g.f10301cp);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8633m() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_anz);
                        } else {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_en);
                        }
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkbreath_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        if ((C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) && C2557y.f9832d.f9754j.equals("en")) {
            mo8629j(C2557y.f9835g.f10264cE);
        } else {
            mo8629j(C2557y.f9835g.f10303cr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo8634n() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkpulse_en);
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkpulse_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkpulse_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkpulse_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkpulse_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.checkpulse_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        mo8629j(C2557y.f9835g.f10232bZ);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8635o() {
        int i = 0;
        switch ((C2557y.f9832d.f9750f * 10) + 100) {
            case 100:
                C2557y.f9830b = C2557y.f9829a.load(this, C2656R.raw.compression_guide100, 1);
                break;
            case 110:
                C2557y.f9830b = C2557y.f9829a.load(this, C2656R.raw.compression_guide110, 1);
                break;
            case 120:
                C2557y.f9830b = C2557y.f9829a.load(this, C2656R.raw.compression_guide120, 1);
                break;
        }
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.compression_en);
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.compression_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.compression_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.compression_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.compression_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.compression_en);
                    }
                    UI_A_Main.this.f7927as.start();
                    if (C2557y.f9832d.f9746b != 2) {
                        C2557y.f9829a.stop(C2557y.f9831c);
                        C2557y.f9831c = C2557y.f9829a.play(C2557y.f9830b, 1.0f, 1.0f, 0, -1, 1.0f);
                    }
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        while (true) {
            int i2 = i;
            if (i2 < 6) {
                if (this.f7928at[i2].f7851a.mo9322b()) {
                    try {
                        Thread.sleep(50);
                        mo8710a(i2, C2426b.C2428a.START_CODE);
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i = i2 + 1;
            } else {
                mo8623h();
                return;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            mo8711a(intent, i);
        } else {
            this.f7891I.mo9052b(this.f7928at);
        }
    }

    public void onBackPressed() {
        if (!mo8614c()) {
            new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10258bz).setMessage(C2557y.f9835g.f10241bi).setPositiveButton(C2557y.f9835g.f10211bE, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    UI_A_Main.this.mo8932b();
                }
            }).setNegativeButton(C2557y.f9835g.f10212bF, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
        }
    }

    public void onClick(View view) {
        int i = 0;
        int id = view.getId();
        switch (id) {
            case C2656R.C2657id.connect_start_btn /*2131230922*/:
                boolean z = true;
                boolean z2 = false;
                for (int i2 = 0; i2 < 6; i2++) {
                    if (this.f7928at[i2].f7851a.f9568a) {
                        if (this.f7928at[i2].f7850W) {
                            z = false;
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                    }
                }
                if (z2 && z) {
                    switch (C2557y.f9832d.f9745a) {
                        case 1:
                            switch (C2557y.f9832d.f9755k) {
                                case 1:
                                case 4:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    for (int i3 = 0; i3 < 6; i3++) {
                                        this.f7928at[i3].f7874x = 2;
                                    }
                                    break;
                                default:
                                    for (int i4 = 0; i4 < 6; i4++) {
                                        this.f7928at[i4].f7874x = 1;
                                    }
                                    break;
                            }
                            mo8616d(this.f7928at[0].f7874x);
                            return;
                        case 2:
                            break;
                        default:
                            return;
                    }
                    while (i < 6) {
                        this.f7928at[i].f7874x = 9;
                        i++;
                    }
                    mo8618e(9);
                    return;
                }
                return;
            case C2656R.C2657id.fragment_slot1 /*2131231578*/:
            case C2656R.C2657id.fragment_slot2 /*2131231586*/:
            case C2656R.C2657id.fragment_slot3 /*2131231594*/:
            case C2656R.C2657id.fragment_slot4 /*2131231602*/:
            case C2656R.C2657id.fragment_slot5 /*2131231610*/:
            case C2656R.C2657id.fragment_slot6 /*2131231618*/:
                int i5 = 0;
                while (true) {
                    if (i5 < 6) {
                        if (this.f7928at[i5].f7853c.getId() == id) {
                            i = i5;
                        } else {
                            i5++;
                        }
                    }
                }
                switch (this.f7928at[i].f7874x) {
                    case 10:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        m13076w(i);
                        return;
                    default:
                        return;
                }
            case C2656R.C2657id.fullcpr_control_cpr_stop_btn /*2131231629*/:
                m13051K();
                return;
            case C2656R.C2657id.fullcpr_control_result_retry_btn /*2131231631*/:
                break;
            case C2656R.C2657id.main_back_btn /*2131231651*/:
            case C2656R.C2657id.main_back_txt /*2131231653*/:
                mo8614c();
                return;
            case C2656R.C2657id.main_login_btn /*2131231656*/:
                if (C2557y.f9811B.mo9548c() != -1) {
                    C2557y.f9811B.mo9546b(-1);
                    this.f7929au.mo9624a(C2557y.f9811B);
                    this.f7886D.setText("");
                    this.f7887E.setText("LMS " + C2557y.f9835g.f10153a);
                    this.f7891I.mo9052b(this.f7928at);
                    return;
                } else if (m13432a((Context) this)) {
                    m13037C();
                    return;
                } else {
                    return;
                }
            case C2656R.C2657id.specific_control_icon_1 /*2131231815*/:
            case C2656R.C2657id.specific_control_icon_2 /*2131231816*/:
            case C2656R.C2657id.specific_control_icon_3 /*2131231817*/:
            case C2656R.C2657id.specific_control_icon_4 /*2131231818*/:
            case C2656R.C2657id.specific_control_icon_5 /*2131231819*/:
            case C2656R.C2657id.specific_control_icon_6 /*2131231820*/:
            case C2656R.C2657id.specific_control_icon_7 /*2131231821*/:
                int i6 = 0;
                while (true) {
                    if (i6 >= 7) {
                        i6 = 0;
                    } else if (this.f7909aa[i6].getId() != id) {
                        i6++;
                    }
                }
                for (int i7 = 0; i7 < 6; i7++) {
                    mo8613c(i7, 1);
                }
                int v = m13073v(i6);
                while (i < 6) {
                    this.f7928at[i].f7874x = v;
                    i++;
                }
                mo8616d(v);
                return;
            case C2656R.C2657id.watch_close /*2131233290*/:
                char c = 22;
                int i8 = 0;
                while (true) {
                    if (i8 < 6) {
                        if (this.f7928at[i8].f7874x == 9) {
                            c = 9;
                        } else {
                            i8++;
                        }
                    }
                }
                if (c == 9) {
                    while (i < 6) {
                        mo8626i(i);
                        if (this.f7928at[i].f7851a.f9568a) {
                            this.f7928at[i].f7874x = 10;
                        }
                        i++;
                    }
                    mo8618e(10);
                    return;
                }
                mo8623h();
                return;
            default:
                return;
        }
        while (i < 6) {
            if (this.f7928at[i].f7851a.f9568a) {
                this.f7928at[i].f7874x = 9;
            }
            i++;
        }
        mo8618e(9);
    }

    public void onCreate(Bundle bundle) {
        Log.d("UI_A_Main", "onCreate");
        super.onCreate(bundle);
        setContentView(C2656R.layout.main);
        Log.e("UI_A_Main", "onCreate");
        this.f7929au = new C2549q(this);
        this.f7930av = new C2548p(this);
        C2557y.f9832d = this.f7929au.mo9622a();
        C2557y.f9853y = this.f7929au.mo9627b();
        C2557y.f9834f = this.f7929au.mo9629c();
        C2557y.f9811B = this.f7929au.mo9630d();
        C2557y.f9833e = new C2340ag();
        if (C2557y.f9829a != null) {
            C2557y.f9829a.stop(C2557y.f9831c);
            C2557y.f9829a.release();
            C2557y.f9829a = null;
        }
        C2557y.f9829a = new SoundPool(1, 3, 0);
        this.f7939z = getFragmentManager();
        this.f7923ao = false;
        for (int i = 0; i < 6; i++) {
            this.f7928at[i] = new C2338ae();
            this.f7928at[i].f7851a = C2555w.f9780a[i];
            this.f7928at[i].f7833F = 0;
            this.f7928at[i].f7834G = false;
            this.f7928at[i].f7873w = false;
            this.f7928at[i].f7875y = false;
            mo8716r(i);
            this.f7928at[i].f7845R = false;
            this.f7928at[i].f7838K = false;
            this.f7928at[i].f7874x = 22;
            if (C2557y.f9834f.mo9403b()[i] == -1 || this.f7929au.mo9620a(C2557y.f9834f.mo9403b()[i]) == null) {
                this.f7928at[i].f7848U = new C2547o(-1, "null", "null", -1, -1, -1);
            } else {
                this.f7928at[i].f7848U = this.f7929au.mo9620a(C2557y.f9834f.mo9403b()[i]);
            }
        }
        mo8621g();
        if (C2555w.f9781b.getState() == 13 || C2555w.f9781b.getState() == 10) {
            new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10217bK).setMessage(C2557y.f9835g.f10248bp).setPositiveButton(C2557y.f9835g.f10211bE, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C2555w.f9781b.enable();
                }
            }).setNegativeButton(C2557y.f9835g.f10210bD, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    UI_A_Main.this.mo8932b();
                }
            }).show().setCanceledOnTouchOutside(false);
        }
        new Handler() {
            public void handleMessage(Message message) {
                for (int i = 0; i < 6; i++) {
                    if (UI_A_Main.this.f7928at[i].f7848U == null || UI_A_Main.this.f7928at[i].f7848U.mo9553b().equals("null")) {
                        UI_A_Main.this.f7928at[i].f7872v = true;
                    } else {
                        UI_A_Main.this.f7928at[i].f7872v = false;
                        UI_A_Main.this.f7928at[i].f7860j.mo9021b(UI_A_Main.this.f7928at[i].f7848U.mo9553b());
                    }
                }
                UI_A_Main.this.m13043F();
            }
        }.sendEmptyMessageDelayed(0, 500);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7923ao = true;
        for (int i = 0; i < 6; i++) {
            if (this.f7928at[i].f7851a.mo9322b()) {
                this.f7928at[i].f7851a.mo9325e();
            }
            C2557y.f9854z[i] = null;
        }
        if (C2557y.f9829a != null) {
            C2557y.f9829a.stop(C2557y.f9831c);
            C2557y.f9829a.release();
            C2557y.f9829a = null;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (C2557y.f9851w[i2] != null) {
                C2557y.f9851w[i2].mo10022c();
                C2557y.f9851w[i2] = null;
            }
        }
        this.f7899Q.mo8917b();
        System.gc();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8638p() {
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        if (C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_anz);
                        } else {
                            UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_en);
                        }
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.aed_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        if ((C2557y.f9832d.f9755k == 3 || C2557y.f9832d.f9755k == 6) && C2557y.f9832d.f9754j.equals("en")) {
            mo8629j(C2557y.f9835g.f10266cG);
        } else {
            mo8629j(C2557y.f9835g.f10291cf + "\n" + C2557y.f9835g.f10292cg + "\n" + C2557y.f9835g.f10293ch + "\n" + C2557y.f9835g.f10294ci);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8639q() {
        mo8702a(C2337ad.FullCPRScenarioPreCPR);
        if (this.f7927as != null) {
            if (this.f7927as.isPlaying()) {
                this.f7927as.stop();
            }
            this.f7927as.release();
            this.f7927as = null;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    UI_A_Main.this.f7925aq = true;
                    UI_A_Main.this.f7926ar = 0;
                    if (C2557y.f9846r != null) {
                        C2557y.f9846r.mo10022c();
                    }
                    C2557y.f9846r = null;
                    C2557y.f9846r = new C2616u(UI_A_Main.this.f7659ay, 1.0d);
                    C2557y.f9846r.mo10021b();
                    if (C2557y.f9832d.f9754j.equals("en")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.school_en);
                    } else if (C2557y.f9832d.f9754j.equals("de")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.school_de);
                    } else if (C2557y.f9832d.f9754j.equals("es")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.school_es);
                    } else if (C2557y.f9832d.f9754j.equals("fr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.school_fr);
                    } else if (C2557y.f9832d.f9754j.equals("kr")) {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.school_kr);
                    } else {
                        UI_A_Main.this.f7927as = MediaPlayer.create(UI_A_Main.this, C2656R.raw.school_en);
                    }
                    UI_A_Main.this.f7927as.start();
                } catch (Exception e) {
                    Log.e("UI_A_Main", "onCreate : Sound Error");
                }
            }
        }.sendEmptyMessageDelayed(0, 400);
        mo8629j(C2557y.f9835g.f10143Q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8640r() {
        mo8702a(C2337ad.FullCPRScenarioPreCPR);
        for (int i = 0; i < 6; i++) {
            if (this.f7928at[i].f7851a.mo9322b()) {
                try {
                    Thread.sleep(50);
                    mo8710a(i, C2426b.C2428a.START_CODE);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            m13048H(i);
            C2556x.f9805v[i] = this.f7928at[i].f7846S.mo9819o();
            C2556x.f9807x[i] = null;
        }
        C2556x.f9788e = this.f7928at[0].f7846S.mo9825u();
        C2556x.f9789f = this.f7928at[0].f7846S.mo9826v();
        mo8629j(C2557y.f9835g.f10394ec);
    }

    /* renamed from: s */
    public void mo8641s() {
        this.f7895M.mo8845c();
    }
}
