package android.support.p010v4.p027j;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* renamed from: android.support.v4.j.e */
class C0785e extends Socket {

    /* renamed from: android.support.v4.j.e$a */
    private static class C0786a extends SocketImpl {
        public C0786a(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
            this.localport = datagramSocket.getLocalPort();
            this.fd = fileDescriptor;
        }

        /* access modifiers changed from: protected */
        public void accept(SocketImpl socketImpl) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public int available() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void bind(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void close() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void connect(String str, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void connect(InetAddress inetAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void connect(SocketAddress socketAddress, int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void create(boolean z) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public InputStream getInputStream() {
            throw new UnsupportedOperationException();
        }

        public Object getOption(int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public OutputStream getOutputStream() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void listen(int i) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public void sendUrgentData(int i) {
            throw new UnsupportedOperationException();
        }

        public void setOption(int i, Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public C0785e(DatagramSocket datagramSocket, FileDescriptor fileDescriptor) {
        super(new C0786a(datagramSocket, fileDescriptor));
    }
}
