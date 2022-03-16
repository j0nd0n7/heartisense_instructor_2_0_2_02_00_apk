package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.p048a.p049a.p053d.C2010c;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.imlabworld.HS_Instructor.ba */
public class C2429ba extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8441a = "param";

    /* renamed from: b */
    private String f8442b;

    /* renamed from: c */
    private View f8443c;

    /* renamed from: d */
    private ScalableLayout f8444d;

    /* renamed from: e */
    private TextView f8445e;

    /* renamed from: f */
    private EditText f8446f;

    /* renamed from: g */
    private EditText f8447g;

    /* renamed from: h */
    private TextView f8448h;

    /* renamed from: i */
    private TextView f8449i;

    /* renamed from: j */
    private TextView f8450j;

    /* renamed from: k */
    private C2548p f8451k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C2549q f8452l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2432c f8453m;

    /* renamed from: com.imlabworld.HS_Instructor.ba$a */
    public enum C2430a {
        SUCCESS,
        FAIL,
        CANCEL
    }

    /* renamed from: com.imlabworld.HS_Instructor.ba$b */
    private class C2431b extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        final String f8458a;

        /* renamed from: b */
        final String f8459b;

        /* renamed from: c */
        String f8460c;

        /* renamed from: d */
        String f8461d;

        /* renamed from: e */
        int f8462e;

        /* renamed from: f */
        int f8463f;

        C2431b(String str, String str2) {
            this.f8458a = str;
            this.f8459b = str2;
        }

        /* renamed from: a */
        private String m13453a(String str, String str2) {
            new JSONObject();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", "2"));
            arrayList.add(new BasicNameValuePair("email", str));
            arrayList.add(new BasicNameValuePair("password", str2));
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/Monitor_communication/".startsWith("http://") ? new DefaultHttpClient() : C2429ba.m13449d();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/Monitor_communication/authenticate");
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, C2010c.f6851a));
                return EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
            } catch (ClientProtocolException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return null;
        }

        /* renamed from: a */
        public String mo8945a() {
            this.f8462e = 0;
            this.f8463f = 0;
            try {
                JSONObject jSONObject = new JSONObject(m13453a(this.f8458a, this.f8459b));
                this.f8462e = jSONObject.getInt("success");
                if (this.f8462e == 0) {
                    this.f8461d = jSONObject.getString("error");
                    return null;
                }
                this.f8463f = jSONObject.getInt("recordid");
                this.f8460c = jSONObject.getString("instName");
                return null;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            return mo8945a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f8462e == 1) {
                Intent intent = new Intent();
                intent.putExtra("recordid", this.f8463f);
                intent.putExtra("email", this.f8458a);
                intent.putExtra("name", this.f8460c);
                C2557y.f9811B.mo9544a(this.f8458a);
                C2557y.f9811B.mo9546b(this.f8463f);
                C2557y.f9811B.mo9547b(this.f8460c);
                C2429ba.this.f8452l.mo9624a(C2557y.f9811B);
                C2429ba.this.f8453m.mo8603a(C2430a.SUCCESS);
                return;
            }
            C2557y.f9812C = this.f8461d;
            C2429ba.this.f8453m.mo8603a(C2430a.FAIL);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.ba$c */
    public interface C2432c {
        /* renamed from: a */
        void mo8603a(C2430a aVar);
    }

    /* renamed from: a */
    public static C2429ba m13445a(String str) {
        C2429ba baVar = new C2429ba();
        Bundle bundle = new Bundle();
        bundle.putString(f8441a, str);
        baVar.setArguments(bundle);
        return baVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static HttpClient m13449d() {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            C2558z zVar = new C2558z(instance);
            zVar.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(basicHttpParams, C2010c.f6851a);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", zVar, 443));
            return new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        } catch (Exception e) {
            return new DefaultHttpClient();
        }
    }

    /* renamed from: a */
    public void mo8937a() {
        this.f8445e.setText("LMS " + C2557y.f9835g.f10153a);
        this.f8448h.setText(C2557y.f9835g.f10153a);
        this.f8449i.setText(C2557y.f9835g.f10210bD);
        this.f8450j.setText("▶ " + C2557y.f9835g.f10223bQ);
    }

    /* renamed from: a */
    public void mo8938a(boolean z) {
        if (C2557y.f9811B == null || C2557y.f9811B.mo9545b().equals("null")) {
            this.f8446f.setText("");
        } else {
            this.f8446f.setText(C2557y.f9811B.mo9545b());
        }
        if (z) {
            this.f8447g.setText("");
        }
        this.f8445e.setText("LMS " + C2557y.f9835g.f10153a);
        this.f8448h.setText(C2557y.f9835g.f10153a);
        this.f8449i.setText(C2557y.f9835g.f10210bD);
        this.f8450j.setText("▶ " + C2557y.f9835g.f10223bQ);
    }

    /* renamed from: b */
    public void mo8939b() {
        this.f8447g.setText("");
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2432c) {
            this.f8453m = (C2432c) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.sendinstructor_cancel_btn /*2131231741*/:
                this.f8453m.mo8603a(C2430a.CANCEL);
                return;
            case C2656R.C2657id.sendinstructor_find_btn /*2131231742*/:
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.heartisense.com/LMS/index.php/IMLAB/find_account")));
                return;
            case C2656R.C2657id.sendinstructor_login_btn /*2131231743*/:
                if (Pattern.compile("[a-zA-Z0-9_\\.-]+@{1}+[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_]+)+").matcher(this.f8446f.getText().toString()).matches()) {
                    new C2431b(this.f8446f.getText().toString(), this.f8447g.getText().toString()).execute(new Void[0]);
                    return;
                } else {
                    Toast.makeText(getActivity(), C2557y.f9835g.f10158aE, 0).show();
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8442b = getArguments().getString(f8441a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8451k = new C2548p(getActivity());
        this.f8452l = new C2549q(getActivity());
        this.f8443c = layoutInflater.inflate(C2656R.layout.sendinstructor, viewGroup, false);
        this.f8444d = (ScalableLayout) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_sc);
        this.f8445e = (TextView) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_title_txt);
        this.f8446f = (EditText) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_user_email);
        this.f8447g = (EditText) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_user_password);
        this.f8448h = (TextView) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_login_btn);
        this.f8449i = (TextView) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_cancel_btn);
        this.f8450j = (TextView) this.f8443c.findViewById(C2656R.C2657id.sendinstructor_find_btn);
        this.f8444d.setOnClickListener(this);
        this.f8448h.setOnClickListener(this);
        this.f8449i.setOnClickListener(this);
        this.f8450j.setOnClickListener(this);
        return this.f8443c;
    }

    public void onDetach() {
        super.onDetach();
        this.f8453m = null;
    }
}
