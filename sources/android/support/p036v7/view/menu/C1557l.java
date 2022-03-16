package android.support.p036v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1189u;
import android.support.p036v7.view.C1524c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@C0007ae(mo1a = 14)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
@TargetApi(14)
/* renamed from: android.support.v7.view.menu.l */
public class C1557l extends C1539c<C0539b> implements MenuItem {

    /* renamed from: c */
    static final String f5017c = "MenuItemWrapper";

    /* renamed from: d */
    private Method f5018d;

    /* renamed from: android.support.v7.view.menu.l$a */
    class C1558a extends C1147e {

        /* renamed from: a */
        final ActionProvider f5019a;

        public C1558a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f5019a = actionProvider;
        }

        /* renamed from: a */
        public void mo3961a(SubMenu subMenu) {
            this.f5019a.onPrepareSubMenu(C1557l.this.mo5274a(subMenu));
        }

        /* renamed from: b */
        public View mo3963b() {
            return this.f5019a.onCreateActionView();
        }

        /* renamed from: f */
        public boolean mo3967f() {
            return this.f5019a.onPerformDefaultAction();
        }

        /* renamed from: g */
        public boolean mo3968g() {
            return this.f5019a.hasSubMenu();
        }
    }

    /* renamed from: android.support.v7.view.menu.l$b */
    static class C1559b extends FrameLayout implements C1524c {

        /* renamed from: a */
        final CollapsibleActionView f5021a;

        C1559b(View view) {
            super(view.getContext());
            this.f5021a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo5124a() {
            this.f5021a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo5125b() {
            this.f5021a.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo5515c() {
            return (View) this.f5021a;
        }
    }

    /* renamed from: android.support.v7.view.menu.l$c */
    private class C1560c extends C1540d<MenuItem.OnActionExpandListener> implements C1189u.C1195e {
        C1560c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        /* renamed from: a */
        public boolean mo4022a(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f4888b).onMenuItemActionExpand(C1557l.this.mo5273a(menuItem));
        }

        /* renamed from: b */
        public boolean mo4023b(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f4888b).onMenuItemActionCollapse(C1557l.this.mo5273a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.l$d */
    private class C1561d extends C1540d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        C1561d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f4888b).onMenuItemClick(C1557l.this.mo5273a(menuItem));
        }
    }

    C1557l(Context context, C0539b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1558a mo5472a(ActionProvider actionProvider) {
        return new C1558a(this.f4885a, actionProvider);
    }

    /* renamed from: a */
    public void mo5473a(boolean z) {
        try {
            if (this.f5018d == null) {
                this.f5018d = ((C0539b) this.f4888b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f5018d.invoke(this.f4888b, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w(f5017c, "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0539b) this.f4888b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0539b) this.f4888b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C1147e a = ((C0539b) this.f4888b).mo1932a();
        if (a instanceof C1558a) {
            return ((C1558a) a).f5019a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((C0539b) this.f4888b).getActionView();
        return actionView instanceof C1559b ? ((C1559b) actionView).mo5515c() : actionView;
    }

    public char getAlphabeticShortcut() {
        return ((C0539b) this.f4888b).getAlphabeticShortcut();
    }

    public int getGroupId() {
        return ((C0539b) this.f4888b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0539b) this.f4888b).getIcon();
    }

    public Intent getIntent() {
        return ((C0539b) this.f4888b).getIntent();
    }

    public int getItemId() {
        return ((C0539b) this.f4888b).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C0539b) this.f4888b).getMenuInfo();
    }

    public char getNumericShortcut() {
        return ((C0539b) this.f4888b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0539b) this.f4888b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo5274a(((C0539b) this.f4888b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0539b) this.f4888b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0539b) this.f4888b).getTitleCondensed();
    }

    public boolean hasSubMenu() {
        return ((C0539b) this.f4888b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0539b) this.f4888b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0539b) this.f4888b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0539b) this.f4888b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0539b) this.f4888b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0539b) this.f4888b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0539b) this.f4888b).mo1930a((C1147e) actionProvider != null ? mo5472a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0539b) this.f4888b).setActionView(i);
        View actionView = ((C0539b) this.f4888b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0539b) this.f4888b).setActionView((View) new C1559b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1559b(view);
        }
        ((C0539b) this.f4888b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0539b) this.f4888b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0539b) this.f4888b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0539b) this.f4888b).setChecked(z);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0539b) this.f4888b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0539b) this.f4888b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0539b) this.f4888b).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0539b) this.f4888b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0539b) this.f4888b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((C0539b) this.f4888b).mo1931a((C1189u.C1195e) onActionExpandListener != null ? new C1560c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((C0539b) this.f4888b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C1561d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0539b) this.f4888b).setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0539b) this.f4888b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0539b) this.f4888b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0539b) this.f4888b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0539b) this.f4888b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0539b) this.f4888b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0539b) this.f4888b).setVisible(z);
    }
}
