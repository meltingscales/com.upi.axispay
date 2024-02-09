.class public Lja;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Loa$c;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Loa$c;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lja;->a:Loa$c;

    .line 3
    iput-object p2, p0, Lja;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lja;->a:Loa$c;

    .line 2
    iget-object v1, p0, Lja;->b:Landroid/os/Handler;

    new-instance v2, Lja$b;

    invoke-direct {v2, p0, v0, p1}, Lja$b;-><init>(Lja;Loa$c;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(Lna$e;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lna$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object p1, p1, Lna$e;->a:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, Lja;->c(Landroid/graphics/Typeface;)V

    goto :goto_0

    .line 3
    :cond_0
    iget p1, p1, Lna$e;->b:I

    invoke-virtual {p0, p1}, Lja;->a(I)V

    :goto_0
    return-void
.end method

.method public final c(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lja;->a:Loa$c;

    .line 2
    iget-object v1, p0, Lja;->b:Landroid/os/Handler;

    new-instance v2, Lja$a;

    invoke-direct {v2, p0, v0, p1}, Lja$a;-><init>(Lja;Loa$c;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
