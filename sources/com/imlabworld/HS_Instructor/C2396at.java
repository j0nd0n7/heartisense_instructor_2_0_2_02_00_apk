package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.imlabworld.HS_Instructor.C2358aj;
import com.p048a.p049a.p053d.C2010c;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.imlabworld.HS_Instructor.at */
public class C2396at extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupClickListener, ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener, C2358aj.C2361b {

    /* renamed from: a */
    private static final String f8116a = "param";

    /* renamed from: A */
    private int f8117A;

    /* renamed from: B */
    private ArrayList<C2543k> f8118B = null;

    /* renamed from: C */
    private ArrayList<ArrayList<C2554v>> f8119C = null;

    /* renamed from: D */
    private String[] f8120D;

    /* renamed from: E */
    private ArrayAdapter<String> f8121E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C2548p f8122F;

    /* renamed from: G */
    private C2553u[] f8123G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public ArrayList<C2543k> f8124H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public ArrayList<Boolean> f8125I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public ArrayList<C2543k> f8126J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f8127K;

    /* renamed from: L */
    private Hashtable<Integer, C2401e> f8128L;

    /* renamed from: M */
    private ArrayList<ArrayList<Boolean>> f8129M = null;

    /* renamed from: N */
    private int f8130N;

    /* renamed from: O */
    private int f8131O;

    /* renamed from: b */
    private String f8132b;

    /* renamed from: c */
    private ScalableLayout f8133c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2338ae[] f8134d;

    /* renamed from: e */
    private final TextView[] f8135e = new TextView[6];

    /* renamed from: f */
    private final ScalableLayout[] f8136f = new ScalableLayout[6];

    /* renamed from: g */
    private final TextView[] f8137g = new TextView[6];

    /* renamed from: h */
    private final TextView[] f8138h = new TextView[6];

    /* renamed from: i */
    private TextView f8139i;

    /* renamed from: j */
    private EditText f8140j;

    /* renamed from: k */
    private EditText f8141k;

    /* renamed from: l */
    private Spinner f8142l;

    /* renamed from: m */
    private TextView f8143m;

    /* renamed from: n */
    private ImageView f8144n;

    /* renamed from: o */
    private TextView f8145o;

    /* renamed from: p */
    private TextView f8146p;

    /* renamed from: q */
    private View f8147q;

    /* renamed from: r */
    private C2400d f8148r;

    /* renamed from: s */
    private ExpandableListView f8149s;

    /* renamed from: t */
    private C2358aj f8150t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ScalableLayout f8151u;

    /* renamed from: v */
    private TextView f8152v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ListView f8153w;

    /* renamed from: x */
    private TextView f8154x;

    /* renamed from: y */
    private TextView f8155y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2363ak f8156z;

    /* renamed from: com.imlabworld.HS_Instructor.at$a */
    public enum C2397a {
        COMPLETE
    }

    /* renamed from: com.imlabworld.HS_Instructor.at$b */
    private class C2398b extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        final String f8159a = "GetClassSendPost !!";

        /* renamed from: b */
        String f8160b;

        C2398b() {
        }

