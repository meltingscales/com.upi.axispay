.class public final Lcom/google/android/gms/internal/measurement/zzai;
.super Lcom/google/android/gms/internal/measurement/zzaa$zza;
.source "AxisPay"


# instance fields
.field private final synthetic zzar:Lcom/google/android/gms/internal/measurement/zzaa;

.field private final synthetic zzba:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzaa;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzar:Lcom/google/android/gms/internal/measurement/zzaa;

    iput-wide p2, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzba:J

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzaa$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzaa;)V

    return-void
.end method


# virtual methods
.method public final zzl()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzar:Lcom/google/android/gms/internal/measurement/zzaa;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzaa;->zzc(Lcom/google/android/gms/internal/measurement/zzaa;)Lcom/google/android/gms/internal/measurement/zzn;

    move-result-object v0

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzai;->zzba:J

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzn;->setMinimumSessionDuration(J)V

    return-void
.end method
