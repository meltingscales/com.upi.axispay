.class public Loa;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loa$c;,
        Loa$a;,
        Loa$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lma;IZILandroid/os/Handler;Loa$c;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    new-instance v0, Lja;

    invoke-direct {v0, p6, p5}, Lja;-><init>(Loa$c;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    .line 2
    invoke-static {p0, p1, v0, p2, p4}, Lna;->e(Landroid/content/Context;Lma;Lja;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    .line 3
    invoke-static {p0, p1, p2, p3, v0}, Lna;->d(Landroid/content/Context;Lma;ILjava/util/concurrent/Executor;Lja;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
