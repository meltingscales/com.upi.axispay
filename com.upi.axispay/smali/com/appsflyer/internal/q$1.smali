.class public final Lcom/appsflyer/internal/q$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field private synthetic ι:Lcom/appsflyer/internal/q$a;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/q$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/appsflyer/internal/q$1;->ι:Lcom/appsflyer/internal/q$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const v0, 0x2c2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 2
    aget-object p1, p3, v1

    if-eqz p1, :cond_0

    .line 3
    aget-object p1, p3, v1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const/4 p2, 0x1

    .line 4
    aget-object v1, p3, p2

    if-eqz v1, :cond_1

    .line 5
    aget-object p2, p3, p2

    check-cast p2, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object p2, v0

    .line 6
    :goto_1
    iget-object p3, p0, Lcom/appsflyer/internal/q$1;->ι:Lcom/appsflyer/internal/q$a;

    if-eqz p3, :cond_4

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    .line 7
    invoke-interface {p3, p1, p2}, Lcom/appsflyer/internal/q$a;->ɩ(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    const p1, 0x2c3

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    if-nez p2, :cond_3

    .line 8
    new-instance p2, Ljava/lang/Exception;

    const v1, 0x2c4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p1, p2}, Lcom/appsflyer/internal/q$a;->ǃ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_2

    .line 9
    :cond_3
    new-instance p2, Ljava/lang/Exception;

    const v1, 0x2c5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p1, p2}, Lcom/appsflyer/internal/q$a;->ǃ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_2

    :cond_4
    const p1, 0x2c6

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    goto :goto_2

    .line 11
    :cond_5
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const p2, 0x2c7

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 12
    iget-object p1, p0, Lcom/appsflyer/internal/q$1;->ι:Lcom/appsflyer/internal/q$a;

    if-eqz p1, :cond_7

    .line 13
    aget-object v2, p3, v1

    if-eqz v2, :cond_6

    .line 14
    aget-object p2, p3, v1

    check-cast p2, Ljava/lang/Exception;

    const p3, 0x2c8

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 15
    invoke-interface {p1, p3, p2}, Lcom/appsflyer/internal/q$a;->ǃ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_2

    .line 16
    :cond_6
    new-instance p3, Ljava/lang/Exception;

    const v1, 0x2c9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2, p3}, Lcom/appsflyer/internal/q$a;->ǃ(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_2

    :cond_7
    const p1, 0x2ca

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-static {p1}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V

    goto :goto_2

    .line 18
    :cond_8
    iget-object p1, p0, Lcom/appsflyer/internal/q$1;->ι:Lcom/appsflyer/internal/q$a;

    if-eqz p1, :cond_9

    .line 19
    new-instance p2, Ljava/lang/Exception;

    const p3, 0x2cb

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const p3, 0x2cc

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3, p2}, Lcom/appsflyer/internal/q$a;->ǃ(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_9
    :goto_2
    return-object v0
.end method
