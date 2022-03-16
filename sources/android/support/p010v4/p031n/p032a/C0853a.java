package android.support.p010v4.p031n.p032a;

import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0895m;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import com.p048a.p049a.p053d.C2010c;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: android.support.v4.n.a.a */
public final class C0853a {

    /* renamed from: a */
    private static final String[] f2988a = new String[0];

    /* renamed from: b */
    private static final Comparator<C0855a> f2989b = new Comparator<C0855a>() {
        /* renamed from: a */
        public final int compare(C0855a aVar, C0855a aVar2) {
            if (aVar.f2992c < aVar2.f2992c) {
                return -1;
            }
            if (aVar.f2992c > aVar2.f2992c) {
                return 1;
            }
            if (aVar.f2993d < aVar2.f2993d) {
                return 1;
            }
            return aVar.f2993d <= aVar2.f2993d ? 0 : -1;
        }
    };

    /* renamed from: android.support.v4.n.a.a$a */
    private static class C0855a {

        /* renamed from: a */
        URLSpan f2990a;

        /* renamed from: b */
        String f2991b;

        /* renamed from: c */
        int f2992c;

        /* renamed from: d */
        int f2993d;

        C0855a() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.n.a.a$b */
    public @interface C0856b {
    }

    private C0853a() {
    }

    /* renamed from: a */
    private static String m4308a(@C0047z String str, @C0047z String[] strArr, Matcher matcher, @C0003aa Linkify.TransformFilter transformFilter) {
        boolean z = true;
        String transformUrl = transformFilter != null ? transformFilter.transformUrl(matcher, str) : str;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                z = false;
                break;
            } else if (transformUrl.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                if (!transformUrl.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                    transformUrl = strArr[i] + transformUrl.substring(strArr[i].length());
                }
            } else {
                i++;
            }
        }
        return (z || strArr.length <= 0) ? transformUrl : strArr[0] + transformUrl;
    }

    /* renamed from: a */
    private static void m4309a(@C0047z TextView textView) {
        MovementMethod movementMethod = textView.getMovementMethod();
        if ((movementMethod == null || !(movementMethod instanceof LinkMovementMethod)) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    public static final void m4310a(@C0047z TextView textView, @C0047z Pattern pattern, @C0003aa String str) {
        m4312a(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    /* renamed from: a */
    public static final void m4311a(@C0047z TextView textView, @C0047z Pattern pattern, @C0003aa String str, @C0003aa Linkify.MatchFilter matchFilter, @C0003aa Linkify.TransformFilter transformFilter) {
        m4312a(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    /* renamed from: a */
    public static final void m4312a(@C0047z TextView textView, @C0047z Pattern pattern, @C0003aa String str, @C0003aa String[] strArr, @C0003aa Linkify.MatchFilter matchFilter, @C0003aa Linkify.TransformFilter transformFilter) {
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (m4319a((Spannable) valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            m4309a(textView);
        }
    }

    /* renamed from: a */
    private static void m4313a(String str, int i, int i2, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i, i2, 33);
    }

    /* renamed from: a */
    private static final void m4314a(ArrayList<C0855a> arrayList, Spannable spannable) {
        int indexOf;
        String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                String findAddress = WebView.findAddress(obj);
                if (findAddress != null && (indexOf = obj.indexOf(findAddress)) >= 0) {
                    C0855a aVar = new C0855a();
                    int length = findAddress.length() + indexOf;
                    aVar.f2992c = indexOf + i;
                    aVar.f2993d = i + length;
                    obj = obj.substring(length);
                    i += length;
                    try {
                        aVar.f2991b = "geo:0,0?q=" + URLEncoder.encode(findAddress, C2010c.f6851a);
                        arrayList.add(aVar);
                    } catch (UnsupportedEncodingException e) {
                    }
                } else {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m4315a(ArrayList<C0855a> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                C0855a aVar = new C0855a();
                aVar.f2991b = m4308a(matcher.group(0), strArr, matcher, transformFilter);
                aVar.f2992c = start;
                aVar.f2993d = end;
                arrayList.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public static final boolean m4316a(@C0047z Spannable spannable, int i) {
        if (i == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            m4315a((ArrayList<C0855a>) arrayList, spannable, C0895m.f3089e, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, (Linkify.TransformFilter) null);
        }
        if ((i & 2) != 0) {
            m4315a((ArrayList<C0855a>) arrayList, spannable, C0895m.f3090f, new String[]{"mailto:"}, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
        if ((i & 8) != 0) {
            m4314a((ArrayList<C0855a>) arrayList, spannable);
        }
        m4321b(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0855a aVar = (C0855a) it.next();
            if (aVar.f2990a == null) {
                m4313a(aVar.f2991b, aVar.f2992c, aVar.f2993d, spannable);
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m4317a(@C0047z Spannable spannable, @C0047z Pattern pattern, @C0003aa String str) {
        return m4319a(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    /* renamed from: a */
    public static final boolean m4318a(@C0047z Spannable spannable, @C0047z Pattern pattern, @C0003aa String str, @C0003aa Linkify.MatchFilter matchFilter, @C0003aa Linkify.TransformFilter transformFilter) {
        return m4319a(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    /* renamed from: a */
    public static final boolean m4319a(@C0047z Spannable spannable, @C0047z Pattern pattern, @C0003aa String str, @C0003aa String[] strArr, @C0003aa Linkify.MatchFilter matchFilter, @C0003aa Linkify.TransformFilter transformFilter) {
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f2988a;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            strArr2[i + 1] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) {
                m4313a(m4308a(matcher.group(0), strArr2, matcher, transformFilter), start, end, spannable);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m4320a(@C0047z TextView textView, int i) {
        if (i == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (!m4316a((Spannable) valueOf, i)) {
                return false;
            }
            m4309a(textView);
            textView.setText(valueOf);
            return true;
        } else if (!m4316a((Spannable) text, i)) {
            return false;
        } else {
            m4309a(textView);
            return true;
        }
    }

    /* renamed from: b */
    private static final void m4321b(ArrayList<C0855a> arrayList, Spannable spannable) {
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i2 = 0; i2 < uRLSpanArr.length; i2++) {
            C0855a aVar = new C0855a();
            aVar.f2990a = uRLSpanArr[i2];
            aVar.f2992c = spannable.getSpanStart(uRLSpanArr[i2]);
            aVar.f2993d = spannable.getSpanEnd(uRLSpanArr[i2]);
            arrayList.add(aVar);
        }
        Collections.sort(arrayList, f2989b);
        int size = arrayList.size();
        while (i < size - 1) {
            C0855a aVar2 = arrayList.get(i);
            C0855a aVar3 = arrayList.get(i + 1);
            if (aVar2.f2992c <= aVar3.f2992c && aVar2.f2993d > aVar3.f2992c) {
                int i3 = aVar3.f2993d <= aVar2.f2993d ? i + 1 : aVar2.f2993d - aVar2.f2992c > aVar3.f2993d - aVar3.f2992c ? i + 1 : aVar2.f2993d - aVar2.f2992c < aVar3.f2993d - aVar3.f2992c ? i : -1;
                if (i3 != -1) {
                    URLSpan uRLSpan = arrayList.get(i3).f2990a;
                    if (uRLSpan != null) {
                        spannable.removeSpan(uRLSpan);
                    }
                    arrayList.remove(i3);
                    size--;
                }
            }
            i++;
        }
    }
}
