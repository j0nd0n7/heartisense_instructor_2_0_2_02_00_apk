package android.support.p010v4.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: android.support.v4.widget.i */
class C1305i extends Filter {

    /* renamed from: a */
    C1306a f4021a;

    /* renamed from: android.support.v4.widget.i$a */
    interface C1306a {
        /* renamed from: a */
        Cursor mo4363a();

        /* renamed from: a */
        Cursor mo4364a(CharSequence charSequence);

        /* renamed from: a */
        void mo4367a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo4175c(Cursor cursor);
    }

    C1305i(C1306a aVar) {
        this.f4021a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f4021a.mo4175c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f4021a.mo4364a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f4021a.mo4363a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f4021a.mo4367a((Cursor) filterResults.values);
        }
    }
}
