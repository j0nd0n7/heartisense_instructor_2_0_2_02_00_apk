package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v7.widget.b */
class C1775b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f5941a;

    public C1775b(ActionBarContainer actionBarContainer) {
        this.f5941a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f5941a.f5066d) {
            if (this.f5941a.f5063a != null) {
                this.f5941a.f5063a.draw(canvas);
            }
            if (this.f5941a.f5064b != null && this.f5941a.f5067e) {
                this.f5941a.f5064b.draw(canvas);
            }
        } else if (this.f5941a.f5065c != null) {
            this.f5941a.f5065c.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
