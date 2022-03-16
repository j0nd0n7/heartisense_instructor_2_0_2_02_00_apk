package android.support.p036v7.p040c.p041a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.annotation.C0032k;
import android.support.annotation.C0037p;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v7.c.a.b */
public class C1481b extends Drawable {

    /* renamed from: a */
    public static final int f4595a = 0;

    /* renamed from: b */
    public static final int f4596b = 1;

    /* renamed from: c */
    public static final int f4597c = 2;

    /* renamed from: d */
    public static final int f4598d = 3;

    /* renamed from: f */
    private static final float f4599f = ((float) Math.toRadians(45.0d));

    /* renamed from: e */
    private final Paint f4600e = new Paint();

    /* renamed from: g */
    private float f4601g;

    /* renamed from: h */
    private float f4602h;

    /* renamed from: i */
    private float f4603i;

    /* renamed from: j */
    private float f4604j;

    /* renamed from: k */
    private boolean f4605k;

    /* renamed from: l */
    private final Path f4606l = new Path();

    /* renamed from: m */
    private final int f4607m;

    /* renamed from: n */
    private boolean f4608n = false;

    /* renamed from: o */
    private float f4609o;

    /* renamed from: p */
    private float f4610p;

    /* renamed from: q */
    private int f4611q = 2;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.c.a.b$a */
    public @interface C1482a {
    }

    public C1481b(Context context) {
        this.f4600e.setStyle(Paint.Style.STROKE);
        this.f4600e.setStrokeJoin(Paint.Join.MITER);
        this.f4600e.setStrokeCap(Paint.Cap.BUTT);
        this.f4600e.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C1359b.C1371l.DrawerArrowToggle, C1359b.C1361b.drawerArrowStyle, C1359b.C1370k.Base_Widget_AppCompat_DrawerArrowToggle);
        mo5015a(obtainStyledAttributes.getColor(C1359b.C1371l.DrawerArrowToggle_color, 0));
        mo5024d(obtainStyledAttributes.getDimension(C1359b.C1371l.DrawerArrowToggle_thickness, 0.0f));
        mo5016a(obtainStyledAttributes.getBoolean(C1359b.C1371l.DrawerArrowToggle_spinBars, true));
        mo5027e((float) Math.round(obtainStyledAttributes.getDimension(C1359b.C1371l.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f4607m = obtainStyledAttributes.getDimensionPixelSize(C1359b.C1371l.DrawerArrowToggle_drawableSize, 0);
        this.f4602h = (float) Math.round(obtainStyledAttributes.getDimension(C1359b.C1371l.DrawerArrowToggle_barLength, 0.0f));
        this.f4601g = (float) Math.round(obtainStyledAttributes.getDimension(C1359b.C1371l.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f4603i = obtainStyledAttributes.getDimension(C1359b.C1371l.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m8707a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: a */
    public float mo5013a() {
        return this.f4601g;
    }

    /* renamed from: a */
    public void mo5014a(float f) {
        if (this.f4601g != f) {
            this.f4601g = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo5015a(@C0032k int i) {
        if (i != this.f4600e.getColor()) {
            this.f4600e.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo5016a(boolean z) {
        if (this.f4605k != z) {
            this.f4605k = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public float mo5017b() {
        return this.f4603i;
    }

    /* renamed from: b */
    public void mo5018b(float f) {
        if (this.f4603i != f) {
            this.f4603i = f;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo5019b(int i) {
        if (i != this.f4611q) {
            this.f4611q = i;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo5020b(boolean z) {
        if (this.f4608n != z) {
            this.f4608n = z;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo5021c() {
        return this.f4602h;
    }

    /* renamed from: c */
    public void mo5022c(float f) {
        if (this.f4602h != f) {
            this.f4602h = f;
            invalidateSelf();
        }
    }

    @C0032k
    /* renamed from: d */
    public int mo5023d() {
        return this.f4600e.getColor();
    }

    /* renamed from: d */
    public void mo5024d(float f) {
        if (this.f4600e.getStrokeWidth() != f) {
            this.f4600e.setStrokeWidth(f);
            this.f4610p = (float) (((double) (f / 2.0f)) * Math.cos((double) f4599f));
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        switch (this.f4611q) {
            case 0:
                z = false;
                break;
            case 1:
                z = true;
                break;
            case 3:
                if (C0484a.m2553i(this) != 0) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
            default:
                if (C0484a.m2553i(this) != 1) {
                    z = false;
                    break;
                } else {
                    z = true;
                    break;
                }
        }
        float a = m8707a(this.f4602h, (float) Math.sqrt((double) (this.f4601g * this.f4601g * 2.0f)), this.f4609o);
        float a2 = m8707a(this.f4602h, this.f4603i, this.f4609o);
        float round = (float) Math.round(m8707a(0.0f, this.f4610p, this.f4609o));
        float a3 = m8707a(0.0f, f4599f, this.f4609o);
        float a4 = m8707a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f4609o);
        float round2 = (float) Math.round(((double) a) * Math.cos((double) a3));
        float round3 = (float) Math.round(((double) a) * Math.sin((double) a3));
        this.f4606l.rewind();
        float a5 = m8707a(this.f4604j + this.f4600e.getStrokeWidth(), -this.f4610p, this.f4609o);
        float f = (-a2) / 2.0f;
        this.f4606l.moveTo(f + round, 0.0f);
        this.f4606l.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f4606l.moveTo(f, a5);
        this.f4606l.rLineTo(round2, round3);
        this.f4606l.moveTo(f, -a5);
        this.f4606l.rLineTo(round2, -round3);
        this.f4606l.close();
        canvas.save();
        float strokeWidth = this.f4600e.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), (float) (((double) ((float) ((((int) ((((float) bounds.height()) - (3.0f * strokeWidth)) - (this.f4604j * 2.0f))) / 4) * 2))) + (((double) strokeWidth) * 1.5d) + ((double) this.f4604j)));
        if (this.f4605k) {
            canvas.rotate(((float) (z ^ this.f4608n ? -1 : 1)) * a4);
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f4606l, this.f4600e);
        canvas.restore();
    }

    /* renamed from: e */
    public float mo5026e() {
        return this.f4600e.getStrokeWidth();
    }

    /* renamed from: e */
    public void mo5027e(float f) {
        if (f != this.f4604j) {
            this.f4604j = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public float mo5028f() {
        return this.f4604j;
    }

    /* renamed from: f */
    public void mo5029f(@C0037p(mo18a = 0.0d, mo19b = 1.0d) float f) {
        if (this.f4609o != f) {
            this.f4609o = f;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public boolean mo5030g() {
        return this.f4605k;
    }

    public int getIntrinsicHeight() {
        return this.f4607m;
    }

    public int getIntrinsicWidth() {
        return this.f4607m;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public int mo5034h() {
        return this.f4611q;
    }

    @C0037p(mo18a = 0.0d, mo19b = 1.0d)
    /* renamed from: i */
    public float mo5035i() {
        return this.f4609o;
    }

    /* renamed from: j */
    public final Paint mo5036j() {
        return this.f4600e;
    }

    public void setAlpha(int i) {
        if (i != this.f4600e.getAlpha()) {
            this.f4600e.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4600e.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
