.class public Lof0$m;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/PendingReqVo;

.field public final synthetic c:Lof0;


# direct methods
.method public constructor <init>(Lof0;Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$m;->c:Lof0;

    iput-object p2, p0, Lof0$m;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lof0$m;->c:Lof0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    iget-object v1, p0, Lof0$m;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    const/16 v2, 0x9

    const/16 v3, 0x1d

    invoke-direct {v0, v2, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 2
    iget-object p1, p0, Lof0$m;->c:Lof0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Lof0$m;->c:Lof0;

    const v1, 0x7f1203c3

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lof0$m$a;

    invoke-direct {v1, p0}, Lof0$m$a;-><init>(Lof0$m;)V

    invoke-static {p1, v0, v1}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void
.end method
