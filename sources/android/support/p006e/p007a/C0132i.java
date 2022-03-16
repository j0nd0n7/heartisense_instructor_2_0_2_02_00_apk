package android.support.p006e.p007a;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p006e.p007a.C0126e;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.p033o.C0876a;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.e.a.i */
public class C0132i extends C0131h {

    /* renamed from: a */
    static final String f916a = "VectorDrawableCompat";

    /* renamed from: b */
    static final PorterDuff.Mode f917b = PorterDuff.Mode.SRC_IN;

    /* renamed from: d */
    private static final String f918d = "clip-path";

    /* renamed from: e */
    private static final String f919e = "group";

    /* renamed from: f */
    private static final String f920f = "path";

    /* renamed from: g */
    private static final String f921g = "vector";

    /* renamed from: h */
    private static final int f922h = 0;

    /* renamed from: i */
    private static final int f923i = 1;

    /* renamed from: j */
    private static final int f924j = 2;

    /* renamed from: k */
    private static final int f925k = 0;

    /* renamed from: l */
    private static final int f926l = 1;

    /* renamed from: m */
    private static final int f927m = 2;

    /* renamed from: n */
    private static final int f928n = 2048;

    /* renamed from: o */
    private static final boolean f929o = false;

    /* renamed from: p */
    private C0138f f930p;

    /* renamed from: q */
    private PorterDuffColorFilter f931q;

    /* renamed from: r */
    private ColorFilter f932r;

    /* renamed from: s */
    private boolean f933s;

    /* renamed from: t */
    private boolean f934t;

    /* renamed from: u */
    private Drawable.ConstantState f935u;

    /* renamed from: v */
    private final float[] f936v;

    /* renamed from: w */
    private final Matrix f937w;

    /* renamed from: x */
    private final Rect f938x;

    /* renamed from: android.support.e.a.i$a */
    private static class C0133a extends C0136d {
        public C0133a() {
        }

        public C0133a(C0133a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private void m686a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f966n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f965m = C0126e.m661b(string2);
            }
        }

