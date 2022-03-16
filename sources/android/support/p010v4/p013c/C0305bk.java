package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.C0007ae;
import android.widget.RemoteViews;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.c.bk */
class C0305bk {

    /* renamed from: android.support.v4.c.bk$a */
    public static class C0306a implements C0260bb {

        /* renamed from: a */
        private Notification.Builder f1712a;

        public C0306a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z) {
            this.f1712a = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setProgress(i2, i3, z);
        }

        /* renamed from: a */
        public Notification.Builder mo1326a() {
            return this.f1712a;
        }

        /* renamed from: b */
        public Notification mo1327b() {
            return this.f1712a.getNotification();
        }
    }

    C0305bk() {
    }
}
