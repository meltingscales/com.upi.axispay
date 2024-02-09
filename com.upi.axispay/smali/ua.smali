.class public final Lua;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lua$f;,
        Lua$a;,
        Lua$b;,
        Lua$c;,
        Lua$e;,
        Lua$d;
    }
.end annotation


# static fields
.field public static final a:Lta;

.field public static final b:Lta;

.field public static final c:Lta;

.field public static final d:Lta;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lua$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lua$e;-><init>(Lua$c;Z)V

    sput-object v0, Lua;->a:Lta;

    .line 2
    new-instance v0, Lua$e;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lua$e;-><init>(Lua$c;Z)V

    sput-object v0, Lua;->b:Lta;

    .line 3
    new-instance v0, Lua$e;

    sget-object v1, Lua$b;->a:Lua$b;

    invoke-direct {v0, v1, v2}, Lua$e;-><init>(Lua$c;Z)V

    sput-object v0, Lua;->c:Lta;

    .line 4
    new-instance v0, Lua$e;

    invoke-direct {v0, v1, v3}, Lua$e;-><init>(Lua$c;Z)V

    sput-object v0, Lua;->d:Lta;

    .line 5
    sget-object v0, Lua$a;->b:Lua$a;

    .line 6
    sget-object v0, Lua$f;->b:Lua$f;

    return-void
.end method

.method public static a(I)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method public static b(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    packed-switch p0, :pswitch_data_0

    return v1

    :cond_0
    :pswitch_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :pswitch_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
