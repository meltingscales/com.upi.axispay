.class public final Lii0;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static final a(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    const v0, 0xb2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lhi0$b;

    invoke-direct {v0, p0}, Lhi0$b;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lhi0$b;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Lhi0$b;

    iget-object p0, p0, Lhi0$b;->b:Ljava/lang/Throwable;

    throw p0
.end method
