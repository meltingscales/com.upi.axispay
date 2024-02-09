.class public final enum Lcom/google/android/gms/internal/measurement/zzev;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/measurement/zzev;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zzagd:Lcom/google/android/gms/internal/measurement/zzev;

.field public static final enum zzage:Lcom/google/android/gms/internal/measurement/zzev;

.field public static final enum zzagf:Lcom/google/android/gms/internal/measurement/zzev;

.field public static final enum zzagg:Lcom/google/android/gms/internal/measurement/zzev;

.field private static final synthetic zzagi:[Lcom/google/android/gms/internal/measurement/zzev;


# instance fields
.field private final zzagh:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzev;

    const-string v1, "SCALAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzev;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzev;->zzagd:Lcom/google/android/gms/internal/measurement/zzev;

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzev;

    const-string v3, "VECTOR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/zzev;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzev;->zzage:Lcom/google/android/gms/internal/measurement/zzev;

    .line 3
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzev;

    const-string v5, "PACKED_VECTOR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v4}, Lcom/google/android/gms/internal/measurement/zzev;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/zzev;->zzagf:Lcom/google/android/gms/internal/measurement/zzev;

    .line 4
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzev;

    const-string v7, "MAP"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v2}, Lcom/google/android/gms/internal/measurement/zzev;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, Lcom/google/android/gms/internal/measurement/zzev;->zzagg:Lcom/google/android/gms/internal/measurement/zzev;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/android/gms/internal/measurement/zzev;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lcom/google/android/gms/internal/measurement/zzev;->zzagi:[Lcom/google/android/gms/internal/measurement/zzev;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/zzev;->zzagh:Z

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzev;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzev;->zzagi:[Lcom/google/android/gms/internal/measurement/zzev;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzev;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzev;

    return-object v0
.end method
