.class public final Llp$b;
.super Lrp$a;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lrp$b;

.field public b:Lhp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrp$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lrp;
    .locals 4

    .line 1
    new-instance v0, Llp;

    iget-object v1, p0, Llp$b;->a:Lrp$b;

    iget-object v2, p0, Llp$b;->b:Lhp;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Llp;-><init>(Lrp$b;Lhp;Llp$a;)V

    return-object v0
.end method

.method public b(Lhp;)Lrp$a;
    .locals 0

    .line 1
    iput-object p1, p0, Llp$b;->b:Lhp;

    return-object p0
.end method

.method public c(Lrp$b;)Lrp$a;
    .locals 0

    .line 1
    iput-object p1, p0, Llp$b;->a:Lrp$b;

    return-object p0
.end method
