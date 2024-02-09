.class public final Lcom/google/android/gms/internal/measurement/zzce;
.super Lcom/google/android/gms/internal/measurement/zzip;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzip<",
        "Lcom/google/android/gms/internal/measurement/zzce;",
        ">;"
    }
.end annotation


# instance fields
.field public zzch:Ljava/lang/String;

.field public zzxa:Ljava/lang/Long;

.field private zzxb:Ljava/lang/Integer;

.field public zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

.field public zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

.field public zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

.field private zzxf:Ljava/lang/String;

.field public zzxg:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzip;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzbr$zza;

    .line 5
    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    .line 6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzcd;->zzje()[Lcom/google/android/gms/internal/measurement/zzcd;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbx;->zziz()[Lcom/google/android/gms/internal/measurement/zzbx;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzanm:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzce;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzce;

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 4
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    if-eqz v1, :cond_3

    return v2

    .line 5
    :cond_2
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 6
    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 7
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    if-eqz v1, :cond_5

    return v2

    .line 8
    :cond_4
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    .line 9
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    if-nez v1, :cond_6

    .line 10
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    if-eqz v1, :cond_7

    return v2

    .line 11
    :cond_6
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    .line 12
    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzit;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    .line 13
    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzit;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    .line 14
    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    invoke-static {v1, v3}, Lcom/google/android/gms/internal/measurement/zzit;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    .line 15
    :cond_a
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    if-nez v1, :cond_b

    .line 16
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    if-eqz v1, :cond_c

    return v2

    .line 17
    :cond_b
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    .line 18
    :cond_c
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    if-nez v1, :cond_d

    .line 19
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    if-eqz v1, :cond_e

    return v2

    .line 20
    :cond_d
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    .line 21
    :cond_e
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzir;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    goto :goto_0

    .line 22
    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzir;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 23
    :cond_10
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzir;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_1

    :cond_11
    return v2

    :cond_12
    :goto_1
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const-class v0, Lcom/google/android/gms/internal/measurement/zzce;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    .line 6
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzit;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    .line 8
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzit;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    .line 10
    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzit;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 12
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 13
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzir;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_5

    .line 14
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzir;->hashCode()I

    move-result v2

    :cond_6
    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/measurement/zzim;)Lcom/google/android/gms/internal/measurement/zziv;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 24
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkj()I

    move-result v0

    if-eqz v0, :cond_12

    const/16 v1, 0x8

    if-eq v0, v1, :cond_11

    const/16 v1, 0x12

    if-eq v0, v1, :cond_10

    const/16 v1, 0x18

    if-eq v0, v1, :cond_f

    const/16 v1, 0x22

    const/4 v2, 0x0

    if-eq v0, v1, :cond_b

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_3

    const/16 v1, 0x3a

    if-eq v0, v1, :cond_2

    const/16 v1, 0x40

    if-eq v0, v1, :cond_1

    .line 25
    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzip;->zza(Lcom/google/android/gms/internal/measurement/zzim;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkp()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    goto :goto_0

    .line 28
    :cond_3
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Lcom/google/android/gms/internal/measurement/zzim;I)I

    move-result v0

    .line 29
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    if-nez v1, :cond_4

    move v3, v2

    goto :goto_1

    :cond_4
    array-length v3, v1

    :goto_1
    add-int/2addr v0, v3

    .line 30
    new-array v4, v0, [Lcom/google/android/gms/internal/measurement/zzbx;

    if-eqz v3, :cond_5

    .line 31
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_5
    :goto_2
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_6

    .line 32
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbx;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzbx;-><init>()V

    aput-object v1, v4, v3

    .line 33
    aget-object v1, v4, v3

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zziv;)V

    .line 34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 35
    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzbx;-><init>()V

    aput-object v0, v4, v3

    .line 36
    aget-object v0, v4, v3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zziv;)V

    .line 37
    iput-object v4, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    goto :goto_0

    .line 38
    :cond_7
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Lcom/google/android/gms/internal/measurement/zzim;I)I

    move-result v0

    .line 39
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    if-nez v1, :cond_8

    move v3, v2

    goto :goto_3

    :cond_8
    array-length v3, v1

    :goto_3
    add-int/2addr v0, v3

    .line 40
    new-array v4, v0, [Lcom/google/android/gms/internal/measurement/zzcd;

    if-eqz v3, :cond_9

    .line 41
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_9
    :goto_4
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_a

    .line 42
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzcd;-><init>()V

    aput-object v1, v4, v3

    .line 43
    aget-object v1, v4, v3

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zziv;)V

    .line 44
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 45
    :cond_a
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcd;-><init>()V

    aput-object v0, v4, v3

    .line 46
    aget-object v0, v4, v3

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zziv;)V

    .line 47
    iput-object v4, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    goto/16 :goto_0

    .line 48
    :cond_b
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/zziy;->zzb(Lcom/google/android/gms/internal/measurement/zzim;I)I

    move-result v0

    .line 49
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    if-nez v1, :cond_c

    move v3, v2

    goto :goto_5

    :cond_c
    array-length v3, v1

    :goto_5
    add-int/2addr v0, v3

    .line 50
    new-array v4, v0, [Lcom/google/android/gms/internal/measurement/zzbr$zza;

    if-eqz v3, :cond_d

    .line 51
    invoke-static {v1, v2, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_d
    :goto_6
    add-int/lit8 v1, v0, -0x1

    if-ge v3, v1, :cond_e

    .line 52
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbr$zza;->zzgs()Lcom/google/android/gms/internal/measurement/zzgs;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zzgs;)Lcom/google/android/gms/internal/measurement/zzez;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzbr$zza;

    aput-object v1, v4, v3

    .line 53
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkj()I

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    .line 54
    :cond_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbr$zza;->zzgs()Lcom/google/android/gms/internal/measurement/zzgs;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zzgs;)Lcom/google/android/gms/internal/measurement/zzez;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzbr$zza;

    aput-object v0, v4, v3

    .line 55
    iput-object v4, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    goto/16 :goto_0

    .line 56
    :cond_f
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzlb()I

    move-result v0

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    goto/16 :goto_0

    .line 58
    :cond_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    goto/16 :goto_0

    .line 59
    :cond_11
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzlc()J

    move-result-wide v0

    .line 60
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    goto/16 :goto_0

    :cond_12
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzin;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzi(IJ)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    .line 4
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILjava/lang/String;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    .line 6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zzc(II)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lez v0, :cond_4

    move v0, v1

    .line 8
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    array-length v3, v2

    if-ge v0, v3, :cond_4

    .line 9
    aget-object v2, v2, v0

    if-eqz v2, :cond_3

    const/4 v3, 0x4

    .line 10
    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzin;->zze(ILcom/google/android/gms/internal/measurement/zzgh;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 11
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    if-eqz v0, :cond_6

    array-length v0, v0

    if-lez v0, :cond_6

    move v0, v1

    .line 12
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    array-length v3, v2

    if-ge v0, v3, :cond_6

    .line 13
    aget-object v2, v2, v0

    if-eqz v2, :cond_5

    const/4 v3, 0x5

    .line 14
    invoke-virtual {p1, v3, v2}, Lcom/google/android/gms/internal/measurement/zzin;->zza(ILcom/google/android/gms/internal/measurement/zziv;)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 15
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    if-eqz v0, :cond_8

    array-length v0, v0

    if-lez v0, :cond_8

    .line 16
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    array-length v2, v0

    if-ge v1, v2, :cond_8

    .line 17
    aget-object v0, v0, v1

    if-eqz v0, :cond_7

    const/4 v2, 0x6

    .line 18
    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zza(ILcom/google/android/gms/internal/measurement/zziv;)V

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 19
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    if-eqz v0, :cond_9

    const/4 v1, 0x7

    .line 20
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILjava/lang/String;)V

    .line 21
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    const/16 v1, 0x8

    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(IZ)V

    .line 23
    :cond_a
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzip;->zza(Lcom/google/android/gms/internal/measurement/zzin;)V

    return-void
