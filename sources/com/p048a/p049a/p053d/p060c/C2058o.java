package com.p048a.p049a.p053d.p060c;

import android.util.Log;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p078j.C2230a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.a.a.d.c.o */
public class C2058o implements C1915b<InputStream> {

    /* renamed from: a */
    private static final String f6907a = "StreamEncoder";

    /* renamed from: a */
    public String mo7743a() {
        return "";
    }

    /* renamed from: a */
    public boolean mo7744a(InputStream inputStream, OutputStream outputStream) {
        byte[] c = C2230a.m12691a().mo8313c();
        while (true) {
            try {
                int read = inputStream.read(c);
                if (read != -1) {
                    outputStream.write(c, 0, read);
                } else {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable(f6907a, 3)) {
                    Log.d(f6907a, "Failed to encode data onto the OutputStream", e);
                }
                return false;
            } finally {
                C2230a.m12691a().mo8311a(c);
            }
        }
    }
}
