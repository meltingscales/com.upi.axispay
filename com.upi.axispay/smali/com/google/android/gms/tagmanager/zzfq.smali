.class public final Lcom/google/android/gms/tagmanager/zzfq;
.super Lcom/google/android/gms/tagmanager/zzbu;
.source "AxisPay"


# static fields
.field private static final zza:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/gtm/zza;->zzF:Lcom/google/android/gms/internal/gtm/zza;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gtm/zza;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/tagmanager/zzfq;->zza:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lcom/google/android/gms/tagmanager/zzfq;->zza:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/tagmanager/zzbu;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/Map;)Lcom/google/android/gms/internal/gtm/zzak;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/gtm/zzak;",
            ">;)",
            "Lcom/google/android/gms/internal/gtm/zzak;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzfv;->zzc(Ljava/lang/Object;)Lcom/google/android/gms/internal/gtm/zzak;

    move-result-object p1

    return-object p1
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
