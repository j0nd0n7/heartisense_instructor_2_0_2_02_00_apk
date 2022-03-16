package android.support.p010v4.p013c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.annotation.C0030i;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0370d;
import android.support.p010v4.p013c.C0380g;
import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.p025i.p026a.C0586d;
import android.support.p010v4.p033o.C0900o;
import android.support.p010v4.p033o.C0901p;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.c.ae */
public class C0194ae extends C0410x implements C0370d.C0372a, C0380g.C0382b {

    /* renamed from: c */
    static final String f1184c = "android:support:fragments";

    /* renamed from: d */
    static final String f1185d = "android:support:next_request_index";

    /* renamed from: e */
    static final String f1186e = "android:support:request_indicies";

    /* renamed from: f */
    static final String f1187f = "android:support:request_fragment_who";

    /* renamed from: g */
    static final int f1188g = 65534;

    /* renamed from: h */
    static final int f1189h = 1;

    /* renamed from: i */
    static final int f1190i = 2;

    /* renamed from: u */
    private static final String f1191u = "FragmentActivity";

    /* renamed from: j */
    final Handler f1192j = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (C0194ae.this.f1196n) {
                        C0194ae.this.mo946a(false);
                        return;
                    }
                    return;
                case 2:
                    C0194ae.this.mo953e();
                    C0194ae.this.f1193k.mo1037r();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: k */
    final C0199ag f1193k = C0199ag.m1117a((C0200ah<?>) new C0196a());

    /* renamed from: l */
    boolean f1194l;

    /* renamed from: m */
    boolean f1195m;

    /* renamed from: n */
    boolean f1196n = true;

    /* renamed from: o */
    boolean f1197o = true;

    /* renamed from: p */
    boolean f1198p;

    /* renamed from: q */
    boolean f1199q;

    /* renamed from: r */
    boolean f1200r;

    /* renamed from: s */
    int f1201s;

    /* renamed from: t */
    C0901p<String> f1202t;

    /* renamed from: android.support.v4.c.ae$a */
    class C0196a extends C0200ah<C0194ae> {
        public C0196a() {
            super(C0194ae.this);
        }

