package android.support.p006e.p007a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p006e.p007a.C0117b;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.p033o.C0876a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"NewApi"})
/* renamed from: android.support.e.a.c */
public class C0120c extends C0131h implements C0117b {

    /* renamed from: d */
    private static final String f884d = "AnimatedVDCompat";

    /* renamed from: e */
    private static final String f885e = "animated-vector";

    /* renamed from: f */
    private static final String f886f = "target";

    /* renamed from: g */
    private static final boolean f887g = false;

    /* renamed from: a */
    C0124b f888a;

    /* renamed from: b */
    final Drawable.Callback f889b;

    /* renamed from: h */
    private C0123a f890h;

    /* renamed from: i */
    private Context f891i;

    /* renamed from: j */
    private ArgbEvaluator f892j;

    /* renamed from: k */
    private Animator.AnimatorListener f893k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ArrayList<C0117b.C0118a> f894l;

    /* renamed from: android.support.e.a.c$a */
    private static class C0123a extends Drawable.ConstantState {

        /* renamed from: a */
        int f897a;

        /* renamed from: b */
        C0132i f898b;

        /* renamed from: c */
        AnimatorSet f899c;

        /* renamed from: d */
        C0876a<Animator, String> f900d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ArrayList<Animator> f901e;

        public C0123a(Context context, C0123a aVar, Drawable.Callback callback, Resources resources) {
            if (aVar != null) {
                this.f897a = aVar.f897a;
                if (aVar.f898b != null) {
                    Drawable.ConstantState constantState = aVar.f898b.getConstantState();
                    if (resources != null) {
                        this.f898b = (C0132i) constantState.newDrawable(resources);
                    } else {
                        this.f898b = (C0132i) constantState.newDrawable();
                    }
                    this.f898b = (C0132i) this.f898b.mutate();
                    this.f898b.setCallback(callback);
                    this.f898b.setBounds(aVar.f898b.getBounds());
                    this.f898b.mo622a(false);
                }
                if (aVar.f901e != null) {
                    int size = aVar.f901e.size();
                    this.f901e = new ArrayList<>(size);
                    this.f900d = new C0876a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = aVar.f901e.get(i);
                        Animator clone = animator.clone();
                        String str = aVar.f900d.get(animator);
                        clone.setTarget(this.f898b.mo621a(str));
                        this.f901e.add(clone);
                        this.f900d.put(clone, str);
                    }
                    mo609a();
                }
            }
        }

        /* renamed from: a */
        public void mo609a() {
            if (this.f899c == null) {
                this.f899c = new AnimatorSet();
            }
            this.f899c.playTogether(this.f901e);
        }

