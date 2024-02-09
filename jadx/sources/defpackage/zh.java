package defpackage;

import android.annotation.SuppressLint;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import defpackage.sh;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import myunmn.C0059ao;

/* compiled from: AxisPay */
@SuppressLint({"NewApi"})
/* renamed from: zh  reason: default package */
/* loaded from: classes.dex */
public class zh {
    public static List<String> a(List<MediaRoute2Info> list) {
        if (list == null) {
            return new ArrayList();
        }
        return (List) list.stream().filter(new Predicate() { // from class: ph
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((MediaRoute2Info) obj);
            }
        }).map(new Function() { // from class: mh
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MediaRoute2Info) obj).getId();
            }
        }).collect(Collectors.toList());
    }

    public static RouteDiscoveryPreference b(th thVar) {
        if (thVar != null && thVar.e()) {
            return new RouteDiscoveryPreference.Builder((List) thVar.c().e().stream().map(new Function() { // from class: lh
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return zh.d((String) obj);
                }
            }).collect(Collectors.toList()), thVar.d()).build();
        }
        return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
    }

    public static sh c(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        sh.a aVar = new sh.a(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        aVar.g(mediaRoute2Info.getConnectionState());
        aVar.s(mediaRoute2Info.getVolumeHandling());
        aVar.t(mediaRoute2Info.getVolumeMax());
        aVar.r(mediaRoute2Info.getVolume());
        aVar.k(mediaRoute2Info.getExtras());
        aVar.j(true);
        aVar.f(false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            aVar.h(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            aVar.l(iconUri);
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras != null) {
            String a = C0059ao.a(9002);
            if (extras.containsKey(a)) {
                String a2 = C0059ao.a(9003);
                if (extras.containsKey(a2)) {
                    String a3 = C0059ao.a(9004);
                    if (extras.containsKey(a3)) {
                        aVar.k(extras.getBundle(a));
                        aVar.i(extras.getInt(a2, 0));
                        aVar.p(extras.getInt(C0059ao.a(9005), 1));
                        ArrayList parcelableArrayList = extras.getParcelableArrayList(a3);
                        if (parcelableArrayList != null) {
                            aVar.b(parcelableArrayList);
                        }
                        return aVar.e();
                    }
                }
            }
        }
        return null;
    }

    public static String d(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2065577523:
                if (str.equals(C0059ao.a(9008))) {
                    c = 0;
                    break;
                }
                break;
            case 956939050:
                if (str.equals(C0059ao.a(9007))) {
                    c = 1;
                    break;
                }
                break;
            case 975975375:
                if (str.equals(C0059ao.a(9006))) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return C0059ao.a(9011);
            case 1:
                return C0059ao.a(9010);
            case 2:
                return C0059ao.a(9009);
            default:
                return str;
        }
    }
}
