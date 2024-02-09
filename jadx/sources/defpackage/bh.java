package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.yh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: bh  reason: default package */
/* loaded from: classes.dex */
public class bh extends c0 {
    public final yh d;
    public final c e;
    public Context f;
    public xh g;
    public List<yh.i> h;
    public ImageButton i;
    public d j;
    public RecyclerView k;
    public boolean l;
    public yh.i m;
    public long n;
    public long o;
    public final Handler p;

    /* compiled from: AxisPay */
    /* renamed from: bh$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            bh.this.k((List) message.obj);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bh$b */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            bh.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bh$c */
    /* loaded from: classes.dex */
    public final class c extends yh.b {
        public c() {
        }

        @Override // defpackage.yh.b
        public void d(yh yhVar, yh.i iVar) {
            bh.this.g();
        }

        @Override // defpackage.yh.b
        public void e(yh yhVar, yh.i iVar) {
            bh.this.g();
        }

        @Override // defpackage.yh.b
        public void g(yh yhVar, yh.i iVar) {
            bh.this.g();
        }

        @Override // defpackage.yh.b
        public void h(yh yhVar, yh.i iVar) {
            bh.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bh$d */
    /* loaded from: classes.dex */
    public final class d extends RecyclerView.h<RecyclerView.d0> {
        public final ArrayList<b> d = new ArrayList<>();
        public final LayoutInflater e;
        public final Drawable f;
        public final Drawable g;
        public final Drawable h;
        public final Drawable i;

        /* compiled from: AxisPay */
        /* renamed from: bh$d$a */
        /* loaded from: classes.dex */
        public class a extends RecyclerView.d0 {
            public TextView v;

            public a(d dVar, View view) {
                super(view);
                this.v = (TextView) view.findViewById(ng.mr_picker_header_name);
            }

            public void O(b bVar) {
                this.v.setText(bVar.a().toString());
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: bh$d$b */
        /* loaded from: classes.dex */
        public class b {
            public final Object a;
            public final int b;

            public b(d dVar, Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof yh.i) {
                    this.b = 2;
                } else {
                    this.b = 0;
                    Log.w(C0059ao.a(4512), C0059ao.a(4513));
                }
            }

            public Object a() {
                return this.a;
            }

            public int b() {
                return this.b;
            }
        }

        /* compiled from: AxisPay */
        /* renamed from: bh$d$c */
        /* loaded from: classes.dex */
        public class c extends RecyclerView.d0 {
            public final View v;
            public final ImageView w;
            public final ProgressBar x;
            public final TextView y;

            /* compiled from: AxisPay */
            /* renamed from: bh$d$c$a */
            /* loaded from: classes.dex */
            public class a implements View.OnClickListener {
                public final /* synthetic */ yh.i b;

                public a(yh.i iVar) {
                    this.b = iVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    bh bhVar = bh.this;
                    yh.i iVar = this.b;
                    bhVar.m = iVar;
                    iVar.H();
                    c.this.w.setVisibility(4);
                    c.this.x.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.v = view;
                this.w = (ImageView) view.findViewById(ng.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(ng.mr_picker_route_progress_bar);
                this.x = progressBar;
                this.y = (TextView) view.findViewById(ng.mr_picker_route_name);
                dh.t(bh.this.f, progressBar);
            }

            public void O(b bVar) {
                yh.i iVar = (yh.i) bVar.a();
                this.v.setVisibility(0);
                this.x.setVisibility(4);
                this.v.setOnClickListener(new a(iVar));
                this.y.setText(iVar.l());
                this.w.setImageDrawable(d.this.x(iVar));
            }
        }

        public d() {
            this.e = LayoutInflater.from(bh.this.f);
            this.f = dh.g(bh.this.f);
            this.g = dh.q(bh.this.f);
            this.h = dh.m(bh.this.f);
            this.i = dh.n(bh.this.f);
            z();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int g(int i) {
            return this.d.get(i).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void l(RecyclerView.d0 d0Var, int i) {
            int g = g(i);
            b y = y(i);
            if (g == 1) {
                ((a) d0Var).O(y);
            } else if (g != 2) {
                Log.w(C0059ao.a(12550), C0059ao.a(12551));
            } else {
                ((c) d0Var).O(y);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.d0 n(ViewGroup viewGroup, int i) {
            if (i != 1) {
                if (i != 2) {
                    Log.w(C0059ao.a(12552), C0059ao.a(12553));
                    return null;
                }
                return new c(this.e.inflate(qg.mr_picker_route_item, viewGroup, false));
            }
            return new a(this, this.e.inflate(qg.mr_picker_header_item, viewGroup, false));
        }

        public final Drawable w(yh.i iVar) {
            int f = iVar.f();
            if (f != 1) {
                if (f != 2) {
                    if (iVar.x()) {
                        return this.i;
                    }
                    return this.f;
                }
                return this.h;
            }
            return this.g;
        }

        public Drawable x(yh.i iVar) {
            Uri i = iVar.i();
            if (i != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(bh.this.f.getContentResolver().openInputStream(i), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w(C0059ao.a(12555), C0059ao.a(12554) + i, e);
                }
            }
            return w(iVar);
        }

        public b y(int i) {
            return this.d.get(i);
        }

        public void z() {
            this.d.clear();
            this.d.add(new b(this, bh.this.f.getString(rg.mr_chooser_title)));
            for (yh.i iVar : bh.this.h) {
                this.d.add(new b(this, iVar));
            }
            j();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: bh$e */
    /* loaded from: classes.dex */
    public static final class e implements Comparator<yh.i> {
        public static final e b = new e();

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(yh.i iVar, yh.i iVar2) {
            return iVar.l().compareToIgnoreCase(iVar2.l());
        }
    }

    public bh(Context context) {
        this(context, 0);
    }

    public boolean e(yh.i iVar) {
        return !iVar.v() && iVar.w() && iVar.D(this.g);
    }

    public void f(List<yh.i> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!e(list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    public void g() {
        if (this.m == null && this.l) {
            ArrayList arrayList = new ArrayList(this.d.j());
            f(arrayList);
            Collections.sort(arrayList, e.b);
            if (SystemClock.uptimeMillis() - this.o >= this.n) {
                k(arrayList);
                return;
            }
            this.p.removeMessages(1);
            Handler handler = this.p;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.o + this.n);
        }
    }

    public void h(xh xhVar) {
        if (xhVar != null) {
            if (this.g.equals(xhVar)) {
                return;
            }
            this.g = xhVar;
            if (this.l) {
                this.d.o(this.e);
                this.d.b(xhVar, this.e, 1);
            }
            g();
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(1994));
    }

    public void j() {
        getWindow().setLayout(ah.c(this.f), ah.a(this.f));
    }

    public void k(List<yh.i> list) {
        this.o = SystemClock.uptimeMillis();
        this.h.clear();
        this.h.addAll(list);
        this.j.z();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
        this.d.b(this.g, this.e, 1);
        g();
    }

    @Override // defpackage.c0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qg.mr_picker_dialog);
        dh.s(this.f, this);
        this.h = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(ng.mr_picker_close_button);
        this.i = imageButton;
        imageButton.setOnClickListener(new b());
        this.j = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(ng.mr_picker_list);
        this.k = recyclerView;
        recyclerView.setAdapter(this.j);
        this.k.setLayoutManager(new LinearLayoutManager(this.f));
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = false;
        this.d.o(this.e);
        this.p.removeMessages(1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bh(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = defpackage.dh.b(r2, r3, r0)
            int r3 = defpackage.dh.c(r2)
            r1.<init>(r2, r3)
            xh r2 = defpackage.xh.c
            r1.g = r2
            bh$a r2 = new bh$a
            r2.<init>()
            r1.p = r2
            android.content.Context r2 = r1.getContext()
            yh r3 = defpackage.yh.g(r2)
            r1.d = r3
            bh$c r3 = new bh$c
            r3.<init>()
            r1.e = r3
            r1.f = r2
            android.content.res.Resources r2 = r2.getResources()
            int r3 = defpackage.og.mr_update_routes_delay_ms
            int r2 = r2.getInteger(r3)
            long r2 = (long) r2
            r1.n = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh.<init>(android.content.Context, int):void");
    }
}
