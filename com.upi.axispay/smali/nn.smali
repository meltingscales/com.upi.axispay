.class public Lnn;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:Landroid/animation/LayoutTransition;

.field public static b:Ljava/lang/reflect/Field;

.field public static c:Z

.field public static d:Ljava/lang/reflect/Method;

.field public static e:Z


# direct methods
.method public static a(Landroid/animation/LayoutTransition;)V
    .locals 8

    .line 1
    sget-boolean v1, Lnn;->e:Z

    const v0, 0x36a1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const v0, 0x36a2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    const-class v5, Landroid/animation/LayoutTransition;

    const v0, 0x36a3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    new-array v7, v3, [Ljava/lang/Class;

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, Lnn;->d:Ljava/lang/reflect/Method;

    .line 3
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4
    :catch_0
    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :goto_0
    sput-boolean v1, Lnn;->e:Z

    .line 6
    :cond_0
    sget-object v1, Lnn;->d:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_1

    :try_start_1
    new-array v3, v3, [Ljava/lang/Object;

    .line 7
    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const v0, 0x36a4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    .line 8
    invoke-static {v4, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 9
    :catch_2
    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    return-void
.end method

.method public static b(Landroid/view/ViewGroup;Z)V
    .locals 6

    .line 1
    sget-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lnn$a;

    invoke-direct {v1}, Lnn$a;-><init>()V

    sput-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    const/4 v5, 0x2

    .line 3
    invoke-virtual {v1, v5, v4}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    .line 4
    sget-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    invoke-virtual {v1, v3, v4}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    .line 5
    sget-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    invoke-virtual {v1, v2, v4}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    .line 6
    sget-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    const/4 v5, 0x3

    invoke-virtual {v1, v5, v4}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    .line 7
    sget-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    const/4 v5, 0x4

    invoke-virtual {v1, v5, v4}, Landroid/animation/LayoutTransition;->setAnimator(ILandroid/animation/Animator;)V

    :cond_0
    if-eqz p1, :cond_3

    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1}, Landroid/animation/LayoutTransition;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10
    invoke-static {p1}, Lnn;->a(Landroid/animation/LayoutTransition;)V

    .line 11
    :cond_1
    sget-object v1, Lnn;->a:Landroid/animation/LayoutTransition;

    if-eq p1, v1, :cond_2

    .line 12
    sget v1, Lym;->transition_layout_save:I

    invoke-virtual {p0, v1, p1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    .line 13
    :cond_2
    sget-object p1, Lnn;->a:Landroid/animation/LayoutTransition;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    goto :goto_4

    .line 14
    :cond_3
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 15
    sget-boolean p1, Lnn;->c:Z

    const v0, 0x36a5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    if-nez p1, :cond_4

    .line 16
    :try_start_0
    const-class p1, Landroid/view/ViewGroup;

    const v0, 0x36a6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1

    sput-object p1, Lnn;->b:Ljava/lang/reflect/Field;

    .line 17
    invoke-virtual {p1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x36a7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 18
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    :goto_0
    sput-boolean v2, Lnn;->c:Z

    .line 20
    :cond_4
    sget-object p1, Lnn;->b:Ljava/lang/reflect/Field;

    if-eqz p1, :cond_6

    .line 21
    :try_start_1
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz p1, :cond_5

    .line 22
    :try_start_2
    sget-object v2, Lnn;->b:Ljava/lang/reflect/Field;

    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move v3, p1

    goto :goto_2

    :cond_5
    :goto_1
    move v3, p1

    goto :goto_3

    :catch_2
    :goto_2
    const v0, 0x36a8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    :goto_3
    if-eqz v3, :cond_7

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 25
    :cond_7
    sget p1, Lym;->transition_layout_save:I

    .line 26
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/LayoutTransition;

    if-eqz v1, :cond_8

    .line 27
    invoke-virtual {p0, p1, v4}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    .line 28
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    :cond_8
    :goto_4
    return-void
.end method