        /* renamed from: b */
        private String m13334b() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("instructor_idx", C2557y.f9811B.mo9548c() + ""));
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/groupCommunication/".startsWith("http://") ? new DefaultHttpClient() : C2396at.m13322c();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/groupCommunication/get_group_list");
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
        public String mo8830a() {
            ArrayList unused = C2396at.this.f8124H = new ArrayList();
            ArrayList unused2 = C2396at.this.f8125I = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(m13334b());
                if (jSONObject.getInt("success") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray("result");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string = jSONObject2.getString("class_name");
                        String string2 = jSONObject2.getString("class_date");
                        Timestamp valueOf = !string2.equals("null") ? Timestamp.valueOf(string2) : new Timestamp(System.currentTimeMillis());
                        String string3 = jSONObject2.getString("edit_time");
                        C2396at.this.f8124H.add(new C2543k(string, valueOf, !string3.equals("null") ? Timestamp.valueOf(string3) : new Timestamp(System.currentTimeMillis()), jSONObject2.getString("is_org").equals("1") ? 1 : 0, jSONObject2.getInt("class_idx"), 1));
                        C2396at.this.f8125I.add(false);
                    }
                    return null;
                }
                this.f8160b = jSONObject.getString("error");
                return null;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            return mo8830a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f8160b != null) {
                C2557y.f9812C = this.f8160b;
                boolean unused = C2396at.this.f8127K = false;
                return;
            }
            boolean unused2 = C2396at.this.f8127K = true;
            C2363ak unused3 = C2396at.this.f8156z = new C2363ak(C2396at.this.getActivity(), C2396at.this.f8124H);
            C2396at.this.f8153w.setAdapter(C2396at.this.f8156z);
            C2396at.this.f8151u.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.at$c */
    private class C2399c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        final String f8162a = "GetStudentSendPost !!";

        /* renamed from: b */
        String f8163b;

        C2399c() {
        }

        /* renamed from: b */
        private String m13338b() {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            ArrayList unused = C2396at.this.f8126J = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= C2396at.this.f8125I.size()) {
                    break;
                }
                if (((Boolean) C2396at.this.f8125I.get(i2)).booleanValue()) {
                    jSONArray.put(((C2543k) C2396at.this.f8124H.get(i2)).mo9467f());
                    C2396at.this.f8126J.add(C2396at.this.f8124H.get(i2));
                }
                i = i2 + 1;
            }
            arrayList.add(new BasicNameValuePair("class_list", jSONArray.toString()));
            Log.e("json data", jSONArray.toString());
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/groupCommunication/".startsWith("http://") ? new DefaultHttpClient() : C2396at.m13322c();
            HttpParams params = defaultHttpClient.getParams();
            HttpConnectionParams.setConnectionTimeout(params, 10000);
            HttpConnectionParams.setSoTimeout(params, 10000);
            HttpPost httpPost = new HttpPost("https://www.heartisense.com/LMS/groupCommunication/import_group");
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

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2543k mo8836a(int i) {
            Iterator it = C2396at.this.f8126J.iterator();
            while (it.hasNext()) {
                C2543k kVar = (C2543k) it.next();
                if (kVar.mo9467f() == i) {
                    return kVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public String mo8837a() {
            int a;
            int b;
            String b2 = m13338b();
            Log.d("studentlist", b2);
            try {
                JSONArray jSONArray = new JSONArray(b2);
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= jSONArray.length()) {
                        return null;
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    int i3 = jSONObject.getInt("class_idx");
                    C2543k d = C2396at.this.f8122F.mo9590d(i3);
                    C2543k a2 = mo8836a(i3);
                    if (d == null) {
                        a = C2396at.this.f8122F.mo9567a(a2);
                    } else {
                        C2396at.this.f8122F.mo9583b(a2);
                        a = d.mo9455a();
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray("students");
                    for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i4);
                        String string = jSONObject2.getString("name");
                        String string2 = jSONObject2.getString("email");
                        String string3 = jSONObject2.getString("phone");
                        String string4 = jSONObject2.getString("edit_time");
                        Timestamp timestamp = string4.equals("null") ? new Timestamp(System.currentTimeMillis()) : Timestamp.valueOf(string4);
                        int i5 = jSONObject2.getInt("id");
                        C2553u uVar = new C2553u(string, string2, string3, timestamp, i5, 1);
                        C2553u k = C2396at.this.f8122F.mo9603k(i5);
                        if (k == null) {
                            b = C2396at.this.f8122F.mo9577b(uVar);
                        } else {
                            C2396at.this.f8122F.mo9592d(uVar);
                            b = k.mo9715b();
                        }
                        if (!C2396at.this.f8122F.mo9593d(a, b)) {
                            C2396at.this.f8122F.mo9564a(new C2539g(a, b));
                        }
                    }
                    i = i2 + 1;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            return mo8837a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f8163b != null) {
                C2557y.f9812C = this.f8163b;
                boolean unused = C2396at.this.f8127K = false;
            } else {
                boolean unused2 = C2396at.this.f8127K = true;
            }
            C2396at.this.mo8816a(C2396at.this.f8134d);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.at$d */
    public interface C2400d {
        /* renamed from: a */
        void mo8600a(C2397a aVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.at$e */
    class C2401e {

        /* renamed from: a */
        final int f8165a;

        /* renamed from: b */
        final int f8166b;

        public C2401e(int i, int i2) {
            this.f8165a = i;
            this.f8166b = i2;
        }
    }

    /* renamed from: a */
    public static C2396at m13309a(String str) {
        C2396at atVar = new C2396at();
        Bundle bundle = new Bundle();
        bundle.putString(f8116a, str);
        atVar.setArguments(bundle);
        return atVar;
    }

    /* renamed from: a */
    private void m13312a(int i) {
        this.f8136f[i].setBackgroundResource(C2656R.drawable.img_detail_slot_selected);
        this.f8138h[i].setText(this.f8123G[i].mo9718c());
    }

    /* renamed from: a */
    private void m13313a(C2553u uVar) {
        this.f8122F.mo9564a(new C2539g(this.f8118B.get(this.f8117A).mo9455a(), this.f8122F.mo9571a(uVar)));
        mo8816a(this.f8134d);
    }

    /* renamed from: b */
    private void m13318b(int i) {
        this.f8136f[i].setBackgroundResource(C2656R.drawable.img_detail_slot_unselected);
        this.f8138h[i].setText(C2557y.f9835g.f10521gx);
    }

    /* renamed from: b */
    private void m13319b(int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= 6) {
                return;
            }
            if (!this.f8134d[i4].f7851a.f9568a || this.f8123G[i4] != null) {
                i3 = i4 + 1;
            } else {
                this.f8123G[i4] = ((C2554v) this.f8119C.get(i).get(i2)).mo9727a();
                m13312a(i4);
                this.f8128L.put(Integer.valueOf(i4), new C2401e(this.f8118B.get(i).mo9455a(), this.f8123G[i4].mo9715b()));
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static HttpClient m13322c() {
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

    /* renamed from: c */
    private void m13323c(int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < 6) {
                if (this.f8134d[i4].f7851a.f9568a && this.f8128L.containsKey(Integer.valueOf(i4))) {
                    C2401e eVar = this.f8128L.get(Integer.valueOf(i4));
                    if (eVar.f8165a == this.f8118B.get(i).mo9455a() && eVar.f8166b == ((C2554v) this.f8119C.get(i).get(i2)).mo9731b()) {
                        this.f8123G[i4] = null;
                        m13318b(i4);
                        this.f8128L.remove(Integer.valueOf(i4));
                        return;
                    }
                }
                i3 = i4 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo8814a() {
        this.f8139i.setText(C2557y.f9835g.f10584w);
        this.f8140j.setHint(C2557y.f9835g.f10587z);
        this.f8141k.setHint(C2557y.f9835g.f10127A + "(" + C2557y.f9835g.f10129C + ")");
        this.f8145o.setText(C2557y.f9835g.f10474gC);
        this.f8146p.setText(C2557y.f9835g.f10204ay);
        this.f8152v.setText("LMS");
        this.f8154x.setText(C2557y.f9835g.f10474gC);
        this.f8155y.setText(C2557y.f9835g.f10210bD);
        for (int i = 0; i < 6; i++) {
            this.f8135e[i].setText(C2557y.f9835g.f10357ds);
        }
    }

    /* renamed from: a */
    public void mo8746a(int i, int i2) {
        Log.e("Delete Click!!", i + " " + i2);
        this.f8122F.mo9601i(((C2554v) this.f8119C.get(i).get(i2)).mo9731b());
        mo8816a(this.f8134d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8815a(int i, int i2, int i3) {
        if (!this.f8128L.containsKey(Integer.valueOf(i))) {
            this.f8128L.put(Integer.valueOf(i), new C2401e(i2, i3));
        }
    }

    /* renamed from: a */
    public void mo8816a(C2338ae[] aeVarArr) {
        this.f8118B = this.f8122F.mo9572a();
        this.f8119C = new ArrayList<>();
        this.f8129M = new ArrayList<>();
        this.f8130N = 0;
        this.f8120D = new String[this.f8118B.size()];
        int i = 0;
        Iterator<C2543k> it = this.f8118B.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                break;
            }
            C2543k next = it.next();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<C2539g> e = this.f8122F.mo9594e(next.mo9455a());
            if (e != null) {
                Iterator<C2539g> it2 = e.iterator();
                while (it2.hasNext()) {
                    C2553u j = this.f8122F.mo9602j(it2.next().mo9393c());
                    ArrayList<C2544l> m = this.f8122F.mo9605m(j.mo9715b());
                    int i3 = m != null ? m.get(m.size() - 1).mo9487i() : -1;
                    ArrayList<C2544l> a = this.f8122F.mo9573a(j.mo9715b(), 1, 0);
                    int i4 = (a == null || a.size() <= 0) ? 0 : 1;
                    ArrayList<C2544l> a2 = this.f8122F.mo9573a(j.mo9715b(), 2, 0);
                    int i5 = (a2 == null || a2.size() <= 0) ? 0 : 1;
                    ArrayList<C2544l> a3 = this.f8122F.mo9573a(j.mo9715b(), 3, 0);
                    int i6 = (a3 == null || a3.size() <= 0) ? 0 : 1;
                    ArrayList<C2544l> a4 = this.f8122F.mo9573a(j.mo9715b(), 1, 1);
                    int i7 = (a4 == null || a4.size() <= 0) ? 0 : 1;
                    ArrayList<C2544l> a5 = this.f8122F.mo9573a(j.mo9715b(), 2, 1);
                    int i8 = (a5 == null || a5.size() <= 0) ? 0 : 1;
                    ArrayList<C2544l> a6 = this.f8122F.mo9573a(j.mo9715b(), 3, 1);
                    arrayList.add(new C2554v(j.mo9715b(), j.mo9718c(), j.mo9722d(), j.mo9723e(), j.mo9726h(), j.mo9724f(), j.mo9725g(), i3, i4, i5, i6, i7, i8, (a6 == null || a6.size() <= 0) ? 0 : 1));
                    arrayList2.add(false);
                }
            }
            this.f8120D[i2] = next.mo9459b();
            this.f8119C.add(arrayList);
            this.f8129M.add(arrayList2);
            i = i2 + 1;
        }
        this.f8150t = new C2358aj(getActivity(), this.f8118B, this.f8119C, this);
        this.f8149s.setAdapter(this.f8150t);
        for (int i9 = 0; i9 < this.f8118B.size(); i9++) {
            this.f8149s.expandGroup(i9);
        }
        this.f8121E = new ArrayAdapter<>(getActivity(), 17367049, this.f8120D);
        this.f8142l.setAdapter(this.f8121E);
        this.f8142l.setOnItemSelectedListener(this);
        mo8817b(aeVarArr);
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 < 6) {
                if (this.f8123G[i11] != null) {
                    m13312a(i11);
                    C2401e eVar = this.f8128L.get(Integer.valueOf(i11));
                    int i12 = 0;
                    Iterator<C2543k> it3 = this.f8118B.iterator();
                    while (true) {
                        int i13 = i12;
                        if (!it3.hasNext()) {
                            break;
                        } else if (it3.next().mo9455a() == eVar.f8165a) {
                            int i14 = 0;
                            Iterator it4 = this.f8119C.get(i13).iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                } else if (((C2554v) it4.next()).mo9731b() == eVar.f8166b) {
                                    this.f8129M.get(i13).set(i14, true);
                                    this.f8150t.mo8734a(i13, i14, true);
                                    this.f8130N++;
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            i12 = i13 + 1;
                        }
                    }
                } else {
                    m13318b(i11);
                }
                i10 = i11 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo8817b(C2338ae[] aeVarArr) {
        this.f8134d = aeVarArr;
        this.f8131O = 0;
        for (int i = 0; i < 6; i++) {
            if (C2557y.f9854z[i] != null) {
                this.f8123G[i] = C2557y.f9854z[i].clone();
            } else {
                this.f8123G[i] = null;
            }
            if (aeVarArr[i].f7851a.f9568a) {
                this.f8136f[i].setVisibility(0);
                this.f8131O++;
            } else {
                this.f8136f[i].setVisibility(4);
                if (this.f8128L.containsKey(Integer.valueOf(i))) {
                    C2401e eVar = this.f8128L.get(Integer.valueOf(i));
                    Iterator<C2543k> it = this.f8118B.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().mo9455a() == eVar.f8165a) {
                            Iterator it2 = this.f8119C.get(i2).iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                } else if (((C2554v) it2.next()).mo9731b() == eVar.f8166b) {
                                    this.f8129M.get(i2).set(i3, false);
                                    this.f8150t.mo8734a(i2, i3, false);
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                    this.f8128L.remove(Integer.valueOf(i));
                }
            }
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2400d) {
            this.f8148r = (C2400d) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        if (((Boolean) this.f8129M.get(i).get(i2)).booleanValue()) {
            this.f8129M.get(i).set(i2, false);
            this.f8130N--;
            this.f8150t.mo8734a(i, i2, false);
            m13323c(i, i2);
        } else if (this.f8130N < this.f8131O) {
            this.f8129M.get(i).set(i2, true);
            this.f8130N++;
            this.f8150t.mo8734a(i, i2, true);
            m13319b(i, i2);
        }
        return false;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.assign_complete_btn /*2131230753*/:
                for (int i = 0; i < 6; i++) {
                    if (this.f8123G[i] != null) {
                        C2557y.f9854z[i] = this.f8123G[i].clone();
                    } else {
                        C2557y.f9854z[i] = null;
                    }
                }
                this.f8148r.mo8600a(C2397a.COMPLETE);
                return;
            case C2656R.C2657id.assign_import_btn /*2131230757*/:
                if (C2557y.f9811B.mo9548c() != -1) {
                    new C2398b().execute(new Void[0]);
                    return;
                }
                return;
            case C2656R.C2657id.assign_import_cancel_btn /*2131230758*/:
                this.f8151u.setVisibility(4);
                return;
            case C2656R.C2657id.assign_import_import_btn /*2131230760*/:
                if (C2557y.f9811B.mo9548c() != -1) {
                    new C2399c().execute(new Void[0]);
                }
                this.f8151u.setVisibility(4);
                return;
            case C2656R.C2657id.assign_register_btn /*2131230764*/:
                String obj = this.f8140j.getText().toString();
                String obj2 = this.f8141k.getText().toString();
                if (obj == null || obj.replaceAll("\\s", "").equals("")) {
                    Toast.makeText(getActivity(), C2557y.f9835g.f10173aT, 0).show();
                } else if (obj2 == null || obj2.replaceAll("\\s", "").equals("")) {
                    m13313a(new C2553u(obj, ""));
                    this.f8140j.setText("");
                    this.f8141k.setText("");
                } else if (!Pattern.compile("[a-zA-Z0-9_\\.-]+@{1}+[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_]+)+").matcher(obj2).matches()) {
                    Toast.makeText(getActivity(), C2557y.f9835g.f10158aE, 0).show();
                } else {
                    m13313a(new C2553u(obj, obj2));
                    this.f8140j.setText("");
                    this.f8141k.setText("");
                }
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8132b = getArguments().getString(f8116a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8122F = new C2548p(getActivity());
        this.f8147q = layoutInflater.inflate(C2656R.layout.assign, viewGroup, false);
        this.f8133c = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_sc);
        this.f8135e[0] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot1_default_txt);
        this.f8135e[1] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot2_default_txt);
        this.f8135e[2] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot3_default_txt);
        this.f8135e[3] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot4_default_txt);
        this.f8135e[4] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot5_default_txt);
        this.f8135e[5] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot6_default_txt);
        this.f8136f[0] = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_slot1_sc);
        this.f8136f[1] = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_slot2_sc);
        this.f8136f[2] = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_slot3_sc);
        this.f8136f[3] = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_slot4_sc);
        this.f8136f[4] = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_slot5_sc);
        this.f8136f[5] = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_slot6_sc);
        this.f8137g[0] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot1_group_txt);
        this.f8137g[1] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot2_group_txt);
        this.f8137g[2] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot3_group_txt);
        this.f8137g[3] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot4_group_txt);
        this.f8137g[4] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot5_group_txt);
        this.f8137g[5] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot6_group_txt);
        this.f8138h[0] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot1_student_txt);
        this.f8138h[1] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot2_student_txt);
        this.f8138h[2] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot3_student_txt);
        this.f8138h[3] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot4_student_txt);
        this.f8138h[4] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot5_student_txt);
        this.f8138h[5] = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_slot6_student_txt);
        this.f8139i = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_register_title);
        this.f8140j = (EditText) this.f8147q.findViewById(C2656R.C2657id.assign_register_name_txt);
        this.f8141k = (EditText) this.f8147q.findViewById(C2656R.C2657id.assign_register_email_txt);
        this.f8142l = (Spinner) this.f8147q.findViewById(C2656R.C2657id.assign_register_group_btn);
        this.f8143m = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_register_group_txt);
        this.f8144n = (ImageView) this.f8147q.findViewById(C2656R.C2657id.assign_register_btn);
        this.f8145o = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_import_btn);
        this.f8146p = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_complete_btn);
        this.f8139i.setText(C2557y.f9835g.f10584w);
        this.f8140j.setHint(C2557y.f9835g.f10587z);
        this.f8141k.setHint(C2557y.f9835g.f10127A + "(" + C2557y.f9835g.f10129C + ")");
        this.f8145o.setText(C2557y.f9835g.f10474gC);
        this.f8146p.setText(C2557y.f9835g.f10204ay);
        for (int i = 0; i < 6; i++) {
            this.f8135e[i].setText(C2557y.f9835g.f10357ds);
        }
        this.f8144n.setOnClickListener(this);
        this.f8145o.setOnClickListener(this);
        this.f8146p.setOnClickListener(this);
        for (int i2 = 0; i2 < 6; i2++) {
            this.f8136f[i2].setOnClickListener(this);
        }
        this.f8149s = (ExpandableListView) this.f8147q.findViewById(C2656R.C2657id.assign_listview);
        this.f8149s.setOnGroupClickListener(this);
        this.f8149s.setOnChildClickListener(this);
        this.f8149s.setOnGroupCollapseListener(this);
        this.f8149s.setOnGroupExpandListener(this);
        this.f8151u = (ScalableLayout) this.f8147q.findViewById(C2656R.C2657id.assign_import_data_sc);
        this.f8152v = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_import_server_btn);
        this.f8153w = (ListView) this.f8147q.findViewById(C2656R.C2657id.assign_import_listview);
        this.f8154x = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_import_import_btn);
        this.f8155y = (TextView) this.f8147q.findViewById(C2656R.C2657id.assign_import_cancel_btn);
        this.f8153w.setOnItemClickListener(this);
        this.f8152v.setText("LMS");
        this.f8154x.setText(C2557y.f9835g.f10474gC);
        this.f8155y.setText(C2557y.f9835g.f10210bD);
        this.f8152v.setOnClickListener(this);
        this.f8154x.setOnClickListener(this);
        this.f8155y.setOnClickListener(this);
        this.f8151u.setVisibility(4);
        this.f8128L = new Hashtable<>();
        this.f8123G = new C2553u[6];
        return this.f8147q;
    }

    public void onDetach() {
        super.onDetach();
        this.f8148r = null;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        if (Boolean.valueOf(!expandableListView.isGroupExpanded(i)).booleanValue()) {
            expandableListView.expandGroup(i);
        } else {
            expandableListView.collapseGroup(i);
        }
        return true;
    }

    public void onGroupCollapse(int i) {
    }

    public void onGroupExpand(int i) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f8125I.get(i).booleanValue()) {
            this.f8125I.set(i, false);
            this.f8156z.mo8748a(i, false);
            return;
        }
        this.f8125I.set(i, true);
        this.f8156z.mo8748a(i, true);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        switch (adapterView.getId()) {
            case C2656R.C2657id.assign_register_group_btn /*2131230766*/:
                this.f8117A = i;
                this.f8143m.setText(this.f8120D[i]);
                return;
            default:
                return;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
