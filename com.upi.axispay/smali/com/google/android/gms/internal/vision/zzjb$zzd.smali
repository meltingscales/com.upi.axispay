.class public Lcom/google/android/gms/internal/vision/zzjb$zzd;
.super Lcom/google/android/gms/internal/vision/zzjb$zzb;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/vision/zzkm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/zzjb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zzd"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/vision/zzjb$zzc<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/vision/zzjb$zzd<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/vision/zzjb$zzb<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/vision/zzkm;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/vision/zzjb$zzc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzjb$zzb;-><init>(Lcom/google/android/gms/internal/vision/zzjb;)V

    return-void
.end method


# virtual methods
.method public zzb()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zzb()V

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zza:Lcom/google/android/gms/internal/vision/zzjb;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;->zzc:Lcom/google/android/gms/internal/vision/zziu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/zziu;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/zziu;

    iput-object v0, v1, Lcom/google/android/gms/internal/vision/zzjb$zzc;->zzc:Lcom/google/android/gms/internal/vision/zziu;

    return-void
.end method

.method public synthetic zzc()Lcom/google/android/gms/internal/vision/zzjb;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zze()Lcom/google/android/gms/internal/vision/zzkk;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    return-object v0
.end method

.method public synthetic zze()Lcom/google/android/gms/internal/vision/zzkk;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zzb:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zza:Lcom/google/android/gms/internal/vision/zzjb;

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zza:Lcom/google/android/gms/internal/vision/zzjb;

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;->zzc:Lcom/google/android/gms/internal/vision/zziu;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/vision/zziu;->zzb()V

    .line 4
    invoke-super {p0}, Lcom/google/android/gms/internal/vision/zzjb$zzb;->zzc()Lcom/google/android/gms/internal/vision/zzjb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    return-object v0
.end method
