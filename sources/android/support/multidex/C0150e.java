package android.support.multidex;

import android.support.p010v4.p025i.p026a.C0662q;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: android.support.multidex.e */
final class C0150e {

    /* renamed from: a */
    private static final int f1033a = 22;

    /* renamed from: b */
    private static final int f1034b = 101010256;

    /* renamed from: c */
    private static final int f1035c = 16384;

    /* renamed from: android.support.multidex.e$a */
    static class C0151a {

        /* renamed from: a */
        long f1036a;

        /* renamed from: b */
        long f1037b;

        C0151a() {
        }
    }

    C0150e() {
    }

    /* renamed from: a */
    static long m756a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m757a(randomAccessFile, m758a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static long m757a(RandomAccessFile randomAccessFile, C0151a aVar) {
        CRC32 crc32 = new CRC32();
        long j = aVar.f1037b;
        randomAccessFile.seek(aVar.f1036a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(C0662q.f2540o, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(C0662q.f2540o, j));
        }
        return crc32.getValue();
    }

    /* renamed from: a */
    static C0151a m758a(RandomAccessFile randomAccessFile) {
        long j = 0;
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - C0662q.f2542q;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(f1034b);
        long j3 = length;
        do {
            randomAccessFile.seek(j3);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C0151a aVar = new C0151a();
                aVar.f1037b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f1036a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            j3--;
        } while (j3 >= j);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
