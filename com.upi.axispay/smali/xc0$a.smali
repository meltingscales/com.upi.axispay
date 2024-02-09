.class public Lxc0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxc0;->o(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lxc0;


# direct methods
.method public constructor <init>(Lxc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxc0$a;->b:Lxc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lxc0$a;->b:Lxc0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lxc0$a;->b:Lxc0;

    invoke-virtual {p1}, Lxc0;->r()V

    .line 2
    :cond_0
    iget-object p1, p0, Lxc0$a;->b:Lxc0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lua0;->v(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->c()V

    .line 4
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lxc0$a;->b:Lxc0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    const-class v1, Lcom/upi/axispay/activity/LoginActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 6
    iget-object v0, p0, Lxc0$a;->b:Lxc0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 7
    iget-object p1, p0, Lxc0$a;->b:Lxc0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
