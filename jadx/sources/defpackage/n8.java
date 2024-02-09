package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.vision.barcode.Barcode;
import defpackage.m8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: n8  reason: default package */
/* loaded from: classes.dex */
public class n8 implements l8 {
    public final Context a;
    public final Notification.Builder b;
    public final m8.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List<Bundle> f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    public n8(m8.e eVar) {
        Icon icon;
        List<String> list;
        List<String> e;
        this.c = eVar;
        this.a = eVar.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.b = new Notification.Builder(eVar.a, eVar.K);
        } else {
            this.b = new Notification.Builder(eVar.a);
        }
        Notification notification = eVar.S;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.k).setContentIntent(eVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.h, (notification.flags & Barcode.ITF) != 0).setLargeIcon(eVar.j).setNumber(eVar.l).setProgress(eVar.t, eVar.u, eVar.v);
        if (i < 21) {
            this.b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.b.setSubText(eVar.q).setUsesChronometer(eVar.o).setPriority(eVar.m);
            Iterator<m8.a> it = eVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = eVar.D;
            if (bundle != null) {
                this.g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.z) {
                    this.g.putBoolean(C0059ao.a(12601), true);
                }
                String str = eVar.w;
                if (str != null) {
                    this.g.putString(C0059ao.a(12602), str);
                    if (eVar.x) {
                        this.g.putBoolean(C0059ao.a(12603), true);
                    } else {
                        this.g.putBoolean(C0059ao.a(12604), true);
                    }
                }
                String str2 = eVar.y;
                if (str2 != null) {
                    this.g.putString(C0059ao.a(12605), str2);
                }
            }
            this.d = eVar.H;
            this.e = eVar.I;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            this.b.setShowWhen(eVar.n);
        }
        if (i2 >= 19 && i2 < 21 && (e = e(g(eVar.c), eVar.V)) != null && !e.isEmpty()) {
            this.g.putStringArray(C0059ao.a(12606), (String[]) e.toArray(new String[e.size()]));
        }
        if (i2 >= 20) {
            this.b.setLocalOnly(eVar.z).setGroup(eVar.w).setGroupSummary(eVar.x).setSortKey(eVar.y);
            this.h = eVar.P;
        }
        if (i2 >= 21) {
            this.b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
            if (i2 < 28) {
                list = e(g(eVar.c), eVar.V);
            } else {
                list = eVar.V;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.b.addPerson(str3);
                }
            }
            this.i = eVar.J;
            if (eVar.d.size() > 0) {
                Bundle c = eVar.c();
                String a = C0059ao.a(12607);
                Bundle bundle2 = c.getBundle(a);
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i3 = 0; i3 < eVar.d.size(); i3++) {
                    bundle4.putBundle(Integer.toString(i3), o8.b(eVar.d.get(i3)));
                }
                String a2 = C0059ao.a(12608);
                bundle2.putBundle(a2, bundle4);
                bundle3.putBundle(a2, bundle4);
                eVar.c().putBundle(a, bundle2);
                this.g.putBundle(a, bundle3);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = eVar.U) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.b.setExtras(eVar.D).setRemoteInputHistory(eVar.s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.b.setBadgeIconType(eVar.L).setSettingsText(eVar.r).setShortcutId(eVar.M).setTimeoutAfter(eVar.O).setGroupAlertBehavior(eVar.P);
            if (eVar.B) {
                this.b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<p8> it2 = eVar.c.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(eVar.Q);
            this.b.setBubbleMetadata(m8.d.c(eVar.R));
            u8 u8Var = eVar.N;
            if (u8Var != null) {
                u8Var.a();
                throw null;
            }
        }
        if (eVar.T) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i6 = notification.defaults & (-2);
            notification.defaults = i6;
            int i7 = i6 & (-3);
            notification.defaults = i7;
            this.b.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.c.w)) {
                    this.b.setGroup(C0059ao.a(12609));
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        p4 p4Var = new p4(list.size() + list2.size());
        p4Var.addAll(list);
        p4Var.addAll(list2);
        return new ArrayList(p4Var);
    }

    public static List<String> g(List<p8> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p8 p8Var : list) {
            arrayList.add(p8Var.g());
        }
        return arrayList;
    }

    @Override // defpackage.l8
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(m8.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.f.add(o8.f(this.b, aVar));
                return;
            }
            return;
        }
        IconCompat e = aVar.e();
        if (i >= 23) {
            builder = new Notification.Action.Builder(e != null ? e.q() : null, aVar.i(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(e != null ? e.f() : 0, aVar.i(), aVar.a());
        }
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : q8.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean(C0059ao.a(12610), aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt(C0059ao.a(12611), aVar.g());
        if (i2 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i2 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean(C0059ao.a(12612), aVar.h());
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }

    public Notification c() {
        Bundle a;
        RemoteViews f;
        RemoteViews d;
        m8.f fVar = this.c.p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e = fVar != null ? fVar.e(this) : null;
        Notification d2 = d();
        if (e != null) {
            d2.contentView = e;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                d2.contentView = remoteViews;
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && fVar != null && (d = fVar.d(this)) != null) {
            d2.bigContentView = d;
        }
        if (i >= 21 && fVar != null && (f = this.c.p.f(this)) != null) {
            d2.headsUpContentView = f;
        }
        if (i >= 16 && fVar != null && (a = m8.a(d2)) != null) {
            fVar.a(a);
        }
        return d2;
    }

    public Notification d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.b.build();
        }
        if (i >= 24) {
            Notification build = this.b.build();
            if (this.h != 0) {
                if (build.getGroup() != null && (build.flags & Barcode.UPC_A) != 0 && this.h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & Barcode.UPC_A) == 0 && this.h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.b.setExtras(this.g);
            Notification build2 = this.b.build();
            RemoteViews remoteViews = this.d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.h != 0) {
                if (build2.getGroup() != null && (build2.flags & Barcode.UPC_A) != 0 && this.h == 2) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & Barcode.UPC_A) == 0 && this.h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.b.setExtras(this.g);
            Notification build3 = this.b.build();
            RemoteViews remoteViews4 = this.d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.h != 0) {
                if (build3.getGroup() != null && (build3.flags & Barcode.UPC_A) != 0 && this.h == 2) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & Barcode.UPC_A) == 0 && this.h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else {
            String a = C0059ao.a(12613);
            if (i >= 19) {
                SparseArray<Bundle> a2 = o8.a(this.f);
                if (a2 != null) {
                    this.g.putSparseParcelableArray(a, a2);
                }
                this.b.setExtras(this.g);
                Notification build4 = this.b.build();
                RemoteViews remoteViews6 = this.d;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.e;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i >= 16) {
                Notification build5 = this.b.build();
                Bundle a3 = m8.a(build5);
                Bundle bundle = new Bundle(this.g);
                for (String str : this.g.keySet()) {
                    if (a3.containsKey(str)) {
                        bundle.remove(str);
                    }
                }
                a3.putAll(bundle);
                SparseArray<Bundle> a4 = o8.a(this.f);
                if (a4 != null) {
                    m8.a(build5).putSparseParcelableArray(a, a4);
                }
                RemoteViews remoteViews8 = this.d;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.e;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            } else {
                return this.b.getNotification();
            }
        }
    }

    public Context f() {
        return this.a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
