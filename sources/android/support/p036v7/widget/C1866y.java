package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0036o;
import android.support.p010v4.view.C1034ao;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.y */
public class C1866y extends Spinner implements C1034ao {

    /* renamed from: d */
    private static final int[] f6339d = {16843505};

    /* renamed from: e */
    private static final int f6340e = 15;

    /* renamed from: f */
    private static final String f6341f = "AppCompatSpinner";

    /* renamed from: g */
    private static final int f6342g = 0;

    /* renamed from: h */
    private static final int f6343h = 1;

    /* renamed from: i */
    private static final int f6344i = -1;

    /* renamed from: a */
    C1869b f6345a;

    /* renamed from: b */
    int f6346b;

    /* renamed from: c */
    final Rect f6347c;

    /* renamed from: j */
    private C1843h f6348j;

    /* renamed from: k */
    private Context f6349k;

    /* renamed from: l */
    private C1687ak f6350l;

    /* renamed from: m */
    private SpinnerAdapter f6351m;

    /* renamed from: n */
    private boolean f6352n;

    /* renamed from: android.support.v7.widget.y$a */
    private static class C1868a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f6355a;

        /* renamed from: b */
        private ListAdapter f6356b;

        public C1868a(@C0003aa SpinnerAdapter spinnerAdapter, @C0003aa Resources.Theme theme) {
            this.f6355a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f6356b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C1802bl) {
                C1802bl blVar = (C1802bl) spinnerAdapter;
                if (blVar.mo7278a() == null) {
                    blVar.mo7279a(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f6356b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            if (this.f6355a == null) {
                return 0;
            }
            return this.f6355a.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f6355a == null) {
                return null;
            }
            return this.f6355a.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            if (this.f6355a == null) {
                return null;
            }
            return this.f6355a.getItem(i);
        }

        public long getItemId(int i) {
            if (this.f6355a == null) {
                return -1;
            }
            return this.f6355a.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return this.f6355a != null && this.f6355a.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f6356b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f6355a != null) {
                this.f6355a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f6355a != null) {
                this.f6355a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.y$b */
    private class C1869b extends C1703aq {

        /* renamed from: a */
        ListAdapter f6357a;

        /* renamed from: p */
        private CharSequence f6359p;

        /* renamed from: q */
        private final Rect f6360q = new Rect();

        public C1869b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo6464b((View) C1866y.this);
            mo6460a(true);
            mo6453a(0);
            mo6456a((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(C1866y.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C1866y.this.setSelection(i);
                    if (C1866y.this.getOnItemClickListener() != null) {
                        C1866y.this.performItemClick(view, i, C1869b.this.f6357a.getItemId(i));
                    }
                    C1869b.this.mo5289d();
                }
            });
        }

        /* renamed from: a */
        public void mo5279a() {
            ViewTreeObserver viewTreeObserver;
            boolean e = mo5290e();
            mo7543c();
            mo6484k(2);
            super.mo5279a();
            mo5292g().setChoiceMode(1);
            mo6486l(C1866y.this.getSelectedItemPosition());
            if (!e && (viewTreeObserver = C1866y.this.getViewTreeObserver()) != null) {
                final C18712 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (!C1869b.this.mo7541a((View) C1866y.this)) {
                            C1869b.this.mo5289d();
                            return;
                        }
                        C1869b.this.mo7543c();
                        C1869b.super.mo5279a();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r1);
                mo6459a((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = C1866y.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r1);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo6458a(ListAdapter listAdapter) {
            super.mo6458a(listAdapter);
            this.f6357a = listAdapter;
        }

        /* renamed from: a */
        public void mo7540a(CharSequence charSequence) {
            this.f6359p = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo7541a(View view) {
            return C1040ar.m5909ad(view) && view.getGlobalVisibleRect(this.f6360q);
        }

        /* renamed from: b */
        public CharSequence mo7542b() {
            return this.f6359p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7543c() {
            int i;
            Drawable k = mo6483k();
            if (k != null) {
                k.getPadding(C1866y.this.f6347c);
                i = C1819bu.m11063a(C1866y.this) ? C1866y.this.f6347c.right : -C1866y.this.f6347c.left;
            } else {
                Rect rect = C1866y.this.f6347c;
                C1866y.this.f6347c.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = C1866y.this.getPaddingLeft();
            int paddingRight = C1866y.this.getPaddingRight();
            int width = C1866y.this.getWidth();
            if (C1866y.this.f6346b == -2) {
                int a = C1866y.this.mo7505a((SpinnerAdapter) this.f6357a, mo6483k());
                int i2 = (C1866y.this.getContext().getResources().getDisplayMetrics().widthPixels - C1866y.this.f6347c.left) - C1866y.this.f6347c.right;
                if (a <= i2) {
                    i2 = a;
                }
                mo6477h(Math.max(i2, (width - paddingLeft) - paddingRight));
            } else if (C1866y.this.f6346b == -1) {
                mo6477h((width - paddingLeft) - paddingRight);
            } else {
                mo6477h(C1866y.this.f6346b);
            }
            mo6472d(C1819bu.m11063a(C1866y.this) ? ((width - paddingRight) - mo6492p()) + i : i + paddingLeft);
        }
    }

    public C1866y(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1866y(Context context, int i) {
        this(context, (AttributeSet) null, C1359b.C1361b.spinnerStyle, i);
    }

    public C1866y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.spinnerStyle);
    }

    public C1866y(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C1866y(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1866y(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            r8 = this;
            r1 = 0
            r3 = 1
            r7 = 0
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f6347c = r0
            int[] r0 = android.support.p036v7.p037a.C1359b.C1371l.Spinner
            android.support.v7.widget.bp r4 = android.support.p036v7.widget.C1807bp.m10923a(r9, r10, r0, r11, r7)
            android.support.v7.widget.h r0 = new android.support.v7.widget.h
            r0.<init>(r8)
            r8.f6348j = r0
            if (r13 == 0) goto L_0x00af
            android.support.v7.view.d r0 = new android.support.v7.view.d
            r0.<init>((android.content.Context) r9, (android.content.res.Resources.Theme) r13)
            r8.f6349k = r0
        L_0x0023:
            android.content.Context r0 = r8.f6349k
            if (r0 == 0) goto L_0x0081
            r0 = -1
            if (r12 != r0) goto L_0x0049
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 11
            if (r0 < r2) goto L_0x00e5
            int[] r0 = f6339d     // Catch:{ Exception -> 0x00cd, all -> 0x00dd }
            r2 = 0
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r0, r11, r2)     // Catch:{ Exception -> 0x00cd, all -> 0x00dd }
            r0 = 0
            boolean r0 = r2.hasValue(r0)     // Catch:{ Exception -> 0x00ea }
            if (r0 == 0) goto L_0x0044
            r0 = 0
            r5 = 0
            int r12 = r2.getInt(r0, r5)     // Catch:{ Exception -> 0x00ea }
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r2.recycle()
        L_0x0049:
            if (r12 != r3) goto L_0x0081
            android.support.v7.widget.y$b r0 = new android.support.v7.widget.y$b
            android.content.Context r2 = r8.f6349k
            r0.<init>(r2, r10, r11)
            android.content.Context r2 = r8.f6349k
            int[] r5 = android.support.p036v7.p037a.C1359b.C1371l.Spinner
            android.support.v7.widget.bp r2 = android.support.p036v7.widget.C1807bp.m10923a(r2, r10, r5, r11, r7)
            int r5 = android.support.p036v7.p037a.C1359b.C1371l.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r2.mo7310f(r5, r6)
            r8.f6346b = r5
            int r5 = android.support.p036v7.p037a.C1359b.C1371l.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r2.mo7293a(r5)
            r0.mo6463b((android.graphics.drawable.Drawable) r5)
            int r5 = android.support.p036v7.p037a.C1359b.C1371l.Spinner_android_prompt
            java.lang.String r5 = r4.mo7307e(r5)
            r0.mo7540a((java.lang.CharSequence) r5)
            r2.mo7308e()
            r8.f6345a = r0
            android.support.v7.widget.y$1 r2 = new android.support.v7.widget.y$1
            r2.<init>(r8, r0)
            r8.f6350l = r2
        L_0x0081:
            int r0 = android.support.p036v7.p037a.C1359b.C1371l.Spinner_android_entries
            java.lang.CharSequence[] r0 = r4.mo7314h(r0)
            if (r0 == 0) goto L_0x0099
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r9, r5, r0)
            int r0 = android.support.p036v7.p037a.C1359b.C1368i.support_simple_spinner_dropdown_item
            r2.setDropDownViewResource(r0)
            r8.setAdapter((android.widget.SpinnerAdapter) r2)
        L_0x0099:
            r4.mo7308e()
            r8.f6352n = r3
            android.widget.SpinnerAdapter r0 = r8.f6351m
            if (r0 == 0) goto L_0x00a9
            android.widget.SpinnerAdapter r0 = r8.f6351m
            r8.setAdapter((android.widget.SpinnerAdapter) r0)
            r8.f6351m = r1
        L_0x00a9:
            android.support.v7.widget.h r0 = r8.f6348j
            r0.mo7425a(r10, r11)
            return
        L_0x00af:
            int r0 = android.support.p036v7.p037a.C1359b.C1371l.Spinner_popupTheme
            int r0 = r4.mo7312g(r0, r7)
            if (r0 == 0) goto L_0x00c0
            android.support.v7.view.d r2 = new android.support.v7.view.d
            r2.<init>((android.content.Context) r9, (int) r0)
            r8.f6349k = r2
            goto L_0x0023
        L_0x00c0:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 >= r2) goto L_0x00cb
            r0 = r9
        L_0x00c7:
            r8.f6349k = r0
            goto L_0x0023
        L_0x00cb:
            r0 = r1
            goto L_0x00c7
        L_0x00cd:
            r0 = move-exception
            r2 = r1
        L_0x00cf:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r0)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x0049
            r2.recycle()
            goto L_0x0049
        L_0x00dd:
            r0 = move-exception
            r2 = r1
        L_0x00df:
            if (r2 == 0) goto L_0x00e4
            r2.recycle()
        L_0x00e4:
            throw r0
        L_0x00e5:
            r12 = r3
            goto L_0x0049
        L_0x00e8:
            r0 = move-exception
            goto L_0x00df
        L_0x00ea:
            r0 = move-exception
            goto L_0x00cf
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1866y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7505a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        View view;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view2 = null;
        int i = 0;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
            } else {
                itemViewType = i2;
                view = view2;
            }
            view2 = spinnerAdapter.getView(max2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view2.getMeasuredWidth());
            max2++;
            i2 = itemViewType;
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.f6347c);
        return this.f6347c.left + this.f6347c.right + i;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6348j != null) {
            this.f6348j.mo7428c();
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f6345a != null) {
            return this.f6345a.mo6489n();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        if (this.f6345a != null) {
            return this.f6345a.mo6491o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f6345a != null) {
            return this.f6346b;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        if (this.f6345a != null) {
            return this.f6345a.mo6483k();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f6345a != null) {
            return this.f6349k;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        return this.f6345a != null ? this.f6345a.mo7542b() : super.getPrompt();
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f6348j != null) {
            return this.f6348j.mo7420a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f6348j != null) {
            return this.f6348j.mo7426b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f6345a != null && this.f6345a.mo5290e()) {
            this.f6345a.mo5289d();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6345a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo7505a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6350l == null || !this.f6350l.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        if (this.f6345a == null) {
            return super.performClick();
        }
        if (!this.f6345a.mo5290e()) {
            this.f6345a.mo5279a();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6352n) {
            this.f6351m = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f6345a != null) {
            this.f6345a.mo6458a((ListAdapter) new C1868a(spinnerAdapter, (this.f6349k == null ? getContext() : this.f6349k).getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f6348j != null) {
            this.f6348j.mo7424a(drawable);
        }
    }

    public void setBackgroundResource(@C0036o int i) {
        super.setBackgroundResource(i);
        if (this.f6348j != null) {
            this.f6348j.mo7421a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f6345a != null) {
            this.f6345a.mo6472d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f6345a != null) {
            this.f6345a.mo6473e(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f6345a != null) {
            this.f6346b = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f6345a != null) {
            this.f6345a.mo6463b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@C0036o int i) {
        setPopupBackgroundDrawable(C1477b.m8692b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f6345a != null) {
            this.f6345a.mo7540a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f6348j != null) {
            this.f6348j.mo7422a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f6348j != null) {
            this.f6348j.mo7423a(mode);
        }
    }
}
