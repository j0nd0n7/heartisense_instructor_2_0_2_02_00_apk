package android.support.p010v4.p013c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.p010v4.p033o.C0900o;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.c.ag */
public class C0199ag {

    /* renamed from: a */
    private final C0200ah<?> f1208a;

    private C0199ag(C0200ah<?> ahVar) {
        this.f1208a = ahVar;
    }

    /* renamed from: a */
    public static final C0199ag m1117a(C0200ah<?> ahVar) {
        return new C0199ag(ahVar);
    }

    @C0003aa
    /* renamed from: a */
    public C0186ad mo1003a(String str) {
        return this.f1208a.f1212d.mo1120b(str);
    }

    /* renamed from: a */
    public C0201ai mo1004a() {
        return this.f1208a.mo1051k();
    }

    /* renamed from: a */
    public View mo1005a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1208a.f1212d.mo1103a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public List<C0186ad> mo1006a(List<C0186ad> list) {
        if (this.f1208a.f1212d.f1253l == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>(mo1021c());
        }
        list.addAll(this.f1208a.f1212d.f1253l);
        return list;
    }

    /* renamed from: a */
    public void mo1007a(Configuration configuration) {
        this.f1208a.f1212d.mo1107a(configuration);
    }

    /* renamed from: a */
    public void mo1008a(Parcelable parcelable, C0214ak akVar) {
        this.f1208a.f1212d.mo1108a(parcelable, akVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo1009a(Parcelable parcelable, List<C0186ad> list) {
        this.f1208a.f1212d.mo1108a(parcelable, new C0214ak(list, (List<C0214ak>) null));
    }

    /* renamed from: a */
    public void mo1010a(C0186ad adVar) {
        this.f1208a.f1212d.mo1114a((C0200ah) this.f1208a, (C0198af) this.f1208a, adVar);
    }

    /* renamed from: a */
    public void mo1011a(C0900o<String, C0247av> oVar) {
        this.f1208a.mo1044a(oVar);
    }

    /* renamed from: a */
    public void mo1012a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f1208a.mo1047b(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public void mo1013a(boolean z) {
        this.f1208a.f1212d.mo1128b(z);
    }

    /* renamed from: a */
    public boolean mo1014a(Menu menu) {
        return this.f1208a.f1212d.mo1116a(menu);
    }

    /* renamed from: a */
    public boolean mo1015a(Menu menu, MenuInflater menuInflater) {
        return this.f1208a.f1212d.mo1117a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo1016a(MenuItem menuItem) {
        return this.f1208a.f1212d.mo1118a(menuItem);
    }

    /* renamed from: b */
    public C0247av mo1017b() {
        return this.f1208a.mo1052l();
    }

    /* renamed from: b */
    public void mo1018b(Menu menu) {
        this.f1208a.f1212d.mo1127b(menu);
    }

    /* renamed from: b */
    public void mo1019b(boolean z) {
        this.f1208a.f1212d.mo1133c(z);
    }

    /* renamed from: b */
    public boolean mo1020b(MenuItem menuItem) {
        return this.f1208a.f1212d.mo1129b(menuItem);
    }

    /* renamed from: c */
    public int mo1021c() {
        ArrayList<C0186ad> arrayList = this.f1208a.f1212d.f1253l;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: c */
    public void mo1022c(boolean z) {
        this.f1208a.mo1045a(z);
    }

    /* renamed from: d */
    public void mo1023d() {
        this.f1208a.f1212d.mo1158o();
    }

    /* renamed from: e */
    public Parcelable mo1024e() {
        return this.f1208a.f1212d.mo1157n();
    }

    @Deprecated
    /* renamed from: f */
    public List<C0186ad> mo1025f() {
        C0214ak m = this.f1208a.f1212d.mo1154m();
        if (m != null) {
            return m.mo1180a();
        }
        return null;
    }

    /* renamed from: g */
    public C0214ak mo1026g() {
        return this.f1208a.f1212d.mo1154m();
    }

    /* renamed from: h */
    public void mo1027h() {
        this.f1208a.f1212d.mo1159p();
    }

    /* renamed from: i */
    public void mo1028i() {
        this.f1208a.f1212d.mo1160q();
    }

    /* renamed from: j */
    public void mo1029j() {
        this.f1208a.f1212d.mo1161r();
    }

    /* renamed from: k */
    public void mo1030k() {
        this.f1208a.f1212d.mo1162s();
    }

    /* renamed from: l */
    public void mo1031l() {
        this.f1208a.f1212d.mo1163t();
    }

    /* renamed from: m */
    public void mo1032m() {
        this.f1208a.f1212d.mo1165u();
    }

    /* renamed from: n */
    public void mo1033n() {
        this.f1208a.f1212d.mo1166v();
    }

    /* renamed from: o */
    public void mo1034o() {
        this.f1208a.f1212d.mo1167w();
    }

    /* renamed from: p */
    public void mo1035p() {
        this.f1208a.f1212d.mo1168x();
    }

    /* renamed from: q */
    public void mo1036q() {
        this.f1208a.f1212d.mo1169y();
    }

    /* renamed from: r */
    public boolean mo1037r() {
        return this.f1208a.f1212d.mo1149j();
    }

    /* renamed from: s */
    public void mo1038s() {
        this.f1208a.mo1054n();
    }

    /* renamed from: t */
    public void mo1039t() {
        this.f1208a.mo1055o();
    }

    /* renamed from: u */
    public void mo1040u() {
        this.f1208a.mo1056p();
    }

    /* renamed from: v */
    public void mo1041v() {
        this.f1208a.mo1057q();
    }

    /* renamed from: w */
    public C0900o<String, C0247av> mo1042w() {
        return this.f1208a.mo1058r();
    }
}
