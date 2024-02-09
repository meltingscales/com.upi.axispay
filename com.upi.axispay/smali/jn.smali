.class public Ljn;
.super Lon;
.source "AxisPay"

# interfaces
.implements Lln;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lon;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method public static g(Landroid/view/ViewGroup;)Ljn;
    .locals 0

    .line 1
    invoke-static {p0}, Lon;->e(Landroid/view/View;)Lon;

    move-result-object p0

    check-cast p0, Ljn;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lon;->a:Lon$a;

    invoke-virtual {v0, p1}, Lon$a;->b(Landroid/view/View;)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lon;->a:Lon$a;

    invoke-virtual {v0, p1}, Lon$a;->g(Landroid/view/View;)V

    return-void
.end method
