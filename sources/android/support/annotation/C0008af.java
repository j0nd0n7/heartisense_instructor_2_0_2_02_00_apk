package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.af */
public @interface C0008af {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    /* renamed from: android.support.annotation.af$a */
    public @interface C0009a {
        /* renamed from: a */
        C0008af mo7a() default @C0008af;
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    /* renamed from: android.support.annotation.af$b */
    public @interface C0010b {
        /* renamed from: a */
        C0008af mo8a() default @C0008af;
    }

    /* renamed from: a */
    String mo3a() default "";

    /* renamed from: b */
    String[] mo4b() default {};

    /* renamed from: c */
    String[] mo5c() default {};

    /* renamed from: d */
    boolean mo6d() default false;
}
