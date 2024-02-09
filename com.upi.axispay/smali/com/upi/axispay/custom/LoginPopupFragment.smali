.class public Lcom/upi/axispay/custom/LoginPopupFragment;
.super Landroid/app/DialogFragment;
.source "AxisPay"

# interfaces
.implements Lua0$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;
    }
.end annotation


# static fields
.field public static fragment:Lcom/upi/axispay/custom/LoginPopupFragment;

.field public static sourceID:I


# instance fields
.field public TAG:Ljava/lang/String;

.field public activity:Landroid/app/Activity;

.field public cancelListner:Landroid/view/View$OnClickListener;

.field public imageView:Landroid/widget/ImageView;

.field public loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

.field private mListener:Lmg0;

.field public message:Ljava/lang/String;

.field public okListner:Landroid/view/View$OnClickListener;

.field public pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const v0, 0x2168

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->TAG:Ljava/lang/String;

    .line 3
    new-instance v0, Lcom/upi/axispay/custom/LoginPopupFragment$1;

    invoke-direct {v0, p0}, Lcom/upi/axispay/custom/LoginPopupFragment$1;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    iput-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->okListner:Landroid/view/View$OnClickListener;

    .line 4
    new-instance v0, Lcom/upi/axispay/custom/LoginPopupFragment$2;

    invoke-direct {v0, p0}, Lcom/upi/axispay/custom/LoginPopupFragment$2;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    iput-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->cancelListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private synthetic a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private synthetic c(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private goNext()V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/upi/axispay/activity/MainActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    sget v1, Lcom/upi/axispay/custom/LoginPopupFragment;->sourceID:I

    const v2, 0x2169

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/DialogFragment;->startActivity(Landroid/content/Intent;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static newInstance(I)Lcom/upi/axispay/custom/LoginPopupFragment;
    .locals 1

    .line 1
    sget-object v0, Lcom/upi/axispay/custom/LoginPopupFragment;->fragment:Lcom/upi/axispay/custom/LoginPopupFragment;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-direct {v0}, Lcom/upi/axispay/custom/LoginPopupFragment;-><init>()V

    sput-object v0, Lcom/upi/axispay/custom/LoginPopupFragment;->fragment:Lcom/upi/axispay/custom/LoginPopupFragment;

    .line 3
    :cond_0
    sput p0, Lcom/upi/axispay/custom/LoginPopupFragment;->sourceID:I

    .line 4
    sget-object p0, Lcom/upi/axispay/custom/LoginPopupFragment;->fragment:Lcom/upi/axispay/custom/LoginPopupFragment;

    return-object p0
.end method


# virtual methods
.method public synthetic b(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/upi/axispay/custom/LoginPopupFragment;->a(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public synthetic d(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/upi/axispay/custom/LoginPopupFragment;->c(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onAttach(Landroid/content/Context;)V

    .line 2
    instance-of v0, p1, Lmg0;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lmg0;

    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->mListener:Lmg0;

    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const p1, 0x216a

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->activity:Landroid/app/Activity;

    .line 2
    new-instance p1, Ly$a;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f1300f5

    invoke-direct {p1, v0, v1}, Ly$a;-><init>(Landroid/content/Context;I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0080

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v1, 0x7f0a00ec

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v3, 0x7f0a00d6

    .line 5
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    const v4, 0x7f0a02af

    .line 6
    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0a0174

    .line 7
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const/4 v6, 0x1

    .line 8
    invoke-virtual {v5, v2, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const v2, 0x7f0a0171

    .line 9
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->imageView:Landroid/widget/ImageView;

    .line 10
    invoke-virtual {p1, v0}, Ly$a;->k(Landroid/view/View;)Ly$a;

    const v2, 0x7f0a016f

    .line 11
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 12
    iget-object v5, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->imageView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v6

    const v7, 0x7f060049

    invoke-static {v6, v7}, Lt8;->d(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    const v5, 0x7f0a02b0

    .line 13
    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/upi/axispay/custom/FloatingInputLayout;

    iput-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 v5, 0x4

    .line 14
    invoke-virtual {v0, v5}, Lcom/upi/axispay/custom/FloatingInputLayout;->setInputType(I)V

    .line 15
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    const/4 v5, 0x6

    invoke-virtual {v0, v5}, Lcom/upi/axispay/custom/FloatingInputLayout;->setMaxLength(I)V

    .line 16
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    const v5, 0x216b

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/upi/axispay/custom/FloatingInputLayout;->setEditTextImeOptions(Ljava/lang/String;)V

    .line 17
    new-instance v0, Lcom/upi/axispay/custom/LoginPopupFragment$3;

    invoke-direct {v0, p0}, Lcom/upi/axispay/custom/LoginPopupFragment$3;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    invoke-virtual {p1}, Ly$a;->a()Ly;

    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->message:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->okListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->cancelListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->cancelListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 25
    iget-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->cancelListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public onDetach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onDetach()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->mListener:Lmg0;

    return-void
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 4

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->dismiss()V

    const/4 v0, 0x0

    if-nez p2, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const p2, 0x7f1204b7

    invoke-virtual {p0, p2}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;->onLoginComplete(Z)V

    :cond_0
    return-void

    .line 5
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    const/16 v3, 0x17

    if-ne v2, v3, :cond_8

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;->onLoginComplete(Z)V

    :cond_2
    const p1, 0x216c

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 10
    sget p1, Lcom/upi/axispay/custom/LoginPopupFragment;->sourceID:I

    const/16 p2, 0x41

    if-ne p1, p2, :cond_9

    .line 11
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->onBackPressed()V

    goto/16 :goto_0

    :cond_3
    const p1, 0x216d

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 13
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const p2, 0x7f1204b8

    invoke-static {p1, p2}, Leg0;->z(Landroid/content/Context;I)V

    goto/16 :goto_0

    :cond_4
    const p1, 0x216e

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 15
    invoke-static {}, Leg0;->c()V

    .line 16
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getView()Landroid/view/View;

    move-result-object p1

    const p2, 0x7f1202fd

    invoke-static {p1, p2}, Leg0;->x(Landroid/view/View;I)V

    goto/16 :goto_0

    :cond_5
    const p1, 0x216f

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const p2, 0x7f1201b3

    const v0, 0x2170

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_6

    .line 18
    invoke-static {}, Leg0;->c()V

    .line 19
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const v1, 0x7f120151

    invoke-virtual {p0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v2, Lta0;

    invoke-direct {v2, p0}, Lta0;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    invoke-static {p1, v0, v1, p2, v2}, Leg0;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    :cond_6
    const p1, 0x2171

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 21
    invoke-static {}, Leg0;->c()V

    .line 22
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Ljg0;->W(Landroid/app/Activity;)V

    goto :goto_0

    :cond_7
    const p1, 0x2172

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 24
    invoke-static {}, Leg0;->c()V

    .line 25
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const v1, 0x7f120126

    invoke-virtual {p0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v2, Lsa0;

    invoke-direct {v2, p0}, Lsa0;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    invoke-static {p1, v0, v1, p2, v2}, Leg0;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 26
    :cond_8
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x27

    if-ne p1, v0, :cond_9

    .line 27
    invoke-static {}, Leg0;->B()V

    .line 28
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const v0, 0x7f12005c

    invoke-virtual {p0, v0}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    const v1, 0x7f12031e

    invoke-virtual {p0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/upi/axispay/custom/LoginPopupFragment$6;

    invoke-direct {v2, p0}, Lcom/upi/axispay/custom/LoginPopupFragment$6;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    invoke-static {p1, v0, p2, v1, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    :cond_9
    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 16

    move-object/from16 v0, p0

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->isDetached()Z

    move-result v2

    if-nez v2, :cond_13

    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 3
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v2

    const/16 v3, 0x17

    const v5, 0x7f12042c

    const/16 v6, 0x84

    const/16 v7, 0x43

    const v8, 0x7f120148

    const/16 v9, 0x41

    const/16 v10, 0x1e

    const/16 v11, 0x36

    const v12, 0x7f1203dc

    const v13, 0x2173

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    const v14, 0x2174

    invoke-static {v14}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    const v15, 0x2175

    invoke-static {v15}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    const/4 v4, 0x1

    if-ne v2, v3, :cond_9

    const v2, 0x2176

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 5
    iget-object v1, v0, Lcom/upi/axispay/custom/LoginPopupFragment;->loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

    if-eqz v1, :cond_1

    invoke-interface {v1, v4}, Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;->onLoginComplete(Z)V

    .line 6
    :cond_1
    sget v1, Lcom/upi/axispay/custom/LoginPopupFragment;->sourceID:I

    if-ne v1, v11, :cond_2

    .line 7
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    invoke-virtual {v0, v12}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 10
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v13, v4}, Ln70;->A(Ljava/lang/String;Z)V

    .line 11
    invoke-static {}, Leg0;->B()V

    .line 12
    invoke-direct/range {p0 .. p0}, Lcom/upi/axispay/custom/LoginPopupFragment;->goNext()V

    .line 13
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto/16 :goto_0

    :cond_2
    if-ne v1, v10, :cond_3

    .line 14
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 15
    invoke-virtual {v0, v8}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 17
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    invoke-virtual {v1}, Lua0;->w()V

    goto :goto_0

    :cond_3
    if-ne v1, v9, :cond_4

    .line 18
    invoke-static {}, Leg0;->B()V

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto :goto_0

    :cond_4
    if-ne v1, v7, :cond_5

    .line 20
    invoke-static {}, Leg0;->B()V

    .line 21
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 22
    invoke-virtual {v0, v5}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 24
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v13, v4}, Ln70;->A(Ljava/lang/String;Z)V

    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto :goto_0

    :cond_5
    if-eq v1, v6, :cond_6

    const/16 v2, 0x83

    if-ne v1, v2, :cond_8

    .line 26
    :cond_6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 27
    invoke-virtual {v0, v12}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v13, v4}, Ln70;->A(Ljava/lang/String;Z)V

    .line 30
    invoke-static {}, Leg0;->B()V

    .line 31
    invoke-direct/range {p0 .. p0}, Lcom/upi/axispay/custom/LoginPopupFragment;->goNext()V

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto :goto_0

    .line 33
    :cond_7
    iget-object v1, v0, Lcom/upi/axispay/custom/LoginPopupFragment;->pinFieldLayout:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-virtual {v1}, Lcom/upi/axispay/custom/FloatingInputLayout;->hideError()V

    .line 34
    :cond_8
    :goto_0
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_2

    .line 35
    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_11

    .line 36
    iget-object v1, v0, Lcom/upi/axispay/custom/LoginPopupFragment;->loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

    if-eqz v1, :cond_a

    invoke-interface {v1, v4}, Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;->onLoginComplete(Z)V

    .line 37
    :cond_a
    sget v1, Lcom/upi/axispay/custom/LoginPopupFragment;->sourceID:I

    if-ne v1, v11, :cond_b

    .line 38
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 39
    invoke-virtual {v0, v12}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 41
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v13, v4}, Ln70;->A(Ljava/lang/String;Z)V

    .line 42
    invoke-direct/range {p0 .. p0}, Lcom/upi/axispay/custom/LoginPopupFragment;->goNext()V

    .line 43
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto/16 :goto_1

    :cond_b
    if-ne v1, v10, :cond_c

    .line 44
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 45
    invoke-virtual {v0, v8}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 47
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v1

    invoke-virtual {v1}, Lua0;->w()V

    goto :goto_1

    :cond_c
    if-ne v1, v9, :cond_d

    .line 48
    invoke-static {}, Leg0;->B()V

    .line 49
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto :goto_1

    :cond_d
    if-ne v1, v7, :cond_e

    .line 50
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 51
    invoke-virtual {v0, v5}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 53
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v13, v4}, Ln70;->A(Ljava/lang/String;Z)V

    .line 54
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    goto :goto_1

    :cond_e
    if-eq v1, v6, :cond_f

    const/16 v2, 0x83

    if-ne v1, v2, :cond_10

    .line 55
    :cond_f
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 56
    invoke-virtual {v0, v12}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v15, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v14, v1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 58
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Ld70;->e(Landroid/content/Context;)Ld70;

    .line 59
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1}, Ln70$a;->a()Ln70;

    move-result-object v1

    invoke-virtual {v1, v13, v4}, Ln70;->A(Ljava/lang/String;Z)V

    .line 60
    invoke-static {}, Leg0;->B()V

    .line 61
    invoke-direct/range {p0 .. p0}, Lcom/upi/axispay/custom/LoginPopupFragment;->goNext()V

    .line 62
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 63
    :cond_10
    :goto_1
    invoke-static {}, Leg0;->B()V

    goto :goto_2

    .line 64
    :cond_11
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/16 v2, 0x27

    if-ne v1, v2, :cond_12

    .line 65
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    invoke-virtual {v1}, Lqa0;->c()V

    .line 66
    invoke-static {}, Leg0;->B()V

    .line 67
    invoke-virtual/range {p0 .. p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v1, 0x7f12005c

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f12046a

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v1, 0x7f12031e

    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/upi/axispay/custom/LoginPopupFragment$4;

    invoke-direct {v6, v0}, Lcom/upi/axispay/custom/LoginPopupFragment$4;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    new-instance v7, Lcom/upi/axispay/custom/LoginPopupFragment$5;

    invoke-direct {v7, v0}, Lcom/upi/axispay/custom/LoginPopupFragment$5;-><init>(Lcom/upi/axispay/custom/LoginPopupFragment;)V

    invoke-static/range {v2 .. v7}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    :cond_12
    :goto_2
    return-void

    .line 68
    :cond_13
    :goto_3
    invoke-static {}, Leg0;->B()V

    .line 69
    iget-object v1, v0, Lcom/upi/axispay/custom/LoginPopupFragment;->loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

    if-eqz v1, :cond_14

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;->onLoginComplete(Z)V

    :cond_14
    return-void
.end method

.method public setCancelListner(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->cancelListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setLoginCompletionListener(Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->loginCompletionListener:Lcom/upi/axispay/custom/LoginPopupFragment$OnLoginCompletionListener;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/LoginPopupFragment;->message:Ljava/lang/String;

    return-void
.end method
