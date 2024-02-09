.class public Lqe0$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqe0;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lqe0;


# direct methods
.method public constructor <init>(Lqe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqe0$g;->b:Lqe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lqe0$g;->b:Lqe0;

    iget p1, p1, Lqe0;->v:I

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    .line 2
    invoke-static {}, Leg0;->c()V

    .line 3
    iget-object p1, p0, Lqe0$g;->b:Lqe0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->c()V

    .line 5
    iget-object p1, p0, Lqe0$g;->b:Lqe0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 6
    iget-object p1, p0, Lqe0$g;->b:Lqe0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/4 v0, 0x4

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
