package android.support.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.n */
public @interface C0035n {

    /* renamed from: a */
    public static final int f16a = 0;

    /* renamed from: b */
    public static final int f17b = 1;

    /* renamed from: c */
    public static final int f18c = 2;

    /* renamed from: a */
    int mo17a() default 1;
}
