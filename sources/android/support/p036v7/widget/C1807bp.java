package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.util.AttributeSet;
import android.util.TypedValue;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.bp */
public class C1807bp {

    /* renamed from: a */
    private final Context f6105a;

    /* renamed from: b */
    private final TypedArray f6106b;

    /* renamed from: c */
    private TypedValue f6107c;

    private C1807bp(Context context, TypedArray typedArray) {
        this.f6105a = context;
        this.f6106b = typedArray;
    }

    /* renamed from: a */
    public static C1807bp m10921a(Context context, int i, int[] iArr) {
        return new C1807bp(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C1807bp m10922a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1807bp(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C1807bp m10923a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1807bp(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public float mo7288a(int i, float f) {
        return this.f6106b.getFloat(i, f);
    }

    /* renamed from: a */
    public float mo7289a(int i, int i2, int i3, float f) {
        return this.f6106b.getFraction(i, i2, i3, f);
    }

    /* renamed from: a */
    public int mo7290a() {
        return this.f6106b.length();
    }

    /* renamed from: a */
    public int mo7291a(int i, int i2) {
        return this.f6106b.getInt(i, i2);
    }

    /* renamed from: a */
    public int mo7292a(int i, String str) {
        return this.f6106b.getLayoutDimension(i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f6106b.getResourceId(r3, 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable mo7293a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f6106b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f6106b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r1 = r2.f6105a
            android.graphics.drawable.Drawable r0 = android.support.p036v7.p038b.p039a.C1477b.m8692b(r1, r0)
        L_0x0017:
            return r0
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f6106b
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1807bp.mo7293a(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public boolean mo7294a(int i, TypedValue typedValue) {
        return this.f6106b.getValue(i, typedValue);
    }

    /* renamed from: a */
    public boolean mo7295a(int i, boolean z) {
        return this.f6106b.getBoolean(i, z);
    }

    /* renamed from: b */
    public float mo7296b(int i, float f) {
        return this.f6106b.getDimension(i, f);
    }

    /* renamed from: b */
    public int mo7297b() {
        return this.f6106b.getIndexCount();
    }

    /* renamed from: b */
    public int mo7298b(int i, int i2) {
        return this.f6106b.getColor(i, i2);
    }

    /* renamed from: b */
    public Drawable mo7299b(int i) {
        int resourceId;
        if (!this.f6106b.hasValue(i) || (resourceId = this.f6106b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1849m.m11201a().mo7452a(this.f6105a, resourceId, true);
    }

    /* renamed from: c */
    public int mo7300c(int i) {
        return this.f6106b.getIndex(i);
    }

    /* renamed from: c */
    public int mo7301c(int i, int i2) {
        return this.f6106b.getInteger(i, i2);
    }

    /* renamed from: c */
    public Resources mo7302c() {
        return this.f6106b.getResources();
    }

    /* renamed from: d */
    public int mo7303d(int i, int i2) {
        return this.f6106b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public CharSequence mo7304d(int i) {
        return this.f6106b.getText(i);
    }

    /* renamed from: d */
    public String mo7305d() {
        return this.f6106b.getPositionDescription();
    }

    /* renamed from: e */
    public int mo7306e(int i, int i2) {
        return this.f6106b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public String mo7307e(int i) {
        return this.f6106b.getString(i);
    }

    /* renamed from: e */
    public void mo7308e() {
        this.f6106b.recycle();
    }

    /* renamed from: f */
    public int mo7309f() {
        return this.f6106b.getChangingConfigurations();
    }

    /* renamed from: f */
    public int mo7310f(int i, int i2) {
        return this.f6106b.getLayoutDimension(i, i2);
    }

    /* renamed from: f */
    public String mo7311f(int i) {
        return this.f6106b.getNonResourceString(i);
    }

    /* renamed from: g */
    public int mo7312g(int i, int i2) {
        return this.f6106b.getResourceId(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = android.support.p036v7.p038b.p039a.C1477b.m8689a(r2.f6105a, (r0 = r2.f6106b.getResourceId(r3, 0)));
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList mo7313g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f6106b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f6106b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f6105a
            android.content.res.ColorStateList r0 = android.support.p036v7.p038b.p039a.C1477b.m8689a(r1, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f6106b
            android.content.res.ColorStateList r0 = r0.getColorStateList(r3)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1807bp.mo7313g(int):android.content.res.ColorStateList");
    }

    /* renamed from: h */
    public CharSequence[] mo7314h(int i) {
        return this.f6106b.getTextArray(i);
    }

    /* renamed from: i */
    public int mo7315i(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f6106b.getType(i);
        }
        if (this.f6107c == null) {
            this.f6107c = new TypedValue();
        }
        this.f6106b.getValue(i, this.f6107c);
        return this.f6107c.type;
    }

    /* renamed from: j */
    public boolean mo7316j(int i) {
        return this.f6106b.hasValue(i);
    }

    /* renamed from: k */
    public TypedValue mo7317k(int i) {
        return this.f6106b.peekValue(i);
    }
}
