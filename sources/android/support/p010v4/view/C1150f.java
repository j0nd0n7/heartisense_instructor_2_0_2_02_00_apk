package android.support.p010v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.C0003aa;
import android.support.annotation.C0019an;
import android.support.annotation.C0044w;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0896n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: android.support.v4.view.f */
public final class C1150f {

    /* renamed from: d */
    private static final String f3561d = "AsyncLayoutInflater";

    /* renamed from: a */
    LayoutInflater f3562a;

    /* renamed from: b */
    Handler f3563b;

    /* renamed from: c */
    C1154c f3564c;

    /* renamed from: e */
    private Handler.Callback f3565e = new Handler.Callback() {
        public boolean handleMessage(Message message) {
            C1153b bVar = (C1153b) message.obj;
            if (bVar.f3571d == null) {
                bVar.f3571d = C1150f.this.f3562a.inflate(bVar.f3570c, bVar.f3569b, false);
            }
            bVar.f3572e.mo3980a(bVar.f3571d, bVar.f3570c, bVar.f3569b);
            C1150f.this.f3564c.mo3976a(bVar);
            return true;
        }
    };

    /* renamed from: android.support.v4.view.f$a */
    private static class C1152a extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f3567a = {"android.widget.", "android.webkit.", "android.app."};

        C1152a(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new C1152a(context);
        }

        /* access modifiers changed from: protected */
        public View onCreateView(String str, AttributeSet attributeSet) {
            String[] strArr = f3567a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException e) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: android.support.v4.view.f$b */
    private static class C1153b {

        /* renamed from: a */
        C1150f f3568a;

        /* renamed from: b */
        ViewGroup f3569b;

        /* renamed from: c */
        int f3570c;

        /* renamed from: d */
        View f3571d;

        /* renamed from: e */
        C1155d f3572e;

        C1153b() {
        }
    }

    /* renamed from: android.support.v4.view.f$c */
    private static class C1154c extends Thread {

        /* renamed from: a */
        private static final C1154c f3573a = new C1154c();

        /* renamed from: b */
        private ArrayBlockingQueue<C1153b> f3574b = new ArrayBlockingQueue<>(10);

        /* renamed from: c */
        private C0896n.C0899c<C1153b> f3575c = new C0896n.C0899c<>(10);

        static {
            f3573a.start();
        }

        private C1154c() {
        }

        /* renamed from: a */
        public static C1154c m6950a() {
            return f3573a;
        }

        /* renamed from: a */
        public void mo3976a(C1153b bVar) {
            bVar.f3572e = null;
            bVar.f3568a = null;
            bVar.f3569b = null;
            bVar.f3570c = 0;
            bVar.f3571d = null;
            this.f3575c.mo2959a(bVar);
        }

        /* renamed from: b */
        public C1153b mo3977b() {
            C1153b a = this.f3575c.mo2958a();
            return a == null ? new C1153b() : a;
        }

        /* renamed from: b */
        public void mo3978b(C1153b bVar) {
            try {
                this.f3574b.put(bVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public void run() {
            while (true) {
                try {
                    C1153b take = this.f3574b.take();
                    try {
                        take.f3571d = take.f3568a.f3562a.inflate(take.f3570c, take.f3569b, false);
                    } catch (RuntimeException e) {
                        Log.w(C1150f.f3561d, "Failed to inflate resource in the background! Retrying on the UI thread", e);
                    }
                    Message.obtain(take.f3568a.f3563b, 0, take).sendToTarget();
                } catch (InterruptedException e2) {
                    Log.w(C1150f.f3561d, e2);
                }
            }
        }
    }

    /* renamed from: android.support.v4.view.f$d */
    public interface C1155d {
        /* renamed from: a */
        void mo3980a(View view, int i, ViewGroup viewGroup);
    }

    public C1150f(@C0047z Context context) {
        this.f3562a = new C1152a(context);
        this.f3563b = new Handler(this.f3565e);
        this.f3564c = C1154c.m6950a();
    }

    @C0019an
    /* renamed from: a */
    public void mo3972a(@C0044w int i, @C0003aa ViewGroup viewGroup, @C0047z C1155d dVar) {
        if (dVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        C1153b b = this.f3564c.mo3977b();
        b.f3568a = this;
        b.f3570c = i;
        b.f3569b = viewGroup;
        b.f3572e = dVar;
        this.f3564c.mo3978b(b);
    }
}
