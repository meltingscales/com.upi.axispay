.class public Ldi0;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi0$a;
    }
.end annotation


# direct methods
.method public static final a(Lei0;Lsk0;)Lci0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lei0;",
            "Lsk0<",
            "+TT;>;)",
            "Lci0<",
            "TT;>;"
        }
    .end annotation

    const v0, 0x3a5f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3a60

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Ldi0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    .line 2
    new-instance p0, Lqi0;

    invoke-direct {p0, p1}, Lqi0;-><init>(Lsk0;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lfi0;

    invoke-direct {p0}, Lfi0;-><init>()V

    throw p0

    .line 3
    :cond_1
    new-instance p0, Lji0;

    invoke-direct {p0, p1}, Lji0;-><init>(Lsk0;)V

    goto :goto_0

    .line 4
    :cond_2
    new-instance p0, Lki0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v1, v0}, Lki0;-><init>(Lsk0;Ljava/lang/Object;ILvl0;)V

    :goto_0
    return-object p0
.end method

.method public static final b(Lsk0;)Lci0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lsk0<",
            "+TT;>;)",
            "Lci0<",
            "TT;>;"
        }
    .end annotation

    const v0, 0x3a61

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lki0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lki0;-><init>(Lsk0;Ljava/lang/Object;ILvl0;)V

    return-object v0
.end method
