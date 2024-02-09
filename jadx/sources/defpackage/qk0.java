package defpackage;

import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: qk0  reason: default package */
/* loaded from: classes.dex */
public final class qk0 {
    public static final <T> Class<T> a(wm0<T> wm0Var) {
        String name;
        yl0.e(wm0Var, C0059ao.a(11305));
        Class<T> cls = (Class<T>) ((sl0) wm0Var).a();
        if (cls.isPrimitive() && (name = cls.getName()) != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals(C0059ao.a(11314)) ? cls : Double.class;
                case 104431:
                    return !name.equals(C0059ao.a(11313)) ? cls : Integer.class;
                case 3039496:
                    return !name.equals(C0059ao.a(11312)) ? cls : Byte.class;
                case 3052374:
                    return !name.equals(C0059ao.a(11311)) ? cls : Character.class;
                case 3327612:
                    return !name.equals(C0059ao.a(11310)) ? cls : Long.class;
                case 3625364:
                    return !name.equals(C0059ao.a(11309)) ? cls : Void.class;
                case 64711720:
                    return !name.equals(C0059ao.a(11308)) ? cls : Boolean.class;
                case 97526364:
                    return !name.equals(C0059ao.a(11307)) ? cls : Float.class;
                case 109413500:
                    return !name.equals(C0059ao.a(11306)) ? cls : Short.class;
                default:
                    return cls;
            }
        }
        return cls;
    }
}
