package android.support.p036v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p014d.p016b.C0420a;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1569q;
import android.support.p036v7.widget.ActionMenuView;
import android.support.p036v7.widget.C1664ab;
import android.support.p036v7.widget.C1687ak;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C1664ab implements C1569q.C1570a, ActionMenuView.C1584a, View.OnClickListener, View.OnLongClickListener {

    /* renamed from: d */
    private static final String f4822d = "ActionMenuItemView";

    /* renamed from: l */
    private static final int f4823l = 32;

    /* renamed from: a */
    C1555k f4824a;

    /* renamed from: b */
    C1550h.C1552b f4825b;

    /* renamed from: c */
    C1536b f4826c;

    /* renamed from: e */
    private CharSequence f4827e;

    /* renamed from: f */
    private Drawable f4828f;

    /* renamed from: g */
    private C1687ak f4829g;

    /* renamed from: h */
    private boolean f4830h;

    /* renamed from: i */
    private boolean f4831i;

    /* renamed from: j */
    private int f4832j;

    /* renamed from: k */
    private int f4833k;

    /* renamed from: m */
    private int f4834m;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    private class C1535a extends C1687ak {
        public C1535a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public C1573t mo5206a() {
            if (ActionMenuItemView.this.f4826c != null) {
                return ActionMenuItemView.this.f4826c.mo5208a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r1 = mo5206a();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5207b() {
            /*
                r3 = this;
                r0 = 0
                android.support.v7.view.menu.ActionMenuItemView r1 = android.support.p036v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.h$b r1 = r1.f4825b
                if (r1 == 0) goto L_0x0022
                android.support.v7.view.menu.ActionMenuItemView r1 = android.support.p036v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.h$b r1 = r1.f4825b
                android.support.v7.view.menu.ActionMenuItemView r2 = android.support.p036v7.view.menu.ActionMenuItemView.this
                android.support.v7.view.menu.k r2 = r2.f4824a
                boolean r1 = r1.mo5210a(r2)
                if (r1 == 0) goto L_0x0022
                android.support.v7.view.menu.t r1 = r3.mo5206a()
                if (r1 == 0) goto L_0x0022
                boolean r1 = r1.mo5290e()
                if (r1 == 0) goto L_0x0022
                r0 = 1
            L_0x0022:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.view.menu.ActionMenuItemView.C1535a.mo5207b():boolean");
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C1536b {
        /* renamed from: a */
        public abstract C1573t mo5208a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f4830h = m8954f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ActionMenuItemView, i, 0);
        this.f4832j = obtainStyledAttributes.getDimensionPixelSize(C1359b.C1371l.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f4834m = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f4833k = -1;
        setSaveEnabled(false);
    }

    /* renamed from: f */
    private boolean m8954f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int b = C0420a.m2328b(getResources());
        return b >= 480 || (b >= 640 && C0420a.m2327a(getResources()) >= 480) || configuration.orientation == 2;
    }

    /* renamed from: g */
    private void m8955g() {
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(this.f4827e);
        if (this.f4828f == null || (this.f4824a.mo5453n() && (this.f4830h || this.f4831i))) {
            z = true;
        }
        setText(z2 & z ? this.f4827e : null);
    }

    /* renamed from: a */
    public void mo5184a(C1555k kVar, int i) {
        this.f4824a = kVar;
        setIcon(kVar.getIcon());
        setTitle(kVar.mo5415a((C1569q.C1570a) this));
        setId(kVar.getItemId());
        setVisibility(kVar.isVisible() ? 0 : 8);
        setEnabled(kVar.isEnabled());
        if (kVar.hasSubMenu() && this.f4829g == null) {
            this.f4829g = new C1535a();
        }
    }

    /* renamed from: a */
    public void mo5185a(boolean z, char c) {
    }

    /* renamed from: a */
    public boolean mo5186a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo5187b() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: c */
    public boolean mo5188c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo5189d() {
        return mo5187b() && this.f4824a.getIcon() == null;
    }

    /* renamed from: e */
    public boolean mo5190e() {
        return mo5187b();
    }

    public C1555k getItemData() {
        return this.f4824a;
    }

    public void onClick(View view) {
        if (this.f4825b != null) {
            this.f4825b.mo5210a(this.f4824a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4830h = m8954f();
        m8955g();
    }

    public boolean onLongClick(View view) {
        if (mo5187b()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = (width / 2) + iArr[0];
        if (C1040ar.m5947k(view) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast makeText = Toast.makeText(context, this.f4824a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean b = mo5187b();
        if (b && this.f4833k >= 0) {
            super.setPadding(this.f4833k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f4832j) : this.f4832j;
        if (mode != 1073741824 && this.f4832j > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!b && this.f4828f != null) {
            super.setPadding((getMeasuredWidth() - this.f4828f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4824a.hasSubMenu() || this.f4829g == null || !this.f4829g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4831i != z) {
            this.f4831i = z;
            if (this.f4824a != null) {
                this.f4824a.mo5444i();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4828f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f4834m) {
                float f = ((float) this.f4834m) / ((float) intrinsicWidth);
                intrinsicWidth = this.f4834m;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f4834m) {
                float f2 = ((float) this.f4834m) / ((float) intrinsicHeight);
                intrinsicHeight = this.f4834m;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m8955g();
    }

    public void setItemInvoker(C1550h.C1552b bVar) {
        this.f4825b = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f4833k = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C1536b bVar) {
        this.f4826c = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4827e = charSequence;
        setContentDescription(this.f4827e);
        m8955g();
    }
}
