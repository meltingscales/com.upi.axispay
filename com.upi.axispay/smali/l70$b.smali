.class public Ll70$b;
.super Lok;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll70;-><init>(Lbl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lok<",
        "Lj70;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ll70;Lbl;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lok;-><init>(Lbl;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const v0, 0x342

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Lfm;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lj70;

    invoke-virtual {p0, p1, p2}, Ll70$b;->i(Lfm;Lj70;)V

    return-void
.end method

.method public i(Lfm;Lj70;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lj70;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    invoke-interface {p1, v1}, Ldm;->q(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p2}, Lj70;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ldm;->a(ILjava/lang/String;)V

    .line 4
    :goto_0
    invoke-virtual {p2}, Lj70;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    .line 5
    invoke-interface {p1, v1}, Ldm;->q(I)V

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p2}, Lj70;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ldm;->a(ILjava/lang/String;)V

    .line 7
    :goto_1
    invoke-virtual {p2}, Lj70;->c()Z

    move-result p2

    const/4 v0, 0x3

    int-to-long v1, p2

    .line 8
    invoke-interface {p1, v0, v1, v2}, Ldm;->C(IJ)V

    return-void
.end method
