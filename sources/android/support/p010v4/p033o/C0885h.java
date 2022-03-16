package android.support.p010v4.p033o;

import android.support.annotation.C0011ag;
import android.util.Log;
import java.io.Writer;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.o.h */
public class C0885h extends Writer {

    /* renamed from: a */
    private final String f3051a;

    /* renamed from: b */
    private StringBuilder f3052b = new StringBuilder(128);

    public C0885h(String str) {
        this.f3051a = str;
    }

    /* renamed from: a */
    private void m4429a() {
        if (this.f3052b.length() > 0) {
            Log.d(this.f3051a, this.f3052b.toString());
            this.f3052b.delete(0, this.f3052b.length());
        }
    }

    public void close() {
        m4429a();
    }

    public void flush() {
        m4429a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4429a();
            } else {
                this.f3052b.append(c);
            }
        }
    }
}
