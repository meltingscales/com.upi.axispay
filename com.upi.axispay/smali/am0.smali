.class public abstract Lam0;
.super Lcm0;
.source "AxisPay"

# interfaces
.implements Lzm0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcm0;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcm0;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lcm0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()Lvm0;
    .locals 0

    .line 1
    invoke-static {p0}, Lkm0;->c(Lam0;)Lzm0;

    return-object p0
.end method

.method public getDelegate()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgm0;->getReflected()Lan0;

    move-result-object v0

    check-cast v0, Lzm0;

    invoke-interface {v0}, Lbn0;->getDelegate()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getGetter()Lan0$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lam0;->getGetter()Lbn0$a;

    move-result-object v0

    return-object v0
.end method

.method public getGetter()Lbn0$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lgm0;->getReflected()Lan0;

    move-result-object v0

    check-cast v0, Lzm0;

    invoke-interface {v0}, Lbn0;->getGetter()Lbn0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSetter()Lym0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lam0;->getSetter()Lzm0$a;

    move-result-object v0

    return-object v0
.end method

.method public getSetter()Lzm0$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lgm0;->getReflected()Lan0;

    move-result-object v0

    check-cast v0, Lzm0;

    invoke-interface {v0}, Lzm0;->getSetter()Lzm0$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Lbn0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
