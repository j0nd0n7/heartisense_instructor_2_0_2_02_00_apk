package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.ae */
public @interface C0007ae {
    @C0041t(mo24a = 1)
    /* renamed from: a */
    int mo1a() default 1;

    @C0041t(mo24a = 1)
    /* renamed from: b */
    int mo2b() default 1;
}