        /* renamed from: a */
        public void mo644a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0130g.m671a(xmlPullParser, "pathData")) {
                TypedArray a = C0131h.m673a(resources, theme, attributeSet, C0114a.f842H);
                m686a(a);
                a.recycle();
            }
        }

        /* renamed from: a */
        public boolean mo645a() {
            return true;
        }
    }

    /* renamed from: android.support.e.a.i$b */
    private static class C0134b extends C0136d {

        /* renamed from: a */
        int f939a = 0;

        /* renamed from: b */
        float f940b = 0.0f;

        /* renamed from: c */
        int f941c = 0;

        /* renamed from: d */
        float f942d = 1.0f;

        /* renamed from: e */
        int f943e;

        /* renamed from: f */
        float f944f = 1.0f;

        /* renamed from: g */
        float f945g = 0.0f;

        /* renamed from: h */
        float f946h = 1.0f;

        /* renamed from: i */
        float f947i = 0.0f;

        /* renamed from: j */
        Paint.Cap f948j = Paint.Cap.BUTT;

        /* renamed from: k */
        Paint.Join f949k = Paint.Join.MITER;

        /* renamed from: l */
        float f950l = 4.0f;

        /* renamed from: p */
        private int[] f951p;

        public C0134b() {
        }

        public C0134b(C0134b bVar) {
            super(bVar);
            this.f951p = bVar.f951p;
            this.f939a = bVar.f939a;
            this.f940b = bVar.f940b;
            this.f942d = bVar.f942d;
            this.f941c = bVar.f941c;
            this.f943e = bVar.f943e;
            this.f944f = bVar.f944f;
            this.f945g = bVar.f945g;
            this.f946h = bVar.f946h;
            this.f947i = bVar.f947i;
            this.f948j = bVar.f948j;
            this.f949k = bVar.f949k;
            this.f950l = bVar.f950l;
        }

        /* renamed from: a */
        private Paint.Cap m689a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private Paint.Join m690a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        /* renamed from: a */
        private void m691a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f951p = null;
            if (C0130g.m671a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f966n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f965m = C0126e.m661b(string2);
                }
                this.f941c = C0130g.m672b(typedArray, xmlPullParser, "fillColor", 1, this.f941c);
                this.f944f = C0130g.m668a(typedArray, xmlPullParser, "fillAlpha", 12, this.f944f);
                this.f948j = m689a(C0130g.m669a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f948j);
                this.f949k = m690a(C0130g.m669a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f949k);
                this.f950l = C0130g.m668a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f950l);
                this.f939a = C0130g.m672b(typedArray, xmlPullParser, "strokeColor", 3, this.f939a);
                this.f942d = C0130g.m668a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f942d);
                this.f940b = C0130g.m668a(typedArray, xmlPullParser, "strokeWidth", 4, this.f940b);
                this.f946h = C0130g.m668a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f946h);
                this.f947i = C0130g.m668a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f947i);
                this.f945g = C0130g.m668a(typedArray, xmlPullParser, "trimPathStart", 5, this.f945g);
            }
        }

        /* renamed from: a */
        public void mo646a(Resources.Theme theme) {
            if (this.f951p == null) {
            }
        }

        /* renamed from: a */
        public void mo647a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0131h.m673a(resources, theme, attributeSet, C0114a.f869t);
            m691a(a, xmlPullParser);
            a.recycle();
        }

        /* renamed from: b */
        public boolean mo648b() {
            return this.f951p != null;
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f944f;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f941c;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f942d;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f939a;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f940b;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f946h;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f947i;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f945g;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f944f = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f941c = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f942d = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f939a = i;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f940b = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f946h = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f947i = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f945g = f;
        }
    }

    /* renamed from: android.support.e.a.i$c */
    private static class C0135c {

        /* renamed from: a */
        final ArrayList<Object> f952a = new ArrayList<>();

        /* renamed from: b */
        float f953b = 0.0f;

        /* renamed from: c */
        int f954c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Matrix f955d = new Matrix();

        /* renamed from: e */
        private float f956e = 0.0f;

        /* renamed from: f */
        private float f957f = 0.0f;

        /* renamed from: g */
        private float f958g = 1.0f;

        /* renamed from: h */
        private float f959h = 1.0f;

        /* renamed from: i */
        private float f960i = 0.0f;

        /* renamed from: j */
        private float f961j = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final Matrix f962k = new Matrix();

        /* renamed from: l */
        private int[] f963l;

        /* renamed from: m */
        private String f964m = null;

        public C0135c() {
        }

        public C0135c(C0135c cVar, C0876a<String, Object> aVar) {
            C0136d aVar2;
            this.f953b = cVar.f953b;
            this.f956e = cVar.f956e;
            this.f957f = cVar.f957f;
            this.f958g = cVar.f958g;
            this.f959h = cVar.f959h;
            this.f960i = cVar.f960i;
            this.f961j = cVar.f961j;
            this.f963l = cVar.f963l;
            this.f964m = cVar.f964m;
            this.f954c = cVar.f954c;
            if (this.f964m != null) {
                aVar.put(this.f964m, this);
            }
            this.f962k.set(cVar.f962k);
            ArrayList<Object> arrayList = cVar.f952a;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < arrayList.size()) {
                    Object obj = arrayList.get(i2);
                    if (obj instanceof C0135c) {
                        this.f952a.add(new C0135c((C0135c) obj, aVar));
                    } else {
                        if (obj instanceof C0134b) {
                            aVar2 = new C0134b((C0134b) obj);
                        } else if (obj instanceof C0133a) {
                            aVar2 = new C0133a((C0133a) obj);
                        } else {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        this.f952a.add(aVar2);
                        if (aVar2.f966n != null) {
                            aVar.put(aVar2.f966n, aVar2);
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        private void m696a() {
            this.f962k.reset();
            this.f962k.postTranslate(-this.f956e, -this.f957f);
            this.f962k.postScale(this.f958g, this.f959h);
            this.f962k.postRotate(this.f953b, 0.0f, 0.0f);
            this.f962k.postTranslate(this.f960i + this.f956e, this.f961j + this.f957f);
        }

        /* renamed from: a */
        private void m697a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f963l = null;
            this.f953b = C0130g.m668a(typedArray, xmlPullParser, "rotation", 5, this.f953b);
            this.f956e = typedArray.getFloat(1, this.f956e);
            this.f957f = typedArray.getFloat(2, this.f957f);
            this.f958g = C0130g.m668a(typedArray, xmlPullParser, "scaleX", 3, this.f958g);
            this.f959h = C0130g.m668a(typedArray, xmlPullParser, "scaleY", 4, this.f959h);
            this.f960i = C0130g.m668a(typedArray, xmlPullParser, "translateX", 6, this.f960i);
            this.f961j = C0130g.m668a(typedArray, xmlPullParser, "translateY", 7, this.f961j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f964m = string;
            }
            m696a();
        }

        /* renamed from: a */
        public void mo665a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0131h.m673a(resources, theme, attributeSet, C0114a.f860k);
            m697a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f964m;
        }

        public Matrix getLocalMatrix() {
            return this.f962k;
        }

        public float getPivotX() {
            return this.f956e;
        }

        public float getPivotY() {
            return this.f957f;
        }

        public float getRotation() {
            return this.f953b;
        }

        public float getScaleX() {
            return this.f958g;
        }

        public float getScaleY() {
            return this.f959h;
        }

        public float getTranslateX() {
            return this.f960i;
        }

        public float getTranslateY() {
            return this.f961j;
        }

        public void setPivotX(float f) {
            if (f != this.f956e) {
                this.f956e = f;
                m696a();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f957f) {
                this.f957f = f;
                m696a();
            }
        }

        public void setRotation(float f) {
            if (f != this.f953b) {
                this.f953b = f;
                m696a();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f958g) {
                this.f958g = f;
                m696a();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f959h) {
                this.f959h = f;
                m696a();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f960i) {
                this.f960i = f;
                m696a();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f961j) {
                this.f961j = f;
                m696a();
            }
        }
    }

    /* renamed from: android.support.e.a.i$d */
    private static class C0136d {

        /* renamed from: m */
        protected C0126e.C0128b[] f965m = null;

        /* renamed from: n */
        String f966n;

        /* renamed from: o */
        int f967o;

        public C0136d() {
        }

        public C0136d(C0136d dVar) {
            this.f966n = dVar.f966n;
            this.f967o = dVar.f967o;
            this.f965m = C0126e.m659a(dVar.f965m);
        }

        /* renamed from: a */
        public String mo682a(C0126e.C0128b[] bVarArr) {
            String str = " ";
            for (int i = 0; i < bVarArr.length; i++) {
                float[] fArr = bVarArr[i].f913b;
                str = str + bVarArr[i].f912a + ":";
                for (int i2 = 0; i2 < fArr.length; i2++) {
                    str = str + fArr[i2] + ",";
                }
            }
            return str;
        }

        /* renamed from: a */
        public void mo683a(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "    ";
            }
            Log.v(C0132i.f916a, str + "current path is :" + this.f966n + " pathData is " + mo682a(this.f965m));
        }

        /* renamed from: a */
        public void mo646a(Resources.Theme theme) {
        }

        /* renamed from: a */
        public void mo684a(Path path) {
            path.reset();
            if (this.f965m != null) {
                C0126e.C0128b.m666a(this.f965m, path);
            }
        }

        /* renamed from: a */
        public boolean mo645a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo648b() {
            return false;
        }

        public C0126e.C0128b[] getPathData() {
            return this.f965m;
        }

        public String getPathName() {
            return this.f966n;
        }

        public void setPathData(C0126e.C0128b[] bVarArr) {
            if (!C0126e.m657a(this.f965m, bVarArr)) {
                this.f965m = C0126e.m659a(bVarArr);
            } else {
                C0126e.m660b(this.f965m, bVarArr);
            }
        }
    }

    /* renamed from: android.support.e.a.i$e */
    private static class C0137e {

        /* renamed from: k */
        private static final Matrix f968k = new Matrix();

        /* renamed from: a */
        final C0135c f969a;

        /* renamed from: b */
        float f970b;

        /* renamed from: c */
        float f971c;

        /* renamed from: d */
        float f972d;

        /* renamed from: e */
        float f973e;

        /* renamed from: f */
        int f974f;

        /* renamed from: g */
        String f975g;

        /* renamed from: h */
        final C0876a<String, Object> f976h;

        /* renamed from: i */
        private final Path f977i;

        /* renamed from: j */
        private final Path f978j;

        /* renamed from: l */
        private final Matrix f979l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Paint f980m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public Paint f981n;

        /* renamed from: o */
        private PathMeasure f982o;

        /* renamed from: p */
        private int f983p;

        public C0137e() {
            this.f979l = new Matrix();
            this.f970b = 0.0f;
            this.f971c = 0.0f;
            this.f972d = 0.0f;
            this.f973e = 0.0f;
            this.f974f = 255;
            this.f975g = null;
            this.f976h = new C0876a<>();
            this.f969a = new C0135c();
            this.f977i = new Path();
            this.f978j = new Path();
        }

        public C0137e(C0137e eVar) {
            this.f979l = new Matrix();
            this.f970b = 0.0f;
            this.f971c = 0.0f;
            this.f972d = 0.0f;
            this.f973e = 0.0f;
            this.f974f = 255;
            this.f975g = null;
            this.f976h = new C0876a<>();
            this.f969a = new C0135c(eVar.f969a, this.f976h);
            this.f977i = new Path(eVar.f977i);
            this.f978j = new Path(eVar.f978j);
            this.f970b = eVar.f970b;
            this.f971c = eVar.f971c;
            this.f972d = eVar.f972d;
            this.f973e = eVar.f973e;
            this.f983p = eVar.f983p;
            this.f974f = eVar.f974f;
            this.f975g = eVar.f975g;
            if (eVar.f975g != null) {
                this.f976h.put(eVar.f975g, this);
            }
        }

        /* renamed from: a */
        private static float m706a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private float m707a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = m706a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), hypot);
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        private void m710a(C0135c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            cVar.f955d.set(matrix);
            cVar.f955d.preConcat(cVar.f962k);
            canvas.save();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 < cVar.f952a.size()) {
                    Object obj = cVar.f952a.get(i4);
                    if (obj instanceof C0135c) {
                        m710a((C0135c) obj, cVar.f955d, canvas, i, i2, colorFilter);
                    } else if (obj instanceof C0136d) {
                        m711a(cVar, (C0136d) obj, canvas, i, i2, colorFilter);
                    }
                    i3 = i4 + 1;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        /* renamed from: a */
        private void m711a(C0135c cVar, C0136d dVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f972d;
            float f2 = ((float) i2) / this.f973e;
            float min = Math.min(f, f2);
            Matrix a = cVar.f955d;
            this.f979l.set(a);
            this.f979l.postScale(f, f2);
            float a2 = m707a(a);
            if (a2 != 0.0f) {
                dVar.mo684a(this.f977i);
                Path path = this.f977i;
                this.f978j.reset();
                if (dVar.mo645a()) {
                    this.f978j.addPath(path, this.f979l);
                    canvas.clipPath(this.f978j);
                    return;
                }
                C0134b bVar = (C0134b) dVar;
                if (!(bVar.f945g == 0.0f && bVar.f946h == 1.0f)) {
                    float f3 = (bVar.f945g + bVar.f947i) % 1.0f;
                    float f4 = (bVar.f946h + bVar.f947i) % 1.0f;
                    if (this.f982o == null) {
                        this.f982o = new PathMeasure();
                    }
                    this.f982o.setPath(this.f977i, false);
                    float length = this.f982o.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.f982o.getSegment(f5, length, path, true);
                        this.f982o.getSegment(0.0f, f6, path, true);
                    } else {
                        this.f982o.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f978j.addPath(path, this.f979l);
                if (bVar.f941c != 0) {
                    if (this.f981n == null) {
                        this.f981n = new Paint();
                        this.f981n.setStyle(Paint.Style.FILL);
                        this.f981n.setAntiAlias(true);
                    }
                    Paint paint = this.f981n;
                    paint.setColor(C0132i.m674a(bVar.f941c, bVar.f944f));
                    paint.setColorFilter(colorFilter);
                    canvas.drawPath(this.f978j, paint);
                }
                if (bVar.f939a != 0) {
                    if (this.f980m == null) {
                        this.f980m = new Paint();
                        this.f980m.setStyle(Paint.Style.STROKE);
                        this.f980m.setAntiAlias(true);
                    }
                    Paint paint2 = this.f980m;
                    if (bVar.f949k != null) {
                        paint2.setStrokeJoin(bVar.f949k);
                    }
                    if (bVar.f948j != null) {
                        paint2.setStrokeCap(bVar.f948j);
                    }
                    paint2.setStrokeMiter(bVar.f950l);
                    paint2.setColor(C0132i.m674a(bVar.f939a, bVar.f942d));
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(a2 * min * bVar.f940b);
                    canvas.drawPath(this.f978j, paint2);
                }
            }
        }

        /* renamed from: a */
        public void mo688a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m710a(this.f969a, f968k, canvas, i, i2, colorFilter);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f974f;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (255.0f * f));
        }

        public void setRootAlpha(int i) {
            this.f974f = i;
        }
    }

    /* renamed from: android.support.e.a.i$f */
    private static class C0138f extends Drawable.ConstantState {

        /* renamed from: a */
        int f984a;

        /* renamed from: b */
        C0137e f985b;

        /* renamed from: c */
        ColorStateList f986c;

        /* renamed from: d */
        PorterDuff.Mode f987d;

        /* renamed from: e */
        boolean f988e;

        /* renamed from: f */
        Bitmap f989f;

        /* renamed from: g */
        int[] f990g;

        /* renamed from: h */
        ColorStateList f991h;

        /* renamed from: i */
        PorterDuff.Mode f992i;

        /* renamed from: j */
        int f993j;

        /* renamed from: k */
        boolean f994k;

        /* renamed from: l */
        boolean f995l;

        /* renamed from: m */
        Paint f996m;

        public C0138f() {
            this.f986c = null;
            this.f987d = C0132i.f917b;
            this.f985b = new C0137e();
        }

        public C0138f(C0138f fVar) {
            this.f986c = null;
            this.f987d = C0132i.f917b;
            if (fVar != null) {
                this.f984a = fVar.f984a;
                this.f985b = new C0137e(fVar.f985b);
                if (fVar.f985b.f981n != null) {
                    Paint unused = this.f985b.f981n = new Paint(fVar.f985b.f981n);
                }
                if (fVar.f985b.f980m != null) {
                    Paint unused2 = this.f985b.f980m = new Paint(fVar.f985b.f980m);
                }
                this.f986c = fVar.f986c;
                this.f987d = fVar.f987d;
                this.f988e = fVar.f988e;
            }
        }

        /* renamed from: a */
        public Paint mo693a(ColorFilter colorFilter) {
            if (!mo696a() && colorFilter == null) {
                return null;
            }
            if (this.f996m == null) {
                this.f996m = new Paint();
                this.f996m.setFilterBitmap(true);
            }
            this.f996m.setAlpha(this.f985b.getRootAlpha());
            this.f996m.setColorFilter(colorFilter);
            return this.f996m;
        }

        /* renamed from: a */
        public void mo694a(int i, int i2) {
            this.f989f.eraseColor(0);
            this.f985b.mo688a(new Canvas(this.f989f), i, i2, (ColorFilter) null);
        }

        /* renamed from: a */
        public void mo695a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f989f, (Rect) null, rect, mo693a(colorFilter));
        }

        /* renamed from: a */
        public boolean mo696a() {
            return this.f985b.getRootAlpha() < 255;
        }

        /* renamed from: b */
        public void mo697b(int i, int i2) {
            if (this.f989f == null || !mo700c(i, i2)) {
                this.f989f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f995l = true;
            }
        }

        /* renamed from: b */
        public boolean mo698b() {
            return !this.f995l && this.f991h == this.f986c && this.f992i == this.f987d && this.f994k == this.f988e && this.f993j == this.f985b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo699c() {
            this.f991h = this.f986c;
            this.f992i = this.f987d;
            this.f993j = this.f985b.getRootAlpha();
            this.f994k = this.f988e;
            this.f995l = false;
        }

        /* renamed from: c */
        public boolean mo700c(int i, int i2) {
            return i == this.f989f.getWidth() && i2 == this.f989f.getHeight();
        }

        public int getChangingConfigurations() {
            return this.f984a;
        }

        public Drawable newDrawable() {
            return new C0132i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0132i(this);
        }
    }

    /* renamed from: android.support.e.a.i$g */
    private static class C0139g extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f997a;

        public C0139g(Drawable.ConstantState constantState) {
            this.f997a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f997a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f997a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0132i iVar = new C0132i();
            iVar.f915c = (VectorDrawable) this.f997a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0132i iVar = new C0132i();
            iVar.f915c = (VectorDrawable) this.f997a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0132i iVar = new C0132i();
            iVar.f915c = (VectorDrawable) this.f997a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C0132i() {
        this.f934t = true;
        this.f936v = new float[9];
        this.f937w = new Matrix();
        this.f938x = new Rect();
        this.f930p = new C0138f();
    }

    C0132i(@C0047z C0138f fVar) {
        this.f934t = true;
        this.f936v = new float[9];
        this.f937w = new Matrix();
        this.f938x = new Rect();
        this.f930p = fVar;
        this.f931q = mo620a(this.f931q, fVar.f986c, fVar.f987d);
    }

    /* renamed from: a */
    static int m674a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m675a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.ADD : mode;
            default:
                return mode;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033 A[Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC, Splitter:B:15:0x0045] */
    @android.support.annotation.C0003aa
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p006e.p007a.C0132i m676a(@android.support.annotation.C0047z android.content.res.Resources r5, @android.support.annotation.C0036o int r6, @android.support.annotation.C0003aa android.content.res.Resources.Theme r7) {
        /*
            r4 = 2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x0020
            android.support.e.a.i r0 = new android.support.e.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r1 = android.support.p010v4.p014d.p016b.C0428e.m2352a(r5, r6, r7)
            r0.f915c = r1
            android.support.e.a.i$g r1 = new android.support.e.a.i$g
            android.graphics.drawable.Drawable r2 = r0.f915c
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.f935u = r1
        L_0x001f:
            return r0
        L_0x0020:
            android.content.res.XmlResourceParser r0 = r5.getXml(r6)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
        L_0x0028:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            if (r2 == r4) goto L_0x0031
            r3 = 1
            if (r2 != r3) goto L_0x0028
        L_0x0031:
            if (r2 == r4) goto L_0x0045
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            throw r0     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
        L_0x003b:
            r0 = move-exception
            java.lang.String r1 = "VectorDrawableCompat"
            java.lang.String r2 = "parser error"
            android.util.Log.e(r1, r2, r0)
        L_0x0043:
            r0 = 0
            goto L_0x001f
        L_0x0045:
            android.support.e.a.i r0 = m677a(r5, r0, r1, r7)     // Catch:{ XmlPullParserException -> 0x003b, IOException -> 0x004a }
            goto L_0x001f
        L_0x004a:
            r0 = move-exception
            java.lang.String r1 = "VectorDrawableCompat"
            java.lang.String r2 = "parser error"
            android.util.Log.e(r1, r2, r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006e.p007a.C0132i.m676a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.e.a.i");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static C0132i m677a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0132i iVar = new C0132i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: a */
    private void m678a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0138f fVar = this.f930p;
        C0137e eVar = fVar.f985b;
        fVar.f987d = m675a(C0130g.m669a(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            fVar.f986c = colorStateList;
        }
        fVar.f988e = C0130g.m670a(typedArray, xmlPullParser, "autoMirrored", 5, fVar.f988e);
        eVar.f972d = C0130g.m668a(typedArray, xmlPullParser, "viewportWidth", 7, eVar.f972d);
        eVar.f973e = C0130g.m668a(typedArray, xmlPullParser, "viewportHeight", 8, eVar.f973e);
        if (eVar.f972d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (eVar.f973e <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            eVar.f970b = typedArray.getDimension(3, eVar.f970b);
            eVar.f971c = typedArray.getDimension(2, eVar.f971c);
            if (eVar.f970b <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (eVar.f971c <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                eVar.setAlpha(C0130g.m668a(typedArray, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    eVar.f975g = string;
                    eVar.f976h.put(string, eVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m679a(C0135c cVar, int i) {
        int i2 = 0;
        String str = "";
        for (int i3 = 0; i3 < i; i3++) {
            str = str + "    ";
        }
        Log.v(f916a, str + "current group is :" + cVar.getGroupName() + " rotation is " + cVar.f953b);
        Log.v(f916a, str + "matrix is :" + cVar.getLocalMatrix().toString());
        while (true) {
            int i4 = i2;
            if (i4 < cVar.f952a.size()) {
                Object obj = cVar.f952a.get(i4);
                if (obj instanceof C0135c) {
                    m679a((C0135c) obj, i + 1);
                } else {
                    ((C0136d) obj).mo683a(i + 1);
                }
                i2 = i4 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m680b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        boolean z;
        C0138f fVar = this.f930p;
        C0137e eVar = fVar.f985b;
        Stack stack = new Stack();
        stack.push(eVar.f969a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0135c cVar = (C0135c) stack.peek();
                if (f920f.equals(name)) {
                    C0134b bVar = new C0134b();
                    bVar.mo647a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f952a.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.f976h.put(bVar.getPathName(), bVar);
                    }
                    z = false;
                    fVar.f984a = bVar.f967o | fVar.f984a;
                } else if (f918d.equals(name)) {
                    C0133a aVar = new C0133a();
                    aVar.mo644a(resources, attributeSet, theme, xmlPullParser);
                    cVar.f952a.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.f976h.put(aVar.getPathName(), aVar);
                    }
                    fVar.f984a |= aVar.f967o;
                    z = z2;
                } else {
                    if (f919e.equals(name)) {
                        C0135c cVar2 = new C0135c();
                        cVar2.mo665a(resources, attributeSet, theme, xmlPullParser);
                        cVar.f952a.add(cVar2);
                        stack.push(cVar2);
                        if (cVar2.getGroupName() != null) {
                            eVar.f976h.put(cVar2.getGroupName(), cVar2);
                        }
                        fVar.f984a |= cVar2.f954c;
                    }
                    z = z2;
                }
                z2 = z;
            } else if (eventType == 3 && f919e.equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append(f920f);
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private boolean m681b() {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!isAutoMirrored() || getLayoutDirection() != 1) {
            z = false;
        }
        return z;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public float mo619a() {
        if ((this.f930p == null && this.f930p.f985b == null) || this.f930p.f985b.f970b == 0.0f || this.f930p.f985b.f971c == 0.0f || this.f930p.f985b.f973e == 0.0f || this.f930p.f985b.f972d == 0.0f) {
            return 1.0f;
        }
        float f = this.f930p.f985b.f970b;
        float f2 = this.f930p.f985b.f971c;
        return Math.min(this.f930p.f985b.f972d / f, this.f930p.f985b.f973e / f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo620a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo621a(String str) {
        return this.f930p.f985b.f976h.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo622a(boolean z) {
        this.f934t = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.f915c == null) {
            return false;
        }
        C0484a.m2548d(this.f915c);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f915c != null) {
            this.f915c.draw(canvas);
            return;
        }
        copyBounds(this.f938x);
        if (this.f938x.width() > 0 && this.f938x.height() > 0) {
            ColorFilter colorFilter = this.f932r == null ? this.f931q : this.f932r;
            canvas.getMatrix(this.f937w);
            this.f937w.getValues(this.f936v);
            float abs = Math.abs(this.f936v[0]);
            float abs2 = Math.abs(this.f936v[4]);
            float abs3 = Math.abs(this.f936v[1]);
            float abs4 = Math.abs(this.f936v[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int min = Math.min(2048, (int) (abs * ((float) this.f938x.width())));
            int min2 = Math.min(2048, (int) (abs2 * ((float) this.f938x.height())));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f938x.left, (float) this.f938x.top);
                if (m681b()) {
                    canvas.translate((float) this.f938x.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f938x.offsetTo(0, 0);
                this.f930p.mo697b(min, min2);
                if (!this.f934t) {
                    this.f930p.mo694a(min, min2);
                } else if (!this.f930p.mo698b()) {
                    this.f930p.mo694a(min, min2);
                    this.f930p.mo699c();
                }
                this.f930p.mo695a(canvas, colorFilter, this.f938x);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        return this.f915c != null ? C0484a.m2547c(this.f915c) : this.f930p.f985b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        return this.f915c != null ? this.f915c.getChangingConfigurations() : super.getChangingConfigurations() | this.f930p.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f915c != null) {
            return new C0139g(this.f915c.getConstantState());
        }
        this.f930p.f984a = getChangingConfigurations();
        return this.f930p;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f915c != null ? this.f915c.getIntrinsicHeight() : (int) this.f930p.f985b.f971c;
    }

    public int getIntrinsicWidth() {
        return this.f915c != null ? this.f915c.getIntrinsicWidth() : (int) this.f930p.f985b.f970b;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        if (this.f915c != null) {
            return this.f915c.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @SuppressLint({"NewApi"})
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f915c != null) {
            this.f915c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f915c != null) {
            C0484a.m2542a(this.f915c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0138f fVar = this.f930p;
        fVar.f985b = new C0137e();
        TypedArray a = m673a(resources, theme, attributeSet, C0114a.f850a);
        m678a(a, xmlPullParser);
        a.recycle();
        fVar.f984a = getChangingConfigurations();
        fVar.f995l = true;
        m680b(resources, xmlPullParser, attributeSet, theme);
        this.f931q = mo620a(this.f931q, fVar.f986c, fVar.f987d);
    }

    public void invalidateSelf() {
        if (this.f915c != null) {
            this.f915c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        return this.f915c != null ? C0484a.m2545b(this.f915c) : this.f930p.f988e;
    }

    public boolean isStateful() {
        return this.f915c != null ? this.f915c.isStateful() : super.isStateful() || !(this.f930p == null || this.f930p.f986c == null || !this.f930p.f986c.isStateful());
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f915c != null) {
            this.f915c.mutate();
        } else if (!this.f933s && super.mutate() == this) {
            this.f930p = new C0138f(this.f930p);
            this.f933s = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f915c != null) {
            this.f915c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f915c != null) {
            return this.f915c.setState(iArr);
        }
        C0138f fVar = this.f930p;
        if (fVar.f986c == null || fVar.f987d == null) {
            return false;
        }
        this.f931q = mo620a(this.f931q, fVar.f986c, fVar.f987d);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f915c != null) {
            this.f915c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f915c != null) {
            this.f915c.setAlpha(i);
        } else if (this.f930p.f985b.getRootAlpha() != i) {
            this.f930p.f985b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f915c != null) {
            C0484a.m2544a(this.f915c, z);
        } else {
            this.f930p.f988e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f915c != null) {
            this.f915c.setColorFilter(colorFilter);
            return;
        }
        this.f932r = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @SuppressLint({"NewApi"})
    public void setTint(int i) {
        if (this.f915c != null) {
            C0484a.m2538a(this.f915c, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f915c != null) {
            C0484a.m2540a(this.f915c, colorStateList);
            return;
        }
        C0138f fVar = this.f930p;
        if (fVar.f986c != colorStateList) {
            fVar.f986c = colorStateList;
            this.f931q = mo620a(this.f931q, colorStateList, fVar.f987d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f915c != null) {
            C0484a.m2543a(this.f915c, mode);
            return;
        }
        C0138f fVar = this.f930p;
        if (fVar.f987d != mode) {
            fVar.f987d = mode;
            this.f931q = mo620a(this.f931q, fVar.f986c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f915c != null ? this.f915c.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f915c != null) {
            this.f915c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
