package android.support.p036v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.support.p010v4.p028k.C0796a;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.p048a.p049a.p053d.C2010c;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: android.support.v7.widget.e */
class C1831e extends DataSetObservable {

    /* renamed from: a */
    static final boolean f6212a = false;

    /* renamed from: b */
    static final String f6213b = C1831e.class.getSimpleName();

    /* renamed from: c */
    static final String f6214c = "historical-records";

    /* renamed from: d */
    static final String f6215d = "historical-record";

    /* renamed from: e */
    static final String f6216e = "activity";

    /* renamed from: f */
    static final String f6217f = "time";

    /* renamed from: g */
    static final String f6218g = "weight";

    /* renamed from: h */
    public static final String f6219h = "activity_choser_model_history.xml";

    /* renamed from: i */
    public static final int f6220i = 50;

    /* renamed from: m */
    private static final int f6221m = 5;

    /* renamed from: n */
    private static final float f6222n = 1.0f;

    /* renamed from: o */
    private static final String f6223o = ".xml";

    /* renamed from: p */
    private static final int f6224p = -1;

    /* renamed from: q */
    private static final Object f6225q = new Object();

    /* renamed from: r */
    private static final Map<String, C1831e> f6226r = new HashMap();

    /* renamed from: A */
    private boolean f6227A = false;

    /* renamed from: B */
    private C1837f f6228B;

    /* renamed from: j */
    final Context f6229j;

    /* renamed from: k */
    final String f6230k;

    /* renamed from: l */
    boolean f6231l = true;

    /* renamed from: s */
    private final Object f6232s = new Object();

    /* renamed from: t */
    private final List<C1833b> f6233t = new ArrayList();

    /* renamed from: u */
    private final List<C1836e> f6234u = new ArrayList();

    /* renamed from: v */
    private Intent f6235v;

    /* renamed from: w */
    private C1834c f6236w = new C1835d();

    /* renamed from: x */
    private int f6237x = 50;

    /* renamed from: y */
    private boolean f6238y = false;

    /* renamed from: z */
    private boolean f6239z = true;

    /* renamed from: android.support.v7.widget.e$a */
    public interface C1832a {
        void setActivityChooserModel(C1831e eVar);
    }

    /* renamed from: android.support.v7.widget.e$b */
    public final class C1833b implements Comparable<C1833b> {

        /* renamed from: a */
        public final ResolveInfo f6240a;

        /* renamed from: b */
        public float f6241b;

