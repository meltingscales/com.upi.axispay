.class public Lorg/apache/commons/codec/digest/Crypt;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static crypt(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-static {p0, v0}, Lorg/apache/commons/codec/digest/Crypt;->crypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static crypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 11
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0, p1}, Lorg/apache/commons/codec/digest/Crypt;->crypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static crypt([B)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lorg/apache/commons/codec/digest/Crypt;->crypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static crypt([BLjava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    .line 2
    invoke-static {p0}, Lorg/apache/commons/codec/digest/Sha2Crypt;->sha512Crypt([B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const v0, 0x2c6c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-static {p0, p1}, Lorg/apache/commons/codec/digest/Sha2Crypt;->sha512Crypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const v0, 0x2c6d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-static {p0, p1}, Lorg/apache/commons/codec/digest/Sha2Crypt;->sha256Crypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const v0, 0x2c6e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    invoke-static {p0, p1}, Lorg/apache/commons/codec/digest/Md5Crypt;->md5Crypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 9
    :cond_3
    invoke-static {p0, p1}, Lorg/apache/commons/codec/digest/UnixCrypt;->crypt([BLjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
