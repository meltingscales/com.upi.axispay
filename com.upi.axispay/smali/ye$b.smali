.class public final Lye$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lye;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(ILjava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lye$b;->a:I

    .line 3
    iput-object p2, p0, Lye$b;->b:Ljava/lang/reflect/Method;

    const/4 p1, 0x1

    .line 4
    invoke-virtual {p2, p1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    return-void
.end method


# virtual methods
.method public a(Lef;Lbf$b;Ljava/lang/Object;)V
    .locals 5

    .line 1
    :try_start_0
    iget v1, p0, Lye$b;->a:I

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v1, p0, Lye$b;->b:Ljava/lang/reflect/Method;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v2

    aput-object p2, v4, v3

    invoke-virtual {v1, p3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 3
    :cond_1
    iget-object p2, p0, Lye$b;->b:Ljava/lang/reflect/Method;

    new-array v1, v3, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-virtual {p2, p3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lye$b;->b:Ljava/lang/reflect/Method;

    new-array p2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, p3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p1

    .line 5
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 6
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    const v0, 0x309a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lye$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lye$b;

    .line 3
    iget v1, p0, Lye$b;->a:I

    iget v3, p1, Lye$b;->a:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lye$b;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Lye$b;->b:Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lye$b;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lye$b;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
