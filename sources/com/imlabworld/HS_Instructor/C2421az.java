package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2616u;
import com.p048a.p049a.p053d.C2010c;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.imlabworld.HS_Instructor.az */
public class C2421az extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8369a = "param";

    /* renamed from: b */
    private String f8370b;

    /* renamed from: c */
    private final boolean f8371c = true;

    /* renamed from: d */
    private View f8372d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2424b f8373e;

    /* renamed from: f */
    private ScalableLayout f8374f;

    /* renamed from: g */
    private TextView f8375g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ImageView[] f8376h = new ImageView[8];
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f8377i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f8378j;

    /* renamed from: k */
    private ArrayList<C2425c> f8379k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f8380l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ArrayList<C2543k> f8381m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList<C2553u> f8382n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ArrayList<C2539g> f8383o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ArrayList<C2544l> f8384p;

    /* renamed from: q */
    private final Handler f8385q = new Handler() {
        public void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 3:
                        if (C2421az.this.f8378j) {
                            C2421az.this.f8376h[C2421az.this.f8377i].setImageResource(C2656R.drawable.img_loading_f4);
                            C2421az.m13409d(C2421az.this);
                            int unused = C2421az.this.f8377i = C2421az.this.f8377i % 8;
                            C2421az.this.f8376h[C2421az.this.f8377i].setImageResource(C2656R.drawable.img_loading_c6);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2548p f8386r;

    /* renamed from: com.imlabworld.HS_Instructor.az$a */
    public enum C2423a {
        SUCCESS,
        FAIL
    }

    /* renamed from: com.imlabworld.HS_Instructor.az$b */
    public interface C2424b {
        /* renamed from: a */
        void mo8602a(C2423a aVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.az$c */
    private class C2425c extends AsyncTask<Void, Void, String> {

        /* renamed from: c */
        static final int f8391c = 0;

        /* renamed from: d */
        static final int f8392d = 1;

        /* renamed from: e */
        static final int f8393e = 2;

        /* renamed from: f */
        static final int f8394f = 3;

        /* renamed from: a */
        final String f8395a = "GetClassSendPost !!";

        /* renamed from: b */
        final int f8396b;

        /* renamed from: g */
        final int f8397g;

        /* renamed from: h */
        String f8398h;

        C2425c(int i, int i2) {
            this.f8397g = i;
            this.f8396b = i2;
        }

        /* renamed from: a */
        private double m13423a(double d, int i) {
            return ((double) ((int) (Math.pow(10.0d, (double) i) * d))) / Math.pow(10.0d, (double) i);
        }

        /* renamed from: b */
        private String m13424b() {
            Log.e("GetClassSendPost !!", "license post start");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("version", "2"));
            arrayList.add(new BasicNameValuePair("id", C2557y.f9811B.mo9548c() + ""));
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/Monitor_communication/".startsWith("http://") ? new DefaultHttpClient() : C2421az.m13410d();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/Monitor_communication/check_license");
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, C2010c.f6851a));
                return EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
            } catch (ClientProtocolException e) {
                e.printStackTrace();
                this.f8398h = e.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
                this.f8398h = e2.toString();
            }
            return null;
        }

        /* renamed from: c */
        private String m13425c() {
            Log.e("GetClassSendPost !!", "class post start");
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = C2421az.this.f8381m.iterator();
                while (it.hasNext()) {
                    C2543k kVar = (C2543k) it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("class_idx", kVar.mo9467f());
                    jSONObject.put("name", kVar.mo9459b());
                    jSONObject.put("date", kVar.mo9462c());
                    jSONObject.put("is_org", kVar.mo9466e());
                    jSONObject.put("edit_time", kVar.mo9464d());
                    jSONObject.put("instructor_idx", C2557y.f9811B.mo9548c());
                    jSONArray.put(jSONObject);
                }
                arrayList.add(new BasicNameValuePair("version", "1"));
                arrayList.add(new BasicNameValuePair("class", jSONArray.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                this.f8398h = e.toString();
            }
            Log.e("Class Json", jSONArray.toString());
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/protocols/".startsWith("http://") ? new DefaultHttpClient() : C2421az.m13410d();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/protocols/classProcess");
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, C2010c.f6851a));
                return EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
            } catch (ClientProtocolException e2) {
                e2.printStackTrace();
                this.f8398h = e2.toString();
            } catch (Exception e3) {
                e3.printStackTrace();
                this.f8398h = e3.toString();
            }
            return null;
        }

        /* renamed from: d */
        private String m13426d() {
            Log.e("GetClassSendPost !!", "student post start");
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = C2421az.this.f8382n.iterator();
                while (it.hasNext()) {
                    C2553u uVar = (C2553u) it.next();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", uVar.mo9724f());
                    jSONObject.put("name", uVar.mo9718c());
                    jSONObject.put("phone", uVar.mo9723e());
                    jSONObject.put("email", uVar.mo9722d());
                    jSONObject.put("edit_time", uVar.mo9726h());
                    jSONArray.put(jSONObject);
                }
                arrayList.add(new BasicNameValuePair("version", "1"));
                arrayList.add(new BasicNameValuePair("student", jSONArray.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                this.f8398h = e.toString();
            }
            Log.e("Student Json", jSONArray.toString());
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/protocols/".startsWith("http://") ? new DefaultHttpClient() : C2421az.m13410d();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/protocols/studentProcess");
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, C2010c.f6851a));
                return EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
            } catch (ClientProtocolException e2) {
                e2.printStackTrace();
                this.f8398h = e2.toString();
            } catch (Exception e3) {
                e3.printStackTrace();
                this.f8398h = e3.toString();
            }
            return null;
        }

        /* renamed from: e */
        private String m13427e() {
            Log.e("GetClassSendPost !!", "assign post start");
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            try {
                Iterator it = C2421az.this.f8383o.iterator();
                while (it.hasNext()) {
                    C2539g gVar = (C2539g) it.next();
                    JSONObject jSONObject = new JSONObject();
                    C2543k c = C2421az.this.f8386r.mo9586c(gVar.mo9391b());
                    C2553u j = C2421az.this.f8386r.mo9602j(gVar.mo9393c());
                    jSONObject.put("class_idx", c.mo9467f());
                    jSONObject.put("student_idx", j.mo9724f());
                    jSONArray.put(jSONObject);
                }
                arrayList.add(new BasicNameValuePair("version", "1"));
                arrayList.add(new BasicNameValuePair("assign", jSONArray.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                this.f8398h = e.toString();
            }
            Log.e("Assign Json", jSONArray.toString());
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/protocols/".startsWith("http://") ? new DefaultHttpClient() : C2421az.m13410d();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/protocols/assignProcess");
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, C2010c.f6851a));
                return EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
            } catch (ClientProtocolException e2) {
                e2.printStackTrace();
                this.f8398h = e2.toString();
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f8398h = e3.toString();
            } catch (Exception e4) {
                e4.printStackTrace();
                this.f8398h = e4.toString();
            }
            return null;
        }

        /* renamed from: f */
        private String m13428f() {
            Log.e("GetClassSendPost !!", "data post start");
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList();
            try {
                C2544l lVar = (C2544l) C2421az.this.f8384p.get(this.f8397g);
                C2543k c = C2421az.this.f8386r.mo9586c(lVar.mo9473b());
                C2553u j = C2421az.this.f8386r.mo9602j(lVar.mo9475c());
                jSONObject.put("class_idx", c.mo9467f());
                jSONObject.put("student_idx", j.mo9724f());
                jSONObject.put("instructor_idx", C2557y.f9811B.mo9548c());
                jSONObject.put("patient", lVar.mo9483g());
                jSONObject.put("rescuer", lVar.mo9487i());
                jSONObject.put("pass", lVar.mo9477d());
                jSONObject.put("time", lVar.mo9479e());
                jSONObject.put("manikin_type", lVar.mo9481f());
                jSONObject.put("cpr_standard", lVar.mo9485h());
                jSONObject.put("is_test", lVar.mo9489j());
                switch (lVar.mo9489j()) {
                    case 0:
                        C2550r q = C2421az.this.f8386r.mo9612q(lVar.mo9470a());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("overall", m13423a(q.mo9640c() * 100.0d, 1));
                        jSONObject2.put("comp", m13423a(q.mo9642d() * 100.0d, 1));
                        jSONObject2.put("breath", m13423a(q.getBreath() * 100.0d, 1));
                        jSONObject2.put("fraction", m13423a(q.mo9646f() * 100.0d, 1));
                        jSONObject2.put("comp_depth", m13423a(q.mo9648g() * 100.0d, 1));
                        jSONObject2.put("comp_rate", m13423a(q.mo9650h() * 100.0d, 1));
                        jSONObject2.put("comp_recoil", m13423a(q.mo9652i() * 100.0d, 1));
                        jSONObject2.put("comp_position", m13423a(q.mo9654j() * 100.0d, 1));
                        jSONObject2.put("breath_volume", m13423a(q.mo9656k() * 100.0d, 1));
                        jSONObject2.put("breath_rate", m13423a(q.mo9657l() * 100.0d, 1));
                        jSONObject.put("score", jSONObject2);
                        ArrayList<C2541i> r = C2421az.this.f8386r.mo9613r(lVar.mo9470a());
                        ArrayList<C2542j> s = C2421az.this.f8386r.mo9614s(lVar.mo9470a());
                        JSONArray jSONArray = new JSONArray();
                        new JSONObject();
                        new JSONArray();
                        new JSONObject();
                        if (r != null) {
                            int i = 0;
                            int i2 = 0;
                            while (i2 < r.size()) {
                                C2541i iVar = r.get(i2);
                                JSONObject jSONObject3 = new JSONObject();
                                JSONArray jSONArray2 = new JSONArray();
                                jSONObject3.put("cycle_num", iVar.mo9411c());
                                jSONObject3.put("comp_num", iVar.mo9413d());
                                jSONObject3.put("comp_correct_num", iVar.mo9415e());
                                jSONObject3.put("comp_time", iVar.mo9417f());
                                jSONObject3.put("breath_num", iVar.mo9419g());
                                jSONObject3.put("breath_correct_num", iVar.mo9421h());
                                jSONObject3.put("hands_off_time", iVar.mo9423i());
                                jSONObject3.put("pos1", iVar.mo9425j());
                                jSONObject3.put("pos2", iVar.mo9427k());
                                jSONObject3.put("pos3", iVar.mo9429l());
                                jSONObject3.put("pos4", iVar.mo9431m());
                                jSONObject3.put("pos5", iVar.mo9432n());
                                int i3 = i;
                                for (int i4 = 0; i4 < iVar.mo9413d() + iVar.mo9419g(); i4++) {
                                    C2542j jVar = s.get(i3);
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("event_num", jVar.mo9439c());
                                    jSONObject4.put("event_time", jVar.mo9441d());
                                    jSONObject4.put("cycle_num", jVar.mo9443e());
                                    jSONObject4.put("stroke_num", jVar.mo9445f());
                                    jSONObject4.put("depth", jVar.mo9447g());
                                    jSONObject4.put("recoil", jVar.mo9449h());
                                    jSONObject4.put("volume", jVar.mo9451i());
                                    jSONObject4.put("rate", jVar.mo9453j());
                                    jSONObject4.put("is_comp", jVar.mo9454k());
                                    jSONArray2.put(jSONObject4);
                                    i3++;
                                }
                                jSONObject3.put("cpr_event", jSONArray2);
                                jSONArray.put(jSONObject3);
                                i2++;
                                i = i3;
                            }
                        }
                        jSONObject.put("cpr_cycle", jSONArray);
                        break;
                    case 1:
                        switch (lVar.mo9483g()) {
                            case 1:
                            case 2:
                                C2550r q2 = C2421az.this.f8386r.mo9612q(lVar.mo9470a());
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("overall", m13423a(q2.mo9640c() * 100.0d, 1));
                                jSONObject5.put("comp", m13423a(q2.mo9642d() * 100.0d, 1));
                                jSONObject5.put("breath", m13423a(q2.getBreath() * 100.0d, 1));
                                jSONObject5.put("fraction", m13423a(q2.mo9646f() * 100.0d, 1));
                                jSONObject5.put("comp_depth", m13423a(q2.mo9648g() * 100.0d, 1));
                                jSONObject5.put("comp_rate", m13423a(q2.mo9650h() * 100.0d, 1));
                                jSONObject5.put("comp_recoil", m13423a(q2.mo9652i() * 100.0d, 1));
                                jSONObject5.put("comp_position", m13423a(q2.mo9654j() * 100.0d, 1));
                                jSONObject5.put("breath_volume", m13423a(q2.mo9656k() * 100.0d, 1));
                                jSONObject5.put("breath_rate", m13423a(q2.mo9657l() * 100.0d, 1));
                                jSONObject.put("score", jSONObject5);
                                ArrayList<C2541i> r2 = C2421az.this.f8386r.mo9613r(lVar.mo9470a());
                                ArrayList<C2542j> s2 = C2421az.this.f8386r.mo9614s(lVar.mo9470a());
                                JSONArray jSONArray3 = new JSONArray();
                                new JSONObject();
                                new JSONArray();
                                new JSONObject();
                                if (r2 != null) {
                                    int i5 = 0;
                                    int i6 = 0;
                                    while (i6 < r2.size()) {
                                        C2541i iVar2 = r2.get(i6);
                                        JSONObject jSONObject6 = new JSONObject();
                                        JSONArray jSONArray4 = new JSONArray();
                                        jSONObject6.put("cycle_num", iVar2.mo9411c());
                                        jSONObject6.put("comp_num", iVar2.mo9413d());
                                        jSONObject6.put("comp_correct_num", iVar2.mo9415e());
                                        jSONObject6.put("comp_time", iVar2.mo9417f());
                                        jSONObject6.put("breath_num", iVar2.mo9419g());
                                        jSONObject6.put("breath_correct_num", iVar2.mo9421h());
                                        jSONObject6.put("hands_off_time", iVar2.mo9423i());
                                        jSONObject6.put("pos1", iVar2.mo9425j());
                                        jSONObject6.put("pos2", iVar2.mo9427k());
                                        jSONObject6.put("pos3", iVar2.mo9429l());
                                        jSONObject6.put("pos4", iVar2.mo9431m());
                                        jSONObject6.put("pos5", iVar2.mo9432n());
                                        int i7 = i5;
                                        for (int i8 = 0; i8 < iVar2.mo9413d() + iVar2.mo9419g(); i8++) {
                                            C2542j jVar2 = s2.get(i7);
                                            JSONObject jSONObject7 = new JSONObject();
                                            jSONObject7.put("event_num", jVar2.mo9439c());
                                            jSONObject7.put("event_time", jVar2.mo9441d());
                                            jSONObject7.put("cycle_num", jVar2.mo9443e());
                                            jSONObject7.put("stroke_num", jVar2.mo9445f());
                                            jSONObject7.put("depth", jVar2.mo9447g());
                                            jSONObject7.put("recoil", jVar2.mo9449h());
                                            jSONObject7.put("volume", jVar2.mo9451i());
                                            jSONObject7.put("rate", jVar2.mo9453j());
                                            jSONObject7.put("is_comp", jVar2.mo9454k());
                                            jSONArray4.put(jSONObject7);
                                            i7++;
                                        }
                                        jSONObject6.put("cpr_event", jSONArray4);
                                        jSONArray3.put(jSONObject6);
                                        i6++;
                                        i5 = i7;
                                    }
                                }
                                jSONObject.put("cpr_cycle", jSONArray3);
                                C2538f t = C2421az.this.f8386r.mo9615t(lVar.mo9470a());
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("precpr_1", t.mo9348c());
                                jSONObject8.put("precpr_2", t.mo9350d());
                                jSONObject8.put("precpr_3", t.mo9352e());
                                jSONObject8.put("precpr_4", t.mo9354f());
                                jSONObject8.put("precpr_5", t.mo9356g());
                                jSONObject8.put("cpr1", t.mo9358h());
                                jSONObject8.put("cpr2", t.mo9360i());
                                jSONObject8.put("cpr3", t.mo9362j());
                                jSONObject8.put("cpr4", t.mo9364k());
                                jSONObject8.put("cpr5", t.mo9366l());
                                jSONObject8.put("cpr6", t.mo9368m());
                                jSONObject8.put("aed1", t.mo9370n());
                                jSONObject8.put("aed2", t.mo9372o());
                                jSONObject8.put("aed3", t.mo9374p());
                                jSONObject8.put("aed4", t.mo9376q());
                                jSONObject8.put("aed5", t.mo9378r());
                                jSONObject8.put("aed6", t.mo9380s());
                                jSONObject8.put("cont_cpr", t.mo9382t());
                                jSONObject.put("adult_sheet", jSONObject8);
                                break;
                            case 3:
                                C2545m u = C2421az.this.f8386r.mo9616u(lVar.mo9470a());
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("precpr_1", u.mo9501c());
                                jSONObject9.put("precpr_2", u.mo9504d());
                                jSONObject9.put("precpr_3", u.mo9507e());
                                jSONObject9.put("precpr_4", u.mo9510f());
                                jSONObject9.put("precpr_5", u.mo9513g());
                                jSONObject9.put("cycle1_breath", u.mo9518i());
                                jSONObject9.put("cycle1_comp", u.mo9516h());
                                jSONObject9.put("cycle2_breath", u.mo9522k());
                                jSONObject9.put("cycle2_comp", u.mo9520j());
                                jSONObject9.put("cycle2_hot", u.mo9524l());
                                jSONObject9.put("cycle3_breath", u.mo9528n());
                                jSONObject9.put("cycle3_comp", u.mo9526m());
                                jSONObject.put("infant_sheet", jSONObject9);
                                break;
                        }
                }
                arrayList.add(new BasicNameValuePair("version", "1"));
                arrayList.add(new BasicNameValuePair("overall", jSONObject.toString()));
            } catch (JSONException e) {
                e.printStackTrace();
                this.f8398h = e.toString();
            } catch (Exception e2) {
                this.f8398h = e2.toString();
            }
            Log.e("Data Json", jSONObject.toString());
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/protocols/".startsWith("http://") ? new DefaultHttpClient() : C2421az.m13410d();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/protocols/dataOverallProcess");
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList, C2010c.f6851a));
                return EntityUtils.toString(defaultHttpClient.execute(httpPost).getEntity());
            } catch (ClientProtocolException e3) {
                e3.printStackTrace();
                this.f8398h = e3.toString();
            } catch (Exception e4) {
                e4.printStackTrace();
                this.f8398h = e4.toString();
            }
            return null;
        }

        /* renamed from: a */
        public String mo8924a() {
            switch (this.f8396b) {
                case 0:
                    try {
                        JSONArray jSONArray = new JSONArray(m13425c());
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject.getInt("success") == 1) {
                                ((C2543k) C2421az.this.f8381m.get(i)).mo9463c(jSONObject.getInt("recordid"));
                                ((C2543k) C2421az.this.f8381m.get(i)).mo9465d(1);
                                C2421az.this.f8386r.mo9583b((C2543k) C2421az.this.f8381m.get(i));
                            } else {
                                this.f8398h = jSONObject.getString("error");
                                Log.e("class", this.f8398h + "");
                                Log.e("class", jSONObject.getString("func_error"));
                            }
                        }
                        return null;
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.f8398h = e.toString();
                        return null;
                    }
                case 1:
                    try {
                        String d = m13426d();
                        Log.e("student", d);
                        JSONArray jSONArray2 = new JSONArray(d);
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            if (jSONObject2.getInt("success") == 1) {
                                ((C2553u) C2421az.this.f8382n.get(i2)).mo9716b(jSONObject2.getInt("recordid"));
                                ((C2553u) C2421az.this.f8382n.get(i2)).mo9719c(1);
                                C2421az.this.f8386r.mo9589c((C2553u) C2421az.this.f8382n.get(i2));
                            } else {
                                this.f8398h = jSONObject2.getString("error");
                                Log.e("student", this.f8398h + "");
                                Log.e("student", jSONObject2.getString("func_error"));
                            }
                        }
                        return null;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        this.f8398h = e2.toString();
                        return null;
                    }
                case 2:
                    try {
                        JSONArray jSONArray3 = new JSONArray(m13427e());
                        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                            JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
                            if (jSONObject3.getInt("success") == 1) {
                                ((C2539g) C2421az.this.f8383o.get(i3)).mo9396d(1);
                                C2421az.this.f8386r.mo9582b((C2539g) C2421az.this.f8383o.get(i3));
                            } else {
                                this.f8398h = jSONObject3.getString("error");
                                Log.e("assign", this.f8398h + "");
                                Log.e("assign", jSONObject3.getString("func_error"));
                            }
                        }
                        return null;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        this.f8398h = e3.toString();
                        return null;
                    }
                case 3:
                    try {
                        JSONObject jSONObject4 = new JSONObject(m13428f());
                        if (jSONObject4.getInt("success") == 1) {
                            ((C2544l) C2421az.this.f8384p.get(this.f8397g)).mo9492k(1);
                            C2421az.this.f8386r.mo9584b((C2544l) C2421az.this.f8384p.get(this.f8397g));
                            return null;
                        }
                        this.f8398h = jSONObject4.getString("error");
                        Log.e("data", this.f8398h + "");
                        Log.e("data", jSONObject4.getString("func_error"));
                        return null;
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                        this.f8398h = e4.toString();
                        return null;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        this.f8398h = e5.toString();
                        return null;
                    }
                default:
                    return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            return mo8924a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            Log.e("SendNum", this.f8396b + "curNum " + C2421az.this.f8380l);
            C2421az.m13412f(C2421az.this);
            if (this.f8398h != null) {
                C2557y.f9812C = this.f8398h;
                C2421az.this.f8373e.mo8602a(C2423a.FAIL);
                C2421az.this.mo8917b();
            } else if (C2421az.this.f8380l == 0) {
                C2421az.this.f8373e.mo8602a(C2423a.SUCCESS);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: a */
    public static C2421az m13404a(String str) {
        C2421az azVar = new C2421az();
        Bundle bundle = new Bundle();
        bundle.putString(f8369a, str);
        azVar.setArguments(bundle);
        return azVar;
    }

    /* renamed from: d */
    static /* synthetic */ int m13409d(C2421az azVar) {
        int i = azVar.f8377i;
        azVar.f8377i = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static HttpClient m13410d() {
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

    /* renamed from: f */
    static /* synthetic */ int m13412f(C2421az azVar) {
        int i = azVar.f8380l;
        azVar.f8380l = i - 1;
        return i;
    }

    /* renamed from: a */
    public void mo8915a() {
        this.f8375g.setText(C2557y.f9835g.f10206b);
    }

    /* renamed from: a */
    public void mo8916a(ArrayList<C2543k> arrayList, ArrayList<C2553u> arrayList2, ArrayList<C2539g> arrayList3, ArrayList<C2544l> arrayList4) {
        this.f8379k = new ArrayList<>();
        this.f8381m = arrayList;
        this.f8382n = arrayList2;
        this.f8383o = arrayList3;
        this.f8384p = arrayList4;
        if (arrayList != null) {
            this.f8380l++;
        }
        if (arrayList2 != null) {
            this.f8380l++;
        }
        if (arrayList3 != null) {
            this.f8380l++;
        }
        if (arrayList4 != null) {
            this.f8380l += arrayList4.size();
        }
        if (arrayList != null) {
            C2425c cVar = new C2425c(0, 0);
            cVar.execute(new Void[0]);
            this.f8379k.add(cVar);
        }
        if (arrayList2 != null) {
            C2425c cVar2 = new C2425c(0, 1);
            cVar2.execute(new Void[0]);
            this.f8379k.add(cVar2);
        }
        if (arrayList3 != null) {
            C2425c cVar3 = new C2425c(0, 2);
            cVar3.execute(new Void[0]);
            this.f8379k.add(cVar3);
        }
        Log.e("json data", "Send 0 / " + this.f8380l);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                Log.e("json data", "Send " + i + " / " + this.f8380l);
                C2425c cVar4 = new C2425c(i, 3);
                cVar4.execute(new Void[0]);
                this.f8379k.add(cVar4);
            }
        }
        if (this.f8380l == 0) {
            this.f8373e.mo8602a(C2423a.SUCCESS);
        }
    }

    /* renamed from: b */
    public void mo8917b() {
        if (this.f8379k != null) {
            Iterator<C2425c> it = this.f8379k.iterator();
            while (it.hasNext()) {
                it.next().cancel(false);
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2424b) {
            this.f8373e = (C2424b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8370b = getArguments().getString(f8369a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8386r = new C2548p(getActivity());
        this.f8372d = layoutInflater.inflate(C2656R.layout.senddata, viewGroup, false);
        this.f8374f = (ScalableLayout) this.f8372d.findViewById(C2656R.C2657id.senddata_sc);
        this.f8375g = (TextView) this.f8372d.findViewById(C2656R.C2657id.senddata_processing_txt);
        this.f8376h[0] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c1);
        this.f8376h[1] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c2);
        this.f8376h[2] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c3);
        this.f8376h[3] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c4);
        this.f8376h[4] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c5);
        this.f8376h[5] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c6);
        this.f8376h[6] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c7);
        this.f8376h[7] = (ImageView) this.f8372d.findViewById(C2656R.C2657id.senddata_c8);
        this.f8375g.setText(C2557y.f9835g.f10206b);
        this.f8377i = 0;
        this.f8378j = true;
        C2557y.f9850v = new C2616u(this.f8385q, 0.2d);
        C2557y.f9850v.mo10021b();
        this.f8374f.setOnClickListener(this);
        this.f8379k = new ArrayList<>();
        return this.f8372d;
    }

    public void onDetach() {
        super.onDetach();
        this.f8373e = null;
    }
}
