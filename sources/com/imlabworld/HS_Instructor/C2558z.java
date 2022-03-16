package com.imlabworld.HS_Instructor;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: com.imlabworld.HS_Instructor.z */
class C2558z extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLContext f9855a = SSLContext.getInstance("TLS");

    public C2558z(KeyStore keyStore) {
        super(keyStore);
        C25591 r0 = new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };
        this.f9855a.init((KeyManager[]) null, new TrustManager[]{r0}, (SecureRandom) null);
    }

    public Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
        int soTimeout = HttpConnectionParams.getSoTimeout(httpParams);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        SSLSocket sSLSocket = (SSLSocket) (socket != null ? socket : createSocket());
        if (inetAddress != null || i2 > 0) {
            if (i2 < 0) {
                i2 = 0;
            }
            sSLSocket.bind(new InetSocketAddress(inetAddress, i2));
        }
        sSLSocket.connect(inetSocketAddress, connectionTimeout);
        sSLSocket.setSoTimeout(soTimeout);
        return sSLSocket;
    }

    public Socket createSocket() {
        return this.f9855a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f9855a.getSocketFactory().createSocket(socket, str, i, z);
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(C2558z.class);
    }

    public int hashCode() {
        return C2558z.class.hashCode();
    }

    public boolean isSecure(Socket socket) {
        return true;
    }
}
