.class public Ld2;
.super Landroid/widget/EditText;
.source "AxisPay"

# interfaces
.implements Lzb;
.implements Lwb;


# instance fields
.field private final mBackgroundTintHelper:Ly1;

.field private final mDefaultOnReceiveContentListener:Lbd;

.field private final mTextClassifierHelper:Lp2;

.field private final mTextHelper:Lq2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Ld2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Ll;->editTextStyle:I

    invoke-direct {p0, p1, p2, v0}, Ld2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-static {p1}, Ll3;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Lj3;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 5
    new-instance p1, Ly1;

    invoke-direct {p1, p0}, Ly1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Ld2;->mBackgroundTintHelper:Ly1;

    .line 6
    invoke-virtual {p1, p2, p3}, Ly1;->e(Landroid/util/AttributeSet;I)V

    .line 7
    new-instance p1, Lq2;

    invoke-direct {p1, p0}, Lq2;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ld2;->mTextHelper:Lq2;

    .line 8
    invoke-virtual {p1, p2, p3}, Lq2;->m(Landroid/util/AttributeSet;I)V

    .line 9
    invoke-virtual {p1}, Lq2;->b()V

    .line 10
    new-instance p1, Lp2;

    invoke-direct {p1, p0}, Lp2;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Ld2;->mTextClassifierHelper:Lp2;

    .line 11
    new-instance p1, Lbd;

    invoke-direct {p1}, Lbd;-><init>()V

    iput-object p1, p0, Ld2;->mDefaultOnReceiveContentListener:Lbd;

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/EditText;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ly1;->b()V

    .line 4
    :cond_0
    iget-object v0, p0, Ld2;->mTextHelper:Lq2;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lq2;->b()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ly1;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ly1;->d()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getText()Landroid/text/Editable;
    .locals 2

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 3
    invoke-super {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-super {p0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld2;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Ld2;->mTextClassifierHelper:Lp2;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lp2;->a()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0

    .line 3
    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/widget/EditText;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 2
    iget-object v1, p0, Ld2;->mTextHelper:Lq2;

    invoke-virtual {v1, p0, v0, p1}, Lq2;->r(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    .line 3
    invoke-static {v0, p1, p0}, Le2;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Landroid/view/View;)Landroid/view/inputmethod/InputConnection;

    .line 4
    invoke-static {p0}, Lac;->F(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 5
    invoke-static {p1, v1}, Lpc;->d(Landroid/view/inputmethod/EditorInfo;[Ljava/lang/String;)V

    .line 6
    invoke-static {p0}, Lm2;->a(Landroid/view/View;)Lqc$c;

    move-result-object v1

    .line 7
    invoke-static {v0, p1, v1}, Lqc;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;Lqc$c;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public onDragEvent(Landroid/view/DragEvent;)Z
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lm2;->b(Landroid/view/View;Landroid/view/DragEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onDragEvent(Landroid/view/DragEvent;)Z

    move-result p1

    return p1
.end method

.method public onReceiveContent(Lgb;)Lgb;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2;->mDefaultOnReceiveContentListener:Lbd;

    invoke-virtual {v0, p0, p1}, Lbd;->a(Landroid/view/View;Lgb;)Lgb;

    move-result-object p1

    return-object p1
.end method

.method public onTextContextMenuItem(I)Z
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lm2;->c(Landroid/widget/TextView;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTextContextMenuItem(I)Z

    move-result p1

    return p1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ly1;->f(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ly1;->g(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lad;->s(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    .line 2
    invoke-super {p0, p1}, Landroid/widget/EditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly1;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld2;->mBackgroundTintHelper:Ly1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ly1;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setTextAppearance(Landroid/content/Context;I)V

    .line 2
    iget-object v0, p0, Ld2;->mTextHelper:Lq2;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1, p2}, Lq2;->q(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Ld2;->mTextClassifierHelper:Lp2;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Lp2;->b(Landroid/view/textclassifier/TextClassifier;)V

    return-void

    .line 3
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method
