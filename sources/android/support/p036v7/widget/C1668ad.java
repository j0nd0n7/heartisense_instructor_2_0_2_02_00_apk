package android.support.p036v7.widget;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p036v7.view.menu.C1567p;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ad */
public interface C1668ad {
    /* renamed from: a */
    void mo5633a(int i);

    /* renamed from: a */
    void mo5634a(SparseArray<Parcelable> sparseArray);

    /* renamed from: a */
    void mo5635a(Menu menu, C1567p.C1568a aVar);

    /* renamed from: b */
    void mo5638b(SparseArray<Parcelable> sparseArray);

    /* renamed from: f */
    boolean mo5644f();

    /* renamed from: g */
    boolean mo5646g();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo5652h();

    /* renamed from: i */
    boolean mo5653i();

    /* renamed from: j */
    boolean mo5654j();

    /* renamed from: k */
    boolean mo5655k();

    /* renamed from: l */
    boolean mo5656l();

    /* renamed from: m */
    void mo5657m();

    /* renamed from: n */
    void mo5658n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setLogo(int i);

    void setUiOptions(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
