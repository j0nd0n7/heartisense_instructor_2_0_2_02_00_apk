package android.support.p036v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0015aj;
import android.support.annotation.C0016ak;
import android.support.annotation.C0026e;
import android.support.annotation.C0027f;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p036v7.app.AlertController;
import android.support.p036v7.p037a.C1359b;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: android.support.v7.app.e */
public class C1413e extends C1448o implements DialogInterface {

    /* renamed from: b */
    static final int f4407b = 0;

    /* renamed from: c */
    static final int f4408c = 1;

    /* renamed from: a */
    final AlertController f4409a;

    /* renamed from: android.support.v7.app.e$a */
    public static class C1414a {

        /* renamed from: a */
        private final AlertController.C1377a f4410a;

        /* renamed from: b */
        private final int f4411b;

        public C1414a(@C0047z Context context) {
            this(context, C1413e.m8261a(context, 0));
        }

        public C1414a(@C0047z Context context, @C0016ak int i) {
            this.f4410a = new AlertController.C1377a(new ContextThemeWrapper(context, C1413e.m8261a(context, i)));
            this.f4411b = i;
        }

        @C0047z
        /* renamed from: a */
        public Context mo4779a() {
            return this.f4410a.f4264a;
        }

        /* renamed from: a */
        public C1414a mo4780a(@C0015aj int i) {
            this.f4410a.f4269f = this.f4410a.f4264a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C1414a mo4781a(@C0026e int i, int i2, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4282s = this.f4410a.f4264a.getResources().getTextArray(i);
            this.f4410a.f4284u = onClickListener;
            this.f4410a.f4255F = i2;
            this.f4410a.f4254E = true;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4782a(@C0015aj int i, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4272i = this.f4410a.f4264a.getText(i);
            this.f4410a.f4273j = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4783a(@C0026e int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f4410a.f4282s = this.f4410a.f4264a.getResources().getTextArray(i);
            this.f4410a.f4256G = onMultiChoiceClickListener;
            this.f4410a.f4252C = zArr;
            this.f4410a.f4253D = true;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4784a(DialogInterface.OnCancelListener onCancelListener) {
            this.f4410a.f4279p = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4785a(DialogInterface.OnDismissListener onDismissListener) {
            this.f4410a.f4280q = onDismissListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4786a(DialogInterface.OnKeyListener onKeyListener) {
            this.f4410a.f4281r = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4787a(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4257H = cursor;
            this.f4410a.f4284u = onClickListener;
            this.f4410a.f4255F = i;
            this.f4410a.f4258I = str;
            this.f4410a.f4254E = true;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4788a(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            this.f4410a.f4257H = cursor;
            this.f4410a.f4258I = str;
            this.f4410a.f4284u = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4789a(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f4410a.f4257H = cursor;
            this.f4410a.f4256G = onMultiChoiceClickListener;
            this.f4410a.f4259J = str;
            this.f4410a.f4258I = str2;
            this.f4410a.f4253D = true;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4790a(@C0003aa Drawable drawable) {
            this.f4410a.f4267d = drawable;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4791a(@C0003aa View view) {
            this.f4410a.f4270g = view;
            return this;
        }

        @Deprecated
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: a */
        public C1414a mo4792a(View view, int i, int i2, int i3, int i4) {
            this.f4410a.f4286w = view;
            this.f4410a.f4285v = 0;
            this.f4410a.f4251B = true;
            this.f4410a.f4287x = i;
            this.f4410a.f4288y = i2;
            this.f4410a.f4289z = i3;
            this.f4410a.f4250A = i4;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4793a(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f4410a.f4261L = onItemSelectedListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4794a(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4283t = listAdapter;
            this.f4410a.f4284u = onClickListener;
            this.f4410a.f4255F = i;
            this.f4410a.f4254E = true;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4795a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4283t = listAdapter;
            this.f4410a.f4284u = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4796a(@C0003aa CharSequence charSequence) {
            this.f4410a.f4269f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4797a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4272i = charSequence;
            this.f4410a.f4273j = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4798a(boolean z) {
            this.f4410a.f4278o = z;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4799a(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4282s = charSequenceArr;
            this.f4410a.f4284u = onClickListener;
            this.f4410a.f4255F = i;
            this.f4410a.f4254E = true;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4800a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4282s = charSequenceArr;
            this.f4410a.f4284u = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C1414a mo4801a(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f4410a.f4282s = charSequenceArr;
            this.f4410a.f4256G = onMultiChoiceClickListener;
            this.f4410a.f4252C = zArr;
            this.f4410a.f4253D = true;
            return this;
        }

        /* renamed from: b */
        public C1414a mo4802b(@C0015aj int i) {
            this.f4410a.f4271h = this.f4410a.f4264a.getText(i);
            return this;
        }

        /* renamed from: b */
        public C1414a mo4803b(@C0015aj int i, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4274k = this.f4410a.f4264a.getText(i);
            this.f4410a.f4275l = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C1414a mo4804b(View view) {
            this.f4410a.f4286w = view;
            this.f4410a.f4285v = 0;
            this.f4410a.f4251B = false;
            return this;
        }

        /* renamed from: b */
        public C1414a mo4805b(@C0003aa CharSequence charSequence) {
            this.f4410a.f4271h = charSequence;
            return this;
        }

        /* renamed from: b */
        public C1414a mo4806b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4274k = charSequence;
            this.f4410a.f4275l = onClickListener;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C1414a mo4807b(boolean z) {
            this.f4410a.f4260K = z;
            return this;
        }

        /* renamed from: b */
        public C1413e mo4808b() {
            C1413e eVar = new C1413e(this.f4410a.f4264a, this.f4411b);
            this.f4410a.mo4597a(eVar.f4409a);
            eVar.setCancelable(this.f4410a.f4278o);
            if (this.f4410a.f4278o) {
                eVar.setCanceledOnTouchOutside(true);
            }
            eVar.setOnCancelListener(this.f4410a.f4279p);
            eVar.setOnDismissListener(this.f4410a.f4280q);
            if (this.f4410a.f4281r != null) {
                eVar.setOnKeyListener(this.f4410a.f4281r);
            }
            return eVar;
        }

        /* renamed from: c */
        public C1414a mo4809c(@C0036o int i) {
            this.f4410a.f4266c = i;
            return this;
        }

        /* renamed from: c */
        public C1414a mo4810c(@C0015aj int i, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4276m = this.f4410a.f4264a.getText(i);
            this.f4410a.f4277n = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C1414a mo4811c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4276m = charSequence;
            this.f4410a.f4277n = onClickListener;
            return this;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: c */
        public C1414a mo4812c(boolean z) {
            this.f4410a.f4263N = z;
            return this;
        }

        /* renamed from: c */
        public C1413e mo4813c() {
            C1413e b = mo4808b();
            b.show();
            return b;
        }

        /* renamed from: d */
        public C1414a mo4814d(@C0027f int i) {
            TypedValue typedValue = new TypedValue();
            this.f4410a.f4264a.getTheme().resolveAttribute(i, typedValue, true);
            this.f4410a.f4266c = typedValue.resourceId;
            return this;
        }

        /* renamed from: d */
        public C1414a mo4815d(@C0026e int i, DialogInterface.OnClickListener onClickListener) {
            this.f4410a.f4282s = this.f4410a.f4264a.getResources().getTextArray(i);
            this.f4410a.f4284u = onClickListener;
            return this;
        }

        /* renamed from: e */
        public C1414a mo4816e(int i) {
            this.f4410a.f4286w = null;
            this.f4410a.f4285v = i;
            this.f4410a.f4251B = false;
            return this;
        }
    }

    protected C1413e(@C0047z Context context) {
        this(context, 0);
    }

    protected C1413e(@C0047z Context context, @C0016ak int i) {
        super(context, m8261a(context, i));
        this.f4409a = new AlertController(getContext(), this, getWindow());
    }

    protected C1413e(@C0047z Context context, boolean z, @C0003aa DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    /* renamed from: a */
    static int m8261a(@C0047z Context context, @C0016ak int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1359b.C1361b.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public Button mo4763a(int i) {
        return this.f4409a.mo4590e(i);
    }

    /* renamed from: a */
    public ListView mo4764a() {
        return this.f4409a.mo4582b();
    }

    /* renamed from: a */
    public void mo4765a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4409a.mo4577a(i, charSequence, onClickListener, (Message) null);
    }

    /* renamed from: a */
    public void mo4766a(int i, CharSequence charSequence, Message message) {
        this.f4409a.mo4577a(i, charSequence, (DialogInterface.OnClickListener) null, message);
    }

    /* renamed from: a */
    public void mo4767a(Drawable drawable) {
        this.f4409a.mo4578a(drawable);
    }

    /* renamed from: a */
    public void mo4768a(View view) {
        this.f4409a.mo4584b(view);
    }

    /* renamed from: a */
    public void mo4769a(View view, int i, int i2, int i3, int i4) {
        this.f4409a.mo4579a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo4770a(CharSequence charSequence) {
        this.f4409a.mo4585b(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4771b(int i) {
        this.f4409a.mo4583b(i);
    }

    /* renamed from: b */
    public void mo4772b(View view) {
        this.f4409a.mo4588c(view);
    }

    /* renamed from: c */
    public void mo4773c(int i) {
        this.f4409a.mo4587c(i);
    }

    /* renamed from: d */
    public void mo4774d(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.f4409a.mo4587c(typedValue.resourceId);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4409a.mo4575a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f4409a.mo4581a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f4409a.mo4586b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f4409a.mo4580a(charSequence);
    }
}
