package myunmn;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: myunmn.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class Window$CallbackC0080k implements Window.Callback {
    private final Window.Callback a;

    public Window$CallbackC0080k(Window.Callback callback) {
        this.a = callback;
    }

    public native ActionMode a(ActionMode.Callback callback, int i, Window.Callback callback2);

    public native ActionMode a(ActionMode.Callback callback, Window.Callback callback2);

    public native View a(int i, Window.Callback callback);

    public native void a(int i, Menu menu, Window.Callback callback);

    public native void a(ActionMode actionMode, Window.Callback callback);

    public native void a(Window.Callback callback);

    public native void a(WindowManager.LayoutParams layoutParams, Window.Callback callback);

    public native void a(boolean z, Window.Callback callback);

    public native boolean a(int i, MenuItem menuItem, Window.Callback callback);

    public native boolean a(int i, View view, Menu menu, Window.Callback callback);

    public native boolean a(KeyEvent keyEvent, Window.Callback callback);

    public native boolean a(MotionEvent motionEvent, Window.Callback callback);

    public native boolean a(SearchEvent searchEvent, Window.Callback callback);

    public native boolean a(AccessibilityEvent accessibilityEvent, Window.Callback callback);

    public native void b(ActionMode actionMode, Window.Callback callback);

    public native void b(Window.Callback callback);

    public native boolean b(int i, Menu menu, Window.Callback callback);

    public native boolean b(KeyEvent keyEvent, Window.Callback callback);

    public native boolean b(MotionEvent motionEvent, Window.Callback callback);

    public native void c(Window.Callback callback);

    public native boolean c(int i, Menu menu, Window.Callback callback);

    public native boolean c(MotionEvent motionEvent, Window.Callback callback);

    public native boolean d(Window.Callback callback);

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return b(motionEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return b(keyEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return a(accessibilityEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return c(motionEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return a(motionEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        a(actionMode, this.a);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        b(actionMode, this.a);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        c(this.a);
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        a(this.a);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return b(i, menu, this.a);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return a(i, this.a);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        b(this.a);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return a(i, menuItem, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return c(i, menu, this.a);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        a(i, menu, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return a(i, view, menu, this.a);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return d(this.a);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a(searchEvent, this.a);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        a(layoutParams, this.a);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        a(z, this.a);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return a(callback, this.a);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return a(callback, i, this.a);
    }
}
