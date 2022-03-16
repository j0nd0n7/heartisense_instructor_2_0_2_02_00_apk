package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.view.View;
import android.widget.SearchView;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.widget.ai */
class C1237ai {

    /* renamed from: android.support.v4.widget.ai$a */
    interface C1240a {
        /* renamed from: a */
        boolean mo4161a();
    }

    /* renamed from: android.support.v4.widget.ai$b */
    interface C1241b {
        /* renamed from: a */
        boolean mo4159a(String str);

        /* renamed from: b */
        boolean mo4160b(String str);
    }

    C1237ai() {
    }

    /* renamed from: a */
    public static View m7362a(Context context) {
        return new SearchView(context);
    }

    /* renamed from: a */
    public static Object m7363a(final C1240a aVar) {
        return new SearchView.OnCloseListener() {
            public boolean onClose() {
                return aVar.mo4161a();
            }
        };
    }

    /* renamed from: a */
    public static Object m7364a(final C1241b bVar) {
        return new SearchView.OnQueryTextListener() {
            public boolean onQueryTextChange(String str) {
                return bVar.mo4160b(str);
            }

            public boolean onQueryTextSubmit(String str) {
                return bVar.mo4159a(str);
            }
        };
    }

    /* renamed from: a */
    public static void m7365a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("searchView must be non-null");
        } else if (!(view instanceof SearchView)) {
            throw new IllegalArgumentException("searchView must be an instance ofandroid.widget.SearchView");
        }
    }

    /* renamed from: a */
    public static void m7366a(View view, int i) {
        ((SearchView) view).setMaxWidth(i);
    }

    /* renamed from: a */
    public static void m7367a(View view, ComponentName componentName) {
        SearchView searchView = (SearchView) view;
        searchView.setSearchableInfo(((SearchManager) searchView.getContext().getSystemService("search")).getSearchableInfo(componentName));
    }

    /* renamed from: a */
    public static void m7368a(View view, CharSequence charSequence) {
        ((SearchView) view).setQueryHint(charSequence);
    }

    /* renamed from: a */
    public static void m7369a(View view, CharSequence charSequence, boolean z) {
        ((SearchView) view).setQuery(charSequence, z);
    }

    /* renamed from: a */
    public static void m7370a(View view, Object obj) {
        ((SearchView) view).setOnQueryTextListener((SearchView.OnQueryTextListener) obj);
    }

    /* renamed from: a */
    public static void m7371a(View view, boolean z) {
        ((SearchView) view).setIconified(z);
    }

    /* renamed from: b */
    public static CharSequence m7372b(View view) {
        return ((SearchView) view).getQuery();
    }

    /* renamed from: b */
    public static void m7373b(View view, Object obj) {
        ((SearchView) view).setOnCloseListener((SearchView.OnCloseListener) obj);
    }

    /* renamed from: b */
    public static void m7374b(View view, boolean z) {
        ((SearchView) view).setSubmitButtonEnabled(z);
    }

    /* renamed from: c */
    public static void m7375c(View view, boolean z) {
        ((SearchView) view).setQueryRefinementEnabled(z);
    }

    /* renamed from: c */
    public static boolean m7376c(View view) {
        return ((SearchView) view).isIconified();
    }

    /* renamed from: d */
    public static boolean m7377d(View view) {
        return ((SearchView) view).isSubmitButtonEnabled();
    }

    /* renamed from: e */
    public static boolean m7378e(View view) {
        return ((SearchView) view).isQueryRefinementEnabled();
    }
}
