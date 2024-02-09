.class public Lyf0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyf0;->I()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/RadioGroup;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lyf0;


# direct methods
.method public constructor <init>(Lyf0;Landroid/widget/RadioGroup;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyf0$c;->d:Lyf0;

    iput-object p2, p0, Lyf0$c;->b:Landroid/widget/RadioGroup;

    iput-object p3, p0, Lyf0$c;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lyf0$c;->b:Landroid/widget/RadioGroup;

    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result p1

    .line 2
    iget-object v0, p0, Lyf0$c;->d:Lyf0;

    iget-object v0, v0, Lyf0;->t0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    .line 3
    new-instance v0, Lcom/olive/upi/transport/model/UdirReasons;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/UdirReasons;-><init>()V

    .line 4
    iget-object v1, p0, Lyf0$c;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    goto :goto_2

    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto :goto_1

    .line 5
    :sswitch_0
    iget-object p1, p0, Lyf0$c;->c:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/UdirReasons;

    goto :goto_0

    .line 6
    :sswitch_1
    iget-object p1, p0, Lyf0$c;->c:Ljava/util/List;

    const/4 v0, 0x3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/UdirReasons;

    goto :goto_0

    .line 7
    :sswitch_2
    iget-object p1, p0, Lyf0$c;->c:Ljava/util/List;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/UdirReasons;

    goto :goto_0

    .line 8
    :sswitch_3
    iget-object p1, p0, Lyf0$c;->c:Ljava/util/List;

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/UdirReasons;

    :goto_0
    move-object v0, p1

    .line 9
    :goto_1
    iget-object p1, p0, Lyf0$c;->d:Lyf0;

    invoke-static {p1}, Lyf0;->x(Lyf0;)Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/UdirReasons;->setTransactionID(Ljava/lang/String;)V

    .line 10
    :cond_1
    :goto_2
    iget-object p1, p0, Lyf0$c;->d:Lyf0;

    iget-object p1, p1, Lyf0;->t0:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 11
    iget-object p1, p0, Lyf0$c;->d:Lyf0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 12
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0x18

    const/16 v3, 0x60

    invoke-direct {v1, v2, v3, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0a0040 -> :sswitch_3
        0x7f0a014d -> :sswitch_2
        0x7f0a0191 -> :sswitch_1
        0x7f0a0207 -> :sswitch_0
    .end sparse-switch
.end method
