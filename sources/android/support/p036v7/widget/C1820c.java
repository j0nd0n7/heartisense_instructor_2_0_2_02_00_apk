package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v7.widget.c */
class C1820c extends C1775b {
    public C1820c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(@C0047z Outline outline) {
        if (this.f5941a.f5066d) {
            if (this.f5941a.f5065c != null) {
                this.f5941a.f5065c.getOutline(outline);
            }
        } else if (this.f5941a.f5063a != null) {
            this.f5941a.f5063a.getOutline(outline);
        }
    }
}
