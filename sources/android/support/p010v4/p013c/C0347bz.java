package android.support.p010v4.p013c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.C0015aj;
import android.support.p010v4.p014d.C0446n;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: android.support.v4.c.bz */
public final class C0347bz {

    /* renamed from: a */
    public static final String f1829a = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b */
    public static final String f1830b = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: c */
    static C0350c f1831c;

    /* renamed from: android.support.v4.c.bz$a */
    public static class C0348a {

        /* renamed from: a */
        private Activity f1832a;

        /* renamed from: b */
        private Intent f1833b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c */
        private CharSequence f1834c;

        /* renamed from: d */
        private ArrayList<String> f1835d;

        /* renamed from: e */
        private ArrayList<String> f1836e;

        /* renamed from: f */
        private ArrayList<String> f1837f;

        /* renamed from: g */
        private ArrayList<Uri> f1838g;

        private C0348a(Activity activity) {
            this.f1832a = activity;
            this.f1833b.putExtra(C0347bz.f1829a, activity.getPackageName());
            this.f1833b.putExtra(C0347bz.f1830b, activity.getComponentName());
            this.f1833b.addFlags(524288);
        }

        /* renamed from: a */
        public static C0348a m2021a(Activity activity) {
            return new C0348a(activity);
        }

        /* renamed from: a */
        private void m2022a(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f1833b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f1833b.putExtra(str, strArr);
        }

        /* renamed from: a */
        private void m2023a(String str, String[] strArr) {
            Intent a = mo1571a();
            String[] stringArrayExtra = a.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[(strArr.length + length)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            a.putExtra(str, strArr2);
        }

        /* renamed from: a */
        public Intent mo1571a() {
            if (this.f1835d != null) {
                m2022a("android.intent.extra.EMAIL", this.f1835d);
                this.f1835d = null;
            }
            if (this.f1836e != null) {
                m2022a("android.intent.extra.CC", this.f1836e);
                this.f1836e = null;
            }
            if (this.f1837f != null) {
                m2022a("android.intent.extra.BCC", this.f1837f);
                this.f1837f = null;
            }
            boolean z = this.f1838g != null && this.f1838g.size() > 1;
            boolean equals = this.f1833b.getAction().equals("android.intent.action.SEND_MULTIPLE");
            if (!z && equals) {
                this.f1833b.setAction("android.intent.action.SEND");
                if (this.f1838g == null || this.f1838g.isEmpty()) {
                    this.f1833b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f1833b.putExtra("android.intent.extra.STREAM", this.f1838g.get(0));
                }
                this.f1838g = null;
            }
            if (z && !equals) {
                this.f1833b.setAction("android.intent.action.SEND_MULTIPLE");
                if (this.f1838g == null || this.f1838g.isEmpty()) {
                    this.f1833b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f1833b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f1838g);
                }
            }
            return this.f1833b;
        }

        /* renamed from: a */
        public C0348a mo1572a(@C0015aj int i) {
            return mo1574a(this.f1832a.getText(i));
        }

