package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: zd  reason: default package */
/* loaded from: classes.dex */
public class zd implements LayoutInflater.Factory2 {
    public final FragmentManager b;

    /* compiled from: AxisPay */
    /* renamed from: zd$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ ge b;

        public a(ge geVar) {
            this.b = geVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k = this.b.k();
            this.b.m();
            pe.n((ViewGroup) k.mView.getParent(), zd.this.b).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public zd(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ge x;
        if (vd.class.getName().equals(str)) {
            return new vd(context, attributeSet, this.b);
        }
        if (C0059ao.a(8927).equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, C0059ao.a(8928));
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, od.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(od.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(od.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(od.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !xd.b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id = view != null ? view.getId() : 0;
            if (id == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + C0059ao.a(8929) + attributeValue);
            }
            Fragment i0 = resourceId != -1 ? this.b.i0(resourceId) : null;
            if (i0 == null && string != null) {
                i0 = this.b.j0(string);
            }
            if (i0 == null && id != -1) {
                i0 = this.b.i0(id);
            }
            String a2 = C0059ao.a(8930);
            if (i0 == null) {
                i0 = this.b.t0().a(context.getClassLoader(), attributeValue);
                i0.mFromLayout = true;
                i0.mFragmentId = resourceId != 0 ? resourceId : id;
                i0.mContainerId = id;
                i0.mTag = string;
                i0.mInLayout = true;
                FragmentManager fragmentManager = this.b;
                i0.mFragmentManager = fragmentManager;
                i0.mHost = fragmentManager.w0();
                i0.onInflate(this.b.w0().g(), attributeSet, i0.mSavedFragmentState);
                x = this.b.g(i0);
                if (FragmentManager.I0(2)) {
                    String str2 = a2 + i0 + C0059ao.a(8931) + Integer.toHexString(resourceId);
                }
            } else if (!i0.mInLayout) {
                i0.mInLayout = true;
                FragmentManager fragmentManager2 = this.b;
                i0.mFragmentManager = fragmentManager2;
                i0.mHost = fragmentManager2.w0();
                i0.onInflate(this.b.w0().g(), attributeSet, i0.mSavedFragmentState);
                x = this.b.x(i0);
                if (FragmentManager.I0(2)) {
                    String str3 = C0059ao.a(8932) + i0 + C0059ao.a(8933) + Integer.toHexString(resourceId);
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + C0059ao.a(8935) + Integer.toHexString(resourceId) + C0059ao.a(8936) + string + C0059ao.a(8937) + Integer.toHexString(id) + C0059ao.a(8938) + attributeValue);
            }
            i0.mContainer = (ViewGroup) view;
            x.m();
            x.j();
            View view2 = i0.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (i0.mView.getTag() == null) {
                    i0.mView.setTag(string);
                }
                i0.mView.addOnAttachStateChangeListener(new a(x));
                return i0.mView;
            }
            throw new IllegalStateException(a2 + attributeValue + C0059ao.a(8934));
        }
        return null;
    }
}
