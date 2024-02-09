.class public Lmf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lmf0;


# direct methods
.method public constructor <init>(Lmf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmf0$a;->b:Lmf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0b001b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    const v1, 0x7f12018c

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    iget-object p1, p1, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 4
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    const v1, 0x7f120389

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    iget-object p1, p1, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {p1}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    iget-object v0, v0, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 6
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    const v1, 0x7f120351

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_2
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    iget-object p1, p1, Lmf0;->o:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-nez p1, :cond_3

    .line 8
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    const v1, 0x7f12005b

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_3
    iget-object p1, p0, Lmf0$a;->b:Lmf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 10
    new-instance p1, Lcom/olive/upi/transport/model/ChangeAppPin;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/ChangeAppPin;-><init>()V

    .line 11
    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    iget-object v0, v0, Lmf0;->l:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setOldPin(Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lmf0$a;->b:Lmf0;

    iget-object v0, v0, Lmf0;->m:Lcom/upi/axispay/custom/PinFieldLayout;

    invoke-virtual {v0}, Lcom/upi/axispay/custom/PinFieldLayout;->getPinText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/ChangeAppPin;->setNewPin(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0xd

    const/16 v3, 0x23

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
