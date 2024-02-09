package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import defpackage.oa;
import defpackage.y8;
import java.io.IOException;
import java.io.InputStream;
import myunmn.C0059ao;

/* compiled from: AxisPay */
/* renamed from: l9  reason: default package */
/* loaded from: classes.dex */
public class l9 extends m9 {
    @Override // defpackage.m9
    public Typeface b(Context context, y8.b bVar, Resources resources, int i) {
        try {
            y8.c[] a = bVar.a();
            int length = a.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    break;
                }
                y8.c cVar = a[i2];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.b()).setWeight(cVar.e());
                    if (!cVar.f()) {
                        i3 = 0;
                    }
                    Font build = weight.setSlant(i3).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i2++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.m9
    public Typeface c(Context context, CancellationSignal cancellationSignal, oa.b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            int i2 = 0;
            while (true) {
                int i3 = 1;
                if (i2 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0)).build();
                }
                oa.b bVar = bVarArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), C0059ao.a(10729), cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.e());
                        if (!bVar.f()) {
                            i3 = 0;
                        }
                        Font build = weight.setSlant(i3).setTtcIndex(bVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                            i2++;
                        }
                    } catch (Throwable th) {
                        if (openFileDescriptor != null) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                    i2++;
                }
                openFileDescriptor.close();
                i2++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.m9
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException(C0059ao.a(10730));
    }

    @Override // defpackage.m9
    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.m9
    public oa.b h(oa.b[] bVarArr, int i) {
        throw new RuntimeException(C0059ao.a(10731));
    }
}
