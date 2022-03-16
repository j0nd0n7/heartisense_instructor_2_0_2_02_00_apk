package com.imlabworld.HS_Instructor;

import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2562a;
import com.imlabworld.p079a.C2591b;
import com.imlabworld.p079a.C2596d;
import com.imlabworld.p079a.C2597e;
import com.imlabworld.p079a.C2614s;
import com.imlabworld.p079a.C2615t;
import com.ssomai.android.scalablelayout.ScalableLayout;
import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.imlabworld.HS_Instructor.ah */
public class C2341ah extends C2426b implements View.OnClickListener {

    /* renamed from: A */
    FragmentTransaction f7883A;

    /* renamed from: B */
    ScalableLayout f7884B;

    /* renamed from: C */
    TextView f7885C;

    /* renamed from: D */
    TextView f7886D;

    /* renamed from: E */
    TextView f7887E;

    /* renamed from: F */
    ScalableLayout f7888F;

    /* renamed from: G */
    C2418ay f7889G;

    /* renamed from: H */
    ScalableLayout f7890H;

    /* renamed from: I */
    C2465bl f7891I;

    /* renamed from: J */
    ScalableLayout f7892J;

    /* renamed from: K */
    C2405av f7893K;

    /* renamed from: L */
    ScalableLayout f7894L;

    /* renamed from: M */
    C2402au f7895M;

    /* renamed from: N */
    ScalableLayout f7896N;

    /* renamed from: O */
    C2429ba f7897O;

    /* renamed from: P */
    ScalableLayout f7898P;

    /* renamed from: Q */
    C2421az f7899Q;

    /* renamed from: R */
    ScalableLayout f7900R;

    /* renamed from: S */
    C2396at f7901S;

    /* renamed from: T */
    ScalableLayout f7902T;

    /* renamed from: U */
    ImageView f7903U;

    /* renamed from: V */
    TextView f7904V;

    /* renamed from: W */
    ScalableLayout f7905W;

    /* renamed from: X */
    ImageView f7906X;

    /* renamed from: Y */
    TextView f7907Y;

    /* renamed from: Z */
    ScalableLayout f7908Z;

    /* renamed from: aa */
    final ImageView[] f7909aa = new ImageView[7];

    /* renamed from: ab */
    ScalableLayout f7910ab;

    /* renamed from: ac */
    ScalableLayout f7911ac;

    /* renamed from: ad */
    ScalableLayout f7912ad;

    /* renamed from: ae */
    ImageView f7913ae;

    /* renamed from: af */
    TextView f7914af;

    /* renamed from: ag */
    ImageView f7915ag;

    /* renamed from: ah */
    TextView f7916ah;

    /* renamed from: ai */
    ScalableLayout f7917ai;

    /* renamed from: aj */
    TextView f7918aj;

    /* renamed from: ak */
    ImageView f7919ak;

    /* renamed from: al */
    ImageView f7920al;

    /* renamed from: am */
    AnimationDrawable f7921am;

    /* renamed from: an */
    final TextView[] f7922an = new TextView[6];

    /* renamed from: ao */
    boolean f7923ao;

    /* renamed from: ap */
    final Dialog[] f7924ap = new Dialog[6];

    /* renamed from: aq */
    boolean f7925aq;

    /* renamed from: ar */
    int f7926ar;

    /* renamed from: as */
    MediaPlayer f7927as;

    /* renamed from: at */
    final C2338ae[] f7928at = new C2338ae[6];

    /* renamed from: au */
    C2549q f7929au;

    /* renamed from: av */
    C2548p f7930av;

    /* renamed from: r */
    String f7931r = "UI_A_Main_1P";

    /* renamed from: s */
    Stack<String> f7932s = new Stack<>();

    /* renamed from: t */
    C2436bc f7933t;

    /* renamed from: u */
    C2433bb f7934u;

    /* renamed from: v */
    C2439bd f7935v;

    /* renamed from: w */
    ScalableLayout f7936w;

    /* renamed from: x */
    ScalableLayout f7937x;

    /* renamed from: y */
    ScalableLayout f7938y;

