.class public final Lcom/google/android/gms/internal/measurement/zzbz;
.super Lcom/google/android/gms/internal/measurement/zzip;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/measurement/zzip<",
        "Lcom/google/android/gms/internal/measurement/zzbz;",
        ">;"
    }
.end annotation


# static fields
.field private static volatile zzwf:[Lcom/google/android/gms/internal/measurement/zzbz;


# instance fields
.field public zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

.field public zzwh:Lcom/google/android/gms/internal/measurement/zzca;

.field public zzwi:Ljava/lang/Boolean;

.field public zzwj:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzip;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    .line 3
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    .line 4
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcom/google/android/gms/internal/measurement/zziv;->zzanm:I

    return-void
.end method

.method public static zzjc()[Lcom/google/android/gms/internal/measurement/zzbz;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwf:[Lcom/google/android/gms/internal/measurement/zzbz;

    if-nez v0, :cond_1

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzit;->zzanl:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwf:[Lcom/google/android/gms/internal/measurement/zzbz;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/google/android/gms/internal/measurement/zzbz;

    .line 4
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwf:[Lcom/google/android/gms/internal/measurement/zzbz;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwf:[Lcom/google/android/gms/internal/measurement/zzbz;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/measurement/zzbz;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/zzbz;

    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    if-nez v1, :cond_2

    .line 4
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    if-eqz v1, :cond_3

    return v2

    .line 5
    :cond_2
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzcc;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    .line 6
    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    if-nez v1, :cond_4

    .line 7
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    if-eqz v1, :cond_5

    return v2

    .line 8
    :cond_4
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/zzca;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    .line 9
    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    .line 10
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    return v2

    .line 11
    :cond_6
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    .line 12
    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    if-nez v1, :cond_8

    .line 13
    iget-object v1, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    if-eqz v1, :cond_9

    return v2

    .line 14
    :cond_8
    iget-object v3, p1, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    .line 15
    :cond_9
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzir;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_0

    .line 16
    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzir;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 17
    :cond_b
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzir;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_c

    goto :goto_1

    :cond_c
    return v2

    :cond_d
    :goto_1
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const-class v0, Lcom/google/android/gms/internal/measurement/zzbz;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    mul-int/lit8 v0, v0, 0x1f

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzcc;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    mul-int/lit8 v0, v0, 0x1f

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzca;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzir;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    .line 9
    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzip;->zzand:Lcom/google/android/gms/internal/measurement/zzir;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzir;->hashCode()I

    move-result v2

    :cond_5
    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public final synthetic zza(Lcom/google/android/gms/internal/measurement/zzim;)Lcom/google/android/gms/internal/measurement/zziv;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkj()I

    move-result v0

    if-eqz v0, :cond_7

    const/16 v1, 0xa

    if-eq v0, v1, :cond_5

    const/16 v1, 0x12

    if-eq v0, v1, :cond_3

    const/16 v1, 0x18

    if-eq v0, v1, :cond_2

    const/16 v1, 0x22

    if-eq v0, v1, :cond_1

    .line 11
    invoke-super {p0, p1, v0}, Lcom/google/android/gms/internal/measurement/zzip;->zza(Lcom/google/android/gms/internal/measurement/zzim;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 12
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzim;->zzkp()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    goto :goto_0

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    if-nez v0, :cond_4

    .line 15
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzca;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzca;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zziv;)V

    goto :goto_0

    .line 17
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    if-nez v0, :cond_6

    .line 18
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzcc;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    .line 19
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzim;->zza(Lcom/google/android/gms/internal/measurement/zziv;)V

    goto :goto_0

    :cond_7
    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzin;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 2
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zza(ILcom/google/android/gms/internal/measurement/zziv;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    .line 4
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zza(ILcom/google/android/gms/internal/measurement/zziv;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    const/4 v1, 0x3

    .line 6
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(IZ)V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    if-eqz v0, :cond_3

    const/4 v1, 0x4

    .line 8
    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILjava/lang/String;)V

    .line 9
    :cond_3
    invoke-super {p0, p1}, Lcom/google/android/gms/internal/measurement/zzip;->zza(Lcom/google/android/gms/internal/measurement/zzin;)V

    return-void
.end method

.method public final zzja()I
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzip;->zzja()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwg:Lcom/google/android/gms/internal/measurement/zzcc;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILcom/google/android/gms/internal/measurement/zziv;)I

    move-result v1

    add-int/2addr v0, v1

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwh:Lcom/google/android/gms/internal/measurement/zzca;

    if-eqz v1, :cond_1

    const/4 v3, 0x2

    .line 5
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzb(ILcom/google/android/gms/internal/measurement/zziv;)I

    move-result v1

    add-int/2addr v0, v1

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwi:Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    const/4 v3, 0x3

    .line 7
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/zzin;->zzaj(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    .line 9
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbz;->zzwj:Ljava/lang/String;

    if-eqz v1, :cond_3

    const/4 v2, 0x4

    .line 10
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/measurement/zzin;->zzc(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    return v0
.end method
