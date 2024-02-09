.class public Lji$a;
.super Lji$d;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lji;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lji$f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lji$d;-><init>(Landroid/content/Context;Lji$f;)V

    return-void
.end method


# virtual methods
.method public P(Lji$b$b;Lsh$a;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lji$d;->P(Lji$b$b;Lsh$a;)V

    .line 2
    iget-object p1, p1, Lji$b$b;->a:Ljava/lang/Object;

    invoke-static {p1}, Lai;->a(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p2, p1}, Lsh$a;->i(I)Lsh$a;

    return-void
.end method
