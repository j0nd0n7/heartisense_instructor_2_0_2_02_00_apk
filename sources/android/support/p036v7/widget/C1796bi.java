package android.support.p036v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.widget.C1223ae;
import android.support.p036v7.p037a.C1359b;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.bi */
class C1796bi extends C1223ae implements View.OnClickListener {

    /* renamed from: l */
    static final int f6003l = 0;

    /* renamed from: m */
    static final int f6004m = 1;

    /* renamed from: n */
    static final int f6005n = 2;

    /* renamed from: o */
    static final int f6006o = -1;

    /* renamed from: p */
    private static final boolean f6007p = false;

    /* renamed from: q */
    private static final String f6008q = "SuggestionsAdapter";

    /* renamed from: r */
    private static final int f6009r = 50;

    /* renamed from: A */
    private ColorStateList f6010A;

    /* renamed from: B */
    private int f6011B = -1;

    /* renamed from: C */
    private int f6012C = -1;

    /* renamed from: D */
    private int f6013D = -1;

    /* renamed from: E */
    private int f6014E = -1;

    /* renamed from: F */
    private int f6015F = -1;

    /* renamed from: G */
    private int f6016G = -1;

    /* renamed from: s */
    private final SearchManager f6017s = ((SearchManager) this.f4013d.getSystemService("search"));

    /* renamed from: t */
    private final SearchView f6018t;

    /* renamed from: u */
    private final SearchableInfo f6019u;

    /* renamed from: v */
    private final Context f6020v;

    /* renamed from: w */
    private final WeakHashMap<String, Drawable.ConstantState> f6021w;

    /* renamed from: x */
    private final int f6022x;

    /* renamed from: y */
    private boolean f6023y = false;

    /* renamed from: z */
    private int f6024z = 1;

    /* renamed from: android.support.v7.widget.bi$a */
    private static final class C1797a {

        /* renamed from: a */
        public final TextView f6025a;

        /* renamed from: b */
        public final TextView f6026b;

        /* renamed from: c */
        public final ImageView f6027c;

        /* renamed from: d */
        public final ImageView f6028d;

        /* renamed from: e */
        public final ImageView f6029e;

        public C1797a(View view) {
            this.f6025a = (TextView) view.findViewById(16908308);
            this.f6026b = (TextView) view.findViewById(16908309);
            this.f6027c = (ImageView) view.findViewById(16908295);
            this.f6028d = (ImageView) view.findViewById(16908296);
            this.f6029e = (ImageView) view.findViewById(C1359b.C1366g.edit_query);
        }
    }

    public C1796bi(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f6018t = searchView;
        this.f6019u = searchableInfo;
        this.f6022x = searchView.getSuggestionCommitIconResId();
        this.f6020v = context;
        this.f6021w = weakHashMap;
    }

