.class public Lcom/google/android/gms/common/zzw;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field private static final zzd:Lcom/google/android/gms/common/zzw;


# instance fields
.field public final zza:Z

.field public final zzb:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final zzc:Ljava/lang/Throwable;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/zzw;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/common/zzw;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    sput-object v0, Lcom/google/android/gms/common/zzw;->zzd:Lcom/google/android/gms/common/zzw;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/common/zzw;->zza:Z

    iput-object p2, p0, Lcom/google/android/gms/common/zzw;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/common/zzw;->zzc:Ljava/lang/Throwable;

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/common/zzw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/common/zzw;->zzd:Lcom/google/android/gms/common/zzw;

    return-object v0
.end method

.method public static zzc(Ljava/lang/String;)Lcom/google/android/gms/common/zzw;
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/zzw;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/google/android/gms/common/zzw;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static zzd(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/common/zzw;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/zzw;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/common/zzw;-><init>(ZLjava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public zza()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/common/zzw;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final zze()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/zzw;->zza:Z

    if-nez v0, :cond_1

    const/4 v0, 0x3

    const-string v1, "GoogleCertificatesRslt"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/zzw;->zzc:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzw;->zza()Ljava/lang/String;

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzw;->zza()Ljava/lang/String;

    :cond_1
    return-void
.end method
