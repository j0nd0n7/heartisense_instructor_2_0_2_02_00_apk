package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0260bb;
import android.support.p010v4.p013c.C0261bc;
import android.support.p010v4.p013c.C0298bh;
import android.support.p036v7.p037a.C1359b;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v7.app.v */
class C1465v {

    /* renamed from: a */
    static final int f4544a = 3;

    /* renamed from: b */
    static final int f4545b = 5;

    /* renamed from: c */
    private static final int f4546c = 3;

    C1465v() {
    }

    /* renamed from: a */
    public static float m8576a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private static int m8577a() {
        return C1359b.C1368i.notification_action;
    }

    /* renamed from: a */
    public static int m8578a(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C1359b.C1364e.notification_top_pad);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C1359b.C1364e.notification_top_pad_large_text);
        float a = (m8576a(context.getResources().getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
        return Math.round((((float) dimensionPixelSize) * (1.0f - a)) + (((float) dimensionPixelSize2) * a));
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: a */
    private static int m8579a(boolean z, int i) {
        return i <= 3 ? z ? C1359b.C1368i.notification_template_big_media_narrow_custom : C1359b.C1368i.notification_template_big_media_narrow : z ? C1359b.C1368i.notification_template_big_media_custom : C1359b.C1368i.notification_template_big_media;
    }

    /* renamed from: a */
    private static Bitmap m8580a(Context context, int i, int i2) {
        return m8581a(context, i, i2, 0);
    }

    /* renamed from: a */
    private static Bitmap m8581a(Context context, int i, int i2, int i3) {
        Drawable drawable = context.getResources().getDrawable(i);
        int intrinsicWidth = i3 == 0 ? drawable.getIntrinsicWidth() : i3;
        if (i3 == 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, i3);
        if (i2 != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m8582a(Context context, int i, int i2, int i3, int i4) {
        int i5 = C1359b.C1365f.notification_icon_background;
        if (i4 == 0) {
            i4 = 0;
        }
        Bitmap a = m8581a(context, i5, i4, i2);
        Canvas canvas = new Canvas(a);
        Drawable mutate = context.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i2 - i3) / 2;
        mutate.setBounds(i6, i6, i3 + i6, i3 + i6);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return a;
    }

    /* renamed from: a */
    private static RemoteViews m8583a(Context context, C0261bc.C0262a aVar) {
        boolean z = aVar.f1510d == null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), z ? m8593b() : m8577a());
        remoteViews.setImageViewBitmap(C1359b.C1366g.action_image, m8580a(context, aVar.mo1328a(), context.getResources().getColor(C1359b.C1363d.notification_action_color_filter)));
        remoteViews.setTextViewText(C1359b.C1366g.action_text, aVar.f1509c);
        if (!z) {
            remoteViews.setOnClickPendingIntent(C1359b.C1366g.action_container, aVar.f1510d);
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(C1359b.C1366g.action_container, aVar.f1509c);
        }
        return remoteViews;
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: a */
    private static RemoteViews m8584a(Context context, C0298bh.C0299a aVar) {
        boolean z = aVar.mo1330c() == null;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C1359b.C1368i.notification_media_action);
        remoteViews.setImageViewResource(C1359b.C1366g.action0, aVar.mo1328a());
        if (!z) {
            remoteViews.setOnClickPendingIntent(C1359b.C1366g.action0, aVar.mo1330c());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(C1359b.C1366g.action0, aVar.mo1329b());
        }
        return remoteViews;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ed  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews m8585a(android.content.Context r13, java.lang.CharSequence r14, java.lang.CharSequence r15, java.lang.CharSequence r16, int r17, int r18, android.graphics.Bitmap r19, java.lang.CharSequence r20, boolean r21, long r22, int r24, int r25, int r26, boolean r27) {
        /*
            android.content.res.Resources r6 = r13.getResources()
            android.widget.RemoteViews r2 = new android.widget.RemoteViews
            java.lang.String r3 = r13.getPackageName()
            r0 = r26
            r2.<init>(r3, r0)
            r4 = 0
            r5 = 0
            r3 = -1
            r0 = r24
            if (r0 >= r3) goto L_0x011e
            r3 = 1
        L_0x0017:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 16
            if (r7 < r8) goto L_0x0037
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 >= r8) goto L_0x0037
            if (r3 == 0) goto L_0x0121
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.notification_background
            java.lang.String r7 = "setBackgroundResource"
            int r8 = android.support.p036v7.p037a.C1359b.C1365f.notification_bg_low
            r2.setInt(r3, r7, r8)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            java.lang.String r7 = "setBackgroundResource"
            int r8 = android.support.p036v7.p037a.C1359b.C1365f.notification_template_icon_low_bg
            r2.setInt(r3, r7, r8)
        L_0x0037:
            if (r19 == 0) goto L_0x014c
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r3 < r7) goto L_0x0135
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            r7 = 0
            r2.setViewVisibility(r3, r7)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            r0 = r19
            r2.setImageViewBitmap(r3, r0)
        L_0x004c:
            if (r18 == 0) goto L_0x0077
            int r3 = android.support.p036v7.p037a.C1359b.C1364e.notification_right_icon_size
            int r3 = r6.getDimensionPixelSize(r3)
            int r7 = android.support.p036v7.p037a.C1359b.C1364e.notification_small_icon_background_padding
            int r7 = r6.getDimensionPixelSize(r7)
            int r7 = r7 * 2
            int r7 = r3 - r7
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L_0x013e
            r0 = r18
            r1 = r25
            android.graphics.Bitmap r3 = m8582a(r13, r0, r3, r7, r1)
            int r7 = android.support.p036v7.p037a.C1359b.C1366g.right_icon
            r2.setImageViewBitmap(r7, r3)
        L_0x0071:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.right_icon
            r7 = 0
            r2.setViewVisibility(r3, r7)
        L_0x0077:
            if (r14 == 0) goto L_0x007e
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.title
            r2.setTextViewText(r3, r14)
        L_0x007e:
            if (r15 == 0) goto L_0x01f0
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.text
            r2.setTextViewText(r3, r15)
            r3 = 1
        L_0x0086:
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r4 >= r7) goto L_0x018a
            if (r19 == 0) goto L_0x018a
            r8 = 1
        L_0x008f:
            if (r16 == 0) goto L_0x018d
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.info
            r0 = r16
            r2.setTextViewText(r3, r0)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.info
            r4 = 0
            r2.setViewVisibility(r3, r4)
            r3 = 1
            r8 = 1
            r9 = r3
        L_0x00a1:
            if (r20 == 0) goto L_0x01d1
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r3 < r4) goto L_0x01d1
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.text
            r0 = r20
            r2.setTextViewText(r3, r0)
            if (r15 == 0) goto L_0x01ca
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.text2
            r2.setTextViewText(r3, r15)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.text2
            r4 = 0
            r2.setViewVisibility(r3, r4)
            r3 = 1
        L_0x00be:
            if (r3 == 0) goto L_0x00de
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r3 < r4) goto L_0x00de
            if (r27 == 0) goto L_0x00d5
            int r3 = android.support.p036v7.p037a.C1359b.C1364e.notification_subtext_size
            int r3 = r6.getDimensionPixelSize(r3)
            float r3 = (float) r3
            int r4 = android.support.p036v7.p037a.C1359b.C1366g.text
            r5 = 0
            r2.setTextViewTextSize(r4, r5, r3)
        L_0x00d5:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.line1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.setViewPadding(r3, r4, r5, r6, r7)
        L_0x00de:
            r4 = 0
            int r3 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x01ed
            if (r21 == 0) goto L_0x01d4
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r3 < r4) goto L_0x01d4
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.chronometer
            r4 = 0
            r2.setViewVisibility(r3, r4)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.chronometer
            java.lang.String r4 = "setBase"
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r10 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r10
            long r6 = r6 + r22
            r2.setLong(r3, r4, r6)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.chronometer
            java.lang.String r4 = "setStarted"
            r5 = 1
            r2.setBoolean(r3, r4, r5)
        L_0x010c:
            r3 = 1
        L_0x010d:
            int r4 = android.support.p036v7.p037a.C1359b.C1366g.right_side
            if (r3 == 0) goto L_0x01e5
            r3 = 0
        L_0x0112:
            r2.setViewVisibility(r4, r3)
            int r4 = android.support.p036v7.p037a.C1359b.C1366g.line3
            if (r9 == 0) goto L_0x01e9
            r3 = 0
        L_0x011a:
            r2.setViewVisibility(r4, r3)
            return r2
        L_0x011e:
            r3 = 0
            goto L_0x0017
        L_0x0121:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.notification_background
            java.lang.String r7 = "setBackgroundResource"
            int r8 = android.support.p036v7.p037a.C1359b.C1365f.notification_bg
            r2.setInt(r3, r7, r8)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            java.lang.String r7 = "setBackgroundResource"
            int r8 = android.support.p036v7.p037a.C1359b.C1365f.notification_template_icon_bg
            r2.setInt(r3, r7, r8)
            goto L_0x0037
        L_0x0135:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            r7 = 8
            r2.setViewVisibility(r3, r7)
            goto L_0x004c
        L_0x013e:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.right_icon
            r7 = -1
            r0 = r18
            android.graphics.Bitmap r7 = m8580a((android.content.Context) r13, (int) r0, (int) r7)
            r2.setImageViewBitmap(r3, r7)
            goto L_0x0071
        L_0x014c:
            if (r18 == 0) goto L_0x0077
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            r7 = 0
            r2.setViewVisibility(r3, r7)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r3 < r7) goto L_0x017c
            int r3 = android.support.p036v7.p037a.C1359b.C1364e.notification_large_icon_width
            int r3 = r6.getDimensionPixelSize(r3)
            int r7 = android.support.p036v7.p037a.C1359b.C1364e.notification_big_circle_margin
            int r7 = r6.getDimensionPixelSize(r7)
            int r3 = r3 - r7
            int r7 = android.support.p036v7.p037a.C1359b.C1364e.notification_small_icon_size_as_large
            int r7 = r6.getDimensionPixelSize(r7)
            r0 = r18
            r1 = r25
            android.graphics.Bitmap r3 = m8582a(r13, r0, r3, r7, r1)
            int r7 = android.support.p036v7.p037a.C1359b.C1366g.icon
            r2.setImageViewBitmap(r7, r3)
            goto L_0x0077
        L_0x017c:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.icon
            r7 = -1
            r0 = r18
            android.graphics.Bitmap r7 = m8580a((android.content.Context) r13, (int) r0, (int) r7)
            r2.setImageViewBitmap(r3, r7)
            goto L_0x0077
        L_0x018a:
            r8 = 0
            goto L_0x008f
        L_0x018d:
            if (r17 <= 0) goto L_0x01c0
            int r3 = android.support.p036v7.p037a.C1359b.C1367h.status_bar_notification_info_maxnum
            int r3 = r6.getInteger(r3)
            r0 = r17
            if (r0 <= r3) goto L_0x01af
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.info
            int r4 = android.support.p036v7.p037a.C1359b.C1369j.status_bar_notification_info_overflow
            java.lang.String r4 = r6.getString(r4)
            r2.setTextViewText(r3, r4)
        L_0x01a4:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.info
            r4 = 0
            r2.setViewVisibility(r3, r4)
            r3 = 1
            r8 = 1
            r9 = r3
            goto L_0x00a1
        L_0x01af:
            java.text.NumberFormat r3 = java.text.NumberFormat.getIntegerInstance()
            int r4 = android.support.p036v7.p037a.C1359b.C1366g.info
            r0 = r17
            long r8 = (long) r0
            java.lang.String r3 = r3.format(r8)
            r2.setTextViewText(r4, r3)
            goto L_0x01a4
        L_0x01c0:
            int r4 = android.support.p036v7.p037a.C1359b.C1366g.info
            r7 = 8
            r2.setViewVisibility(r4, r7)
            r9 = r3
            goto L_0x00a1
        L_0x01ca:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.text2
            r4 = 8
            r2.setViewVisibility(r3, r4)
        L_0x01d1:
            r3 = r5
            goto L_0x00be
        L_0x01d4:
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.time
            r4 = 0
            r2.setViewVisibility(r3, r4)
            int r3 = android.support.p036v7.p037a.C1359b.C1366g.time
            java.lang.String r4 = "setTime"
            r0 = r22
            r2.setLong(r3, r4, r0)
            goto L_0x010c
        L_0x01e5:
            r3 = 8
            goto L_0x0112
        L_0x01e9:
            r3 = 8
            goto L_0x011a
        L_0x01ed:
            r3 = r8
            goto L_0x010d
        L_0x01f0:
            r3 = r4
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.app.C1465v.m8585a(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, int, android.graphics.Bitmap, java.lang.CharSequence, boolean, long, int, int, int, boolean):android.widget.RemoteViews");
    }

    /* renamed from: a */
    public static RemoteViews m8586a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, int i2, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i3, int i4, int i5, boolean z2, ArrayList<C0261bc.C0262a> arrayList) {
        boolean z3;
        int size;
        RemoteViews a = m8585a(context, charSequence, charSequence2, charSequence3, i, i2, bitmap, charSequence4, z, j, i3, i4, i5, z2);
        a.removeAllViews(C1359b.C1366g.actions);
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            z3 = false;
        } else {
            int i6 = size > 3 ? 3 : size;
            for (int i7 = 0; i7 < i6; i7++) {
                a.addView(C1359b.C1366g.actions, m8583a(context, arrayList.get(i7)));
            }
            z3 = true;
        }
        int i8 = z3 ? 0 : 8;
        a.setViewVisibility(C1359b.C1366g.actions, i8);
        a.setViewVisibility(C1359b.C1366g.action_divider, i8);
        return a;
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: a */
    public static <T extends C0298bh.C0299a> RemoteViews m8587a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, int i3, List<T> list, boolean z2, PendingIntent pendingIntent, boolean z3) {
        int min = Math.min(list.size(), 5);
        RemoteViews a = m8585a(context, charSequence, charSequence2, charSequence3, i, 0, bitmap, charSequence4, z, j, i2, i3, m8579a(z3, min), false);
        a.removeAllViews(C1359b.C1366g.media_actions);
        if (min > 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= min) {
                    break;
                }
                a.addView(C1359b.C1366g.media_actions, m8584a(context, (C0298bh.C0299a) list.get(i5)));
                i4 = i5 + 1;
            }
        }
        if (z2) {
            a.setViewVisibility(C1359b.C1366g.cancel_action, 0);
            a.setInt(C1359b.C1366g.cancel_action, "setAlpha", context.getResources().getInteger(C1359b.C1367h.cancel_button_image_alpha));
            a.setOnClickPendingIntent(C1359b.C1366g.cancel_action, pendingIntent);
        } else {
            a.setViewVisibility(C1359b.C1366g.cancel_action, 8);
        }
        return a;
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: a */
    private static <T extends C0298bh.C0299a> RemoteViews m8588a(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent, boolean z3) {
        RemoteViews a = m8585a(context, charSequence, charSequence2, charSequence3, i, 0, bitmap, charSequence4, z, j, i2, 0, z3 ? C1359b.C1368i.notification_template_media_custom : C1359b.C1368i.notification_template_media, true);
        int size = list.size();
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        a.removeAllViews(C1359b.C1366g.media_actions);
        if (min > 0) {
            for (int i3 = 0; i3 < min; i3++) {
                if (i3 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i3), Integer.valueOf(size - 1)}));
                }
                a.addView(C1359b.C1366g.media_actions, m8584a(context, (C0298bh.C0299a) list.get(iArr[i3])));
            }
        }
        if (z2) {
            a.setViewVisibility(C1359b.C1366g.end_padder, 8);
            a.setViewVisibility(C1359b.C1366g.cancel_action, 0);
            a.setOnClickPendingIntent(C1359b.C1366g.cancel_action, pendingIntent);
            a.setInt(C1359b.C1366g.cancel_action, "setAlpha", context.getResources().getInteger(C1359b.C1367h.cancel_button_image_alpha));
        } else {
            a.setViewVisibility(C1359b.C1366g.end_padder, 0);
            a.setViewVisibility(C1359b.C1366g.cancel_action, 8);
        }
        return a;
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: a */
    public static <T extends C0298bh.C0299a> RemoteViews m8589a(C0260bb bbVar, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, List<T> list, int[] iArr, boolean z2, PendingIntent pendingIntent, boolean z3) {
        RemoteViews a = m8588a(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, i2, list, iArr, z2, pendingIntent, z3);
        bbVar.mo1326a().setContent(a);
        if (z2) {
            bbVar.mo1326a().setOngoing(true);
        }
        return a;
    }

    @C0007ae(mo1a = 16)
    @TargetApi(16)
    /* renamed from: a */
    public static <T extends C0298bh.C0299a> void m8590a(Notification notification, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Bitmap bitmap, CharSequence charSequence4, boolean z, long j, int i2, int i3, List<T> list, boolean z2, PendingIntent pendingIntent, boolean z3) {
        notification.bigContentView = m8587a(context, charSequence, charSequence2, charSequence3, i, bitmap, charSequence4, z, j, i2, i3, list, z2, pendingIntent, z3);
        if (z2) {
            notification.flags |= 2;
        }
    }

    /* renamed from: a */
    public static void m8591a(Context context, RemoteViews remoteViews, RemoteViews remoteViews2) {
        m8592a(remoteViews);
        remoteViews.removeAllViews(C1359b.C1366g.notification_main_column);
        remoteViews.addView(C1359b.C1366g.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(C1359b.C1366g.notification_main_column, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            remoteViews.setViewPadding(C1359b.C1366g.notification_main_column_container, 0, m8578a(context), 0, 0);
        }
    }

    /* renamed from: a */
    private static void m8592a(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(C1359b.C1366g.title, 8);
        remoteViews.setViewVisibility(C1359b.C1366g.text2, 8);
        remoteViews.setViewVisibility(C1359b.C1366g.text, 8);
    }

    /* renamed from: b */
    private static int m8593b() {
        return C1359b.C1368i.notification_action_tombstone;
    }
}