    /* renamed from: z */
    FragmentManager f7939z;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2591b mo8699a(ArrayList<C2615t> arrayList, ArrayList<C2614s> arrayList2) {
        return new C2562a(new C2596d(C2557y.f9853y.mo9662b() == 1, C2557y.f9853y.mo9664c() == 1, C2557y.f9853y.mo9666d() == 1, C2557y.f9853y.mo9668e() == 1, C2557y.f9853y.mo9670f() == 1, C2557y.f9853y.mo9672g() == 1, C2557y.f9853y.mo9674h()), new C2597e(C2557y.f9832d.mo9680b(), C2557y.f9832d.mo9681c(), C2557y.f9832d.f9755k, C2557y.f9832d.f9747c, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i)).mo9790a(arrayList, arrayList2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8589a(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8700a(int i, C2337ad adVar) {
        this.f7928at[i].f7853c.setVisibility(0);
        this.f7928at[i].f7855e.setVisibility(4);
        this.f7928at[i].f7854d.setVisibility(4);
        this.f7928at[i].f7856f.setVisibility(4);
        this.f7928at[i].f7857g.setVisibility(4);
        this.f7928at[i].f7858h.setVisibility(4);
        this.f7928at[i].f7859i.setVisibility(4);
        switch (adVar) {
            case Connect:
                this.f7928at[i].f7854d.setVisibility(0);
                return;
            case Basic:
                this.f7928at[i].f7855e.setVisibility(0);
                return;
            case Compression:
                this.f7928at[i].f7856f.setVisibility(0);
                return;
            case Breath:
                this.f7928at[i].f7857g.setVisibility(0);
                return;
            case Result:
                this.f7928at[i].f7858h.setVisibility(0);
                return;
            case Calibration:
                this.f7928at[i].f7859i.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8701a(int i, String str) {
        this.f7893K.mo8861a(i, str);
        this.f7928at[i].f7861k.mo8976a(str);
        this.f7928at[i].f7860j.mo9017a(str);
        this.f7928at[i].f7865o.mo8995a(str);
        this.f7928at[i].f7862l.mo9008a(str);
        this.f7928at[i].f7863m.mo8985a(str);
        this.f7928at[i].f7864n.mo9030a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8702a(C2337ad adVar) {
        this.f7905W.setVisibility(4);
        this.f7908Z.setVisibility(4);
        this.f7910ab.setVisibility(4);
        this.f7911ac.setVisibility(4);
        this.f7912ad.setVisibility(4);
        switch (adVar) {
            case Connect:
                this.f7905W.setVisibility(0);
                return;
            case SpecificSkills:
                this.f7908Z.setVisibility(0);
                return;
            case FullCPRScenarioCPR:
                this.f7910ab.setVisibility(0);
                this.f7911ac.setVisibility(0);
                return;
            case FullCPRScenarioResult:
                this.f7910ab.setVisibility(0);
                this.f7912ad.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8610b(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8611b(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8612c(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8613c(int i, int i2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo8614c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8615d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8616d(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8703d(int i, int i2) {
        mo8700a(i, C2337ad.Basic);
        this.f7928at[i].f7861k.mo8975a(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8617e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8618e(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8704e(int i, int i2) {
        mo8700a(i, C2337ad.Compression);
        this.f7928at[i].f7862l.mo9006a(i2);
        this.f7928at[i].f7862l.mo9009b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8619f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8620f(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8705f(int i, int i2) {
        mo8700a(i, C2337ad.Breath);
        this.f7928at[i].f7863m.mo8983a(i2);
        this.f7928at[i].f7863m.mo8986b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8621g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8622g(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8623h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8624h(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8625i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8626i(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8627j() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8629j(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8630k() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8632l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo8706l(int i) {
        mo8700a(i, C2337ad.Connect);
        if (this.f7928at[i].f7851a.f9568a) {
            this.f7928at[i].f7860j.mo9020b(4);
        } else if (this.f7928at[i].f7872v) {
            this.f7928at[i].f7860j.mo9020b(1);
        } else {
            this.f7928at[i].f7860j.mo9020b(2);
        }
        this.f7928at[i].f7860j.mo9022c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8633m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo8707m(int i) {
        mo8700a(i, C2337ad.Result);
        this.f7928at[i].f7864n.mo9031a(C2556x.f9805v[i].mo9976c(), C2556x.f9805v[i].mo9974b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo8634n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo8708n(int i) {
        mo8700a(i, C2337ad.Calibration);
        this.f7928at[i].f7865o.mo8992a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo8709o(int i) {
        if (!this.f7928at[i].f7851a.f9568a) {
            return 20;
        }
        int d = C2557y.f9832d.f9747c == 1 ? this.f7928at[i].f7848U.mo9558d() : C2557y.f9832d.f9747c == 2 ? this.f7928at[i].f7848U.mo9560e() : this.f7928at[i].f7848U.mo9561f();
        if (d == -1) {
            this.f7928at[i].f7860j.mo9018a(true);
            return 20;
        }
        this.f7928at[i].f7860j.mo9018a(false);
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo8635o() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onClick(View view) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8638p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8639q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8640r() {
    }
}
