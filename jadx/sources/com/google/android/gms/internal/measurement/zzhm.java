package com.google.android.gms.internal.measurement;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzhm {
    public static String zzd(zzdp zzdpVar) {
        zzhn zzhnVar = new zzhn(zzdpVar);
        StringBuilder sb = new StringBuilder(zzhnVar.size());
        for (int i = 0; i < zzhnVar.size(); i++) {
            byte zzr = zzhnVar.zzr(i);
            if (zzr == 34) {
                sb.append("\\\"");
            } else if (zzr == 39) {
                sb.append("\\'");
            } else if (zzr != 92) {
                switch (zzr) {
                    case 7:
                        sb.append("\\a");
                        continue;
                    case 8:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (zzr >= 32 && zzr <= 126) {
                            sb.append((char) zzr);
                            continue;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzr >>> 6) & 3) + 48));
                            sb.append((char) (((zzr >>> 3) & 7) + 48));
                            sb.append((char) ((zzr & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
