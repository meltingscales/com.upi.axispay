.class public final Lcom/google/android/gms/tagmanager/zzbg;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
.end annotation


# instance fields
.field private zza:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/google/android/gms/tagmanager/zzbg;->zza:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 1

    iget p1, p0, Lcom/google/android/gms/tagmanager/zzbg;->zza:I

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    :cond_0
    return-void
.end method

.method public final zzb(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/tagmanager/zzbg;->zza:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    const-string v0, "GoogleTagManager"

    .line 1
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final zzc(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/tagmanager/zzbg;->zza:I

    return-void
.end method

.method public final zzd(Ljava/lang/String;)V
    .locals 1

    iget p1, p0, Lcom/google/android/gms/tagmanager/zzbg;->zza:I

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    :cond_0
    return-void
.end method
