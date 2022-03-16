package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0298bh;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.c.bg */
class C0296bg {

    /* renamed from: a */
    public static final String f1690a = "call";

    /* renamed from: b */
    public static final String f1691b = "msg";

    /* renamed from: c */
    public static final String f1692c = "email";

    /* renamed from: d */
    public static final String f1693d = "event";

    /* renamed from: e */
    public static final String f1694e = "promo";

    /* renamed from: f */
    public static final String f1695f = "alarm";

    /* renamed from: g */
    public static final String f1696g = "progress";

    /* renamed from: h */
    public static final String f1697h = "social";

    /* renamed from: i */
    public static final String f1698i = "err";

    /* renamed from: j */
    public static final String f1699j = "transport";

    /* renamed from: k */
    public static final String f1700k = "sys";

    /* renamed from: l */
    public static final String f1701l = "service";

    /* renamed from: m */
    public static final String f1702m = "recommendation";

    /* renamed from: n */
    public static final String f1703n = "status";

    /* renamed from: android.support.v4.c.bg$a */
    public static class C0297a implements C0259ba, C0260bb {

        /* renamed from: a */
        private Notification.Builder f1704a;

        public C0297a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, CharSequence[] charSequenceArr, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
            this.f1704a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setExtras(bundle).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2).setRemoteInputHistory(charSequenceArr);
            if (remoteViews2 != null) {
                this.f1704a.setCustomContentView(remoteViews2);
            }
            if (remoteViews3 != null) {
                this.f1704a.setCustomBigContentView(remoteViews3);
            }
            if (remoteViews4 != null) {
                this.f1704a.setCustomHeadsUpContentView(remoteViews4);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f1704a.addPerson(it.next());
            }
        }

        /* renamed from: a */
        public Notification.Builder mo1326a() {
            return this.f1704a;
        }

        /* renamed from: a */
        public void mo1325a(C0298bh.C0299a aVar) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo1328a(), aVar.mo1329b(), aVar.mo1330c());
            if (aVar.mo1334g() != null) {
                for (RemoteInput addRemoteInput : C0336bu.m1997a(aVar.mo1334g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo1331d() != null ? new Bundle(aVar.mo1331d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1332e());
            builder.addExtras(bundle);
            builder.setAllowGeneratedReplies(aVar.mo1332e());
            this.f1704a.addAction(builder.build());
        }

        /* renamed from: b */
        public Notification mo1327b() {
            return this.f1704a.build();
        }
    }

    C0296bg() {
    }

    /* renamed from: a */
    public static void m1864a(C0260bb bbVar, CharSequence charSequence, CharSequence charSequence2, List<CharSequence> list, List<Long> list2, List<CharSequence> list3, List<String> list4, List<Uri> list5) {
        Notification.MessagingStyle conversationTitle = new Notification.MessagingStyle(charSequence).setConversationTitle(charSequence2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(list.get(i2), list2.get(i2).longValue(), list3.get(i2));
                if (list4.get(i2) != null) {
                    message.setData(list4.get(i2), list5.get(i2));
                }
                conversationTitle.addMessage(message);
                i = i2 + 1;
            } else {
                conversationTitle.setBuilder(bbVar.mo1326a());
                return;
            }
        }
    }
}
