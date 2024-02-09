.class public Lqf0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf0;->B(Lcom/olive/upi/transport/model/Account;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Account;

.field public final synthetic c:Lqf0;


# direct methods
.method public constructor <init>(Lqf0;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqf0$d;->c:Lqf0;

    iput-object p2, p0, Lqf0$d;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Lqa0;->r0(I)V

    .line 3
    iget-object p1, p0, Lqf0$d;->c:Lqf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    iget-object v1, p0, Lqf0$d;->b:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
