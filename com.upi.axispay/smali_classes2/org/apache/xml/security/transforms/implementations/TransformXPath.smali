.class public Lorg/apache/xml/security/transforms/implementations/TransformXPath;
.super Lorg/apache/xml/security/transforms/TransformSpi;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/xml/security/transforms/implementations/TransformXPath$XPathNodeFilter;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/xml/security/transforms/TransformSpi;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 2

    const v0, 0x2c1b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const v0, 0x2c1c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public a(Lorg/apache/xml/security/signature/XMLSignatureInput;Lorg/apache/xml/security/transforms/Transform;)Lorg/apache/xml/security/signature/XMLSignatureInput;
    .locals 5

    :try_start_0
    invoke-virtual {p2}, Lorg/apache/xml/security/utils/ElementProxy;->k()Lorg/w3c/dom/Element;

    move-result-object v1

    invoke-interface {v1}, Lorg/w3c/dom/Element;->getOwnerDocument()Lorg/w3c/dom/Document;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/xml/security/utils/CachedXPathAPIHolder;->a(Lorg/w3c/dom/Document;)V

    invoke-virtual {p2}, Lorg/apache/xml/security/utils/ElementProxy;->k()Lorg/w3c/dom/Element;

    move-result-object p2

    invoke-interface {p2}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object p2

    const v0, 0x2c1d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p2, v1, v2}, Lorg/apache/xml/security/utils/XMLUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;I)Lorg/w3c/dom/Element;

    move-result-object p2

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lorg/w3c/dom/Element;->getChildNodes()Lorg/w3c/dom/NodeList;

    move-result-object v3

    invoke-interface {v3, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/xml/security/utils/CachedXPathFuncHereAPI;->a(Lorg/w3c/dom/Node;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lorg/apache/xml/security/transforms/implementations/TransformXPath;->a(Ljava/lang/String;)Z

    move-result v4

    invoke-virtual {p1, v4}, Lorg/apache/xml/security/signature/XMLSignatureInput;->a(Z)V

    if-eqz v2, :cond_0

    new-instance v4, Lorg/apache/xml/security/transforms/implementations/TransformXPath$XPathNodeFilter;

    invoke-direct {v4, p2, v2, v3}, Lorg/apache/xml/security/transforms/implementations/TransformXPath$XPathNodeFilter;-><init>(Lorg/w3c/dom/Element;Lorg/w3c/dom/Node;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Lorg/apache/xml/security/signature/XMLSignatureInput;->a(Lorg/apache/xml/security/signature/NodeFilter;)V

    invoke-virtual {p1, v1}, Lorg/apache/xml/security/signature/XMLSignatureInput;->d(Z)V

    return-object p1

    :cond_0
    new-instance p1, Lorg/w3c/dom/DOMException;

    const/4 p2, 0x3

    const v0, 0x2c1e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, p2, v1}, Lorg/w3c/dom/DOMException;-><init>(SLjava/lang/String;)V

    throw p1

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const v0, 0x2c1f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, p1, v2

    const v0, 0x2c20

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, p1, v1

    new-instance p2, Lorg/apache/xml/security/transforms/TransformationException;

    const v0, 0x2c21

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1, p1}, Lorg/apache/xml/security/transforms/TransformationException;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p2
    :try_end_0
    .catch Lorg/w3c/dom/DOMException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Lorg/apache/xml/security/transforms/TransformationException;

    const v0, 0x2c22

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1, p1}, Lorg/apache/xml/security/transforms/TransformationException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method
