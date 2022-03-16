package android.support.p036v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0540c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

@C0007ae(mo1a = 14)
@TargetApi(14)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.w */
class C1577w extends C1572s implements SubMenu {
    C1577w(Context context, C0540c cVar) {
        super(context, cVar);
    }

    /* renamed from: c */
    public C0540c mo5278b() {
        return (C0540c) this.f4888b;
    }

    public void clearHeader() {
        mo5278b().clearHeader();
    }

    public MenuItem getItem() {
        return mo5273a(mo5278b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        mo5278b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        mo5278b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        mo5278b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        mo5278b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        mo5278b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        mo5278b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        mo5278b().setIcon(drawable);
        return this;
    }
}
