.class public Le00;
.super La00;
.source "AxisPay"


# instance fields
.field public final d:Landroid/text/TextWatcher;

.field public final e:Lcom/google/android/material/textfield/TextInputLayout$f;

.field public final f:Lcom/google/android/material/textfield/TextInputLayout$g;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La00;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 2
    new-instance p1, Le00$a;

    invoke-direct {p1, p0}, Le00$a;-><init>(Le00;)V

    iput-object p1, p0, Le00;->d:Landroid/text/TextWatcher;

    .line 3
    new-instance p1, Le00$b;

    invoke-direct {p1, p0}, Le00$b;-><init>(Le00;)V

    iput-object p1, p0, Le00;->e:Lcom/google/android/material/textfield/TextInputLayout$f;

    .line 4
    new-instance p1, Le00$c;

    invoke-direct {p1, p0}, Le00$c;-><init>(Le00;)V

    iput-object p1, p0, Le00;->f:Lcom/google/android/material/textfield/TextInputLayout$g;

    return-void
.end method

.method public static synthetic e(Le00;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Le00;->g()Z

    move-result p0

    return p0
.end method

.method public static synthetic f(Le00;)Landroid/text/TextWatcher;
    .locals 0

    .line 1
    iget-object p0, p0, Le00;->d:Landroid/text/TextWatcher;

    return-object p0
.end method

.method public static h(Landroid/widget/EditText;)Z
    .locals 2

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result v0

    const/16 v1, 0x80

    if-eq v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result v0

    const/16 v1, 0x90

    if-eq v0, v1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->getInputType()I

    move-result p0

    const/16 v0, 0xe0

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, La00;->b:Landroid/content/Context;

    sget v2, Llv;->design_password_eye:I

    .line 2
    invoke-static {v1, v2}, Lk0;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 5
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lqv;->password_toggle_content_description:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconContentDescription(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    new-instance v1, Le00$d;

    invoke-direct {v1, p0}, Le00$d;-><init>(Le00;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Le00;->e:Lcom/google/android/material/textfield/TextInputLayout$f;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->e(Lcom/google/android/material/textfield/TextInputLayout$f;)V

    .line 9
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, p0, Le00;->f:Lcom/google/android/material/textfield/TextInputLayout$g;

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->f(Lcom/google/android/material/textfield/TextInputLayout$g;)V

    .line 10
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    .line 11
    invoke-static {v0}, Le00;->h(Landroid/widget/EditText;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :cond_0
    return-void
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/widget/EditText;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
