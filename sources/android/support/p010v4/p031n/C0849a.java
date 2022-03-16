package android.support.p010v4.p031n;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: android.support.v4.n.a */
public final class C0849a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C0864e f2959a = C0865f.f3002c;

    /* renamed from: b */
    private static final char f2960b = '‪';

    /* renamed from: c */
    private static final char f2961c = '‫';

    /* renamed from: d */
    private static final char f2962d = '‬';

    /* renamed from: e */
    private static final char f2963e = '‎';

    /* renamed from: f */
    private static final char f2964f = '‏';

    /* renamed from: g */
    private static final String f2965g = Character.toString(f2963e);

    /* renamed from: h */
    private static final String f2966h = Character.toString(f2964f);

    /* renamed from: i */
    private static final String f2967i = "";

    /* renamed from: j */
    private static final int f2968j = 2;

    /* renamed from: k */
    private static final int f2969k = 2;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C0849a f2970l = new C0849a(false, 2, f2959a);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C0849a f2971m = new C0849a(true, 2, f2959a);

    /* renamed from: q */
    private static final int f2972q = -1;

    /* renamed from: r */
    private static final int f2973r = 0;

    /* renamed from: s */
    private static final int f2974s = 1;

    /* renamed from: n */
    private final boolean f2975n;

    /* renamed from: o */
    private final int f2976o;

    /* renamed from: p */
    private final C0864e f2977p;

    /* renamed from: android.support.v4.n.a$a */
    public static final class C0851a {

        /* renamed from: a */
        private boolean f2978a;

        /* renamed from: b */
        private int f2979b;

        /* renamed from: c */
        private C0864e f2980c;

        public C0851a() {
            m4294b(C0849a.m4277c(Locale.getDefault()));
        }

        public C0851a(Locale locale) {
            m4294b(C0849a.m4277c(locale));
        }

        public C0851a(boolean z) {
            m4294b(z);
        }

        /* renamed from: b */
        private void m4294b(boolean z) {
            this.f2978a = z;
            this.f2980c = C0849a.f2959a;
            this.f2979b = 2;
        }

        /* renamed from: c */
        private static C0849a m4295c(boolean z) {
            return z ? C0849a.f2971m : C0849a.f2970l;
        }

        /* renamed from: a */
        public C0851a mo2769a(C0864e eVar) {
            this.f2980c = eVar;
            return this;
        }

        /* renamed from: a */
        public C0851a mo2770a(boolean z) {
            if (z) {
                this.f2979b |= 2;
            } else {
                this.f2979b &= -3;
            }
            return this;
        }

        /* renamed from: a */
        public C0849a mo2771a() {
            return (this.f2979b == 2 && this.f2980c == C0849a.f2959a) ? m4295c(this.f2978a) : new C0849a(this.f2978a, this.f2979b, this.f2980c);
        }
    }

    /* renamed from: android.support.v4.n.a$b */
    private static class C0852b {

        /* renamed from: a */
        private static final int f2981a = 1792;

        /* renamed from: b */
        private static final byte[] f2982b = new byte[f2981a];

        /* renamed from: c */
        private final CharSequence f2983c;

        /* renamed from: d */
        private final boolean f2984d;

        /* renamed from: e */
        private final int f2985e;

        /* renamed from: f */
        private int f2986f;

        /* renamed from: g */
        private char f2987g;

        static {
            for (int i = 0; i < f2981a; i++) {
                f2982b[i] = Character.getDirectionality(i);
            }
        }

        C0852b(CharSequence charSequence, boolean z) {
            this.f2983c = charSequence;
            this.f2984d = z;
            this.f2985e = charSequence.length();
        }

        /* renamed from: a */
        private static byte m4299a(char c) {
            return c < f2981a ? f2982b[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m4300e() {
            int i = this.f2986f;
            while (this.f2986f < this.f2985e) {
                CharSequence charSequence = this.f2983c;
                int i2 = this.f2986f;
                this.f2986f = i2 + 1;
                this.f2987g = charSequence.charAt(i2);
                if (this.f2987g == '>') {
                    return 12;
                }
                if (this.f2987g == '\"' || this.f2987g == '\'') {
                    char c = this.f2987g;
                    while (this.f2986f < this.f2985e) {
                        CharSequence charSequence2 = this.f2983c;
                        int i3 = this.f2986f;
                        this.f2986f = i3 + 1;
                        char charAt = charSequence2.charAt(i3);
                        this.f2987g = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.f2986f = i;
            this.f2987g = '<';
            return 13;
        }

        /* renamed from: f */
        private byte m4301f() {
            int i = this.f2986f;
            while (this.f2986f > 0) {
                CharSequence charSequence = this.f2983c;
                int i2 = this.f2986f - 1;
                this.f2986f = i2;
                this.f2987g = charSequence.charAt(i2);
                if (this.f2987g == '<') {
                    return 12;
                }
                if (this.f2987g == '>') {
                    break;
                } else if (this.f2987g == '\"' || this.f2987g == '\'') {
                    char c = this.f2987g;
                    while (this.f2986f > 0) {
                        CharSequence charSequence2 = this.f2983c;
                        int i3 = this.f2986f - 1;
                        this.f2986f = i3;
                        char charAt = charSequence2.charAt(i3);
                        this.f2987g = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                }
            }
            this.f2986f = i;
            this.f2987g = '>';
            return 13;
        }

        /* renamed from: g */
        private byte m4302g() {
            while (this.f2986f < this.f2985e) {
                CharSequence charSequence = this.f2983c;
                int i = this.f2986f;
                this.f2986f = i + 1;
                char charAt = charSequence.charAt(i);
                this.f2987g = charAt;
                if (charAt == ';') {
                    return 12;
                }
            }
            return 12;
        }

        /* renamed from: h */
        private byte m4303h() {
            int i = this.f2986f;
            while (this.f2986f > 0) {
                CharSequence charSequence = this.f2983c;
                int i2 = this.f2986f - 1;
                this.f2986f = i2;
                this.f2987g = charSequence.charAt(i2);
                if (this.f2987g != '&') {
                    if (this.f2987g == ';') {
                        break;
                    }
                } else {
                    return 12;
                }
            }
            this.f2986f = i;
            this.f2987g = ';';
            return 13;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo2772a() {
            this.f2986f = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f2986f < this.f2985e && i == 0) {
                switch (mo2774c()) {
                    case 0:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        } else {
                            return -1;
                        }
                    case 1:
                    case 2:
                        if (i3 != 0) {
                            i = i3;
                            break;
                        } else {
                            return 1;
                        }
                    case 9:
                        break;
                    case 14:
                    case 15:
                        i3++;
                        i2 = -1;
                        break;
                    case 16:
                    case 17:
                        i3++;
                        i2 = 1;
                        break;
                    case 18:
                        i3--;
                        i2 = 0;
                        break;
                    default:
                        i = i3;
                        break;
                }
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f2986f > 0) {
                switch (mo2775d()) {
                    case 14:
                    case 15:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i3) {
                            i3--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i3++;
                        break;
                }
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo2773b() {
            this.f2986f = this.f2985e;
            int i = 0;
            int i2 = 0;
            while (this.f2986f > 0) {
                switch (mo2775d()) {
                    case 0:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            } else {
                                i = i2;
                                break;
                            }
                        } else {
                            return -1;
                        }
                    case 1:
                    case 2:
                        if (i2 != 0) {
                            if (i != 0) {
                                break;
                            } else {
                                i = i2;
                                break;
                            }
                        } else {
                            return 1;
                        }
                    case 9:
                        break;
                    case 14:
                    case 15:
                        if (i != i2) {
                            i2--;
                            break;
                        } else {
                            return -1;
                        }
                    case 16:
                    case 17:
                        if (i != i2) {
                            i2--;
                            break;
                        } else {
                            return 1;
                        }
                    case 18:
                        i2++;
                        break;
                    default:
                        if (i != 0) {
                            break;
                        } else {
                            i = i2;
                            break;
                        }
                }
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public byte mo2774c() {
            this.f2987g = this.f2983c.charAt(this.f2986f);
            if (Character.isHighSurrogate(this.f2987g)) {
                int codePointAt = Character.codePointAt(this.f2983c, this.f2986f);
                this.f2986f += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2986f++;
            byte a = m4299a(this.f2987g);
            return this.f2984d ? this.f2987g == '<' ? m4300e() : this.f2987g == '&' ? m4302g() : a : a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public byte mo2775d() {
            this.f2987g = this.f2983c.charAt(this.f2986f - 1);
            if (Character.isLowSurrogate(this.f2987g)) {
                int codePointBefore = Character.codePointBefore(this.f2983c, this.f2986f);
                this.f2986f -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2986f--;
            byte a = m4299a(this.f2987g);
            return this.f2984d ? this.f2987g == '>' ? m4301f() : this.f2987g == ';' ? m4303h() : a : a;
        }
    }

    private C0849a(boolean z, int i, C0864e eVar) {
        this.f2975n = z;
        this.f2976o = i;
        this.f2977p = eVar;
    }

    /* renamed from: a */
    public static C0849a m4270a() {
        return new C0851a().mo2771a();
    }

    /* renamed from: a */
    public static C0849a m4271a(Locale locale) {
        return new C0851a(locale).mo2771a();
    }

    /* renamed from: a */
    public static C0849a m4272a(boolean z) {
        return new C0851a(z).mo2771a();
    }

    /* renamed from: b */
    private String m4273b(CharSequence charSequence, C0864e eVar) {
        boolean a = eVar.mo2779a(charSequence, 0, charSequence.length());
        return (this.f2975n || (!a && m4275c(charSequence) != 1)) ? (!this.f2975n || (a && m4275c(charSequence) != -1)) ? "" : f2966h : f2965g;
    }

    /* renamed from: c */
    private static int m4275c(CharSequence charSequence) {
        return new C0852b(charSequence, false).mo2773b();
    }

    /* renamed from: c */
    private String m4276c(CharSequence charSequence, C0864e eVar) {
        boolean a = eVar.mo2779a(charSequence, 0, charSequence.length());
        return (this.f2975n || (!a && m4278d(charSequence) != 1)) ? (!this.f2975n || (a && m4278d(charSequence) != -1)) ? "" : f2966h : f2965g;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m4277c(Locale locale) {
        return C0872g.m4345a(locale) == 1;
    }

    /* renamed from: d */
    private static int m4278d(CharSequence charSequence) {
        return new C0852b(charSequence, false).mo2772a();
    }

    /* renamed from: a */
    public CharSequence mo2757a(CharSequence charSequence, C0864e eVar) {
        return mo2758a(charSequence, eVar, true);
    }

    /* renamed from: a */
    public CharSequence mo2758a(CharSequence charSequence, C0864e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = eVar.mo2779a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo2768c() && z) {
            spannableStringBuilder.append(m4276c(charSequence, a ? C0865f.f3001b : C0865f.f3000a));
        }
        if (a != this.f2975n) {
            spannableStringBuilder.append(a ? f2961c : f2960b);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f2962d);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m4273b(charSequence, a ? C0865f.f3001b : C0865f.f3000a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public CharSequence mo2759a(CharSequence charSequence, boolean z) {
        return mo2758a(charSequence, this.f2977p, z);
    }

    /* renamed from: a */
    public String mo2760a(String str, C0864e eVar) {
        return mo2761a(str, eVar, true);
    }

    /* renamed from: a */
    public String mo2761a(String str, C0864e eVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo2758a((CharSequence) str, eVar, z).toString();
    }

    /* renamed from: a */
    public String mo2762a(String str, boolean z) {
        return mo2761a(str, this.f2977p, z);
    }

    /* renamed from: a */
    public boolean mo2763a(CharSequence charSequence) {
        return this.f2977p.mo2779a(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public boolean mo2764a(String str) {
        return mo2763a((CharSequence) str);
    }

    /* renamed from: b */
    public CharSequence mo2765b(CharSequence charSequence) {
        return mo2758a(charSequence, this.f2977p, true);
    }

    /* renamed from: b */
    public String mo2766b(String str) {
        return mo2761a(str, this.f2977p, true);
    }

    /* renamed from: b */
    public boolean mo2767b() {
        return this.f2975n;
    }

    /* renamed from: c */
    public boolean mo2768c() {
        return (this.f2976o & 2) != 0;
    }
}
