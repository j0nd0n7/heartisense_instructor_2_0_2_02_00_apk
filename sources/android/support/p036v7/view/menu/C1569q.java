package android.support.p036v7.view.menu;

import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.q */
public interface C1569q {

    /* renamed from: android.support.v7.view.menu.q$a */
    public interface C1570a {
        /* renamed from: a */
        void mo5184a(C1555k kVar, int i);

        /* renamed from: a */
        void mo5185a(boolean z, char c);

        /* renamed from: a */
        boolean mo5186a();

        /* renamed from: c */
        boolean mo5188c();

        C1555k getItemData();

        void setCheckable(boolean z);

        void setChecked(boolean z);

        void setEnabled(boolean z);

        void setIcon(Drawable drawable);

        void setTitle(CharSequence charSequence);
    }

    /* renamed from: a */
    void mo5209a(C1550h hVar);

    int getWindowAnimations();
}
