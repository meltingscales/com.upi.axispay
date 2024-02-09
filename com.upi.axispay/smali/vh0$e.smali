.class public final Lvh0$e;
.super Lvh0$g;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final c:Lvh0$f;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater$Factory2;Lvh0;)V
    .locals 1

    const v0, 0x218d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x218e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lvh0$g;-><init>(Landroid/view/LayoutInflater$Factory2;)V

    .line 2
    new-instance v0, Lvh0$f;

    invoke-direct {v0, p1, p2}, Lvh0$f;-><init>(Landroid/view/LayoutInflater$Factory2;Lvh0;)V

    iput-object v0, p0, Lvh0$e;->c:Lvh0$f;

    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    const v0, 0x218f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2190

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0}, Lph0$c;->b()Lph0;

    move-result-object v0

    .line 2
    new-instance v7, Llh0;

    .line 3
    iget-object v6, p0, Lvh0$e;->c:Lvh0$f;

    move-object v1, v7

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p1

    .line 4
    invoke-direct/range {v1 .. v6}, Llh0;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;Lkh0;)V

    invoke-virtual {v0, v7}, Lph0;->d(Llh0;)Lmh0;

    move-result-object p1

    invoke-virtual {p1}, Lmh0;->e()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