        public C1833b(ResolveInfo resolveInfo) {
            this.f6240a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C1833b bVar) {
            return Float.floatToIntBits(bVar.f6241b) - Float.floatToIntBits(this.f6241b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f6241b) == Float.floatToIntBits(((C1833b) obj).f6241b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f6241b) + 31;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:").append(this.f6240a.toString());
            sb.append("; weight:").append(new BigDecimal((double) this.f6241b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.e$c */
    public interface C1834c {
        /* renamed from: a */
        void mo7388a(Intent intent, List<C1833b> list, List<C1836e> list2);
    }

    /* renamed from: android.support.v7.widget.e$d */
    private final class C1835d implements C1834c {

        /* renamed from: b */
        private static final float f6243b = 0.95f;

        /* renamed from: c */
        private final Map<ComponentName, C1833b> f6245c = new HashMap();

        C1835d() {
        }

        /* renamed from: a */
        public void mo7388a(Intent intent, List<C1833b> list, List<C1836e> list2) {
            float f;
            Map<ComponentName, C1833b> map = this.f6245c;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1833b bVar = list.get(i);
                bVar.f6241b = 0.0f;
                map.put(new ComponentName(bVar.f6240a.activityInfo.packageName, bVar.f6240a.activityInfo.name), bVar);
            }
            float f2 = C1831e.f6222n;
            int size2 = list2.size() - 1;
            while (size2 >= 0) {
                C1836e eVar = list2.get(size2);
                C1833b bVar2 = map.get(eVar.f6246a);
                if (bVar2 != null) {
                    bVar2.f6241b = (eVar.f6248c * f2) + bVar2.f6241b;
                    f = f6243b * f2;
                } else {
                    f = f2;
                }
                size2--;
                f2 = f;
            }
            Collections.sort(list);
        }
    }

    /* renamed from: android.support.v7.widget.e$e */
    public static final class C1836e {

        /* renamed from: a */
        public final ComponentName f6246a;

        /* renamed from: b */
        public final long f6247b;

        /* renamed from: c */
        public final float f6248c;

        public C1836e(ComponentName componentName, long j, float f) {
            this.f6246a = componentName;
            this.f6247b = j;
            this.f6248c = f;
        }

        public C1836e(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            C1836e eVar = (C1836e) obj;
            if (this.f6246a == null) {
                if (eVar.f6246a != null) {
                    return false;
                }
            } else if (!this.f6246a.equals(eVar.f6246a)) {
                return false;
            }
            if (this.f6247b != eVar.f6247b) {
                return false;
            }
            return Float.floatToIntBits(this.f6248c) == Float.floatToIntBits(eVar.f6248c);
        }

        public int hashCode() {
            return (((((this.f6246a == null ? 0 : this.f6246a.hashCode()) + 31) * 31) + ((int) (this.f6247b ^ (this.f6247b >>> 32)))) * 31) + Float.floatToIntBits(this.f6248c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:").append(this.f6246a);
            sb.append("; time:").append(this.f6247b);
            sb.append("; weight:").append(new BigDecimal((double) this.f6248c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.e$f */
    public interface C1837f {
        /* renamed from: a */
        boolean mo7194a(C1831e eVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.e$g */
    private final class C1838g extends AsyncTask<Object, Void, Void> {
        C1838g() {
        }

        /* renamed from: a */
        public Void doInBackground(Object... objArr) {
            List list = objArr[0];
            String str = objArr[1];
            try {
                FileOutputStream openFileOutput = C1831e.this.f6229j.openFileOutput(str, 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, (String) null);
                    newSerializer.startDocument(C2010c.f6851a, true);
                    newSerializer.startTag((String) null, C1831e.f6214c);
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        C1836e eVar = (C1836e) list.remove(0);
                        newSerializer.startTag((String) null, C1831e.f6215d);
                        newSerializer.attribute((String) null, C1831e.f6216e, eVar.f6246a.flattenToString());
                        newSerializer.attribute((String) null, C1831e.f6217f, String.valueOf(eVar.f6247b));
                        newSerializer.attribute((String) null, C1831e.f6218g, String.valueOf(eVar.f6248c));
                        newSerializer.endTag((String) null, C1831e.f6215d);
                    }
                    newSerializer.endTag((String) null, C1831e.f6214c);
                    newSerializer.endDocument();
                    C1831e.this.f6231l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    Log.e(C1831e.f6213b, "Error writing historical record file: " + C1831e.this.f6230k, e2);
                    C1831e.this.f6231l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e3) {
                        }
                    }
                } catch (IllegalStateException e4) {
                    Log.e(C1831e.f6213b, "Error writing historical record file: " + C1831e.this.f6230k, e4);
                    C1831e.this.f6231l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e5) {
                        }
                    }
                } catch (IOException e6) {
                    Log.e(C1831e.f6213b, "Error writing historical record file: " + C1831e.this.f6230k, e6);
                    C1831e.this.f6231l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e7) {
                        }
                    }
                } catch (Throwable th) {
                    C1831e.this.f6231l = true;
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException e8) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e9) {
                Log.e(C1831e.f6213b, "Error writing historical record file: " + str, e9);
            }
            return null;
        }
    }

    private C1831e(Context context, String str) {
        this.f6229j = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f6223o)) {
            this.f6230k = str;
        } else {
            this.f6230k = str + f6223o;
        }
    }

