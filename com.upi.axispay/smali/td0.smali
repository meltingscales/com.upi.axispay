.class public Ltd0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Lua0$e;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static I:I


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/LinearLayout;

.field public C:Landroid/widget/LinearLayout;

.field public D:Landroid/widget/ImageView;

.field public E:Lcom/olive/upi/transport/model/MandateTransactionData;

.field public F:I

.field public G:Landroid/graphics/Bitmap;

.field public H:Landroid/graphics/Bitmap;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/Button;

.field public n:Landroid/widget/TextView;

.field public o:Landroid/widget/TextView;

.field public p:Landroid/widget/TextView;

.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Landroid/widget/TextView;

.field public t:Landroid/widget/TextView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/16 v0, 0x6a

    .line 2
    iput v0, p0, Ltd0;->F:I

    return-void
.end method

.method public static A(I)Ltd0;
    .locals 0

    .line 1
    sput p0, Ltd0;->I:I

    .line 2
    new-instance p0, Ltd0;

    invoke-direct {p0}, Ltd0;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Ltd0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ltd0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic y(Ltd0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ltd0;->z()V

    return-void
.end method


# virtual methods
.method public final B(Lcom/olive/upi/transport/model/Account;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/Payee;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/Payee;-><init>()V

    .line 2
    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getPayeeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBeneVpa(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/Payee;->setBamount(Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->setPayeeData(Lcom/olive/upi/transport/model/Payee;)V

    .line 6
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 7
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result p1

    sget v0, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYER_UPDATE_MANDATE:I

    const/16 v1, 0x1fe

    const/16 v2, 0x6b

    if-ne p1, v0, :cond_0

    .line 8
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {p1, v2, v1, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0xc

    .line 9
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 10
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Lcom/olive/upi/transport/OliveRequest;

    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-direct {p1, v2, v1, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    const/16 v0, 0x9

    .line 12
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/OliveRequest;->setClMode(I)V

    .line 13
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public final C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 4

    const v0, 0x7f0d00bf

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0a035f

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    const p2, 0x7f0a023b

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    .line 4
    iget-object v0, p0, Ltd0;->G:Landroid/graphics/Bitmap;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 6
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 7
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 8
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {p1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 9
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p1, v1, v1, v2, v0}, Landroid/view/View;->layout(IIII)V

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->buildDrawingCache(Z)V

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Ltd0;->H:Landroid/graphics/Bitmap;

    .line 12
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-void
.end method

.method public D()V
    .locals 1

    .line 1
    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd0;->B(Lcom/olive/upi/transport/model/Account;)V

    return-void
.end method

.method public final E()V
    .locals 3

    .line 1
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a00db

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Ltd0;->m:Landroid/widget/Button;

    .line 2
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a01fc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->p:Landroid/widget/TextView;

    .line 3
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a015c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->n:Landroid/widget/TextView;

    .line 4
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a015b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->o:Landroid/widget/TextView;

    .line 5
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0506

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->q:Landroid/widget/TextView;

    .line 6
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a007b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->r:Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0539

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->s:Landroid/widget/TextView;

    .line 8
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a037a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->t:Landroid/widget/TextView;

    .line 9
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a037b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->u:Landroid/widget/TextView;

    .line 10
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a037c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->v:Landroid/widget/TextView;

    .line 11
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0167

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->w:Landroid/widget/TextView;

    .line 12
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0135

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->x:Landroid/widget/TextView;

    .line 13
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a053c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->A:Landroid/widget/TextView;

    .line 14
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a037d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 15
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0237

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 16
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0245

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Ltd0;->B:Landroid/widget/LinearLayout;

    .line 17
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a053e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 18
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a037e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Ltd0;->C:Landroid/widget/LinearLayout;

    .line 19
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a051b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->y:Landroid/widget/TextView;

    .line 20
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a051a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ltd0;->z:Landroid/widget/TextView;

    .line 21
    iget-object v0, p0, Ltd0;->l:Landroid/view/View;

    const v1, 0x7f0a0407

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Ltd0;->D:Landroid/widget/ImageView;

    .line 22
    iget-object v0, p0, Ltd0;->y:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    iget-object v0, p0, Ltd0;->m:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public m(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lxc0;->m(I)V

    .line 2
    iget v0, p0, Ltd0;->F:I

    if-ne p1, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Ltd0;->H:Landroid/graphics/Bitmap;

    invoke-static {p1, v0}, Lyg0;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00db

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0}, Ltd0;->z()V

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 12

    const v0, 0x36bc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x3a

    const/16 v2, 0x6b

    const v3, 0x36bd

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x36be

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x36bf

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x36c0

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x36c1

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x36c2

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x36c3

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x9

    if-ne p1, v10, :cond_1

    .line 1
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 2
    new-instance p1, Lcom/olive/upi/transport/model/PayerInitiatedMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;-><init>()V

    if-eqz p2, :cond_3

    .line 3
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v10

    invoke-static {v10}, Leg0;->i(Landroid/app/Activity;)V

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lc70;->k()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setUmn(Ljava/lang/String;)V

    .line 7
    iget-object v10, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->getUmn()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 10
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setSharetopayee(Ljava/lang/String;)V

    .line 11
    iget-object v8, p0, Ltd0;->p:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 12
    iget-object v8, p0, Ltd0;->q:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 13
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmount(Ljava/lang/String;)V

    const v8, 0x36c4

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 14
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 15
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmountrule(Ljava/lang/String;)V

    .line 16
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    .line 18
    iget-object v7, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 20
    iget-object v6, p0, Ltd0;->w:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 21
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 22
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 23
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/MandateTransactionData;->getPayeeData()Lcom/olive/upi/transport/model/Payee;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 24
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 25
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandateTransactionData;->getBlockFund()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 26
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPurposecode(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setBlockfund(Ljava/lang/String;)V

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPurposecode(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setBlockfund(Ljava/lang/String;)V

    .line 30
    :goto_0
    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setExecutebypayeepsp(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 32
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 33
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v0, v2, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_2

    :cond_1
    const/16 v10, 0xc

    if-ne p1, v10, :cond_3

    .line 34
    check-cast p2, Lcom/olive/upi/transport/model/PayRequest;

    .line 35
    new-instance p1, Lcom/olive/upi/transport/model/PayerInitiatedMandate;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;-><init>()V

    if-eqz p2, :cond_3

    .line 36
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v10

    invoke-static {v10}, Leg0;->i(Landroid/app/Activity;)V

    .line 37
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCustomerId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getTxnId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    .line 39
    iget-object v10, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v10}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p1, v10}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setUmn(Ljava/lang/String;)V

    .line 40
    iget-object v10, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->getUmn()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 43
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->getSharetoPayee()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setSharetopayee(Ljava/lang/String;)V

    .line 44
    iget-object v8, p0, Ltd0;->p:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 45
    iget-object v8, p0, Ltd0;->q:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 46
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmount(Ljava/lang/String;)V

    const v8, 0x36c5

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    .line 47
    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 48
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setAmountrule(Ljava/lang/String;)V

    .line 49
    iget-object v8, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v8}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v8}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    .line 51
    iget-object v7, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v7}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 53
    iget-object v6, p0, Ltd0;->w:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 54
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 55
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getAccount()Lcom/olive/upi/transport/model/Account;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 56
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/MandateTransactionData;->getPayeeData()Lcom/olive/upi/transport/model/Payee;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Payee;->getBeneVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 57
    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v6

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 58
    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setExecutebypayeepsp(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getDevice()Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v6

    invoke-virtual {p1, v6}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 60
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PayRequest;->getCred()Lcom/olive/upi/transport/model/Cred;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setCreds(Lcom/olive/upi/transport/model/Cred;)V

    .line 61
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getBlockFund()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 62
    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPurposecode(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1, v9}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setBlockfund(Ljava/lang/String;)V

    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {p1, v4}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setPurposecode(Ljava/lang/String;)V

    .line 65
    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/PayerInitiatedMandate;->setBlockfund(Ljava/lang/String;)V

    .line 66
    :goto_1
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v0, v2, v1, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const p3, 0x7f0d0083

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Ltd0;->l:Landroid/view/View;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p3

    invoke-virtual {p3}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p3

    iput-object p3, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    .line 3
    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p3

    const/4 v1, 0x3

    const/16 v2, 0x6b

    const/4 v3, 0x2

    if-ne p3, v3, :cond_0

    const p3, 0x7f1203bc

    .line 4
    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, v2, p3}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p3, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p3

    if-ne p3, v1, :cond_1

    const p3, 0x7f120104

    .line 6
    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, v2, p3}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const p3, 0x7f120114

    .line 7
    invoke-virtual {p0, p3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, v2, p3}, Lxc0;->v(ILjava/lang/String;)V

    .line 8
    :goto_0
    invoke-virtual {p0}, Ltd0;->E()V

    .line 9
    invoke-virtual {p0}, Ltd0;->F()V

    .line 10
    iget-object p3, p0, Ltd0;->m:Landroid/widget/Button;

    const v2, 0x7f080096

    invoke-virtual {p3, v2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 11
    iget-object p3, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p3

    .line 12
    iget-object v2, p0, Ltd0;->p:Landroid/widget/TextView;

    iget-object v4, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v2, p0, Ltd0;->n:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v5, 0x36c6

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object v2, p0, Ltd0;->o:Landroid/widget/TextView;

    iget-object v4, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->getDebitAccountNo()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object v2, p0, Ltd0;->q:Landroid/widget/TextView;

    iget-object v4, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object v2, p0, Ltd0;->r:Landroid/widget/TextView;

    iget-object v4, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljg0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object v2, p0, Ltd0;->s:Landroid/widget/TextView;

    iget-object v4, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v4}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object v2, p0, Ltd0;->t:Landroid/widget/TextView;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v2, p0, Ltd0;->u:Landroid/widget/TextView;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Ljg0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object p3, p0, Ltd0;->v:Landroid/widget/TextView;

    const v2, 0x7f12033e

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v6, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    sget-object p3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0x36c7

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 22
    iget-object p3, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getBlockFund()Ljava/lang/String;

    move-result-object p3

    const v2, 0x36c8

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 23
    iget-object p3, p0, Ltd0;->B:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {p3, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    :cond_2
    iget-object p3, p0, Ltd0;->x:Landroid/widget/TextView;

    const v2, 0x7f120101

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v0

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandateTransactionData;->getStartMandate()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v4

    iget-object v5, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v5}, Lcom/olive/upi/transport/model/MandateTransactionData;->getEndmandate()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v1, v3

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    iget-object p3, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result p3

    if-ne p3, v3, :cond_3

    .line 26
    iget-object p3, p0, Ltd0;->x:Landroid/widget/TextView;

    const v1, 0x7f120100

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    :cond_3
    iget-object p3, p0, Ltd0;->w:Landroid/widget/TextView;

    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getRemarks()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    iget-object p3, p0, Ltd0;->D:Landroid/widget/ImageView;

    new-instance v0, Ltd0$c;

    invoke-direct {v0, p0, p1, p2}, Ltd0$c;-><init>(Ltd0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    iget-object p1, p0, Ltd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 25

    move-object/from16 v0, p0

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    invoke-virtual/range {p0 .. p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v1

    const/16 v2, 0x3a

    const v3, 0x36c9

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f120206

    const v7, 0x36ca

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x36cb

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x36cc

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x36cd

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x36ce

    invoke-static {v11}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f1201be

    const v13, 0x36cf

    invoke-static {v13}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    const v14, 0x36d0

    invoke-static {v14}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x1

    const v16, 0x36d1

    invoke-static/range {v16 .. v16}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v16

    const/16 v5, 0x8

    const v6, 0x7f120497

    if-eq v1, v2, :cond_5

    const/16 v2, 0x3b

    if-eq v1, v2, :cond_0

    goto/16 :goto_2

    .line 4
    :cond_0
    iget-object v1, v0, Ltd0;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 6
    iget-object v2, v0, Ltd0;->y:Landroid/widget/TextView;

    const v5, 0x36d2

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v2, v0, Ltd0;->z:Landroid/widget/TextView;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v2, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 9
    iget-object v2, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 10
    iget-object v1, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v16

    :goto_0
    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 11
    iget-object v1, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v15}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 12
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v17

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v19

    const v1, 0x36d3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v20

    new-instance v1, Ltd0$i;

    invoke-direct {v1, v0}, Ltd0$i;-><init>(Ltd0;)V

    .line 14
    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v22

    new-instance v2, Ltd0$j;

    invoke-direct {v2, v0}, Ltd0$j;-><init>(Ltd0;)V

    const/16 v24, 0x1

    move-object/from16 v21, v1

    move-object/from16 v23, v2

    .line 15
    invoke-static/range {v17 .. v24}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 16
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 17
    invoke-static {}, Leg0;->B()V

    .line 18
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    new-instance v2, Ltd0$k;

    invoke-direct {v2, v0}, Ltd0$k;-><init>(Ltd0;)V

    invoke-static {v1, v9, v8, v7, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 19
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 20
    invoke-static {}, Leg0;->B()V

    .line 21
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v7

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ltd0$a;

    invoke-direct {v11, v0}, Ltd0$a;-><init>(Ltd0;)V

    new-instance v13, Ltd0$b;

    invoke-direct {v13, v0}, Ltd0$b;-><init>(Ltd0;)V

    const/4 v14, 0x1

    const v12, 0x36d4

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-static/range {v7 .. v14}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 22
    :cond_4
    iget-object v1, v0, Lxc0;->b:Lmg0;

    const/4 v2, 0x0

    const/16 v3, 0x6e

    invoke-interface {v1, v3, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 23
    :cond_5
    iget-object v1, v0, Ltd0;->C:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 25
    iget-object v2, v0, Ltd0;->y:Landroid/widget/TextView;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    iget-object v2, v0, Ltd0;->z:Landroid/widget/TextView;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object v2, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 28
    iget-object v2, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 29
    iget-object v1, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    iget-object v2, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v16

    :goto_1
    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 30
    iget-object v1, v0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1, v15}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 31
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 32
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v17

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0, v12}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v19

    new-instance v1, Ltd0$d;

    invoke-direct {v1, v0}, Ltd0$d;-><init>(Ltd0;)V

    .line 33
    invoke-virtual {v11}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v22

    new-instance v2, Ltd0$e;

    invoke-direct {v2, v0}, Ltd0$e;-><init>(Ltd0;)V

    const/16 v24, 0x1

    const v20, 0x36d5

    invoke-static/range {v20 .. v20}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v21, v1

    move-object/from16 v23, v2

    .line 34
    invoke-static/range {v17 .. v24}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 35
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 36
    invoke-static {}, Leg0;->B()V

    .line 37
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v1

    new-instance v2, Ltd0$f;

    invoke-direct {v2, v0}, Ltd0$f;-><init>(Ltd0;)V

    invoke-static {v1, v9, v8, v7, v2}, Leg0;->o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 38
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 39
    invoke-static {}, Leg0;->B()V

    .line 40
    invoke-virtual/range {p0 .. p0}, Lxc0;->k()Lz;

    move-result-object v7

    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ltd0$g;

    invoke-direct {v11, v0}, Ltd0$g;-><init>(Ltd0;)V

    new-instance v13, Ltd0$h;

    invoke-direct {v13, v0}, Ltd0$h;-><init>(Ltd0;)V

    const/4 v14, 0x1

    const v12, 0x36d6

    invoke-static {v12}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-static/range {v7 .. v14}, Leg0;->s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V

    return-void

    .line 41
    :cond_9
    iget-object v1, v0, Lxc0;->b:Lmg0;

    const/4 v2, 0x0

    const/16 v3, 0x6e

    invoke-interface {v1, v3, v2}, Lmg0;->t(ILjava/lang/Object;)V

    :cond_a
    :goto_2
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 3
    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v0

    const/16 v1, 0x6b

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const v0, 0x7f1203bc

    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    const v0, 0x7f120104

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f120114

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 8

    .line 1
    invoke-static {}, Leg0;->B()V

    .line 2
    iget-object v0, p0, Ltd0;->C:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Ltd0;->A:Landroid/widget/TextView;

    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v2, 0x36d7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x3a

    const/4 v1, 0x1

    const/16 v3, 0xa

    const v4, 0x36d8

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x6e

    if-eq p1, v0, :cond_5

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_1

    goto/16 :goto_5

    .line 5
    :cond_1
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 6
    iget-object v0, p0, Ltd0;->y:Landroid/widget/TextView;

    const v7, 0x36d9

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object v0, p0, Ltd0;->z:Landroid/widget/TextView;

    const v7, 0x7f120465

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(I)V

    .line 8
    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 10
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 11
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 13
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 14
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v6, v5}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_5

    .line 15
    :cond_3
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 16
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 18
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v6, v5}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_5

    .line 19
    :cond_5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 20
    iget-object v0, p0, Ltd0;->z:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v0, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/TransactionData;->setResult(Ljava/lang/String;)V

    .line 22
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 23
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, v3}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 24
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 25
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getInstance(Landroid/app/Activity;)Lcom/olive/upi/transport/OliveUpiManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveUpiManager;->getLastTransactionId()Ljava/lang/String;

    move-result-object p1

    .line 27
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionId(Ljava/lang/String;)V

    .line 28
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 29
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v6, v5}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_5

    .line 30
    :cond_7
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setRefid(Ljava/lang/String;)V

    .line 31
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    iget-object p2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    :goto_4
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setUmnID(Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/TransactionData;->setTransactionStatus(I)V

    .line 33
    iget-object p1, p0, Lxc0;->b:Lmg0;

    invoke-interface {p1, v6, v5}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_5
    return-void
.end method

.method public final z()V
    .locals 12

    .line 1
    new-instance v0, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;

    invoke-direct {v0}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;-><init>()V

    .line 2
    sget v1, Ltd0;->I:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 3
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lqa0;->h0(Lcom/olive/upi/transport/model/MandateTransactionData;)V

    .line 4
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v2, 0xb

    invoke-interface {v0, v2, v1}, Lmg0;->o(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 5
    :cond_0
    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v1

    if-eq v1, v2, :cond_6

    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_1

    goto/16 :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/MandateTransactionData;->getMandateType()I

    move-result v1

    const/4 v3, 0x3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v1

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYER_UPDATE_MANDATE:I

    if-ne v1, v3, :cond_2

    .line 7
    invoke-virtual {p0}, Ltd0;->D()V

    goto/16 :goto_1

    .line 8
    :cond_2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v1

    sget-object v3, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v1, v3}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_5

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v3, v2, :cond_3

    .line 11
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x50

    const v2, 0x36da

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lmg0;->t(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 12
    :cond_3
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v2

    sget v3, Lcom/olive/upi/transport/model/TransactionData;->MODE_PAYEE_UPDATE_MANDATE:I

    const/16 v4, 0x3b

    const/16 v5, 0x6b

    const v6, 0x36db

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x36dc

    invoke-static {v7}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x36dd

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x36de

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x36df

    invoke-static {v10}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    if-ne v2, v3, :cond_4

    .line 13
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 14
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v10}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 15
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    .line 16
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getUmnID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setUmn(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v0, v9}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0, v8}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 19
    iget-object v2, p0, Ltd0;->p:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 20
    iget-object v2, p0, Ltd0;->q:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 21
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setAmount(Ljava/lang/String;)V

    const v2, 0x36e0

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 23
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRule(Ljava/lang/String;)V

    .line 24
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    .line 26
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 28
    iget-object v2, p0, Ltd0;->w:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 29
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 30
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 34
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v5, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_1

    .line 35
    :cond_4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v2

    invoke-static {v2}, Leg0;->i(Landroid/app/Activity;)V

    .line 36
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    invoke-virtual {v2, v10}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setCustomerid(Ljava/lang/String;)V

    .line 37
    invoke-static {}, Lc70;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setTxnid(Ljava/lang/String;)V

    .line 38
    invoke-virtual {v0, v9}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMandatename(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v0, v8}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRevocable(Ljava/lang/String;)V

    .line 40
    iget-object v2, p0, Ltd0;->p:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setValiditystart(Ljava/lang/String;)V

    .line 41
    iget-object v2, p0, Ltd0;->q:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setValidityend(Ljava/lang/String;)V

    .line 42
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc70;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setAmount(Ljava/lang/String;)V

    const v2, 0x36e1

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 43
    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMandatetype(Ljava/lang/String;)V

    .line 44
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getAmountRule()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRule(Ljava/lang/String;)V

    .line 45
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getOccurence()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRecurrence(Ljava/lang/String;)V

    .line 46
    invoke-virtual {v0, v7}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRulevalue(Ljava/lang/String;)V

    .line 47
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/MandateTransactionData;->getTransactionOn()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setRuletype(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v0, v6}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setMonthlylimit(Ljava/lang/String;)V

    .line 49
    iget-object v2, p0, Ltd0;->w:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setNote(Ljava/lang/String;)V

    .line 50
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeraddr(Ljava/lang/String;)V

    .line 51
    iget-object v2, p0, Ltd0;->E:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayername(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeeaddr(Ljava/lang/String;)V

    .line 53
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setPayeename(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/olive/upi/transport/model/PayeeInitiatedMandate;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 55
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v2, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v2, v5, v4, v0}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_1

    .line 56
    :cond_5
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x36e2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1

    .line 57
    :cond_6
    :goto_0
    invoke-virtual {p0}, Ltd0;->D()V

    :goto_1
    return-void
.end method
