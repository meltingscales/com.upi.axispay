package myunmn;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public class R implements AccessibilityManager.AccessibilityStateChangeListener {
    public static native void a(boolean z);

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        a(z);
    }
}
