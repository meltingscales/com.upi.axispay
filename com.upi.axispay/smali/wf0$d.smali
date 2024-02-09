.class public Lwf0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwf0;->N(Lcom/olive/upi/transport/model/Account;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lwf0;


# direct methods
.method public constructor <init>(Lwf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwf0$d;->b:Lwf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lwf0$d;->b:Lwf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    invoke-static {}, Lwf0;->G()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
