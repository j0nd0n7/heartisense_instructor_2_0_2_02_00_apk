package com.p048a.p049a.p052c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.a.a.c.a */
public class C1890a {

    /* renamed from: a */
    private static final String f6493a = "AnimatedGifEncoder";

    /* renamed from: b */
    private static final double f6494b = 4.0d;

    /* renamed from: c */
    private int f6495c;

    /* renamed from: d */
    private int f6496d;

    /* renamed from: e */
    private Integer f6497e = null;

    /* renamed from: f */
    private int f6498f;

    /* renamed from: g */
    private int f6499g = -1;

    /* renamed from: h */
    private int f6500h = 0;

    /* renamed from: i */
    private boolean f6501i = false;

    /* renamed from: j */
    private OutputStream f6502j;

    /* renamed from: k */
    private Bitmap f6503k;

    /* renamed from: l */
    private byte[] f6504l;

    /* renamed from: m */
    private byte[] f6505m;

    /* renamed from: n */
    private int f6506n;

    /* renamed from: o */
    private byte[] f6507o;

    /* renamed from: p */
    private boolean[] f6508p = new boolean[256];

    /* renamed from: q */
    private int f6509q = 7;

    /* renamed from: r */
    private int f6510r = -1;

    /* renamed from: s */
    private boolean f6511s = false;

    /* renamed from: t */
    private boolean f6512t = true;

    /* renamed from: u */
    private boolean f6513u = false;

    /* renamed from: v */
    private int f6514v = 10;

    /* renamed from: w */
    private boolean f6515w;

    /* renamed from: b */
    private void m11463b() {
        int length = this.f6504l.length;
        int i = length / 3;
        this.f6505m = new byte[i];
        C1892c cVar = new C1892c(this.f6504l, length, this.f6514v);
        this.f6507o = cVar.mo7706d();
        for (int i2 = 0; i2 < this.f6507o.length; i2 += 3) {
            byte b = this.f6507o[i2];
            this.f6507o[i2] = this.f6507o[i2 + 2];
            this.f6507o[i2 + 2] = b;
            this.f6508p[i2 / 3] = false;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            i3 = i6 + 1;
            int a = cVar.mo7699a(this.f6504l[i3] & 255, this.f6504l[i5] & 255, this.f6504l[i6] & 255);
            this.f6508p[a] = true;
            this.f6505m[i4] = (byte) a;
        }
        this.f6504l = null;
        this.f6506n = 8;
        this.f6509q = 7;
        if (this.f6497e != null) {
            this.f6498f = m11468f(this.f6497e.intValue());
        } else if (this.f6515w) {
            this.f6498f = m11468f(0);
        }
    }

