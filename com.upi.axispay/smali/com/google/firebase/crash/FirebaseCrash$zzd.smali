.class public final enum Lcom/google/firebase/crash/FirebaseCrash$zzd;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/crash/FirebaseCrash;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "zzd"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/crash/FirebaseCrash$zzd;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zzu:Lcom/google/firebase/crash/FirebaseCrash$zzd;

.field public static final enum zzv:Lcom/google/firebase/crash/FirebaseCrash$zzd;

.field public static final enum zzw:Lcom/google/firebase/crash/FirebaseCrash$zzd;

.field private static final synthetic zzx:[Lcom/google/firebase/crash/FirebaseCrash$zzd;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/google/firebase/crash/FirebaseCrash$zzd;

    const-string v1, "UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/crash/FirebaseCrash$zzd;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/crash/FirebaseCrash$zzd;->zzu:Lcom/google/firebase/crash/FirebaseCrash$zzd;

    .line 2
    new-instance v1, Lcom/google/firebase/crash/FirebaseCrash$zzd;

    const-string v3, "ENABLED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/firebase/crash/FirebaseCrash$zzd;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/firebase/crash/FirebaseCrash$zzd;->zzv:Lcom/google/firebase/crash/FirebaseCrash$zzd;

    .line 3
    new-instance v3, Lcom/google/firebase/crash/FirebaseCrash$zzd;

    const-string v5, "DISABLED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/firebase/crash/FirebaseCrash$zzd;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/firebase/crash/FirebaseCrash$zzd;->zzw:Lcom/google/firebase/crash/FirebaseCrash$zzd;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/firebase/crash/FirebaseCrash$zzd;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lcom/google/firebase/crash/FirebaseCrash$zzd;->zzx:[Lcom/google/firebase/crash/FirebaseCrash$zzd;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/firebase/crash/FirebaseCrash$zzd;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/crash/FirebaseCrash$zzd;->zzx:[Lcom/google/firebase/crash/FirebaseCrash$zzd;

    invoke-virtual {v0}, [Lcom/google/firebase/crash/FirebaseCrash$zzd;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/crash/FirebaseCrash$zzd;

    return-object v0
.end method
