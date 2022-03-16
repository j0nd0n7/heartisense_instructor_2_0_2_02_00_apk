package android.support.p010v4.p029l;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.support.annotation.C0007ae;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.l.e */
class C0836e {

    /* renamed from: c */
    public static final int f2905c = 1;

    /* renamed from: d */
    public static final int f2906d = 2;

    /* renamed from: e */
    public static final int f2907e = 1;

    /* renamed from: f */
    public static final int f2908f = 2;

    /* renamed from: g */
    public static final int f2909g = 1;

    /* renamed from: h */
    public static final int f2910h = 2;

    /* renamed from: n */
    private static final String f2911n = "PrintHelperKitkat";

    /* renamed from: o */
    private static final int f2912o = 3500;

    /* renamed from: a */
    final Context f2913a;

    /* renamed from: b */
    BitmapFactory.Options f2914b = null;

    /* renamed from: i */
    protected boolean f2915i = true;

    /* renamed from: j */
    protected boolean f2916j = true;

    /* renamed from: k */
    int f2917k = 2;

    /* renamed from: l */
    int f2918l = 2;

    /* renamed from: m */
    int f2919m;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Object f2920p = new Object();

    /* renamed from: android.support.v4.l.e$a */
    public interface C0842a {
        /* renamed from: a */
        void mo2711a();
    }

