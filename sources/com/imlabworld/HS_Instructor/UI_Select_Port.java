package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.imlabworld.HS_Instructor.C2528c;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UI_Select_Port extends Activity {

    /* renamed from: c */
    public static final String f7715c = "selected port";

    /* renamed from: l */
    private static final String f7716l = "DeviceListActivity";

    /* renamed from: a */
    public int f7717a = 10;

    /* renamed from: b */
    Button f7718b;

    /* renamed from: d */
    private ArrayList<String> f7719d;

    /* renamed from: e */
    private ArrayList<C2528c.C2534b> f7720e;

    /* renamed from: f */
    private ArrayAdapter<String> f7721f;

    /* renamed from: g */
    private ListView f7722g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2528c f7723h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7724i;

    /* renamed from: j */
    private BluetoothAdapter f7725j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public TextView f7726k;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List<BluetoothDevice> f7727m;

    /* renamed from: n */
    private C2316a f7728n;

    /* renamed from: o */
    private ServiceConnection f7729o = null;

    /* renamed from: p */
    private TextView f7730p;

    /* renamed from: q */
    private ImageView f7731q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C2528c.C2533a f7732r = new C2528c.C2533a() {
        /* renamed from: a */
        public void mo8579a() {
            boolean unused = UI_Select_Port.this.f7724i = true;
            UI_Select_Port.this.f7723h.mo9314a(10.0f);
        }

        /* renamed from: a */
        public void mo8580a(final C2528c.C2534b bVar) {
            if (bVar != null && bVar.f9598a != null && bVar.f9598a.getName() != null && bVar.f9598a.getName().contains("HS_")) {
                UI_Select_Port.this.runOnUiThread(new Runnable() {
                    public void run() {
                        UI_Select_Port.this.runOnUiThread(new Runnable() {
                            public void run() {
                                UI_Select_Port.this.m13137a(bVar.f9598a);
                            }
                        });
                    }
                });
            }
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

    /* renamed from: s */
    private final AdapterView.OnItemClickListener f7733s = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C2528c a = UI_Select_Port.this.f7723h;
            a.getClass();
            new C2528c.C2534b((BluetoothDevice) UI_Select_Port.this.f7727m.get(i));
            UI_Select_Port.this.f7723h.mo9324d();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.bluetooth.device.extra.DEVICE", (Parcelable) UI_Select_Port.this.f7727m.get(i));
            Intent intent = new Intent();
            intent.putExtras(bundle);
            UI_Select_Port.this.setResult(-1, intent);
            UI_Select_Port.this.finish();
        }
    };

    /* renamed from: com.imlabworld.HS_Instructor.UI_Select_Port$a */
    class C2316a extends BaseAdapter {

        /* renamed from: a */
        final Context f7741a;

        /* renamed from: b */
        final List<BluetoothDevice> f7742b;

        /* renamed from: c */
        final LayoutInflater f7743c;

        public C2316a(Context context, List<BluetoothDevice> list) {
            this.f7741a = context;
            this.f7743c = LayoutInflater.from(context);
            this.f7742b = list;
        }

        public int getCount() {
            return this.f7742b.size();
        }

        public Object getItem(int i) {
            return this.f7742b.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewGroup viewGroup2 = view != null ? (ViewGroup) view : (ViewGroup) this.f7743c.inflate(C2656R.layout.device_element, (ViewGroup) null);
            BluetoothDevice bluetoothDevice = this.f7742b.get(i);
            TextView textView = (TextView) viewGroup2.findViewById(C2656R.C2657id.name);
            if (bluetoothDevice.getName() != null && bluetoothDevice.getName().length() > 4) {
                textView.setText(bluetoothDevice.getName().substring(4));
            }
            if (bluetoothDevice.getBondState() == 12) {
                textView.setTextColor(-1);
            } else {
                textView.setTextColor(-1);
            }
            C2528c a = UI_Select_Port.this.f7723h;
            C2528c a2 = UI_Select_Port.this.f7723h;
            a2.getClass();
            if (a.mo9319a(new C2528c.C2534b(bluetoothDevice))) {
                Log.i(UI_Select_Port.f7716l, "connected device::" + bluetoothDevice.getName());
                textView.setTextColor(-1);
            }
            return viewGroup2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13136a() {
        Log.d(f7716l, "populateList");
        this.f7727m = new ArrayList();
        this.f7728n = new C2316a(this, this.f7727m);
        ListView listView = (ListView) findViewById(C2656R.C2657id.new_devices);
        listView.setAdapter(this.f7728n);
        listView.setOnItemClickListener(this.f7733s);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13137a(BluetoothDevice bluetoothDevice) {
        boolean z;
        Iterator<BluetoothDevice> it = this.f7727m.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().getAddress().equals(bluetoothDevice.getAddress())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (bluetoothDevice != null && bluetoothDevice.getName() != null && bluetoothDevice.getName().contains("HS_A") && !z) {
            this.f7726k.setVisibility(8);
            this.f7727m.add(bluetoothDevice);
            this.f7728n.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m13139a(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(5);
        setContentView(C2656R.layout.device_list);
        this.f7726k = (TextView) findViewById(C2656R.C2657id.empty);
        Button button = (Button) findViewById(C2656R.C2657id.btn_cancel);
        this.f7731q = (ImageView) findViewById(C2656R.C2657id.btn_refresh);
        this.f7730p = (TextView) findViewById(C2656R.C2657id.title_devices);
        this.f7726k.setText(C2557y.f9835g.f10312d);
        button.setText(C2557y.f9835g.f10210bD);
        this.f7730p.setText(C2557y.f9835g.f10365e);
        this.f7723h = new C2528c(this, this.f7732r, 6);
        this.f7724i = false;
        m13136a();
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UI_Select_Port.this.finish();
            }
        });
        this.f7731q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                UI_Select_Port.this.f7723h.mo9324d();
                C2528c unused = UI_Select_Port.this.f7723h = new C2528c(UI_Select_Port.this, UI_Select_Port.this.f7732r, 6);
                boolean unused2 = UI_Select_Port.this.f7724i = false;
                UI_Select_Port.this.m13136a();
                UI_Select_Port.this.f7726k.setVisibility(0);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Log.d(f7716l, "OnDestroy");
        if (this.f7724i) {
            this.f7723h.mo9324d();
            this.f7723h.mo9326f();
        }
    }
}
