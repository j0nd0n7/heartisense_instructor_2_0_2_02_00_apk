package android.support.p036v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1189u;
import android.support.p036v7.p037a.C1359b;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.h */
public class C1550h implements C0538a {

    /* renamed from: i */
    private static final String f4946i = "MenuBuilder";

    /* renamed from: j */
    private static final String f4947j = "android:menu:presenters";

    /* renamed from: k */
    private static final String f4948k = "android:menu:actionviewstates";

    /* renamed from: l */
    private static final String f4949l = "android:menu:expandedactionview";

    /* renamed from: m */
    private static final int[] f4950m = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private SparseArray<Parcelable> f4951A;

    /* renamed from: B */
    private boolean f4952B = false;

    /* renamed from: C */
    private boolean f4953C = false;

    /* renamed from: D */
    private boolean f4954D = false;

    /* renamed from: E */
    private boolean f4955E = false;

    /* renamed from: F */
    private boolean f4956F = false;

    /* renamed from: G */
    private ArrayList<C1555k> f4957G = new ArrayList<>();

    /* renamed from: H */
    private CopyOnWriteArrayList<WeakReference<C1567p>> f4958H = new CopyOnWriteArrayList<>();

    /* renamed from: I */
    private C1555k f4959I;

    /* renamed from: J */
    private boolean f4960J;

    /* renamed from: f */
    CharSequence f4961f;

    /* renamed from: g */
    Drawable f4962g;

    /* renamed from: h */
    View f4963h;

    /* renamed from: n */
    private final Context f4964n;

    /* renamed from: o */
    private final Resources f4965o;

    /* renamed from: p */
    private boolean f4966p;

    /* renamed from: q */
    private boolean f4967q;

    /* renamed from: r */
    private C1551a f4968r;

    /* renamed from: s */
    private ArrayList<C1555k> f4969s;

    /* renamed from: t */
    private ArrayList<C1555k> f4970t;

    /* renamed from: u */
    private boolean f4971u;

    /* renamed from: v */
    private ArrayList<C1555k> f4972v;

    /* renamed from: w */
    private ArrayList<C1555k> f4973w;

    /* renamed from: x */
    private boolean f4974x;

    /* renamed from: y */
    private int f4975y = 0;

