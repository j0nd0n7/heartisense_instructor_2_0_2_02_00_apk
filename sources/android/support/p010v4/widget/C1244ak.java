package android.support.p010v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.C0011ag;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: android.support.v4.widget.ak */
public class C1244ak extends C1223ae {
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: l */
    protected int[] f3802l;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: m */
    protected int[] f3803m;

    /* renamed from: n */
    String[] f3804n;

    /* renamed from: o */
    private int f3805o = -1;

    /* renamed from: p */
    private C1245a f3806p;

    /* renamed from: q */
    private C1246b f3807q;

    /* renamed from: android.support.v4.widget.ak$a */
    public interface C1245a {
        /* renamed from: a */
        CharSequence mo4180a(Cursor cursor);
    }

    /* renamed from: android.support.v4.widget.ak$b */
    public interface C1246b {
        /* renamed from: a */
        boolean mo4181a(View view, Cursor cursor, int i);
    }

    @Deprecated
    public C1244ak(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.f3803m = iArr;
        this.f3804n = strArr;
        m7385a(cursor, strArr);
    }

    public C1244ak(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f3803m = iArr;
        this.f3804n = strArr;
        m7385a(cursor, strArr);
    }

    /* renamed from: a */
    private void m7385a(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            if (this.f3802l == null || this.f3802l.length != length) {
                this.f3802l = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f3802l[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f3802l = null;
    }

    /* renamed from: a */
    public void mo4168a(Cursor cursor, String[] strArr, int[] iArr) {
        this.f3804n = strArr;
        this.f3803m = iArr;
        m7385a(cursor, this.f3804n);
        super.mo4367a(cursor);
    }

    /* renamed from: a */
    public void mo4169a(C1245a aVar) {
        this.f3806p = aVar;
    }

    /* renamed from: a */
    public void mo4170a(C1246b bVar) {
        this.f3807q = bVar;
    }

    /* renamed from: a */
    public void mo4171a(View view, Context context, Cursor cursor) {
        C1246b bVar = this.f3807q;
        int length = this.f3803m.length;
        int[] iArr = this.f3802l;
        int[] iArr2 = this.f3803m;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr2[i]);
            if (findViewById != null) {
                if (bVar != null ? bVar.mo4181a(findViewById, cursor, iArr[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo4173a((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo4172a((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4172a(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: a */
    public void mo4173a(TextView textView, String str) {
        textView.setText(str);
    }

    /* renamed from: b */
    public Cursor mo4174b(Cursor cursor) {
        m7385a(cursor, this.f3804n);
        return super.mo4174b(cursor);
    }

    /* renamed from: c */
    public CharSequence mo4175c(Cursor cursor) {
        return this.f3806p != null ? this.f3806p.mo4180a(cursor) : this.f3805o > -1 ? cursor.getString(this.f3805o) : super.mo4175c(cursor);
    }

    /* renamed from: c */
    public void mo4176c(int i) {
        this.f3805o = i;
    }

    /* renamed from: d */
    public C1246b mo4177d() {
        return this.f3807q;
    }

    /* renamed from: e */
    public int mo4178e() {
        return this.f3805o;
    }

    /* renamed from: f */
    public C1245a mo4179f() {
        return this.f3806p;
    }
}
