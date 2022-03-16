package android.support.p036v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p036v7.p038b.p039a.C1477b;
import android.widget.ImageView;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.p */
public class C1856p {

    /* renamed from: a */
    private final ImageView f6315a;

    public C1856p(ImageView imageView) {
        this.f6315a = imageView;
    }

    /* renamed from: a */
    public void mo7468a(int i) {
        if (i != 0) {
            Drawable b = C1477b.m8692b(this.f6315a.getContext(), i);
            if (b != null) {
                C1683ah.m10101b(b);
            }
            this.f6315a.setImageDrawable(b);
            return;
        }
        this.f6315a.setImageDrawable((Drawable) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = android.support.p036v7.widget.C1807bp.m10923a(r6.f6315a.getContext(), r7, android.support.p036v7.p037a.C1359b.C1371l.AppCompatImageView, r8, 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7469a(android.util.AttributeSet r7, int r8) {
        /*
            r6 = this;
            r5 = -1
            r1 = 0
            android.widget.ImageView r0 = r6.f6315a     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0031
            android.widget.ImageView r2 = r6.f6315a     // Catch:{ all -> 0x003c }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x003c }
            int[] r3 = android.support.p036v7.p037a.C1359b.C1371l.AppCompatImageView     // Catch:{ all -> 0x003c }
            r4 = 0
            android.support.v7.widget.bp r1 = android.support.p036v7.widget.C1807bp.m10923a(r2, r7, r3, r8, r4)     // Catch:{ all -> 0x003c }
            int r2 = android.support.p036v7.p037a.C1359b.C1371l.AppCompatImageView_srcCompat     // Catch:{ all -> 0x003c }
            r3 = -1
            int r2 = r1.mo7312g(r2, r3)     // Catch:{ all -> 0x003c }
            if (r2 == r5) goto L_0x0031
            android.widget.ImageView r0 = r6.f6315a     // Catch:{ all -> 0x003c }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r0 = android.support.p036v7.p038b.p039a.C1477b.m8692b(r0, r2)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0031
            android.widget.ImageView r2 = r6.f6315a     // Catch:{ all -> 0x003c }
            r2.setImageDrawable(r0)     // Catch:{ all -> 0x003c }
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            android.support.p036v7.widget.C1683ah.m10101b(r0)     // Catch:{ all -> 0x003c }
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.mo7308e()
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0042
            r1.mo7308e()
        L_0x0042:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1856p.mo7469a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7470a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f6315a.getBackground() instanceof RippleDrawable);
    }
}
