.class public Lgy$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lub;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgy;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgy;


# direct methods
.method public constructor <init>(Lgy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgy$a;->a:Lgy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lic;)Lic;
    .locals 4

    .line 1
    iget-object p1, p0, Lgy$a;->a:Lgy;

    iget-object v0, p1, Lgy;->c:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p1, Lgy;->c:Landroid/graphics/Rect;

    .line 3
    :cond_0
    iget-object p1, p0, Lgy$a;->a:Lgy;

    iget-object p1, p1, Lgy;->c:Landroid/graphics/Rect;

    .line 4
    invoke-virtual {p2}, Lic;->j()I

    move-result v0

    .line 5
    invoke-virtual {p2}, Lic;->l()I

    move-result v1

    .line 6
    invoke-virtual {p2}, Lic;->k()I

    move-result v2

    .line 7
    invoke-virtual {p2}, Lic;->i()I

    move-result v3

    .line 8
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 9
    iget-object p1, p0, Lgy$a;->a:Lgy;

    invoke-virtual {p1, p2}, Lgy;->a(Lic;)V

    .line 10
    iget-object p1, p0, Lgy$a;->a:Lgy;

    invoke-virtual {p2}, Lic;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lgy$a;->a:Lgy;

    iget-object v0, v0, Lgy;->b:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V

    .line 11
    iget-object p1, p0, Lgy$a;->a:Lgy;

    invoke-static {p1}, Lac;->h0(Landroid/view/View;)V

    .line 12
    invoke-virtual {p2}, Lic;->c()Lic;

    move-result-object p1

    return-object p1
.end method
