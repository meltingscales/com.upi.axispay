.class public Lorg/apache/xml/security/transforms/implementations/TransformC14NExclusive;
.super Lorg/apache/xml/security/transforms/TransformSpi;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/xml/security/transforms/TransformSpi;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/apache/xml/security/signature/XMLSignatureInput;Ljava/io/OutputStream;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;
    .locals 6

    const v0, 0x18fb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0x18fc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p3, v2, v1}, Lorg/apache/xml/security/utils/ElementProxy;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    invoke-virtual {p3}, Lorg/apache/xml/security/utils/ElementProxy;->k()Lorg/w3c/dom/Element;

    move-result-object v3

    invoke-interface {v3}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v2, v1, v4}, Lorg/apache/xml/security/utils/XMLUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/String;I)Lorg/w3c/dom/Element;

    move-result-object v1

    new-instance v2, Lorg/apache/xml/security/transforms/params/InclusiveNamespaces;

    invoke-virtual {p3}, Lorg/apache/xml/security/utils/ElementProxy;->l()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v2, v1, p3}, Lorg/apache/xml/security/transforms/params/InclusiveNamespaces;-><init>(Lorg/w3c/dom/Element;Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/apache/xml/security/transforms/params/InclusiveNamespaces;->a()Ljava/lang/String;

    move-result-object v3

    :cond_0
    new-instance p3, Lorg/apache/xml/security/c14n/implementations/Canonicalizer20010315ExclOmitComments;

    invoke-direct {p3}, Lorg/apache/xml/security/c14n/implementations/Canonicalizer20010315ExclOmitComments;-><init>()V

    if-eqz p2, :cond_1

    invoke-virtual {p3, p2}, Lorg/apache/xml/security/c14n/implementations/CanonicalizerBase;->a(Ljava/io/OutputStream;)V

    :cond_1
    invoke-virtual {p3, p1, v3}, Lorg/apache/xml/security/c14n/implementations/Canonicalizer20010315Excl;->a(Lorg/apache/xml/security/signature/XMLSignatureInput;Ljava/lang/String;)[B

    move-result-object p1

    new-instance p3, Lorg/apache/xml/security/signature/XMLSignatureInput;

    invoke-direct {p3, p1}, Lorg/apache/xml/security/signature/XMLSignatureInput;-><init>([B)V

    if-eqz p2, :cond_2

    invoke-virtual {p3, p2}, Lorg/apache/xml/security/signature/XMLSignatureInput;->b(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Lorg/apache/xml/security/exceptions/XMLSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object p3

    :catch_0
    move-exception p1

    new-instance p2, Lorg/apache/xml/security/c14n/CanonicalizationException;

    const v0, 0x18fd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lorg/apache/xml/security/c14n/CanonicalizationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method

.method public a(Lorg/apache/xml/security/signature/XMLSignatureInput;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lorg/apache/xml/security/transforms/implementations/TransformC14NExclusive;->a(Lorg/apache/xml/security/signature/XMLSignatureInput;Ljava/io/OutputStream;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;

    move-result-object p1

    return-object p1
.end method
