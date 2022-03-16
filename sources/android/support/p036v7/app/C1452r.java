package android.support.p036v7.app;

import android.support.p036v7.app.C1385a;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.r */
class C1452r implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private final C1385a.C1390e f4539a;

    public C1452r(C1385a.C1390e eVar) {
        this.f4539a = eVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f4539a != null) {
            this.f4539a.mo4683a(i, j);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
