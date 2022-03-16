package android.support.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* renamed from: android.support.annotation.ag */
public @interface C0011ag {

    /* renamed from: android.support.annotation.ag$a */
    public enum C0012a {
        LIBRARY,
        LIBRARY_GROUP,
        GROUP_ID,
        TESTS,
        SUBCLASSES
    }

    /* renamed from: a */
    C0012a[] mo9a();
}
