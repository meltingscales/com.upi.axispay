.class public Lorg/npci/upi/security/pinactivitycomponent/c;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lorg/npci/upi/security/pinactivitycomponent/e;

.field public c:Lorg/npci/upi/security/pinactivitycomponent/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x760

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    :try_start_0
    new-instance v1, Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-direct {v1, p1}, Lorg/npci/upi/security/pinactivitycomponent/e;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    new-instance p1, Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-direct {p1}, Lorg/npci/upi/security/pinactivitycomponent/d;-><init>()V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->c:Lorg/npci/upi/security/pinactivitycomponent/d;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    :try_start_0
    const v0, 0x761

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v1

    const/16 v2, 0x100

    invoke-virtual {v1, v2}, Ljavax/crypto/KeyGenerator;->init(I)V

    invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v1

    invoke-interface {v1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->c:Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-virtual {v2, v1}, Lorg/npci/upi/security/pinactivitycomponent/d;->b([B)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    const v0, 0x762

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x763

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const v0, 0x764

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x765

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/text/SimpleDateFormat;

    const v0, 0x766

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/sql/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Ljava/sql/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/c;->d()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lorg/npci/upi/security/pinactivitycomponent/c;->a()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x767

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v2

    :goto_0
    :try_start_1
    new-instance v5, Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-direct {v5}, Lorg/npci/upi/security/pinactivitycomponent/d;-><init>()V

    const v0, 0x768

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const v0, 0x769

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v0, 0x76a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v0, 0x76b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    if-eqz p1, :cond_1

    :try_start_2
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/e;->w()V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/e;->j()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    new-instance v9, Lorg/npci/upi/security/pinactivitycomponent/s;

    iget-object v10, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-direct {v9, v4, v10, v3}, Lorg/npci/upi/security/pinactivitycomponent/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v9}, Lorg/npci/upi/security/pinactivitycomponent/e;->m(Lorg/npci/upi/security/pinactivitycomponent/s;)I

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    new-instance v9, Lorg/npci/upi/security/pinactivitycomponent/s;

    iget-object v10, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-direct {v9, v4, v10, v3}, Lorg/npci/upi/security/pinactivitycomponent/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v9}, Lorg/npci/upi/security/pinactivitycomponent/e;->k(Lorg/npci/upi/security/pinactivitycomponent/s;)V

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lin/org/npci/commonlibrary/i;->a()Ljava/security/PublicKey;

    move-result-object p1

    invoke-virtual {v5, v2, p1}, Lorg/npci/upi/security/pinactivitycomponent/d;->a(Ljava/lang/String;Ljava/security/PublicKey;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v4}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-static {v6, p1}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/e;->j()Ljava/util/List;

    move-result-object p1

    const/4 v9, 0x0

    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/s;

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/s;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v4}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-static {v6, p2}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Lorg/npci/upi/security/pinactivitycomponent/d;->e(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {v5, p2, p1}, Lorg/npci/upi/security/pinactivitycomponent/d;->d([B[B)[B

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p1, p2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-virtual {p1}, Lorg/npci/upi/security/pinactivitycomponent/e;->w()V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    new-instance p2, Lorg/npci/upi/security/pinactivitycomponent/s;

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->a:Ljava/lang/String;

    invoke-direct {p2, v4, v5, v3}, Lorg/npci/upi/security/pinactivitycomponent/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/e;->k(Lorg/npci/upi/security/pinactivitycomponent/s;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    const v0, 0x76c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x76d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const v0, 0x76e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p4}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p4, p1, p2, p3}, Lorg/npci/upi/security/pinactivitycomponent/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()Ljava/lang/String;
    .locals 3

    :try_start_0
    const v0, 0x76f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v1

    const/16 v2, 0x100

    invoke-virtual {v1, v2}, Ljavax/crypto/KeyGenerator;->init(I)V

    invoke-virtual {v1}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object v1

    invoke-interface {v1}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v1

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->c:Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-virtual {v2, v1}, Lorg/npci/upi/security/pinactivitycomponent/d;->b([B)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    const v0, 0x770

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x771

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    return-object v1
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    const v0, 0x772

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x773

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x774

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->b:Lorg/npci/upi/security/pinactivitycomponent/e;

    invoke-virtual {v5}, Lorg/npci/upi/security/pinactivitycomponent/e;->r()Ljava/lang/String;

    move-result-object v5

    const v0, 0x775

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->c:Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-virtual {v6, v5}, Lorg/npci/upi/security/pinactivitycomponent/d;->e(Ljava/lang/String;)[B

    move-result-object v5

    invoke-static {p1, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    iget-object v6, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->c:Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-virtual {v6, p1, v5}, Lorg/npci/upi/security/pinactivitycomponent/d;->f([B[B)[B

    move-result-object p1

    invoke-static {p1, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const v0, 0x776

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p2}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lorg/npci/upi/security/pinactivitycomponent/c;->c:Lorg/npci/upi/security/pinactivitycomponent/d;

    invoke-virtual {p3, p2}, Lorg/npci/upi/security/pinactivitycomponent/d;->c(Ljava/lang/String;)[B

    move-result-object p2

    invoke-static {p2, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    const v0, 0x777

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p2}, Lorg/npci/upi/security/pinactivitycomponent/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v4

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_2
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_3
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/InvalidAlgorithmParameterException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_4
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljavax/crypto/BadPaddingException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_5
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljavax/crypto/IllegalBlockSizeException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :catch_6
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lorg/npci/upi/security/pinactivitycomponent/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    return v4
.end method
