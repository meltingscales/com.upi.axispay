.class public Lcom/upi/axispay/custom/DoubleButtonDialog;
.super Landroid/app/DialogFragment;
.source "AxisPay"


# static fields
.field public static doubleButtonDialog:Lcom/upi/axispay/custom/DoubleButtonDialog;


# instance fields
.field public action_close:Landroid/widget/ImageView;

.field public button_cancel:Landroid/widget/Button;

.field public button_ok:Landroid/widget/Button;

.field public cancelBtnText:Ljava/lang/String;

.field public cancelListner:Landroid/view/View$OnClickListener;

.field public dialogLayout:Landroid/widget/RelativeLayout;

.field public hideImage:Z

.field public message:Ljava/lang/String;

.field public message2:Ljava/lang/String;

.field public messageView:Landroid/widget/TextView;

.field public okBtnText:Ljava/lang/String;

.field public okListner:Landroid/view/View$OnClickListener;

.field public title:Ljava/lang/String;

.field public titleView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static newInstance()Lcom/upi/axispay/custom/DoubleButtonDialog;
    .locals 1

    .line 1
    sget-object v0, Lcom/upi/axispay/custom/DoubleButtonDialog;->doubleButtonDialog:Lcom/upi/axispay/custom/DoubleButtonDialog;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/upi/axispay/custom/DoubleButtonDialog;

    invoke-direct {v0}, Lcom/upi/axispay/custom/DoubleButtonDialog;-><init>()V

    sput-object v0, Lcom/upi/axispay/custom/DoubleButtonDialog;->doubleButtonDialog:Lcom/upi/axispay/custom/DoubleButtonDialog;

    .line 3
    :cond_0
    sget-object v0, Lcom/upi/axispay/custom/DoubleButtonDialog;->doubleButtonDialog:Lcom/upi/axispay/custom/DoubleButtonDialog;

    return-object v0
.end method


# virtual methods
.method public imageHide(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->hideImage:Z

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

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

    const v1, 0x7f0d005c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->dialogLayout:Landroid/widget/RelativeLayout;

    const v1, 0x7f0a0102

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_ok:Landroid/widget/Button;

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->dialogLayout:Landroid/widget/RelativeLayout;

    const v1, 0x7f0a00eb

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_cancel:Landroid/widget/Button;

    .line 5
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->dialogLayout:Landroid/widget/RelativeLayout;

    const v1, 0x7f0a0174

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->titleView:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->dialogLayout:Landroid/widget/RelativeLayout;

    const v1, 0x7f0a016f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->action_close:Landroid/widget/ImageView;

    .line 7
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->titleView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->titleView:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 9
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->titleView:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0600bd

    invoke-static {v1, v2}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 10
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->dialogLayout:Landroid/widget/RelativeLayout;

    const v1, 0x7f0a0172

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->messageView:Landroid/widget/TextView;

    .line 11
    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->dialogLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Ly$a;->k(Landroid/view/View;)Ly$a;

    .line 13
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_ok:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->okBtnText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_cancel:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->cancelBtnText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->action_close:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->hideImage:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_ok:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->okListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_cancel:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->cancelListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    invoke-virtual {p1, v2}, Ly$a;->d(Z)Ly$a;

    .line 19
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->action_close:Landroid/widget/ImageView;

    new-instance v1, Lcom/upi/axispay/custom/DoubleButtonDialog$1;

    invoke-direct {v1, p0}, Lcom/upi/axispay/custom/DoubleButtonDialog$1;-><init>(Lcom/upi/axispay/custom/DoubleButtonDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    invoke-virtual {p1}, Ly$a;->a()Ly;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 21
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 22
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const v1, 0x7f1300fb

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    :cond_1
    return-object p1
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->titleView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->messageView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_ok:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->okBtnText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_cancel:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->cancelBtnText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_ok:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->okListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    iget-object v0, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->button_cancel:Landroid/widget/Button;

    iget-object v1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->cancelListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setCancelBtnText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->cancelBtnText:Ljava/lang/String;

    return-void
.end method

.method public setCancelListner(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->cancelListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->message:Ljava/lang/String;

    return-void
.end method

.method public setMessage2(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->message:Ljava/lang/String;

    return-void
.end method

.method public setOkBtnText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->okBtnText:Ljava/lang/String;

    return-void
.end method

.method public setOkListner(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->okListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/DoubleButtonDialog;->title:Ljava/lang/String;

    return-void
.end method
