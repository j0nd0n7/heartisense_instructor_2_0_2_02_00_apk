package android.support.p010v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.annotation.C0011ag;
import android.support.p010v4.widget.C1305i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.h */
public abstract class C1302h extends BaseAdapter implements C1305i.C1306a, Filterable {
    @Deprecated

    /* renamed from: j */
    public static final int f4008j = 1;

    /* renamed from: k */
    public static final int f4009k = 2;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: a */
    protected boolean f4010a;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: b */
    protected boolean f4011b;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: c */
    protected Cursor f4012c;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: d */
    protected Context f4013d;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: e */
    protected int f4014e;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: f */
    protected C1303a f4015f;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: g */
    protected DataSetObserver f4016g;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: h */
    protected C1305i f4017h;
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: i */
    protected FilterQueryProvider f4018i;

    /* renamed from: android.support.v4.widget.h$a */
    private class C1303a extends ContentObserver {
        C1303a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C1302h.this.mo4370c();
        }
    }

    /* renamed from: android.support.v4.widget.h$b */
    private class C1304b extends DataSetObserver {
        C1304b() {
        }

        public void onChanged() {
            C1302h.this.f4010a = true;
            C1302h.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C1302h.this.f4010a = false;
            C1302h.this.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public C1302h(Context context, Cursor cursor) {
        mo4365a(context, cursor, 1);
    }

    public C1302h(Context context, Cursor cursor, int i) {
        mo4365a(context, cursor, i);
    }

    public C1302h(Context context, Cursor cursor, boolean z) {
        mo4365a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo4363a() {
        return this.f4012c;
    }

    /* renamed from: a */
    public Cursor mo4364a(CharSequence charSequence) {
        return this.f4018i != null ? this.f4018i.runQuery(charSequence) : this.f4012c;
    }

    /* renamed from: a */
    public abstract View mo4119a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4365a(Context context, Cursor cursor, int i) {
        boolean z = true;
        if ((i & 1) == 1) {
            i |= 2;
            this.f4011b = true;
        } else {
            this.f4011b = false;
        }
        if (cursor == null) {
            z = false;
        }
        this.f4012c = cursor;
        this.f4010a = z;
        this.f4013d = context;
        this.f4014e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f4015f = new C1303a();
            this.f4016g = new C1304b();
        } else {
            this.f4015f = null;
            this.f4016g = null;
        }
        if (z) {
            if (this.f4015f != null) {
                cursor.registerContentObserver(this.f4015f);
            }
            if (this.f4016g != null) {
                cursor.registerDataSetObserver(this.f4016g);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo4366a(Context context, Cursor cursor, boolean z) {
        mo4365a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo4367a(Cursor cursor) {
        Cursor b = mo4174b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: a */
    public abstract void mo4171a(View view, Context context, Cursor cursor);

    /* renamed from: a */
    public void mo4368a(FilterQueryProvider filterQueryProvider) {
        this.f4018i = filterQueryProvider;
    }

    /* renamed from: b */
    public Cursor mo4174b(Cursor cursor) {
        if (cursor == this.f4012c) {
            return null;
        }
        Cursor cursor2 = this.f4012c;
        if (cursor2 != null) {
            if (this.f4015f != null) {
                cursor2.unregisterContentObserver(this.f4015f);
            }
            if (this.f4016g != null) {
                cursor2.unregisterDataSetObserver(this.f4016g);
            }
        }
        this.f4012c = cursor;
        if (cursor != null) {
            if (this.f4015f != null) {
                cursor.registerContentObserver(this.f4015f);
            }
            if (this.f4016g != null) {
                cursor.registerDataSetObserver(this.f4016g);
            }
            this.f4014e = cursor.getColumnIndexOrThrow("_id");
            this.f4010a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f4014e = -1;
        this.f4010a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    /* renamed from: b */
    public View mo4121b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo4119a(context, cursor, viewGroup);
    }

    /* renamed from: b */
    public FilterQueryProvider mo4369b() {
        return this.f4018i;
    }

    /* renamed from: c */
    public CharSequence mo4175c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo4370c() {
        if (this.f4011b && this.f4012c != null && !this.f4012c.isClosed()) {
            this.f4010a = this.f4012c.requery();
        }
    }

    public int getCount() {
        if (!this.f4010a || this.f4012c == null) {
            return 0;
        }
        return this.f4012c.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4010a) {
            return null;
        }
        this.f4012c.moveToPosition(i);
        if (view == null) {
            view = mo4121b(this.f4013d, this.f4012c, viewGroup);
        }
        mo4171a(view, this.f4013d, this.f4012c);
        return view;
    }

    public Filter getFilter() {
        if (this.f4017h == null) {
            this.f4017h = new C1305i(this);
        }
        return this.f4017h;
    }

    public Object getItem(int i) {
        if (!this.f4010a || this.f4012c == null) {
            return null;
        }
        this.f4012c.moveToPosition(i);
        return this.f4012c;
    }

    public long getItemId(int i) {
        if (!this.f4010a || this.f4012c == null || !this.f4012c.moveToPosition(i)) {
            return 0;
        }
        return this.f4012c.getLong(this.f4014e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4010a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (!this.f4012c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        } else {
            if (view == null) {
                view = mo4119a(this.f4013d, this.f4012c, viewGroup);
            }
            mo4171a(view, this.f4013d, this.f4012c);
            return view;
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
