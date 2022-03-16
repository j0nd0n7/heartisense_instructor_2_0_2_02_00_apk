package android.support.p036v7.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.i */
public class C1534i implements Window.Callback {

    /* renamed from: e */
    final Window.Callback f4821e;

    public C1534i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f4821e = callback;
    }

    @C0007ae(mo1a = 12)
    @TargetApi(12)
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4821e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4821e.dispatchKeyEvent(keyEvent);
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f4821e.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4821e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4821e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4821e.dispatchTrackballEvent(motionEvent);
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    public void onActionModeFinished(ActionMode actionMode) {
        this.f4821e.onActionModeFinished(actionMode);
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    public void onActionModeStarted(ActionMode actionMode) {
        this.f4821e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f4821e.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f4821e.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f4821e.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f4821e.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f4821e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f4821e.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f4821e.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f4821e.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f4821e.onPreparePanel(i, view, menu);
    }

    @C0007ae(mo1a = 24)
    @TargetApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f4821e.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested() {
        return this.f4821e.onSearchRequested();
    }

    @C0007ae(mo1a = 23)
    @TargetApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f4821e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4821e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f4821e.onWindowFocusChanged(z);
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f4821e.onWindowStartingActionMode(callback);
    }

    @C0007ae(mo1a = 23)
    @TargetApi(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f4821e.onWindowStartingActionMode(callback, i);
    }
}
