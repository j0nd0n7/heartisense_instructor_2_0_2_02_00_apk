package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.C0007ae;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.c.ca */
class C0355ca {

    /* renamed from: a */
    private static final String f1847a = ".sharecompat_";

    C0355ca() {
    }

    /* renamed from: a */
    public static void m2076a(MenuItem menuItem, Activity activity, Intent intent) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(activity) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f1847a + activity.getClass().getName());
        shareActionProvider.setShareIntent(intent);
        menuItem.setActionProvider(shareActionProvider);
    }
}
