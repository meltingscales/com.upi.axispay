.class public final Lcom/google/android/gms/internal/vision/zzfr;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/vision/zzjg;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/vision/zzjg;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/vision/zzfr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/zzfr;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/zzfr;->zza:Lcom/google/android/gms/internal/vision/zzjg;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/vision/zzfi$zzg$zzb;->zza(I)Lcom/google/android/gms/internal/vision/zzfi$zzg$zzb;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
