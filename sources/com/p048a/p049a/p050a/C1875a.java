package com.p048a.p049a.p050a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.a.a.a.a */
public final class C1875a implements Closeable {

    /* renamed from: a */
    static final String f6371a = "journal";

    /* renamed from: b */
    static final String f6372b = "journal.tmp";

    /* renamed from: c */
    static final String f6373c = "journal.bkp";

    /* renamed from: d */
    static final String f6374d = "libcore.io.DiskLruCache";

    /* renamed from: e */
    static final String f6375e = "1";

    /* renamed from: f */
    static final long f6376f = -1;

    /* renamed from: h */
    private static final String f6377h = "CLEAN";

    /* renamed from: i */
    private static final String f6378i = "DIRTY";

    /* renamed from: j */
    private static final String f6379j = "REMOVE";

    /* renamed from: k */
    private static final String f6380k = "READ";

    /* renamed from: g */
    final ThreadPoolExecutor f6381g = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final File f6382l;

    /* renamed from: m */
    private final File f6383m;

    /* renamed from: n */
    private final File f6384n;

    /* renamed from: o */
    private final File f6385o;

    /* renamed from: p */
    private final int f6386p;

    /* renamed from: q */
    private long f6387q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final int f6388r;

    /* renamed from: s */
    private long f6389s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Writer f6390t;

    /* renamed from: u */
    private final LinkedHashMap<String, C1878b> f6391u = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f6392v;

    /* renamed from: w */
    private long f6393w = 0;

    /* renamed from: x */
    private final Callable<Void> f6394x = new Callable<Void>() {
        /* renamed from: a */
        public Void call() {
            synchronized (C1875a.this) {
                if (C1875a.this.f6390t != null) {
                    C1875a.this.m11295l();
                    if (C1875a.this.m11293j()) {
                        C1875a.this.m11292i();
                        int unused = C1875a.this.f6392v = 0;
                    }
                }
            }
            return null;
        }
    };

    /* renamed from: com.a.a.a.a$a */
    public final class C1877a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1878b f6397b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean[] f6398c;

        /* renamed from: d */
        private boolean f6399d;

        private C1877a(C1878b bVar) {
            this.f6397b = bVar;
            this.f6398c = bVar.f6405f ? null : new boolean[C1875a.this.f6388r];
        }

