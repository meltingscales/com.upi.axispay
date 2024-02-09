package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: AxisPay */
/* renamed from: fj  reason: default package */
/* loaded from: classes.dex */
public class fj extends eb {
    public final RecyclerView d;
    public final a e;

    /* compiled from: AxisPay */
    /* renamed from: fj$a */
    /* loaded from: classes.dex */
    public static class a extends eb {
        public final fj d;
        public Map<View, eb> e = new WeakHashMap();

        public a(fj fjVar) {
            this.d = fjVar;
        }

        @Override // defpackage.eb
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            eb ebVar = this.e.get(view);
            if (ebVar != null) {
                return ebVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // defpackage.eb
        public mc b(View view) {
            eb ebVar = this.e.get(view);
            if (ebVar != null) {
                return ebVar.b(view);
            }
            return super.b(view);
        }

        @Override // defpackage.eb
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            eb ebVar = this.e.get(view);
            if (ebVar != null) {
                ebVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // defpackage.eb
        public void g(View view, lc lcVar) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().O0(view, lcVar);
                eb ebVar = this.e.get(view);
                if (ebVar != null) {
                    ebVar.g(view, lcVar);
                    return;
                } else {
                    super.g(view, lcVar);
                    return;
                }
            }
            super.g(view, lcVar);
        }

        @Override // defpackage.eb
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            eb ebVar = this.e.get(view);
            if (ebVar != null) {
                ebVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // defpackage.eb
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            eb ebVar = this.e.get(viewGroup);
            if (ebVar != null) {
                return ebVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.eb
        public boolean j(View view, int i, Bundle bundle) {
            if (!this.d.o() && this.d.d.getLayoutManager() != null) {
                eb ebVar = this.e.get(view);
                if (ebVar != null) {
                    if (ebVar.j(view, i, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i, bundle)) {
                    return true;
                }
                return this.d.d.getLayoutManager().i1(view, i, bundle);
            }
            return super.j(view, i, bundle);
        }

        @Override // defpackage.eb
        public void l(View view, int i) {
            eb ebVar = this.e.get(view);
            if (ebVar != null) {
                ebVar.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // defpackage.eb
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            eb ebVar = this.e.get(view);
            if (ebVar != null) {
                ebVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public eb n(View view) {
            return this.e.remove(view);
        }

        public void o(View view) {
            eb l = ac.l(view);
            if (l == null || l == this) {
                return;
            }
            this.e.put(view, l);
        }
    }

    public fj(RecyclerView recyclerView) {
        this.d = recyclerView;
        eb n = n();
        if (n != null && (n instanceof a)) {
            this.e = (a) n;
        } else {
            this.e = new a(this);
        }
    }

    @Override // defpackage.eb
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // defpackage.eb
    public void g(View view, lc lcVar) {
        super.g(view, lcVar);
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().M0(lcVar);
    }

    @Override // defpackage.eb
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().g1(i, bundle);
    }

    public eb n() {
        return this.e;
    }

    public boolean o() {
        return this.d.hasPendingAdapterUpdates();
    }
}
