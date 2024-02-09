.class public Lorg/apache/xml/security/signature/Manifest;
.super Lorg/apache/xml/security/utils/SignatureElementProxy;
.source "AxisPay"


# static fields
.field public static a:Lorg/apache/commons/logging/Log;

.field public static f:Ljava/lang/Class;


# instance fields
.field public b:Ljava/util/List;

.field public c:[Lorg/w3c/dom/Element;

.field public d:Ljava/util/HashMap;

.field public e:Ljava/util/List;

.field private g:[Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/apache/xml/security/signature/Manifest;->f:Ljava/lang/Class;

    if-nez v0, :cond_0

    const v0, 0x21aa

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/xml/security/signature/Manifest;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/signature/Manifest;->f:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/logging/LogFactory;->getLog(Ljava/lang/String;)Lorg/apache/commons/logging/Log;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    return-void
.end method

.method public constructor <init>(Lorg/w3c/dom/Element;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lorg/apache/xml/security/utils/SignatureElementProxy;-><init>(Lorg/w3c/dom/Element;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/apache/xml/security/signature/Manifest;->g:[Z

    iput-object p1, p0, Lorg/apache/xml/security/signature/Manifest;->d:Ljava/util/HashMap;

    iput-object p1, p0, Lorg/apache/xml/security/signature/Manifest;->e:Ljava/util/List;

    iget-object p2, p0, Lorg/apache/xml/security/utils/ElementProxy;->k:Lorg/w3c/dom/Element;

    invoke-interface {p2}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object p2

    const v0, 0x21ab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lorg/apache/xml/security/utils/XMLUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;)[Lorg/w3c/dom/Element;

    move-result-object p2

    iput-object p2, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    array-length p2, p2

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lorg/apache/xml/security/signature/Manifest;->b:Ljava/util/List;

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v0, p0, Lorg/apache/xml/security/signature/Manifest;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    aput-object v0, p1, v1

    const p2, 0x21ac

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    aput-object p2, p1, v0

    new-instance p2, Lorg/w3c/dom/DOMException;

    const/4 v0, 0x4

    const v1, 0x21ad

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lorg/apache/xml/security/utils/I18n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lorg/w3c/dom/DOMException;-><init>(SLjava/lang/String;)V

    throw p2
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

.method private a(IZ)V
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/signature/Manifest;->g:[Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/apache/xml/security/signature/Manifest;->a()I

    move-result v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lorg/apache/xml/security/signature/Manifest;->g:[Z

    :cond_0
    iget-object v0, p0, Lorg/apache/xml/security/signature/Manifest;->g:[Z

    aput-boolean p2, v0, p1

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/signature/Manifest;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public a(Z)Z
    .locals 13

    iget-object v1, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    if-nez v1, :cond_0

    iget-object v1, p0, Lorg/apache/xml/security/utils/ElementProxy;->k:Lorg/w3c/dom/Element;

    invoke-interface {v1}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v1

    const v0, 0x21ae

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lorg/apache/xml/security/utils/XMLUtils;->a(Lorg/w3c/dom/Node;Ljava/lang/String;)[Lorg/w3c/dom/Element;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    :cond_0
    sget-object v1, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v1}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x21af

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const v0, 0x21b0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    sget-object v1, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x21b1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p1, :cond_1

    const v0, 0x21b2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const v0, 0x21b3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const v0, 0x21b4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_2
    iget-object v1, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    array-length v2, v1

    const v0, 0x21b5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_b

    array-length v1, v1

    new-array v1, v1, [Z

    iput-object v1, p0, Lorg/apache/xml/security/signature/Manifest;->g:[Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v4, v1

    move v5, v2

    :goto_1
    iget-object v6, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    array-length v6, v6

    if-ge v4, v6, :cond_a

    new-instance v6, Lorg/apache/xml/security/signature/Reference;

    iget-object v7, p0, Lorg/apache/xml/security/signature/Manifest;->c:[Lorg/w3c/dom/Element;

    aget-object v7, v7, v4

    iget-object v8, p0, Lorg/apache/xml/security/utils/ElementProxy;->l:Ljava/lang/String;

    invoke-direct {v6, v7, v8, p0}, Lorg/apache/xml/security/signature/Reference;-><init>(Lorg/w3c/dom/Element;Ljava/lang/String;Lorg/apache/xml/security/signature/Manifest;)V

    iget-object v7, p0, Lorg/apache/xml/security/signature/Manifest;->b:Ljava/util/List;

    invoke-interface {v7, v4, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {v6}, Lorg/apache/xml/security/signature/Reference;->j()Z

    move-result v7

    invoke-direct {p0, v4, v7}, Lorg/apache/xml/security/signature/Manifest;->a(IZ)V

    if-nez v7, :cond_3

    move v5, v1

    :cond_3
    sget-object v7, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v7}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v7

    if-eqz v7, :cond_4

    sget-object v7, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0x21b6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6}, Lorg/apache/xml/security/signature/Reference;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_4
    if-eqz v5, :cond_9

    if-eqz p1, :cond_9

    invoke-virtual {v6}, Lorg/apache/xml/security/signature/Reference;->f()Z

    move-result v7

    if-eqz v7, :cond_9

    sget-object v7, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    const v0, 0x21b7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/apache/xml/security/signature/ReferenceNotInitializedException; {:try_start_0 .. :try_end_0} :catch_4

    const/4 v7, 0x0

    :try_start_1
    invoke-virtual {v6, v7}, Lorg/apache/xml/security/signature/Reference;->a(Ljava/io/OutputStream;)Lorg/apache/xml/security/signature/XMLSignatureInput;

    move-result-object v8

    invoke-virtual {v8}, Lorg/apache/xml/security/signature/XMLSignatureInput;->b()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :catch_0
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/w3c/dom/Node;

    invoke-interface {v10}, Lorg/w3c/dom/Node;->getNodeType()S

    move-result v11

    if-ne v11, v2, :cond_5

    move-object v11, v10

    check-cast v11, Lorg/w3c/dom/Element;

    invoke-interface {v11}, Lorg/w3c/dom/Element;->getNamespaceURI()Ljava/lang/String;

    move-result-object v11

    const v0, 0x21b8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    move-object v11, v10

    check-cast v11, Lorg/w3c/dom/Element;

    invoke-interface {v11}, Lorg/w3c/dom/Element;->getLocalName()Ljava/lang/String;

    move-result-object v11

    const v0, 0x21b9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/xml/sax/SAXException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/apache/xml/security/signature/ReferenceNotInitializedException; {:try_start_1 .. :try_end_1} :catch_4

    if-eqz v11, :cond_5

    :try_start_2
    new-instance v11, Lorg/apache/xml/security/signature/Manifest;

    check-cast v10, Lorg/w3c/dom/Element;

    invoke-virtual {v8}, Lorg/apache/xml/security/signature/XMLSignatureInput;->k()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v10, v12}, Lorg/apache/xml/security/signature/Manifest;-><init>(Lorg/w3c/dom/Element;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/apache/xml/security/exceptions/XMLSecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/xml/sax/SAXException; {:try_start_2 .. :try_end_2} :catch_1

    move-object v7, v11

    :cond_6
    if-eqz v7, :cond_8

    :try_start_3
    iget-object v8, p0, Lorg/apache/xml/security/signature/Manifest;->e:Ljava/util/List;

    iput-object v8, v7, Lorg/apache/xml/security/signature/Manifest;->e:Ljava/util/List;

    iget-object v8, p0, Lorg/apache/xml/security/signature/Manifest;->d:Ljava/util/HashMap;

    iput-object v8, v7, Lorg/apache/xml/security/signature/Manifest;->d:Ljava/util/HashMap;

    invoke-virtual {v7, p1}, Lorg/apache/xml/security/signature/Manifest;->a(Z)Z

    move-result v7

    if-nez v7, :cond_7

    sget-object v5, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    const v0, 0x21ba

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/apache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    move v5, v1

    goto :goto_2

    :cond_7
    sget-object v7, Lorg/apache/xml/security/signature/Manifest;->a:Lorg/apache/commons/logging/Log;

    const v0, 0x21bb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    new-instance p1, Lorg/apache/xml/security/signature/MissingResourceFailureException;

    invoke-direct {p1, v3, v6}, Lorg/apache/xml/security/signature/MissingResourceFailureException;-><init>(Ljava/lang/String;Lorg/apache/xml/security/signature/Reference;)V

    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/xml/sax/SAXException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lorg/apache/xml/security/signature/ReferenceNotInitializedException; {:try_start_3 .. :try_end_3} :catch_4

    :catch_1
    move-exception p1

    :try_start_4
    new-instance v4, Lorg/apache/xml/security/signature/ReferenceNotInitializedException;

    invoke-direct {v4, v3, p1}, Lorg/apache/xml/security/signature/ReferenceNotInitializedException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v4

    :catch_2
    move-exception p1

    new-instance v4, Lorg/apache/xml/security/signature/ReferenceNotInitializedException;

    invoke-direct {v4, v3, p1}, Lorg/apache/xml/security/signature/ReferenceNotInitializedException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v4

    :catch_3
    move-exception p1

    new-instance v4, Lorg/apache/xml/security/signature/ReferenceNotInitializedException;

    invoke-direct {v4, v3, p1}, Lorg/apache/xml/security/signature/ReferenceNotInitializedException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v4
    :try_end_4
    .catch Lorg/apache/xml/security/signature/ReferenceNotInitializedException; {:try_start_4 .. :try_end_4} :catch_4

    :cond_9
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :catch_4
    move-exception p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/apache/xml/security/signature/Reference;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    new-instance v1, Lorg/apache/xml/security/signature/MissingResourceFailureException;

    const v0, 0x21bc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2, p1, v6}, Lorg/apache/xml/security/signature/MissingResourceFailureException;-><init>(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Exception;Lorg/apache/xml/security/signature/Reference;)V

    throw v1

    :cond_a
    return v5

    :cond_b
    new-instance p1, Lorg/apache/xml/security/exceptions/XMLSecurityException;

    invoke-direct {p1, v3}, Lorg/apache/xml/security/exceptions/XMLSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const v0, 0x21bd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
