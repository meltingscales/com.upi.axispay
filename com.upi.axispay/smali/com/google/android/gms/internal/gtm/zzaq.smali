.class public final Lcom/google/android/gms/internal/gtm/zzaq;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/gtm/zzvd;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/gtm/zzvd;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/gtm/zzaq;

    invoke-direct {v0}, Lcom/google/android/gms/internal/gtm/zzaq;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gtm/zzaq;->zza:Lcom/google/android/gms/internal/gtm/zzvd;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(I)Z
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/gtm/zzar;->zza(I)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
