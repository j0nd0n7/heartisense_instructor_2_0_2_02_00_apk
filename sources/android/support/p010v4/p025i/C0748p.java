package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.media.browse.MediaBrowser;
import android.support.annotation.C0007ae;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.p */
class C0748p {

    /* renamed from: a */
    private static Constructor f2789a;

    static {
        try {
            f2789a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    C0748p() {
    }

    /* renamed from: a */
    static Object m3900a(List<MediaBrowser.MediaItem> list) {
        try {
            return f2789a.newInstance(new Object[]{list});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
