.class public Lm8;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8$d;,
        Lm8$a;,
        Lm8$c;,
        Lm8$b;,
        Lm8$f;,
        Lm8$e;
    }
.end annotation


# direct methods
.method public static a(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    iget-object p0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    return-object p0

    :cond_0
    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 3
    invoke-static {p0}, Lo8;->c(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
