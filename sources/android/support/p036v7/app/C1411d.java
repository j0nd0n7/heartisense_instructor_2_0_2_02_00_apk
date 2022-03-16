package android.support.p036v7.app;

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
/* renamed from: android.support.v7.app.d */
class C1411d {

    /* renamed from: a */
    private static final String f4402a = "ActionBarDrawerToggleHoneycomb";

    /* renamed from: b */
    private static final int[] f4403b = {16843531};

    /* renamed from: android.support.v7.app.d$a */
    static class C1412a {

        /* renamed from: a */
        public Method f4404a;

        /* renamed from: b */
        public Method f4405b;

        /* renamed from: c */
        public ImageView f4406c;

        C1412a(Activity activity) {
            try {
                this.f4404a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f4405b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException e) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View view = childAt.getId() != 16908332 ? childAt : viewGroup.getChildAt(1);
                        if (view instanceof ImageView) {
                            this.f4406c = (ImageView) view;
                        }
                    }
                }
            }
        }
    }

    C1411d() {
    }

    /* renamed from: a */
    public static Drawable m8258a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f4403b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: a */
    public static C1412a m8259a(C1412a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C1412a(activity);
        }
        if (aVar.f4404a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f4405b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w(f4402a, "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C1412a m8260a(C1412a aVar, Activity activity, Drawable drawable, int i) {
        C1412a aVar2 = new C1412a(activity);
        if (aVar2.f4404a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f4404a.invoke(actionBar, new Object[]{drawable});
                aVar2.f4405b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w(f4402a, "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (aVar2.f4406c != null) {
            aVar2.f4406c.setImageDrawable(drawable);
        } else {
            Log.w(f4402a, "Couldn't set home-as-up indicator");
        }
        return aVar2;
    }
}