        @C0003aa
        /* renamed from: a */
        public View mo926a(int i) {
            return C0194ae.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo989a(C0186ad adVar, Intent intent, int i) {
            C0194ae.this.mo940a(adVar, intent, i);
        }

        /* renamed from: a */
        public void mo990a(C0186ad adVar, Intent intent, int i, @C0003aa Bundle bundle) {
            C0194ae.this.mo941a(adVar, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo991a(C0186ad adVar, IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4, Bundle bundle) {
            C0194ae.this.mo942a(adVar, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: a */
        public void mo992a(@C0047z C0186ad adVar, @C0047z String[] strArr, int i) {
            C0194ae.this.mo943a(adVar, strArr, i);
        }

        @SuppressLint({"NewApi"})
        /* renamed from: a */
        public void mo993a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0194ae.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo927a() {
            Window window = C0194ae.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: a */
        public boolean mo994a(C0186ad adVar) {
            return !C0194ae.this.isFinishing();
        }

        /* renamed from: a */
        public boolean mo995a(@C0047z String str) {
            return C0370d.m2117a((Activity) C0194ae.this, str);
        }

        /* renamed from: b */
        public LayoutInflater mo996b() {
            return C0194ae.this.getLayoutInflater().cloneInContext(C0194ae.this);
        }

        /* renamed from: b */
        public void mo997b(C0186ad adVar) {
            C0194ae.this.mo939a(adVar);
        }

        /* renamed from: c */
        public C0194ae mo1002g() {
            return C0194ae.this;
        }

        /* renamed from: d */
        public void mo999d() {
            C0194ae.this.mo956h();
        }

        /* renamed from: e */
        public boolean mo1000e() {
            return C0194ae.this.getWindow() != null;
        }

        /* renamed from: f */
        public int mo1001f() {
            Window window = C0194ae.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: android.support.v4.c.ae$b */
    static final class C0197b {

        /* renamed from: a */
        Object f1205a;

        /* renamed from: b */
        C0214ak f1206b;

        /* renamed from: c */
        C0900o<String, C0247av> f1207c;

        C0197b() {
        }
    }

    /* renamed from: a */
    private static String m1073a(View view) {
        String str;
        char c = 'F';
        char c2 = '.';
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case 0:
                sb.append('V');
                break;
            case 4:
                sb.append('I');
                break;
            case 8:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        sb.append(view.isFocusable() ? 'F' : '.');
        sb.append(view.isEnabled() ? 'E' : '.');
        sb.append(view.willNotDraw() ? '.' : 'D');
        sb.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        sb.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        sb.append(view.isClickable() ? 'C' : '.');
        sb.append(view.isLongClickable() ? 'L' : '.');
        sb.append(' ');
        if (!view.isFocused()) {
            c = '.';
        }
        sb.append(c);
        sb.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c2 = 'P';
        }
        sb.append(c2);
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (Resources.NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private void m1074a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(m1073a(view));
        if ((view instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i = 0; i < childCount; i++) {
                m1074a(str2, printWriter, (viewGroup = (ViewGroup) view).getChildAt(i));
            }
        }
    }

    /* renamed from: b */
    private int m1075b(C0186ad adVar) {
        if (this.f1202t.mo2986b() >= f1188g) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f1202t.mo2997g(this.f1201s) >= 0) {
            this.f1201s = (this.f1201s + 1) % f1188g;
        }
        int i = this.f1201s;
        this.f1202t.mo2988b(i, adVar.f1161y);
        this.f1201s = (this.f1201s + 1) % f1188g;
        return i;
    }

    @Deprecated
    /* renamed from: a */
    public final C0586d mo936a() {
        return C0586d.m3014a((Activity) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo937a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1193k.mo1005a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public final void mo938a(int i) {
        if (!this.f1200r && i != -1) {
            m2299b(i);
        }
    }

    /* renamed from: a */
    public void mo939a(C0186ad adVar) {
    }

    /* renamed from: a */
    public void mo940a(C0186ad adVar, Intent intent, int i) {
        mo941a(adVar, intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo941a(C0186ad adVar, Intent intent, int i, @C0003aa Bundle bundle) {
        this.f1934b = true;
        if (i == -1) {
            try {
                C0370d.m2112a(this, intent, -1, bundle);
            } finally {
                this.f1934b = false;
            }
        } else {
            m2299b(i);
            C0370d.m2112a(this, intent, ((m1075b(adVar) + 1) << 16) + (65535 & i), bundle);
            this.f1934b = false;
        }
    }

    /* renamed from: a */
    public void mo942a(C0186ad adVar, IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f1933a = true;
        if (i == -1) {
            try {
                C0370d.m2113a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.f1933a = false;
            }
        } else {
            m2299b(i);
            C0370d.m2113a(this, intentSender, ((m1075b(adVar) + 1) << 16) + (65535 & i), intent, i2, i3, i4, bundle);
            this.f1933a = false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo943a(C0186ad adVar, String[] strArr, int i) {
        if (i == -1) {
            C0370d.m2115a(this, strArr, i);
            return;
        }
        m2299b(i);
        try {
            this.f1200r = true;
            C0370d.m2115a(this, strArr, ((m1075b(adVar) + 1) << 16) + (65535 & i));
            this.f1200r = false;
        } catch (Throwable th) {
            this.f1200r = false;
            throw th;
        }
    }

    /* renamed from: a */
    public void mo944a(C0357cc ccVar) {
        C0370d.m2114a((Activity) this, ccVar);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo945a(C0586d dVar) {
        C0586d.m3015a((Activity) this, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo946a(boolean z) {
        if (!this.f1197o) {
            this.f1197o = true;
            this.f1198p = z;
            this.f1192j.removeMessages(1);
            mo957i();
        } else if (z) {
            this.f1193k.mo1038s();
            this.f1193k.mo1022c(true);
        }
    }

    /* access modifiers changed from: protected */
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo947a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: b */
    public void mo948b(C0357cc ccVar) {
        C0370d.m2120b(this, ccVar);
    }

    /* renamed from: c */
    public void mo949c() {
        C0370d.m2123e(this);
    }

    /* renamed from: c_ */
    public void mo950c_() {
        C0370d.m2121c(this);
    }

    /* renamed from: d */
    public void mo951d() {
        C0370d.m2124f(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 11) {
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1194l);
        printWriter.print("mResumed=");
        printWriter.print(this.f1195m);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1196n);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f1197o);
        this.f1193k.mo1012a(str2, fileDescriptor, printWriter, strArr);
        this.f1193k.mo1004a().mo1070a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m1074a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo953e() {
        this.f1193k.mo1030k();
    }

    /* renamed from: f */
    public Object mo954f() {
        return null;
    }

    /* renamed from: g */
    public Object mo955g() {
        C0197b bVar = (C0197b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f1205a;
        }
        return null;
    }

    /* renamed from: h */
    public void mo956h() {
        if (Build.VERSION.SDK_INT >= 11) {
            C0386h.m2161a(this);
        } else {
            this.f1199q = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo957i() {
        this.f1193k.mo1022c(this.f1198p);
        this.f1193k.mo1033n();
    }

    /* renamed from: j */
    public C0201ai mo958j() {
        return this.f1193k.mo1004a();
    }

    /* renamed from: k */
    public C0247av mo959k() {
        return this.f1193k.mo1017b();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1193k.mo1023d();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.f1202t.mo2983a(i4);
            this.f1202t.mo2990c(i4);
            if (a == null) {
                Log.w(f1191u, "Activity result delivered for unknown Fragment.");
                return;
            }
            C0186ad a2 = this.f1193k.mo1003a(a);
            if (a2 == null) {
                Log.w(f1191u, "Activity result no fragment exists for who: " + a);
            } else {
                a2.mo818a(65535 & i, i2, intent);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.f1193k.mo1004a().mo1078e()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1193k.mo1007a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0003aa Bundle bundle) {
        this.f1193k.mo1010a((C0186ad) null);
        super.onCreate(bundle);
        C0197b bVar = (C0197b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f1193k.mo1011a(bVar.f1207c);
        }
        if (bundle != null) {
            this.f1193k.mo1008a(bundle.getParcelable(f1184c), bVar != null ? bVar.f1206b : null);
            if (bundle.containsKey(f1185d)) {
                this.f1201s = bundle.getInt(f1185d);
                int[] intArray = bundle.getIntArray(f1186e);
                String[] stringArray = bundle.getStringArray(f1187f);
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(f1191u, "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1202t = new C0901p<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1202t.mo2988b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1202t == null) {
            this.f1202t = new C0901p<>();
            this.f1201s = 0;
        }
        this.f1193k.mo1027h();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.f1193k.mo1015a(menu, getMenuInflater());
        if (Build.VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo946a(false);
        this.f1193k.mo1035p();
        this.f1193k.mo1040u();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1193k.mo1036q();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f1193k.mo1016a(menuItem);
            case 6:
                return this.f1193k.mo1020b(menuItem);
            default:
                return false;
        }
    }

    @C0030i
    public void onMultiWindowModeChanged(boolean z) {
        this.f1193k.mo1013a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1193k.mo1023d();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f1193k.mo1018b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1195m = false;
        if (this.f1192j.hasMessages(2)) {
            this.f1192j.removeMessages(2);
            mo953e();
        }
        this.f1193k.mo1031l();
    }

    @C0030i
    public void onPictureInPictureModeChanged(boolean z) {
        this.f1193k.mo1019b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f1192j.removeMessages(2);
        mo953e();
        this.f1193k.mo1037r();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f1199q) {
            this.f1199q = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return mo947a(view, menu) | this.f1193k.mo1014a(menu);
    }

    public void onRequestPermissionsResult(int i, @C0047z String[] strArr, @C0047z int[] iArr) {
        int i2 = (i >> 16) & C0538a.f2111a;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.f1202t.mo2983a(i3);
            this.f1202t.mo2990c(i3);
            if (a == null) {
                Log.w(f1191u, "Activity result delivered for unknown Fragment.");
                return;
            }
            C0186ad a2 = this.f1193k.mo1003a(a);
            if (a2 == null) {
                Log.w(f1191u, "Activity result no fragment exists for who: " + a);
            } else {
                a2.mo820a(i & C0538a.f2111a, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1192j.sendEmptyMessage(2);
        this.f1195m = true;
        this.f1193k.mo1037r();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f1196n) {
            mo946a(true);
        }
        Object f = mo954f();
        C0214ak g = this.f1193k.mo1026g();
        C0900o<String, C0247av> w = this.f1193k.mo1042w();
        if (g == null && w == null && f == null) {
            return null;
        }
        C0197b bVar = new C0197b();
        bVar.f1205a = f;
        bVar.f1206b = g;
        bVar.f1207c = w;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable e = this.f1193k.mo1024e();
        if (e != null) {
            bundle.putParcelable(f1184c, e);
        }
        if (this.f1202t.mo2986b() > 0) {
            bundle.putInt(f1185d, this.f1201s);
            int[] iArr = new int[this.f1202t.mo2986b()];
            String[] strArr = new String[this.f1202t.mo2986b()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f1202t.mo2986b()) {
                    iArr[i2] = this.f1202t.mo2995e(i2);
                    strArr[i2] = this.f1202t.mo2996f(i2);
                    i = i2 + 1;
                } else {
                    bundle.putIntArray(f1186e, iArr);
                    bundle.putStringArray(f1187f, strArr);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1196n = false;
        this.f1197o = false;
        this.f1192j.removeMessages(1);
        if (!this.f1194l) {
            this.f1194l = true;
            this.f1193k.mo1028i();
        }
        this.f1193k.mo1023d();
        this.f1193k.mo1037r();
        this.f1193k.mo1038s();
        this.f1193k.mo1029j();
        this.f1193k.mo1041v();
    }

    public void onStateNotSaved() {
        this.f1193k.mo1023d();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1196n = true;
        this.f1192j.sendEmptyMessage(1);
        this.f1193k.mo1032m();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f1934b && i != -1) {
            m2299b(i);
        }
        super.startActivityForResult(intent, i);
    }

    @C0007ae(mo1a = 16)
    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, @C0003aa Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @C0007ae(mo1a = 16)
    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
