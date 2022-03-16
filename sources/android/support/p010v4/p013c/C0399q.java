package android.support.p010v4.p013c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.p010v4.p014d.C0446n;
import android.support.p010v4.p014d.C0473v;

/* renamed from: android.support.v4.c.q */
public class C0399q {

    /* renamed from: a */
    private static final String f1879a = "android.support.AppLaunchChecker";

    /* renamed from: b */
    private static final String f1880b = "startedFromLauncher";

    /* renamed from: a */
    public static void m2230a(Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f1879a, 0);
        if (sharedPreferences.getBoolean(f1880b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(C0446n.f1987f)) {
            C0473v.C0474a.m2516a().mo1808a(sharedPreferences.edit().putBoolean(f1880b, true));
        }
    }

    /* renamed from: a */
    public static boolean m2231a(Context context) {
        return context.getSharedPreferences(f1879a, 0).getBoolean(f1880b, false);
    }
}
