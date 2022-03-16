package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p036v7.view.menu.C1549g;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.at */
public class C1715at extends C1703aq implements C1714as {

    /* renamed from: a */
    private static final String f5795a = "MenuPopupWindow";

    /* renamed from: b */
    private static Method f5796b;

    /* renamed from: p */
    private C1714as f5797p;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.at$a */
    public static class C1716a extends C1684ai {

        /* renamed from: i */
        final int f5798i;

        /* renamed from: j */
        final int f5799j;

        /* renamed from: k */
        private C1714as f5800k;

        /* renamed from: l */
        private MenuItem f5801l;

        public C1716a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f5798i = 22;
                this.f5799j = 21;
                return;
            }
            this.f5798i = 21;
            this.f5799j = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo6364a(MotionEvent motionEvent, int i) {
            return super.mo6364a(motionEvent, i);
        }

        /* renamed from: d */
        public void mo6531d() {
            setSelection(-1);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            r1 = (r3 = pointToPosition((int) r6.getX(), (int) r6.getY())) - r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onHoverEvent(android.view.MotionEvent r6) {
            /*
                r5 = this;
                android.support.v7.widget.as r0 = r5.f5800k
                if (r0 == 0) goto L_0x0058
                android.widget.ListAdapter r0 = r5.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x005d
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                android.support.v7.view.menu.g r0 = (android.support.p036v7.view.menu.C1549g) r0
            L_0x0018:
                r2 = 0
                int r3 = r6.getAction()
                r4 = 10
                if (r3 == r4) goto L_0x0061
                float r3 = r6.getX()
                int r3 = (int) r3
                float r4 = r6.getY()
                int r4 = (int) r4
                int r3 = r5.pointToPosition(r3, r4)
                r4 = -1
                if (r3 == r4) goto L_0x0061
                int r1 = r3 - r1
                if (r1 < 0) goto L_0x0061
                int r3 = r0.getCount()
                if (r1 >= r3) goto L_0x0061
                android.support.v7.view.menu.k r1 = r0.getItem((int) r1)
            L_0x0040:
                android.view.MenuItem r2 = r5.f5801l
                if (r2 == r1) goto L_0x0058
                android.support.v7.view.menu.h r0 = r0.mo5318b()
                if (r2 == 0) goto L_0x004f
                android.support.v7.widget.as r3 = r5.f5800k
                r3.mo5297a(r0, r2)
            L_0x004f:
                r5.f5801l = r1
                if (r1 == 0) goto L_0x0058
                android.support.v7.widget.as r2 = r5.f5800k
                r2.mo5298b(r0, r1)
            L_0x0058:
                boolean r0 = super.onHoverEvent(r6)
                return r0
            L_0x005d:
                r1 = 0
                android.support.v7.view.menu.g r0 = (android.support.p036v7.view.menu.C1549g) r0
                goto L_0x0018
            L_0x0061:
                r1 = r2
                goto L_0x0040
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1715at.C1716a.onHoverEvent(android.view.MotionEvent):boolean");
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f5798i) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f5799j) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C1549g) getAdapter()).mo5318b().mo5359b(false);
                return true;
            }
        }

        public void setHoverListener(C1714as asVar) {
            this.f5800k = asVar;
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f5796b = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i(f5795a, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C1715at(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1684ai mo6452a(Context context, boolean z) {
        C1716a aVar = new C1716a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo5297a(@C0047z C1550h hVar, @C0047z MenuItem menuItem) {
        if (this.f5797p != null) {
            this.f5797p.mo5297a(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo6527a(C1714as asVar) {
        this.f5797p = asVar;
    }

    /* renamed from: a */
    public void mo6528a(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f5766h.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo5298b(@C0047z C1550h hVar, @C0047z MenuItem menuItem) {
        if (this.f5797p != null) {
            this.f5797p.mo5298b(hVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo6529b(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f5766h.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: d */
    public void mo6530d(boolean z) {
        if (f5796b != null) {
            try {
                f5796b.invoke(this.f5766h, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i(f5795a, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
