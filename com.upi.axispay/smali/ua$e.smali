.class public Lua$e;
.super Lua$d;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lua;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(Lua$c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lua$d;-><init>(Lua$c;)V

    .line 2
    iput-boolean p2, p0, Lua$e;->b:Z

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lua$e;->b:Z

    return v0
.end method
