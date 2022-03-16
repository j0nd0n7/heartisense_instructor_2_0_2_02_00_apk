package android.support.p010v4.p025i.p026a;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.p010v4.p025i.C0690g;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.i.a.c */
public class C0585c extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f2275a = "MediaButtonReceiver";

    /* renamed from: a */
    public static PendingIntent m3010a(Context context, long j) {
        ComponentName a = m3012a(context);
        if (a != null) {
            return m3011a(context, a, j);
        }
        Log.w(f2275a, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
        return null;
    }

    /* renamed from: a */
    public static PendingIntent m3011a(Context context, ComponentName componentName, long j) {
        if (componentName == null) {
            Log.w(f2275a, "The component name of media button receiver should be provided.");
            return null;
        }
        int a = C0662q.m3640a(j);
        if (a == 0) {
            Log.w(f2275a, "Cannot build a media button pending intent with the given action: " + j);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, a));
        return PendingIntent.getBroadcast(context, a, intent, 0);
    }

    /* renamed from: a */
    static ComponentName m3012a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ResolveInfo resolveInfo = queryBroadcastReceivers.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        if (queryBroadcastReceivers.size() > 1) {
            Log.w(f2275a, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }

    /* renamed from: a */
    public static KeyEvent m3013a(C0618h hVar, Intent intent) {
        if (hVar == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        hVar.mo2235d().mo2110a(keyEvent);
        return keyEvent;
    }

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.setPackage(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (queryIntentServices.isEmpty()) {
            intent2.setAction(C0690g.f2619c);
            queryIntentServices = packageManager.queryIntentServices(intent2, 0);
        }
        if (queryIntentServices.isEmpty()) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or a media browser service implementation");
        } else if (queryIntentServices.size() != 1) {
            throw new IllegalStateException("Expected 1 Service that handles " + intent2.getAction() + ", found " + queryIntentServices.size());
        } else {
            ResolveInfo resolveInfo = queryIntentServices.get(0);
            intent.setComponent(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
            context.startService(intent);
        }
    }
}
