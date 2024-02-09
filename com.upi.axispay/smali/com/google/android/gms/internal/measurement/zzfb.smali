.class public final Lcom/google/android/gms/internal/measurement/zzfb;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field private static final ISO_8859_1:Ljava/nio/charset/Charset;

.field public static final UTF_8:Ljava/nio/charset/Charset;

.field public static final zzahk:[B

.field private static final zzahl:Ljava/nio/ByteBuffer;

.field private static final zzahm:Lcom/google/android/gms/internal/measurement/zzeb;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "UTF-8"

    .line 1
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfb;->UTF_8:Ljava/nio/charset/Charset;

    const-string v0, "ISO-8859-1"

    .line 2
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfb;->ISO_8859_1:Ljava/nio/charset/Charset;

    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 3
    sput-object v1, Lcom/google/android/gms/internal/measurement/zzfb;->zzahk:[B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/measurement/zzfb;->zzahl:Ljava/nio/ByteBuffer;

    .line 4
    array-length v2, v1

    .line 5
    invoke-static {v1, v0, v2, v0}, Lcom/google/android/gms/internal/measurement/zzeb;->zza([BIIZ)Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object v0

    .line 6
    sput-object v0, Lcom/google/android/gms/internal/measurement/zzfb;->zzahm:Lcom/google/android/gms/internal/measurement/zzeb;

    return-void
.end method

.method public static checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static hashCode([B)I
    .locals 2

    .line 1
    array-length v0, p0

    const/4 v1, 0x0

    .line 2
    invoke-static {v0, p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzfb;->zza(I[BII)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    :cond_0
    return p0
.end method

.method public static zza(I[BII)I
    .locals 2

    move v0, p2

    :goto_0
    add-int v1, p2, p3

    if-ge v0, v1, :cond_0

    mul-int/lit8 p0, p0, 0x1f

    .line 2
    aget-byte v1, p1, v0

    add-int/2addr p0, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static zza(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p0, Lcom/google/android/gms/internal/measurement/zzgh;

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzgh;->zzmk()Lcom/google/android/gms/internal/measurement/zzgi;

    move-result-object p0

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzgh;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/measurement/zzgi;->zza(Lcom/google/android/gms/internal/measurement/zzgh;)Lcom/google/android/gms/internal/measurement/zzgi;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/zzgi;->zzmq()Lcom/google/android/gms/internal/measurement/zzgh;

    move-result-object p0

    return-object p0
.end method

.method public static zza(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object p0
.end method

.method public static zzba(J)I
    .locals 2

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    return p0
.end method

.method public static zzf(Lcom/google/android/gms/internal/measurement/zzgh;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static zzj([B)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/zzhy;->zzj([B)Z

    move-result p0

    return p0
.end method

.method public static zzk([B)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzfb;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static zzo(Z)I
    .locals 0

    if-eqz p0, :cond_0

    const/16 p0, 0x4cf

    return p0

    :cond_0
    const/16 p0, 0x4d5

    return p0
.end method
