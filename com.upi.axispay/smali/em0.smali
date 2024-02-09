.class public abstract Lem0;
.super Lgm0;
.source "AxisPay"

# interfaces
.implements Lcn0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lgm0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()Lvm0;
    .locals 0

    .line 1
    invoke-static {p0}, Lkm0;->d(Lem0;)Lcn0;

    return-object p0
.end method

.method public getGetter()Lcn0$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgm0;->getReflected()Lan0;

    move-result-object v0

    check-cast v0, Lcn0;

    invoke-interface {v0}, Lcn0;->getGetter()Lcn0$a;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lcn0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
