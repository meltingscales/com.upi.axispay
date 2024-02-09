package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzrl;
import com.google.android.gms.internal.gtm.zzto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: AxisPay */
/* loaded from: classes.dex */
public final class zzel implements Runnable {
    public final /* synthetic */ zzrl zza;
    public final /* synthetic */ zzem zzb;

    public zzel(zzem zzemVar, zzrl zzrlVar) {
        this.zzb = zzemVar;
        this.zza = zzrlVar;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006d: INVOKE  (r3 I:java.io.FileOutputStream) type: VIRTUAL call: java.io.FileOutputStream.close():void, block:B:16:0x006d */
    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream close;
        zzem zzemVar = this.zzb;
        zzrl zzrlVar = this.zza;
        File zze = zzemVar.zze();
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(zze);
                try {
                    try {
                        byte[] bArr = new byte[zzrlVar.zzX()];
                        zzto zzF = zzto.zzF(bArr);
                        zzrlVar.zzaq(zzF);
                        zzF.zzG();
                        fileOutputStream.write(bArr);
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused) {
                            zzdh.zzc("error closing stream for writing resource to disk");
                        }
                    } catch (IOException e) {
                        String name = zzrlVar.getClass().getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
                        sb.append("Serializing ");
                        sb.append(name);
                        sb.append(" to a ");
                        sb.append("byte array");
                        sb.append(" threw an IOException (should never happen).");
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        zzdh.zzc("error closing stream for writing resource to disk");
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                zzdh.zza("Error opening resource file for writing");
            }
        } catch (IOException unused4) {
            zzdh.zzc("Error writing resource to disk. Removing resource from disk.");
            zze.delete();
            try {
                close.close();
            } catch (IOException unused5) {
                zzdh.zzc("error closing stream for writing resource to disk");
            }
        }
    }
}
