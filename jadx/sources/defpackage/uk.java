package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import defpackage.pk;
import defpackage.qk;
import defpackage.tk;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: uk  reason: default package */
/* loaded from: classes.dex */
public class uk {
    public final Context a;
    public final String b;
    public int c;
    public final tk d;
    public final tk.c e;
    public qk f;
    public final Executor g;
    public final pk h = new a();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final ServiceConnection j;
    public final Runnable k;
    public final Runnable l;

    /* compiled from: AxisPay */
    /* renamed from: uk$a */
    /* loaded from: classes.dex */
    public class a extends pk.a {

        /* compiled from: AxisPay */
        /* renamed from: uk$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0041a implements Runnable {
            public final /* synthetic */ String[] b;

            public RunnableC0041a(String[] strArr) {
                this.b = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                uk.this.d.f(this.b);
            }
        }

        public a() {
        }

        @Override // defpackage.pk
        public void b(String[] strArr) {
            uk.this.g.execute(new RunnableC0041a(strArr));
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uk$b */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            uk.this.f = qk.a.j(iBinder);
            uk ukVar = uk.this;
            ukVar.g.execute(ukVar.k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            uk ukVar = uk.this;
            ukVar.g.execute(ukVar.l);
            uk.this.f = null;
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uk$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                uk ukVar = uk.this;
                qk qkVar = ukVar.f;
                if (qkVar != null) {
                    ukVar.c = qkVar.e(ukVar.h, ukVar.b);
                    uk ukVar2 = uk.this;
                    ukVar2.d.a(ukVar2.e);
                }
            } catch (RemoteException e) {
                Log.w(C0059ao.a(3016), C0059ao.a(3017), e);
            }
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uk$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            uk ukVar = uk.this;
            ukVar.d.i(ukVar.e);
        }
    }

    /* compiled from: AxisPay */
    /* renamed from: uk$e */
    /* loaded from: classes.dex */
    public class e extends tk.c {
        public e(String[] strArr) {
            super(strArr);
        }

        @Override // defpackage.tk.c
        public boolean a() {
            return true;
        }

        @Override // defpackage.tk.c
        public void b(Set<String> set) {
            if (uk.this.i.get()) {
                return;
            }
            try {
                uk ukVar = uk.this;
                qk qkVar = ukVar.f;
                if (qkVar != null) {
                    qkVar.g(ukVar.c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
                Log.w(C0059ao.a(2955), C0059ao.a(2956), e);
            }
        }
    }

    public uk(Context context, String str, Intent intent, tk tkVar, Executor executor) {
        b bVar = new b();
        this.j = bVar;
        this.k = new c();
        this.l = new d();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.d = tkVar;
        this.g = executor;
        this.e = new e((String[]) tkVar.a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }
}
