.class public final Lcom/google/android/gms/internal/gtm/zzst;
.super Lcom/google/android/gms/internal/gtm/zzsw;
.source "AxisPay"


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/gtm/zztd;

.field private zzb:I

.field private final zzc:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/gtm/zztd;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/gtm/zzst;->zza:Lcom/google/android/gms/internal/gtm/zztd;

    invoke-direct {p0}, Lcom/google/android/gms/internal/gtm/zzsw;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzb:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gtm/zztd;->zzd()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzc:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzb:I

    iget v1, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzc:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzb:I

    iget v1, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzc:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    .line 1
    iput v1, p0, Lcom/google/android/gms/internal/gtm/zzst;->zzb:I

    iget-object v1, p0, Lcom/google/android/gms/internal/gtm/zzst;->zza:Lcom/google/android/gms/internal/gtm/zztd;

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/gtm/zztd;->zzb(I)B

    move-result v0

    return v0

    .line 3
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 4
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method