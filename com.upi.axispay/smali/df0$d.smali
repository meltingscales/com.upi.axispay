.class public Ldf0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ldf0;


# direct methods
.method public constructor <init>(Ldf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldf0$d;->b:Ldf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Ldf0;->B:Lhg0;

    invoke-virtual {p1}, Lhg0;->d()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x5

    if-ne p1, v1, :cond_0

    .line 2
    iget-object p1, p0, Ldf0$d;->b:Ldf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v1, 0xb

    invoke-interface {p1, v1, v0}, Lmg0;->o(ILjava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Ldf0$d;->b:Ldf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Lsd;->D()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/FragmentManager;->b1(Ljava/lang/String;I)V

    .line 4
    iget-object p1, p0, Ldf0$d;->b:Ldf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/4 v1, 0x4

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