        /* renamed from: a */
        public C0348a mo1573a(Uri uri) {
            if (!this.f1833b.getAction().equals("android.intent.action.SEND")) {
                this.f1833b.setAction("android.intent.action.SEND");
            }
            this.f1838g = null;
            this.f1833b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        /* renamed from: a */
        public C0348a mo1574a(CharSequence charSequence) {
            this.f1834c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0348a mo1575a(String str) {
            this.f1833b.setType(str);
            return this;
        }

        /* renamed from: a */
        public C0348a mo1576a(String[] strArr) {
            if (this.f1835d != null) {
                this.f1835d = null;
            }
            this.f1833b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Activity mo1577b() {
            return this.f1832a;
        }

        /* renamed from: b */
        public C0348a mo1578b(Uri uri) {
            Uri uri2 = (Uri) this.f1833b.getParcelableExtra("android.intent.extra.STREAM");
            if (this.f1838g == null && uri2 == null) {
                return mo1573a(uri);
            }
            if (this.f1838g == null) {
                this.f1838g = new ArrayList<>();
            }
            if (uri2 != null) {
                this.f1833b.removeExtra("android.intent.extra.STREAM");
                this.f1838g.add(uri2);
            }
            this.f1838g.add(uri);
            return this;
        }

        /* renamed from: b */
        public C0348a mo1579b(CharSequence charSequence) {
            this.f1833b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        /* renamed from: b */
        public C0348a mo1580b(String str) {
            this.f1833b.putExtra(C0446n.f1986e, str);
            if (!this.f1833b.hasExtra("android.intent.extra.TEXT")) {
                mo1579b((CharSequence) Html.fromHtml(str));
            }
            return this;
        }

        /* renamed from: b */
        public C0348a mo1581b(String[] strArr) {
            m2023a("android.intent.extra.EMAIL", strArr);
            return this;
        }

        /* renamed from: c */
        public Intent mo1582c() {
            return Intent.createChooser(mo1571a(), this.f1834c);
        }

        /* renamed from: c */
        public C0348a mo1583c(String str) {
            if (this.f1835d == null) {
                this.f1835d = new ArrayList<>();
            }
            this.f1835d.add(str);
            return this;
        }

        /* renamed from: c */
        public C0348a mo1584c(String[] strArr) {
            this.f1833b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        /* renamed from: d */
        public C0348a mo1585d(String str) {
            if (this.f1836e == null) {
                this.f1836e = new ArrayList<>();
            }
            this.f1836e.add(str);
            return this;
        }

        /* renamed from: d */
        public C0348a mo1586d(String[] strArr) {
            m2023a("android.intent.extra.CC", strArr);
            return this;
        }

        /* renamed from: d */
        public void mo1587d() {
            this.f1832a.startActivity(mo1582c());
        }

        /* renamed from: e */
        public C0348a mo1588e(String str) {
            if (this.f1837f == null) {
                this.f1837f = new ArrayList<>();
            }
            this.f1837f.add(str);
            return this;
        }

        /* renamed from: e */
        public C0348a mo1589e(String[] strArr) {
            this.f1833b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        /* renamed from: f */
        public C0348a mo1590f(String str) {
            this.f1833b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        /* renamed from: f */
        public C0348a mo1591f(String[] strArr) {
            m2023a("android.intent.extra.BCC", strArr);
            return this;
        }
    }

    /* renamed from: android.support.v4.c.bz$b */
    public static class C0349b {

        /* renamed from: a */
        private static final String f1839a = "IntentReader";

        /* renamed from: b */
        private Activity f1840b;

        /* renamed from: c */
        private Intent f1841c;

        /* renamed from: d */
        private String f1842d;

        /* renamed from: e */
        private ComponentName f1843e;

        /* renamed from: f */
        private ArrayList<Uri> f1844f;

        private C0349b(Activity activity) {
            this.f1840b = activity;
            this.f1841c = activity.getIntent();
            this.f1842d = C0347bz.m2017a(activity);
            this.f1843e = C0347bz.m2020b(activity);
        }

        /* renamed from: a */
        public static C0349b m2045a(Activity activity) {
            return new C0349b(activity);
        }

        /* renamed from: a */
        public Uri mo1592a(int i) {
            if (this.f1844f == null && mo1595c()) {
                this.f1844f = this.f1841c.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            if (this.f1844f != null) {
                return this.f1844f.get(i);
            }
            if (i == 0) {
                return (Uri) this.f1841c.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + mo1600h() + " index requested: " + i);
        }

        /* renamed from: a */
        public boolean mo1593a() {
            String action = this.f1841c.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* renamed from: b */
        public boolean mo1594b() {
            return "android.intent.action.SEND".equals(this.f1841c.getAction());
        }

        /* renamed from: c */
        public boolean mo1595c() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f1841c.getAction());
        }

        /* renamed from: d */
        public String mo1596d() {
            return this.f1841c.getType();
        }

        /* renamed from: e */
        public CharSequence mo1597e() {
            return this.f1841c.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        /* renamed from: f */
        public String mo1598f() {
            String stringExtra = this.f1841c.getStringExtra(C0446n.f1986e);
            if (stringExtra == null) {
                CharSequence e = mo1597e();
                if (e instanceof Spanned) {
                    return Html.toHtml((Spanned) e);
                }
                if (e != null) {
                    return C0347bz.f1831c.mo1610a(e);
                }
            }
            return stringExtra;
        }

        /* renamed from: g */
        public Uri mo1599g() {
            return (Uri) this.f1841c.getParcelableExtra("android.intent.extra.STREAM");
        }

        /* renamed from: h */
        public int mo1600h() {
            if (this.f1844f == null && mo1595c()) {
                this.f1844f = this.f1841c.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            return this.f1844f != null ? this.f1844f.size() : this.f1841c.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        /* renamed from: i */
        public String[] mo1601i() {
            return this.f1841c.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        /* renamed from: j */
        public String[] mo1602j() {
            return this.f1841c.getStringArrayExtra("android.intent.extra.CC");
        }

        /* renamed from: k */
        public String[] mo1603k() {
            return this.f1841c.getStringArrayExtra("android.intent.extra.BCC");
        }

        /* renamed from: l */
        public String mo1604l() {
            return this.f1841c.getStringExtra("android.intent.extra.SUBJECT");
        }

        /* renamed from: m */
        public String mo1605m() {
            return this.f1842d;
        }

        /* renamed from: n */
        public ComponentName mo1606n() {
            return this.f1843e;
        }

        /* renamed from: o */
        public Drawable mo1607o() {
            if (this.f1843e == null) {
                return null;
            }
            try {
                return this.f1840b.getPackageManager().getActivityIcon(this.f1843e);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f1839a, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        /* renamed from: p */
        public Drawable mo1608p() {
            if (this.f1842d == null) {
                return null;
            }
            try {
                return this.f1840b.getPackageManager().getApplicationIcon(this.f1842d);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f1839a, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        /* renamed from: q */
        public CharSequence mo1609q() {
            if (this.f1842d == null) {
                return null;
            }
            PackageManager packageManager = this.f1840b.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f1842d, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f1839a, "Could not retrieve label for calling application", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.c.bz$c */
    interface C0350c {
        /* renamed from: a */
        String mo1610a(CharSequence charSequence);

        /* renamed from: a */
        void mo1611a(MenuItem menuItem, C0348a aVar);
    }

    /* renamed from: android.support.v4.c.bz$d */
    static class C0351d implements C0350c {
        C0351d() {
        }

        /* renamed from: a */
        private static void m2066a(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            int i3 = i;
            while (i3 < i2) {
                char charAt = charSequence.charAt(i3);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#" + charAt + ";");
                } else if (charAt == ' ') {
                    while (i3 + 1 < i2 && charSequence.charAt(i3 + 1) == ' ') {
                        sb.append("&nbsp;");
                        i3++;
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i3++;
            }
        }

        /* renamed from: a */
        public String mo1610a(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            m2066a(sb, charSequence, 0, charSequence.length());
            return sb.toString();
        }

        /* renamed from: a */
        public void mo1611a(MenuItem menuItem, C0348a aVar) {
            menuItem.setIntent(aVar.mo1582c());
        }
    }

    /* renamed from: android.support.v4.c.bz$e */
    static class C0352e extends C0351d {
        C0352e() {
        }

        /* renamed from: a */
        public void mo1611a(MenuItem menuItem, C0348a aVar) {
            C0355ca.m2076a(menuItem, aVar.mo1577b(), aVar.mo1571a());
            if (mo1612a(menuItem)) {
                menuItem.setIntent(aVar.mo1582c());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1612a(MenuItem menuItem) {
            return !menuItem.hasSubMenu();
        }
    }

    /* renamed from: android.support.v4.c.bz$f */
    static class C0353f extends C0352e {
        C0353f() {
        }

        /* renamed from: a */
        public String mo1610a(CharSequence charSequence) {
            return C0356cb.m2077a(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1612a(MenuItem menuItem) {
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f1831c = new C0353f();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f1831c = new C0352e();
        } else {
            f1831c = new C0351d();
        }
    }

    private C0347bz() {
    }

    /* renamed from: a */
    public static String m2017a(Activity activity) {
        String callingPackage = activity.getCallingPackage();
        return callingPackage == null ? activity.getIntent().getStringExtra(f1829a) : callingPackage;
    }

    /* renamed from: a */
    public static void m2018a(Menu menu, int i, C0348a aVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
        }
        m2019a(findItem, aVar);
    }

    /* renamed from: a */
    public static void m2019a(MenuItem menuItem, C0348a aVar) {
        f1831c.mo1611a(menuItem, aVar);
    }

    /* renamed from: b */
    public static ComponentName m2020b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? (ComponentName) activity.getIntent().getParcelableExtra(f1830b) : callingActivity;
    }
}
