.class public final Lcom/google/android/gms/internal/vision/zzip;
.super Lcom/google/android/gms/internal/vision/zziq;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/vision/zziq<",
        "Lcom/google/android/gms/internal/vision/zzjb$zzf;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/zziq;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/util/Map$Entry;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)I"
        }
    .end annotation

    .line 45
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/vision/zzjb$zzf;

    .line 46
    iget p1, p1, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    return p1
.end method

.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/zziu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/internal/vision/zziu<",
            "Lcom/google/android/gms/internal/vision/zzjb$zzf;",
            ">;"
        }
    .end annotation

    .line 2
    check-cast p1, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    iget-object p1, p1, Lcom/google/android/gms/internal/vision/zzjb$zzc;->zzc:Lcom/google/android/gms/internal/vision/zziu;

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/vision/zzio;Lcom/google/android/gms/internal/vision/zzkk;I)Ljava/lang/Object;
    .locals 0

    .line 155
    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/vision/zzio;->zza(Lcom/google/android/gms/internal/vision/zzkk;I)Lcom/google/android/gms/internal/vision/zzjb$zze;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lcom/google/android/gms/internal/vision/zzld;Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzio;Lcom/google/android/gms/internal/vision/zziu;Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzlu;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<UT:",
            "Ljava/lang/Object;",
            "UB:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/vision/zzld;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            "Lcom/google/android/gms/internal/vision/zziu<",
            "Lcom/google/android/gms/internal/vision/zzjb$zzf;",
            ">;TUB;",
            "Lcom/google/android/gms/internal/vision/zzlu<",
            "TUT;TUB;>;)TUB;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    check-cast p2, Lcom/google/android/gms/internal/vision/zzjb$zze;

    .line 4
    iget-object v0, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzd:Lcom/google/android/gms/internal/vision/zzjb$zzf;

    .line 5
    iget v1, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 6
    iget-boolean v2, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzd:Z

    .line 7
    iget-object v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzc:Lcom/google/android/gms/internal/vision/zzml;

    .line 8
    sget-object v2, Lcom/google/android/gms/internal/vision/zzml;->zzn:Lcom/google/android/gms/internal/vision/zzml;

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    .line 9
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzh()I

    move-result p1

    .line 10
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/vision/zzjh;->zza(I)Lcom/google/android/gms/internal/vision/zzje;

    move-result-object p3

    if-nez p3, :cond_0

    .line 11
    invoke-static {v1, p1, p5, p6}, Lcom/google/android/gms/internal/vision/zzle;->zza(IILjava/lang/Object;Lcom/google/android/gms/internal/vision/zzlu;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 12
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto/16 :goto_0

    .line 13
    :cond_1
    sget-object p6, Lcom/google/android/gms/internal/vision/zzis;->zza:[I

    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p6, p6, v0

    packed-switch p6, :pswitch_data_0

    goto/16 :goto_0

    .line 15
    :pswitch_0
    iget-object p6, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzc:Lcom/google/android/gms/internal/vision/zzkk;

    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    .line 17
    invoke-interface {p1, p6, p3}, Lcom/google/android/gms/internal/vision/zzld;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object v3

    goto/16 :goto_0

    .line 18
    :pswitch_1
    iget-object p6, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzc:Lcom/google/android/gms/internal/vision/zzkk;

    .line 19
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    .line 20
    invoke-interface {p1, p6, p3}, Lcom/google/android/gms/internal/vision/zzld;->zzb(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object v3

    goto/16 :goto_0

    .line 21
    :pswitch_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzl()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_0

    .line 22
    :pswitch_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzn()Lcom/google/android/gms/internal/vision/zzht;

    move-result-object v3

    goto/16 :goto_0

    .line 23
    :pswitch_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :pswitch_5
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzt()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto/16 :goto_0

    .line 25
    :pswitch_6
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzs()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    .line 26
    :pswitch_7
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzr()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    .line 27
    :pswitch_8
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzq()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    .line 28
    :pswitch_9
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzo()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    .line 29
    :pswitch_a
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzk()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_0

    .line 30
    :pswitch_b
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzj()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    .line 31
    :pswitch_c
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzi()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    .line 32
    :pswitch_d
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzh()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_0

    .line 33
    :pswitch_e
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzf()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    .line 34
    :pswitch_f
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzg()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_0

    .line 35
    :pswitch_10
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zze()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto :goto_0

    .line 36
    :pswitch_11
    invoke-interface {p1}, Lcom/google/android/gms/internal/vision/zzld;->zzd()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    .line 37
    :goto_0
    iget-object p1, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzd:Lcom/google/android/gms/internal/vision/zzjb$zzf;

    iget-boolean p3, p1, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzd:Z

    if-eqz p3, :cond_2

    .line 38
    invoke-virtual {p4, p1, v3}, Lcom/google/android/gms/internal/vision/zziu;->zzb(Lcom/google/android/gms/internal/vision/zziw;Ljava/lang/Object;)V

    goto :goto_2

    .line 39
    :cond_2
    sget-object p3, Lcom/google/android/gms/internal/vision/zzis;->zza:[I

    .line 40
    iget-object p1, p1, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzc:Lcom/google/android/gms/internal/vision/zzml;

    .line 41
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/16 p3, 0x11

    if-eq p1, p3, :cond_3

    const/16 p3, 0x12

    if-eq p1, p3, :cond_3

    goto :goto_1

    .line 42
    :cond_3
    iget-object p1, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzd:Lcom/google/android/gms/internal/vision/zzjb$zzf;

    invoke-virtual {p4, p1}, Lcom/google/android/gms/internal/vision/zziu;->zza(Lcom/google/android/gms/internal/vision/zziw;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 43
    invoke-static {p1, v3}, Lcom/google/android/gms/internal/vision/zzjf;->zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 44
    :cond_4
    :goto_1
    iget-object p1, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzd:Lcom/google/android/gms/internal/vision/zzjb$zzf;

    invoke-virtual {p4, p1, v3}, Lcom/google/android/gms/internal/vision/zziu;->zza(Lcom/google/android/gms/internal/vision/zziw;Ljava/lang/Object;)V

    :goto_2
    return-object p5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
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

.method public final zza(Lcom/google/android/gms/internal/vision/zzht;Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzio;Lcom/google/android/gms/internal/vision/zziu;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/vision/zzht;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            "Lcom/google/android/gms/internal/vision/zziu<",
            "Lcom/google/android/gms/internal/vision/zzjb$zzf;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 160
    check-cast p2, Lcom/google/android/gms/internal/vision/zzjb$zze;

    .line 161
    iget-object v0, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzc:Lcom/google/android/gms/internal/vision/zzkk;

    .line 162
    invoke-interface {v0}, Lcom/google/android/gms/internal/vision/zzkk;->zzq()Lcom/google/android/gms/internal/vision/zzkn;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/vision/zzkn;->zze()Lcom/google/android/gms/internal/vision/zzkk;

    move-result-object v0

    .line 163
    invoke-virtual {p1}, Lcom/google/android/gms/internal/vision/zzht;->zza()I

    move-result v1

    if-nez v1, :cond_0

    .line 164
    sget-object p1, Lcom/google/android/gms/internal/vision/zzjf;->zzb:[B

    goto :goto_0

    .line 165
    :cond_0
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 166
    invoke-virtual {p1, v2, v3, v3, v1}, Lcom/google/android/gms/internal/vision/zzht;->zza([BIII)V

    move-object p1, v2

    .line 167
    :goto_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 168
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 169
    new-instance v1, Lcom/google/android/gms/internal/vision/zzho;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/vision/zzho;-><init>(Ljava/nio/ByteBuffer;Z)V

    .line 170
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object p1

    .line 171
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object p1

    invoke-interface {p1, v0, v1, p3}, Lcom/google/android/gms/internal/vision/zzlc;->zza(Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzld;Lcom/google/android/gms/internal/vision/zzio;)V

    .line 172
    iget-object p1, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzd:Lcom/google/android/gms/internal/vision/zzjb$zzf;

    invoke-virtual {p4, p1, v0}, Lcom/google/android/gms/internal/vision/zziu;->zza(Lcom/google/android/gms/internal/vision/zziw;Ljava/lang/Object;)V

    .line 173
    invoke-interface {v1}, Lcom/google/android/gms/internal/vision/zzld;->zza()I

    move-result p1

    const p2, 0x7fffffff

    if-ne p1, p2, :cond_1

    return-void

    .line 174
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzjk;->zze()Lcom/google/android/gms/internal/vision/zzjk;

    move-result-object p1

    throw p1

    .line 175
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Direct buffers not yet supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/vision/zzld;Ljava/lang/Object;Lcom/google/android/gms/internal/vision/zzio;Lcom/google/android/gms/internal/vision/zziu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/vision/zzld;",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/vision/zzio;",
            "Lcom/google/android/gms/internal/vision/zziu<",
            "Lcom/google/android/gms/internal/vision/zzjb$zzf;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 156
    check-cast p2, Lcom/google/android/gms/internal/vision/zzjb$zze;

    .line 157
    iget-object v0, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzc:Lcom/google/android/gms/internal/vision/zzkk;

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {p1, v0, p3}, Lcom/google/android/gms/internal/vision/zzld;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/vision/zzio;)Ljava/lang/Object;

    move-result-object p1

    .line 159
    iget-object p2, p2, Lcom/google/android/gms/internal/vision/zzjb$zze;->zzd:Lcom/google/android/gms/internal/vision/zzjb$zzf;

    invoke-virtual {p4, p2, p1}, Lcom/google/android/gms/internal/vision/zziu;->zza(Lcom/google/android/gms/internal/vision/zziw;Ljava/lang/Object;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/vision/zzmr;Ljava/util/Map$Entry;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/vision/zzmr;",
            "Ljava/util/Map$Entry<",
            "**>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 47
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;

    .line 48
    iget-boolean v1, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzd:Z

    if-eqz v1, :cond_2

    .line 49
    sget-object v1, Lcom/google/android/gms/internal/vision/zzis;->zza:[I

    .line 50
    iget-object v2, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzc:Lcom/google/android/gms/internal/vision/zzml;

    .line 51
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 52
    :pswitch_0
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    .line 53
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 54
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 55
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 56
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object v1

    .line 57
    invoke-static {v0, p2, p1, v1}, Lcom/google/android/gms/internal/vision/zzle;->zza(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Lcom/google/android/gms/internal/vision/zzlc;)V

    goto/16 :goto_0

    .line 58
    :pswitch_1
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    .line 59
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 60
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 61
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 62
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object v1

    .line 63
    invoke-static {v0, p2, p1, v1}, Lcom/google/android/gms/internal/vision/zzle;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Lcom/google/android/gms/internal/vision/zzlc;)V

    :cond_0
    return-void

    .line 64
    :pswitch_2
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 65
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 66
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/vision/zzle;->zza(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;)V

    return-void

    .line 67
    :pswitch_3
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 68
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 69
    invoke-static {v0, p2, p1}, Lcom/google/android/gms/internal/vision/zzle;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;)V

    return-void

    .line 70
    :pswitch_4
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 71
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 72
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 73
    :pswitch_5
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 74
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 75
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zze(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 76
    :pswitch_6
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 77
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 78
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzj(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 79
    :pswitch_7
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 80
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 81
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzg(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 82
    :pswitch_8
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 83
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 84
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzl(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 85
    :pswitch_9
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 86
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 87
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzi(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 88
    :pswitch_a
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 89
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 90
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzn(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 91
    :pswitch_b
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 92
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 93
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzk(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 94
    :pswitch_c
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 95
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 96
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzf(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 97
    :pswitch_d
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 98
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 99
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzh(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 100
    :pswitch_e
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 101
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 102
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzd(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 103
    :pswitch_f
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 104
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 105
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzc(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 106
    :pswitch_10
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 107
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 108
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zzb(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    return-void

    .line 109
    :pswitch_11
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 110
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 111
    invoke-static {v0, p2, p1, v2}, Lcom/google/android/gms/internal/vision/zzle;->zza(ILjava/util/List;Lcom/google/android/gms/internal/vision/zzmr;Z)V

    :cond_1
    :goto_0
    return-void

    .line 112
    :cond_2
    sget-object v1, Lcom/google/android/gms/internal/vision/zzis;->zza:[I

    .line 113
    iget-object v2, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzc:Lcom/google/android/gms/internal/vision/zzml;

    .line 114
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_1

    .line 115
    :pswitch_12
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 116
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 117
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object p2

    .line 118
    invoke-interface {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/zzlc;)V

    goto/16 :goto_1

    .line 119
    :pswitch_13
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 120
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 121
    invoke-static {}, Lcom/google/android/gms/internal/vision/zzky;->zza()Lcom/google/android/gms/internal/vision/zzky;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/vision/zzky;->zza(Ljava/lang/Class;)Lcom/google/android/gms/internal/vision/zzlc;

    move-result-object p2

    .line 122
    invoke-interface {p1, v0, v1, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zzb(ILjava/lang/Object;Lcom/google/android/gms/internal/vision/zzlc;)V

    return-void

    .line 123
    :pswitch_14
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 124
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(ILjava/lang/String;)V

    return-void

    .line 125
    :pswitch_15
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 126
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/vision/zzht;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(ILcom/google/android/gms/internal/vision/zzht;)V

    return-void

    .line 127
    :pswitch_16
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 128
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zzc(II)V

    return-void

    .line 129
    :pswitch_17
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 130
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzmr;->zze(IJ)V

    return-void

    .line 131
    :pswitch_18
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 132
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zzf(II)V

    return-void

    .line 133
    :pswitch_19
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 134
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzmr;->zzb(IJ)V

    return-void

    .line 135
    :pswitch_1a
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 136
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(II)V

    return-void

    .line 137
    :pswitch_1b
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 138
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zze(II)V

    return-void

    .line 139
    :pswitch_1c
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 140
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(IZ)V

    return-void

    .line 141
    :pswitch_1d
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 142
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zzd(II)V

    return-void

    .line 143
    :pswitch_1e
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 144
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzmr;->zzd(IJ)V

    return-void

    .line 145
    :pswitch_1f
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 146
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zzc(II)V

    return-void

    .line 147
    :pswitch_20
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 148
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzmr;->zzc(IJ)V

    return-void

    .line 149
    :pswitch_21
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 150
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(IJ)V

    return-void

    .line 151
    :pswitch_22
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 152
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(IF)V

    return-void

    .line 153
    :pswitch_23
    iget v0, v0, Lcom/google/android/gms/internal/vision/zzjb$zzf;->zzb:I

    .line 154
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/vision/zzmr;->zza(ID)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
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

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final zza(Lcom/google/android/gms/internal/vision/zzkk;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    return p1
.end method

.method public final zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/zziu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/internal/vision/zziu<",
            "Lcom/google/android/gms/internal/vision/zzjb$zzf;",
            ">;"
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/vision/zzjb$zzc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/vision/zzjb$zzc;->zza()Lcom/google/android/gms/internal/vision/zziu;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/vision/zziq;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/vision/zziu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/vision/zziu;->zzb()V

    return-void
.end method