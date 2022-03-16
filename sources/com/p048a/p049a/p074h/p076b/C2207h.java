package com.p048a.p049a.p074h.p076b;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.p048a.p049a.p074h.p075a.C2185c;

/* renamed from: com.a.a.h.b.h */
public class C2207h extends C2209j<Bitmap> {

    /* renamed from: b */
    private final RemoteViews f7261b;

    /* renamed from: c */
    private final Context f7262c;

    /* renamed from: d */
    private final int f7263d;

    /* renamed from: e */
    private final Notification f7264e;

    /* renamed from: f */
    private final int f7265f;

    public C2207h(Context context, RemoteViews remoteViews, int i, int i2, int i3, Notification notification, int i4) {
        super(i2, i3);
        if (context == null) {
            throw new NullPointerException("Context must not be null!");
        } else if (notification == null) {
            throw new NullPointerException("Notification object can not be null!");
        } else if (remoteViews == null) {
            throw new NullPointerException("RemoteViews object can not be null!");
        } else {
            this.f7262c = context;
            this.f7265f = i;
            this.f7264e = notification;
            this.f7263d = i4;
            this.f7261b = remoteViews;
        }
    }

    public C2207h(Context context, RemoteViews remoteViews, int i, Notification notification, int i2) {
        this(context, remoteViews, i, Integer.MIN_VALUE, Integer.MIN_VALUE, notification, i2);
    }

    /* renamed from: a */
    private void m12521a() {
        ((NotificationManager) this.f7262c.getSystemService("notification")).notify(this.f7263d, this.f7264e);
    }

    /* renamed from: a */
    public void mo8051a(Bitmap bitmap, C2185c<? super Bitmap> cVar) {
        this.f7261b.setImageViewBitmap(this.f7265f, bitmap);
        m12521a();
    }
}
