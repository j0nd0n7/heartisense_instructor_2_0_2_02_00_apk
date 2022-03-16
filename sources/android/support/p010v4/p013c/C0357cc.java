package android.support.p010v4.p013c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.c.cc */
public abstract class C0357cc {

    /* renamed from: b */
    private static int f1848b = 1048576;

    /* renamed from: c */
    private static final String f1849c = "sharedElement:snapshot:bitmap";

    /* renamed from: d */
    private static final String f1850d = "sharedElement:snapshot:imageScaleType";

    /* renamed from: e */
    private static final String f1851e = "sharedElement:snapshot:imageMatrix";

    /* renamed from: a */
    private Matrix f1852a;

    /* renamed from: android.support.v4.c.cc$a */
    public interface C0358a {
        /* renamed from: a */
        void mo1620a();
    }

    /* renamed from: a */
    private static Bitmap m2078a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, ((float) f1848b) / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        int i2 = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    /* renamed from: a */
    public Parcelable mo1613a(View view, Matrix matrix, RectF rectF) {
        Bitmap a;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (!(drawable == null || background != null || (a = m2078a(drawable)) == null)) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f1849c, a);
                bundle.putString(f1850d, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(f1851e, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, ((float) f1848b) / ((float) (round * round2)));
        int i = (int) (((float) round) * min);
        int i2 = (int) (((float) round2) * min);
        if (this.f1852a == null) {
            this.f1852a = new Matrix();
        }
        this.f1852a.set(matrix);
        this.f1852a.postTranslate(-rectF.left, -rectF.top);
        this.f1852a.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.f1852a);
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public View mo1614a(Context context, Parcelable parcelable) {
        ImageView imageView;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f1849c);
            if (bitmap == null) {
                return null;
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap(bitmap);
            imageView2.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(f1850d)));
            if (imageView2.getScaleType() == ImageView.ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray(f1851e);
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView2.setImageMatrix(matrix);
            }
            imageView = imageView2;
        } else if (parcelable instanceof Bitmap) {
            imageView = new ImageView(context);
            imageView.setImageBitmap((Bitmap) parcelable);
        } else {
            imageView = null;
        }
        return imageView;
    }

    /* renamed from: a */
    public void mo1615a(List<View> list) {
    }

    /* renamed from: a */
    public void mo1616a(List<String> list, List<View> list2, C0358a aVar) {
        aVar.mo1620a();
    }

    /* renamed from: a */
    public void mo1617a(List<String> list, List<View> list2, List<View> list3) {
    }

    /* renamed from: a */
    public void mo1618a(List<String> list, Map<String, View> map) {
    }

    /* renamed from: b */
    public void mo1619b(List<String> list, List<View> list2, List<View> list3) {
    }
}
