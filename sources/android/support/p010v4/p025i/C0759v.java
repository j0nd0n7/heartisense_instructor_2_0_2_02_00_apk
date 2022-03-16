package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.support.annotation.C0007ae;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.i.v */
class C0759v {

    /* renamed from: a */
    final Context f2824a;

    /* renamed from: b */
    final AudioManager f2825b;

    /* renamed from: c */
    final View f2826c;

    /* renamed from: d */
    final C0758u f2827d;

    /* renamed from: e */
    final String f2828e;

    /* renamed from: f */
    final IntentFilter f2829f;

    /* renamed from: g */
    final Intent f2830g;

    /* renamed from: h */
    final ViewTreeObserver.OnWindowAttachListener f2831h = new ViewTreeObserver.OnWindowAttachListener() {
        public void onWindowAttached() {
            C0759v.this.mo2597c();
        }

        public void onWindowDetached() {
            C0759v.this.mo2605k();
        }
    };

    /* renamed from: i */
    final ViewTreeObserver.OnWindowFocusChangeListener f2832i = new ViewTreeObserver.OnWindowFocusChangeListener() {
        public void onWindowFocusChanged(boolean z) {
            if (z) {
                C0759v.this.mo2598d();
            } else {
                C0759v.this.mo2604j();
            }
        }
    };

    /* renamed from: j */
    final BroadcastReceiver f2833j = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                C0759v.this.f2827d.mo2589a((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (ClassCastException e) {
                Log.w("TransportController", e);
            }
        }
    };

    /* renamed from: k */
    AudioManager.OnAudioFocusChangeListener f2834k = new AudioManager.OnAudioFocusChangeListener() {
        public void onAudioFocusChange(int i) {
            C0759v.this.f2827d.mo2587a(i);
        }
    };

    /* renamed from: l */
    final RemoteControlClient.OnGetPlaybackPositionListener f2835l = new RemoteControlClient.OnGetPlaybackPositionListener() {
        public long onGetPlaybackPosition() {
            return C0759v.this.f2827d.mo2586a();
        }
    };

    /* renamed from: m */
    final RemoteControlClient.OnPlaybackPositionUpdateListener f2836m = new RemoteControlClient.OnPlaybackPositionUpdateListener() {
        public void onPlaybackPositionUpdate(long j) {
            C0759v.this.f2827d.mo2588a(j);
        }
    };

    /* renamed from: n */
    PendingIntent f2837n;

    /* renamed from: o */
    RemoteControlClient f2838o;

    /* renamed from: p */
    boolean f2839p;

    /* renamed from: q */
    int f2840q = 0;

    /* renamed from: r */
    boolean f2841r;

    public C0759v(Context context, AudioManager audioManager, View view, C0758u uVar) {
        this.f2824a = context;
        this.f2825b = audioManager;
        this.f2826c = view;
        this.f2827d = uVar;
        this.f2828e = context.getPackageName() + ":transport:" + System.identityHashCode(this);
        this.f2830g = new Intent(this.f2828e);
        this.f2830g.setPackage(context.getPackageName());
        this.f2829f = new IntentFilter();
        this.f2829f.addAction(this.f2828e);
        this.f2826c.getViewTreeObserver().addOnWindowAttachListener(this.f2831h);
        this.f2826c.getViewTreeObserver().addOnWindowFocusChangeListener(this.f2832i);
    }

    /* renamed from: a */
    public Object mo2594a() {
        return this.f2838o;
    }

    /* renamed from: a */
    public void mo2595a(boolean z, long j, int i) {
        if (this.f2838o != null) {
            this.f2838o.setPlaybackState(z ? 3 : 1, j, z ? 1.0f : 0.0f);
            this.f2838o.setTransportControlFlags(i);
        }
    }

    /* renamed from: b */
    public void mo2596b() {
        mo2605k();
        this.f2826c.getViewTreeObserver().removeOnWindowAttachListener(this.f2831h);
        this.f2826c.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f2832i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2597c() {
        this.f2824a.registerReceiver(this.f2833j, this.f2829f);
        this.f2837n = PendingIntent.getBroadcast(this.f2824a, 0, this.f2830g, 268435456);
        this.f2838o = new RemoteControlClient(this.f2837n);
        this.f2838o.setOnGetPlaybackPositionListener(this.f2835l);
        this.f2838o.setPlaybackPositionUpdateListener(this.f2836m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo2598d() {
        if (!this.f2839p) {
            this.f2839p = true;
            this.f2825b.registerMediaButtonEventReceiver(this.f2837n);
            this.f2825b.registerRemoteControlClient(this.f2838o);
            if (this.f2840q == 3) {
                mo2599e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2599e() {
        if (!this.f2841r) {
            this.f2841r = true;
            this.f2825b.requestAudioFocus(this.f2834k, 3, 1);
        }
    }

    /* renamed from: f */
    public void mo2600f() {
        if (this.f2840q != 3) {
            this.f2840q = 3;
            this.f2838o.setPlaybackState(3);
        }
        if (this.f2839p) {
            mo2599e();
        }
    }

    /* renamed from: g */
    public void mo2601g() {
        if (this.f2840q == 3) {
            this.f2840q = 2;
            this.f2838o.setPlaybackState(2);
        }
        mo2603i();
    }

    /* renamed from: h */
    public void mo2602h() {
        if (this.f2840q != 1) {
            this.f2840q = 1;
            this.f2838o.setPlaybackState(1);
        }
        mo2603i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2603i() {
        if (this.f2841r) {
            this.f2841r = false;
            this.f2825b.abandonAudioFocus(this.f2834k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2604j() {
        mo2603i();
        if (this.f2839p) {
            this.f2839p = false;
            this.f2825b.unregisterRemoteControlClient(this.f2838o);
            this.f2825b.unregisterMediaButtonEventReceiver(this.f2837n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2605k() {
        mo2604j();
        if (this.f2837n != null) {
            this.f2824a.unregisterReceiver(this.f2833j);
            this.f2837n.cancel();
            this.f2837n = null;
            this.f2838o = null;
        }
    }
}
