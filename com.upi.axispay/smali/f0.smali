.class public Lf0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:Ljava/lang/reflect/Field;

.field public static b:Z

.field public static c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static d:Z

.field public static e:Ljava/lang/reflect/Field;

.field public static f:Z

.field public static g:Ljava/lang/reflect/Field;

.field public static h:Z


# direct methods
.method public static a(Landroid/content/res/Resources;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    return-void

    :cond_0
    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    .line 2
    invoke-static {p0}, Lf0;->d(Landroid/content/res/Resources;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x17

    if-lt v0, v1, :cond_2

    .line 3
    invoke-static {p0}, Lf0;->c(Landroid/content/res/Resources;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    .line 4
    invoke-static {p0}, Lf0;->b(Landroid/content/res/Resources;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/res/Resources;)V
    .locals 5

    .line 1
    sget-boolean v1, Lf0;->b:Z

    const v0, 0xfca

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    const-class v3, Landroid/content/res/Resources;

    const v0, 0xfcb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Lf0;->a:Ljava/lang/reflect/Field;

    .line 3
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const v0, 0xfcc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {v2, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    :goto_0
    sput-boolean v1, Lf0;->b:Z

    .line 6
    :cond_0
    sget-object v1, Lf0;->a:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_1

    const/4 v3, 0x0

    .line 7
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v3, p0

    goto :goto_1

    :catch_1
    move-exception p0

    const v0, 0xfcd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v2, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    if-eqz v3, :cond_1

    .line 9
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    :cond_1
    return-void
.end method

.method public static c(Landroid/content/res/Resources;)V
    .locals 5

    .line 1
    sget-boolean v1, Lf0;->b:Z

    const v0, 0xfce

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    const-class v3, Landroid/content/res/Resources;

    const v0, 0xfcf

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Lf0;->a:Ljava/lang/reflect/Field;

    .line 3
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const v0, 0xfd0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {v2, v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    :goto_0
    sput-boolean v1, Lf0;->b:Z

    :cond_0
    const/4 v1, 0x0

    .line 6
    sget-object v3, Lf0;->a:Ljava/lang/reflect/Field;

    if-eqz v3, :cond_1

    .line 7
    :try_start_1
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    const v0, 0xfd1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-static {v2, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    return-void

    .line 9
    :cond_2
    invoke-static {v1}, Lf0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public static d(Landroid/content/res/Resources;)V
    .locals 6

    .line 1
    sget-boolean v1, Lf0;->h:Z

    const/4 v2, 0x1

    const v0, 0xfd2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-nez v1, :cond_0

    .line 2
    :try_start_0
    const-class v1, Landroid/content/res/Resources;

    const v0, 0xfd3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lf0;->g:Ljava/lang/reflect/Field;

    .line 3
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const v0, 0xfd4

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 5
    :goto_0
    sput-boolean v2, Lf0;->h:Z

    .line 6
    :cond_0
    sget-object v1, Lf0;->g:Ljava/lang/reflect/Field;

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v4, 0x0

    .line 7
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    const v0, 0xfd5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v3, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p0, v4

    :goto_1
    if-nez p0, :cond_2

    return-void

    .line 9
    :cond_2
    sget-boolean v1, Lf0;->b:Z

    if-nez v1, :cond_3

    .line 10
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const v0, 0xfd6

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lf0;->a:Ljava/lang/reflect/Field;

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    const v0, 0xfd7

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-static {v3, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 13
    :goto_2
    sput-boolean v2, Lf0;->b:Z

    .line 14
    :cond_3
    sget-object v1, Lf0;->a:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_4

    .line 15
    :try_start_3
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception p0

    const v0, 0xfd8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-static {v3, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    :goto_3
    if-eqz v4, :cond_5

    .line 17
    invoke-static {v4}, Lf0;->e(Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public static e(Ljava/lang/Object;)V
    .locals 5

    .line 1
    sget-boolean v1, Lf0;->d:Z

    const/4 v2, 0x1

    const v0, 0xfd9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-nez v1, :cond_0

    :try_start_0
    const v0, 0xfda

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Lf0;->c:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const v0, 0xfdb

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 4
    :goto_0
    sput-boolean v2, Lf0;->d:Z

    .line 5
    :cond_0
    sget-object v1, Lf0;->c:Ljava/lang/Class;

    if-nez v1, :cond_1

    return-void

    .line 6
    :cond_1
    sget-boolean v4, Lf0;->f:Z

    if-nez v4, :cond_2

    :try_start_1
    const v0, 0xfdc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lf0;->e:Ljava/lang/reflect/Field;

    .line 8
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const v0, 0xfdd

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 10
    :goto_1
    sput-boolean v2, Lf0;->f:Z

    .line 11
    :cond_2
    sget-object v1, Lf0;->e:Ljava/lang/reflect/Field;

    if-nez v1, :cond_3

    return-void

    :cond_3
    const/4 v2, 0x0

    .line 12
    :try_start_2
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/LongSparseArray;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v2, p0

    goto :goto_2

    :catch_2
    move-exception p0

    const v0, 0xfde

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-static {v3, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    if-eqz v2, :cond_4

    .line 14
    invoke-virtual {v2}, Landroid/util/LongSparseArray;->clear()V

    :cond_4
    return-void
.end method