    C0836e(Context context) {
        this.f2913a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m4144a(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m4145a(Uri uri, int i) {
        BitmapFactory.Options options;
        int i2 = 1;
        Bitmap bitmap = null;
        if (i <= 0 || uri == null || this.f2913a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        m4146a(uri, options2);
        int i3 = options2.outWidth;
        int i4 = options2.outHeight;
        if (i3 > 0 && i4 > 0) {
            int max = Math.max(i3, i4);
            while (max > i) {
                max >>>= 1;
                i2 <<= 1;
            }
            if (i2 > 0 && Math.min(i3, i4) / i2 > 0) {
                synchronized (this.f2920p) {
                    this.f2914b = new BitmapFactory.Options();
                    this.f2914b.inMutable = true;
                    this.f2914b.inSampleSize = i2;
                    options = this.f2914b;
                }
                try {
                    bitmap = m4146a(uri, options);
                    synchronized (this.f2920p) {
                        this.f2914b = null;
                    }
                } catch (Throwable th) {
                    synchronized (this.f2920p) {
                        this.f2914b = null;
                        throw th;
                    }
                }
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private Bitmap m4146a(Uri uri, BitmapFactory.Options options) {
        InputStream inputStream = null;
        if (uri == null || this.f2913a == null) {
            throw new IllegalArgumentException("bad argument to loadBitmap");
        }
        try {
            inputStream = this.f2913a.getContentResolver().openInputStream(uri);
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, options);
            if (inputStream != null) {
                try {
                } catch (IOException e) {
                    Log.w(f2911n, "close fail ", e);
                }
            }
            return decodeStream;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    Log.w(f2911n, "close fail ", e2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Matrix m4149a(int i, int i2, RectF rectF, int i3) {
        Matrix matrix = new Matrix();
        float width = rectF.width() / ((float) i);
        float max = i3 == 2 ? Math.max(width, rectF.height() / ((float) i2)) : Math.min(width, rectF.height() / ((float) i2));
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (((float) i) * max)) / 2.0f, (rectF.height() - (max * ((float) i2))) / 2.0f);
        return matrix;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4152a(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        final PrintAttributes build = this.f2916j ? printAttributes : mo2712a(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        final CancellationSignal cancellationSignal2 = cancellationSignal;
        final Bitmap bitmap2 = bitmap;
        final PrintAttributes printAttributes2 = printAttributes;
        final int i2 = i;
        final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        final PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = writeResultCallback;
        new AsyncTask<Void, Void, Throwable>() {
            /* access modifiers changed from: protected */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00b3=Splitter:B:33:0x00b3, B:46:0x00e4=Splitter:B:46:0x00e4, B:20:0x0078=Splitter:B:20:0x0078} */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Throwable doInBackground(java.lang.Void... r10) {
                /*
                    r9 = this;
                    r0 = 0
                    android.os.CancellationSignal r1 = r2     // Catch:{ Throwable -> 0x0080 }
                    boolean r1 = r1.isCanceled()     // Catch:{ Throwable -> 0x0080 }
                    if (r1 == 0) goto L_0x000a
                L_0x0009:
                    return r0
                L_0x000a:
                    android.print.pdf.PrintedPdfDocument r2 = new android.print.pdf.PrintedPdfDocument     // Catch:{ Throwable -> 0x0080 }
                    android.support.v4.l.e r1 = android.support.p010v4.p029l.C0836e.this     // Catch:{ Throwable -> 0x0080 }
                    android.content.Context r1 = r1.f2913a     // Catch:{ Throwable -> 0x0080 }
                    android.print.PrintAttributes r3 = r3     // Catch:{ Throwable -> 0x0080 }
                    r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x0080 }
                    android.support.v4.l.e r1 = android.support.p010v4.p029l.C0836e.this     // Catch:{ Throwable -> 0x0080 }
                    android.graphics.Bitmap r3 = r4     // Catch:{ Throwable -> 0x0080 }
                    android.print.PrintAttributes r4 = r3     // Catch:{ Throwable -> 0x0080 }
                    int r4 = r4.getColorMode()     // Catch:{ Throwable -> 0x0080 }
                    android.graphics.Bitmap r3 = r1.m4144a((android.graphics.Bitmap) r3, (int) r4)     // Catch:{ Throwable -> 0x0080 }
                    android.os.CancellationSignal r1 = r2     // Catch:{ Throwable -> 0x0080 }
                    boolean r1 = r1.isCanceled()     // Catch:{ Throwable -> 0x0080 }
                    if (r1 != 0) goto L_0x0009
                    r1 = 1
                    android.graphics.pdf.PdfDocument$Page r4 = r2.startPage(r1)     // Catch:{ all -> 0x00a6 }
                    android.support.v4.l.e r1 = android.support.p010v4.p029l.C0836e.this     // Catch:{ all -> 0x00a6 }
                    boolean r1 = r1.f2916j     // Catch:{ all -> 0x00a6 }
                    if (r1 == 0) goto L_0x0082
                    android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ all -> 0x00a6 }
                    android.graphics.pdf.PdfDocument$PageInfo r5 = r4.getInfo()     // Catch:{ all -> 0x00a6 }
                    android.graphics.Rect r5 = r5.getContentRect()     // Catch:{ all -> 0x00a6 }
                    r1.<init>(r5)     // Catch:{ all -> 0x00a6 }
                L_0x0043:
                    android.support.v4.l.e r5 = android.support.p010v4.p029l.C0836e.this     // Catch:{ all -> 0x00a6 }
                    int r6 = r3.getWidth()     // Catch:{ all -> 0x00a6 }
                    int r7 = r3.getHeight()     // Catch:{ all -> 0x00a6 }
                    int r8 = r6     // Catch:{ all -> 0x00a6 }
                    android.graphics.Matrix r5 = r5.m4149a(r6, r7, r1, r8)     // Catch:{ all -> 0x00a6 }
                    android.support.v4.l.e r6 = android.support.p010v4.p029l.C0836e.this     // Catch:{ all -> 0x00a6 }
                    boolean r6 = r6.f2916j     // Catch:{ all -> 0x00a6 }
                    if (r6 == 0) goto L_0x00bb
                L_0x0059:
                    android.graphics.Canvas r1 = r4.getCanvas()     // Catch:{ all -> 0x00a6 }
                    r6 = 0
                    r1.drawBitmap(r3, r5, r6)     // Catch:{ all -> 0x00a6 }
                    r2.finishPage(r4)     // Catch:{ all -> 0x00a6 }
                    android.os.CancellationSignal r1 = r2     // Catch:{ all -> 0x00a6 }
                    boolean r1 = r1.isCanceled()     // Catch:{ all -> 0x00a6 }
                    if (r1 == 0) goto L_0x00ca
                    r2.close()     // Catch:{ Throwable -> 0x0080 }
                    android.os.ParcelFileDescriptor r1 = r7     // Catch:{ Throwable -> 0x0080 }
                    if (r1 == 0) goto L_0x0078
                    android.os.ParcelFileDescriptor r1 = r7     // Catch:{ IOException -> 0x00f1 }
                    r1.close()     // Catch:{ IOException -> 0x00f1 }
                L_0x0078:
                    android.graphics.Bitmap r1 = r4     // Catch:{ Throwable -> 0x0080 }
                    if (r3 == r1) goto L_0x0009
                    r3.recycle()     // Catch:{ Throwable -> 0x0080 }
                    goto L_0x0009
                L_0x0080:
                    r0 = move-exception
                    goto L_0x0009
                L_0x0082:
                    android.print.pdf.PrintedPdfDocument r5 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00a6 }
                    android.support.v4.l.e r1 = android.support.p010v4.p029l.C0836e.this     // Catch:{ all -> 0x00a6 }
                    android.content.Context r1 = r1.f2913a     // Catch:{ all -> 0x00a6 }
                    android.print.PrintAttributes r6 = r5     // Catch:{ all -> 0x00a6 }
                    r5.<init>(r1, r6)     // Catch:{ all -> 0x00a6 }
                    r1 = 1
                    android.graphics.pdf.PdfDocument$Page r6 = r5.startPage(r1)     // Catch:{ all -> 0x00a6 }
                    android.graphics.RectF r1 = new android.graphics.RectF     // Catch:{ all -> 0x00a6 }
                    android.graphics.pdf.PdfDocument$PageInfo r7 = r6.getInfo()     // Catch:{ all -> 0x00a6 }
                    android.graphics.Rect r7 = r7.getContentRect()     // Catch:{ all -> 0x00a6 }
                    r1.<init>(r7)     // Catch:{ all -> 0x00a6 }
                    r5.finishPage(r6)     // Catch:{ all -> 0x00a6 }
                    r5.close()     // Catch:{ all -> 0x00a6 }
                    goto L_0x0043
                L_0x00a6:
                    r0 = move-exception
                    r2.close()     // Catch:{ Throwable -> 0x0080 }
                    android.os.ParcelFileDescriptor r1 = r7     // Catch:{ Throwable -> 0x0080 }
                    if (r1 == 0) goto L_0x00b3
                    android.os.ParcelFileDescriptor r1 = r7     // Catch:{ IOException -> 0x00ed }
                    r1.close()     // Catch:{ IOException -> 0x00ed }
                L_0x00b3:
                    android.graphics.Bitmap r1 = r4     // Catch:{ Throwable -> 0x0080 }
                    if (r3 == r1) goto L_0x00ba
                    r3.recycle()     // Catch:{ Throwable -> 0x0080 }
                L_0x00ba:
                    throw r0     // Catch:{ Throwable -> 0x0080 }
                L_0x00bb:
                    float r6 = r1.left     // Catch:{ all -> 0x00a6 }
                    float r7 = r1.top     // Catch:{ all -> 0x00a6 }
                    r5.postTranslate(r6, r7)     // Catch:{ all -> 0x00a6 }
                    android.graphics.Canvas r6 = r4.getCanvas()     // Catch:{ all -> 0x00a6 }
                    r6.clipRect(r1)     // Catch:{ all -> 0x00a6 }
                    goto L_0x0059
                L_0x00ca:
                    java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a6 }
                    android.os.ParcelFileDescriptor r4 = r7     // Catch:{ all -> 0x00a6 }
                    java.io.FileDescriptor r4 = r4.getFileDescriptor()     // Catch:{ all -> 0x00a6 }
                    r1.<init>(r4)     // Catch:{ all -> 0x00a6 }
                    r2.writeTo(r1)     // Catch:{ all -> 0x00a6 }
                    r2.close()     // Catch:{ Throwable -> 0x0080 }
                    android.os.ParcelFileDescriptor r1 = r7     // Catch:{ Throwable -> 0x0080 }
                    if (r1 == 0) goto L_0x00e4
                    android.os.ParcelFileDescriptor r1 = r7     // Catch:{ IOException -> 0x00ef }
                    r1.close()     // Catch:{ IOException -> 0x00ef }
                L_0x00e4:
                    android.graphics.Bitmap r1 = r4     // Catch:{ Throwable -> 0x0080 }
                    if (r3 == r1) goto L_0x0009
                    r3.recycle()     // Catch:{ Throwable -> 0x0080 }
                    goto L_0x0009
                L_0x00ed:
                    r1 = move-exception
                    goto L_0x00b3
                L_0x00ef:
                    r1 = move-exception
                    goto L_0x00e4
                L_0x00f1:
                    r1 = move-exception
                    goto L_0x0078
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p029l.C0836e.C08382.doInBackground(java.lang.Void[]):java.lang.Throwable");
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void onPostExecute(Throwable th) {
                if (cancellationSignal2.isCanceled()) {
                    writeResultCallback2.onWriteCancelled();
                } else if (th == null) {
                    writeResultCallback2.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                } else {
                    Log.e(C0836e.f2911n, "Error writing printed content", th);
                    writeResultCallback2.onWriteFailed((CharSequence) null);
                }
            }
        }.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m4155b(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    /* renamed from: a */
    public int mo2713a() {
        return this.f2917k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PrintAttributes.Builder mo2712a(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        return minMargins;
    }

    /* renamed from: a */
    public void mo2714a(int i) {
        this.f2917k = i;
    }

    /* renamed from: a */
    public void mo2715a(String str, Bitmap bitmap, C0842a aVar) {
        if (bitmap != null) {
            final int i = this.f2917k;
            final String str2 = str;
            final Bitmap bitmap2 = bitmap;
            final C0842a aVar2 = aVar;
            ((PrintManager) this.f2913a.getSystemService("print")).print(str, new PrintDocumentAdapter() {

                /* renamed from: f */
                private PrintAttributes f2926f;

                public void onFinish() {
                    if (aVar2 != null) {
                        aVar2.mo2711a();
                    }
                }

                public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                    boolean z = true;
                    this.f2926f = printAttributes2;
                    PrintDocumentInfo build = new PrintDocumentInfo.Builder(str2).setContentType(1).setPageCount(1).build();
                    if (printAttributes2.equals(printAttributes)) {
                        z = false;
                    }
                    layoutResultCallback.onLayoutFinished(build, z);
                }

                public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
                    C0836e.this.m4152a(this.f2926f, i, bitmap2, parcelFileDescriptor, cancellationSignal, writeResultCallback);
                }
            }, new PrintAttributes.Builder().setMediaSize(m4155b(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.f2918l).build());
        }
    }

    /* renamed from: a */
    public void mo2716a(String str, Uri uri, C0842a aVar) {
        final int i = this.f2917k;
        final String str2 = str;
        final Uri uri2 = uri;
        final C0842a aVar2 = aVar;
        C08393 r0 = new PrintDocumentAdapter() {

            /* renamed from: a */
            AsyncTask<Uri, Boolean, Bitmap> f2935a;

            /* renamed from: b */
            Bitmap f2936b = null;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public PrintAttributes f2942h;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void m4167a() {
                synchronized (C0836e.this.f2920p) {
                    if (C0836e.this.f2914b != null) {
                        C0836e.this.f2914b.requestCancelDecode();
                        C0836e.this.f2914b = null;
                    }
                }
            }

            public void onFinish() {
                super.onFinish();
                m4167a();
                if (this.f2935a != null) {
                    this.f2935a.cancel(true);
                }
                if (aVar2 != null) {
                    aVar2.mo2711a();
                }
                if (this.f2936b != null) {
                    this.f2936b.recycle();
                    this.f2936b = null;
                }
            }

            public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
                boolean z = true;
                synchronized (this) {
                    this.f2942h = printAttributes2;
                }
                if (cancellationSignal.isCanceled()) {
                    layoutResultCallback.onLayoutCancelled();
                } else if (this.f2936b != null) {
                    PrintDocumentInfo build = new PrintDocumentInfo.Builder(str2).setContentType(1).setPageCount(1).build();
                    if (printAttributes2.equals(printAttributes)) {
                        z = false;
                    }
                    layoutResultCallback.onLayoutFinished(build, z);
                } else {
                    final CancellationSignal cancellationSignal2 = cancellationSignal;
                    final PrintAttributes printAttributes3 = printAttributes2;
                    final PrintAttributes printAttributes4 = printAttributes;
                    final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback2 = layoutResultCallback;
                    this.f2935a = new AsyncTask<Uri, Boolean, Bitmap>() {
                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public Bitmap doInBackground(Uri... uriArr) {
                            try {
                                return C0836e.this.m4145a(uri2, (int) C0836e.f2912o);
                            } catch (FileNotFoundException e) {
                                return null;
                            }
                        }

                        /* access modifiers changed from: protected */
                        /* renamed from: a */
                        public void onPostExecute(Bitmap bitmap) {
                            PrintAttributes.MediaSize mediaSize;
                            boolean z = true;
                            super.onPostExecute(bitmap);
                            if (bitmap != null && (!C0836e.this.f2915i || C0836e.this.f2919m == 0)) {
                                synchronized (this) {
                                    mediaSize = C08393.this.f2942h.getMediaSize();
                                }
                                if (!(mediaSize == null || mediaSize.isPortrait() == C0836e.m4155b(bitmap))) {
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(90.0f);
                                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                }
                            }
                            C08393.this.f2936b = bitmap;
                            if (bitmap != null) {
                                PrintDocumentInfo build = new PrintDocumentInfo.Builder(str2).setContentType(1).setPageCount(1).build();
                                if (printAttributes3.equals(printAttributes4)) {
                                    z = false;
                                }
                                layoutResultCallback2.onLayoutFinished(build, z);
                            } else {
                                layoutResultCallback2.onLayoutFailed((CharSequence) null);
                            }
                            C08393.this.f2935a = null;
                        }

                        /* access modifiers changed from: protected */
                        /* renamed from: b */
                        public void onCancelled(Bitmap bitmap) {
                            layoutResultCallback2.onLayoutCancelled();
                            C08393.this.f2935a = null;
                        }

                        /* access modifiers changed from: protected */
                        public void onPreExecute() {
                            cancellationSignal2.setOnCancelListener(new CancellationSignal.OnCancelListener() {
                                public void onCancel() {
                                    C08393.this.m4167a();
                                    C08401.this.cancel(false);
                                }
                            });
                        }
                    }.execute(new Uri[0]);
                }
            }

            public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
                C0836e.this.m4152a(this.f2942h, i, this.f2936b, parcelFileDescriptor, cancellationSignal, writeResultCallback);
            }
        };
        PrintManager printManager = (PrintManager) this.f2913a.getSystemService("print");
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        builder.setColorMode(this.f2918l);
        if (this.f2919m == 1 || this.f2919m == 0) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        } else if (this.f2919m == 2) {
            builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager.print(str, r0, builder.build());
    }

    /* renamed from: b */
    public int mo2717b() {
        if (this.f2919m == 0) {
            return 1;
        }
        return this.f2919m;
    }

    /* renamed from: b */
    public void mo2718b(int i) {
        this.f2918l = i;
    }

    /* renamed from: c */
    public int mo2719c() {
        return this.f2918l;
    }

    /* renamed from: c */
    public void mo2720c(int i) {
        this.f2919m = i;
    }
}
