.class public final Lcom/google/android/gms/internal/measurement/zzbt$zzh;
.super Lcom/google/android/gms/internal/measurement/zzez;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzgj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzbt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "zzh"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/measurement/zzbt$zzh$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzez<",
        "Lcom/google/android/gms/internal/measurement/zzbt$zzh;",
        "Lcom/google/android/gms/internal/measurement/zzbt$zzh$zza;",
        ">;",
        "Lcom/google/android/gms/internal/measurement/zzgj;"
    }
.end annotation


# static fields
.field private static volatile zztq:Lcom/google/android/gms/internal/measurement/zzgs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzgs<",
            "Lcom/google/android/gms/internal/measurement/zzbt$zzh;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;


# instance fields
.field private zztj:I

.field private zzux:Ljava/lang/String;

.field private zzuy:J

.field private zzva:Ljava/lang/String;

.field private zzvb:F

.field private zzvc:D

.field private zzvr:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    .line 2
    const-class v1, Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/measurement/zzez;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzez;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzux:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzva:Ljava/lang/String;

    return-void
.end method

.method private final setName(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    .line 3
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzux:Ljava/lang/String;

    return-void
.end method

.method private final zza(D)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    .line 2
    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvc:D

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbt$zzh;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzhm()V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbt$zzh;D)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zza(D)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbt$zzh;J)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzam(J)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbt$zzh;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->setName(Ljava/lang/String;)V

    return-void
.end method

.method private final zzah(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    .line 2
    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzuy:J

    return-void
.end method

.method private final zzam(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    .line 2
    iput-wide p1, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvr:J

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzbt$zzh;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzhp()V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzbt$zzh;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzah(J)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzbt$zzh;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzbv(Ljava/lang/String;)V

    return-void
.end method

.method private final zzbv(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    .line 3
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzva:Ljava/lang/String;

    return-void
.end method

.method public static synthetic zzc(Lcom/google/android/gms/internal/measurement/zzbt$zzh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzhs()V

    return-void
.end method

.method public static zzgs()Lcom/google/android/gms/internal/measurement/zzgs;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/measurement/zzgs<",
            "Lcom/google/android/gms/internal/measurement/zzbt$zzh;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    .line 2
    sget v1, Lcom/google/android/gms/internal/measurement/zzez$zze;->zzaha:I

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/measurement/zzez;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    check-cast v0, Lcom/google/android/gms/internal/measurement/zzgs;

    return-object v0
.end method

.method private final zzhm()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    .line 3
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzva:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzva:Ljava/lang/String;

    return-void
.end method

.method private final zzhp()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzuy:J

    return-void
.end method

.method private final zzhs()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvc:D

    return-void
.end method

.method public static zziu()Lcom/google/android/gms/internal/measurement/zzbt$zzh$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzez;->zzmg()Lcom/google/android/gms/internal/measurement/zzez$zza;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh$zza;

    return-object v0
.end method

.method public static synthetic zziv()Lcom/google/android/gms/internal/measurement/zzbt$zzh;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    return-object v0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzux:Ljava/lang/String;

    return-object v0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3
    sget-object p2, Lcom/google/android/gms/internal/measurement/zzbu;->zzti:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    .line 4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    .line 5
    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztq:Lcom/google/android/gms/internal/measurement/zzgs;

    if-nez p1, :cond_1

    .line 7
    const-class p2, Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    monitor-enter p2

    .line 8
    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztq:Lcom/google/android/gms/internal/measurement/zzgs;

    if-nez p1, :cond_0

    .line 9
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzez$zzb;

    sget-object p3, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/zzez$zzb;-><init>(Lcom/google/android/gms/internal/measurement/zzez;)V

    .line 10
    sput-object p1, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztq:Lcom/google/android/gms/internal/measurement/zzgs;

    .line 11
    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    .line 12
    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zztj"

    aput-object v0, p1, p2

    const-string p2, "zzvr"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzux"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzva"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzuy"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "zzvb"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "zzvc"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0008\u0001\u0003\u0008\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005"

    .line 13
    sget-object p3, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvs:Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    invoke-static {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/zzez;->zza(Lcom/google/android/gms/internal/measurement/zzgh;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 14
    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzbt$zzh$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/zzbt$zzh$zza;-><init>(Lcom/google/android/gms/internal/measurement/zzbu;)V

    return-object p1

    .line 15
    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/measurement/zzbt$zzh;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzbt$zzh;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzhk()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzhl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzva:Ljava/lang/String;

    return-object v0
.end method

.method public final zzhn()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzho()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzuy:J

    return-wide v0
.end method

.method public final zzhq()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzhr()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvc:D

    return-wide v0
.end method

.method public final zzis()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zztj:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzit()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzbt$zzh;->zzvr:J

    return-wide v0
.end method
