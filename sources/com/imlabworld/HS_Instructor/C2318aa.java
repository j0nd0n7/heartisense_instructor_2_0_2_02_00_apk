package com.imlabworld.HS_Instructor;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.imlabworld.HS_Instructor.aa */
class C2318aa implements X509TrustManager {

    /* renamed from: a */
    private X509TrustManager f7747a = null;

    public C2318aa(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        if (trustManagers.length == 0) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.f7747a = (X509TrustManager) trustManagers[0];
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f7747a.checkClientTrusted(x509CertificateArr, str);
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (x509CertificateArr == null || x509CertificateArr.length != 1) {
            this.f7747a.checkServerTrusted(x509CertificateArr, str);
        } else {
            x509CertificateArr[0].checkValidity();
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f7747a.getAcceptedIssuers();
    }
}
