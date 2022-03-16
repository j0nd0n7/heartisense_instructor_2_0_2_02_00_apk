package android.support.p036v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.p010v4.p018f.p019a.C0498h;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.t */
class C1861t {

    /* renamed from: a */
    private static final int[] f6327a = {16843067, 16843068};

    /* renamed from: b */
    private final ProgressBar f6328b;

    /* renamed from: c */
    private Bitmap f6329c;

    C1861t(ProgressBar progressBar) {
        this.f6328b = progressBar;
    }

    /* renamed from: a */
    private Drawable mo7499a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m11239a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: a */
    private Drawable m11239a(Drawable drawable, boolean z) {
        if (drawable instanceof C0498h) {
            Drawable a = ((C0498h) drawable).mo1830a();
            if (a != null) {
                ((C0498h) drawable).mo1831a(m11239a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m11239a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f6329c == null) {
                this.f6329c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo7500b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: b */
    private Shape mo7500b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo7487a() {
        return this.f6329c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7488a(AttributeSet attributeSet, int i) {
        C1807bp a = C1807bp.m10923a(this.f6328b.getContext(), attributeSet, f6327a, i, 0);
        Drawable b = a.mo7299b(0);
        if (b != null) {
            this.f6328b.setIndeterminateDrawable(mo7499a(b));
        }
        Drawable b2 = a.mo7299b(1);
        if (b2 != null) {
            this.f6328b.setProgressDrawable(m11239a(b2, false));
        }
        a.mo7308e();
    }
}
