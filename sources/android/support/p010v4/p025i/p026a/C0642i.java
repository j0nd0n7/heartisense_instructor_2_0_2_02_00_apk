package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Bundle;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.i.a.i */
class C0642i {

    /* renamed from: A */
    private static final String f2450A = "android.media.metadata.ALBUM";

    /* renamed from: B */
    private static final String f2451B = "android.media.metadata.AUTHOR";

    /* renamed from: C */
    private static final String f2452C = "android.media.metadata.WRITER";

    /* renamed from: D */
    private static final String f2453D = "android.media.metadata.COMPOSER";

    /* renamed from: E */
    private static final String f2454E = "android.media.metadata.COMPILATION";

    /* renamed from: F */
    private static final String f2455F = "android.media.metadata.DATE";

    /* renamed from: G */
    private static final String f2456G = "android.media.metadata.GENRE";

    /* renamed from: H */
    private static final String f2457H = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: I */
    private static final String f2458I = "android.media.metadata.DISC_NUMBER";

    /* renamed from: J */
    private static final String f2459J = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: a */
    static final int f2460a = 0;

    /* renamed from: b */
    static final int f2461b = 0;

    /* renamed from: c */
    static final int f2462c = 1;

    /* renamed from: d */
    static final int f2463d = 2;

    /* renamed from: e */
    static final int f2464e = 3;

    /* renamed from: f */
    static final int f2465f = 4;

    /* renamed from: g */
    static final int f2466g = 5;

    /* renamed from: h */
    static final int f2467h = 6;

    /* renamed from: i */
    static final int f2468i = 7;

    /* renamed from: j */
    static final int f2469j = 8;

    /* renamed from: k */
    static final int f2470k = 9;

    /* renamed from: l */
    static final int f2471l = 10;

    /* renamed from: m */
    static final int f2472m = 11;

    /* renamed from: n */
    private static final long f2473n = 1;

    /* renamed from: o */
    private static final long f2474o = 2;

    /* renamed from: p */
    private static final long f2475p = 4;

    /* renamed from: q */
    private static final long f2476q = 8;

    /* renamed from: r */
    private static final long f2477r = 16;

    /* renamed from: s */
    private static final long f2478s = 32;

    /* renamed from: t */
    private static final long f2479t = 64;

    /* renamed from: u */
    private static final long f2480u = 512;

    /* renamed from: v */
    private static final String f2481v = "android.media.metadata.ART";

    /* renamed from: w */
    private static final String f2482w = "android.media.metadata.ALBUM_ART";

    /* renamed from: x */
    private static final String f2483x = "android.media.metadata.TITLE";

    /* renamed from: y */
    private static final String f2484y = "android.media.metadata.ARTIST";

    /* renamed from: z */
    private static final String f2485z = "android.media.metadata.DURATION";

    C0642i() {
    }

    /* renamed from: a */
    static int m3569a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
            case 8:
                return 8;
            case 7:
                return 9;
            case 9:
                return 7;
            case 10:
            case 11:
                return 6;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    static int m3570a(long j) {
        int i = 0;
        if ((1 & j) != 0) {
            i = 32;
        }
        if ((2 & j) != 0) {
            i |= 16;
        }
        if ((4 & j) != 0) {
            i |= 4;
        }
        if ((8 & j) != 0) {
            i |= 2;
        }
        if ((16 & j) != 0) {
            i |= 1;
        }
        if ((32 & j) != 0) {
            i |= 128;
        }
        if ((64 & j) != 0) {
            i |= 64;
        }
        return (512 & j) != 0 ? i | 8 : i;
    }

    /* renamed from: a */
    public static Object m3571a(PendingIntent pendingIntent) {
        return new RemoteControlClient(pendingIntent);
    }

    /* renamed from: a */
    public static void m3572a(Context context, Object obj) {
        ((AudioManager) context.getSystemService("audio")).registerRemoteControlClient((RemoteControlClient) obj);
    }

    /* renamed from: a */
    static void m3573a(Bundle bundle, RemoteControlClient.MetadataEditor metadataEditor) {
        if (bundle != null) {
            if (bundle.containsKey("android.media.metadata.ART")) {
                metadataEditor.putBitmap(100, (Bitmap) bundle.getParcelable("android.media.metadata.ART"));
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                metadataEditor.putBitmap(100, (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                metadataEditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                metadataEditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                metadataEditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                metadataEditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                metadataEditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                metadataEditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                metadataEditor.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                metadataEditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                metadataEditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                metadataEditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                metadataEditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                metadataEditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                metadataEditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
        }
    }

    /* renamed from: a */
    public static void m3574a(Object obj, int i) {
        ((RemoteControlClient) obj).setPlaybackState(m3569a(i));
    }

    /* renamed from: a */
    public static void m3575a(Object obj, long j) {
        ((RemoteControlClient) obj).setTransportControlFlags(m3570a(j));
    }

    /* renamed from: a */
    public static void m3576a(Object obj, Bundle bundle) {
        RemoteControlClient.MetadataEditor editMetadata = ((RemoteControlClient) obj).editMetadata(true);
        m3573a(bundle, editMetadata);
        editMetadata.apply();
    }

    /* renamed from: b */
    public static void m3577b(Context context, Object obj) {
        ((AudioManager) context.getSystemService("audio")).unregisterRemoteControlClient((RemoteControlClient) obj);
    }
}
