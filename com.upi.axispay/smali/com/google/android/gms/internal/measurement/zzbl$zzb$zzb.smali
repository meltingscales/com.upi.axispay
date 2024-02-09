.class public final enum Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;
.super Ljava/lang/Enum;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzfc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzbl$zzb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzfc;"
    }
.end annotation


# static fields
.field private static final zztw:Lcom/google/android/gms/internal/measurement/zzfd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzfd<",
            "Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum zzue:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field public static final enum zzuf:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field public static final enum zzug:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field public static final enum zzuh:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field public static final enum zzui:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field public static final enum zzuj:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field public static final enum zzuk:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

.field private static final synthetic zzul:[Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;


# instance fields
.field private final value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v1, "UNKNOWN_MATCH_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzue:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 2
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v3, "REGEXP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuf:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 3
    new-instance v3, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v5, "BEGINS_WITH"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzug:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 4
    new-instance v5, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v7, "ENDS_WITH"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuh:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 5
    new-instance v7, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v9, "PARTIAL"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzui:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 6
    new-instance v9, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v11, "EXACT"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuj:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 7
    new-instance v11, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const-string v13, "IN_LIST"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuk:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    const/4 v13, 0x7

    new-array v13, v13, [Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 8
    sput-object v13, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzul:[Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    .line 9
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zztw:Lcom/google/android/gms/internal/measurement/zzfd;

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
    iput p3, p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->value:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzul:[Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object v0
.end method

.method public static zzg(I)Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuk:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    .line 2
    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuj:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    .line 3
    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzui:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    .line 4
    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuh:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    .line 5
    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzug:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    .line 6
    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzuf:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    .line 7
    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->zzue:Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static zzgq()Lcom/google/android/gms/internal/measurement/zzfe;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbq;->zzty:Lcom/google/android/gms/internal/measurement/zzfe;

    return-object v0
.end method


# virtual methods
.method public final zzgp()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbl$zzb$zzb;->value:I

    return v0
.end method
