.class public final Lcom/google/android/gms/internal/vision/zzll;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field private static final zza:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzb:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/vision/zzlk;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/zzlk;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/zzll;->zza:Ljava/util/Iterator;

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/vision/zzln;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/zzln;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/zzll;->zzb:Ljava/lang/Iterable;

    return-void
.end method

.method public static zza()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/lang/Iterable<",
            "TT;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/zzll;->zzb:Ljava/lang/Iterable;

    return-object v0
.end method

.method public static synthetic zzb()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/vision/zzll;->zza:Ljava/util/Iterator;

    return-object v0
.end method