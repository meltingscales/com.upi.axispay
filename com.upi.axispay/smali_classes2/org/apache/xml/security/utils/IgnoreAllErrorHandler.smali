.class public Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lorg/xml/sax/ErrorHandler;


# static fields
.field public static a:Lorg/apache/commons/logging/Log;

.field public static final b:Z

.field public static final c:Z

.field public static d:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->d:Ljava/lang/Class;

    if-nez v0, :cond_0

    const v0, 0x18de

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->d:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/logging/LogFactory;->getLog(Ljava/lang/String;)Lorg/apache/commons/logging/Log;

    move-result-object v0

    sput-object v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->a:Lorg/apache/commons/logging/Log;

    const v0, 0x18df

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x18e0

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v2, 0x18e1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->b:Z

    const v0, 0x18e2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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
.method public error(Lorg/xml/sax/SAXParseException;)V
    .locals 2

    sget-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->a:Lorg/apache/commons/logging/Log;

    const v1, 0x18e3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/apache/commons/logging/Log;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    sget-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->c:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    throw p1
.end method

.method public fatalError(Lorg/xml/sax/SAXParseException;)V
    .locals 2

    sget-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->a:Lorg/apache/commons/logging/Log;

    const v1, 0x18e4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/apache/commons/logging/Log;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    sget-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->c:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    throw p1
.end method

.method public warning(Lorg/xml/sax/SAXParseException;)V
    .locals 2

    sget-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->b:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->a:Lorg/apache/commons/logging/Log;

    const v1, 0x18e5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lorg/apache/commons/logging/Log;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    sget-boolean v0, Lorg/apache/xml/security/utils/IgnoreAllErrorHandler;->c:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    throw p1
.end method
