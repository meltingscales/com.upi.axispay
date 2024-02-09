.class public final Lcom/google/android/gms/internal/vision/zzho;
.super Lcom/google/android/gms/internal/vision/zzhm;
.source "AxisPay"


# instance fields
.field private final zza:Z

.field private final zzb:[B

.field private zzc:I

.field private final zzd:I

.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Z)V
    .locals 1

    const/4 p2, 0x0

    .line 1
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/vision/zzhm;-><init>(Lcom/google/android/gms/internal/vision/zzhp;)V

    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p0, Lcom/google/android/gms/internal/vision/zzho;->zza:Z

    .line 3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    .line 4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/2addr p2, v0

    iput p2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    iput p2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzd:I

    .line 5
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    add-int/2addr p2, p1

    iput p2, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/vision/zzml;Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/vision/zzml;",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 87
    sget-object v0, Lcom/google/android/gms/internal/vision/zzhp;->zza:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 88
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "unsupported field type."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 89
    :pswitch_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzf()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 90
    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzo()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    const/4 p1, 0x1

    .line 91
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zza(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 92
    :pswitch_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzt()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 93
    :pswitch_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzs()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 94
    :pswitch_5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzr()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 95
    :pswitch_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzq()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 96
    :pswitch_7
    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/internal/vision/zzho;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 97
    :pswitch_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzg()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 98
    :pswitch_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzh()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 99
    :pswitch_a
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zze()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    .line 100
    :pswitch_b
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzi()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 101
    :pswitch_c
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzj()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 102
    :pswitch_d
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzp()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 103
    :pswitch_e
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzd()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 104
    :pswitch_f
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzn()Lcom/google/android/gms/internal/vision/zzht;

    move-result-object p1

    return-object p1

    .line 105
    :pswitch_10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzk()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final zza(Z)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 4
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    .line 6
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    if-eqz p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int v2, v1, v0

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/vision/zzmd;->zza([BII)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzh()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1

    .line 9
    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    sget-object v3, Lcom/google/android/gms/internal/vision/zzjf;->zza:Ljava/nio/charset/Charset;

    invoke-direct {p1, v1, v2, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 10
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-object p1
.end method

.method private final zza(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 106
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    .line 107
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method private final zza(Ljava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 44
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjv;

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    .line 45
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjv;

    .line 46
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzn()Lcom/google/android/gms/internal/vision/zzht;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/vision/zzjv;->zza(Lcom/google/android/gms/internal/vision/zzht;)V

    .line 47
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 48
    :cond_1
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 49
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p2

    .line 50
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq p2, v1, :cond_0

    .line 51
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 52
    :cond_2
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/vision/zzho;->zza(Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 54
    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 55
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 56
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 57
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 58
    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method private final zzaa()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v0

    return-wide v0
.end method

.method private final zzab()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    add-int/lit8 v2, v0, 0x4

    .line 3
    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 4
    aget-byte v2, v1, v0

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v3, v0, 0x1

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v3, v1, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v0, v0, 0x3

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method private final zzac()J
    .locals 9

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    add-int/lit8 v2, v0, 0x8

    .line 3
    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 4
    aget-byte v2, v1, v0

    int-to-long v2, v2

    const-wide/16 v4, 0xff

    and-long/2addr v2, v4

    add-int/lit8 v6, v0, 0x1

    aget-byte v6, v1, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    add-int/lit8 v6, v0, 0x2

    aget-byte v6, v1, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    add-int/lit8 v6, v0, 0x3

    aget-byte v6, v1, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x18

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    add-int/lit8 v6, v0, 0x4

    aget-byte v6, v1, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x20

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    add-int/lit8 v6, v0, 0x5

    aget-byte v6, v1, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x28

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    add-int/lit8 v6, v0, 0x6

    aget-byte v6, v1, v6

    int-to-long v6, v6

    and-long/2addr v6, v4

    const/16 v8, 0x30

    shl-long/2addr v6, v8

    or-long/2addr v2, v6

    add-int/lit8 v0, v0, 0x7

    aget-byte v0, v1, v0

    int-to-long v0, v0

    and-long/2addr v0, v4

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method private final zzb(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 41
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zza()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
.end method

.method private final zzc(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/vision/zzlc<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 18
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    .line 19
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    .line 20
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v2, v0

    .line 21
    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    .line 22
    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzlc;->zza()Ljava/lang/Object;

    move-result-object v0

    .line 23
    invoke-interface {p1, v0, p0, p2}, Lcom/google/android/gms/internal/vision/zzlc;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzld;Lcom/google/android/gms/internal/vision/zzio;)V

    .line 24
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/vision/zzlc;->zzc(Ljava/lang/Object;)V

    .line 25
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, v2, :cond_0

    .line 26
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    return-object v0

    .line 27
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzg()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 28
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    .line 29
    throw p1
.end method

.method private final zzc(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 58
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    .line 59
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method private final zzd(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/vision/zzlc<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    .line 4
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    .line 5
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    .line 6
    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzlc;->zza()Ljava/lang/Object;

    move-result-object v1

    .line 7
    invoke-interface {p1, v1, p0, p2}, Lcom/google/android/gms/internal/vision/zzlc;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzld;Lcom/google/android/gms/internal/vision/zzio;)V

    .line 8
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/vision/zzlc;->zzc(Ljava/lang/Object;)V

    .line 9
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    iget p2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    .line 10
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    return-object v1

    .line 11
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzg()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    .line 13
    throw p1
.end method

.method private final zzd(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    and-int/lit8 p1, p1, 0x7

    if-nez p1, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzg()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
.end method

.method private final zze(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    and-int/lit8 p1, p1, 0x3

    if-nez p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzg()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
.end method

.method private final zzf(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 31
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ne v0, p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zza()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1
.end method

.method private final zzu()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzv()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 2
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    if-eq v1, v0, :cond_8

    .line 3
    iget-object v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    add-int/lit8 v3, v0, 0x1

    aget-byte v0, v2, v0

    if-ltz v0, :cond_0

    .line 4
    iput v3, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return v0

    :cond_0
    sub-int/2addr v1, v3

    const/16 v4, 0x9

    if-ge v1, v4, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzx()J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_1
    add-int/lit8 v1, v3, 0x1

    .line 6
    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v0, v3

    if-gez v0, :cond_2

    xor-int/lit8 v0, v0, -0x80

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 7
    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v0, v1

    if-ltz v0, :cond_4

    xor-int/lit16 v0, v0, 0x3f80

    :cond_3
    move v1, v3

    goto :goto_0

    :cond_4
    add-int/lit8 v1, v3, 0x1

    .line 8
    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x15

    xor-int/2addr v0, v3

    if-gez v0, :cond_5

    const v2, -0x1fc080

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_5
    add-int/lit8 v3, v1, 0x1

    .line 9
    aget-byte v1, v2, v1

    shl-int/lit8 v4, v1, 0x1c

    xor-int/2addr v0, v4

    const v4, 0xfe03f80

    xor-int/2addr v0, v4

    if-gez v1, :cond_3

    add-int/lit8 v1, v3, 0x1

    .line 10
    aget-byte v3, v2, v3

    if-gez v3, :cond_7

    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    if-gez v1, :cond_3

    add-int/lit8 v1, v3, 0x1

    aget-byte v3, v2, v3

    if-gez v3, :cond_7

    add-int/lit8 v3, v1, 0x1

    aget-byte v1, v2, v1

    if-gez v1, :cond_3

    add-int/lit8 v1, v3, 0x1

    aget-byte v2, v2, v3

    if-ltz v2, :cond_6

    goto :goto_0

    .line 11
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzc()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0

    .line 12
    :cond_7
    :goto_0
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return v0

    .line 13
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zza()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0
.end method

.method private final zzw()J
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 2
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    if-eq v1, v0, :cond_b

    .line 3
    iget-object v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    add-int/lit8 v3, v0, 0x1

    .line 4
    aget-byte v0, v2, v0

    if-ltz v0, :cond_0

    .line 5
    iput v3, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    sub-int/2addr v1, v3

    const/16 v4, 0x9

    if-ge v1, v4, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzx()J

    move-result-wide v0

    return-wide v0

    :cond_1
    add-int/lit8 v1, v3, 0x1

    .line 7
    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x7

    xor-int/2addr v0, v3

    if-gez v0, :cond_2

    xor-int/lit8 v0, v0, -0x80

    :goto_0
    int-to-long v2, v0

    goto/16 :goto_4

    :cond_2
    add-int/lit8 v3, v1, 0x1

    .line 8
    aget-byte v1, v2, v1

    shl-int/lit8 v1, v1, 0xe

    xor-int/2addr v0, v1

    if-ltz v0, :cond_3

    xor-int/lit16 v0, v0, 0x3f80

    int-to-long v0, v0

    move-wide v9, v0

    move v1, v3

    move-wide v2, v9

    goto/16 :goto_4

    :cond_3
    add-int/lit8 v1, v3, 0x1

    .line 9
    aget-byte v3, v2, v3

    shl-int/lit8 v3, v3, 0x15

    xor-int/2addr v0, v3

    if-gez v0, :cond_4

    const v2, -0x1fc080

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_4
    int-to-long v3, v0

    add-int/lit8 v0, v1, 0x1

    .line 10
    aget-byte v1, v2, v1

    int-to-long v5, v1

    const/16 v1, 0x1c

    shl-long/2addr v5, v1

    xor-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-ltz v1, :cond_5

    const-wide/32 v1, 0xfe03f80

    :goto_1
    xor-long v2, v3, v1

    move v1, v0

    goto :goto_4

    :cond_5
    add-int/lit8 v1, v0, 0x1

    .line 11
    aget-byte v0, v2, v0

    int-to-long v7, v0

    const/16 v0, 0x23

    shl-long/2addr v7, v0

    xor-long/2addr v3, v7

    cmp-long v0, v3, v5

    if-gez v0, :cond_6

    const-wide v5, -0x7f01fc080L

    :goto_2
    xor-long v2, v3, v5

    goto :goto_4

    :cond_6
    add-int/lit8 v0, v1, 0x1

    .line 12
    aget-byte v1, v2, v1

    int-to-long v7, v1

    const/16 v1, 0x2a

    shl-long/2addr v7, v1

    xor-long/2addr v3, v7

    cmp-long v1, v3, v5

    if-ltz v1, :cond_7

    const-wide v1, 0x3f80fe03f80L

    goto :goto_1

    :cond_7
    add-int/lit8 v1, v0, 0x1

    .line 13
    aget-byte v0, v2, v0

    int-to-long v7, v0

    const/16 v0, 0x31

    shl-long/2addr v7, v0

    xor-long/2addr v3, v7

    cmp-long v0, v3, v5

    if-gez v0, :cond_8

    const-wide v5, -0x1fc07f01fc080L

    goto :goto_2

    :cond_8
    add-int/lit8 v0, v1, 0x1

    .line 14
    aget-byte v1, v2, v1

    int-to-long v7, v1

    const/16 v1, 0x38

    shl-long/2addr v7, v1

    xor-long/2addr v3, v7

    const-wide v7, 0xfe03f80fe03f80L

    xor-long/2addr v3, v7

    cmp-long v1, v3, v5

    if-gez v1, :cond_a

    add-int/lit8 v1, v0, 0x1

    .line 15
    aget-byte v0, v2, v0

    int-to-long v7, v0

    cmp-long v0, v7, v5

    if-ltz v0, :cond_9

    goto :goto_3

    .line 16
    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzc()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0

    :cond_a
    move v1, v0

    :goto_3
    move-wide v2, v3

    .line 17
    :goto_4
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-wide v2

    .line 18
    :cond_b
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zza()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0
.end method

.method private final zzx()J
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x40

    if-ge v2, v3, :cond_1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzy()B

    move-result v3

    and-int/lit8 v4, v3, 0x7f

    int-to-long v4, v4

    shl-long/2addr v4, v2

    or-long/2addr v0, v4

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x7

    goto :goto_0

    .line 2
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzc()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0
.end method

.method private final zzy()B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    aget-byte v0, v1, v0

    return v0

    .line 3
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zza()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0
.end method

.method private final zzz()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x4

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    return v0
.end method


# virtual methods
.method public final zza()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    const v1, 0x7fffffff

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    .line 3
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/vision/zzlc<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/vision/zzho;->zzc(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 11
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 12
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/vision/zzho;->zzc(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 15
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzin;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 16
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzin;

    .line 17
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 19
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zzd(I)V

    .line 20
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 21
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 22
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/vision/zzin;->zza(D)V

    goto :goto_0

    :cond_0
    return-void

    .line 23
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 24
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzd()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzin;->zza(D)V

    .line 25
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 26
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 27
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 28
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 29
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 30
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    .line 31
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 32
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzd(I)V

    .line 33
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 34
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 35
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 36
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 37
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzd()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 39
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 40
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 41
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 42
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zza(Ljava/util/List;Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzlc<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 59
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    .line 60
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/vision/zzho;->zzc(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 62
    :cond_1
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 63
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v2

    if-eq v2, v0, :cond_0

    .line 64
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 65
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final zza(Ljava/util/Map;Lcom/google/android/gms/internal/vision/zzkf;Lcom/google/android/gms/internal/vision/zzio;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/vision/zzkf<",
            "TK;TV;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 66
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 67
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 68
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    .line 69
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    .line 70
    iget v3, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v3, v1

    .line 71
    iput v3, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    .line 72
    :try_start_0
    iget-object v1, p2, Lcom/google/android/gms/internal/vision/zzkf;->zzb:Ljava/lang/Object;

    .line 73
    iget-object v3, p2, Lcom/google/android/gms/internal/vision/zzkf;->zzd:Ljava/lang/Object;

    .line 74
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zza()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v5, 0x7fffffff

    if-eq v4, v5, :cond_4

    const/4 v5, 0x1

    const-string v6, "Unable to parse map entry."

    if-eq v4, v5, :cond_2

    if-eq v4, v0, :cond_1

    .line 75
    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzc()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    new-instance v4, Lcom/google/android/gms/internal/vision/zzjk;

    invoke-direct {v4, v6}, Lcom/google/android/gms/internal/vision/zzjk;-><init>(Ljava/lang/String;)V

    throw v4

    .line 77
    :cond_1
    iget-object v4, p2, Lcom/google/android/gms/internal/vision/zzkf;->zzc:Lcom/google/android/gms/internal/vision/zzml;

    iget-object v5, p2, Lcom/google/android/gms/internal/vision/zzkf;->zzd:Ljava/lang/Object;

    .line 78
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    .line 79
    invoke-direct {p0, v4, v5, p3}, Lcom/google/android/gms/internal/vision/zzho;->zza(Lcom/google/android/gms/internal/vision/zzml;Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    .line 80
    :cond_2
    iget-object v4, p2, Lcom/google/android/gms/internal/vision/zzkf;->zza:Lcom/google/android/gms/internal/vision/zzml;

    const/4 v5, 0x0

    invoke-direct {p0, v4, v5, v5}, Lcom/google/android/gms/internal/vision/zzho;->zza(Lcom/google/android/gms/internal/vision/zzml;Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Lcom/google/android/gms/internal/vision/zzjn; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 81
    :catch_0
    :try_start_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzc()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 82
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/vision/zzjk;

    invoke-direct {p1, v6}, Lcom/google/android/gms/internal/vision/zzjk;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_4
    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    return-void

    :catchall_0
    move-exception p1

    .line 85
    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    .line 86
    throw p1
.end method

.method public final zzb()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/vision/zzlc<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 4
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/vision/zzho;->zzd(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/vision/zzho;->zzd(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzja;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/vision/zzja;

    .line 8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_3

    if-ne v0, v1, :cond_2

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zze()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzja;->zza(F)V

    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 11
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 13
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_0

    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 15
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 16
    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 17
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zze(I)V

    .line 18
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 19
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_4

    .line 20
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzja;->zza(F)V

    goto :goto_0

    :cond_4
    return-void

    .line 21
    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    .line 22
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zze()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    .line 24
    :cond_7
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 25
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 26
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_6

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 28
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 29
    :cond_9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 30
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zze(I)V

    .line 31
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 32
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_a

    .line 33
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_a
    return-void
.end method

.method public final zzb(Ljava/util/List;Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzlc<",
            "TT;>;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 34
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_2

    .line 35
    :cond_0
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/vision/zzho;->zzd(Lcom/google/android/gms/internal/vision/zzlc;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 37
    :cond_1
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 38
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v2

    if-eq v2, v0, :cond_0

    .line 39
    iput v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 40
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final zzc(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 30
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjy;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 31
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjy;

    .line 32
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 33
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 34
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 35
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 36
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    goto :goto_0

    .line 37
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 38
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 39
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzf()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    .line 40
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 41
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 42
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 43
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 44
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 45
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 46
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 47
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 48
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 49
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 50
    :cond_5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 51
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 52
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzf()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 54
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 55
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 56
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 57
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzc()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_d

    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    if-ne v0, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    and-int/lit8 v3, v0, 0x7

    const/4 v4, 0x1

    if-eqz v3, :cond_8

    if-eq v3, v4, :cond_7

    const/4 v1, 0x2

    if-eq v3, v1, :cond_6

    const/4 v1, 0x4

    const/4 v5, 0x3

    if-eq v3, v5, :cond_2

    const/4 v0, 0x5

    if-ne v3, v0, :cond_1

    .line 2
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zza(I)V

    return v4

    .line 3
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object v0

    throw v0

    :cond_2
    ushr-int/2addr v0, v5

    shl-int/2addr v0, v5

    or-int/2addr v0, v1

    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    .line 5
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zza()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzc()Z

    move-result v0

    if-nez v0, :cond_3

    .line 6
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    if-ne v0, v1, :cond_5

    .line 7
    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzg:I

    return v4

    .line 8
    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzg()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0

    .line 9
    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zza(I)V

    return v4

    :cond_7
    const/16 v0, 0x8

    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zza(I)V

    return v4

    .line 11
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zze:I

    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    sub-int/2addr v0, v2

    const/16 v3, 0xa

    if-lt v0, v3, :cond_a

    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    move v5, v1

    :goto_0
    if-ge v5, v3, :cond_a

    add-int/lit8 v6, v2, 0x1

    .line 13
    aget-byte v2, v0, v2

    if-ltz v2, :cond_9

    .line 14
    iput v6, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    goto :goto_2

    :cond_9
    add-int/lit8 v5, v5, 0x1

    move v2, v6

    goto :goto_0

    :cond_a
    :goto_1
    if-ge v1, v3, :cond_c

    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzy()B

    move-result v0

    if-gez v0, :cond_b

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_b
    :goto_2
    return v4

    .line 16
    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzc()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object v0

    throw v0

    :cond_d
    :goto_3
    return v1
.end method

.method public final zzd()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzaa()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final zzd(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 14
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjy;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 15
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjy;

    .line 16
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 18
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 19
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 20
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    goto :goto_0

    .line 21
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 22
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 23
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzg()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    .line 24
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 25
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 27
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 28
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 29
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 30
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 31
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 32
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 33
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 34
    :cond_5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 35
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 36
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzg()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 38
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 39
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 40
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 41
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zze()F
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzz()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final zze(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjd;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 4
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjd;

    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 7
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 8
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 11
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzh()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 14
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 17
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 18
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 20
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 21
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 22
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 23
    :cond_5
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 24
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 25
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzh()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 27
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 28
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 29
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 30
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzf()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzf(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjy;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 4
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjy;

    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zzd(I)V

    .line 8
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 9
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    goto :goto_0

    :cond_0
    return-void

    .line 11
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzi()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 14
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 17
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 18
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 20
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzd(I)V

    .line 21
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 22
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 24
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 25
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzi()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 27
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 28
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 29
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 30
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzg()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzg(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjd;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    .line 4
    check-cast p1, Lcom/google/android/gms/internal/vision/zzjd;

    .line 5
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_3

    if-ne v0, v1, :cond_2

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzj()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 8
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 10
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_0

    .line 11
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 12
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 13
    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 14
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zze(I)V

    .line 15
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 16
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_4

    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    goto :goto_0

    :cond_4
    return-void

    .line 18
    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    .line 19
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzj()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    .line 21
    :cond_7
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 22
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 23
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_6

    .line 24
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 25
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 26
    :cond_9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 27
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zze(I)V

    .line 28
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 29
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_a

    .line 30
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_a
    return-void
.end method

.method public final zzh()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    return v0
.end method

.method public final zzh(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzhr;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_5

    .line 4
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzhr;

    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_3

    if-ne p1, v3, :cond_2

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 7
    iget v3, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v3, p1

    .line 8
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v3, :cond_1

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_1

    :cond_0
    move p1, v2

    :goto_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzhr;->zza(Z)V

    goto :goto_0

    .line 10
    :cond_1
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 11
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 12
    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzk()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzhr;->zza(Z)V

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_4

    return-void

    .line 14
    :cond_4
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_3

    .line 17
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 18
    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_9

    if-ne v0, v3, :cond_8

    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 20
    iget v3, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v3, v0

    .line 21
    :goto_2
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v3, :cond_7

    .line 22
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    goto :goto_3

    :cond_6
    move v0, v2

    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 23
    :cond_7
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/vision/zzho;->zzf(I)V

    return-void

    .line 24
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 25
    :cond_9
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzk()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_a

    return-void

    .line 27
    :cond_a
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 28
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 29
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_9

    .line 30
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzi()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzaa()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzi(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/vision/zzho;->zza(Ljava/util/List;Z)V

    return-void
.end method

.method public final zzj()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzz()I

    move-result v0

    return v0
.end method

.method public final zzj(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/vision/zzho;->zza(Ljava/util/List;Z)V

    return-void
.end method

.method public final zzk(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/vision/zzht;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzn()Lcom/google/android/gms/internal/vision/zzht;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 6
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 8
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_0

    .line 9
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 10
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1
.end method

.method public final zzk()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zza(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzl(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjd;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 3
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjd;

    .line 4
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 6
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 7
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    goto :goto_0

    :cond_0
    return-void

    .line 9
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 10
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzo()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 12
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 14
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 15
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 16
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 18
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 19
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 20
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 21
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 22
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzo()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 24
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 25
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 26
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzm()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zza(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzm(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjd;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 3
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjd;

    .line 4
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 6
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 7
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    goto :goto_0

    :cond_0
    return-void

    .line 9
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 10
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzp()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 12
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 14
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 15
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 16
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 18
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 19
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 20
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 21
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 22
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzp()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 24
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 25
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 26
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzn()Lcom/google/android/gms/internal/vision/zzht;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    sget-object v0, Lcom/google/android/gms/internal/vision/zzht;->zza:Lcom/google/android/gms/internal/vision/zzht;

    return-object v0

    .line 4
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzb(I)V

    .line 5
    iget-boolean v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zza:Z

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/vision/zzht;->zzb([BII)Lcom/google/android/gms/internal/vision/zzht;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzb:[B

    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/vision/zzht;->zza([BII)Lcom/google/android/gms/internal/vision/zzht;

    move-result-object v1

    .line 8
    :goto_0
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v2, v0

    iput v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-object v1
.end method

.method public final zzn(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjd;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    .line 10
    check-cast p1, Lcom/google/android/gms/internal/vision/zzjd;

    .line 11
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_3

    if-ne v0, v1, :cond_2

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzq()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 14
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_0

    .line 17
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 18
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 19
    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 20
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zze(I)V

    .line 21
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 22
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_4

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    goto :goto_0

    :cond_4
    return-void

    .line 24
    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    .line 25
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzq()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    .line 27
    :cond_7
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 28
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 29
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_6

    .line 30
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 31
    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 32
    :cond_9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 33
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zze(I)V

    .line 34
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 35
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_a

    .line 36
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzab()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_a
    return-void
.end method

.method public final zzo()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    return v0
.end method

.method public final zzo(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjy;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    .line 4
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjy;

    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/vision/zzho;->zzd(I)V

    .line 8
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 9
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 10
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    goto :goto_0

    :cond_0
    return-void

    .line 11
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 12
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzr()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 14
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 15
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 16
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 17
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 18
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    .line 19
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 20
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzd(I)V

    .line 21
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 22
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 23
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzac()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 24
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 25
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzr()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 27
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 28
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 29
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 30
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzp()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    return v0
.end method

.method public final zzp(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjd;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 4
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjd;

    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 7
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 8
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/vision/zzif;->zze(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    goto :goto_0

    :cond_0
    return-void

    .line 10
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzs()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/vision/zzjd;->zzc(I)V

    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 13
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 14
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 15
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 16
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 17
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 19
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 20
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/vision/zzif;->zze(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 22
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 23
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzs()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 25
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 27
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 28
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzq()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzz()I

    move-result v0

    return v0
.end method

.method public final zzq(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    instance-of v0, p1, Lcom/google/android/gms/internal/vision/zzjy;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    .line 4
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjy;

    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result p1

    .line 7
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, p1

    .line 8
    :goto_0
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge p1, v1, :cond_0

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/vision/zzif;->zza(J)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    goto :goto_0

    :cond_0
    return-void

    .line 10
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzt()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzjy;->zza(J)V

    .line 12
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 13
    :cond_3
    iget p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 14
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 15
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_2

    .line 16
    iput p1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void

    .line 17
    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    .line 19
    iget v1, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    add-int/2addr v1, v0

    .line 20
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    if-ge v0, v1, :cond_5

    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/vision/zzif;->zza(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-void

    .line 22
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zzf()Lcom/google/android/gms/internal/vision/zzjn;

    move-result-object p1

    throw p1

    .line 23
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzt()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzu()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 25
    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    .line 26
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v1

    .line 27
    iget v2, p0, Lcom/google/android/gms/internal/vision/zzho;->zzf:I

    if-eq v1, v2, :cond_7

    .line 28
    iput v0, p0, Lcom/google/android/gms/internal/vision/zzho;->zzc:I

    return-void
.end method

.method public final zzr()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzaa()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzs()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzv()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/vision/zzif;->zze(I)I

    move-result v0

    return v0
.end method

.method public final zzt()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/vision/zzho;->zzc(I)V

    .line 2
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zzho;->zzw()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/vision/zzif;->zza(J)J

    move-result-wide v0

    return-wide v0
.end method
