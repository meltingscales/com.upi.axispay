.class public Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;
.super Landroid/widget/LinearLayout;
.source "AxisPay"

# interfaces
.implements Lorg/npci/upi/security/pinactivitycomponent/widget/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;
    }
.end annotation


# instance fields
.field public b:Z

.field public c:Ljava/lang/String;

.field public d:I

.field public e:Landroid/widget/TextView;

.field public f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

.field public g:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

.field public h:I

.field public i:Ljava/lang/Object;

.field public j:Landroid/widget/LinearLayout;

.field public k:Landroid/widget/Button;

.field public l:Landroid/widget/ProgressBar;

.field public m:Landroid/widget/ImageView;

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Landroid/widget/TextView;

.field public u:I

.field public v:Z

.field public w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x0

    iput-boolean p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->b:Z

    const v0, 0x2632

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n:Ljava/lang/String;

    iput-boolean p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    iput-boolean p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->p:Z

    iput-boolean p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->q:Z

    iput p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->u:I

    const/4 p2, 0x1

    iput-boolean p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->v:Z

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->i(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic c(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;I)I
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->u:I

    return p1
.end method

.method public static synthetic f(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Landroid/widget/Button;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic h(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic m(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    return-object p0
.end method

.method public static synthetic n(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    return-object p0
.end method

.method public static synthetic o(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)I
    .locals 0

    iget p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->d:I

    return p0
.end method

.method public static synthetic p(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)I
    .locals 0

    iget p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h:I

    return p0
.end method

.method public static synthetic q(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->b:Z

    return p0
.end method

.method public static synthetic r(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    return p0
.end method

.method public static synthetic s(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->v:Z

    return p0
.end method

.method public static synthetic t(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;IZZ)V
    .locals 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    const/4 v0, 0x0

    if-nez p4, :cond_1

    move-object v1, p2

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    const/4 v2, 0x1

    if-ne p4, v2, :cond_2

    move-object v2, p2

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    const/4 v3, 0x2

    if-ne p4, v3, :cond_3

    move-object v3, p2

    goto :goto_2

    :cond_3
    move-object v3, v0

    :goto_2
    const/4 v4, 0x3

    if-ne p4, v4, :cond_4

    goto :goto_3

    :cond_4
    move-object p2, v0

    :goto_3
    invoke-virtual {p1, v1, v2, v3, p2}, Landroid/widget/Button;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p1, p6}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p0, p1, p5}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g(Landroid/view/View;Z)Lec;

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    const/4 v0, 0x1

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->u:I

    return v0
.end method

.method public d()Z
    .locals 3

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setText(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n:Ljava/lang/String;

    const v1, 0x2633

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2634

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    return v0
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g(Landroid/view/View;Z)Lec;
    .locals 3

    invoke-static {p1}, Lac;->d(Landroid/view/View;)Lec;

    move-result-object p1

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-virtual {p1, v2}, Lec;->e(F)Lec;

    if-eqz p2, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {p1, v0}, Lec;->d(F)Lec;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Lec;->g(Landroid/view/animation/Interpolator;)Lec;

    new-instance v0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$3;

    invoke-direct {v0, p0, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$3;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;Z)V

    invoke-virtual {p1, v0}, Lec;->h(Lfc;)Lec;

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v1, 0x3f000000    # 0.5f

    :goto_1
    invoke-virtual {p1, v1}, Lec;->a(F)Lec;

    return-object p1
.end method

.method public getFormDataTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public getFormInputView()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    return-object v0
.end method

.method public getFormItemListener()Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    return-object v0
.end method

.method public getInputLength()I
    .locals 1

    iget v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->d:I

    return v0
.end method

.method public getInputValue()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->b:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->n:Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSubtype()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getTextEntered()Z
    .locals 1

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->q:Z

    return v0
.end method

.method public getToggleCheckBox()Z
    .locals 1

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->p:Z

    return v0
.end method

.method public getToggleCheckbox()Z
    .locals 1

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->p:Z

    return v0
.end method

.method public i(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemView_formTitle:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->c:Ljava/lang/String;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemView_formValidationError:I

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemView_formInputLength:I

    const/4 v2, 0x6

    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    iput v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->d:I

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$styleable;->FormItemView_formActionOnTop:I

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->r:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    sget p2, Lorg/npci/upi/security/pinactivitycomponent/R$layout;->layout_form_item:I

    invoke-static {p1, p2, p0}, Landroid/widget/LinearLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_root:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_action_bar:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->j:Landroid/widget/LinearLayout;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_title:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->e:Landroid/widget/TextView;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_input:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_button:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_progress:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->l:Landroid/widget/ProgressBar;

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_image:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m:Landroid/widget/ImageView;

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setInputType(I)V

    sget p1, Lorg/npci/upi/security/pinactivitycomponent/R$id;->educational_info:I

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t:Landroid/widget/TextView;

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color_alpha:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setTextColor(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->c:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setTitle(Ljava/lang/String;)V

    iget p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->d:I

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setInputLength(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    new-instance p2, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;

    invoke-direct {p2, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$1;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    new-instance p2, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;

    invoke-direct {p2, p0}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;-><init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->r:Z

    invoke-virtual {p0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->setActionBarPositionTop(Z)V

    return-void
.end method

.method public j(Landroid/graphics/drawable/Drawable;Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m:Landroid/widget/ImageView;

    invoke-virtual {p0, p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g(Landroid/view/View;Z)Lec;

    return-void
.end method

.method public k(Ljava/lang/String;Landroid/view/View$OnClickListener;ZZ)V
    .locals 3

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_key_digit_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p0, p1, p3}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g(Landroid/view/View;Z)Lec;

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p1, p4}, Landroid/widget/Button;->setEnabled(Z)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->k:Landroid/widget/Button;

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public l(Z)V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->l:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g(Landroid/view/View;Z)Lec;

    move-result-object p1

    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v0}, Lec;->g(Landroid/view/animation/Interpolator;)Lec;

    invoke-virtual {p1}, Lec;->l()V

    return-void
.end method

.method public setActionBarPositionTop(Z)V
    .locals 4

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->s:Z

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout$LayoutParams;

    iget-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->s:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/16 v3, 0xa

    if-eqz v0, :cond_0

    invoke-virtual {p1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {p1, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$id;->form_item_input:I

    invoke-virtual {p1, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    :goto_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setEducationalText(Ljava/lang/String;)V
    .locals 5

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$string;->educational_info_upi_debitnew:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0x2635

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t:Landroid/widget/TextView;

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->ic_info:I

    invoke-virtual {v0, v1, v4, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/npci/upi/security/pinactivitycomponent/R$color;->npci_text_secondary_dark:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t:Landroid/widget/TextView;

    sget v0, Lorg/npci/upi/security/pinactivitycomponent/R$drawable;->rounded_corner:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setFormDataTag(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->i:Ljava/lang/Object;

    return-void
.end method

.method public setFormItemListener(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->g:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    return-void
.end method

.method public setFormItemTag(I)V
    .locals 0

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->h:I

    return-void
.end method

.method public setInputLength(I)V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {v0, p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;->setMaxLength(I)V

    iput p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->d:I

    return-void
.end method

.method public setIsStateUnmasked(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->o:Z

    return-void
.end method

.method public setSubtype(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->w:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->f:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemEditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method public setTextEntered(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->q:Z

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->c:Ljava/lang/String;

    return-void
.end method

.method public setToggleCheckBox(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->p:Z

    return-void
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->b:Z

    return-void
.end method
