.class public Lfl$a;
.super Lcm$a;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl;->j(Ljava/io/File;)Lcm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lfl;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcm$a;-><init>(I)V

    return-void
.end method


# virtual methods
.method public d(Lbm;)V
    .locals 0

    return-void
.end method

.method public f(Lbm;)V
    .locals 2

    .line 1
    iget v0, p0, Lcm$a;->a:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 2
    invoke-interface {p1, v0}, Lbm;->h(I)V

    :cond_0
    return-void
.end method

.method public g(Lbm;II)V
    .locals 0

    return-void
.end method
