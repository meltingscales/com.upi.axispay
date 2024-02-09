.class public Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->i(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 7

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-static {v0, v1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->c(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;I)I

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->q(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    :cond_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_1
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->r(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->s(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v4, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_off_blue_24px:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_2
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color_alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->s(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v4, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_off:I

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_4
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    :goto_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_5
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const v4, 0xec7

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    if-nez v0, :cond_7

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->s(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_blue_24px:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_6
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color_alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1, v4}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_7
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->s(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v5, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_visibility_on:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v0, v5, v3, v3, v3}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_8
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v5, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v3

    if-le v0, v3, :cond_9

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x25cf

    if-eq v0, v1, :cond_a

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Ljava/lang/String;

    move-result-object p1

    const v0, 0xec8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0xec9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_a
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object v0

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    :goto_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    :cond_0
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)I

    move-result p2

    if-lt p1, p2, :cond_2

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    move-result-object p1

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->p(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)I

    move-result p2

    iget-object p3, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;->d(ILjava/lang/String;)V

    :cond_2
    return-void
.end method
