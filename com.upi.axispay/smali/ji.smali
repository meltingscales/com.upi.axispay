.class public abstract Lji;
.super Luh;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji$a;,
        Lji$d;,
        Lji$c;,
        Lji$b;,
        Lji$e;,
        Lji$f;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    new-instance v0, Luh$d;

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lji;

    .line 2
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const v3, 0x26a4

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Luh$d;-><init>(Landroid/content/ComponentName;)V

    .line 3
    invoke-direct {p0, p1, v0}, Luh;-><init>(Landroid/content/Context;Luh$d;)V

    return-void
.end method

.method public static A(Landroid/content/Context;Lji$f;)Lji;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Lji$a;

    invoke-direct {v0, p0, p1}, Lji$a;-><init>(Landroid/content/Context;Lji$f;)V

    return-object v0

    :cond_0
    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 3
    new-instance v0, Lji$d;

    invoke-direct {v0, p0, p1}, Lji$d;-><init>(Landroid/content/Context;Lji$f;)V

    return-object v0

    :cond_1
    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    .line 4
    new-instance v0, Lji$c;

    invoke-direct {v0, p0, p1}, Lji$c;-><init>(Landroid/content/Context;Lji$f;)V

    return-object v0

    :cond_2
    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    .line 5
    new-instance v0, Lji$b;

    invoke-direct {v0, p0, p1}, Lji$b;-><init>(Landroid/content/Context;Lji$f;)V

    return-object v0

    .line 6
    :cond_3
    new-instance p1, Lji$e;

    invoke-direct {p1, p0}, Lji$e;-><init>(Landroid/content/Context;)V

    return-object p1
.end method


# virtual methods
.method public B(Lyh$i;)V
    .locals 0

    return-void
.end method

.method public C(Lyh$i;)V
    .locals 0

    return-void
.end method

.method public D(Lyh$i;)V
    .locals 0

    return-void
.end method

.method public E(Lyh$i;)V
    .locals 0

    return-void
.end method
