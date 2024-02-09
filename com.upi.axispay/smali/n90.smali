.class public Ln90;
.super Lno;
.source "AxisPay"


# instance fields
.field public c:I

.field public d:Lng0;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/view/LayoutInflater;

.field public g:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lno;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Ln90;->c:I

    .line 3
    iput-object p1, p0, Ln90;->g:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Ln90;->e:Ljava/util/ArrayList;

    .line 5
    invoke-virtual {p0, p2}, Ln90;->v(Ljava/util/ArrayList;)V

    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ln90;->f:Landroid/view/LayoutInflater;

    .line 7
    iget-object p1, p0, Ln90;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 8
    new-instance p1, Lcom/olive/upi/transport/model/Account;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/Account;-><init>()V

    .line 9
    iget-object p2, p0, Ln90;->e:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln90;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 1
    iget-object v3, v0, Ln90;->f:Landroid/view/LayoutInflater;

    const v4, 0x7f0d00b8

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0a0261

    .line 2
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    const v6, 0x7f0a0071

    .line 3
    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout;

    const v7, 0x7f0a025e

    .line 4
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    const v8, 0x7f0a00f3

    .line 5
    invoke-virtual {v3, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/LinearLayout;

    const v9, 0x7f0a00f7

    .line 6
    invoke-virtual {v3, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/LinearLayout;

    const v10, 0x7f0a007f

    .line 7
    invoke-virtual {v3, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/LinearLayout;

    const v11, 0x7f0a022a

    .line 8
    invoke-virtual {v3, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/ImageView;

    const v12, 0x7f0a048e

    .line 9
    invoke-virtual {v3, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    const v13, 0x7f0a0055

    .line 10
    invoke-virtual {v3, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/TextView;

    const v14, 0x7f0a0486

    .line 11
    invoke-virtual {v3, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/TextView;

    const v15, 0x7f0a04d3

    .line 12
    invoke-virtual {v3, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/TextView;

    const v15, 0x7f0a04d4

    .line 13
    invoke-virtual {v3, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/ImageView;

    const v5, 0x7f0a009b

    .line 14
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v1, 0x7f0a009a

    .line 15
    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v16, v4

    const v4, 0x7f0a0400

    .line 16
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    move-object/from16 v17, v5

    const v5, 0x7f0a03ca

    .line 17
    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x1

    .line 18
    invoke-virtual {v4, v3, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 19
    invoke-virtual {v5, v3, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 20
    invoke-virtual {v14, v3, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 21
    invoke-virtual {v1, v3, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 22
    iget-object v4, v0, Ln90;->e:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/olive/upi/transport/model/Account;

    .line 23
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v5

    const/16 v3, 0x8

    if-eqz v5, :cond_7

    const/4 v5, 0x0

    .line 24
    invoke-virtual {v7, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 25
    invoke-virtual {v6, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 26
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v5

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lqa0;->e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;

    move-result-object v5

    const v6, 0x7f080070

    if-nez v5, :cond_0

    .line 30
    iget-object v7, v0, Ln90;->g:Landroid/content/Context;

    invoke-static {v7, v6}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v11, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 32
    iget-object v7, v0, Ln90;->g:Landroid/content/Context;

    invoke-static {v7, v6}, Lt8;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v11, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Bank;->getLogo()Ljava/lang/String;

    move-result-object v7

    invoke-static {v11, v7, v6}, Ljg0;->K(Landroid/widget/ImageView;Ljava/lang/String;I)V

    :goto_0
    if-eqz v5, :cond_3

    .line 34
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Bank;->getColorcode()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 35
    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Bank;->getColorcode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x6

    if-ne v6, v7, :cond_2

    .line 36
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const v7, 0x1219

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/Bank;->getColorcode()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 37
    :goto_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    .line 38
    iget-object v6, v0, Ln90;->g:Landroid/content/Context;

    invoke-static {v6, v5}, Lah0;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 39
    invoke-virtual {v8, v6}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 40
    invoke-virtual {v9, v6}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 41
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 42
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 43
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v15, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_2

    .line 45
    :cond_3
    iget-object v5, v0, Ln90;->g:Landroid/content/Context;

    const v6, 0x7f060049

    invoke-static {v5, v6}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v12, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    iget-object v5, v0, Ln90;->g:Landroid/content/Context;

    invoke-static {v5, v6}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    iget-object v5, v0, Ln90;->g:Landroid/content/Context;

    invoke-static {v5, v6}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 48
    iget-object v5, v0, Ln90;->g:Landroid/content/Context;

    invoke-static {v5, v6}, Lt8;->d(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v15, v5}, Landroid/widget/ImageView;->setColorFilter(I)V

    :cond_4
    :goto_2
    move-object/from16 v5, v19

    const/4 v6, 0x0

    .line 49
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 50
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getCheckBalance()I

    move-result v7

    if-ne v7, v10, :cond_6

    .line 51
    invoke-virtual {v4, v6}, Lcom/olive/upi/transport/model/Account;->setCheckBalance(I)V

    .line 52
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 53
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 54
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getBalance()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    .line 55
    :cond_5
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 56
    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getBalance()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v6, 0x7f12009c

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/Account;->getBalTime()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v6, v17

    invoke-virtual {v6, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v1, 0x0

    .line 59
    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 60
    :cond_6
    :goto_3
    new-instance v1, Ln90$b;

    invoke-direct {v1, v0, v4}, Ln90$b;-><init>(Ln90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {v8, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    new-instance v1, Ln90$c;

    invoke-direct {v1, v0, v4}, Ln90$c;-><init>(Ln90;Lcom/olive/upi/transport/model/Account;)V

    invoke-virtual {v9, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    new-instance v1, Ln90$d;

    invoke-direct {v1, v0, v2, v4, v15}, Ln90$d;-><init>(Ln90;ILcom/olive/upi/transport/model/Account;Landroid/widget/ImageView;)V

    invoke-virtual {v5, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    new-instance v1, Ln90$e;

    invoke-direct {v1, v0, v2, v4, v15}, Ln90$e;-><init>(Ln90;ILcom/olive/upi/transport/model/Account;Landroid/widget/ImageView;)V

    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    new-instance v1, Ln90$f;

    invoke-direct {v1, v0, v4}, Ln90$f;-><init>(Ln90;Lcom/olive/upi/transport/model/Account;)V

    move-object/from16 v4, v16

    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v2, p1

    move-object/from16 v3, v18

    const/4 v1, 0x0

    goto :goto_4

    .line 65
    :cond_7
    invoke-virtual {v7, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    const/4 v1, 0x0

    .line 66
    invoke-virtual {v6, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 67
    new-instance v2, Ln90$g;

    invoke-direct {v2, v0}, Ln90$g;-><init>(Ln90;)V

    invoke-virtual {v6, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    move-object/from16 v2, p1

    move-object/from16 v3, v18

    .line 68
    :goto_4
    invoke-virtual {v2, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-object v3
.end method

.method public i(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public t()Landroid/view/animation/RotateAnimation;
    .locals 4

    .line 1
    new-instance v0, Landroid/view/animation/RotateAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    const/high16 v3, 0x41700000    # 15.0f

    invoke-direct {v0, v1, v2, v3, v3}, Landroid/view/animation/RotateAnimation;-><init>(FFFF)V

    .line 2
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const/4 v1, -0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/animation/RotateAnimation;->setRepeatCount(I)V

    const-wide/16 v1, 0x2bc

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/RotateAnimation;->setDuration(J)V

    return-object v0
.end method

.method public u(Lng0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln90;->d:Lng0;

    return-void
.end method

.method public v(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    new-instance v0, Ln90$a;

    invoke-direct {v0, p0}, Ln90$a;-><init>(Ln90;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    return-void
.end method

.method public w(Ljava/lang/String;II)V
    .locals 1

    .line 1
    iput p3, p0, Ln90;->c:I

    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 2
    iget-object v0, p0, Ln90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p3, v0, :cond_0

    .line 3
    iget-object v0, p0, Ln90;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Account;

    .line 4
    invoke-virtual {v0, p2}, Lcom/olive/upi/transport/model/Account;->setCheckBalance(I)V

    .line 5
    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setBalance(Ljava/lang/String;)V

    .line 6
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    const p2, 0x121a

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/Account;->setBalTime(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Ln90;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, p3, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {p0}, Lno;->j()V

    :cond_0
    return-void
.end method
