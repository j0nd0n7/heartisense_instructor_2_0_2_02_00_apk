package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.ai */
class C1021ai {

    /* renamed from: android.support.v4.view.ai$a */
    private static class C1022a extends SingleLineTransformationMethod {

        /* renamed from: a */
        private static final String f3431a = "SingleLineAllCapsTransform";

        /* renamed from: b */
        private Locale f3432b;

        public C1022a(Context context) {
            this.f3432b = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f3432b);
            }
            return null;
        }
    }

    C1021ai() {
    }

    /* renamed from: a */
    public static void m5814a(TextView textView) {
        textView.setTransformationMethod(new C1022a(textView.getContext()));
    }
}
