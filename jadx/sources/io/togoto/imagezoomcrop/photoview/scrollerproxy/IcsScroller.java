package io.togoto.imagezoomcrop.photoview.scrollerproxy;

import android.annotation.TargetApi;
import android.content.Context;

/* compiled from: AxisPay */
@TargetApi(14)
/* loaded from: classes.dex */
public class IcsScroller extends GingerScroller {
    public IcsScroller(Context context) {
        super(context);
    }

    @Override // io.togoto.imagezoomcrop.photoview.scrollerproxy.GingerScroller, io.togoto.imagezoomcrop.photoview.scrollerproxy.ScrollerProxy
    public boolean computeScrollOffset() {
        return this.mScroller.computeScrollOffset();
    }
}
