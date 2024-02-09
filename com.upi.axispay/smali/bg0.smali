.class public Lbg0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public b:Ljava/text/DecimalFormat;

.field public c:Ljava/text/DecimalFormat;

.field public d:Z

.field public e:I

.field public f:I

.field public g:Landroid/widget/EditText;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:D

.field public k:D

.field public l:D


# direct methods
.method public constructor <init>(Landroid/widget/EditText;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0xa92

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lbg0;->h:Ljava/lang/String;

    const/4 v0, 0x2

    .line 3
    iput v0, p0, Lbg0;->i:I

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 4
    iput-wide v0, p0, Lbg0;->j:D

    const-wide v0, 0x40f86a0000000000L    # 100000.0

    .line 5
    iput-wide v0, p0, Lbg0;->k:D

    .line 6
    iput-wide v0, p0, Lbg0;->l:D

    .line 7
    new-instance v0, Ljava/text/DecimalFormat;

    const v1, 0xa93

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setDecimalSeparatorAlwaysShown(Z)V

    .line 9
    new-instance v0, Ljava/text/DecimalFormat;

    const v1, 0xa94

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbg0;->c:Ljava/text/DecimalFormat;

    .line 10
    iput-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    .line 11
    iput p2, p0, Lbg0;->f:I

    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lbg0;->d:Z

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 11

    const v0, 0xa95

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    iget-object v2, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {v2, p0}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2
    :try_start_0
    iget-object v2, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v2

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v3}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v3

    invoke-virtual {v3}, Ljava/text/DecimalFormatSymbols;->getGroupingSeparator()C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 4
    iget-object v3, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v3, p1}, Ljava/text/DecimalFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v3

    .line 5
    iget-object v4, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v4

    .line 6
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    iget-wide v7, p0, Lbg0;->j:D

    cmpg-double v5, v5, v7

    const/4 v6, 0x1

    if-gez v5, :cond_0

    .line 7
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 8
    :cond_0
    iget v5, p0, Lbg0;->f:I

    const/4 v7, 0x2

    if-ne v5, v7, :cond_2

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    iget-wide v9, p0, Lbg0;->l:D

    cmpl-double v5, v7, v9

    if-lez v5, :cond_2

    .line 9
    iget-object p1, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    iget-object v3, p0, Lbg0;->h:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/text/DecimalFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    .line 10
    iget-boolean v3, p0, Lbg0;->d:Z

    if-eqz v3, :cond_1

    .line 11
    iget-object v3, p0, Lbg0;->g:Landroid/widget/EditText;

    iget-object v5, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v5, p1}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 12
    :cond_1
    iget-object v3, p0, Lbg0;->g:Landroid/widget/EditText;

    iget-object v5, p0, Lbg0;->c:Ljava/text/DecimalFormat;

    invoke-virtual {v5, p1}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 13
    :cond_2
    iget v5, p0, Lbg0;->f:I

    if-ne v5, v6, :cond_4

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    iget-wide v9, p0, Lbg0;->k:D

    cmpl-double v5, v7, v9

    if-lez v5, :cond_4

    .line 14
    iget-object p1, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    iget-object v3, p0, Lbg0;->h:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/text/DecimalFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    .line 15
    iget-boolean v3, p0, Lbg0;->d:Z

    if-eqz v3, :cond_3

    .line 16
    iget-object v3, p0, Lbg0;->g:Landroid/widget/EditText;

    iget-object v5, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v5, p1}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 17
    :cond_3
    iget-object v3, p0, Lbg0;->g:Landroid/widget/EditText;

    iget-object v5, p0, Lbg0;->c:Ljava/text/DecimalFormat;

    invoke-virtual {v5, p1}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 18
    :cond_4
    iput-object p1, p0, Lbg0;->h:Ljava/lang/String;

    .line 19
    iget-boolean p1, p0, Lbg0;->d:Z

    if-eqz p1, :cond_6

    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    :goto_0
    iget v5, p0, Lbg0;->e:I

    add-int/lit8 v7, v5, -0x1

    iput v7, p0, Lbg0;->e:I

    if-lez v5, :cond_5

    const/16 v5, 0x30

    .line 22
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 23
    :cond_5
    iget-object v5, p0, Lbg0;->g:Landroid/widget/EditText;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v8, v3}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 24
    :cond_6
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    iget-object v5, p0, Lbg0;->c:Ljava/text/DecimalFormat;

    invoke-virtual {v5, v3}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 25
    :goto_1
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    sub-int/2addr p1, v2

    add-int/2addr v4, p1

    if-lez v4, :cond_7

    .line 26
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-gt v4, p1, :cond_7

    .line 27
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1, v4}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_2

    .line 28
    :cond_7
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-lez p1, :cond_8

    .line 29
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v2

    sub-int/2addr v2, v6

    invoke-virtual {p1, v2}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_2

    .line 30
    :cond_8
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/widget/EditText;->setSelection(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 31
    :catch_0
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 32
    :catch_1
    :goto_2
    iget-object p1, p0, Lbg0;->g:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lbg0;->b:Ljava/text/DecimalFormat;

    invoke-virtual {p3}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object p3

    invoke-virtual {p3}, Ljava/text/DecimalFormatSymbols;->getDecimalSeparator()C

    move-result p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    const/4 p3, 0x0

    .line 2
    iput p3, p0, Lbg0;->e:I

    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    sub-int/2addr p4, p2

    const/4 v0, 0x1

    sub-int/2addr p4, v0

    const/4 v1, -0x1

    if-le p2, v1, :cond_2

    add-int/2addr p2, v0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p2, v1, :cond_1

    .line 5
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-ne v1, v2, :cond_0

    iget v1, p0, Lbg0;->i:I

    if-gt p4, v1, :cond_0

    .line 6
    iget v1, p0, Lbg0;->e:I

    add-int/2addr v1, v0

    iput v1, p0, Lbg0;->e:I

    goto :goto_1

    .line 7
    :cond_0
    iput p3, p0, Lbg0;->e:I

    :goto_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8
    :cond_1
    iput-boolean v0, p0, Lbg0;->d:Z

    goto :goto_2

    .line 9
    :cond_2
    iput-boolean p3, p0, Lbg0;->d:Z

    :goto_2
    return-void
.end method
