package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

/* renamed from: com.imlabworld.HS_Instructor.b */
public class C2426b extends Activity {

    /* renamed from: A */
    private static final String f8400A = "IMLAB00A";

    /* renamed from: B */
    private static final String f8401B = "IMLAB00B";

    /* renamed from: C */
    private static final String f8402C = "IMLAB00C";

    /* renamed from: a */
    static final boolean f8403a = false;

    /* renamed from: b */
    static final int f8404b = 70;

    /* renamed from: c */
    static final int f8405c = 23;

    /* renamed from: d */
    static final int f8406d = 1;

    /* renamed from: e */
    static final int f8407e = 120;

    /* renamed from: f */
    static final int f8408f = 100;

    /* renamed from: g */
    static final int f8409g = 10;

    /* renamed from: h */
    static final int f8410h = 1;

    /* renamed from: i */
    static final int f8411i = 2;

    /* renamed from: j */
    static final int f8412j = 3;

    /* renamed from: k */
    static final int f8413k = 4;

    /* renamed from: l */
    static final int f8414l = 5;

    /* renamed from: m */
    static final int f8415m = 980;

    /* renamed from: n */
    static final String f8416n = "https://www.heartisense.com/LMS/Monitor_communication/";

    /* renamed from: o */
    static final String f8417o = "https://www.heartisense.com/LMS/protocols/";

    /* renamed from: p */
    static final String f8418p = "https://www.heartisense.com/LMS/groupCommunication/";

    /* renamed from: q */
    static final String f8419q = "http://www.heartisense.com/LMS/index.php/IMLAB/find_account";

    /* renamed from: r */
    private static final String f8420r = "IMLAB001";

    /* renamed from: s */
    private static final String f8421s = "IMLAB002";

    /* renamed from: t */
    private static final String f8422t = "IMLAB003";

    /* renamed from: u */
    private static final String f8423u = "IMLAB004";

    /* renamed from: v */
    private static final String f8424v = "IMLAB005";

    /* renamed from: w */
    private static final String f8425w = "IMLAB006";

    /* renamed from: x */
    private static final String f8426x = "IMLAB007";

    /* renamed from: y */
    private static final String f8427y = "IMLAB008";

    /* renamed from: z */
    private static final String f8428z = "IMLAB009";

    /* renamed from: D */
    private final C2317a f8429D = C2317a.m13152a();

    /* renamed from: com.imlabworld.HS_Instructor.b$a */
    public enum C2428a {
        START_CODE,
        STOP_CODE,
        BATTERY_CODE,
        ACCEL_CODE,
        ATM_CODE,
        BT1_CODE,
        BT2_CODE,
        LABEL_CHECK_CODE,
        D_VALUE_EDIT,
        PRODUCT_CHECK_CODE
    }

    /* renamed from: a */
    static boolean m13432a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(6);
        boolean isConnected = networkInfo3 != null ? networkInfo3.isConnected() : false;
        if (networkInfo != null) {
            if (networkInfo.isConnected() || networkInfo2.isConnected() || isConnected) {
                return true;
            }
        } else if (networkInfo2.isConnected() || isConnected) {
            return true;
        }
        new AlertDialog.Builder(context).setTitle(C2557y.f9835g.f10221bO).setMessage(C2557y.f9835g.f10177aX).setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show().setCanceledOnTouchOutside(false);
        return false;
    }

    /* renamed from: a */
    static boolean m13433a(String str) {
        return str.equals(f8420r) || str.equals(f8421s) || str.equals(f8402C);
    }

    /* renamed from: b */
    static boolean m13434b(String str) {
        return str.equals(f8427y);
    }

    /* renamed from: c */
    static boolean m13435c(String str) {
        return str.equals(f8400A);
    }

    /* renamed from: d */
    static boolean m13436d(String str) {
        return str.equals(f8426x);
    }

    /* renamed from: e */
    static boolean m13437e(String str) {
        return str.equals(f8401B);
    }

    /* renamed from: f */
    static boolean m13438f(String str) {
        return str.equals(f8422t) || str.equals(f8423u) || str.equals(f8424v) || str.equals(f8425w) || str.equals(f8428z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8930a(int num) {
        return (int) Math.exp(3.18322799547958d + (0.00153868372576938d * ((double) num)) + (((double) (num * num)) * 1.54167937766884E-7d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8931a() {
        System.gc();
        finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8932b() {
        this.f8429D.mo8681c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8933g(String str) {
        Toast.makeText(getApplicationContext(), C2557y.f9835g.f10165aL + "(" + str + ")", 0).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8934h(String str) {
        Toast.makeText(getApplicationContext(), C2557y.f9835g.f10166aM + "(" + str + ")", 0).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8935i(String str) {
        Toast.makeText(getApplicationContext(), C2557y.f9835g.f10167aN + "(" + str + ")", 0).show();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8429D.mo8678a(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f8429D.mo8680b(this);
    }
}
