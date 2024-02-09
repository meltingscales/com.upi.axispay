.class public Lcom/upi/axispay/custom/SingleButtonDialog;
.super Landroid/app/DialogFragment;
.source "AxisPay"


# static fields
.field public static singleButtonDialog:Lcom/upi/axispay/custom/SingleButtonDialog;


# instance fields
.field public cancelListner:Landroid/view/View$OnClickListener;

.field public message:Ljava/lang/String;

.field public okBtnText:Ljava/lang/String;

.field public okListner:Landroid/view/View$OnClickListener;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance()Lcom/upi/axispay/custom/SingleButtonDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/upi/axispay/custom/SingleButtonDialog;

    invoke-direct {v0}, Lcom/upi/axispay/custom/SingleButtonDialog;-><init>()V

    sput-object v0, Lcom/upi/axispay/custom/SingleButtonDialog;->singleButtonDialog:Lcom/upi/axispay/custom/SingleButtonDialog;

    return-object v0
.end method


# virtual methods
.method public getCancelListner()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->cancelListner:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 1
    new-instance p1, Ly$a;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f1300f5

    invoke-direct {p1, v0, v1}, Ly$a;-><init>(Landroid/content/Context;I)V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d005b

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    const v1, 0x7f0a0102

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v3, 0x7f0a0174

    .line 4
    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 5
    iget-object v4, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->title:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v4, 0x1

    .line 6
    invoke-virtual {v3, v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 7
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    const v4, 0x7f0600bd

    invoke-static {v2, v4}, Lt8;->d(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v2, 0x7f0a0172

    .line 8
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 9
    iget-object v3, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->message:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f0a016f

    .line 10
    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 11
    invoke-virtual {p1, v0}, Ly$a;->k(Landroid/view/View;)Ly$a;

    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Ly$a;->d(Z)Ly$a;

    .line 13
    iget-object v0, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->okBtnText:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v0, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->cancelListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object v0, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->okListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    invoke-virtual {p1}, Ly$a;->a()Ly;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 17
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const v1, 0x7f1300fb

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    :cond_0
    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d005b

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public setCancelListner(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->cancelListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->message:Ljava/lang/String;

    return-void
.end method

.method public setOkBtnText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->okBtnText:Ljava/lang/String;

    return-void
.end method

.method public setOkListner(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->okListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonDialog;->title:Ljava/lang/String;

    return-void
.end method
