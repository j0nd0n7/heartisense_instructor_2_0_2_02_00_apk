package android.support.p036v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.p010v4.view.C1023aj;
import android.support.p036v7.app.C1413e;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1567p;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: android.support.v7.view.menu.i */
class C1553i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, C1567p.C1568a {

    /* renamed from: a */
    C1547f f4977a;

    /* renamed from: b */
    private C1550h f4978b;

    /* renamed from: c */
    private C1413e f4979c;

    /* renamed from: d */
    private C1567p.C1568a f4980d;

    public C1553i(C1550h hVar) {
        this.f4978b = hVar;
    }

    /* renamed from: a */
    public void mo5404a() {
        if (this.f4979c != null) {
            this.f4979c.dismiss();
        }
    }

    /* renamed from: a */
    public void mo5405a(IBinder iBinder) {
        C1550h hVar = this.f4978b;
        C1413e.C1414a aVar = new C1413e.C1414a(hVar.mo5376f());
        this.f4977a = new C1547f(aVar.mo4779a(), C1359b.C1368i.abc_list_menu_item_layout);
        this.f4977a.mo5262a((C1567p.C1568a) this);
        this.f4978b.mo5336a((C1567p) this.f4977a);
        aVar.mo4795a(this.f4977a.mo5301a(), (DialogInterface.OnClickListener) this);
        View p = hVar.mo5391p();
        if (p != null) {
            aVar.mo4791a(p);
        } else {
            aVar.mo4790a(hVar.mo5390o()).mo4796a(hVar.mo5389n());
        }
        aVar.mo4786a((DialogInterface.OnKeyListener) this);
        this.f4979c = aVar.mo4808b();
        this.f4979c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f4979c.getWindow().getAttributes();
        attributes.type = C1023aj.f3437e;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f4979c.show();
    }

    /* renamed from: a */
    public void mo4932a(C1550h hVar, boolean z) {
        if (z || hVar == this.f4978b) {
            mo5404a();
        }
        if (this.f4980d != null) {
            this.f4980d.mo4932a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo5406a(C1567p.C1568a aVar) {
        this.f4980d = aVar;
    }

    /* renamed from: a */
    public boolean mo4933a(C1550h hVar) {
        if (this.f4980d != null) {
            return this.f4980d.mo4933a(hVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f4978b.mo5343a((MenuItem) (C1555k) this.f4977a.mo5301a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f4977a.mo5260a(this.f4978b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f4979c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f4979c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f4978b.mo5359b(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f4978b.performShortcut(i, keyEvent, 0);
    }
}
