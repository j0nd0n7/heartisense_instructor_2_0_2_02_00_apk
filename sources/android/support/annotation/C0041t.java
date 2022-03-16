package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.t */
public @interface C0041t {
    /* renamed from: a */
    long mo24a() default Long.MIN_VALUE;

    /* renamed from: b */
    long mo25b() default Long.MAX_VALUE;
}
