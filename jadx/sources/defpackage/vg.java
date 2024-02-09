package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.yh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: vg  reason: default package */
/* loaded from: classes.dex */
public class vg extends c0 {
    public final yh d;
    public final b e;
    public TextView f;
    public xh g;
    public ArrayList<yh.i> h;
    public c i;
    public ListView j;
    public boolean k;
    public long l;
    public final Handler m;

    /* compiled from: AxisPay */
    /* renamed from: vg$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            vg.this.k((List) message.obj);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vg$b */
    /* loaded from: classes.dex */
    public final class b extends yh.b {
        public b() {
        }

        @Override // defpackage.yh.b
        public void d(yh yhVar, yh.i iVar) {
            vg.this.g();
        }

        @Override // defpackage.yh.b
        public void e(yh yhVar, yh.i iVar) {
            vg.this.g();
        }

        @Override // defpackage.yh.b
        public void g(yh yhVar, yh.i iVar) {
            vg.this.g();
        }

        @Override // defpackage.yh.b
        public void h(yh yhVar, yh.i iVar) {
            vg.this.dismiss();
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vg$c */
    /* loaded from: classes.dex */
    public static final class c extends ArrayAdapter<yh.i> implements AdapterView.OnItemClickListener {
        public final LayoutInflater b;
        public final Drawable c;
        public final Drawable d;
        public final Drawable e;
        public final Drawable f;

        public c(Context context, List<yh.i> list) {
            super(context, 0, list);
            this.b = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{ig.mediaRouteDefaultIconDrawable, ig.mediaRouteTvIconDrawable, ig.mediaRouteSpeakerIconDrawable, ig.mediaRouteSpeakerGroupIconDrawable});
            this.c = obtainStyledAttributes.getDrawable(0);
            this.d = obtainStyledAttributes.getDrawable(1);
            this.e = obtainStyledAttributes.getDrawable(2);
            this.f = obtainStyledAttributes.getDrawable(3);
            obtainStyledAttributes.recycle();
        }

        public final Drawable a(yh.i iVar) {
            int f = iVar.f();
            if (f != 1) {
                if (f != 2) {
                    if (iVar.x()) {
                        return this.f;
                    }
                    return this.c;
                }
                return this.e;
            }
            return this.d;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        public final Drawable b(yh.i iVar) {
            Uri i = iVar.i();
            if (i != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(i), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e) {
                    Log.w(C0059ao.a(481), C0059ao.a(480) + i, e);
                }
            }
            return a(iVar);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.b.inflate(qg.mr_chooser_list_item, viewGroup, false);
            }
            yh.i item = getItem(i);
            TextView textView = (TextView) view.findViewById(ng.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(ng.mr_chooser_route_desc);
            textView.setText(item.l());
            String d = item.d();
            boolean z = true;
            if (item.c() != 2 && item.c() != 1) {
                z = false;
            }
            if (z && !TextUtils.isEmpty(d)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(d);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText(C0059ao.a(482));
            }
            view.setEnabled(item.w());
            ImageView imageView = (ImageView) view.findViewById(ng.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(b(item));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return getItem(i).w();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            yh.i item = getItem(i);
            if (item.w()) {
                ImageView imageView = (ImageView) view.findViewById(ng.mr_chooser_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(ng.mr_chooser_route_progress_bar);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                item.H();
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: vg$d */
    /* loaded from: classes.dex */
    public static final class d implements Comparator<yh.i> {
        public static final d b = new d();

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(yh.i iVar, yh.i iVar2) {
            return iVar.l().compareToIgnoreCase(iVar2.l());
        }
    }

    public vg(Context context) {
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
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.d.j());
            f(arrayList);
            Collections.sort(arrayList, d.b);
            if (SystemClock.uptimeMillis() - this.l >= 300) {
                k(arrayList);
                return;
            }
            this.m.removeMessages(1);
            Handler handler = this.m;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.l + 300);
        }
    }

    public void h(xh xhVar) {
        if (xhVar != null) {
            if (this.g.equals(xhVar)) {
                return;
            }
            this.g = xhVar;
            if (this.k) {
                this.d.o(this.e);
                this.d.b(xhVar, this.e, 1);
            }
            g();
            return;
        }
        throw new IllegalArgumentException(C0059ao.a(4778));
    }

    public void j() {
        getWindow().setLayout(ah.b(getContext()), -2);
    }

    public void k(List<yh.i> list) {
        this.l = SystemClock.uptimeMillis();
        this.h.clear();
        this.h.addAll(list);
        this.i.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k = true;
        this.d.b(this.g, this.e, 1);
        g();
    }

    @Override // defpackage.c0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(qg.mr_chooser_dialog);
        this.h = new ArrayList<>();
        this.i = new c(getContext(), this.h);
        ListView listView = (ListView) findViewById(ng.mr_chooser_list);
        this.j = listView;
        listView.setAdapter((ListAdapter) this.i);
        this.j.setOnItemClickListener(this.i);
        this.j.setEmptyView(findViewById(16908292));
        this.f = (TextView) findViewById(ng.mr_chooser_title);
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.k = false;
        this.d.o(this.e);
        this.m.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.c0, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vg(android.content.Context r2, int r3) {
        /*
            r1 = this;
            r0 = 0
            android.content.Context r2 = defpackage.dh.b(r2, r3, r0)
            int r3 = defpackage.dh.c(r2)
            r1.<init>(r2, r3)
            xh r2 = defpackage.xh.c
            r1.g = r2
            vg$a r2 = new vg$a
            r2.<init>()
            r1.m = r2
            android.content.Context r2 = r1.getContext()
            yh r2 = defpackage.yh.g(r2)
            r1.d = r2
            vg$b r2 = new vg$b
            r2.<init>()
            r1.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.c0, android.app.Dialog
    public void setTitle(int i) {
        this.f.setText(i);
    }
}
