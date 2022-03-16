package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.ah */
public @interface C0013ah {
    /* renamed from: a */
    long mo10a() default -1;

    /* renamed from: b */
    long mo11b() default Long.MIN_VALUE;

    /* renamed from: c */
    long mo12c() default Long.MAX_VALUE;

    /* renamed from: d */
    long mo13d() default 1;
}
