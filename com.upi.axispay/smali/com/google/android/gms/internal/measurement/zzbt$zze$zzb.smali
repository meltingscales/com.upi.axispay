.class public final enum Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;
.super Ljava/lang/Enum;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzfc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzbt$zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzfc;"
    }
.end annotation


# static fields
.field private static final zztw:Lcom/google/android/gms/internal/measurement/zzfd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzfd<",
            "Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;",
            ">;"
        }
    .end annotation
.end field

.field private static final enum zzvh:Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

.field private static final enum zzvi:Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

.field private static final synthetic zzvj:[Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    const-string v1, "RADS"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzvh:Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    const-string v4, "PROVISIONING"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzvi:Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    new-array v4, v5, [Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    .line 3
    sput-object v4, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzvj:[Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    .line 4
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbv;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zztw:Lcom/google/android/gms/internal/measurement/zzfd;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzvj:[Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    return-object v0
.end method

.method public static zzgq()Lcom/google/android/gms/internal/measurement/zzfe;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbw;->zzty:Lcom/google/android/gms/internal/measurement/zzfe;

    return-object v0
.end method

.method public static zzk(I)Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzvi:Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    return-object p0

    .line 2
    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->zzvh:Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;

    return-object p0
.end method


# virtual methods
.method public final zzgp()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zze$zzb;->value:I

    return v0
.end method
