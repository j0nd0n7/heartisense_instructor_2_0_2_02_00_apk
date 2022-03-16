package android.support.p010v4.p020g.p022b;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@C0007ae(mo1a = 23)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
@TargetApi(23)
/* renamed from: android.support.v4.g.b.b */
public final class C0532b {

    /* renamed from: android.support.v4.g.b.b$a */
    public static abstract class C0534a {
        /* renamed from: a */
        public void mo1910a() {
        }

        /* renamed from: a */
        public void mo1911a(int i, CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo1912a(C0535b bVar) {
        }

        /* renamed from: b */
        public void mo1913b(int i, CharSequence charSequence) {
        }
    }

    /* renamed from: android.support.v4.g.b.b$b */
    public static final class C0535b {

        /* renamed from: a */
        private C0536c f2107a;

        public C0535b(C0536c cVar) {
            this.f2107a = cVar;
        }

        /* renamed from: a */
        public C0536c mo1926a() {
            return this.f2107a;
        }
    }

    /* renamed from: android.support.v4.g.b.b$c */
    public static class C0536c {

        /* renamed from: a */
        private final Signature f2108a;

        /* renamed from: b */
        private final Cipher f2109b;

        /* renamed from: c */
        private final Mac f2110c;

        public C0536c(Signature signature) {
            this.f2108a = signature;
            this.f2109b = null;
            this.f2110c = null;
        }

        public C0536c(Cipher cipher) {
            this.f2109b = cipher;
            this.f2108a = null;
            this.f2110c = null;
        }

        public C0536c(Mac mac) {
            this.f2110c = mac;
            this.f2109b = null;
            this.f2108a = null;
        }

        /* renamed from: a */
        public Signature mo1927a() {
            return this.f2108a;
        }

        /* renamed from: b */
        public Cipher mo1928b() {
            return this.f2109b;
        }

        /* renamed from: c */
        public Mac mo1929c() {
            return this.f2110c;
        }
    }

    /* renamed from: a */
    private static FingerprintManager.AuthenticationCallback m2757a(final C0534a aVar) {
        return new FingerprintManager.AuthenticationCallback() {
            public void onAuthenticationError(int i, CharSequence charSequence) {
                aVar.mo1911a(i, charSequence);
            }

            public void onAuthenticationFailed() {
                aVar.mo1910a();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                aVar.mo1913b(i, charSequence);
            }

            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                aVar.mo1912a(new C0535b(C0532b.m2762b(authenticationResult.getCryptoObject())));
            }
        };
    }

    /* renamed from: a */
    private static FingerprintManager.CryptoObject m2758a(C0536c cVar) {
        if (cVar == null) {
            return null;
        }
        if (cVar.mo1928b() != null) {
            return new FingerprintManager.CryptoObject(cVar.mo1928b());
        }
        if (cVar.mo1927a() != null) {
            return new FingerprintManager.CryptoObject(cVar.mo1927a());
        }
        if (cVar.mo1929c() != null) {
            return new FingerprintManager.CryptoObject(cVar.mo1929c());
        }
        return null;
    }

    /* renamed from: a */
    public static void m2760a(Context context, C0536c cVar, int i, Object obj, C0534a aVar, Handler handler) {
        FingerprintManager c = m2764c(context);
        if (c != null) {
            c.authenticate(m2758a(cVar), (CancellationSignal) obj, i, m2757a(aVar), handler);
        }
    }

    /* renamed from: a */
    public static boolean m2761a(Context context) {
        FingerprintManager c = m2764c(context);
        return c != null && c.hasEnrolledFingerprints();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0536c m2762b(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C0536c(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C0536c(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new C0536c(cryptoObject.getMac());
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m2763b(Context context) {
        FingerprintManager c = m2764c(context);
        return c != null && c.isHardwareDetected();
    }

    /* renamed from: c */
    private static FingerprintManager m2764c(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }
}
