.class public Lcom/upi/axispay/custom/SingleButtonImageDialog;
.super Landroid/app/DialogFragment;
.source "AxisPay"


# static fields
.field public static singleButtonDialog:Lcom/upi/axispay/custom/SingleButtonImageDialog;


# instance fields
.field public iconRequired:Z

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

.method public static newInstance()Lcom/upi/axispay/custom/SingleButtonImageDialog;
    .locals 1

    .line 1
    new-instance v0, Lcom/upi/axispay/custom/SingleButtonImageDialog;

    invoke-direct {v0}, Lcom/upi/axispay/custom/SingleButtonImageDialog;-><init>()V

    sput-object v0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->singleButtonDialog:Lcom/upi/axispay/custom/SingleButtonImageDialog;

    return-object v0
.end method


# virtual methods
.method public isIconRequired()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->iconRequired:Z

    return v0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .line 1
    new-instance p1, Ly$a;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Ly$a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d00b3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v1, 0x7f0a00ec

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v2, 0x7f0a016f

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f0a0171

    .line 5
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0a0174

    .line 6
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 7
    iget-object v5, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->title:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p0}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->isIconRequired()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    :goto_0
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    const v3, 0x7f0a0172

    .line 9
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 10
    iget-object v4, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->message:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    new-instance v3, Lcom/upi/axispay/custom/SingleButtonImageDialog$1;

    invoke-direct {v3, p0}, Lcom/upi/axispay/custom/SingleButtonImageDialog$1;-><init>(Lcom/upi/axispay/custom/SingleButtonImageDialog;)V

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    invoke-virtual {p1, v0}, Ly$a;->k(Landroid/view/View;)Ly$a;

    .line 13
    invoke-virtual {p1, v5}, Ly$a;->d(Z)Ly$a;

    .line 14
    iget-object v0, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->okBtnText:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v0, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->okListner:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    invoke-virtual {p1}, Ly$a;->a()Ly;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 17
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 18
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const v1, 0x7f1300fb

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 19
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0d00b3

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public setIconRequired(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->iconRequired:Z

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->message:Ljava/lang/String;

    return-void
.end method

.method public setOkBtnText(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->okBtnText:Ljava/lang/String;

    return-void
.end method

.method public setOkListner(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->okListner:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/SingleButtonImageDialog;->title:Ljava/lang/String;

    return-void
.end method
