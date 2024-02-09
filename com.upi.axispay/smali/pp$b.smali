.class public final Lpp$b;
.super Lvp$a;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lvp$c;

.field public b:Lvp$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvp$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lvp;
    .locals 4

    .line 1
    new-instance v0, Lpp;

    iget-object v1, p0, Lpp$b;->a:Lvp$c;

    iget-object v2, p0, Lpp$b;->b:Lvp$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lpp;-><init>(Lvp$c;Lvp$b;Lpp$a;)V

    return-object v0
.end method

.method public b(Lvp$b;)Lvp$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpp$b;->b:Lvp$b;

    return-object p0
.end method

.method public c(Lvp$c;)Lvp$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lpp$b;->a:Lvp$c;

    return-object p0
.end method
