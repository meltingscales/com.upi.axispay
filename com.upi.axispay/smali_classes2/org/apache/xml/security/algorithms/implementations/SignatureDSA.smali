.class public Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;
.super Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;
.source "AxisPay"


# static fields
.field public static a:Lorg/apache/commons/logging/Log;

.field public static b:Ljava/lang/Class;

.field public static c:Ljava/lang/Class;


# instance fields
.field private d:Ljava/security/Signature;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->b:Ljava/lang/Class;

    if-nez v0, :cond_0

    const v0, 0x3b8d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->b:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/logging/LogFactory;->getLog(Ljava/lang/String;)Lorg/apache/commons/logging/Log;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;-><init>()V

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    const v0, 0x3b8e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/algorithms/JCEMapper;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v2}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x3b8f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_0
    invoke-static {}, Lorg/apache/xml/security/algorithms/JCEMapper;->a()Ljava/lang/String;

    move-result-object v2

    const v0, 0x3b90

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-nez v2, :cond_1

    :try_start_0
    invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_1
    return-void

    :catch_0
    move-exception v2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v5

    invoke-virtual {v2}, Ljava/security/NoSuchProviderException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v4

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    invoke-direct {v1, v3, v6}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1

    :catch_1
    move-exception v2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v1, v6, v5

    invoke-virtual {v2}, Ljava/security/NoSuchAlgorithmException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v6, v4

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    invoke-direct {v1, v3, v6}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v1
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method private static c([B)[B
    .locals 12

    array-length v0, p0

    const/16 v1, 0x28

    if-ne v0, v1, :cond_4

    const/16 v0, 0x14

    move v1, v0

    :goto_0
    if-lez v1, :cond_0

    rsub-int/lit8 v2, v1, 0x14

    aget-byte v2, p0, v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 v2, v1, 0x14

    aget-byte v3, p0, v2

    if-gez v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-lez v0, :cond_2

    rsub-int/lit8 v4, v0, 0x28

    aget-byte v4, p0, v4

    if-nez v4, :cond_2

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_2
    rsub-int/lit8 v4, v0, 0x28

    aget-byte v5, p0, v4

    if-gez v5, :cond_3

    add-int/lit8 v5, v0, 0x1

    goto :goto_2

    :cond_3
    move v5, v0

    :goto_2
    add-int/lit8 v6, v3, 0x6

    add-int/2addr v6, v5

    new-array v7, v6, [B

    const/4 v8, 0x0

    const/16 v9, 0x30

    aput-byte v9, v7, v8

    add-int/lit8 v8, v3, 0x4

    add-int v9, v8, v5

    int-to-byte v9, v9

    const/4 v10, 0x1

    aput-byte v9, v7, v10

    const/4 v9, 0x2

    aput-byte v9, v7, v9

    const/4 v10, 0x3

    int-to-byte v11, v3

    aput-byte v11, v7, v10

    sub-int v10, v8, v1

    invoke-static {p0, v2, v7, v10, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte v9, v7, v8

    add-int/lit8 v3, v3, 0x5

    int-to-byte v1, v5

    aput-byte v1, v7, v3

    sub-int/2addr v6, v0

    invoke-static {p0, v4, v7, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v7

    :cond_4
    new-instance p0, Ljava/io/IOException;

    const v0, 0x3b91

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(B)V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update(B)V
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x3b92

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public a(Ljava/security/Key;)V
    .locals 6

    instance-of v1, p1, Ljava/security/PublicKey;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->c:Ljava/lang/Class;

    if-nez v1, :cond_0

    const v0, 0x3b93

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->c:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v1, v2, p1

    new-instance p1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x3b94

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1, v2}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    :cond_1
    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    check-cast p1, Ljava/security/PublicKey;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    :try_start_1
    invoke-virtual {v1}, Ljava/security/Signature;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v2

    sget-object v3, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v3}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x3b95

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_2
    iput-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    :goto_0
    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x3b96

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public a([B)V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update([B)V
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x3b97

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public a([BII)V
    .locals 2

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1, p2, p3}, Ljava/security/Signature;->update([BII)V
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x3b98

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->getProvider()Ljava/security/Provider;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b([B)Z
    .locals 5

    const v0, 0x3b99

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    :try_start_0
    sget-object v2, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v2}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->a:Lorg/apache/commons/logging/Log;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x3b9a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-static {p1}, Lorg/apache/xml/security/utils/Base64;->b([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_0
    invoke-static {p1}, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->c([B)[B

    move-result-object p1

    iget-object v2, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;->d:Ljava/security/Signature;

    invoke-virtual {v2, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v2, Lorg/apache/xml/security/signature/XMLSignatureException;

    invoke-direct {v2, v1, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2

    :catch_1
    move-exception p1

    new-instance v2, Lorg/apache/xml/security/signature/XMLSignatureException;

    invoke-direct {v2, v1, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v2
.end method
