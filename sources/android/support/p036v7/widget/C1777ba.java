package android.support.p036v7.widget;

import android.os.Bundle;
import android.support.p010v4.view.C1066b;
import android.support.p010v4.view.p034a.C0949h;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ba */
public class C1777ba extends C1066b {

    /* renamed from: b */
    final C1732az f5943b;

    /* renamed from: c */
    final C1066b f5944c = new C1066b() {
        /* renamed from: a */
        public void mo3076a(View view, C0949h hVar) {
            super.mo3076a(view, hVar);
            if (!C1777ba.this.mo7107b() && C1777ba.this.f5943b.getLayoutManager() != null) {
                C1777ba.this.f5943b.getLayoutManager().mo6872a(view, hVar);
            }
        }

        /* renamed from: a */
        public boolean mo3077a(View view, int i, Bundle bundle) {
            if (super.mo3077a(view, i, bundle)) {
                return true;
            }
            if (C1777ba.this.mo7107b() || C1777ba.this.f5943b.getLayoutManager() == null) {
                return false;
            }
            return C1777ba.this.f5943b.getLayoutManager().mo6885a(view, i, bundle);
        }
    };

    public C1777ba(C1732az azVar) {
        this.f5943b = azVar;
    }

    /* renamed from: a */
    public void mo3076a(View view, C0949h hVar) {
        super.mo3076a(view, hVar);
        hVar.mo3168b((CharSequence) C1732az.class.getName());
        if (!mo7107b() && this.f5943b.getLayoutManager() != null) {
            this.f5943b.getLayoutManager().mo6859a(hVar);
        }
    }

    /* renamed from: a */
    public boolean mo3077a(View view, int i, Bundle bundle) {
        if (super.mo3077a(view, i, bundle)) {
            return true;
        }
        if (mo7107b() || this.f5943b.getLayoutManager() == null) {
            return false;
        }
        return this.f5943b.getLayoutManager().mo6876a(i, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7107b() {
        return this.f5943b.hasPendingAdapterUpdates();
    }

    /* renamed from: c */
    public C1066b mo7108c() {
        return this.f5944c;
    }

    /* renamed from: d */
    public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3078d(view, accessibilityEvent);
        accessibilityEvent.setClassName(C1732az.class.getName());
        if ((view instanceof C1732az) && !mo7107b()) {
            C1732az azVar = (C1732az) view;
            if (azVar.getLayoutManager() != null) {
                azVar.getLayoutManager().mo5823a(accessibilityEvent);
            }
        }
    }
}
