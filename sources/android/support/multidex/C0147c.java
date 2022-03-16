package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: android.support.multidex.c */
final class C0147c {

    /* renamed from: a */
    private static final String f1019a = "MultiDex";

    /* renamed from: b */
    private static final String f1020b = "classes";

    /* renamed from: c */
    private static final String f1021c = ".dex";

    /* renamed from: d */
    private static final String f1022d = ".classes";

    /* renamed from: e */
    private static final String f1023e = ".zip";

    /* renamed from: f */
    private static final int f1024f = 3;

    /* renamed from: g */
    private static final String f1025g = "multidex.version";

    /* renamed from: h */
    private static final String f1026h = "timestamp";

    /* renamed from: i */
    private static final String f1027i = "crc";

    /* renamed from: j */
    private static final String f1028j = "dex.number";

    /* renamed from: k */
    private static final int f1029k = 16384;

    /* renamed from: l */
    private static final long f1030l = -1;

    /* renamed from: m */
    private static Method f1031m;

    static {
        try {
            f1031m = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
        } catch (NoSuchMethodException e) {
            f1031m = null;
        }
    }

    C0147c() {
    }

    /* renamed from: a */
    private static SharedPreferences m743a(Context context) {
        return context.getSharedPreferences(f1025g, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    static List<File> m744a(Context context, ApplicationInfo applicationInfo, File file, boolean z) {
        List<File> a;
        Log.i(f1019a, "MultiDexExtractor.load(" + applicationInfo.sourceDir + ", " + z + ")");
        File file2 = new File(applicationInfo.sourceDir);
        long c = m755c(file2);
        if (z || m752a(context, file2, c)) {
            Log.i(f1019a, "Detected that extraction must be performed.");
            a = m746a(file2, file);
            m747a(context, m754b(file2), c, a.size() + 1);
        } else {
            try {
                a = m745a(context, file2, file);
            } catch (IOException e) {
                Log.w(f1019a, "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                a = m746a(file2, file);
                m747a(context, m754b(file2), c, a.size() + 1);
            }
        }
        Log.i(f1019a, "load found " + a.size() + " secondary dex files");
        return a;
    }

    /* renamed from: a */
    private static List<File> m745a(Context context, File file, File file2) {
        Log.i(f1019a, "loading existing secondary dex files");
        String str = file.getName() + f1022d;
        int i = m743a(context).getInt(f1028j, 1);
        ArrayList arrayList = new ArrayList(i);
        int i2 = 2;
        while (i2 <= i) {
            File file3 = new File(file2, str + i2 + f1023e);
            if (file3.isFile()) {
                arrayList.add(file3);
                if (!m753a(file3)) {
                    Log.i(f1019a, "Invalid zip file: " + file3);
                    throw new IOException("Invalid ZIP file.");
                }
                i2++;
            } else {
                throw new IOException("Missing extracted secondary dex file '" + file3.getPath() + "'");
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<File> m746a(File file, File file2) {
        String str = file.getName() + f1022d;
        m750a(file2, str);
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipEntry entry = zipFile.getEntry(f1020b + 2 + f1021c);
            int i = 2;
            while (entry != null) {
                File file3 = new File(file2, str + i + f1023e);
                arrayList.add(file3);
                Log.i(f1019a, "Extraction is needed for file " + file3);
                boolean z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    int i3 = i2 + 1;
                    m751a(zipFile, entry, file3, str);
                    boolean a = m753a(file3);
                    Log.i(f1019a, "Extraction " + (a ? "success" : "failed") + " - length " + file3.getAbsolutePath() + ": " + file3.length());
                    if (!a) {
                        file3.delete();
                        if (file3.exists()) {
                            Log.w(f1019a, "Failed to delete corrupted secondary dex '" + file3.getPath() + "'");
                            z = a;
                            i2 = i3;
                        }
                    }
                    z = a;
                    i2 = i3;
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + file3.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                int i4 = i + 1;
                entry = zipFile.getEntry(f1020b + i4 + f1021c);
                i = i4;
            }
            try {
            } catch (IOException e) {
                Log.w(f1019a, "Failed to close resource", e);
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w(f1019a, "Failed to close resource", e2);
            }
        }
    }

    /* renamed from: a */
    private static void m747a(Context context, long j, long j2, int i) {
        SharedPreferences.Editor edit = m743a(context).edit();
        edit.putLong(f1026h, j);
        edit.putLong(f1027i, j2);
        edit.putInt(f1028j, i);
        m748a(edit);
    }

    /* renamed from: a */
    private static void m748a(SharedPreferences.Editor editor) {
        if (f1031m != null) {
            try {
                f1031m.invoke(editor, new Object[0]);
                return;
            } catch (IllegalAccessException | InvocationTargetException e) {
            }
        }
        editor.commit();
    }

    /* renamed from: a */
    private static void m749a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w(f1019a, "Failed to close resource", e);
        }
    }

    /* renamed from: a */
    private static void m750a(File file, final String str) {
        file.mkdirs();
        if (!file.isDirectory()) {
            throw new IOException("Failed to create dex directory " + file.getPath());
        }
        File[] listFiles = file.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return !file.getName().startsWith(str);
            }
        });
        if (listFiles == null) {
            Log.w(f1019a, "Failed to list secondary dex dir content (" + file.getPath() + ").");
            return;
        }
        for (File file2 : listFiles) {
            Log.i(f1019a, "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
            if (!file2.delete()) {
                Log.w(f1019a, "Failed to delete old file " + file2.getPath());
            } else {
                Log.i(f1019a, "Deleted old file " + file2.getPath());
            }
        }
    }

    /* renamed from: a */
    private static void m751a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(str, f1023e, file.getParentFile());
        Log.i(f1019a, "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            Log.i(f1019a, "Renaming to " + file.getPath());
            if (!createTempFile.renameTo(file)) {
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            m749a((Closeable) inputStream);
            createTempFile.delete();
        } catch (Throwable th) {
            m749a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m752a(Context context, File file, long j) {
        SharedPreferences a = m743a(context);
        return (a.getLong(f1026h, -1) == m754b(file) && a.getLong(f1027i, -1) == j) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        android.util.Log.w(f1019a, "File " + r4.getAbsolutePath() + " is not a valid zip file.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        android.util.Log.w(f1019a, "Failed to close zip file: " + r4.getAbsolutePath());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029 A[ExcHandler: ZipException (r0v1 'e' java.util.zip.ZipException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m753a(java.io.File r4) {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            r0.<init>(r4)     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            r0.close()     // Catch:{ IOException -> 0x000a, ZipException -> 0x0029 }
            r0 = 1
        L_0x0009:
            return r0
        L_0x000a:
            r0 = move-exception
            java.lang.String r0 = "MultiDex"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            r1.<init>()     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            java.lang.String r2 = "Failed to close zip file: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
            android.util.Log.w(r0, r1)     // Catch:{ ZipException -> 0x0029, IOException -> 0x004d }
        L_0x0027:
            r0 = 0
            goto L_0x0009
        L_0x0029:
            r0 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "File "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is not a valid zip file."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r1, r2, r0)
            goto L_0x0027
        L_0x004d:
            r0 = move-exception
            java.lang.String r1 = "MultiDex"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Got an IOException trying to open zip file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r1, r2, r0)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.C0147c.m753a(java.io.File):boolean");
    }

    /* renamed from: b */
    private static long m754b(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: c */
    private static long m755c(File file) {
        long a = C0150e.m756a(file);
        return a == -1 ? a - 1 : a;
    }
}
