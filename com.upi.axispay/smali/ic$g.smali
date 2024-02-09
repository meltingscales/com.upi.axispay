.class public Lic$g;
.super Lic$l;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# static fields
.field public static h:Z

.field public static i:Ljava/lang/reflect/Method;

.field public static j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static k:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static l:Ljava/lang/reflect/Field;

.field public static m:Ljava/lang/reflect/Field;


# instance fields
.field public final c:Landroid/view/WindowInsets;

.field public d:[Le9;

.field public e:Le9;

.field public f:Lic;

.field public g:Le9;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lic$g;

    const v1, 0xc8

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Lic;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lic$l;-><init>(Lic;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lic$g;->e:Le9;

    .line 3
    iput-object p2, p0, Lic$g;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method public constructor <init>(Lic;Lic$g;)V
    .locals 1

    .line 4
    new-instance v0, Landroid/view/WindowInsets;

    iget-object p2, p2, Lic$g;->c:Landroid/view/WindowInsets;

    invoke-direct {v0, p2}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V

    invoke-direct {p0, p1, v0}, Lic$g;-><init>(Lic;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public static x()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    const-class v1, Landroid/view/View;

    const v4, 0xb

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lic$g;->i:Ljava/lang/reflect/Method;

    const v4, 0xc

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lic$g;->j:Ljava/lang/Class;

    const v4, 0xd

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lic$g;->k:Ljava/lang/Class;

    const v4, 0xe

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lic$g;->l:Ljava/lang/reflect/Field;

    .line 5
    sget-object v1, Lic$g;->j:Ljava/lang/Class;

    const v4, 0xf

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lic$g;->m:Ljava/lang/reflect/Field;

    .line 6
    sget-object v1, Lic$g;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 7
    sget-object v1, Lic$g;->m:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x10

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v4, 0x11

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 9
    :goto_0
    sput-boolean v0, Lic$g;->h:Z

    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lic$g;->w(Landroid/view/View;)Le9;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Le9;->e:Le9;

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lic$g;->q(Le9;)V

    return-void
.end method

.method public e(Lic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic$g;->f:Lic;

    invoke-virtual {p1, v0}, Lic;->t(Lic;)V

    .line 2
    iget-object v0, p0, Lic$g;->g:Le9;

    invoke-virtual {p1, v0}, Lic;->s(Le9;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lic$l;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    check-cast p1, Lic$g;

    .line 3
    iget-object v0, p0, Lic$g;->g:Le9;

    iget-object p1, p1, Lic$g;->g:Le9;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(I)Le9;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lic$g;->t(IZ)Le9;

    move-result-object p1

    return-object p1
.end method

.method public final k()Le9;
    .locals 4

    .line 1
    iget-object v0, p0, Lic$g;->e:Le9;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    iget-object v1, p0, Lic$g;->c:Landroid/view/WindowInsets;

    .line 4
    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    iget-object v2, p0, Lic$g;->c:Landroid/view/WindowInsets;

    .line 5
    invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iget-object v3, p0, Lic$g;->c:Landroid/view/WindowInsets;

    .line 6
    invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    .line 7
    invoke-static {v0, v1, v2, v3}, Le9;->b(IIII)Le9;

    move-result-object v0

    iput-object v0, p0, Lic$g;->e:Le9;

    .line 8
    :cond_0
    iget-object v0, p0, Lic$g;->e:Le9;

    return-object v0
.end method

.method public m(IIII)Lic;
    .locals 2

    .line 1
    new-instance v0, Lic$b;

    iget-object v1, p0, Lic$g;->c:Landroid/view/WindowInsets;

    invoke-static {v1}, Lic;->w(Landroid/view/WindowInsets;)Lic;

    move-result-object v1

    invoke-direct {v0, v1}, Lic$b;-><init>(Lic;)V

    .line 2
    invoke-virtual {p0}, Lic$g;->k()Le9;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, Lic;->o(Le9;IIII)Le9;

    move-result-object v1

    invoke-virtual {v0, v1}, Lic$b;->c(Le9;)Lic$b;

    .line 3
    invoke-virtual {p0}, Lic$l;->i()Le9;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, Lic;->o(Le9;IIII)Le9;

    move-result-object p1

    invoke-virtual {v0, p1}, Lic$b;->b(Le9;)Lic$b;

    .line 4
    invoke-virtual {v0}, Lic$b;->a()Lic;

    move-result-object p1

    return-object p1
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method

.method public p([Le9;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lic$g;->d:[Le9;

    return-void
.end method

.method public q(Le9;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lic$g;->g:Le9;

    return-void
.end method

.method public r(Lic;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lic$g;->f:Lic;

    return-void
.end method

.method public final t(IZ)Le9;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 1
    sget-object v0, Le9;->e:Le9;

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p0, v1, p2}, Lic$g;->u(IZ)Le9;

    move-result-object v2

    invoke-static {v0, v2}, Le9;->a(Le9;Le9;)Le9;

    move-result-object v0

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public u(IZ)Le9;
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_f

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-eq p1, v0, :cond_b

    const/16 p2, 0x8

    if-eq p1, p2, :cond_6

    const/16 p2, 0x10

    if-eq p1, p2, :cond_5

    const/16 p2, 0x20

    if-eq p1, p2, :cond_4

    const/16 p2, 0x40

    if-eq p1, p2, :cond_3

    const/16 p2, 0x80

    if-eq p1, p2, :cond_0

    .line 1
    sget-object p1, Le9;->e:Le9;

    return-object p1

    .line 2
    :cond_0
    iget-object p1, p0, Lic$g;->f:Lic;

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Lic;->e()Lhb;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lic$l;->f()Lhb;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Lhb;->b()I

    move-result p2

    invoke-virtual {p1}, Lhb;->d()I

    move-result v0

    .line 6
    invoke-virtual {p1}, Lhb;->c()I

    move-result v1

    invoke-virtual {p1}, Lhb;->a()I

    move-result p1

    .line 7
    invoke-static {p2, v0, v1, p1}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1

    .line 8
    :cond_2
    sget-object p1, Le9;->e:Le9;

    return-object p1

    .line 9
    :cond_3
    invoke-virtual {p0}, Lic$l;->l()Le9;

    move-result-object p1

    return-object p1

    .line 10
    :cond_4
    invoke-virtual {p0}, Lic$l;->h()Le9;

    move-result-object p1

    return-object p1

    .line 11
    :cond_5
    invoke-virtual {p0}, Lic$l;->j()Le9;

    move-result-object p1

    return-object p1

    .line 12
    :cond_6
    iget-object p1, p0, Lic$g;->d:[Le9;

    if-eqz p1, :cond_7

    .line 13
    invoke-static {p2}, Lic$m;->a(I)I

    move-result p2

    aget-object v2, p1, p2

    :cond_7
    if-eqz v2, :cond_8

    return-object v2

    .line 14
    :cond_8
    invoke-virtual {p0}, Lic$g;->k()Le9;

    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lic$g;->v()Le9;

    move-result-object p2

    .line 16
    iget p1, p1, Le9;->d:I

    iget v0, p2, Le9;->d:I

    if-le p1, v0, :cond_9

    .line 17
    invoke-static {v1, v1, v1, p1}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1

    .line 18
    :cond_9
    iget-object p1, p0, Lic$g;->g:Le9;

    if-eqz p1, :cond_a

    sget-object v0, Le9;->e:Le9;

    .line 19
    invoke-virtual {p1, v0}, Le9;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 20
    iget-object p1, p0, Lic$g;->g:Le9;

    iget p1, p1, Le9;->d:I

    iget p2, p2, Le9;->d:I

    if-le p1, p2, :cond_a

    .line 21
    invoke-static {v1, v1, v1, p1}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1

    .line 22
    :cond_a
    sget-object p1, Le9;->e:Le9;

    return-object p1

    :cond_b
    if-eqz p2, :cond_c

    .line 23
    invoke-virtual {p0}, Lic$g;->v()Le9;

    move-result-object p1

    .line 24
    invoke-virtual {p0}, Lic$l;->i()Le9;

    move-result-object p2

    .line 25
    iget v0, p1, Le9;->a:I

    iget v2, p2, Le9;->a:I

    .line 26
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p1, Le9;->c:I

    iget v3, p2, Le9;->c:I

    .line 27
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p1, p1, Le9;->d:I

    iget p2, p2, Le9;->d:I

    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 29
    invoke-static {v0, v1, v2, p1}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1

    .line 30
    :cond_c
    invoke-virtual {p0}, Lic$g;->k()Le9;

    move-result-object p1

    .line 31
    iget-object p2, p0, Lic$g;->f:Lic;

    if-eqz p2, :cond_d

    .line 32
    invoke-virtual {p2}, Lic;->h()Le9;

    move-result-object v2

    .line 33
    :cond_d
    iget p2, p1, Le9;->d:I

    if-eqz v2, :cond_e

    .line 34
    iget v0, v2, Le9;->d:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 35
    :cond_e
    iget v0, p1, Le9;->a:I

    iget p1, p1, Le9;->c:I

    invoke-static {v0, v1, p1, p2}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1

    :cond_f
    if-eqz p2, :cond_10

    .line 36
    invoke-virtual {p0}, Lic$g;->v()Le9;

    move-result-object p1

    .line 37
    iget p1, p1, Le9;->b:I

    .line 38
    invoke-virtual {p0}, Lic$g;->k()Le9;

    move-result-object p2

    iget p2, p2, Le9;->b:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 39
    invoke-static {v1, p1, v1, v1}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1

    .line 40
    :cond_10
    invoke-virtual {p0}, Lic$g;->k()Le9;

    move-result-object p1

    iget p1, p1, Le9;->b:I

    invoke-static {v1, p1, v1, v1}, Le9;->b(IIII)Le9;

    move-result-object p1

    return-object p1
.end method

.method public final v()Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$g;->f:Lic;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lic;->h()Le9;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    sget-object v0, Le9;->e:Le9;

    return-object v0
.end method

.method public final w(Landroid/view/View;)Le9;
    .locals 5

    const v0, 0x12

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-ge v2, v3, :cond_5

    .line 2
    sget-boolean v2, Lic$g;->h:Z

    if-nez v2, :cond_0

    .line 3
    invoke-static {}, Lic$g;->x()V

    .line 4
    :cond_0
    sget-object v2, Lic$g;->i:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    sget-object v4, Lic$g;->k:Ljava/lang/Class;

    if-eqz v4, :cond_4

    sget-object v4, Lic$g;->l:Ljava/lang/reflect/Field;

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :try_start_0
    new-array v4, v4, [Ljava/lang/Object;

    .line 5
    invoke-virtual {v2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    const v0, 0x13

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 6
    new-instance v2, Ljava/lang/NullPointerException;

    invoke-direct {v2}, Ljava/lang/NullPointerException;-><init>()V

    invoke-static {v1, p1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v3

    .line 7
    :cond_2
    sget-object v2, Lic$g;->m:Ljava/lang/reflect/Field;

    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 8
    sget-object v2, Lic$g;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    if-eqz p1, :cond_3

    .line 9
    invoke-static {p1}, Le9;->c(Landroid/graphics/Rect;)Le9;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object v3

    :catch_0
    move-exception p1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x14

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/ReflectiveOperationException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    :goto_0
    return-object v3

    .line 11
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const v0, 0x15

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
