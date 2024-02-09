package myunmn;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: myunmn.aw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class View$OnTouchListenerC0067aw implements View.OnTouchListener {
    public final /* synthetic */ C0071b a;

    public View$OnTouchListenerC0067aw(C0071b c0071b) {
        this.a = c0071b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Boolean bool;
        this.a.c(false);
        this.a.n();
        bool = this.a.o;
        if (bool.booleanValue()) {
            view.requestFocus();
            return true;
        }
        return false;
    }
}
