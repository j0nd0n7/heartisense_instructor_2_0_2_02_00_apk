package com.p048a.p049a.p074h.p076b;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.p048a.p049a.p074h.p075a.C2185c;

/* renamed from: com.a.a.h.b.a */
public class C2200a extends C2209j<Bitmap> {

    /* renamed from: b */
    private final int[] f7252b;

    /* renamed from: c */
    private final ComponentName f7253c;

    /* renamed from: d */
    private final RemoteViews f7254d;

    /* renamed from: e */
    private final Context f7255e;

    /* renamed from: f */
    private final int f7256f;

    public C2200a(Context context, RemoteViews remoteViews, int i, int i2, int i3, ComponentName componentName) {
        super(i2, i3);
        if (context == null) {
            throw new NullPointerException("Context can not be null!");
        } else if (componentName == null) {
            throw new NullPointerException("ComponentName can not be null!");
        } else if (remoteViews == null) {
            throw new NullPointerException("RemoteViews object can not be null!");
        } else {
            this.f7255e = context;
            this.f7254d = remoteViews;
            this.f7256f = i;
            this.f7253c = componentName;
            this.f7252b = null;
        }
    }

    public C2200a(Context context, RemoteViews remoteViews, int i, int i2, int i3, int... iArr) {
        super(i2, i3);
        if (context == null) {
            throw new NullPointerException("Context can not be null!");
        } else if (iArr == null) {
            throw new NullPointerException("WidgetIds can not be null!");
        } else if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        } else if (remoteViews == null) {
            throw new NullPointerException("RemoteViews object can not be null!");
        } else {
            this.f7255e = context;
            this.f7254d = remoteViews;
            this.f7256f = i;
            this.f7252b = iArr;
            this.f7253c = null;
        }
    }

    public C2200a(Context context, RemoteViews remoteViews, int i, ComponentName componentName) {
        this(context, remoteViews, i, Integer.MIN_VALUE, Integer.MIN_VALUE, componentName);
    }

    public C2200a(Context context, RemoteViews remoteViews, int i, int... iArr) {
        this(context, remoteViews, i, Integer.MIN_VALUE, Integer.MIN_VALUE, iArr);
    }

    /* renamed from: a */
    private void m12492a() {
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f7255e);
        if (this.f7253c != null) {
            instance.updateAppWidget(this.f7253c, this.f7254d);
        } else {
            instance.updateAppWidget(this.f7252b, this.f7254d);
        }
    }

    /* renamed from: a */
    public void mo8051a(Bitmap bitmap, C2185c<? super Bitmap> cVar) {
        this.f7254d.setImageViewBitmap(this.f7256f, bitmap);
        m12492a();
    }
}
