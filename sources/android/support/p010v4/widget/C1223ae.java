package android.support.p010v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.ae */
public abstract class C1223ae extends C1302h {

    /* renamed from: l */
    private int f3790l;

    /* renamed from: m */
    private int f3791m;

    /* renamed from: n */
    private LayoutInflater f3792n;

    @Deprecated
    public C1223ae(Context context, int i, Cursor cursor) {
        super(context, cursor);
        this.f3791m = i;
        this.f3790l = i;
        this.f3792n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public C1223ae(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f3791m = i;
        this.f3790l = i;
        this.f3792n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public C1223ae(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f3791m = i;
        this.f3790l = i;
        this.f3792n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo4119a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3792n.inflate(this.f3790l, viewGroup, false);
    }

    /* renamed from: a */
    public void mo4120a(int i) {
        this.f3790l = i;
    }

    /* renamed from: b */
    public View mo4121b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3792n.inflate(this.f3791m, viewGroup, false);
    }

    /* renamed from: b */
    public void mo4122b(int i) {
        this.f3791m = i;
    }
}
