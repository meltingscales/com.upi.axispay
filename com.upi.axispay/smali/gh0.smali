.class public final Lgh0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lmyunmn/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgh0$a;
    }
.end annotation


# instance fields
.field public final a:Lfh0;


# direct methods
.method public constructor <init>(Lfh0;)V
    .locals 1

    const v0, 0x1a6d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgh0;->a:Lfh0;

    return-void
.end method


# virtual methods
.method public a(Lmyunmn/aQ;)V
    .locals 3

    const v0, 0x1a6e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lmyunmn/aQ;->b()Lmyunmn/af;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lgh0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 v2, 0x3

    if-eq v0, v2, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    goto :goto_2

    .line 2
    :cond_1
    iget-object v0, p0, Lgh0;->a:Lfh0;

    check-cast p1, Lmyunmn/ax;

    invoke-virtual {p1}, Lmyunmn/ax;->a()Z

    move-result p1

    invoke-interface {v0, p1}, Lfh0;->d(Z)V

    goto :goto_2

    .line 3
    :cond_2
    iget-object v0, p0, Lgh0;->a:Lfh0;

    check-cast p1, Lmyunmn/I;

    invoke-virtual {p1}, Lmyunmn/I;->a()Z

    move-result p1

    invoke-interface {v0, p1}, Lfh0;->k(Z)V

    goto :goto_2

    .line 4
    :cond_3
    iget-object v0, p0, Lgh0;->a:Lfh0;

    .line 5
    check-cast p1, Lmyunmn/aV;

    invoke-virtual {p1}, Lmyunmn/aV;->c()Z

    move-result v2

    if-nez v2, :cond_5

    .line 6
    invoke-virtual {p1}, Lmyunmn/aV;->d()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p1}, Lmyunmn/aV;->a()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 7
    :cond_5
    :goto_1
    invoke-interface {v0, v1}, Lfh0;->q(Z)V

    goto :goto_2

    .line 8
    :cond_6
    iget-object v0, p0, Lgh0;->a:Lfh0;

    check-cast p1, Lmyunmn/m;

    invoke-virtual {p1}, Lmyunmn/m;->a()Z

    move-result p1

    invoke-interface {v0, p1}, Lfh0;->v(Z)V

    goto :goto_2

    .line 9
    :cond_7
    iget-object v0, p0, Lgh0;->a:Lfh0;

    check-cast p1, Lmyunmn/L;

    invoke-virtual {p1}, Lmyunmn/L;->c()Z

    move-result p1

    invoke-interface {v0, p1}, Lfh0;->h(Z)V

    :goto_2
    return-void
.end method