    /* renamed from: a */
    private Drawable m10870a(ComponentName componentName) {
        Drawable.ConstantState constantState = null;
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f6021w.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f6021w.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f6020v.getResources());
        }
        Drawable b = m10877b(componentName);
        if (b != null) {
            constantState = b.getConstantState();
        }
        this.f6021w.put(flattenToShortString, constantState);
        return b;
    }

    /* renamed from: a */
    private Drawable m10871a(String str) {
        if (str == null || str.length() == 0 || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f6020v.getPackageName() + "/" + parseInt;
            Drawable b = m10879b(str2);
            if (b != null) {
                return b;
            }
            Drawable a = C0434d.m2370a(this.f6020v, parseInt);
            m10876a(str2, a);
            return a;
        } catch (NumberFormatException e) {
            Drawable b2 = m10879b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable b3 = m10878b(Uri.parse(str));
            m10876a(str, b3);
            return b3;
        } catch (Resources.NotFoundException e2) {
            Log.w(f6008q, "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private static String m10872a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e(f6008q, "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m10873a(Cursor cursor, String str) {
        return m10872a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m10874a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m10875a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m10876a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f6021w.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m10877b(ComponentName componentName) {
        PackageManager packageManager = this.f4013d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w(f6008q, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(f6008q, e.toString());
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m10878b(Uri uri) {
        InputStream openInputStream;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                return mo7218a(uri);
            }
            openInputStream = this.f6020v.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, (String) null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (IOException e) {
                Log.e(f6008q, "Error closing icon stream for " + uri, e);
                return createFromStream;
            }
        } catch (Resources.NotFoundException e2) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException e3) {
            Log.w(f6008q, "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (IOException e4) {
                Log.e(f6008q, "Error closing icon stream for " + uri, e4);
            }
            throw th;
        }
    }

    /* renamed from: b */
    private Drawable m10879b(String str) {
        Drawable.ConstantState constantState = this.f6021w.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: b */
    private CharSequence m10880b(CharSequence charSequence) {
        if (this.f6010A == null) {
            TypedValue typedValue = new TypedValue();
            this.f4013d.getTheme().resolveAttribute(C1359b.C1361b.textColorSearchUrl, typedValue, true);
            this.f6010A = this.f4013d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f6010A, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private void m10881d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m10882e(Cursor cursor) {
        if (this.f6014E == -1) {
            return null;
        }
        Drawable a = m10871a(cursor.getString(this.f6014E));
        return a == null ? m10884g(cursor) : a;
    }

    /* renamed from: f */
    private Drawable m10883f(Cursor cursor) {
        if (this.f6015F == -1) {
            return null;
        }
        return m10871a(cursor.getString(this.f6015F));
    }

    /* renamed from: g */
    private Drawable m10884g(Cursor cursor) {
        Drawable a = m10870a(this.f6019u.getSearchActivity());
        return a != null ? a : this.f4013d.getPackageManager().getDefaultActivityIcon();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo7217a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f4013d.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
    }

    /* renamed from: a */
    public Cursor mo4364a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f6018t.getVisibility() != 0 || this.f6018t.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = mo7217a(this.f6019u, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (RuntimeException e) {
            Log.w(f6008q, "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo7218a(Uri uri) {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f4013d.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: a */
    public View mo4119a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo4119a(context, cursor, viewGroup);
        a.setTag(new C1797a(a));
        ((ImageView) a.findViewById(C1359b.C1366g.edit_query)).setImageResource(this.f6022x);
        return a;
    }

    /* renamed from: a */
    public void mo4367a(Cursor cursor) {
        if (this.f6023y) {
            Log.w(f6008q, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo4367a(cursor);
            if (cursor != null) {
                this.f6011B = cursor.getColumnIndex("suggest_text_1");
                this.f6012C = cursor.getColumnIndex("suggest_text_2");
                this.f6013D = cursor.getColumnIndex("suggest_text_2_url");
                this.f6014E = cursor.getColumnIndex("suggest_icon_1");
                this.f6015F = cursor.getColumnIndex("suggest_icon_2");
                this.f6016G = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e(f6008q, "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo4171a(View view, Context context, Cursor cursor) {
        C1797a aVar = (C1797a) view.getTag();
        int i = this.f6016G != -1 ? cursor.getInt(this.f6016G) : 0;
        if (aVar.f6025a != null) {
            m10875a(aVar.f6025a, (CharSequence) m10872a(cursor, this.f6011B));
        }
        if (aVar.f6026b != null) {
            String a = m10872a(cursor, this.f6013D);
            CharSequence b = a != null ? m10880b((CharSequence) a) : m10872a(cursor, this.f6012C);
            if (TextUtils.isEmpty(b)) {
                if (aVar.f6025a != null) {
                    aVar.f6025a.setSingleLine(false);
                    aVar.f6025a.setMaxLines(2);
                }
            } else if (aVar.f6025a != null) {
                aVar.f6025a.setSingleLine(true);
                aVar.f6025a.setMaxLines(1);
            }
            m10875a(aVar.f6026b, b);
        }
        if (aVar.f6027c != null) {
            m10874a(aVar.f6027c, m10882e(cursor), 4);
        }
        if (aVar.f6028d != null) {
            m10874a(aVar.f6028d, m10883f(cursor), 8);
        }
        if (this.f6024z == 2 || (this.f6024z == 1 && (i & 1) != 0)) {
            aVar.f6029e.setVisibility(0);
            aVar.f6029e.setTag(aVar.f6025a.getText());
            aVar.f6029e.setOnClickListener(this);
            return;
        }
        aVar.f6029e.setVisibility(8);
    }

    /* renamed from: c */
    public CharSequence mo4175c(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m10873a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f6019u.shouldRewriteQueryFromData() && (a2 = m10873a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f6019u.shouldRewriteQueryFromText() || (a = m10873a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    public void mo7219c(int i) {
        this.f6024z = i;
    }

    /* renamed from: d */
    public int mo7220d() {
        return this.f6024z;
    }

    /* renamed from: e */
    public void mo7221e() {
        mo4367a((Cursor) null);
        this.f6023y = true;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w(f6008q, "Search suggestions cursor threw exception.", e);
            View a = mo4119a(this.f4013d, this.f4012c, viewGroup);
            if (a != null) {
                ((C1797a) a.getTag()).f6025a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m10881d(mo4363a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m10881d(mo4363a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f6018t.mo5886a((CharSequence) tag);
        }
    }
}
