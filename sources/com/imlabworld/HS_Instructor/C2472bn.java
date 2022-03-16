package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p036v7.widget.LinearLayoutManager;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.imlabworld.HS_Instructor.C2374an;
import com.imlabworld.HS_Instructor.C2379ao;
import com.imlabworld.HS_Instructor.C2382ap;
import com.p048a.p049a.p053d.C2010c;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import com.woxthebox.draglistview.DragItem;
import com.woxthebox.draglistview.DragListView;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

/* renamed from: com.imlabworld.HS_Instructor.bn */
public class C2472bn extends Fragment {

    /* renamed from: a */
    private static final String f8890a = "param";

    /* renamed from: b */
    private final boolean f8891b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2476d f8892c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2338ae[] f8893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2549q f8894e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2548p f8895f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2477e f8896g;

    /* renamed from: com.imlabworld.HS_Instructor.bn$a */
    public enum C2473a {
        SETTING,
        NEXT,
        RESULT
    }

    /* renamed from: com.imlabworld.HS_Instructor.bn$b */
    private class C2474b extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        final String f8901a = "GetClassSendPost !!";

        /* renamed from: b */
        String f8902b;

        C2474b() {
        }

        /* renamed from: b */
        private String m13617b() {
            Log.d("GetClassSendPost !!", "getClass post start");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("instructor_idx", C2557y.f9811B.mo9548c() + ""));
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/groupCommunication/".startsWith("http://") ? new DefaultHttpClient() : C2472bn.m13610e();
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
        public String mo9096a() {
            C2472bn.this.f8896g.f8952as = new ArrayList<>();
            C2472bn.this.f8896g.f8953at = new ArrayList<>();
            String b = m13617b();
            Log.d("classlist", b);
            try {
                JSONObject jSONObject = new JSONObject(b);
                if (jSONObject.getInt("success") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONArray("result");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String string = jSONObject2.getString("class_name");
                        String string2 = jSONObject2.getString("class_date");
                        Timestamp valueOf = !string2.equals("null") ? Timestamp.valueOf(string2) : new Timestamp(System.currentTimeMillis());
                        String string3 = jSONObject2.getString("edit_time");
                        C2472bn.this.f8896g.f8952as.add(new C2543k(string, valueOf, !string3.equals("null") ? Timestamp.valueOf(string3) : new Timestamp(System.currentTimeMillis()), jSONObject2.getString("is_org").equals("1") ? 1 : 0, jSONObject2.getInt("class_idx"), 1));
                        C2472bn.this.f8896g.f8953at.add(false);
                    }
                    return null;
                }
                this.f8902b = jSONObject.getString("error");
                Log.d("classlist", this.f8902b + "");
                return null;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            return mo9096a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f8902b != null) {
                C2557y.f9812C = this.f8902b;
                C2472bn.this.f8896g.f8955av = false;
                return;
            }
            C2472bn.this.f8896g.f8955av = true;
            C2472bn.this.f8896g.f8951ar = new C2363ak(C2472bn.this.getActivity(), C2472bn.this.f8896g.f8952as);
            C2472bn.this.f8896g.f8948ao.setAdapter(C2472bn.this.f8896g.f8951ar);
            C2472bn.this.f8896g.f8946am.setVisibility(0);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.bn$c */
    private class C2475c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        final String f8904a = "GetStudentSendPost !!";

        /* renamed from: b */
        String f8905b;

        C2475c() {
        }

