package android.support.p010v4.p027j;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.ParcelFileDescriptor;
import android.support.annotation.C0007ae;
import java.net.DatagramSocket;
import java.net.Socket;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.j.h */
class C0795h {
    C0795h() {
    }

    /* renamed from: a */
    public static void m4061a() {
        TrafficStats.clearThreadStatsTag();
    }

    /* renamed from: a */
    public static void m4062a(int i) {
        TrafficStats.incrementOperationCount(i);
    }

    /* renamed from: a */
    public static void m4063a(int i, int i2) {
        TrafficStats.incrementOperationCount(i, i2);
    }

    /* renamed from: a */
    public static void m4064a(DatagramSocket datagramSocket) {
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.tagSocket(new C0785e(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    /* renamed from: a */
    public static void m4065a(Socket socket) {
        TrafficStats.tagSocket(socket);
    }

    /* renamed from: b */
    public static int m4066b() {
        return TrafficStats.getThreadStatsTag();
    }

    /* renamed from: b */
    public static void m4067b(int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    /* renamed from: b */
    public static void m4068b(DatagramSocket datagramSocket) {
        ParcelFileDescriptor fromDatagramSocket = ParcelFileDescriptor.fromDatagramSocket(datagramSocket);
        TrafficStats.untagSocket(new C0785e(datagramSocket, fromDatagramSocket.getFileDescriptor()));
        fromDatagramSocket.detachFd();
    }

    /* renamed from: b */
    public static void m4069b(Socket socket) {
        TrafficStats.untagSocket(socket);
    }
}
