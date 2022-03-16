package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p036v7.app.C1402c;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.C1529g;
import android.support.p036v7.view.C1534i;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.widget.C1807bp;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import java.lang.Thread;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v7.app.i */
abstract class C1419i extends C1417h {

    /* renamed from: j */
    static final boolean f4427j = false;

    /* renamed from: k */
    static final String f4428k = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";

    /* renamed from: x */
    private static boolean f4429x = true;

    /* renamed from: y */
    private static final boolean f4430y = (Build.VERSION.SDK_INT < 21);

    /* renamed from: z */
    private static final int[] f4431z = {16842836};

    /* renamed from: A */
    private CharSequence f4432A;

    /* renamed from: B */
    private boolean f4433B;

    /* renamed from: C */
    private boolean f4434C;

    /* renamed from: l */
    final Context f4435l;

    /* renamed from: m */
    final Window f4436m;

    /* renamed from: n */
    final Window.Callback f4437n = this.f4436m.getCallback();

    /* renamed from: o */
    final Window.Callback f4438o;

    /* renamed from: p */
    final C1416g f4439p;

    /* renamed from: q */
    C1385a f4440q;

    /* renamed from: r */
    MenuInflater f4441r;

    /* renamed from: s */
    boolean f4442s;

    /* renamed from: t */
    boolean f4443t;

    /* renamed from: u */
    boolean f4444u;

    /* renamed from: v */
    boolean f4445v;

    /* renamed from: w */
    boolean f4446w;

    /* renamed from: android.support.v7.app.i$a */
    private class C1421a implements C1402c.C1404a {
        C1421a() {
        }

        /* renamed from: a */
        public Drawable mo4757a() {
            C1807bp a = C1807bp.m10922a(mo4760b(), (AttributeSet) null, new int[]{C1359b.C1361b.homeAsUpIndicator});
            Drawable a2 = a.mo7293a(0);
            a.mo7308e();
            return a2;
        }

        /* renamed from: a */
        public void mo4758a(int i) {
            C1385a a = C1419i.this.mo4849a();
            if (a != null) {
                a.mo4667l(i);
            }
        }

        /* renamed from: a */
        public void mo4759a(Drawable drawable, int i) {
            C1385a a = C1419i.this.mo4849a();
            if (a != null) {
                a.mo4650f(drawable);
                a.mo4667l(i);
            }
        }

        /* renamed from: b */
        public Context mo4760b() {
            return C1419i.this.mo4886p();
        }

        /* renamed from: c */
        public boolean mo4761c() {
            C1385a a = C1419i.this.mo4849a();
            return (a == null || (a.mo4652g() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.i$b */
    class C1422b extends C1534i {
        C1422b(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C1419i.this.mo4880a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C1419i.this.mo4879a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C1550h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C1419i.this.mo4883b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C1419i.this.mo4878a(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C1550h hVar = menu instanceof C1550h ? (C1550h) menu : null;
            if (i == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.mo5375e(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (hVar == null) {
                return onPreparePanel;
            }
            hVar.mo5375e(false);
            return onPreparePanel;
        }
    }

    static {
        if (f4430y && !f4429x) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                /* renamed from: a */
                private boolean m8397a(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                        return false;
                    }
                    return message.contains("drawable") || message.contains("Drawable");
                }

                public void uncaughtException(Thread thread, Throwable th) {
                    if (m8397a(th)) {
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + C1419i.f4428k);
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }
            });
        }
    }

    C1419i(Context context, Window window, C1416g gVar) {
        this.f4435l = context;
        this.f4436m = window;
        this.f4439p = gVar;
        if (this.f4437n instanceof C1422b) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f4438o = mo4877a(this.f4437n);
        this.f4436m.setCallback(this.f4438o);
        C1807bp a = C1807bp.m10922a(context, (AttributeSet) null, f4431z);
        Drawable b = a.mo7299b(0);
        if (b != null) {
            this.f4436m.setBackgroundDrawable(b);
        }
        a.mo7308e();
    }

    /* renamed from: a */
    public C1385a mo4849a() {
        mo4884n();
        return this.f4440q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo4877a(Window.Callback callback) {
        return new C1422b(callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo4878a(int i, Menu menu);

    /* renamed from: a */
    public final void mo4857a(CharSequence charSequence) {
        this.f4432A = charSequence;
        mo4882b(charSequence);
    }

    /* renamed from: a */
    public void mo4858a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo4879a(int i, KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo4880a(KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C1522b mo4881b(C1522b.C1523a aVar);

    /* renamed from: b */
    public MenuInflater mo4859b() {
        if (this.f4441r == null) {
            mo4884n();
            this.f4441r = new C1529g(this.f4440q != null ? this.f4440q.mo4672p() : this.f4435l);
        }
        return this.f4441r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo4882b(CharSequence charSequence);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo4883b(int i, Menu menu);

    /* renamed from: c */
    public void mo4864c() {
        this.f4433B = true;
    }

    /* renamed from: c */
    public void mo4865c(Bundle bundle) {
    }

    /* renamed from: d */
    public void mo4867d() {
        this.f4433B = false;
    }

    /* renamed from: e */
    public void mo4870e(int i) {
    }

    /* renamed from: g */
    public void mo4872g() {
        this.f4434C = true;
    }

    /* renamed from: h */
    public final C1402c.C1404a mo4873h() {
        return new C1421a();
    }

    /* renamed from: j */
    public boolean mo4875j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo4876k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract void mo4884n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C1385a mo4885o() {
        return this.f4440q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Context mo4886p() {
        Context context = null;
        C1385a a = mo4849a();
        if (a != null) {
            context = a.mo4672p();
        }
        return context == null ? this.f4435l : context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo4887q() {
        return this.f4434C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo4888r() {
        return this.f4433B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Window.Callback mo4889s() {
        return this.f4436m.getCallback();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final CharSequence mo4890t() {
        return this.f4437n instanceof Activity ? ((Activity) this.f4437n).getTitle() : this.f4432A;
    }
}
