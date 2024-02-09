.class public abstract Lbs;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a(Landroid/content/Context;Llu;Lws;Lzu;)Lbt;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 2
    new-instance p3, Lvs;

    invoke-direct {p3, p0, p1, p2}, Lvs;-><init>(Landroid/content/Context;Llu;Lws;)V

    return-object p3

    .line 3
    :cond_0
    new-instance v0, Lss;

    invoke-direct {v0, p0, p1, p3, p2}, Lss;-><init>(Landroid/content/Context;Llu;Lzu;Lws;)V

    return-object v0
.end method
