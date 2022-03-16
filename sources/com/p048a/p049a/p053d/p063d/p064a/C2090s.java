package com.p048a.p049a.p053d.p063d.p064a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.os.Build;
import android.util.Log;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;

/* renamed from: com.a.a.d.d.a.s */
public final class C2090s {

    /* renamed from: a */
    public static final int f6997a = 6;

    /* renamed from: b */
    private static final String f6998b = "TransformationUtils";

    private C2090s() {
    }

    /* renamed from: a */
    public static int m12042a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @TargetApi(5)
    @Deprecated
    /* renamed from: a */
    public static int m12043a(String str) {
        try {
            return m12042a(new ExifInterface(str).getAttributeInt("Orientation", 0));
        } catch (Exception e) {
            if (!Log.isLoggable(f6998b, 6)) {
                return 0;
            }
            Log.e(f6998b, "Unable to get orientation for image with path=" + str, e);
            return 0;
        }
    }

    /* renamed from: a */
    private static Bitmap.Config m12044a(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    public static Bitmap m12045a(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception e) {
            if (!Log.isLoggable(f6998b, 6)) {
                return bitmap;
            }
            Log.e(f6998b, "Exception when trying to orient image", e);
            return bitmap;
        }
    }

    /* renamed from: a */
    public static Bitmap m12046a(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        float width;
        float f;
        float f2 = 0.0f;
        if (bitmap2 == null) {
            return null;
        }
        if (bitmap2.getWidth() == i && bitmap2.getHeight() == i2) {
            return bitmap2;
        }
        Matrix matrix = new Matrix();
        if (bitmap2.getWidth() * i2 > bitmap2.getHeight() * i) {
            width = ((float) i2) / ((float) bitmap2.getHeight());
            f = (((float) i) - (((float) bitmap2.getWidth()) * width)) * 0.5f;
        } else {
            width = ((float) i) / ((float) bitmap2.getWidth());
            f = 0.0f;
            f2 = (((float) i2) - (((float) bitmap2.getHeight()) * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((float) ((int) (f + 0.5f)), (float) ((int) (f2 + 0.5f)));
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, m12044a(bitmap2));
        }
        m12051a(bitmap2, bitmap);
        new Canvas(bitmap).drawBitmap(bitmap2, matrix, new Paint(6));
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m12047a(Bitmap bitmap, C1921c cVar, int i) {
        Matrix matrix = new Matrix();
        m12050a(i, matrix);
        if (matrix.isIdentity()) {
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Bitmap.Config a = m12044a(bitmap);
        Bitmap a2 = cVar.mo7764a(round, round2, a);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(round, round2, a);
        }
        matrix.postTranslate(-rectF.left, -rectF.top);
        new Canvas(a2).drawBitmap(bitmap, matrix, new Paint(6));
        return a2;
    }

    /* renamed from: a */
    public static Bitmap m12048a(Bitmap bitmap, C1921c cVar, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
            int width = (int) (((float) bitmap.getWidth()) * min);
            int height = (int) (((float) bitmap.getHeight()) * min);
            if (bitmap.getWidth() != width || bitmap.getHeight() != height) {
                Bitmap.Config a = m12044a(bitmap);
                Bitmap a2 = cVar.mo7764a(width, height, a);
                if (a2 == null) {
                    a2 = Bitmap.createBitmap(width, height, a);
                }
                m12051a(bitmap, a2);
                if (Log.isLoggable(f6998b, 2)) {
                    Log.v(f6998b, "request: " + i + "x" + i2);
                    Log.v(f6998b, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v(f6998b, "toReuse: " + a2.getWidth() + "x" + a2.getHeight());
                    Log.v(f6998b, "minPct:   " + min);
                }
                Canvas canvas = new Canvas(a2);
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                canvas.drawBitmap(bitmap, matrix, new Paint(6));
                return a2;
            } else if (!Log.isLoggable(f6998b, 2)) {
                return bitmap;
            } else {
                Log.v(f6998b, "adjusted target size matches input, returning input");
                return bitmap;
            }
        } else if (!Log.isLoggable(f6998b, 2)) {
            return bitmap;
        } else {
            Log.v(f6998b, "requested target size matches input, returning input");
            return bitmap;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static Bitmap m12049a(String str, Bitmap bitmap) {
        return m12045a(bitmap, m12043a(str));
    }

    /* renamed from: a */
    static void m12050a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    @TargetApi(12)
    /* renamed from: a */
    public static void m12051a(Bitmap bitmap, Bitmap bitmap2) {
        if (Build.VERSION.SDK_INT >= 12 && bitmap2 != null) {
            bitmap2.setHasAlpha(bitmap.hasAlpha());
        }
    }
}