    /* renamed from: a */
    public static C1831e m11112a(Context context, String str) {
        C1831e eVar;
        synchronized (f6225q) {
            eVar = f6226r.get(str);
            if (eVar == null) {
                eVar = new C1831e(context, str);
                f6226r.put(str, eVar);
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private boolean m11113a(C1836e eVar) {
        boolean add = this.f6234u.add(eVar);
        if (add) {
            this.f6239z = true;
            m11119k();
            m11114f();
            m11116h();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: f */
    private void m11114f() {
        if (!this.f6238y) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f6239z) {
            this.f6239z = false;
            if (!TextUtils.isEmpty(this.f6230k)) {
                C0796a.m4070a(new C1838g(), new ArrayList(this.f6234u), this.f6230k);
            }
        }
    }

    /* renamed from: g */
    private void m11115g() {
        boolean i = m11117i() | m11118j();
        m11119k();
        if (i) {
            m11116h();
            notifyChanged();
        }
    }

    /* renamed from: h */
    private boolean m11116h() {
        if (this.f6236w == null || this.f6235v == null || this.f6233t.isEmpty() || this.f6234u.isEmpty()) {
            return false;
        }
        this.f6236w.mo7388a(this.f6235v, this.f6233t, Collections.unmodifiableList(this.f6234u));
        return true;
    }

    /* renamed from: i */
    private boolean m11117i() {
        if (!this.f6227A || this.f6235v == null) {
            return false;
        }
        this.f6227A = false;
        this.f6233t.clear();
        List<ResolveInfo> queryIntentActivities = this.f6229j.getPackageManager().queryIntentActivities(this.f6235v, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f6233t.add(new C1833b(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: j */
    private boolean m11118j() {
        if (!this.f6231l || !this.f6239z || TextUtils.isEmpty(this.f6230k)) {
            return false;
        }
        this.f6231l = false;
        this.f6238y = true;
        m11120l();
        return true;
    }

    /* renamed from: k */
    private void m11119k() {
        int size = this.f6234u.size() - this.f6237x;
        if (size > 0) {
            this.f6239z = true;
            for (int i = 0; i < size; i++) {
                C1836e remove = this.f6234u.remove(0);
            }
        }
    }

    /* renamed from: l */
    private void m11120l() {
        try {
            FileInputStream openFileInput = this.f6229j.openFileInput(this.f6230k);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, C2010c.f6851a);
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if (!f6214c.equals(newPullParser.getName())) {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
                List<C1836e> list = this.f6234u;
                list.clear();
                while (true) {
                    int next = newPullParser.next();
                    if (next == 1) {
                        if (openFileInput != null) {
                            try {
                                openFileInput.close();
                                return;
                            } catch (IOException e) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(next == 3 || next == 4)) {
                        if (!f6215d.equals(newPullParser.getName())) {
                            throw new XmlPullParserException("Share records file not well-formed.");
                        }
                        list.add(new C1836e(newPullParser.getAttributeValue((String) null, f6216e), Long.parseLong(newPullParser.getAttributeValue((String) null, f6217f)), Float.parseFloat(newPullParser.getAttributeValue((String) null, f6218g))));
                    }
                }
            } catch (XmlPullParserException e2) {
                Log.e(f6213b, "Error reading historical recrod file: " + this.f6230k, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (IOException e4) {
                Log.e(f6213b, "Error reading historical recrod file: " + this.f6230k, e4);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e5) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e7) {
        }
    }

    /* renamed from: a */
    public int mo7370a(ResolveInfo resolveInfo) {
        synchronized (this.f6232s) {
            m11115g();
            List<C1833b> list = this.f6233t;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f6240a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public Intent mo7371a() {
        Intent intent;
        synchronized (this.f6232s) {
            intent = this.f6235v;
        }
        return intent;
    }

    /* renamed from: a */
    public ResolveInfo mo7372a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f6232s) {
            m11115g();
            resolveInfo = this.f6233t.get(i).f6240a;
        }
        return resolveInfo;
    }

    /* renamed from: a */
    public void mo7373a(Intent intent) {
        synchronized (this.f6232s) {
            if (this.f6235v != intent) {
                this.f6235v = intent;
                this.f6227A = true;
                m11115g();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7374a(android.support.p036v7.widget.C1831e.C1834c r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.f6232s
            monitor-enter(r1)
            android.support.v7.widget.e$c r0 = r2.f6236w     // Catch:{ all -> 0x0016 }
            if (r0 != r3) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
        L_0x0008:
            return
        L_0x0009:
            r2.f6236w = r3     // Catch:{ all -> 0x0016 }
            boolean r0 = r2.m11116h()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x0008
        L_0x0016:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1831e.mo7374a(android.support.v7.widget.e$c):void");
    }

    /* renamed from: a */
    public void mo7375a(C1837f fVar) {
        synchronized (this.f6232s) {
            this.f6228B = fVar;
        }
    }

    /* renamed from: b */
    public int mo7376b() {
        int size;
        synchronized (this.f6232s) {
            m11115g();
            size = this.f6233t.size();
        }
        return size;
    }

    /* renamed from: b */
    public Intent mo7377b(int i) {
        synchronized (this.f6232s) {
            if (this.f6235v == null) {
                return null;
            }
            m11115g();
            C1833b bVar = this.f6233t.get(i);
            ComponentName componentName = new ComponentName(bVar.f6240a.activityInfo.packageName, bVar.f6240a.activityInfo.name);
            Intent intent = new Intent(this.f6235v);
            intent.setComponent(componentName);
            if (this.f6228B != null) {
                if (this.f6228B.mo7194a(this, new Intent(intent))) {
                    return null;
                }
            }
            m11113a(new C1836e(componentName, System.currentTimeMillis(), (float) f6222n));
            return intent;
        }
    }

    /* renamed from: c */
    public ResolveInfo mo7378c() {
        synchronized (this.f6232s) {
            m11115g();
            if (this.f6233t.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f6233t.get(0).f6240a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void mo7379c(int i) {
        synchronized (this.f6232s) {
            m11115g();
            C1833b bVar = this.f6233t.get(i);
            C1833b bVar2 = this.f6233t.get(0);
            m11113a(new C1836e(new ComponentName(bVar.f6240a.activityInfo.packageName, bVar.f6240a.activityInfo.name), System.currentTimeMillis(), bVar2 != null ? (bVar2.f6241b - bVar.f6241b) + 5.0f : f6222n));
        }
    }

    /* renamed from: d */
    public int mo7380d() {
        int i;
        synchronized (this.f6232s) {
            i = this.f6237x;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7381d(int r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.f6232s
            monitor-enter(r1)
            int r0 = r2.f6237x     // Catch:{ all -> 0x0019 }
            if (r0 != r3) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
        L_0x0008:
            return
        L_0x0009:
            r2.f6237x = r3     // Catch:{ all -> 0x0019 }
            r2.m11119k()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2.m11116h()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x0008
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1831e.mo7381d(int):void");
    }

    /* renamed from: e */
    public int mo7382e() {
        int size;
        synchronized (this.f6232s) {
            m11115g();
            size = this.f6234u.size();
        }
        return size;
    }
}
