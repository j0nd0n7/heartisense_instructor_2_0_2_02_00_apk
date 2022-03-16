package com.p048a.p049a.p050a;

import com.p048a.p049a.p053d.C2010c;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* renamed from: com.a.a.a.c */
final class C1882c {

    /* renamed from: a */
    static final Charset f6421a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f6422b = Charset.forName(C2010c.f6851a);

    private C1882c() {
    }

    /* renamed from: a */
    static String m11338a(Reader reader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, read);
            }
        } finally {
            reader.close();
        }
    }

    /* renamed from: a */
    static void m11339a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    static void m11340a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m11340a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
