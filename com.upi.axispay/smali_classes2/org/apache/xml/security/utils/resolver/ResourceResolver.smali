.class public Lorg/apache/xml/security/utils/resolver/ResourceResolver;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:Lorg/apache/commons/logging/Log;

.field public static b:Z

.field public static c:Ljava/util/List;

.field public static d:Z

.field public static f:Ljava/lang/Class;


# instance fields
.field public e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->f:Ljava/lang/Class;

    if-nez v0, :cond_0

    const v0, 0xe0e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->f:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/logging/LogFactory;->getLog(Ljava/lang/String;)Lorg/apache/commons/logging/Log;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    const/4 v0, 0x0

    sput-boolean v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->b:Z

    const/4 v0, 0x0

    sput-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    const/4 v0, 0x1

    sput-boolean v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->d:Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    iput-object p1, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    return-void
.end method

.method public constructor <init>(Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    iput-object p1, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    return-void
.end method

.method public static final a(Lorg/w3c/dom/Attr;Ljava/lang/String;)Lorg/apache/xml/security/utils/resolver/ResourceResolver;
    .locals 10

    const v0, 0xe0f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_5

    sget-object v5, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/xml/security/utils/resolver/ResourceResolver;

    :try_start_0
    sget-boolean v6, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->d:Z

    if-nez v6, :cond_1

    iget-object v6, v5, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v6}, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;->a()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    new-instance v6, Lorg/apache/xml/security/utils/resolver/ResourceResolver;

    iget-object v7, v5, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-direct {v6, v7}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;-><init>(Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_1
    :goto_1
    move-object v6, v5

    :goto_2
    sget-object v7, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v7}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v7, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    const v0, 0xe10

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v9, v5, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_2
    if-eqz v5, :cond_4

    invoke-direct {v6, p0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c(Lorg/w3c/dom/Attr;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v4, :cond_3

    sget-object p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-interface {p0, v3, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    sput-object p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    :cond_3
    return-object v6

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v3, Lorg/apache/xml/security/utils/resolver/ResourceResolverException;

    invoke-direct {v3, v1, v2, p0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolverException;-><init>(Ljava/lang/String;Ljava/lang/Exception;Lorg/w3c/dom/Attr;Ljava/lang/String;)V

    throw v3

    :catch_1
    move-exception v2

    new-instance v3, Lorg/apache/xml/security/utils/resolver/ResourceResolverException;

    invoke-direct {v3, v1, v2, p0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolverException;-><init>(Ljava/lang/String;Ljava/lang/Exception;Lorg/w3c/dom/Attr;Ljava/lang/String;)V

    throw v3

    :cond_5
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    if-eqz p0, :cond_6

    invoke-interface {p0}, Lorg/w3c/dom/Attr;->getNodeValue()Ljava/lang/String;

    move-result-object v2

    goto :goto_3

    :cond_6
    const v0, 0xe11

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    :goto_3
    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    new-instance v2, Lorg/apache/xml/security/utils/resolver/ResourceResolverException;

    const v0, 0xe12

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1, p0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolverException;-><init>(Ljava/lang/String;[Ljava/lang/Object;Lorg/w3c/dom/Attr;Ljava/lang/String;)V

    throw v2
.end method

.method public static final a(Lorg/w3c/dom/Attr;Ljava/lang/String;Ljava/util/List;)Lorg/apache/xml/security/utils/resolver/ResourceResolver;
    .locals 7

    sget-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v0}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const v3, 0xe13

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-nez p2, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    sget-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const v3, 0xe14

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v3, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const v3, 0xe15

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_1
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    :goto_1
    if-ge v1, v0, :cond_4

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/xml/security/utils/resolver/ResourceResolver;

    if-eqz v2, :cond_3

    iget-object v3, v2, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    invoke-interface {v4}, Lorg/apache/commons/logging/Log;->isDebugEnabled()Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    const v6, 0xe16

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    :cond_2
    invoke-direct {v2, p0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c(Lorg/w3c/dom/Attr;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-static {p0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a(Lorg/w3c/dom/Attr;Ljava/lang/String;)Lorg/apache/xml/security/utils/resolver/ResourceResolver;

    move-result-object p0

    return-object p0
.end method

.method public static a()V
    .locals 2

    sget-boolean v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->b:Z

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    const/4 v0, 0x1

    sput-boolean v0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->b:Z

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method private static a(Ljava/lang/String;Z)V
    .locals 6

    const v0, 0xe17

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v0, 0xe18

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    new-instance v3, Lorg/apache/xml/security/utils/resolver/ResourceResolver;

    invoke-direct {v3, p0}, Lorg/apache/xml/security/utils/resolver/ResourceResolver;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    sget-object p1, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    invoke-interface {p1, v4, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    sget-object p1, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    const v0, 0xe19

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v5}, Lorg/apache/commons/logging/Log;->debug(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->c:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, v3, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;->a()Z

    move-result p1

    if-nez p1, :cond_1

    sput-boolean v4, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->d:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    sget-object p1, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    goto :goto_1

    :catch_1
    sget-object p1, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->a:Lorg/apache/commons/logging/Log;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    :goto_1
    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lorg/apache/commons/logging/Log;->warn(Ljava/lang/Object;)V

    :cond_1
    :goto_2
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/Class;
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

.method private c(Lorg/w3c/dom/Attr;Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v0, p1, p2}, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;->b(Lorg/w3c/dom/Attr;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v0, p1}, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;->a(Ljava/util/Map;)V

    return-void
.end method

.method public b(Lorg/w3c/dom/Attr;Ljava/lang/String;)Lorg/apache/xml/security/signature/XMLSignatureInput;
    .locals 1

    iget-object v0, p0, Lorg/apache/xml/security/utils/resolver/ResourceResolver;->e:Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;

    invoke-virtual {v0, p1, p2}, Lorg/apache/xml/security/utils/resolver/ResourceResolverSpi;->a(Lorg/w3c/dom/Attr;Ljava/lang/String;)Lorg/apache/xml/security/signature/XMLSignatureInput;

    move-result-object p1

    return-object p1
.end method
