package myunmn;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: myunmn.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0074e extends View.AccessibilityDelegate {
    private final View.AccessibilityDelegate a;

    public C0074e(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
    }

    public native AccessibilityNodeProvider a(View view, View.AccessibilityDelegate accessibilityDelegate);

    public native void a(View view, int i, View.AccessibilityDelegate accessibilityDelegate);

    public native void a(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

    public native void a(View view, AccessibilityNodeInfo accessibilityNodeInfo, View.AccessibilityDelegate accessibilityDelegate);

    public native void a(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle, View.AccessibilityDelegate accessibilityDelegate);

    public native boolean a(View view, int i, Bundle bundle, View.AccessibilityDelegate accessibilityDelegate);

    public native boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        a(view, accessibilityNodeInfo, str, bundle, this.a);
    }

    public native void b(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

    public native boolean c(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

    public native void d(View view, AccessibilityEvent accessibilityEvent, View.AccessibilityDelegate accessibilityDelegate);

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return c(view, accessibilityEvent, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        return a(view, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        b(view, accessibilityEvent, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        a(view, accessibilityNodeInfo, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        a(view, accessibilityEvent, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return a(viewGroup, view, accessibilityEvent, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return a(view, i, bundle, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View view, int i) {
        a(view, i, this.a);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        d(view, accessibilityEvent, this.a);
    }
}
