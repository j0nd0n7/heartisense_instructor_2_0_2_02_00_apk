package android.support.p036v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.bm */
public class C1804bm extends ContextWrapper {

    /* renamed from: a */
    private static final Object f6096a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C1804bm>> f6097b;

    /* renamed from: c */
    private final Resources f6098c;

    /* renamed from: d */
    private final Resources.Theme f6099d;

    private C1804bm(@C0047z Context context) {
        super(context);
        if (C1811br.m11020a()) {
            this.f6098c = new C1811br(this, context.getResources());
            this.f6099d = this.f6098c.newTheme();
            this.f6099d.setTo(context.getTheme());
            return;
        }
        this.f6098c = new C1806bo(this, context.getResources());
        this.f6099d = null;
    }

    /* renamed from: a */
    public static Context m10918a(@C0047z Context context) {
        if (!m10919b(context)) {
            return context;
        }
        synchronized (f6096a) {
            if (f6097b == null) {
                f6097b = new ArrayList<>();
            } else {
                for (int size = f6097b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f6097b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f6097b.remove(size);
                    }
                }
                for (int size2 = f6097b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f6097b.get(size2);
                    C1804bm bmVar = weakReference2 != null ? (C1804bm) weakReference2.get() : null;
                    if (bmVar != null && bmVar.getBaseContext() == context) {
                        return bmVar;
                    }
                }
            }
            C1804bm bmVar2 = new C1804bm(context);
            f6097b.add(new WeakReference(bmVar2));
            return bmVar2;
        }
    }

    /* renamed from: b */
    private static boolean m10919b(@C0047z Context context) {
        if ((context instanceof C1804bm) || (context.getResources() instanceof C1806bo) || (context.getResources() instanceof C1811br)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C1811br.m11020a();
    }

    public AssetManager getAssets() {
        return this.f6098c.getAssets();
    }

    public Resources getResources() {
        return this.f6098c;
    }

    public Resources.Theme getTheme() {
        return this.f6099d == null ? super.getTheme() : this.f6099d;
    }

    public void setTheme(int i) {
        if (this.f6099d == null) {
            super.setTheme(i);
        } else {
            this.f6099d.applyStyle(i, true);
        }
    }
}
