package android.support.p036v7.view.menu;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.C0007ae;
import android.support.p010v4.p023h.p024a.C0538a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v7.view.menu.s */
class C1572s extends C1539c<C0538a> implements Menu {
    C1572s(Context context, C0538a aVar) {
        super(context, aVar);
    }

    public MenuItem add(int i) {
        return mo5273a(((C0538a) this.f4888b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo5273a(((C0538a) this.f4888b).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo5273a(((C0538a) this.f4888b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo5273a(((C0538a) this.f4888b).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((C0538a) this.f4888b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = mo5273a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo5274a(((C0538a) this.f4888b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo5274a(((C0538a) this.f4888b).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo5274a(((C0538a) this.f4888b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo5274a(((C0538a) this.f4888b).addSubMenu(charSequence));
    }

    public void clear() {
        mo5275a();
        ((C0538a) this.f4888b).clear();
    }

    public void close() {
        ((C0538a) this.f4888b).close();
    }

    public MenuItem findItem(int i) {
        return mo5273a(((C0538a) this.f4888b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo5273a(((C0538a) this.f4888b).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((C0538a) this.f4888b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((C0538a) this.f4888b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((C0538a) this.f4888b).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((C0538a) this.f4888b).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo5276a(i);
        ((C0538a) this.f4888b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo5277b(i);
        ((C0538a) this.f4888b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((C0538a) this.f4888b).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((C0538a) this.f4888b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((C0538a) this.f4888b).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((C0538a) this.f4888b).setQwertyMode(z);
    }

    public int size() {
        return ((C0538a) this.f4888b).size();
    }
}
