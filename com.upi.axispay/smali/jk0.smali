.class public final Ljk0;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljk0$a;
    }
.end annotation


# static fields
.field public static final a:Ljk0;

.field public static final b:Ljk0$a;

.field public static c:Ljk0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljk0;

    invoke-direct {v0}, Ljk0;-><init>()V

    sput-object v0, Ljk0;->a:Ljk0;

    .line 1
    new-instance v0, Ljk0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Ljk0$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, Ljk0;->b:Ljk0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lck0;)Ljk0$a;
    .locals 6

    .line 1
    :try_start_0
    const-class v1, Ljava/lang/Class;

    const v0, 0x41f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const v0, 0x420

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const v0, 0x421

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Class;

    .line 4
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const v0, 0x422

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const v0, 0x423

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Class;

    .line 6
    invoke-virtual {p1, v4, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    .line 7
    new-instance v3, Ljk0$a;

    invoke-direct {v3, v1, v2, p1}, Ljk0$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v3, Ljk0;->c:Ljk0$a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    .line 8
    :catch_0
    sget-object p1, Ljk0;->b:Ljk0$a;

    sput-object p1, Ljk0;->c:Ljk0$a;

    return-object p1
.end method

.method public final b(Lck0;)Ljava/lang/String;
    .locals 5

    const v0, 0x424

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Ljk0;->c:Ljk0$a;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Ljk0;->a(Lck0;)Ljk0$a;

    move-result-object v0

    .line 2
    :cond_0
    sget-object v1, Ljk0;->b:Ljk0$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    return-object v2

    .line 3
    :cond_1
    iget-object v1, v0, Ljk0$a;->a:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-nez v1, :cond_2

    move-object p1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_3

    return-object v2

    .line 4
    :cond_3
    iget-object v1, v0, Ljk0$a;->b:Ljava/lang/reflect/Method;

    if-nez v1, :cond_4

    move-object p1, v2

    goto :goto_1

    :cond_4
    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    if-nez p1, :cond_5

    return-object v2

    .line 5
    :cond_5
    iget-object v0, v0, Ljk0$a;->c:Ljava/lang/reflect/Method;

    if-nez v0, :cond_6

    move-object p1, v2

    goto :goto_2

    :cond_6
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_7

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    :cond_7
    return-object v2
.end method