        /* renamed from: b */
        private String m13621b() {
            Log.d("GetStudentSendPost !!", "getStudent post start");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            C2472bn.this.f8896g.f8954au = new ArrayList<>();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= C2472bn.this.f8896g.f8953at.size()) {
                    break;
                }
                if (C2472bn.this.f8896g.f8953at.get(i2).booleanValue()) {
                    jSONArray.put(C2472bn.this.f8896g.f8952as.get(i2).mo9467f());
                    C2472bn.this.f8896g.f8954au.add(C2472bn.this.f8896g.f8952as.get(i2));
                }
                i = i2 + 1;
            }
            arrayList.add(new BasicNameValuePair("class_list", jSONArray.toString()));
            Log.e("json data", jSONArray.toString());
            DefaultHttpClient defaultHttpClient = "https://www.heartisense.com/LMS/groupCommunication/".startsWith("http://") ? new DefaultHttpClient() : C2472bn.m13610e();
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
        public C2543k mo9102a(int i) {
            Iterator<C2543k> it = C2472bn.this.f8896g.f8954au.iterator();
            while (it.hasNext()) {
                C2543k next = it.next();
                if (next.mo9467f() == i) {
                    return next;
                }
            }
            return null;
        }

        /* renamed from: a */
        public String mo9103a() {
            int a;
            int b;
            String b2 = m13621b();
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
                    C2543k d = C2472bn.this.f8895f.mo9590d(i3);
                    C2543k a2 = mo9102a(i3);
                    if (d == null) {
                        a = C2472bn.this.f8895f.mo9567a(a2);
                    } else {
                        C2472bn.this.f8895f.mo9583b(a2);
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
                        C2553u k = C2472bn.this.f8895f.mo9603k(i5);
                        if (k == null) {
                            b = C2472bn.this.f8895f.mo9577b(uVar);
                        } else {
                            C2472bn.this.f8895f.mo9592d(uVar);
                            b = k.mo9715b();
                        }
                        if (!C2472bn.this.f8895f.mo9593d(a, b)) {
                            C2472bn.this.f8895f.mo9564a(new C2539g(a, b));
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
            return mo9103a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f8905b != null) {
                C2557y.f9812C = this.f8905b;
                C2472bn.this.f8896g.f8955av = false;
            } else {
                C2472bn.this.f8896g.f8955av = true;
            }
            C2472bn.this.mo9091b(C2472bn.this.f8893d);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.bn$d */
    public interface C2476d {
        /* renamed from: a */
        void mo8607a(C2473a aVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.bn$e */
    class C2477e implements View.OnClickListener, View.OnKeyListener, AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener, C2374an.C2377a, C2379ao.C2380a, C2382ap.C2386a {

        /* renamed from: A */
        final ScalableLayout f8907A;

        /* renamed from: B */
        final DragListView f8908B;

        /* renamed from: C */
        C2374an f8909C;

        /* renamed from: D */
        final ScalableLayout f8910D;

        /* renamed from: E */
        final EditText f8911E;

        /* renamed from: F */
        final ImageView f8912F;

        /* renamed from: G */
        final ScalableLayout f8913G;

        /* renamed from: H */
        final TextView f8914H;

        /* renamed from: I */
        final TextView f8915I;

        /* renamed from: J */
        final ScalableLayout f8916J;

        /* renamed from: K */
        final DragListView f8917K;

        /* renamed from: L */
        final ScalableLayout f8918L;

        /* renamed from: M */
        final EditText f8919M;

        /* renamed from: N */
        final TextView f8920N;

        /* renamed from: O */
        final ScalableLayout f8921O;

        /* renamed from: P */
        final TextView f8922P;

        /* renamed from: Q */
        final TextView f8923Q;

        /* renamed from: R */
        C2388aq f8924R;

        /* renamed from: S */
        final ScalableLayout f8925S;

        /* renamed from: T */
        final DragListView f8926T;

        /* renamed from: U */
        final ScalableLayout f8927U;

        /* renamed from: V */
        final TextView f8928V;

        /* renamed from: W */
        C2382ap f8929W;

        /* renamed from: X */
        final ScalableLayout f8930X;

        /* renamed from: Y */
        final EditText f8931Y;

        /* renamed from: Z */
        final EditText f8932Z;

        /* renamed from: a */
        final ScalableLayout f8933a;

        /* renamed from: aa */
        final ImageView f8934aa;

        /* renamed from: ab */
        final TextView f8935ab;

        /* renamed from: ac */
        final TextView f8936ac;

        /* renamed from: ad */
        final TextView f8937ad;

        /* renamed from: ae */
        final String[] f8938ae = new String[10];

        /* renamed from: af */
        final ArrayAdapter<String> f8939af;

        /* renamed from: ag */
        final C2462bk f8940ag;

        /* renamed from: ah */
        final FragmentManager f8941ah;

        /* renamed from: ai */
        final FragmentTransaction f8942ai;

        /* renamed from: aj */
        int f8943aj;

        /* renamed from: ak */
        boolean f8944ak;

        /* renamed from: al */
        boolean f8945al;

        /* renamed from: am */
        final ScalableLayout f8946am;

        /* renamed from: an */
        final TextView f8947an;

        /* renamed from: ao */
        final ListView f8948ao;

        /* renamed from: ap */
        final TextView f8949ap;

        /* renamed from: aq */
        final TextView f8950aq;

        /* renamed from: ar */
        C2363ak f8951ar;

        /* renamed from: as */
        ArrayList<C2543k> f8952as;

        /* renamed from: at */
        ArrayList<Boolean> f8953at;

        /* renamed from: au */
        ArrayList<C2543k> f8954au;

        /* renamed from: av */
        boolean f8955av;

        /* renamed from: ax */
        private ArrayList<Pair<Integer, C2543k>> f8957ax;

        /* renamed from: ay */
        private ArrayList<Pair<Integer, C2553u>> f8958ay;

        /* renamed from: b */
        final TextView f8959b;

        /* renamed from: c */
        final TextView f8960c;

        /* renamed from: d */
        final TextView f8961d;

        /* renamed from: e */
        final TextView f8962e;

        /* renamed from: f */
        final TextView f8963f;

        /* renamed from: g */
        final TextView f8964g;

        /* renamed from: h */
        final TextView f8965h;

        /* renamed from: i */
        final Spinner f8966i;

        /* renamed from: j */
        final ImageView f8967j;

        /* renamed from: k */
        final TextView f8968k;

        /* renamed from: l */
        final TextView f8969l;

        /* renamed from: m */
        final TextView f8970m;

        /* renamed from: n */
        final ScalableLayout f8971n;

        /* renamed from: o */
        final ScalableLayout f8972o;

        /* renamed from: p */
        final TextView f8973p;

        /* renamed from: q */
        final TextView f8974q;

        /* renamed from: r */
        final TextView f8975r;

        /* renamed from: s */
        final ScalableLayout f8976s;

        /* renamed from: t */
        final DragListView f8977t;

        /* renamed from: u */
        final ScalableLayout f8978u;

        /* renamed from: v */
        final EditText f8979v;

        /* renamed from: w */
        final TextView f8980w;

        /* renamed from: x */
        C2379ao f8981x;

        /* renamed from: y */
        final ScalableLayout f8982y;

        /* renamed from: z */
        final ScalableLayout f8983z;

        public C2477e(View view) {
            this.f8933a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_sc);
            this.f8959b = (TextView) view.findViewById(C2656R.C2657id.test_main_back_btn);
            this.f8960c = (TextView) view.findViewById(C2656R.C2657id.test_main_selected_mode_title);
            this.f8961d = (TextView) view.findViewById(C2656R.C2657id.test_main_selected_mode_txt);
            this.f8962e = (TextView) view.findViewById(C2656R.C2657id.test_main_selected_patient_title);
            this.f8963f = (TextView) view.findViewById(C2656R.C2657id.test_main_selected_patient_txt);
            this.f8964g = (TextView) view.findViewById(C2656R.C2657id.test_main_selected_cycle_title);
            this.f8965h = (TextView) view.findViewById(C2656R.C2657id.test_main_selected_cycle_txt);
            this.f8966i = (Spinner) view.findViewById(C2656R.C2657id.test_main_guideline_btn);
            this.f8967j = (ImageView) view.findViewById(C2656R.C2657id.test_main_guideline_img);
            this.f8968k = (TextView) view.findViewById(C2656R.C2657id.test_main_guideline_txt1);
            this.f8969l = (TextView) view.findViewById(C2656R.C2657id.test_main_guideline_txt2);
            this.f8970m = (TextView) view.findViewById(C2656R.C2657id.test_main_manikin_check_title);
            this.f8971n = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_connect_sc);
            this.f8972o = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_group_title_slot_sc);
            this.f8973p = (TextView) view.findViewById(C2656R.C2657id.test_main_group_title_info_txt);
            this.f8974q = (TextView) view.findViewById(C2656R.C2657id.test_main_group_title_lms_btn);
            this.f8975r = (TextView) view.findViewById(C2656R.C2657id.test_main_group_title_edit_btn);
            this.f8976s = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_group_normal_sc);
            this.f8977t = (DragListView) view.findViewById(C2656R.C2657id.test_main_group_normal_listview);
            this.f8978u = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_group_normal_new_sc);
            this.f8979v = (EditText) view.findViewById(C2656R.C2657id.test_main_group_normal_new_name_txt);
            this.f8980w = (TextView) view.findViewById(C2656R.C2657id.test_main_group_normal_new_add_btn);
            this.f8982y = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_group_normal_prevent_click_sc);
            this.f8983z = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_normal_prevent_click_sc);
            this.f8907A = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_group_edit_sc);
            this.f8908B = (DragListView) view.findViewById(C2656R.C2657id.test_main_group_edit_listview);
            this.f8910D = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_group_edit_add_slot_sc);
            this.f8911E = (EditText) view.findViewById(C2656R.C2657id.test_main_group_add_name_txt);
            this.f8912F = (ImageView) view.findViewById(C2656R.C2657id.test_main_group_add_add_btn);
            this.f8913G = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_title_slot_sc);
            this.f8914H = (TextView) view.findViewById(C2656R.C2657id.test_main_student_title_name_txt);
            this.f8915I = (TextView) view.findViewById(C2656R.C2657id.test_main_student_title_edit_btn);
            this.f8916J = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_normal_sc);
            this.f8917K = (DragListView) view.findViewById(C2656R.C2657id.test_main_student_normal_listview);
            this.f8918L = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_normal_new_sc);
            this.f8919M = (EditText) view.findViewById(C2656R.C2657id.test_main_student_normal_new_name_txt);
            this.f8920N = (TextView) view.findViewById(C2656R.C2657id.test_main_student_normal_new_add_btn);
            this.f8921O = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_normal_exist_sc);
            this.f8922P = (TextView) view.findViewById(C2656R.C2657id.test_main_student_normal_exist_info_txt);
            this.f8923Q = (TextView) view.findViewById(C2656R.C2657id.test_main_student_normal_exist_add_btn);
            this.f8925S = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_edit_sc);
            this.f8926T = (DragListView) view.findViewById(C2656R.C2657id.test_main_student_edit_listview);
            this.f8927U = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_edit_new_sc);
            this.f8928V = (TextView) view.findViewById(C2656R.C2657id.test_main_student_edit_new_info_txt);
            this.f8930X = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_student_edit_add_slot_sc);
            this.f8931Y = (EditText) view.findViewById(C2656R.C2657id.test_main_student_add_name_txt);
            this.f8932Z = (EditText) view.findViewById(C2656R.C2657id.test_main_student_add_email_txt);
            this.f8934aa = (ImageView) view.findViewById(C2656R.C2657id.test_main_student_add_add_btn);
            this.f8935ab = (TextView) view.findViewById(C2656R.C2657id.test_main_connect_require_txt);
            this.f8936ac = (TextView) view.findViewById(C2656R.C2657id.test_main_test_result_btn);
            this.f8937ad = (TextView) view.findViewById(C2656R.C2657id.test_main_start_btn);
            this.f8941ah = C2472bn.this.getFragmentManager();
            this.f8940ag = C2462bk.m13555a();
            this.f8942ai = this.f8941ah.beginTransaction();
            this.f8942ai.add(this.f8971n.getId(), this.f8940ag);
            this.f8942ai.commit();
            this.f8938ae[0] = "AHA 5~6cm";
            this.f8938ae[1] = "KACPR 5~6cm";
            this.f8938ae[2] = "ERC 5~6cm";
            this.f8938ae[3] = "ANZCOR 5~6cm";
            this.f8938ae[4] = "SRFAC 4-6cm";
            this.f8938ae[5] = "AHA 5cm~";
            this.f8938ae[6] = "KACPR 5cm~";
            this.f8938ae[7] = "ERC 5cm~";
            this.f8938ae[8] = "ANZCOR 5cm~";
            this.f8938ae[9] = "SRFAC 4cm~";
            this.f8939af = new ArrayAdapter<>(C2472bn.this.getActivity(), 17367049, this.f8938ae);
            this.f8977t.getRecyclerView().setVerticalScrollBarEnabled(true);
            this.f8977t.setDragListListener((DragListView.DragListListener) null);
            this.f8908B.getRecyclerView().setVerticalScrollBarEnabled(true);
            this.f8908B.setDragListListener((DragListView.DragListListener) null);
            this.f8917K.getRecyclerView().setVerticalScrollBarEnabled(true);
            this.f8917K.setDragListListener((DragListView.DragListListener) null);
            this.f8926T.getRecyclerView().setVerticalScrollBarEnabled(true);
            this.f8926T.setDragListListener(new DragListView.DragListListenerAdapter(C2472bn.this) {
                public void onItemDragEnded(int i, int i2) {
                    if (i != i2) {
                    }
                }

                public void onItemDragStarted(int i) {
                }
            });
            this.f8945al = false;
            this.f8944ak = false;
            this.f8976s.setVisibility(0);
            this.f8907A.setVisibility(4);
            this.f8916J.setVisibility(0);
            this.f8925S.setVisibility(4);
            this.f8982y.setVisibility(4);
            this.f8983z.setVisibility(4);
            this.f8978u.setVisibility(4);
            this.f8918L.setVisibility(4);
            this.f8921O.setVisibility(4);
            this.f8927U.setVisibility(4);
            this.f8966i.setAdapter(this.f8939af);
            this.f8966i.setOnItemSelectedListener(this);
            this.f8933a.setOnClickListener(this);
            this.f8959b.setOnClickListener(this);
            this.f8978u.setOnClickListener(this);
            this.f8980w.setOnClickListener(this);
            this.f8918L.setOnClickListener(this);
            this.f8920N.setOnClickListener(this);
            this.f8921O.setOnClickListener(this);
            this.f8923Q.setOnClickListener(this);
            this.f8927U.setOnClickListener(this);
            this.f8974q.setOnClickListener(this);
            this.f8975r.setOnClickListener(this);
            this.f8912F.setOnClickListener(this);
            this.f8915I.setOnClickListener(this);
            this.f8934aa.setOnClickListener(this);
            this.f8976s.setOnClickListener(this);
            this.f8907A.setOnClickListener(this);
            this.f8916J.setOnClickListener(this);
            this.f8925S.setOnClickListener(this);
            this.f8982y.setOnClickListener(this);
            this.f8983z.setOnClickListener(this);
            this.f8936ac.setOnClickListener(this);
            this.f8937ad.setOnClickListener(this);
            this.f8931Y.setOnKeyListener(this);
            this.f8932Z.setOnKeyListener(this);
            this.f8911E.setOnKeyListener(this);
            this.f8946am = (ScalableLayout) view.findViewById(C2656R.C2657id.test_main_import_data_sc);
            this.f8947an = (TextView) view.findViewById(C2656R.C2657id.test_main_import_server_btn);
            this.f8948ao = (ListView) view.findViewById(C2656R.C2657id.test_main_import_listview);
            this.f8949ap = (TextView) view.findViewById(C2656R.C2657id.test_main_import_import_btn);
            this.f8950aq = (TextView) view.findViewById(C2656R.C2657id.test_main_import_cancel_btn);
            this.f8946am.setOnClickListener(this);
            this.f8948ao.setOnItemClickListener(this);
            this.f8947an.setOnClickListener(this);
            this.f8949ap.setOnClickListener(this);
            this.f8950aq.setOnClickListener(this);
            this.f8946am.setVisibility(4);
            this.f8935ab.setVisibility(4);
            mo9118g();
        }

        /* renamed from: a */
        public void mo9109a() {
            this.f8933a.setVisibility(0);
        }

        /* renamed from: a */
        public void mo9110a(int i) {
            int i2 = 1;
            switch (i) {
                case 0:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_aha);
                    this.f8968k.setText("AHA");
                    this.f8969l.setText("5~6cm");
                    break;
                case 1:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_kacpr_full);
                    this.f8968k.setText("KACPR");
                    this.f8969l.setText("5~6cm");
                    i2 = 7;
                    break;
                case 2:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_erc);
                    this.f8968k.setText("ERC");
                    this.f8969l.setText("5~6cm");
                    i2 = 2;
                    break;
                case 3:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_anzcor);
                    this.f8968k.setText("ANZCOR");
                    this.f8969l.setText("5~6cm");
                    i2 = 3;
                    break;
                case 4:
                    this.f8967j.setImageResource(C2656R.drawable.srac_logo);
                    this.f8968k.setText("SRFAC");
                    this.f8969l.setText("4~6cm");
                    i2 = 9;
                    break;
                case 5:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_aha);
                    this.f8968k.setText("AHA");
                    this.f8969l.setText("5cm~");
                    i2 = 4;
                    break;
                case 6:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_kacpr_full);
                    this.f8968k.setText("KACPR");
                    this.f8969l.setText("5cm~");
                    i2 = 8;
                    break;
                case 7:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_erc);
                    this.f8968k.setText("ERC");
                    this.f8969l.setText("5cm~");
                    i2 = 5;
                    break;
                case 8:
                    this.f8967j.setImageResource(C2656R.drawable.img_mark_anzcor);
                    this.f8968k.setText("ANZCOR");
                    this.f8969l.setText("5cm~");
                    i2 = 6;
                    break;
                case 9:
                    this.f8967j.setImageResource(C2656R.drawable.srac_logo);
                    this.f8968k.setText("SRFAC");
                    this.f8969l.setText("4cm~");
                    i2 = 10;
                    break;
            }
            C2557y.f9832d.f9755k = i2;
            C2472bn.this.f8894e.mo9626a(C2557y.f9832d);
        }

        /* renamed from: a */
        public void mo8795a(int i, C2543k kVar) {
            if (this.f8943aj != i) {
                this.f8943aj = i;
                C2557y.f9852x = kVar;
            } else {
                this.f8943aj = -1;
                C2557y.f9852x = null;
            }
            mo9115d();
        }

        /* renamed from: a */
        public void mo8789a(final C2543k kVar) {
            if (kVar.mo9467f() != -1) {
                new AlertDialog.Builder(C2472bn.this.getActivity()).setTitle(C2557y.f9835g.f10490gS).setMessage(C2557y.f9835g.f10492gU).setPositiveButton(C2557y.f9835g.f10576o, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C2472bn.this.f8895f.mo9580b(kVar.mo9455a());
                        C2477e.this.mo9114c();
                    }
                }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
            } else {
                new AlertDialog.Builder(C2472bn.this.getActivity()).setTitle(C2557y.f9835g.f10491gT).setMessage(C2557y.f9835g.f10493gV).setPositiveButton(C2557y.f9835g.f10576o, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C2472bn.this.f8895f.mo9580b(kVar.mo9455a());
                        C2477e.this.mo9114c();
                    }
                }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
            }
        }

        /* renamed from: a */
        public void mo8805a(C2553u uVar) {
            C2472bn.this.f8895f.mo9601i(uVar.mo9715b());
            mo9115d();
        }

        /* renamed from: a */
        public void mo9111a(String str) {
            if (str == null || str.replaceAll("\\s", "").equals("")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                switch (C2557y.f9832d.f9756l) {
                    case 1:
                        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        break;
                    case 2:
                        simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                        break;
                    case 3:
                        simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        break;
                }
                str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
            }
            C2557y.f9852x = C2472bn.this.f8895f.mo9586c(C2472bn.this.f8895f.mo9567a(new C2543k(str)));
            this.f8943aj = 0;
            this.f8945al = true;
            mo9122k();
            new Handler() {
                public void handleMessage(Message message) {
                    C2477e.this.mo9115d();
                }
            }.sendEmptyMessageDelayed(0, 200);
        }

        /* renamed from: b */
        public void mo9112b() {
            this.f8933a.setVisibility(4);
        }

        /* renamed from: b */
        public void mo9113b(C2553u uVar) {
            int a = C2472bn.this.f8895f.mo9571a(uVar);
            if (C2557y.f9852x != null) {
                C2472bn.this.f8895f.mo9564a(new C2539g(C2557y.f9852x.mo9455a(), a));
            } else {
                C2472bn.this.f8895f.mo9564a(new C2539g(1, a));
            }
            mo9115d();
        }

        /* renamed from: c */
        public void mo9114c() {
            int i;
            this.f8957ax = new ArrayList<>();
            ArrayList<C2543k> a = C2472bn.this.f8895f.mo9572a();
            if (a == null || a.size() == 1) {
                this.f8978u.setVisibility(0);
                this.f8913G.setAlpha(0.15f);
                this.f8918L.setAlpha(0.15f);
                this.f8983z.setVisibility(0);
                this.f8979v.setText("");
                if (this.f8944ak) {
                    this.f8975r.setOnClickListener(this);
                    this.f8975r.setAlpha(1.0f);
                } else {
                    this.f8975r.setOnClickListener((View.OnClickListener) null);
                    this.f8975r.setAlpha(0.15f);
                }
            } else {
                Iterator<C2543k> it = a.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    C2543k next = it.next();
                    if (next.mo9455a() == 1) {
                        i = i2;
                    } else {
                        this.f8957ax.add(new Pair(Integer.valueOf(i2), next));
                        i = i2 + 1;
                    }
                    i2 = i;
                }
                this.f8978u.setVisibility(4);
                this.f8913G.setAlpha(1.0f);
                this.f8918L.setAlpha(1.0f);
                this.f8983z.setVisibility(4);
                this.f8975r.setOnClickListener(this);
                this.f8975r.setAlpha(1.0f);
            }
            if (this.f8944ak) {
                this.f8908B.setLayoutManager(new LinearLayoutManager(C2472bn.this.getActivity()));
                this.f8909C = new C2374an(this, this.f8957ax, C2656R.C2657id.test_assign_group_edit_move_btn, false);
                this.f8908B.setAdapter(this.f8909C, true);
                this.f8908B.setCanDragHorizontally(false);
                this.f8908B.setCustomDragItem((DragItem) null);
                this.f8911E.requestFocus();
                this.f8911E.setText("");
                this.f8975r.setText(C2557y.f9835g.f10481gJ);
                this.f8975r.setBackgroundResource(C2656R.drawable.btn_student_complete_test);
                this.f8975r.setTextColor(-1);
                this.f8907A.setVisibility(0);
                this.f8976s.setVisibility(4);
            } else {
                this.f8977t.setLayoutManager(new LinearLayoutManager(C2472bn.this.getActivity()));
                this.f8981x = new C2379ao(this, this.f8957ax, C2656R.C2657id.test_assign_group_normal_move_btn, false, this.f8945al, this.f8943aj);
                this.f8977t.setAdapter(this.f8981x, true);
                this.f8977t.setCanDragHorizontally(false);
                this.f8977t.setCustomDragItem((DragItem) null);
                this.f8975r.setText(C2557y.f9835g.f10480gI);
                this.f8975r.setBackgroundResource(C2656R.drawable.btn_student_edit_test);
                this.f8975r.setTextColor(-10658467);
                this.f8907A.setVisibility(4);
                this.f8976s.setVisibility(0);
            }
            if (!this.f8944ak && !this.f8945al) {
                ((InputMethodManager) C2472bn.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f8933a.getWindowToken(), 0);
            }
            mo9115d();
        }

        /* renamed from: d */
        public void mo9115d() {
            int i;
            this.f8958ay = new ArrayList<>();
            if (C2557y.f9852x != null) {
                C2557y.f9852x = C2472bn.this.f8895f.mo9586c(C2557y.f9852x.mo9455a());
                if (C2557y.f9852x != null) {
                    ArrayList<C2539g> e = C2472bn.this.f8895f.mo9594e(C2557y.f9852x.mo9455a());
                    if (e != null) {
                        Iterator<C2539g> it = e.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            C2553u j = C2472bn.this.f8895f.mo9602j(it.next().mo9393c());
                            if (j != null) {
                                this.f8958ay.add(new Pair(Integer.valueOf(i2), j));
                                i = i2 + 1;
                            } else {
                                i = i2;
                            }
                            i2 = i;
                        }
                        this.f8918L.setVisibility(4);
                        this.f8921O.setVisibility(4);
                        this.f8927U.setVisibility(4);
                    } else if (this.f8945al) {
                        this.f8927U.setVisibility(0);
                    } else {
                        this.f8918L.setVisibility(4);
                        this.f8921O.setVisibility(0);
                    }
                    this.f8914H.setText(C2557y.f9852x.mo9459b());
                    this.f8915I.setOnClickListener(this);
                    this.f8915I.setAlpha(1.0f);
                }
            }
            if (C2557y.f9852x == null) {
                this.f8914H.setText(C2557y.f9835g.f10554hk);
                if (this.f8945al) {
                    this.f8927U.setVisibility(0);
                    this.f8915I.setOnClickListener(this);
                    this.f8915I.setAlpha(1.0f);
                } else {
                    this.f8919M.setText("");
                    this.f8918L.setVisibility(0);
                    this.f8921O.setVisibility(4);
                    this.f8915I.setOnClickListener((View.OnClickListener) null);
                    this.f8915I.setAlpha(0.15f);
                }
            }
            if (this.f8945al) {
                this.f8926T.setLayoutManager(new LinearLayoutManager(C2472bn.this.getActivity()));
                this.f8929W = new C2382ap(C2472bn.this.getActivity(), this, this.f8958ay, C2656R.C2657id.test_assign_student_edit_move_btn, false);
                this.f8926T.setAdapter(this.f8929W, true);
                this.f8926T.setCanDragHorizontally(false);
                this.f8926T.setCustomDragItem((DragItem) null);
                this.f8931Y.requestFocus();
                this.f8931Y.setText("");
                this.f8932Z.setText("");
                this.f8915I.setText(C2557y.f9835g.f10478gG);
                this.f8915I.setBackgroundResource(C2656R.drawable.btn_student_complete_test);
                this.f8915I.setTextColor(-1);
                this.f8925S.setVisibility(0);
                this.f8916J.setVisibility(4);
                this.f8981x.mo8794a(this.f8945al);
                this.f8982y.setVisibility(0);
            } else {
                this.f8917K.setLayoutManager(new LinearLayoutManager(C2472bn.this.getActivity()));
                this.f8924R = new C2388aq(this.f8958ay, C2656R.C2657id.test_assign_student_normal_move_btn, false);
                this.f8917K.setAdapter(this.f8924R, true);
                this.f8917K.setCanDragHorizontally(false);
                this.f8917K.setCustomDragItem((DragItem) null);
                this.f8915I.setText(C2557y.f9835g.f10477gF);
                this.f8915I.setBackgroundResource(C2656R.drawable.btn_student_edit_test);
                this.f8915I.setTextColor(-10658467);
                this.f8925S.setVisibility(4);
                this.f8916J.setVisibility(0);
                this.f8981x.mo8794a(this.f8945al);
                this.f8982y.setVisibility(4);
            }
            if (!this.f8944ak && !this.f8945al) {
                ((InputMethodManager) C2472bn.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f8933a.getWindowToken(), 0);
            }
        }

        /* renamed from: e */
        public void mo9116e() {
            this.f8959b.setText("< " + C2557y.f9835g.f10475gD);
            this.f8960c.setText(C2557y.f9835g.f10578q);
            this.f8962e.setText(C2557y.f9835g.f10282cW);
            this.f8964g.setText(C2557y.f9835g.f10141O);
            this.f8970m.setText(C2557y.f9835g.f10476gE);
            this.f8973p.setText(C2557y.f9835g.f10479gH);
            this.f8974q.setText(C2557y.f9835g.f10553hj);
            this.f8975r.setText(C2557y.f9835g.f10480gI);
            this.f8915I.setText(C2557y.f9835g.f10477gF);
            this.f8911E.setHint(C2557y.f9835g.f10484gM);
            this.f8931Y.setHint(C2557y.f9835g.f10482gK);
            this.f8932Z.setHint(C2557y.f9835g.f10483gL);
            this.f8979v.setHint(C2557y.f9835g.f10555hl);
            this.f8980w.setText(C2557y.f9835g.f10556hm);
            this.f8919M.setHint(C2557y.f9835g.f10568hy);
            this.f8920N.setText(C2557y.f9835g.f10557hn);
            this.f8922P.setText(C2557y.f9835g.f10558ho);
            this.f8923Q.setText(C2557y.f9835g.f10559hp);
            this.f8928V.setText(C2557y.f9835g.f10560hq);
            this.f8936ac.setText(C2557y.f9835g.f10552hi);
            this.f8937ad.setText(C2557y.f9835g.f10473gB);
            this.f8935ab.setText(C2557y.f9835g.f10525hA);
            this.f8947an.setText("LMS");
            this.f8949ap.setText(C2557y.f9835g.f10474gC);
            this.f8950aq.setText(C2557y.f9835g.f10210bD);
        }

        /* renamed from: f */
        public void mo9117f() {
            if (this.f8944ak) {
                mo9122k();
            } else if (this.f8945al) {
                mo9124m();
            }
        }

        /* renamed from: g */
        public void mo9118g() {
            boolean z;
            int i;
            this.f8943aj = -1;
            C2557y.f9852x = null;
            this.f8959b.setText("< " + C2557y.f9835g.f10475gD);
            this.f8960c.setText(C2557y.f9835g.f10578q);
            this.f8962e.setText(C2557y.f9835g.f10282cW);
            this.f8964g.setText(C2557y.f9835g.f10141O);
            this.f8970m.setText(C2557y.f9835g.f10476gE);
            this.f8973p.setText(C2557y.f9835g.f10479gH);
            this.f8974q.setText(C2557y.f9835g.f10553hj);
            this.f8975r.setText(C2557y.f9835g.f10480gI);
            this.f8915I.setText(C2557y.f9835g.f10477gF);
            this.f8911E.setHint(C2557y.f9835g.f10484gM);
            this.f8931Y.setHint(C2557y.f9835g.f10482gK);
            this.f8932Z.setHint(C2557y.f9835g.f10483gL);
            this.f8979v.setHint(C2557y.f9835g.f10555hl);
            this.f8980w.setText(C2557y.f9835g.f10556hm);
            this.f8919M.setHint(C2557y.f9835g.f10568hy);
            this.f8920N.setText(C2557y.f9835g.f10557hn);
            this.f8922P.setText(C2557y.f9835g.f10558ho);
            this.f8923Q.setText(C2557y.f9835g.f10559hp);
            this.f8928V.setText(C2557y.f9835g.f10560hq);
            this.f8936ac.setText(C2557y.f9835g.f10552hi);
            this.f8937ad.setText(C2557y.f9835g.f10473gB);
            this.f8935ab.setText(C2557y.f9835g.f10525hA);
            if (C2472bn.this.f8893d == null) {
                this.f8937ad.setBackgroundResource(C2656R.drawable.btn_control_gray);
                this.f8935ab.setVisibility(0);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= 6) {
                        z = false;
                        break;
                    } else if (C2472bn.this.f8893d[i2].f7851a.f9568a) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    this.f8937ad.setBackgroundResource(C2656R.drawable.btn_control_gray);
                    this.f8935ab.setVisibility(0);
                } else {
                    this.f8937ad.setBackgroundResource(C2656R.drawable.btn_control_red);
                    this.f8935ab.setVisibility(4);
                }
            }
            this.f8947an.setText("LMS");
            this.f8949ap.setText(C2557y.f9835g.f10474gC);
            this.f8950aq.setText(C2557y.f9835g.f10210bD);
            this.f8978u.setVisibility(4);
            this.f8918L.setVisibility(4);
            this.f8921O.setVisibility(4);
            this.f8927U.setVisibility(4);
            this.f8946am.setVisibility(4);
            if (C2557y.f9811B.mo9548c() != -1) {
                this.f8974q.setOnClickListener(this);
                this.f8974q.setAlpha(1.0f);
            } else {
                this.f8974q.setOnClickListener((View.OnClickListener) null);
                this.f8974q.setAlpha(0.15f);
            }
            if (C2557y.f9832d.f9748d == 1) {
                this.f8961d.setText(C2557y.f9835g.f10579r);
            } else if (C2557y.f9832d.f9748d == 2) {
                this.f8961d.setText(C2557y.f9835g.f10580s);
            }
            String str = "";
            if (C2557y.f9833e.f7880a) {
                str = str + C2557y.f9835g.f10581t + " ";
            }
            if (C2557y.f9833e.f7881b) {
                str = str + C2557y.f9835g.f10272cM + " ";
            }
            if (C2557y.f9833e.f7882c) {
                str = str + C2557y.f9835g.f10582u;
            }
            this.f8963f.setText(str);
            this.f8965h.setText(C2557y.f9832d.f9749e <= 5 ? C2557y.f9832d.f9749e + "" : C2557y.f9835g.f10341dc);
            switch (C2557y.f9832d.f9755k) {
                case 1:
                    i = 0;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 1;
                    break;
                case 8:
                    i = 6;
                    break;
                case 9:
                    i = 4;
                    break;
                case 10:
                    i = 9;
                    break;
                default:
                    i = 0;
                    break;
            }
            mo9110a(i);
            this.f8966i.setSelection(i);
            if (C2472bn.this.f8893d != null) {
                Log.e("?!", "TEST MAIN");
                this.f8940ag.mo9037a(C2465bl.f8800b, C2472bn.this.f8893d);
            }
            mo9114c();
        }

        /* renamed from: h */
        public void mo9119h() {
            if (this.f8909C != null) {
                for (Pair pair : this.f8909C.getItemList()) {
                    C2543k kVar = (C2543k) pair.second;
                    String b = kVar.mo9459b();
                    if (b == null || b.replaceAll("\\s", "").equals("")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        switch (C2557y.f9832d.f9756l) {
                            case 1:
                                simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                                break;
                            case 2:
                                simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                                break;
                            case 3:
                                simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                                break;
                        }
                        kVar.mo9457a(simpleDateFormat.format(new Date(System.currentTimeMillis())));
                        C2472bn.this.f8895f.mo9583b(kVar);
                    } else {
                        C2472bn.this.f8895f.mo9583b(kVar);
                    }
                }
            }
        }

        /* renamed from: i */
        public void mo9120i() {
            if (this.f8929W != null) {
                for (Pair pair : this.f8929W.getItemList()) {
                    int positionForItemId = this.f8929W.getPositionForItemId((long) ((Integer) pair.first).intValue());
                    C2553u uVar = (C2553u) pair.second;
                    C2539g c = C2557y.f9852x != null ? C2472bn.this.f8895f.mo9585c(C2557y.f9852x.mo9455a(), uVar.mo9715b()) : C2472bn.this.f8895f.mo9585c(1, uVar.mo9715b());
                    c.mo9398e(positionForItemId);
                    C2472bn.this.f8895f.mo9582b(c);
                    C2472bn.this.f8895f.mo9589c(uVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo9121j() {
            if (this.f8945al) {
                this.f8945al = false;
                mo9120i();
            }
            this.f8944ak = true;
            mo9114c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo9122k() {
            this.f8944ak = false;
            mo9119h();
            mo9114c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo9123l() {
            this.f8945al = true;
            mo9115d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo9124m() {
            this.f8945al = false;
            mo9120i();
            mo9115d();
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case C2656R.C2657id.test_main_back_btn /*2131231881*/:
                    if (this.f8945al || this.f8944ak) {
                        ((InputMethodManager) C2472bn.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f8933a.getWindowToken(), 0);
                        mo9117f();
                    }
                    C2472bn.this.f8892c.mo8607a(C2473a.SETTING);
                    return;
                case C2656R.C2657id.test_main_group_add_add_btn /*2131231884*/:
                    mo9111a(this.f8911E.getText().toString());
                    this.f8911E.setText("");
                    return;
                case C2656R.C2657id.test_main_group_normal_new_add_btn /*2131231890*/:
                    mo9111a(this.f8979v.getText().toString().replaceAll("\\s", ""));
                    return;
                case C2656R.C2657id.test_main_group_title_edit_btn /*2131231895*/:
                    if (this.f8944ak) {
                        mo9122k();
                        return;
                    } else {
                        mo9121j();
                        return;
                    }
                case C2656R.C2657id.test_main_group_title_lms_btn /*2131231897*/:
                    if (C2557y.f9811B.mo9548c() != -1) {
                        new C2474b().execute(new Void[0]);
                        return;
                    }
                    return;
                case C2656R.C2657id.test_main_import_cancel_btn /*2131231903*/:
                    this.f8946am.setVisibility(4);
                    return;
                case C2656R.C2657id.test_main_import_import_btn /*2131231905*/:
                    if (C2557y.f9811B.mo9548c() != -1) {
                        new C2475c().execute(new Void[0]);
                    }
                    this.f8946am.setVisibility(4);
                    return;
                case C2656R.C2657id.test_main_start_btn /*2131231916*/:
                    if (this.f8944ak || this.f8945al) {
                        new AlertDialog.Builder(C2472bn.this.getActivity()).setTitle(C2557y.f9835g.f10561hr).setMessage(C2557y.f9835g.f10562hs).setPositiveButton(C2557y.f9835g.f10209bC, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                        return;
                    } else if (C2465bl.f8800b != -1) {
                        ArrayList<C2527bs> arrayList = new ArrayList<>();
                        ArrayList<Pair<C2553u, C2339af>> arrayList2 = new ArrayList<>();
                        ArrayList<C2539g> e = C2557y.f9852x != null ? C2472bn.this.f8895f.mo9594e(C2557y.f9852x.mo9455a()) : null;
                        C2465bl.f8803e = true;
                        if (e != null) {
                            Iterator<C2539g> it = e.iterator();
                            while (it.hasNext()) {
                                C2553u j = C2472bn.this.f8895f.mo9602j(it.next().mo9393c());
                                if (j != null) {
                                    for (int i = 0; i < 3; i++) {
                                        if ((i != 0 || C2557y.f9833e.f7880a) && ((i != 1 || C2557y.f9833e.f7881b) && (i != 2 || C2557y.f9833e.f7882c))) {
                                            Log.e("setting patient", i + "");
                                            C2552t a = C2557y.f9832d.clone();
                                            a.f9747c = i + 1;
                                            arrayList.add(new C2527bs(j, a, false));
                                            C2465bl.f8803e = false;
                                        }
                                    }
                                    arrayList2.add(new Pair(j, new C2339af()));
                                }
                            }
                        } else {
                            for (int i2 = 0; i2 < 3; i2++) {
                                C2553u uVar = new C2553u("", "");
                                if ((i2 != 0 || C2557y.f9833e.f7880a) && ((i2 != 1 || C2557y.f9833e.f7881b) && (i2 != 2 || C2557y.f9833e.f7882c))) {
                                    Log.e("setting patient", i2 + "");
                                    C2552t a2 = C2557y.f9832d.clone();
                                    a2.f9747c = i2 + 1;
                                    arrayList.add(new C2527bs(uVar, a2, false));
                                }
                            }
                        }
                        C2465bl.f8802d = arrayList2;
                        C2465bl.f8801c = arrayList;
                        C2472bn.this.f8892c.mo8607a(C2473a.NEXT);
                        return;
                    } else {
                        return;
                    }
                case C2656R.C2657id.test_main_student_add_add_btn /*2131231917*/:
                    String obj = this.f8931Y.getText().toString();
                    String obj2 = this.f8932Z.getText().toString();
                    if (obj == null || obj.replaceAll("\\s", "").equals("")) {
                        Toast.makeText(C2472bn.this.getActivity(), C2557y.f9835g.f10173aT, 0).show();
                        return;
                    } else if (obj2 == null || obj2.replaceAll("\\s", "").equals("")) {
                        mo9113b(new C2553u(obj, ""));
                        this.f8931Y.setText("");
                        this.f8932Z.setText("");
                        return;
                    } else if (!Pattern.compile("[a-zA-Z0-9_\\.-]+@{1}+[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_]+)+").matcher(obj2).matches()) {
                        Toast.makeText(C2472bn.this.getActivity(), C2557y.f9835g.f10158aE, 0).show();
                        return;
                    } else {
                        mo9113b(new C2553u(obj, obj2));
                        this.f8931Y.setText("");
                        this.f8932Z.setText("");
                        return;
                    }
                case C2656R.C2657id.test_main_student_normal_exist_add_btn /*2131231925*/:
                case C2656R.C2657id.test_main_student_title_edit_btn /*2131231934*/:
                    if (this.f8945al) {
                        mo9124m();
                        return;
                    } else {
                        mo9123l();
                        return;
                    }
                case C2656R.C2657id.test_main_student_normal_new_add_btn /*2131231929*/:
                    mo9111a(this.f8919M.getText().toString().replaceAll("\\s", ""));
                    return;
                case C2656R.C2657id.test_main_test_result_btn /*2131231937*/:
                    if (this.f8945al || this.f8944ak) {
                        ((InputMethodManager) C2472bn.this.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f8933a.getWindowToken(), 0);
                        mo9117f();
                    }
                    C2472bn.this.f8892c.mo8607a(C2473a.RESULT);
                    return;
                default:
                    return;
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f8953at.get(i).booleanValue()) {
                this.f8953at.set(i, false);
                this.f8951ar.mo8748a(i, false);
                return;
            }
            this.f8953at.set(i, true);
            this.f8951ar.mo8748a(i, true);
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            switch (adapterView.getId()) {
                case C2656R.C2657id.test_main_guideline_btn /*2131231899*/:
                    mo9110a(i);
                    return;
                default:
                    return;
            }
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66 || keyEvent.getAction() != 1) {
                return false;
            }
            switch (view.getId()) {
                case C2656R.C2657id.test_main_group_add_name_txt /*2131231885*/:
                    mo9111a(this.f8911E.getText().toString());
                    this.f8911E.setText("");
                    return true;
                case C2656R.C2657id.test_main_student_add_email_txt /*2131231918*/:
                    String obj = this.f8931Y.getText().toString();
                    String obj2 = this.f8932Z.getText().toString();
                    if (obj == null || obj.replaceAll("\\s", "").equals("")) {
                        Toast.makeText(C2472bn.this.getActivity(), C2557y.f9835g.f10173aT, 0).show();
                        return true;
                    } else if (obj2 == null || obj2.replaceAll("\\s", "").equals("")) {
                        mo9113b(new C2553u(obj, ""));
                        this.f8931Y.setText("");
                        this.f8932Z.setText("");
                        return true;
                    } else if (!Pattern.compile("[a-zA-Z0-9_\\.-]+@{1}+[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_]+)+").matcher(obj2).matches()) {
                        Toast.makeText(C2472bn.this.getActivity(), C2557y.f9835g.f10158aE, 0).show();
                        return true;
                    } else {
                        mo9113b(new C2553u(obj, obj2));
                        this.f8931Y.setText("");
                        this.f8932Z.setText("");
                        return true;
                    }
                case C2656R.C2657id.test_main_student_add_name_txt /*2131231919*/:
                    this.f8932Z.requestFocus();
                    return true;
                default:
                    return true;
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: a */
    public static C2472bn m13602a(int i) {
        C2472bn bnVar = new C2472bn();
        Bundle bundle = new Bundle();
        bundle.putInt(f8890a, i);
        bnVar.setArguments(bundle);
        return bnVar;
    }

    /* renamed from: d */
    private void m13608d() {
        this.f8896g.mo9109a();
        this.f8896g.mo9118g();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static HttpClient m13610e() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9086a() {
        this.f8896g.mo9117f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9087a(boolean z) {
        if (z) {
            this.f8896g.f8937ad.setBackgroundResource(C2656R.drawable.btn_control_red);
            this.f8896g.f8935ab.setVisibility(4);
            return;
        }
        this.f8896g.f8937ad.setBackgroundResource(C2656R.drawable.btn_control_gray);
        this.f8896g.f8935ab.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9088a(C2338ae[] aeVarArr) {
        this.f8893d = aeVarArr;
        m13608d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9089b() {
        this.f8896g.mo9116e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9090b(int i) {
        C2465bl.f8800b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9091b(C2338ae[] aeVarArr) {
        this.f8893d = aeVarArr;
        if (C2465bl.f8800b == -1) {
            m13608d();
        } else if (!aeVarArr[C2465bl.f8800b].f7851a.f9568a) {
            C2465bl.f8800b = -1;
            m13608d();
        } else {
            m13608d();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2476d) {
            this.f8892c = (C2476d) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
        }
        this.f8894e = new C2549q(getActivity());
        this.f8895f = new C2548p(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2656R.layout.test_main, viewGroup, false);
        this.f8896g = new C2477e(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f8892c = null;
    }
}
