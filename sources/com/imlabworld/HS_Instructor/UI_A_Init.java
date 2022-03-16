package com.imlabworld.HS_Instructor;

import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0370d;
import android.support.p010v4.p014d.C0434d;
import android.util.Log;
import android.widget.TextView;
import com.imlabworld.HS_Instructor.C2528c;
import com.woxthebox.draglistview.C2656R;

public class UI_A_Init extends C2426b {

    /* renamed from: r */
    private static final String f7646r = "Init";

    /* renamed from: s */
    private static final int f7647s = 10;

    /* renamed from: t */
    private final String[] f7648t = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};
    /* access modifiers changed from: private */

    /* renamed from: u */
    public MediaPlayer f7649u;

    /* renamed from: v */
    private TextView f7650v;

    /* renamed from: w */
    private final C2528c.C2533a[] f7651w = new C2528c.C2533a[6];

    /* renamed from: x */
    private C2528c.C2533a f7652x = new C2528c.C2533a() {
        /* renamed from: a */
        public void mo8579a() {
        }

        /* renamed from: a */
        public void mo8580a(C2528c.C2534b bVar) {
        }

        /* renamed from: a */
        public void mo8581a(C2528c.C2534b bVar, Boolean bool) {
        }

        /* renamed from: a */
        public void mo8582a(C2528c.C2534b bVar, byte[] bArr) {
        }

        /* renamed from: b */
        public void mo8583b() {
        }

        /* renamed from: b */
        public void mo8584b(C2528c.C2534b bVar) {
        }

        /* renamed from: c */
        public void mo8585c() {
        }
    };

    /* renamed from: b */
    private void m13018b(int i) {
        this.f7651w[i] = new C2528c.C2533a() {
            /* renamed from: a */
            public void mo8579a() {
            }

            /* renamed from: a */
            public void mo8580a(C2528c.C2534b bVar) {
            }

            /* renamed from: a */
            public void mo8581a(C2528c.C2534b bVar, Boolean bool) {
            }

            /* renamed from: a */
            public void mo8582a(C2528c.C2534b bVar, byte[] bArr) {
            }

            /* renamed from: b */
            public void mo8583b() {
            }

            /* renamed from: b */
            public void mo8584b(C2528c.C2534b bVar) {
            }

            /* renamed from: c */
            public void mo8585c() {
            }
        };
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2656R.layout.init);
        this.f7650v = (TextView) findViewById(C2656R.C2657id.text);
        boolean z = true;
        for (String b : this.f7648t) {
            if (C0434d.m2378b((Context) this, b) != 0) {
                z = false;
            }
        }
        Log.i("Permission", z + " per");
        if (!z) {
            C0370d.m2115a(this, this.f7648t, 10);
            return;
        }
        for (int i = 0; i < 6; i++) {
            m13018b(i);
            C2555w.f9780a[i] = new C2528c(this, this.f7651w[i], i);
        }
        C2555w.f9781b = BluetoothAdapter.getDefaultAdapter();
        if (C2555w.f9781b == null) {
            mo8931a();
            return;
        }
        try {
            this.f7649u = MediaPlayer.create(this, C2656R.raw.logo);
            this.f7649u.start();
        } catch (Exception e) {
            Log.e(f7646r, "onCreate : Sound Error");
        }
        C2552t a = new C2549q(this).mo9622a();
        if (a.mo9706o().equals("en")) {
            C2557y.f9835g = C2557y.f9836h;
        } else if (a.mo9706o().equals("de")) {
            C2557y.f9835g = C2557y.f9838j;
        } else if (a.mo9706o().equals("es")) {
            C2557y.f9835g = C2557y.f9839k;
        } else if (a.mo9706o().equals("fr")) {
            C2557y.f9835g = C2557y.f9840l;
        } else if (a.mo9706o().equals("kr")) {
            C2557y.f9835g = C2557y.f9837i;
        } else if (a.mo9706o().equals("cn")) {
            C2557y.f9835g = C2557y.f9841m;
        } else {
            C2557y.f9835g = C2557y.f9836h;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    UI_A_Init.this.overridePendingTransition(C2656R.anim.fade_in, C2656R.anim.fade_out);
                    UI_A_Init.this.startActivity(new Intent(UI_A_Init.this, UI_A_Main.class));
                    UI_A_Init.this.overridePendingTransition(0, 0);
                    MediaPlayer unused = UI_A_Init.this.f7649u = null;
                    UI_A_Init.this.finish();
                } catch (Exception e) {
                }
            }
        }.sendEmptyMessageDelayed(0, 3000);
    }

    public void onDestroy() {
        super.onDestroy();
        System.gc();
    }

    public void onRequestPermissionsResult(int i, @C0047z String[] strArr, @C0047z int[] iArr) {
        Log.i("Permission", "Call");
        boolean z = true;
        for (int i2 : iArr) {
            if (i2 != 0) {
                z = false;
            }
        }
        if (!z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Permission").setMessage("HS Instructor 2.0 need Location and Storage permission for running application.").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    UI_A_Init.this.finish();
                }
            });
            builder.show();
            return;
        }
        for (int i3 = 0; i3 < 6; i3++) {
            m13018b(i3);
            C2555w.f9780a[i3] = new C2528c(this, this.f7651w[i3], i3);
        }
        C2555w.f9781b = BluetoothAdapter.getDefaultAdapter();
        if (C2555w.f9781b == null) {
            mo8931a();
            return;
        }
        try {
            this.f7649u = MediaPlayer.create(this, C2656R.raw.logo);
            this.f7649u.start();
        } catch (Exception e) {
            Log.e(f7646r, "onCreate : Sound Error");
        }
        C2552t a = new C2549q(this).mo9622a();
        if (a.mo9706o().equals("en")) {
            C2557y.f9835g = C2557y.f9836h;
        } else if (a.mo9706o().equals("de")) {
            C2557y.f9835g = C2557y.f9838j;
        } else if (a.mo9706o().equals("es")) {
            C2557y.f9835g = C2557y.f9839k;
        } else if (a.mo9706o().equals("fr")) {
            C2557y.f9835g = C2557y.f9840l;
        } else if (a.mo9706o().equals("kr")) {
            C2557y.f9835g = C2557y.f9837i;
        } else if (a.mo9706o().equals("cn")) {
            C2557y.f9835g = C2557y.f9841m;
        } else {
            C2557y.f9835g = C2557y.f9836h;
        }
        new Handler() {
            public void handleMessage(Message message) {
                try {
                    UI_A_Init.this.overridePendingTransition(C2656R.anim.fade_in, C2656R.anim.fade_out);
                    UI_A_Init.this.startActivity(new Intent(UI_A_Init.this, UI_A_Main.class));
                    UI_A_Init.this.overridePendingTransition(0, 0);
                    MediaPlayer unused = UI_A_Init.this.f7649u = null;
                    UI_A_Init.this.finish();
                } catch (Exception e) {
                }
            }
        }.sendEmptyMessageDelayed(0, 3000);
    }
}