        /* renamed from: c */
        private InputStream m11309c(int i) {
            synchronized (C1875a.this) {
                if (this.f6397b.f6406g != this) {
                    throw new IllegalStateException();
                } else if (!this.f6397b.f6405f) {
                    return null;
                } else {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f6397b.mo7571a(i));
                        return fileInputStream;
                    } catch (FileNotFoundException e) {
                        return null;
                    }
                }
            }
        }

        /* renamed from: a */
        public String mo7565a(int i) {
            InputStream c = m11309c(i);
            if (c != null) {
                return C1875a.m11283b(c);
            }
            return null;
        }

        /* renamed from: a */
        public void mo7566a() {
            C1875a.this.m11279a(this, true);
            this.f6399d = true;
        }

        /* renamed from: a */
        public void mo7567a(int i, String str) {
            OutputStreamWriter outputStreamWriter;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(mo7568b(i)), C1882c.f6422b);
                try {
                    outputStreamWriter.write(str);
                    C1882c.m11339a((Closeable) outputStreamWriter);
                } catch (Throwable th) {
                    th = th;
                    C1882c.m11339a((Closeable) outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter = null;
                C1882c.m11339a((Closeable) outputStreamWriter);
                throw th;
            }
        }

        /* renamed from: b */
        public File mo7568b(int i) {
            File b;
            synchronized (C1875a.this) {
                if (this.f6397b.f6406g != this) {
                    throw new IllegalStateException();
                }
                if (!this.f6397b.f6405f) {
                    this.f6398c[i] = true;
                }
                b = this.f6397b.mo7573b(i);
                if (!C1875a.this.f6382l.exists()) {
                    C1875a.this.f6382l.mkdirs();
                }
            }
            return b;
        }

        /* renamed from: b */
        public void mo7569b() {
            C1875a.this.m11279a(this, false);
        }

        /* renamed from: c */
        public void mo7570c() {
            if (!this.f6399d) {
                try {
                    mo7569b();
                } catch (IOException e) {
                }
            }
        }
    }

    /* renamed from: com.a.a.a.a$b */
    private final class C1878b {

        /* renamed from: a */
        File[] f6400a;

        /* renamed from: b */
        File[] f6401b;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String f6403d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long[] f6404e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f6405f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C1877a f6406g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f6407h;

        private C1878b(String str) {
            this.f6403d = str;
            this.f6404e = new long[C1875a.this.f6388r];
            this.f6400a = new File[C1875a.this.f6388r];
            this.f6401b = new File[C1875a.this.f6388r];
            StringBuilder append = new StringBuilder(str).append('.');
            int length = append.length();
            for (int i = 0; i < C1875a.this.f6388r; i++) {
                append.append(i);
                this.f6400a[i] = new File(C1875a.this.f6382l, append.toString());
                append.append(".tmp");
                this.f6401b[i] = new File(C1875a.this.f6382l, append.toString());
                append.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11320a(String[] strArr) {
            if (strArr.length != C1875a.this.f6388r) {
                throw m11322b(strArr);
            }
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.f6404e[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException e) {
                    throw m11322b(strArr);
                }
            }
        }

        /* renamed from: b */
        private IOException m11322b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File mo7571a(int i) {
            return this.f6400a[i];
        }

        /* renamed from: a */
        public String mo7572a() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f6404e) {
                sb.append(' ').append(append);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo7573b(int i) {
            return this.f6401b[i];
        }
    }

    /* renamed from: com.a.a.a.a$c */
    public final class C1879c {

        /* renamed from: b */
        private final String f6409b;

        /* renamed from: c */
        private final long f6410c;

        /* renamed from: d */
        private final long[] f6411d;

        /* renamed from: e */
        private final File[] f6412e;

        private C1879c(String str, long j, File[] fileArr, long[] jArr) {
            this.f6409b = str;
            this.f6410c = j;
            this.f6412e = fileArr;
            this.f6411d = jArr;
        }

        /* renamed from: a */
        public C1877a mo7574a() {
            return C1875a.this.m11275a(this.f6409b, this.f6410c);
        }

        /* renamed from: a */
        public File mo7575a(int i) {
            return this.f6412e[i];
        }

        /* renamed from: b */
        public String mo7576b(int i) {
            return C1875a.m11283b((InputStream) new FileInputStream(this.f6412e[i]));
        }

        /* renamed from: c */
        public long mo7577c(int i) {
            return this.f6411d[i];
        }
    }

    private C1875a(File file, int i, int i2, long j) {
        this.f6382l = file;
        this.f6386p = i;
        this.f6383m = new File(file, f6371a);
        this.f6384n = new File(file, f6372b);
        this.f6385o = new File(file, f6373c);
        this.f6388r = i2;
        this.f6387q = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized C1877a m11275a(String str, long j) {
        C1878b bVar;
        C1877a aVar;
        m11294k();
        C1878b bVar2 = this.f6391u.get(str);
        if (j == -1 || (bVar2 != null && bVar2.f6407h == j)) {
            if (bVar2 == null) {
                C1878b bVar3 = new C1878b(str);
                this.f6391u.put(str, bVar3);
                bVar = bVar3;
            } else if (bVar2.f6406g != null) {
                aVar = null;
            } else {
                bVar = bVar2;
            }
            aVar = new C1877a(bVar);
            C1877a unused = bVar.f6406g = aVar;
            this.f6390t.append(f6378i);
            this.f6390t.append(' ');
            this.f6390t.append(str);
            this.f6390t.append(10);
            this.f6390t.flush();
        } else {
            aVar = null;
        }
        return aVar;
    }

    /* renamed from: a */
    public static C1875a m11276a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        } else {
            File file2 = new File(file, f6373c);
            if (file2.exists()) {
                File file3 = new File(file, f6371a);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m11282a(file2, file3, false);
                }
            }
            C1875a aVar = new C1875a(file, i, i2, j);
            if (aVar.f6383m.exists()) {
                try {
                    aVar.m11290g();
                    aVar.m11291h();
                    return aVar;
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo7562f();
                }
            }
            file.mkdirs();
            C1875a aVar2 = new C1875a(file, i, i2, j);
            aVar2.m11292i();
            return aVar2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m11279a(C1877a aVar, boolean z) {
        synchronized (this) {
            C1878b a = aVar.f6397b;
            if (a.f6406g != aVar) {
                throw new IllegalStateException();
            }
            if (z) {
                if (!a.f6405f) {
                    int i = 0;
                    while (true) {
                        if (i < this.f6388r) {
                            if (!aVar.f6398c[i]) {
                                aVar.mo7569b();
                                throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                            } else if (!a.mo7573b(i).exists()) {
                                aVar.mo7569b();
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.f6388r; i2++) {
                File b = a.mo7573b(i2);
                if (!z) {
                    m11281a(b);
                } else if (b.exists()) {
                    File a2 = a.mo7571a(i2);
                    b.renameTo(a2);
                    long j = a.f6404e[i2];
                    long length = a2.length();
                    a.f6404e[i2] = length;
                    this.f6389s = (this.f6389s - j) + length;
                }
            }
            this.f6392v++;
            C1877a unused = a.f6406g = null;
            if (a.f6405f || z) {
                boolean unused2 = a.f6405f = true;
                this.f6390t.append(f6377h);
                this.f6390t.append(' ');
                this.f6390t.append(a.f6403d);
                this.f6390t.append(a.mo7572a());
                this.f6390t.append(10);
                if (z) {
                    long j2 = this.f6393w;
                    this.f6393w = 1 + j2;
                    long unused3 = a.f6407h = j2;
                }
            } else {
                this.f6391u.remove(a.f6403d);
                this.f6390t.append(f6379j);
                this.f6390t.append(' ');
                this.f6390t.append(a.f6403d);
                this.f6390t.append(10);
            }
            this.f6390t.flush();
            if (this.f6389s > this.f6387q || m11293j()) {
                this.f6381g.submit(this.f6394x);
            }
        }
    }

    /* renamed from: a */
    private static void m11281a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m11282a(File file, File file2, boolean z) {
        if (z) {
            m11281a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m11283b(InputStream inputStream) {
        return C1882c.m11338a((Reader) new InputStreamReader(inputStream, C1882c.f6422b));
    }

    /* renamed from: d */
    private void m11287d(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            String substring = str.substring(i);
            if (indexOf != f6379j.length() || !str.startsWith(f6379j)) {
                str2 = substring;
            } else {
                this.f6391u.remove(substring);
                return;
            }
        } else {
            str2 = str.substring(i, indexOf2);
        }
        C1878b bVar = this.f6391u.get(str2);
        if (bVar == null) {
            bVar = new C1878b(str2);
            this.f6391u.put(str2, bVar);
        }
        if (indexOf2 != -1 && indexOf == f6377h.length() && str.startsWith(f6377h)) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            boolean unused = bVar.f6405f = true;
            C1877a unused2 = bVar.f6406g = null;
            bVar.m11320a(split);
        } else if (indexOf2 == -1 && indexOf == f6378i.length() && str.startsWith(f6378i)) {
            C1877a unused3 = bVar.f6406g = new C1877a(bVar);
        } else if (indexOf2 != -1 || indexOf != f6380k.length() || !str.startsWith(f6380k)) {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* renamed from: g */
    private void m11290g() {
        int i;
        C1880b bVar = new C1880b(new FileInputStream(this.f6383m), C1882c.f6421a);
        try {
            String a = bVar.mo7578a();
            String a2 = bVar.mo7578a();
            String a3 = bVar.mo7578a();
            String a4 = bVar.mo7578a();
            String a5 = bVar.mo7578a();
            if (!f6374d.equals(a) || !f6375e.equals(a2) || !Integer.toString(this.f6386p).equals(a3) || !Integer.toString(this.f6388r).equals(a4) || !"".equals(a5)) {
                throw new IOException("unexpected journal header: [" + a + ", " + a2 + ", " + a4 + ", " + a5 + "]");
            }
            i = 0;
            while (true) {
                m11287d(bVar.mo7578a());
                i++;
            }
        } catch (EOFException e) {
            this.f6392v = i - this.f6391u.size();
            if (bVar.mo7579b()) {
                m11292i();
            } else {
                this.f6390t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6383m, true), C1882c.f6421a));
            }
            C1882c.m11339a((Closeable) bVar);
        } catch (Throwable th) {
            C1882c.m11339a((Closeable) bVar);
            throw th;
        }
    }

    /* renamed from: h */
    private void m11291h() {
        m11281a(this.f6384n);
        Iterator<C1878b> it = this.f6391u.values().iterator();
        while (it.hasNext()) {
            C1878b next = it.next();
            if (next.f6406g == null) {
                for (int i = 0; i < this.f6388r; i++) {
                    this.f6389s += next.f6404e[i];
                }
            } else {
                C1877a unused = next.f6406g = null;
                for (int i2 = 0; i2 < this.f6388r; i2++) {
                    m11281a(next.mo7571a(i2));
                    m11281a(next.mo7573b(i2));
                }
                it.remove();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m11292i() {
        if (this.f6390t != null) {
            this.f6390t.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6384n), C1882c.f6421a));
        try {
            bufferedWriter.write(f6374d);
            bufferedWriter.write("\n");
            bufferedWriter.write(f6375e);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6386p));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f6388r));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1878b next : this.f6391u.values()) {
                if (next.f6406g != null) {
                    bufferedWriter.write("DIRTY " + next.f6403d + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f6403d + next.mo7572a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f6383m.exists()) {
                m11282a(this.f6383m, this.f6385o, true);
            }
            m11282a(this.f6384n, this.f6383m, false);
            this.f6385o.delete();
            this.f6390t = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f6383m, true), C1882c.f6421a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m11293j() {
        return this.f6392v >= 2000 && this.f6392v >= this.f6391u.size();
    }

    /* renamed from: k */
    private void m11294k() {
        if (this.f6390t == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11295l() {
        while (this.f6389s > this.f6387q) {
            mo7558c((String) this.f6391u.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: a */
    public synchronized C1879c mo7552a(String str) {
        C1879c cVar = null;
        synchronized (this) {
            m11294k();
            C1878b bVar = this.f6391u.get(str);
            if (bVar != null) {
                if (bVar.f6405f) {
                    File[] fileArr = bVar.f6400a;
                    int length = fileArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (!fileArr[i].exists()) {
                                break;
                            }
                            i++;
                        } else {
                            this.f6392v++;
                            this.f6390t.append(f6380k);
                            this.f6390t.append(' ');
                            this.f6390t.append(str);
                            this.f6390t.append(10);
                            if (m11293j()) {
                                this.f6381g.submit(this.f6394x);
                            }
                            cVar = new C1879c(str, bVar.f6407h, bVar.f6400a, bVar.f6404e);
                        }
                    }
                }
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public File mo7553a() {
        return this.f6382l;
    }

    /* renamed from: a */
    public synchronized void mo7554a(long j) {
        this.f6387q = j;
        this.f6381g.submit(this.f6394x);
    }

    /* renamed from: b */
    public synchronized long mo7555b() {
        return this.f6387q;
    }

    /* renamed from: b */
    public C1877a mo7556b(String str) {
        return m11275a(str, -1);
    }

    /* renamed from: c */
    public synchronized long mo7557c() {
        return this.f6389s;
    }

    /* renamed from: c */
    public synchronized boolean mo7558c(String str) {
        boolean z;
        int i = 0;
        synchronized (this) {
            m11294k();
            C1878b bVar = this.f6391u.get(str);
            if (bVar == null || bVar.f6406g != null) {
                z = false;
            } else {
                while (i < this.f6388r) {
                    File a = bVar.mo7571a(i);
                    if (!a.exists() || a.delete()) {
                        this.f6389s -= bVar.f6404e[i];
                        bVar.f6404e[i] = 0;
                        i++;
                    } else {
                        throw new IOException("failed to delete " + a);
                    }
                }
                this.f6392v++;
                this.f6390t.append(f6379j);
                this.f6390t.append(' ');
                this.f6390t.append(str);
                this.f6390t.append(10);
                this.f6391u.remove(str);
                if (m11293j()) {
                    this.f6381g.submit(this.f6394x);
                }
                z = true;
            }
        }
        return z;
    }

    public synchronized void close() {
        if (this.f6390t != null) {
            Iterator it = new ArrayList(this.f6391u.values()).iterator();
            while (it.hasNext()) {
                C1878b bVar = (C1878b) it.next();
                if (bVar.f6406g != null) {
                    bVar.f6406g.mo7569b();
                }
            }
            m11295l();
            this.f6390t.close();
            this.f6390t = null;
        }
    }

    /* renamed from: d */
    public synchronized boolean mo7560d() {
        return this.f6390t == null;
    }

    /* renamed from: e */
    public synchronized void mo7561e() {
        m11294k();
        m11295l();
        this.f6390t.flush();
    }

    /* renamed from: f */
    public void mo7562f() {
        close();
        C1882c.m11340a(this.f6382l);
    }
}
