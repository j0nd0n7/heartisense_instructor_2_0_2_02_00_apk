package android.support.p036v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0047z;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.ag */
public class C1682ag extends C1732az.C1749g {

    /* renamed from: a */
    public static final int f5627a = 0;

    /* renamed from: b */
    public static final int f5628b = 1;

    /* renamed from: c */
    private static final int[] f5629c = {16843284};

    /* renamed from: d */
    private Drawable f5630d;

    /* renamed from: e */
    private int f5631e;

    /* renamed from: f */
    private final Rect f5632f = new Rect();

    public C1682ag(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5629c);
        this.f5630d = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        mo6361a(i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m10095a(Canvas canvas, C1732az azVar) {
        int width;
        int i;
        canvas.save();
        if (azVar.getClipToPadding()) {
            i = azVar.getPaddingLeft();
            width = azVar.getWidth() - azVar.getPaddingRight();
            canvas.clipRect(i, azVar.getPaddingTop(), width, azVar.getHeight() - azVar.getPaddingBottom());
        } else {
            width = azVar.getWidth();
            i = 0;
        }
        int childCount = azVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = azVar.getChildAt(i2);
            azVar.getDecoratedBoundsWithMargins(childAt, this.f5632f);
            int round = Math.round(C1040ar.m5965w(childAt)) + this.f5632f.bottom;
            this.f5630d.setBounds(i, round - this.f5630d.getIntrinsicHeight(), width, round);
            this.f5630d.draw(canvas);
        }
        canvas.restore();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private void m10096b(Canvas canvas, C1732az azVar) {
        int height;
        int i;
        canvas.save();
        if (azVar.getClipToPadding()) {
            i = azVar.getPaddingTop();
            height = azVar.getHeight() - azVar.getPaddingBottom();
            canvas.clipRect(azVar.getPaddingLeft(), i, azVar.getWidth() - azVar.getPaddingRight(), height);
        } else {
            height = azVar.getHeight();
            i = 0;
        }
        int childCount = azVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = azVar.getChildAt(i2);
            azVar.getLayoutManager().mo6871a(childAt, this.f5632f);
            int round = Math.round(C1040ar.m5964v(childAt)) + this.f5632f.right;
            this.f5630d.setBounds(round - this.f5630d.getIntrinsicWidth(), i, round, height);
            this.f5630d.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void mo6361a(int i) {
        if (i == 0 || i == 1) {
            this.f5631e = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    /* renamed from: a */
    public void mo6362a(@C0047z Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f5630d = drawable;
    }

    public void getItemOffsets(Rect rect, View view, C1732az azVar, C1732az.C1771u uVar) {
        if (this.f5631e == 1) {
            rect.set(0, 0, 0, this.f5630d.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f5630d.getIntrinsicWidth(), 0);
        }
    }

    public void onDraw(Canvas canvas, C1732az azVar, C1732az.C1771u uVar) {
        if (azVar.getLayoutManager() != null) {
            if (this.f5631e == 1) {
                m10095a(canvas, azVar);
            } else {
                m10096b(canvas, azVar);
            }
        }
    }
}
