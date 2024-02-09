.class public final Lcom/google/android/gms/identity/intents/zzb;
.super Lcom/google/android/gms/identity/intents/zzc;
.source "AxisPay"


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/identity/intents/UserAddressRequest;

.field public final synthetic zzb:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/identity/intents/zzb;->zza:Lcom/google/android/gms/identity/intents/UserAddressRequest;

    iput p3, p0, Lcom/google/android/gms/identity/intents/zzb;->zzb:I

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/identity/intents/zzc;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lcom/google/android/gms/common/api/Api$AnyClient;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/identity/zze;

    iget-object v0, p0, Lcom/google/android/gms/identity/intents/zzb;->zza:Lcom/google/android/gms/identity/intents/UserAddressRequest;

    iget v1, p0, Lcom/google/android/gms/identity/intents/zzb;->zzb:I

    .line 2
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/identity/zze;->zzp(Lcom/google/android/gms/identity/intents/UserAddressRequest;I)V

    .line 3
    sget-object p1, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    return-void
.end method
