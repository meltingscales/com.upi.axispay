.class public final Lrh0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lnh0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lnh0$a;)Lmh0;
    .locals 5

    const v0, 0x1afc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Lnh0$a;->request()Llh0;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Llh0;->c()Lkh0;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Llh0;->e()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1}, Llh0;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Llh0;->b()Landroid/content/Context;

    move-result-object v3

    .line 4
    invoke-virtual {p1}, Llh0;->a()Landroid/util/AttributeSet;

    move-result-object v4

    .line 5
    invoke-interface {v0, v1, v2, v3, v4}, Lkh0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 6
    new-instance v1, Lmh0;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Llh0;->d()Ljava/lang/String;

    move-result-object v2

    .line 8
    :goto_0
    invoke-virtual {p1}, Llh0;->b()Landroid/content/Context;

    move-result-object v3

    .line 9
    invoke-virtual {p1}, Llh0;->a()Landroid/util/AttributeSet;

    move-result-object p1

    .line 10
    invoke-direct {v1, v0, v2, v3, p1}, Lmh0;-><init>(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v1
.end method
