.class public abstract Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;
.super Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSAMD5;,
        Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSARIPEMD160;,
        Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA512;,
        Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA384;,
        Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA256;,
        Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA1;
    }
.end annotation


# static fields
.field public static a:Lorg/apache/commons/logging/Log;

.field public static b:Ljava/lang/Class;

.field public static c:Ljava/lang/Class;


# instance fields
.field private d:Ljava/security/Signature;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->b:Ljava/lang/Class;

    if-nez v0, :cond_0

    const v0, 0x8cf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->b:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/logging/LogFactory;->getLog(Ljava/lang/String;)Lorg/apache/commons/logging/Log;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a:Lorg/apache/commons/logging/Log;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;-><init>()V

    const/4 v1, 0x0

    iput-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {p0}, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/algorithms/JCEMapper;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v2}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a:Lorg/apache/commons/logging/Log;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x8d0

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

    const v0, 0x8d1

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
    iput-object v2, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

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


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(B)V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update(B)V
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x8d2

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

    sget-object v1, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->c:Ljava/lang/Class;

    if-nez v1, :cond_0

    const v0, 0x8d3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->c:Ljava/lang/Class;

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

    const v0, 0x8d4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1, v2}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1

    :cond_1
    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    check-cast p1, Ljava/security/PublicKey;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    :try_start_1
    invoke-virtual {v1}, Ljava/security/Signature;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v2

    sget-object v3, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v3}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->a:Lorg/apache/commons/logging/Log;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x8d5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_2
    iput-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    :goto_0
    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x8d6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public a([B)V
    .locals 3

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update([B)V
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x8d7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public a([BII)V
    .locals 2

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1, p2, p3}, Ljava/security/Signature;->update([BII)V
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x8d8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {v0}, Ljava/security/Signature;->getProvider()Ljava/security/Provider;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b([B)Z
    .locals 3

    :try_start_0
    iget-object v1, p0, Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA;->d:Ljava/security/Signature;

    invoke-virtual {v1, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v1, Lorg/apache/xml/security/signature/XMLSignatureException;

    const v0, 0x8d9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lorg/apache/xml/security/signature/XMLSignatureException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v1
.end method

.method public abstract d()Ljava/lang/String;
.end method
