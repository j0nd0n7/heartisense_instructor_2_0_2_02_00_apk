package android.support.p010v4.p033o;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: android.support.v4.o.c */
public class C0880c {

    /* renamed from: a */
    private final File f3038a;

    /* renamed from: b */
    private final File f3039b;

    public C0880c(File file) {
        this.f3038a = file;
        this.f3039b = new File(file.getPath() + ".bak");
    }

    /* renamed from: c */
    static boolean m4388c(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.getFD().sync();
            } catch (IOException e) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public File mo2824a() {
        return this.f3038a;
    }

    /* renamed from: a */
    public void mo2825a(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m4388c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f3039b.delete();
            } catch (IOException e) {
                Log.w("AtomicFile", "finishWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: b */
    public void mo2826b() {
        this.f3038a.delete();
        this.f3039b.delete();
    }

    /* renamed from: b */
    public void mo2827b(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m4388c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f3038a.delete();
                this.f3039b.renameTo(this.f3038a);
            } catch (IOException e) {
                Log.w("AtomicFile", "failWrite: Got exception:", e);
            }
        }
    }

    /* renamed from: c */
    public FileOutputStream mo2828c() {
        if (this.f3038a.exists()) {
            if (this.f3039b.exists()) {
                this.f3038a.delete();
            } else if (!this.f3038a.renameTo(this.f3039b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f3038a + " to backup file " + this.f3039b);
            }
        }
        try {
            return new FileOutputStream(this.f3038a);
        } catch (FileNotFoundException e) {
            if (!this.f3038a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f3038a);
            }
            try {
                return new FileOutputStream(this.f3038a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.f3038a);
            }
        }
    }

    /* renamed from: d */
    public FileInputStream mo2829d() {
        if (this.f3039b.exists()) {
            this.f3038a.delete();
            this.f3039b.renameTo(this.f3038a);
        }
        return new FileInputStream(this.f3038a);
    }

    /* renamed from: e */
    public byte[] mo2830e() {
        byte[] bArr;
        int i = 0;
        FileInputStream d = mo2829d();
        try {
            byte[] bArr2 = new byte[d.available()];
            while (true) {
                int read = d.read(bArr2, i, bArr2.length - i);
                if (read <= 0) {
                    return bArr2;
                }
                int i2 = read + i;
                int available = d.available();
                if (available > bArr2.length - i2) {
                    bArr = new byte[(available + i2)];
                    System.arraycopy(bArr2, 0, bArr, 0, i2);
                } else {
                    bArr = bArr2;
                }
                bArr2 = bArr;
                i = i2;
            }
        } finally {
            d.close();
        }
    }
}
