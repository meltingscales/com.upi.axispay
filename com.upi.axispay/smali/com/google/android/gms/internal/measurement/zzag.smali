.class public final Lcom/google/android/gms/internal/measurement/zzag;
.super Lcom/google/android/gms/internal/measurement/zzaa$zza;
.source "AxisPay"


# instance fields
.field private final synthetic zzar:Lcom/google/android/gms/internal/measurement/zzaa;

.field private final synthetic zzaz:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzaa;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzag;->zzar:Lcom/google/android/gms/internal/measurement/zzaa;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzag;->zzaz:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaa$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzaa;)V

    return-void
.end method


# virtual methods
.method public final zzl()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzag;->zzar:Lcom/google/android/gms/internal/measurement/zzaa;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzaa;->zzc(Lcom/google/android/gms/internal/measurement/zzaa;)Lcom/google/android/gms/internal/measurement/zzn;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzag;->zzaz:Z

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzaa$zza;->timestamp:J

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzn;->setMeasurementEnabled(ZJ)V

    return-void
.end method
