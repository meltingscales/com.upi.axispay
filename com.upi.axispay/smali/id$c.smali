.class public Lid$c;
.super Lmc;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:Lid;


# direct methods
.method public constructor <init>(Lid;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lid$c;->b:Lid;

    invoke-direct {p0}, Lmc;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)Llc;
    .locals 1

    .line 1
    iget-object v0, p0, Lid$c;->b:Lid;

    .line 2
    invoke-virtual {v0, p1}, Lid;->H(I)Llc;

    move-result-object p1

    .line 3
    invoke-static {p1}, Llc;->P(Llc;)Llc;

    move-result-object p1

    return-object p1
.end method

.method public d(I)Llc;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 1
    iget-object p1, p0, Lid$c;->b:Lid;

    iget p1, p1, Lid;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lid$c;->b:Lid;

    iget p1, p1, Lid;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_1
    invoke-virtual {p0, p1}, Lid$c;->b(I)Llc;

    move-result-object p1

    return-object p1
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lid$c;->b:Lid;

    invoke-virtual {v0, p1, p2, p3}, Lid;->P(IILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
