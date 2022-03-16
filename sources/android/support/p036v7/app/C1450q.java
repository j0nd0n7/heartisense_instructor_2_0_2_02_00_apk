package android.support.p036v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0876a;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1525d;
import android.support.p036v7.widget.C1664ab;
import android.support.p036v7.widget.C1804bm;
import android.support.p036v7.widget.C1842g;
import android.support.p036v7.widget.C1844i;
import android.support.p036v7.widget.C1845j;
import android.support.p036v7.widget.C1846k;
import android.support.p036v7.widget.C1854n;
import android.support.p036v7.widget.C1855o;
import android.support.p036v7.widget.C1857q;
import android.support.p036v7.widget.C1858r;
import android.support.p036v7.widget.C1862u;
import android.support.p036v7.widget.C1863v;
import android.support.p036v7.widget.C1864w;
import android.support.p036v7.widget.C1866y;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.q */
class C1450q {

    /* renamed from: a */
    private static final Class<?>[] f4529a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f4530b = {16843375};

    /* renamed from: c */
    private static final String[] f4531c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final String f4532d = "AppCompatViewInflater";

    /* renamed from: e */
    private static final Map<String, Constructor<? extends View>> f4533e = new C0876a();

    /* renamed from: f */
    private final Object[] f4534f = new Object[2];

    /* renamed from: android.support.v7.app.q$a */
    private static class C1451a implements View.OnClickListener {

        /* renamed from: a */
        private final View f4535a;

        /* renamed from: b */
        private final String f4536b;

        /* renamed from: c */
        private Method f4537c;

        /* renamed from: d */
        private Context f4538d;

        public C1451a(@C0047z View view, @C0047z String str) {
            this.f4535a = view;
            this.f4536b = str;
        }

        @C0047z
        /* renamed from: a */
        private void m8535a(@C0003aa Context context, @C0047z String str) {
            Method method;
            for (Context context2 = context; context2 != null; context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null) {
                try {
                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.f4536b, new Class[]{View.class})) != null) {
                        this.f4537c = method;
                        this.f4538d = context2;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
            }
            int id = this.f4535a.getId();
            throw new IllegalStateException("Could not find method " + this.f4536b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f4535a.getClass() + (id == -1 ? "" : " with id '" + this.f4535a.getContext().getResources().getResourceEntryName(id) + "'"));
        }

        public void onClick(@C0047z View view) {
            if (this.f4537c == null) {
                m8535a(this.f4535a.getContext(), this.f4536b);
            }
            try {
                this.f4537c.invoke(this.f4538d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    C1450q() {
    }

    /* renamed from: a */
    private static Context m8530a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C1359b.C1371l.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C1359b.C1371l.View_theme, 0)) != 0) {
            Log.i(f4532d, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        return i != 0 ? (!(context instanceof C1525d) || ((C1525d) context).mo5126a() != i) ? new C1525d(context, i) : context : context;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private View m8531a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f4534f[0] = context;
            this.f4534f[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f4531c) {
                    View a2 = m8532a(context, str, a);
                    if (a2 != null) {
                        this.f4534f[0] = null;
                        this.f4534f[1] = null;
                        return a2;
                    }
                }
                this.f4534f[0] = null;
                this.f4534f[1] = null;
                return null;
            }
            View a3 = m8532a(context, str, (String) null);
            this.f4534f[0] = null;
            this.f4534f[1] = null;
            return a3;
        } catch (Exception e) {
            this.f4534f[0] = null;
            this.f4534f[1] = null;
            return null;
        } catch (Throwable th) {
            this.f4534f[0] = null;
            this.f4534f[1] = null;
            throw th;
        }
    }

    /* renamed from: a */
    private View m8532a(Context context, String str, String str2) {
        Constructor<? extends U> constructor = f4533e.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f4529a);
                f4533e.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f4534f);
    }

    /* renamed from: a */
    private void m8533a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C1040ar.m5910ae(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4530b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C1451a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final View mo4964a(View view, String str, @C0047z Context context, @C0047z AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m8530a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C1804bm.m10918a(context2);
        }
        View view2 = null;
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = new C1664ab(context2, attributeSet);
                break;
            case 1:
                view2 = new C1857q(context2, attributeSet);
                break;
            case 2:
                view2 = new C1844i(context2, attributeSet);
                break;
            case 3:
                view2 = new C1854n(context2, attributeSet);
                break;
            case 4:
                view2 = new C1866y(context2, attributeSet);
                break;
            case 5:
                view2 = new C1855o(context2, attributeSet);
                break;
            case 6:
                view2 = new C1845j(context2, attributeSet);
                break;
            case 7:
                view2 = new C1862u(context2, attributeSet);
                break;
            case 8:
                view2 = new C1846k(context2, attributeSet);
                break;
            case 9:
                view2 = new C1842g(context2, attributeSet);
                break;
            case 10:
                view2 = new C1858r(context2, attributeSet);
                break;
            case 11:
                view2 = new C1863v(context2, attributeSet);
                break;
            case 12:
                view2 = new C1864w(context2, attributeSet);
                break;
        }
        View a = (view2 != null || context == context2) ? view2 : m8531a(context2, str, attributeSet);
        if (a != null) {
            m8533a(a, attributeSet);
        }
        return a;
    }
}
