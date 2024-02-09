package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends f2 {
    public final AnimationDrawable d;
    public final AnimationDrawable e;
    public final String f;
    public final String g;
    public boolean h;
    public View.OnClickListener i;

    /* compiled from: AxisPay */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton.h;
            mediaRouteExpandCollapseButton.h = z;
            if (z) {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.d);
                MediaRouteExpandCollapseButton.this.d.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.g);
            } else {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.e);
                MediaRouteExpandCollapseButton.this.e.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f);
            }
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.i = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) t8.f(context, mg.mr_group_expand);
        this.d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) t8.f(context, mg.mr_group_collapse);
        this.e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(dh.f(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(rg.mr_controller_expand_group);
        this.f = string;
        this.g = context.getString(rg.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new a());
    }
}
