.class public Lxe0$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe0;->z(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Lxe0;


# direct methods
.method public constructor <init>(Lxe0;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxe0$e;->c:Lxe0;

    iput-object p2, p0, Lxe0$e;->b:Landroid/app/Dialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/GetMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/GetMandate;-><init>()V

    .line 3
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v2, 0xb5c

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/GetMandate;->setCustomerid(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/GetMandate;->setUmn(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/GetMandate;->setTxnid(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0xb5d

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/GetMandate;->setAppid(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lxe0$e;->c:Lxe0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 8
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x47

    const/16 v3, 0x4b

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 9
    iget-object p1, p0, Lxe0$e;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->hide()V

    return-void
.end method
