package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.p */
public @interface C0037p {
    /* renamed from: a */
    double mo18a() default Double.NEGATIVE_INFINITY;

    /* renamed from: b */
    double mo19b() default Double.POSITIVE_INFINITY;

    /* renamed from: c */
    boolean mo20c() default true;

    /* renamed from: d */
    boolean mo21d() default true;
}
