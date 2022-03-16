package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0007ae;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.c.b */
class C0257b {

    /* renamed from: a */
    private static final String f1435a = "ActionBarDrawerToggleHoneycomb";

    /* renamed from: b */
    private static final int[] f1436b = {16843531};

    /* renamed from: android.support.v4.c.b$a */
    private static class C0258a {

        /* renamed from: a */
        public Method f1437a;

        /* renamed from: b */
        public Method f1438b;

        /* renamed from: c */
        public ImageView f1439c;

        C0258a(Activity activity) {
            try {
                this.f1437a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f1438b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException e) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View view = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (view instanceof ImageView) {
                            this.f1439c = (ImageView) view;
                        }
                    }
                }
            }
        }
    }

    C0257b() {
    }

    /* renamed from: a */
    public static Drawable m1570a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f1436b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: a */
    public static Object m1571a(Object obj, Activity activity, int i) {
        Object aVar = obj == null ? new C0258a(activity) : obj;
        C0258a aVar2 = (C0258a) aVar;
        if (aVar2.f1437a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f1438b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w(f1435a, "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static Object m1572a(Object obj, Activity activity, Drawable drawable, int i) {
        Object aVar = obj == null ? new C0258a(activity) : obj;
        C0258a aVar2 = (C0258a) aVar;
        if (aVar2.f1437a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f1437a.invoke(actionBar, new Object[]{drawable});
                aVar2.f1438b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w(f1435a, "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (aVar2.f1439c != null) {
            aVar2.f1439c.setImageDrawable(drawable);
        } else {
            Log.w(f1435a, "Couldn't set home-as-up indicator");
        }
        return aVar;
    }
}
