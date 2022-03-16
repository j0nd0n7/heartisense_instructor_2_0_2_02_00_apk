package android.support.p010v4.p027j;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import java.net.DatagramSocket;

@C0007ae(mo1a = 24)
@TargetApi(24)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.j.g */
public class C0794g {
    /* renamed from: a */
    public static void m4059a(DatagramSocket datagramSocket) {
        TrafficStats.tagDatagramSocket(datagramSocket);
    }

    /* renamed from: b */
    public static void m4060b(DatagramSocket datagramSocket) {
        TrafficStats.untagDatagramSocket(datagramSocket);
    }
}
