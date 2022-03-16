package android.support.p036v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1189u;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.a */
public class C1537a implements C0539b {

    /* renamed from: s */
    private static final int f4855s = 0;

    /* renamed from: u */
    private static final int f4856u = 1;

    /* renamed from: v */
    private static final int f4857v = 2;

    /* renamed from: w */
    private static final int f4858w = 4;

    /* renamed from: x */
    private static final int f4859x = 8;

    /* renamed from: y */
    private static final int f4860y = 16;

    /* renamed from: f */
    private final int f4861f;

    /* renamed from: g */
    private final int f4862g;

    /* renamed from: h */
    private final int f4863h;

    /* renamed from: i */
    private final int f4864i;

    /* renamed from: j */
    private CharSequence f4865j;

    /* renamed from: k */
    private CharSequence f4866k;

    /* renamed from: l */
    private Intent f4867l;

    /* renamed from: m */
    private char f4868m;

    /* renamed from: n */
    private char f4869n;

    /* renamed from: o */
    private Drawable f4870o;

    /* renamed from: p */
    private int f4871p = 0;

    /* renamed from: q */
    private Context f4872q;

    /* renamed from: r */
    private MenuItem.OnMenuItemClickListener f4873r;

    /* renamed from: t */
    private int f4874t = 16;

    public C1537a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f4872q = context;
        this.f4861f = i2;
        this.f4862g = i;
        this.f4863h = i3;
        this.f4864i = i4;
        this.f4865j = charSequence;
    }

    /* renamed from: a */
    public C0539b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0539b mo1930a(C1147e eVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C0539b mo1931a(C1189u.C1195e eVar) {
        return this;
    }

    /* renamed from: a */
    public C0539b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C1147e mo1932a() {
        return null;
    }

    /* renamed from: a */
    public C1537a mo5219a(boolean z) {
        this.f4874t = (z ? 4 : 0) | (this.f4874t & -5);
        return this;
    }

    /* renamed from: b */
    public C0539b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: b */
    public boolean mo5221b() {
        if (this.f4873r != null && this.f4873r.onMenuItemClick(this)) {
            return true;
        }
        if (this.f4867l == null) {
            return false;
        }
        this.f4872q.startActivity(this.f4867l);
        return true;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public char getAlphabeticShortcut() {
        return this.f4869n;
    }

    public int getGroupId() {
        return this.f4862g;
    }

    public Drawable getIcon() {
        return this.f4870o;
    }

    public Intent getIntent() {
        return this.f4867l;
    }

    public int getItemId() {
        return this.f4861f;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f4868m;
    }

    public int getOrder() {
        return this.f4864i;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f4865j;
    }

    public CharSequence getTitleCondensed() {
        return this.f4866k != null ? this.f4866k : this.f4865j;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f4874t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f4874t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f4874t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f4874t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f4869n = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f4874t = (z ? 1 : 0) | (this.f4874t & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f4874t = (z ? 2 : 0) | (this.f4874t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f4874t = (z ? 16 : 0) | (this.f4874t & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f4871p = i;
        this.f4870o = C0434d.m2370a(this.f4872q, i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f4870o = drawable;
        this.f4871p = 0;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f4867l = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f4868m = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4873r = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f4868m = c;
        this.f4869n = c2;
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(int i) {
        this.f4865j = this.f4872q.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f4865j = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4866k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f4874t = (z ? 0 : 8) | (this.f4874t & 8);
        return this;
    }
}