    /* renamed from: b */
    private void m11464b(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.f6502j.write((byte) str.charAt(i));
        }
    }

    /* renamed from: c */
    private void m11465c() {
        boolean z = false;
        int width = this.f6503k.getWidth();
        int height = this.f6503k.getHeight();
        if (!(width == this.f6495c && height == this.f6496d)) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f6495c, this.f6496d, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.f6503k = createBitmap;
        }
        int[] iArr = new int[(width * height)];
        this.f6503k.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f6504l = new byte[(iArr.length * 3)];
        this.f6515w = false;
        int i = 0;
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 == 0) {
                i++;
            }
            int i4 = i2 + 1;
            this.f6504l[i2] = (byte) (i3 & 255);
            int i5 = i4 + 1;
            this.f6504l[i4] = (byte) ((i3 >> 8) & 255);
            i2 = i5 + 1;
            this.f6504l[i5] = (byte) ((i3 >> 16) & 255);
        }
        double length = ((double) (i * 100)) / ((double) iArr.length);
        if (length > f6494b) {
            z = true;
        }
        this.f6515w = z;
        if (Log.isLoggable(f6493a, 3)) {
            Log.d(f6493a, "got pixels for frame with " + length + "% transparent pixels");
        }
    }

    /* renamed from: d */
    private void m11466d() {
        int i;
        int i2;
        this.f6502j.write(33);
        this.f6502j.write(249);
        this.f6502j.write(4);
        if (this.f6497e != null || this.f6515w) {
            i = 1;
            i2 = 2;
        } else {
            i2 = 0;
            i = 0;
        }
        if (this.f6510r >= 0) {
            i2 = this.f6510r & 7;
        }
        this.f6502j.write((i2 << 2) | 0 | 0 | i);
        m11471g(this.f6500h);
        this.f6502j.write(this.f6498f);
        this.f6502j.write(0);
    }

    /* renamed from: e */
    private void m11467e() {
        this.f6502j.write(44);
        m11471g(0);
        m11471g(0);
        m11471g(this.f6495c);
        m11471g(this.f6496d);
        if (this.f6512t) {
            this.f6502j.write(0);
        } else {
            this.f6502j.write(this.f6509q | 128);
        }
    }

    /* renamed from: f */
    private int m11468f(int i) {
        int i2;
        int i3 = 0;
        if (this.f6507o == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int i4 = 16777216;
        int length = this.f6507o.length;
        int i5 = 0;
        while (i3 < length) {
            int i6 = i3 + 1;
            int i7 = red - (this.f6507o[i3] & 255);
            int i8 = i6 + 1;
            int i9 = green - (this.f6507o[i6] & 255);
            int i10 = blue - (this.f6507o[i8] & 255);
            int i11 = (i7 * i7) + (i9 * i9) + (i10 * i10);
            int i12 = i8 / 3;
            if (!this.f6508p[i12] || i11 >= i4) {
                i11 = i4;
                i2 = i5;
            } else {
                i2 = i12;
            }
            i5 = i2;
            i4 = i11;
            i3 = i8 + 1;
        }
        return i5;
    }

    /* renamed from: f */
    private void m11469f() {
        m11471g(this.f6495c);
        m11471g(this.f6496d);
        this.f6502j.write(this.f6509q | 240);
        this.f6502j.write(0);
        this.f6502j.write(0);
    }

    /* renamed from: g */
    private void m11470g() {
        this.f6502j.write(33);
        this.f6502j.write(255);
        this.f6502j.write(11);
        m11464b("NETSCAPE2.0");
        this.f6502j.write(3);
        this.f6502j.write(1);
        m11471g(this.f6499g);
        this.f6502j.write(0);
    }

    /* renamed from: g */
    private void m11471g(int i) {
        this.f6502j.write(i & 255);
        this.f6502j.write((i >> 8) & 255);
    }

    /* renamed from: h */
    private void m11472h() {
        this.f6502j.write(this.f6507o, 0, this.f6507o.length);
        int length = 768 - this.f6507o.length;
        for (int i = 0; i < length; i++) {
            this.f6502j.write(0);
        }
    }

    /* renamed from: i */
    private void m11473i() {
        new C1891b(this.f6495c, this.f6496d, this.f6505m, this.f6506n).mo7697b(this.f6502j);
    }

    /* renamed from: a */
    public void mo7680a(float f) {
        if (f != 0.0f) {
            this.f6500h = Math.round(100.0f / f);
        }
    }

    /* renamed from: a */
    public void mo7681a(int i) {
        this.f6500h = Math.round(((float) i) / 10.0f);
    }

    /* renamed from: a */
    public void mo7682a(int i, int i2) {
        if (!this.f6501i || this.f6512t) {
            this.f6495c = i;
            this.f6496d = i2;
            if (this.f6495c < 1) {
                this.f6495c = 320;
            }
            if (this.f6496d < 1) {
                this.f6496d = 240;
            }
            this.f6513u = true;
        }
    }

    /* renamed from: a */
    public boolean mo7683a() {
        boolean z;
        if (!this.f6501i) {
            return false;
        }
        this.f6501i = false;
        try {
            this.f6502j.write(59);
            this.f6502j.flush();
            if (this.f6511s) {
                this.f6502j.close();
            }
            z = true;
        } catch (IOException e) {
            z = false;
        }
        this.f6498f = 0;
        this.f6502j = null;
        this.f6503k = null;
        this.f6504l = null;
        this.f6505m = null;
        this.f6507o = null;
        this.f6511s = false;
        this.f6512t = true;
        return z;
    }

    /* renamed from: a */
    public boolean mo7684a(Bitmap bitmap) {
        if (bitmap == null || !this.f6501i) {
            return false;
        }
        try {
            if (!this.f6513u) {
                mo7682a(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f6503k = bitmap;
            m11465c();
            m11463b();
            if (this.f6512t) {
                m11469f();
                m11472h();
                if (this.f6499g >= 0) {
                    m11470g();
                }
            }
            m11466d();
            m11467e();
            if (!this.f6512t) {
                m11472h();
            }
            m11473i();
            this.f6512t = false;
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo7685a(OutputStream outputStream) {
        if (outputStream == null) {
            return false;
        }
        boolean z = true;
        this.f6511s = false;
        this.f6502j = outputStream;
        try {
            m11464b("GIF89a");
        } catch (IOException e) {
            z = false;
        }
        this.f6501i = z;
        return z;
    }

    /* renamed from: a */
    public boolean mo7686a(String str) {
        boolean z;
        try {
            this.f6502j = new BufferedOutputStream(new FileOutputStream(str));
            z = mo7685a(this.f6502j);
            this.f6511s = true;
        } catch (IOException e) {
            z = false;
        }
        this.f6501i = z;
        return z;
    }

    /* renamed from: b */
    public void mo7687b(int i) {
        if (i >= 0) {
            this.f6510r = i;
        }
    }

    /* renamed from: c */
    public void mo7688c(int i) {
        if (i >= 0) {
            this.f6499g = i;
        }
    }

    /* renamed from: d */
    public void mo7689d(int i) {
        this.f6497e = Integer.valueOf(i);
    }

    /* renamed from: e */
    public void mo7690e(int i) {
        if (i < 1) {
            i = 1;
        }
        this.f6514v = i;
    }
}
