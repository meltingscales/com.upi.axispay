.class public final Lcom/google/android/gms/internal/measurement/zzar;
.super Lcom/google/android/gms/internal/measurement/zzaa$zza;
.source "AxisPay"


# instance fields
.field private final synthetic zzar:Lcom/google/android/gms/internal/measurement/zzaa;

.field private final synthetic zzaw:Lcom/google/android/gms/internal/measurement/zzm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzaa;Lcom/google/android/gms/internal/measurement/zzm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzar;->zzar:Lcom/google/android/gms/internal/measurement/zzaa;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzar;->zzaw:Lcom/google/android/gms/internal/measurement/zzm;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaa$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzaa;)V

    return-void
.end method


# virtual methods
.method public final zzl()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzar;->zzar:Lcom/google/android/gms/internal/measurement/zzaa;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzaa;->zzc(Lcom/google/android/gms/internal/measurement/zzaa;)Lcom/google/android/gms/internal/measurement/zzn;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzar;->zzaw:Lcom/google/android/gms/internal/measurement/zzm;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/zzn;->getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/zzq;)V

    return-void
.end method

.method public final zzm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzar;->zzaw:Lcom/google/android/gms/internal/measurement/zzm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzm;->zzb(Landroid/os/Bundle;)V

    return-void
.end method
