package android.support.p036v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0039r;
import android.support.annotation.C0044w;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1522b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.o */
public class C1448o extends Dialog implements C1416g {

    /* renamed from: a */
    private C1417h f4528a;

    public C1448o(Context context) {
        this(context, 0);
    }

    public C1448o(Context context, int i) {
        super(context, m8521a(context, i));
        mo4955c().mo4853a((Bundle) null);
        mo4955c().mo4876k();
    }

    protected C1448o(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }

    /* renamed from: a */
    private static int m8521a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1359b.C1361b.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @C0003aa
    /* renamed from: a */
    public C1522b mo4817a(C1522b.C1523a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo4819a(C1522b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo4955c().mo4863b(view, layoutParams);
    }

    /* renamed from: b */
    public C1385a mo4954b() {
        return mo4955c().mo4849a();
    }

    /* renamed from: b */
    public void mo4826b(C1522b bVar) {
    }

    /* renamed from: c */
    public C1417h mo4955c() {
        if (this.f4528a == null) {
            this.f4528a = C1417h.m8337a((Dialog) this, (C1416g) this);
        }
        return this.f4528a;
    }

    /* renamed from: e */
    public boolean mo4956e(int i) {
        return mo4955c().mo4866c(i);
    }

    @C0003aa
    public View findViewById(@C0039r int i) {
        return mo4955c().mo4851a(i);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void invalidateOptionsMenu() {
        mo4955c().mo4871f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo4955c().mo4874i();
        super.onCreate(bundle);
        mo4955c().mo4853a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo4955c().mo4867d();
    }

    public void setContentView(@C0044w int i) {
        mo4955c().mo4861b(i);
    }

    public void setContentView(View view) {
        mo4955c().mo4855a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo4955c().mo4856a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo4955c().mo4857a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo4955c().mo4857a(charSequence);
    }
}
