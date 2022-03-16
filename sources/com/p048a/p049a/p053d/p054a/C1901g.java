package com.p048a.p049a.p053d.p054a;

import android.text.TextUtils;
import android.util.Log;
import com.p048a.p049a.C2255p;
import com.p048a.p049a.p053d.p060c.C2041d;
import com.p048a.p049a.p078j.C2231b;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.a.a.d.a.g */
public class C1901g implements C1897c<InputStream> {

    /* renamed from: a */
    private static final String f6595a = "HttpUrlFetcher";

    /* renamed from: b */
    private static final int f6596b = 5;

    /* renamed from: c */
    private static final C1904b f6597c = new C1903a();

    /* renamed from: d */
    private final C2041d f6598d;

    /* renamed from: e */
    private final C1904b f6599e;

    /* renamed from: f */
    private HttpURLConnection f6600f;

    /* renamed from: g */
    private InputStream f6601g;

    /* renamed from: h */
    private volatile boolean f6602h;

    /* renamed from: com.a.a.d.a.g$a */
    private static class C1903a implements C1904b {
        private C1903a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo7730a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.a.a.d.a.g$b */
    interface C1904b {
        /* renamed from: a */
        HttpURLConnection mo7730a(URL url);
    }

    public C1901g(C2041d dVar) {
        this(dVar, f6597c);
    }

    C1901g(C2041d dVar, C1904b bVar) {
        this.f6598d = dVar;
        this.f6599e = bVar;
    }

    /* renamed from: a */
    private InputStream m11528a(HttpURLConnection httpURLConnection) {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f6601g = C2231b.m12697a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable(f6595a, 3)) {
                Log.d(f6595a, "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f6601g = httpURLConnection.getInputStream();
        }
        return this.f6601g;
    }

    /* renamed from: a */
    private InputStream m11529a(URL url, int i, URL url2, Map<String, String> map) {
        if (i >= 5) {
            throw new IOException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new IOException("In re-direct loop");
                }
            } catch (URISyntaxException e) {
            }
        }
        this.f6600f = this.f6599e.mo7730a(url);
        for (Map.Entry next : map.entrySet()) {
            this.f6600f.addRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        this.f6600f.setConnectTimeout(2500);
        this.f6600f.setReadTimeout(2500);
        this.f6600f.setUseCaches(false);
        this.f6600f.setDoInput(true);
        this.f6600f.connect();
        if (this.f6602h) {
            return null;
        }
        int responseCode = this.f6600f.getResponseCode();
        if (responseCode / 100 == 2) {
            return m11528a(this.f6600f);
        }
        if (responseCode / 100 == 3) {
            String headerField = this.f6600f.getHeaderField("Location");
            if (!TextUtils.isEmpty(headerField)) {
                return m11529a(new URL(url, headerField), i + 1, url, map);
            }
            throw new IOException("Received empty or null redirect url");
        } else if (responseCode == -1) {
            throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
        } else {
            throw new IOException("Request failed " + responseCode + ": " + this.f6600f.getResponseMessage());
        }
    }

    /* renamed from: a */
    public void mo7712a() {
        if (this.f6601g != null) {
            try {
                this.f6601g.close();
            } catch (IOException e) {
            }
        }
        if (this.f6600f != null) {
            this.f6600f.disconnect();
        }
    }

    /* renamed from: b */
    public InputStream mo7711a(C2255p pVar) {
        return m11529a(this.f6598d.mo7912a(), 0, (URL) null, this.f6598d.mo7914c());
    }

    /* renamed from: b */
    public String mo7714b() {
        return this.f6598d.mo7915d();
    }

    /* renamed from: c */
    public void mo7715c() {
        this.f6602h = true;
    }
}
