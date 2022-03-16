package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.C0007ae;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.w */
public class C1864w extends SeekBar {

    /* renamed from: a */
    private C1865x f6332a;

    public C1864w(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1864w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.seekBarStyle);
    }

    public C1864w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6332a = new C1865x(this);
        this.f6332a.mo7488a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6332a.mo7504f();
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f6332a.mo7503e();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6332a.mo7497a(canvas);
    }
}
