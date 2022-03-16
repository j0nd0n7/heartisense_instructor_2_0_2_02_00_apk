package android.support.p010v4.p028k;

import android.os.AsyncTask;
import android.os.Build;

/* renamed from: android.support.v4.k.a */
public final class C0796a {
    private C0796a() {
    }

    /* renamed from: a */
    public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> m4070a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (asyncTask == null) {
            throw new IllegalArgumentException("task can not be null");
        }
        if (Build.VERSION.SDK_INT >= 11) {
            C0797b.m4071a(asyncTask, paramsArr);
        } else {
            asyncTask.execute(paramsArr);
        }
        return asyncTask;
    }
}
