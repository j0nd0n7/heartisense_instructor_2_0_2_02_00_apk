package android.support.p036v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1189u;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1555k;
import android.support.p036v7.view.menu.C1557l;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.g */
public class C1529g extends MenuInflater {

    /* renamed from: a */
    static final String f4764a = "SupportMenuInflater";

    /* renamed from: b */
    static final int f4765b = 0;

    /* renamed from: c */
    static final Class<?>[] f4766c = {Context.class};

    /* renamed from: d */
    static final Class<?>[] f4767d = f4766c;

    /* renamed from: h */
    private static final String f4768h = "menu";

    /* renamed from: i */
    private static final String f4769i = "group";

    /* renamed from: j */
    private static final String f4770j = "item";

    /* renamed from: e */
    final Object[] f4771e;

    /* renamed from: f */
    final Object[] f4772f = this.f4771e;

    /* renamed from: g */
    Context f4773g;

    /* renamed from: k */
    private Object f4774k;

    /* renamed from: android.support.v7.view.g$a */
    private static class C1530a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f4775a = {MenuItem.class};

        /* renamed from: b */
        private Object f4776b;

        /* renamed from: c */
        private Method f4777c;

        public C1530a(Object obj, String str) {
            this.f4776b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f4777c = cls.getMethod(str, f4775a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f4777c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f4777c.invoke(this.f4776b, new Object[]{menuItem})).booleanValue();
                }
                this.f4777c.invoke(this.f4776b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C1531b {

        /* renamed from: A */
        private static final int f4778A = 0;

        /* renamed from: B */
        private static final int f4779B = 0;

        /* renamed from: C */
        private static final int f4780C = 0;

        /* renamed from: D */
        private static final int f4781D = 0;

        /* renamed from: E */
        private static final int f4782E = 0;

        /* renamed from: F */
        private static final boolean f4783F = false;

        /* renamed from: G */
        private static final boolean f4784G = true;

        /* renamed from: H */
        private static final boolean f4785H = true;

        /* renamed from: a */
        C1147e f4786a;

        /* renamed from: c */
        private Menu f4788c;

        /* renamed from: d */
        private int f4789d;

        /* renamed from: e */
        private int f4790e;

        /* renamed from: f */
        private int f4791f;

        /* renamed from: g */
        private int f4792g;

        /* renamed from: h */
        private boolean f4793h;

        /* renamed from: i */
        private boolean f4794i;

        /* renamed from: j */
        private boolean f4795j;

        /* renamed from: k */
        private int f4796k;

        /* renamed from: l */
        private int f4797l;

        /* renamed from: m */
        private CharSequence f4798m;

        /* renamed from: n */
        private CharSequence f4799n;

        /* renamed from: o */
        private int f4800o;

        /* renamed from: p */
        private char f4801p;

        /* renamed from: q */
        private char f4802q;

        /* renamed from: r */
        private int f4803r;

        /* renamed from: s */
        private boolean f4804s;

        /* renamed from: t */
        private boolean f4805t;

        /* renamed from: u */
        private boolean f4806u;

        /* renamed from: v */
        private int f4807v;

        /* renamed from: w */
        private int f4808w;

        /* renamed from: x */
        private String f4809x;

        /* renamed from: y */
        private String f4810y;

        /* renamed from: z */
        private String f4811z;

        public C1531b(Menu menu) {
            this.f4788c = menu;
            mo5156a();
        }

        /* renamed from: a */
        private char m8934a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m8935a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C1529g.this.f4773g.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w(C1529g.f4764a, "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        private void m8936a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f4804s).setVisible(this.f4805t).setEnabled(this.f4806u).setCheckable(this.f4803r >= 1).setTitleCondensed(this.f4799n).setIcon(this.f4800o).setAlphabeticShortcut(this.f4801p).setNumericShortcut(this.f4802q);
            if (this.f4807v >= 0) {
                C1189u.m7082a(menuItem, this.f4807v);
            }
            if (this.f4811z != null) {
                if (C1529g.this.f4773g.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C1530a(C1529g.this.mo5153a(), this.f4811z));
            }
            if (menuItem instanceof C1555k) {
                C1555k kVar = (C1555k) menuItem;
            }
            if (this.f4803r >= 2) {
                if (menuItem instanceof C1555k) {
                    ((C1555k) menuItem).mo5418a(true);
                } else if (menuItem instanceof C1557l) {
                    ((C1557l) menuItem).mo5473a(true);
                }
            }
            if (this.f4809x != null) {
                C1189u.m7080a(menuItem, (View) m8935a(this.f4809x, C1529g.f4766c, C1529g.this.f4771e));
            } else {
                z = false;
            }
            if (this.f4808w > 0) {
                if (!z) {
                    C1189u.m7084b(menuItem, this.f4808w);
                } else {
                    Log.w(C1529g.f4764a, "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f4786a != null) {
                C1189u.m7078a(menuItem, this.f4786a);
            }
        }

        /* renamed from: a */
        public void mo5156a() {
            this.f4789d = 0;
            this.f4790e = 0;
            this.f4791f = 0;
            this.f4792g = 0;
            this.f4793h = true;
            this.f4794i = true;
        }

        /* renamed from: a */
        public void mo5157a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C1529g.this.f4773g.obtainStyledAttributes(attributeSet, C1359b.C1371l.MenuGroup);
            this.f4789d = obtainStyledAttributes.getResourceId(C1359b.C1371l.MenuGroup_android_id, 0);
            this.f4790e = obtainStyledAttributes.getInt(C1359b.C1371l.MenuGroup_android_menuCategory, 0);
            this.f4791f = obtainStyledAttributes.getInt(C1359b.C1371l.MenuGroup_android_orderInCategory, 0);
            this.f4792g = obtainStyledAttributes.getInt(C1359b.C1371l.MenuGroup_android_checkableBehavior, 0);
            this.f4793h = obtainStyledAttributes.getBoolean(C1359b.C1371l.MenuGroup_android_visible, true);
            this.f4794i = obtainStyledAttributes.getBoolean(C1359b.C1371l.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo5158b() {
            this.f4795j = true;
            m8936a(this.f4788c.add(this.f4789d, this.f4796k, this.f4797l, this.f4798m));
        }

        /* renamed from: b */
        public void mo5159b(AttributeSet attributeSet) {
            boolean z = true;
            TypedArray obtainStyledAttributes = C1529g.this.f4773g.obtainStyledAttributes(attributeSet, C1359b.C1371l.MenuItem);
            this.f4796k = obtainStyledAttributes.getResourceId(C1359b.C1371l.MenuItem_android_id, 0);
            this.f4797l = (obtainStyledAttributes.getInt(C1359b.C1371l.MenuItem_android_menuCategory, this.f4790e) & C0538a.f2113c) | (obtainStyledAttributes.getInt(C1359b.C1371l.MenuItem_android_orderInCategory, this.f4791f) & C0538a.f2111a);
            this.f4798m = obtainStyledAttributes.getText(C1359b.C1371l.MenuItem_android_title);
            this.f4799n = obtainStyledAttributes.getText(C1359b.C1371l.MenuItem_android_titleCondensed);
            this.f4800o = obtainStyledAttributes.getResourceId(C1359b.C1371l.MenuItem_android_icon, 0);
            this.f4801p = m8934a(obtainStyledAttributes.getString(C1359b.C1371l.MenuItem_android_alphabeticShortcut));
            this.f4802q = m8934a(obtainStyledAttributes.getString(C1359b.C1371l.MenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(C1359b.C1371l.MenuItem_android_checkable)) {
                this.f4803r = obtainStyledAttributes.getBoolean(C1359b.C1371l.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f4803r = this.f4792g;
            }
            this.f4804s = obtainStyledAttributes.getBoolean(C1359b.C1371l.MenuItem_android_checked, false);
            this.f4805t = obtainStyledAttributes.getBoolean(C1359b.C1371l.MenuItem_android_visible, this.f4793h);
            this.f4806u = obtainStyledAttributes.getBoolean(C1359b.C1371l.MenuItem_android_enabled, this.f4794i);
            this.f4807v = obtainStyledAttributes.getInt(C1359b.C1371l.MenuItem_showAsAction, -1);
            this.f4811z = obtainStyledAttributes.getString(C1359b.C1371l.MenuItem_android_onClick);
            this.f4808w = obtainStyledAttributes.getResourceId(C1359b.C1371l.MenuItem_actionLayout, 0);
            this.f4809x = obtainStyledAttributes.getString(C1359b.C1371l.MenuItem_actionViewClass);
            this.f4810y = obtainStyledAttributes.getString(C1359b.C1371l.MenuItem_actionProviderClass);
            if (this.f4810y == null) {
                z = false;
            }
            if (z && this.f4808w == 0 && this.f4809x == null) {
                this.f4786a = (C1147e) m8935a(this.f4810y, C1529g.f4767d, C1529g.this.f4772f);
            } else {
                if (z) {
                    Log.w(C1529g.f4764a, "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f4786a = null;
            }
            obtainStyledAttributes.recycle();
            this.f4795j = false;
        }

        /* renamed from: c */
        public SubMenu mo5160c() {
            this.f4795j = true;
            SubMenu addSubMenu = this.f4788c.addSubMenu(this.f4789d, this.f4796k, this.f4797l, this.f4798m);
            m8936a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo5161d() {
            return this.f4795j;
        }
    }

    public C1529g(Context context) {
        super(context);
        this.f4773g = context;
        this.f4771e = new Object[]{context};
    }

    /* renamed from: a */
    private Object m8931a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m8931a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8932a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
            r10 = this;
            r4 = 0
            r1 = 1
            r6 = 0
            android.support.v7.view.g$b r7 = new android.support.v7.view.g$b
            r7.<init>(r13)
            int r0 = r11.getEventType()
        L_0x000c:
            r2 = 2
            if (r0 != r2) goto L_0x004a
            java.lang.String r0 = r11.getName()
            java.lang.String r2 = "menu"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0031
            int r0 = r11.next()
        L_0x001f:
            r2 = r4
            r5 = r6
            r3 = r0
            r0 = r6
        L_0x0023:
            if (r0 != 0) goto L_0x00dd
            switch(r3) {
                case 1: goto L_0x00d5;
                case 2: goto L_0x0051;
                case 3: goto L_0x0087;
                default: goto L_0x0028;
            }
        L_0x0028:
            r3 = r5
        L_0x0029:
            int r5 = r11.next()
            r9 = r3
            r3 = r5
            r5 = r9
            goto L_0x0023
        L_0x0031:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expecting menu, got "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x004a:
            int r0 = r11.next()
            if (r0 != r1) goto L_0x000c
            goto L_0x001f
        L_0x0051:
            if (r5 == 0) goto L_0x0055
            r3 = r5
            goto L_0x0029
        L_0x0055:
            java.lang.String r3 = r11.getName()
            java.lang.String r8 = "group"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x0066
            r7.mo5157a((android.util.AttributeSet) r12)
            r3 = r5
            goto L_0x0029
        L_0x0066:
            java.lang.String r8 = "item"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x0073
            r7.mo5159b(r12)
            r3 = r5
            goto L_0x0029
        L_0x0073:
            java.lang.String r8 = "menu"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x0084
            android.view.SubMenu r3 = r7.mo5160c()
            r10.m8932a(r11, r12, r3)
            r3 = r5
            goto L_0x0029
        L_0x0084:
            r2 = r3
            r3 = r1
            goto L_0x0029
        L_0x0087:
            java.lang.String r3 = r11.getName()
            if (r5 == 0) goto L_0x0096
            boolean r8 = r3.equals(r2)
            if (r8 == 0) goto L_0x0096
            r2 = r4
            r3 = r6
            goto L_0x0029
        L_0x0096:
            java.lang.String r8 = "group"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x00a3
            r7.mo5156a()
            r3 = r5
            goto L_0x0029
        L_0x00a3:
            java.lang.String r8 = "item"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x00c9
            boolean r3 = r7.mo5161d()
            if (r3 != 0) goto L_0x0028
            android.support.v4.view.e r3 = r7.f4786a
            if (r3 == 0) goto L_0x00c3
            android.support.v4.view.e r3 = r7.f4786a
            boolean r3 = r3.mo3968g()
            if (r3 == 0) goto L_0x00c3
            r7.mo5160c()
            r3 = r5
            goto L_0x0029
        L_0x00c3:
            r7.mo5158b()
            r3 = r5
            goto L_0x0029
        L_0x00c9:
            java.lang.String r8 = "menu"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0028
            r0 = r1
            r3 = r5
            goto L_0x0029
        L_0x00d5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected end of document"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.view.C1529g.m8932a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo5153a() {
        if (this.f4774k == null) {
            this.f4774k = m8931a(this.f4773g);
        }
        return this.f4774k;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof C0538a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f4773g.getResources().getLayout(i);
            m8932a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