        public int getChangingConfigurations() {
            return this.f897a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.e.a.c$b */
    private static class C0124b extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f902a;

        public C0124b(Drawable.ConstantState constantState) {
            this.f902a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f902a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f902a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0120c cVar = new C0120c();
            cVar.f915c = this.f902a.newDrawable();
            cVar.f915c.setCallback(cVar.f889b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0120c cVar = new C0120c();
            cVar.f915c = this.f902a.newDrawable(resources);
            cVar.f915c.setCallback(cVar.f889b);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0120c cVar = new C0120c();
            cVar.f915c = this.f902a.newDrawable(resources, theme);
            cVar.f915c.setCallback(cVar.f889b);
            return cVar;
        }
    }

    C0120c() {
        this((Context) null, (C0123a) null, (Resources) null);
    }

    private C0120c(@C0003aa Context context) {
        this(context, (C0123a) null, (Resources) null);
    }

    private C0120c(@C0003aa Context context, @C0003aa C0123a aVar, @C0003aa Resources resources) {
        this.f892j = null;
        this.f893k = null;
        this.f894l = null;
        this.f889b = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C0120c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0120c.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0120c.this.unscheduleSelf(runnable);
            }
        };
        this.f891i = context;
        if (aVar != null) {
            this.f890h = aVar;
        } else {
            this.f890h = new C0123a(context, aVar, this.f889b, resources);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046 A[Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[SYNTHETIC, Splitter:B:16:0x0058] */
    @android.support.annotation.C0003aa
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p006e.p007a.C0120c m636a(@android.support.annotation.C0047z android.content.Context r5, @android.support.annotation.C0036o int r6) {
        /*
            r4 = 2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x002f
            android.support.e.a.c r0 = new android.support.e.a.c
            r0.<init>(r5)
            android.content.res.Resources r1 = r5.getResources()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            android.graphics.drawable.Drawable r1 = android.support.p010v4.p014d.p016b.C0428e.m2352a(r1, r6, r2)
            r0.f915c = r1
            android.graphics.drawable.Drawable r1 = r0.f915c
            android.graphics.drawable.Drawable$Callback r2 = r0.f889b
            r1.setCallback(r2)
            android.support.e.a.c$b r1 = new android.support.e.a.c$b
            android.graphics.drawable.Drawable r2 = r0.f915c
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.f888a = r1
        L_0x002e:
            return r0
        L_0x002f:
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r6)     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
        L_0x003b:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            if (r2 == r4) goto L_0x0044
            r3 = 1
            if (r2 != r3) goto L_0x003b
        L_0x0044:
            if (r2 == r4) goto L_0x0058
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            throw r0     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
        L_0x004e:
            r0 = move-exception
            java.lang.String r1 = "AnimatedVDCompat"
            java.lang.String r2 = "parser error"
            android.util.Log.e(r1, r2, r0)
        L_0x0056:
            r0 = 0
            goto L_0x002e
        L_0x0058:
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            android.content.res.Resources$Theme r3 = r5.getTheme()     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            android.support.e.a.c r0 = m637a(r5, r2, r0, r1, r3)     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0065 }
            goto L_0x002e
        L_0x0065:
            r0 = move-exception
            java.lang.String r1 = "AnimatedVDCompat"
            java.lang.String r2 = "parser error"
            android.util.Log.e(r1, r2, r0)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006e.p007a.C0120c.m636a(android.content.Context, int):android.support.e.a.c");
    }

    /* renamed from: a */
    public static C0120c m637a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0120c cVar = new C0120c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m639a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= childAnimations.size()) {
                    break;
                }
                m639a(childAnimations.get(i2));
                i = i2 + 1;
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f892j == null) {
                    this.f892j = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f892j);
            }
        }
    }

    /* renamed from: a */
    public static void m640a(Drawable drawable) {
        if (drawable != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((C0120c) drawable).mo554a();
            }
        }
    }

    /* renamed from: a */
    public static void m641a(Drawable drawable, C0117b.C0118a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                m645b((AnimatedVectorDrawable) drawable, aVar);
            } else {
                ((C0120c) drawable).mo555a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m642a(String str, Animator animator) {
        animator.setTarget(this.f890h.f898b.mo621a(str));
        if (Build.VERSION.SDK_INT < 21) {
            m639a(animator);
        }
        if (this.f890h.f901e == null) {
            ArrayList unused = this.f890h.f901e = new ArrayList();
            this.f890h.f900d = new C0876a<>();
        }
        this.f890h.f901e.add(animator);
        this.f890h.f900d.put(animator, str);
    }

    /* renamed from: a */
    private static boolean m643a(AnimatedVectorDrawable animatedVectorDrawable, C0117b.C0118a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.mo557a());
    }

    /* renamed from: b */
    private void m644b() {
        if (this.f893k != null) {
            this.f890h.f899c.removeListener(this.f893k);
            this.f893k = null;
        }
    }

    /* renamed from: b */
    private static void m645b(@C0047z AnimatedVectorDrawable animatedVectorDrawable, @C0047z C0117b.C0118a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.mo557a());
    }

    /* renamed from: b */
    public static boolean m646b(Drawable drawable, C0117b.C0118a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 24 ? m643a((AnimatedVectorDrawable) drawable, aVar) : ((C0120c) drawable).mo556b(aVar);
    }

    /* renamed from: a */
    public void mo554a() {
        if (this.f915c != null) {
            ((AnimatedVectorDrawable) this.f915c).clearAnimationCallbacks();
            return;
        }
        m644b();
        if (this.f894l != null) {
            this.f894l.clear();
        }
    }

    /* renamed from: a */
    public void mo555a(@C0047z C0117b.C0118a aVar) {
        if (this.f915c != null) {
            m645b((AnimatedVectorDrawable) this.f915c, aVar);
        } else if (aVar != null) {
            if (this.f894l == null) {
                this.f894l = new ArrayList<>();
            }
            if (!this.f894l.contains(aVar)) {
                this.f894l.add(aVar);
                if (this.f893k == null) {
                    this.f893k = new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            ArrayList arrayList = new ArrayList(C0120c.this.f894l);
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((C0117b.C0118a) arrayList.get(i)).mo559b(C0120c.this);
                            }
                        }

                        public void onAnimationStart(Animator animator) {
                            ArrayList arrayList = new ArrayList(C0120c.this.f894l);
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                ((C0117b.C0118a) arrayList.get(i)).mo558a(C0120c.this);
                            }
                        }
                    };
                }
                this.f890h.f899c.addListener(this.f893k);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f915c != null) {
            C0484a.m2541a(this.f915c, theme);
        }
    }

    /* renamed from: b */
    public boolean mo556b(@C0047z C0117b.C0118a aVar) {
        if (this.f915c != null) {
            m643a((AnimatedVectorDrawable) this.f915c, aVar);
        }
        if (this.f894l == null || aVar == null) {
            return false;
        }
        boolean remove = this.f894l.remove(aVar);
        if (this.f894l.size() != 0) {
            return remove;
        }
        m644b();
        return remove;
    }

    public boolean canApplyTheme() {
        if (this.f915c != null) {
            return C0484a.m2548d(this.f915c);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f915c != null) {
            this.f915c.draw(canvas);
            return;
        }
        this.f890h.f898b.draw(canvas);
        if (this.f890h.f899c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f915c != null ? C0484a.m2547c(this.f915c) : this.f890h.f898b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.f915c != null ? this.f915c.getChangingConfigurations() : super.getChangingConfigurations() | this.f890h.f897a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f915c != null) {
            return new C0124b(this.f915c.getConstantState());
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f915c != null ? this.f915c.getIntrinsicHeight() : this.f890h.f898b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f915c != null ? this.f915c.getIntrinsicWidth() : this.f890h.f898b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f915c != null ? this.f915c.getOpacity() : this.f890h.f898b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f915c != null) {
            C0484a.m2542a(this.f915c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (f885e.equals(name)) {
                    TypedArray a = C0131h.m673a(resources, theme, attributeSet, C0114a.f845K);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0132i a2 = C0132i.m676a(resources, resourceId, theme);
                        a2.mo622a(false);
                        a2.setCallback(this.f889b);
                        if (this.f890h.f898b != null) {
                            this.f890h.f898b.setCallback((Drawable.Callback) null);
                        }
                        this.f890h.f898b = a2;
                    }
                    a.recycle();
                } else if (f886f.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0114a.f847M);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f891i != null) {
                            m642a(string, AnimatorInflater.loadAnimator(this.f891i, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f890h.mo609a();
    }

    public boolean isAutoMirrored() {
        return this.f915c != null ? C0484a.m2545b(this.f915c) : this.f890h.f898b.isAutoMirrored();
    }

    public boolean isRunning() {
        return this.f915c != null ? ((AnimatedVectorDrawable) this.f915c).isRunning() : this.f890h.f899c.isRunning();
    }

    public boolean isStateful() {
        return this.f915c != null ? this.f915c.isStateful() : this.f890h.f898b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f915c != null) {
            this.f915c.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f915c != null) {
            this.f915c.setBounds(rect);
        } else {
            this.f890h.f898b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f915c != null ? this.f915c.setLevel(i) : this.f890h.f898b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f915c != null ? this.f915c.setState(iArr) : this.f890h.f898b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f915c != null) {
            this.f915c.setAlpha(i);
        } else {
            this.f890h.f898b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f915c != null) {
            this.f915c.setAutoMirrored(z);
        } else {
            this.f890h.f898b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f915c != null) {
            this.f915c.setColorFilter(colorFilter);
        } else {
            this.f890h.f898b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f915c != null) {
            C0484a.m2538a(this.f915c, i);
        } else {
            this.f890h.f898b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f915c != null) {
            C0484a.m2540a(this.f915c, colorStateList);
        } else {
            this.f890h.f898b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f915c != null) {
            C0484a.m2543a(this.f915c, mode);
        } else {
            this.f890h.f898b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f915c != null) {
            return this.f915c.setVisible(z, z2);
        }
        this.f890h.f898b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.f915c != null) {
            ((AnimatedVectorDrawable) this.f915c).start();
        } else if (!this.f890h.f899c.isStarted()) {
            this.f890h.f899c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f915c != null) {
            ((AnimatedVectorDrawable) this.f915c).stop();
        } else {
            this.f890h.f899c.end();
        }
    }
}
