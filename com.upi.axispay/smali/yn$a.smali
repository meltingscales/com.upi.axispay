.class public Lyn$a;
.super Lcn;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyn;->g0(Landroid/view/ViewGroup;Lhn;ILhn;I)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lyn;


# direct methods
.method public constructor <init>(Lyn;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyn$a;->d:Lyn;

    iput-object p2, p0, Lyn$a;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lyn$a;->b:Landroid/view/View;

    iput-object p4, p0, Lyn$a;->c:Landroid/view/View;

    invoke-direct {p0}, Lcn;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lbn;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lyn$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lmn;->a(Landroid/view/ViewGroup;)Lln;

    move-result-object p1

    iget-object v0, p0, Lyn$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lln;->c(Landroid/view/View;)V

    return-void
.end method

.method public d(Lbn;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lyn$a;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lyn$a;->a:Landroid/view/ViewGroup;

    invoke-static {p1}, Lmn;->a(Landroid/view/ViewGroup;)Lln;

    move-result-object p1

    iget-object v0, p0, Lyn$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lln;->a(Landroid/view/View;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lyn$a;->d:Lyn;

    invoke-virtual {p1}, Lbn;->cancel()V

    :goto_0
    return-void
.end method

.method public e(Lbn;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyn$a;->c:Landroid/view/View;

    sget v1, Lym;->save_overlay_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lyn$a;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Lmn;->a(Landroid/view/ViewGroup;)Lln;

    move-result-object v0

    iget-object v1, p0, Lyn$a;->b:Landroid/view/View;

    invoke-interface {v0, v1}, Lln;->c(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1, p0}, Lbn;->O(Lbn$f;)Lbn;

    return-void
.end method
