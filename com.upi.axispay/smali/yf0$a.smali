.class public Lyf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyf0;->H(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lyf0;


# direct methods
.method public constructor <init>(Lyf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyf0$a;->b:Lyf0;

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

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lqa0;->U(Ldg0;)V

    .line 4
    iget-object p1, p0, Lyf0$a;->b:Lyf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v1, 0xb

    invoke-interface {p1, v1, v0}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method
