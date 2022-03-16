package android.support.p010v4.p028k;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.k.b */
class C0797b {
    C0797b() {
    }

    /* renamed from: a */
    static <Params, Progress, Result> void m4071a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
