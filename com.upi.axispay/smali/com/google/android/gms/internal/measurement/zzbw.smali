.class public final Lcom/google/android/gms/internal/measurement/zzbw;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzfe;


# static fields
.field public static final zzty:Lcom/google/android/gms/internal/measurement/zzfe;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbw;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbw;->zzty:Lcom/google/android/gms/internal/measurement/zzfe;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzf(I)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzk(I)Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
