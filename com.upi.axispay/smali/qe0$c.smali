.class public Lqe0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqe0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
    iput-object p1, p0, Lqe0$c;->b:Lqe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lqe0$c;->b:Lqe0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 2
    iget-object p1, p0, Lqe0$c;->b:Lqe0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/4 v1, 0x4

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
