package android.support.p036v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0015aj;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0226aq;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1522b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v7.app.a */
public abstract class C1385a {
    @Deprecated

    /* renamed from: a */
    public static final int f4304a = 0;
    @Deprecated

    /* renamed from: b */
    public static final int f4305b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f4306c = 2;

    /* renamed from: d */
    public static final int f4307d = 1;

    /* renamed from: e */
    public static final int f4308e = 2;

    /* renamed from: f */
    public static final int f4309f = 4;

    /* renamed from: g */
    public static final int f4310g = 8;

    /* renamed from: h */
    public static final int f4311h = 16;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.app.a$a */
    public @interface C1386a {
    }

    /* renamed from: android.support.v7.app.a$b */
    public static class C1387b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f4312a;

        public C1387b(int i) {
            this(-2, -1, i);
        }

        public C1387b(int i, int i2) {
            super(i, i2);
            this.f4312a = 0;
            this.f4312a = 8388627;
        }

        public C1387b(int i, int i2, int i3) {
            super(i, i2);
            this.f4312a = 0;
            this.f4312a = i3;
        }

        public C1387b(@C0047z Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4312a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ActionBarLayout);
            this.f4312a = obtainStyledAttributes.getInt(C1359b.C1371l.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C1387b(C1387b bVar) {
            super(bVar);
            this.f4312a = 0;
            this.f4312a = bVar.f4312a;
        }

        public C1387b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4312a = 0;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.app.a$c */
    public @interface C1388c {
    }

    /* renamed from: android.support.v7.app.a$d */
    public interface C1389d {
        /* renamed from: a */
        void mo4682a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$e */
    public interface C1390e {
        /* renamed from: a */
        boolean mo4683a(int i, long j);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$f */
    public static abstract class C1391f {

        /* renamed from: a */
        public static final int f4313a = -1;

        /* renamed from: a */
        public abstract int mo4684a();

        /* renamed from: a */
        public abstract C1391f mo4685a(@C0036o int i);

        /* renamed from: a */
        public abstract C1391f mo4686a(Drawable drawable);

        /* renamed from: a */
        public abstract C1391f mo4687a(C1392g gVar);

        /* renamed from: a */
        public abstract C1391f mo4688a(View view);

        /* renamed from: a */
        public abstract C1391f mo4689a(CharSequence charSequence);

        /* renamed from: a */
        public abstract C1391f mo4690a(Object obj);

        /* renamed from: b */
        public abstract Drawable mo4691b();

        /* renamed from: b */
        public abstract C1391f mo4692b(int i);

        /* renamed from: b */
        public abstract C1391f mo4693b(CharSequence charSequence);

        /* renamed from: c */
        public abstract C1391f mo4694c(int i);

        /* renamed from: c */
        public abstract CharSequence mo4695c();

        /* renamed from: d */
        public abstract C1391f mo4696d(int i);

        /* renamed from: d */
        public abstract View mo4697d();

        /* renamed from: e */
        public abstract Object mo4698e();

        /* renamed from: f */
        public abstract void mo4699f();

        /* renamed from: g */
        public abstract CharSequence mo4700g();
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$g */
    public interface C1392g {
        /* renamed from: a */
        void mo4701a(C1391f fVar, C0226aq aqVar);

        /* renamed from: b */
        void mo4702b(C1391f fVar, C0226aq aqVar);

        /* renamed from: c */
        void mo4703c(C1391f fVar, C0226aq aqVar);
    }

    @Deprecated
    /* renamed from: a */
    public abstract int mo4607a();

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public C1522b mo4608a(C1522b.C1523a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo4609a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public abstract void mo4610a(int i);

    /* renamed from: a */
    public abstract void mo4611a(int i, int i2);

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo4612a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo4613a(Drawable drawable);

    /* renamed from: a */
    public abstract void mo4614a(C1389d dVar);

    @Deprecated
    /* renamed from: a */
    public abstract void mo4615a(C1391f fVar);

    @Deprecated
    /* renamed from: a */
    public abstract void mo4616a(C1391f fVar, int i);

    @Deprecated
    /* renamed from: a */
    public abstract void mo4617a(C1391f fVar, int i, boolean z);

    @Deprecated
    /* renamed from: a */
    public abstract void mo4618a(C1391f fVar, boolean z);

    /* renamed from: a */
    public abstract void mo4619a(View view);

    /* renamed from: a */
    public abstract void mo4620a(View view, C1387b bVar);

    @Deprecated
    /* renamed from: a */
    public abstract void mo4621a(SpinnerAdapter spinnerAdapter, C1390e eVar);

    /* renamed from: a */
    public abstract void mo4622a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo4623a(boolean z);

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo4624a(int i, KeyEvent keyEvent) {
        return false;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public boolean mo4625a(KeyEvent keyEvent) {
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public abstract int mo4626b();

    /* renamed from: b */
    public abstract void mo4627b(@C0036o int i);

    /* renamed from: b */
    public abstract void mo4628b(Drawable drawable);

    /* renamed from: b */
    public abstract void mo4629b(C1389d dVar);

    @Deprecated
    /* renamed from: b */
    public abstract void mo4630b(C1391f fVar);

    /* renamed from: b */
    public abstract void mo4631b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo4632b(boolean z);

    /* renamed from: c */
    public abstract View mo4633c();

    /* renamed from: c */
    public abstract void mo4634c(@C0036o int i);

    /* renamed from: c */
    public abstract void mo4635c(@C0003aa Drawable drawable);

    @Deprecated
    /* renamed from: c */
    public abstract void mo4636c(C1391f fVar);

    /* renamed from: c */
    public void mo4637c(@C0003aa CharSequence charSequence) {
    }

    /* renamed from: c */
    public abstract void mo4638c(boolean z);

    @C0003aa
    /* renamed from: d */
    public abstract CharSequence mo4639d();

    @Deprecated
    /* renamed from: d */
    public abstract void mo4640d(int i);

    /* renamed from: d */
    public void mo4641d(Drawable drawable) {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo4642d(CharSequence charSequence) {
    }

    /* renamed from: d */
    public abstract void mo4643d(boolean z);

    @C0003aa
    /* renamed from: e */
    public abstract CharSequence mo4644e();

    /* renamed from: e */
    public abstract void mo4645e(@C0015aj int i);

    /* renamed from: e */
    public void mo4646e(Drawable drawable) {
    }

    /* renamed from: e */
    public abstract void mo4647e(boolean z);

    @Deprecated
    /* renamed from: f */
    public abstract int mo4648f();

    /* renamed from: f */
    public abstract void mo4649f(int i);

    /* renamed from: f */
    public void mo4650f(@C0003aa Drawable drawable) {
    }

    /* renamed from: f */
    public void mo4651f(boolean z) {
    }

    /* renamed from: g */
    public abstract int mo4652g();

    /* renamed from: g */
    public abstract void mo4653g(int i);

    /* renamed from: g */
    public void mo4654g(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* renamed from: h */
    public abstract C1391f mo4655h();

    @Deprecated
    /* renamed from: h */
    public abstract void mo4656h(int i);

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo4657h(boolean z) {
    }

    @Deprecated
    /* renamed from: i */
    public abstract void mo4658i();

    @Deprecated
    /* renamed from: i */
    public abstract void mo4659i(int i);

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: i */
    public void mo4660i(boolean z) {
    }

    @C0003aa
    @Deprecated
    /* renamed from: j */
    public abstract C1391f mo4661j();

    @Deprecated
    /* renamed from: j */
    public abstract C1391f mo4662j(int i);

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: j */
    public void mo4663j(boolean z) {
    }

    @Deprecated
    /* renamed from: k */
    public abstract int mo4664k();

    /* renamed from: k */
    public void mo4665k(@C0036o int i) {
    }

    /* renamed from: l */
    public abstract int mo4666l();

    /* renamed from: l */
    public void mo4667l(@C0015aj int i) {
    }

    /* renamed from: m */
    public abstract void mo4668m();

    /* renamed from: m */
    public void mo4669m(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    /* renamed from: n */
    public abstract void mo4670n();

    /* renamed from: o */
    public abstract boolean mo4671o();

    /* renamed from: p */
    public Context mo4672p() {
        return null;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: q */
    public boolean mo4673q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo4674r() {
        return false;
    }

    /* renamed from: s */
    public int mo4675s() {
        return 0;
    }

    /* renamed from: t */
    public float mo4676t() {
        return 0.0f;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: u */
    public boolean mo4677u() {
        return false;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: v */
    public boolean mo4678v() {
        return false;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: w */
    public boolean mo4679w() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo4680x() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4681y() {
    }
}
