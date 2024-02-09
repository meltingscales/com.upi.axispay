.class public final enum Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;
.super Ljava/lang/Enum;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzfc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzbl$zza;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzfc;"
    }
.end annotation


# static fields
.field public static final enum zztr:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

.field public static final enum zzts:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

.field public static final enum zztt:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

.field public static final enum zztu:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

.field public static final enum zztv:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

.field private static final zztw:Lcom/google/android/gms/internal/measurement/zzfd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzfd<",
            "Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic zztx:[Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    const-string v1, "UNKNOWN_COMPARISON_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztr:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    const-string v3, "LESS_THAN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zzts:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    .line 3
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    const-string v5, "GREATER_THAN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztt:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    .line 4
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    const-string v7, "EQUAL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztu:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    .line 5
    new-instance v7, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    const-string v9, "BETWEEN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztv:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztx:[Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    .line 7
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztw:Lcom/google/android/gms/internal/measurement/zzfd;

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
    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztx:[Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    return-object v0
.end method

.method public static zze(I)Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztv:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    return-object p0

    .line 2
    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztu:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    return-object p0

    .line 3
    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztt:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    return-object p0

    .line 4
    :cond_3
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zzts:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    return-object p0

    .line 5
    :cond_4
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->zztr:Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;

    return-object p0
.end method

.method public static zzgq()Lcom/google/android/gms/internal/measurement/zzfe;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbo;->zzty:Lcom/google/android/gms/internal/measurement/zzfe;

    return-object v0
.end method


# virtual methods
.method public final zzgp()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbl$zza$zzb;->value:I

    return v0
.end method