    /* renamed from: z */
    private ContextMenu.ContextMenuInfo f4976z;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C1551a {
        /* renamed from: a */
        void mo4719a(C1550h hVar);

        /* renamed from: a */
        boolean mo4724a(C1550h hVar, MenuItem menuItem);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C1552b {
        /* renamed from: a */
        boolean mo5210a(C1555k kVar);
    }

    public C1550h(Context context) {
        this.f4964n = context;
        this.f4965o = context.getResources();
        this.f4969s = new ArrayList<>();
        this.f4970t = new ArrayList<>();
        this.f4971u = true;
        this.f4972v = new ArrayList<>();
        this.f4973w = new ArrayList<>();
        this.f4974x = true;
        m9071g(true);
    }

    /* renamed from: a */
    private static int m9062a(ArrayList<C1555k> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo5422c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C1555k m9063a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C1555k(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: a */
    private void m9064a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources e = mo5373e();
        if (view != null) {
            this.f4963h = view;
            this.f4961f = null;
            this.f4962g = null;
        } else {
            if (i > 0) {
                this.f4961f = e.getText(i);
            } else if (charSequence != null) {
                this.f4961f = charSequence;
            }
            if (i2 > 0) {
                this.f4962g = C0434d.m2370a(mo5376f(), i2);
            } else if (drawable != null) {
                this.f4962g = drawable;
            }
            this.f4963h = null;
        }
        mo5362c(false);
    }

    /* renamed from: a */
    private void m9065a(int i, boolean z) {
        if (i >= 0 && i < this.f4969s.size()) {
            this.f4969s.remove(i);
            if (z) {
                mo5362c(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m9066a(C1576v vVar, C1567p pVar) {
        boolean z = false;
        if (this.f4958H.isEmpty()) {
            return false;
        }
        if (pVar != null) {
            z = pVar.mo5266a(vVar);
        }
        Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            WeakReference next = it.next();
            C1567p pVar2 = (C1567p) next.get();
            if (pVar2 == null) {
                this.f4958H.remove(next);
            } else if (!z2) {
                z2 = pVar2.mo5266a(vVar);
            }
            z = z2;
        }
    }

    /* renamed from: e */
    private void m9067e(Bundle bundle) {
        Parcelable f;
        if (!this.f4958H.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                } else {
                    int c = pVar.mo5272c();
                    if (c > 0 && (f = pVar.mo5291f()) != null) {
                        sparseArray.put(c, f);
                    }
                }
            }
            bundle.putSparseParcelableArray(f4947j, sparseArray);
        }
    }

    /* renamed from: f */
    private void m9068f(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f4947j);
        if (sparseParcelableArray != null && !this.f4958H.isEmpty()) {
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                } else {
                    int c = pVar.mo5272c();
                    if (c > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(c)) != null) {
                        pVar.mo5281a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m9069f(boolean z) {
        if (!this.f4958H.isEmpty()) {
            mo5381h();
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                } else {
                    pVar.mo5269b(z);
                }
            }
            mo5383i();
        }
    }

    /* renamed from: g */
    private static int m9070g(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < f4950m.length) {
            return (f4950m[i2] << 16) | (65535 & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: g */
    private void m9071g(boolean z) {
        boolean z2 = true;
        if (!z || this.f4965o.getConfiguration().keyboard == 1 || !this.f4965o.getBoolean(C1359b.C1362c.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.f4967q = z2;
    }

    /* renamed from: a */
    public int mo5325a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (this.f4969s.get(i3).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C1550h mo5326a(int i) {
        this.f4975y = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1550h mo5327a(Drawable drawable) {
        m9064a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1550h mo5328a(View view) {
        m9064a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1550h mo5329a(CharSequence charSequence) {
        m9064a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1555k mo5330a(int i, KeyEvent keyEvent) {
        ArrayList<C1555k> arrayList = this.f4957G;
        arrayList.clear();
        mo5340a((List<C1555k>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean c = mo5363c();
        for (int i2 = 0; i2 < size; i2++) {
            C1555k kVar = arrayList.get(i2);
            char alphabeticShortcut = c ? kVar.getAlphabeticShortcut() : kVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return kVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return kVar;
            }
            if (c && alphabeticShortcut == 8 && i == 67) {
                return kVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo5331a(int i, int i2, int i3, CharSequence charSequence) {
        int g = m9070g(i3);
        C1555k a = m9063a(i, i2, i3, g, charSequence, this.f4975y);
        if (this.f4976z != null) {
            a.mo5417a(this.f4976z);
        }
        this.f4969s.add(m9062a(this.f4969s, g), a);
        mo5362c(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo5332a() {
        return f4948k;
    }

    /* renamed from: a */
    public void mo5333a(Bundle bundle) {
        m9067e(bundle);
    }

    /* renamed from: a */
    public void mo5334a(C1551a aVar) {
        this.f4968r = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5335a(C1555k kVar) {
        this.f4971u = true;
        mo5362c(true);
    }

    /* renamed from: a */
    public void mo5336a(C1567p pVar) {
        mo5337a(pVar, this.f4964n);
    }

    /* renamed from: a */
    public void mo5337a(C1567p pVar, Context context) {
        this.f4958H.add(new WeakReference(pVar));
        pVar.mo5259a(context, this);
        this.f4974x = true;
    }

    /* renamed from: a */
    public void mo5338a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f4976z = contextMenuInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5339a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f4969s.size();
        mo5381h();
        for (int i = 0; i < size; i++) {
            C1555k kVar = this.f4969s.get(i);
            if (kVar.getGroupId() == groupId && kVar.mo5442h() && kVar.isCheckable()) {
                kVar.mo5420b(kVar == menuItem);
            }
        }
        mo5383i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5340a(List<C1555k> list, int i, KeyEvent keyEvent) {
        boolean c = mo5363c();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f4969s.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1555k kVar = this.f4969s.get(i2);
                if (kVar.hasSubMenu()) {
                    ((C1550h) kVar.getSubMenu()).mo5340a(list, i, keyEvent);
                }
                char alphabeticShortcut = c ? kVar.getAlphabeticShortcut() : kVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (c && alphabeticShortcut == 8 && i == 67)) && kVar.isEnabled())) {
                    list.add(kVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5341a(boolean z) {
        if (this.f4967q != z) {
            m9071g(z);
            mo5362c(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5342a(C1550h hVar, MenuItem menuItem) {
        return this.f4968r != null && this.f4968r.mo4724a(hVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo5343a(MenuItem menuItem, int i) {
        return mo5344a(menuItem, (C1567p) null, i);
    }

    /* renamed from: a */
    public boolean mo5344a(MenuItem menuItem, C1567p pVar, int i) {
        C1555k kVar = (C1555k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        boolean b = kVar.mo5421b();
        C1147e a = kVar.mo1932a();
        boolean z = a != null && a.mo3968g();
        if (kVar.mo5454o()) {
            boolean expandActionView = kVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            mo5359b(true);
            return expandActionView;
        } else if (kVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo5359b(false);
            }
            if (!kVar.hasSubMenu()) {
                kVar.mo5416a(new C1576v(mo5376f(), this, kVar));
            }
            C1576v vVar = (C1576v) kVar.getSubMenu();
            if (z) {
                a.mo3961a((SubMenu) vVar);
            }
            boolean a2 = m9066a(vVar, pVar) | b;
            if (a2) {
                return a2;
            }
            mo5359b(true);
            return a2;
        } else {
            if ((i & 1) == 0) {
                mo5359b(true);
            }
            return b;
        }
    }

    public MenuItem add(int i) {
        return mo5331a(0, 0, 0, this.f4965o.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo5331a(i, i2, i3, this.f4965o.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo5331a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo5331a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f4964n.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f4965o.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f4965o.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C1555k kVar = (C1555k) mo5331a(i, i2, i3, charSequence);
        C1576v vVar = new C1576v(this.f4964n, this, kVar);
        kVar.mo5416a(vVar);
        return vVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo5354b() {
        this.f4952B = true;
        clear();
        clearHeader();
        this.f4952B = false;
        this.f4953C = false;
        this.f4954D = false;
        mo5362c(true);
    }

    /* renamed from: b */
    public void mo5355b(int i) {
        m9065a(i, true);
    }

    /* renamed from: b */
    public void mo5356b(Bundle bundle) {
        m9068f(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5357b(C1555k kVar) {
        this.f4974x = true;
        mo5362c(true);
    }

    /* renamed from: b */
    public void mo5358b(C1567p pVar) {
        Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C1567p pVar2 = (C1567p) next.get();
            if (pVar2 == null || pVar2 == pVar) {
                this.f4958H.remove(next);
            }
        }
    }

    /* renamed from: b */
    public final void mo5359b(boolean z) {
        if (!this.f4956F) {
            this.f4956F = true;
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                } else {
                    pVar.mo5260a(this, z);
                }
            }
            this.f4956F = false;
        }
    }

    /* renamed from: c */
    public int mo5360c(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f4969s.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo5361c(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a = C1189u.m7081a(item);
            if (!(a == null || a.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                a.saveHierarchyState(sparseArray);
                if (C1189u.m7087e(item)) {
                    bundle.putInt(f4949l, item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((C1576v) item.getSubMenu()).mo5361c(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo5332a(), sparseArray);
        }
    }

    /* renamed from: c */
    public void mo5362c(boolean z) {
        if (!this.f4952B) {
            if (z) {
                this.f4971u = true;
                this.f4974x = true;
            }
            m9069f(z);
            return;
        }
        this.f4953C = true;
        if (z) {
            this.f4954D = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5363c() {
        return this.f4966p;
    }

    /* renamed from: c */
    public boolean mo5364c(C1555k kVar) {
        boolean z = false;
        if (!this.f4958H.isEmpty()) {
            mo5381h();
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                    z = z2;
                } else {
                    z = pVar.mo5265a(this, kVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo5383i();
            if (z) {
                this.f4959I = kVar;
            }
        }
        return z;
    }

    public void clear() {
        if (this.f4959I != null) {
            mo5372d(this.f4959I);
        }
        this.f4969s.clear();
        mo5362c(true);
    }

    public void clearHeader() {
        this.f4962g = null;
        this.f4961f = null;
        this.f4963h = null;
        mo5362c(false);
    }

    public void close() {
        mo5359b(true);
    }

    /* renamed from: d */
    public int mo5368d(int i) {
        return mo5325a(i, 0);
    }

    /* renamed from: d */
    public void mo5369d(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo5332a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View a = C1189u.m7081a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C1576v) item.getSubMenu()).mo5369d(bundle);
                }
            }
            int i2 = bundle.getInt(f4949l);
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                C1189u.m7085c(findItem);
            }
        }
    }

    /* renamed from: d */
    public void mo5370d(boolean z) {
        this.f4955E = z;
    }

    /* renamed from: d */
    public boolean mo5371d() {
        return this.f4967q;
    }

    /* renamed from: d */
    public boolean mo5372d(C1555k kVar) {
        boolean z = false;
        if (!this.f4958H.isEmpty() && this.f4959I == kVar) {
            mo5381h();
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                    z = z2;
                } else {
                    z = pVar.mo5271b(this, kVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo5383i();
            if (z) {
                this.f4959I = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Resources mo5373e() {
        return this.f4965o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1550h mo5374e(int i) {
        m9064a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: e */
    public void mo5375e(boolean z) {
        this.f4960J = z;
    }

    /* renamed from: f */
    public Context mo5376f() {
        return this.f4964n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1550h mo5377f(int i) {
        m9064a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C1555k kVar = this.f4969s.get(i2);
            if (kVar.getItemId() == i) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo5379g() {
        if (this.f4968r != null) {
            this.f4968r.mo4719a(this);
        }
    }

    public MenuItem getItem(int i) {
        return this.f4969s.get(i);
    }

    /* renamed from: h */
    public void mo5381h() {
        if (!this.f4952B) {
            this.f4952B = true;
            this.f4953C = false;
            this.f4954D = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f4960J) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4969s.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void mo5383i() {
        this.f4952B = false;
        if (this.f4953C) {
            this.f4953C = false;
            mo5362c(this.f4954D);
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo5330a(i, keyEvent) != null;
    }

    @C0047z
    /* renamed from: j */
    public ArrayList<C1555k> mo5385j() {
        if (!this.f4971u) {
            return this.f4970t;
        }
        this.f4970t.clear();
        int size = this.f4969s.size();
        for (int i = 0; i < size; i++) {
            C1555k kVar = this.f4969s.get(i);
            if (kVar.isVisible()) {
                this.f4970t.add(kVar);
            }
        }
        this.f4971u = false;
        this.f4974x = true;
        return this.f4970t;
    }

    /* renamed from: k */
    public void mo5386k() {
        boolean b;
        ArrayList<C1555k> j = mo5385j();
        if (this.f4974x) {
            Iterator<WeakReference<C1567p>> it = this.f4958H.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C1567p pVar = (C1567p) next.get();
                if (pVar == null) {
                    this.f4958H.remove(next);
                    b = z;
                } else {
                    b = pVar.mo5270b() | z;
                }
                z = b;
            }
            if (z) {
                this.f4972v.clear();
                this.f4973w.clear();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C1555k kVar = j.get(i);
                    if (kVar.mo5450k()) {
                        this.f4972v.add(kVar);
                    } else {
                        this.f4973w.add(kVar);
                    }
                }
            } else {
                this.f4972v.clear();
                this.f4973w.clear();
                this.f4973w.addAll(mo5385j());
            }
            this.f4974x = false;
        }
    }

    /* renamed from: l */
    public ArrayList<C1555k> mo5387l() {
        mo5386k();
        return this.f4972v;
    }

    /* renamed from: m */
    public ArrayList<C1555k> mo5388m() {
        mo5386k();
        return this.f4973w;
    }

    /* renamed from: n */
    public CharSequence mo5389n() {
        return this.f4961f;
    }

    /* renamed from: o */
    public Drawable mo5390o() {
        return this.f4962g;
    }

    /* renamed from: p */
    public View mo5391p() {
        return this.f4963h;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo5343a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C1555k a = mo5330a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = mo5343a((MenuItem) a, i2);
        }
        if ((i2 & 2) != 0) {
            mo5359b(true);
        }
        return z;
    }

    /* renamed from: q */
    public C1550h mo5394q() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5395r() {
        return this.f4955E;
    }

    public void removeGroup(int i) {
        int d = mo5368d(i);
        if (d >= 0) {
            int size = this.f4969s.size() - d;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f4969s.get(d).getGroupId() != i) {
                    mo5362c(true);
                } else {
                    m9065a(d, false);
                    i2 = i3;
                }
            }
            mo5362c(true);
        }
    }

    public void removeItem(int i) {
        m9065a(mo5360c(i), true);
    }

    /* renamed from: s */
    public C1555k mo5398s() {
        return this.f4959I;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f4969s.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1555k kVar = this.f4969s.get(i2);
            if (kVar.getGroupId() == i) {
                kVar.mo5418a(z2);
                kVar.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f4969s.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1555k kVar = this.f4969s.get(i2);
            if (kVar.getGroupId() == i) {
                kVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f4969s.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C1555k kVar = this.f4969s.get(i2);
            i2++;
            z2 = (kVar.getGroupId() != i || !kVar.mo5423c(z)) ? z2 : true;
        }
        if (z2) {
            mo5362c(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f4966p = z;
        mo5362c(false);
    }

    public int size() {
        return this.f4969s.size();
    }
}
