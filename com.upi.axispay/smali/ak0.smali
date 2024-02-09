.class public Lak0;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static final a(Lwj0;)Lwj0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwj0<",
            "-TT;>;)",
            "Lwj0<",
            "TT;>;"
        }
    .end annotation

    const v0, 0x2f70

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of v0, p0, Lek0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lek0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lek0;->intercepted()Lwj0;

    move-result-object p0

    :goto_1
    return-object p0
.end method