.end method

.method public final zzja()I
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzip;->zzja()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxa:Ljava/lang/Long;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzin;->zzd(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzch:Ljava/lang/String;

    if-eqz v1, :cond_1

    const/4 v3, 0x2

    .line 5
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxb:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    const/4 v3, 0x3

    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzg(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 8
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    array-length v1, v1

    if-lez v1, :cond_4

    move v1, v3

    .line 9
    :goto_0
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxc:[Lcom/google/android/gms/internal/measurement/zzbr$zza;

    array-length v5, v4

    if-ge v1, v5, :cond_4

    .line 10
    aget-object v4, v4, v1

    if-eqz v4, :cond_3

    const/4 v5, 0x4

    .line 11
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/measurement/zzeg;->zzc(ILcom/google/android/gms/internal/measurement/zzgh;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    if-eqz v1, :cond_6

    array-length v1, v1

    if-lez v1, :cond_6

    move v1, v3

    .line 13
    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxd:[Lcom/google/android/gms/internal/measurement/zzcd;

    array-length v5, v4

    if-ge v1, v5, :cond_6

    .line 14
    aget-object v4, v4, v1

    if-eqz v4, :cond_5

    const/4 v5, 0x5

    .line 15
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILcom/google/android/gms/internal/measurement/zziv;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 16
    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    if-eqz v1, :cond_8

    array-length v1, v1

    if-lez v1, :cond_8

    .line 17
    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxe:[Lcom/google/android/gms/internal/measurement/zzbx;

    array-length v4, v1

    if-ge v3, v4, :cond_8

    .line 18
    aget-object v1, v1, v3

    if-eqz v1, :cond_7

    const/4 v4, 0x6

    .line 19
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILcom/google/android/gms/internal/measurement/zziv;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 20
    :cond_8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxf:Ljava/lang/String;

    if-eqz v1, :cond_9

    const/4 v3, 0x7

    .line 21
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 22
    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzce;->zzxg:Ljava/lang/Boolean;

    if-eqz v1, :cond_a

    const/16 v3, 0x8

    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzin;->zzaj(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    :cond_a
    return v0
.end method
