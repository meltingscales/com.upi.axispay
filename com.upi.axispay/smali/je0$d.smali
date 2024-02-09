.class public Lje0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lje0;


# direct methods
.method public constructor <init>(Lje0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje0$d;->b:Lje0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x18f9

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x18fa

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ln70;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Lqa0;->r0(I)V

    .line 3
    iget-object p1, p0, Lje0$d;->b:Lje0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    sget-object v1, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
