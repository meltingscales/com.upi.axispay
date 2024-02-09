.class public abstract Lnu;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a()Ljava/lang/String;
    .locals 1

    const v0, 0x375a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c()I
    .locals 1

    .line 1
    sget v0, Lvu;->e:I

    return v0
.end method

.method public static d()Lmu;
    .locals 1

    .line 1
    sget-object v0, Lmu;->a:Lmu;

    return-object v0
.end method
