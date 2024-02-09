.class public Ltf0;
.super Lxc0;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lua0$e;


# instance fields
.field public A:Landroid/widget/TextView;

.field public B:Landroid/widget/TextView;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/widget/TextView;

.field public E:Landroid/widget/TextView;

.field public F:Landroid/widget/RelativeLayout;

.field public G:Ljava/lang/Integer;

.field public H:Landroid/widget/RelativeLayout;

.field public I:Landroid/widget/RelativeLayout;

.field public J:Landroid/widget/RelativeLayout;

.field public K:Landroid/widget/RelativeLayout;

.field public L:Landroid/widget/RelativeLayout;

.field public M:Landroid/widget/RelativeLayout;

.field public N:Landroid/widget/TextView;

.field public O:Landroid/widget/TextView;

.field public P:Landroid/widget/TextView;

.field public Q:Landroid/widget/TextView;

.field public R:Landroid/widget/TextView;

.field public S:Landroid/widget/TextView;

.field public T:Landroid/widget/TextView;

.field public U:Landroid/widget/TextView;

.field public V:Landroid/widget/TextView;

.field public W:Landroid/widget/TextView;

.field public X:Lla0;

.field public Y:Lcom/olive/upi/transport/model/TransactionData;

.field public Z:Lcom/olive/upi/transport/model/Account;

.field public a0:Ljava/lang/String;

.field public b0:Ljava/lang/String;

.field public c0:I

.field public d0:I

.field public e0:I

.field public l:Landroid/view/View;

.field public m:Landroid/widget/Spinner;

.field public n:Landroid/widget/Button;

.field public o:Landroid/widget/Button;

.field public p:Landroid/widget/TextView;

.field public q:Z

.field public r:Landroid/widget/ImageView;

.field public s:Landroid/widget/LinearLayout;

.field public t:Landroid/widget/LinearLayout;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/TextView;

.field public x:Landroid/widget/TextView;

.field public y:Landroid/widget/TextView;

.field public z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ltf0;->q:Z

    .line 3
    new-instance v1, Lcom/olive/upi/transport/model/Account;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/Account;-><init>()V

    iput-object v1, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    const/4 v1, 0x2

    .line 4
    iput v1, p0, Ltf0;->c0:I

    const/4 v1, 0x1

    .line 5
    iput v1, p0, Ltf0;->d0:I

    .line 6
    iput v0, p0, Ltf0;->e0:I

    return-void
.end method

.method public static A()Ltf0;
    .locals 1

    .line 1
    new-instance v0, Ltf0;

    invoke-direct {v0}, Ltf0;-><init>()V

    return-object v0
.end method

.method public static synthetic x(Ltf0;)Landroid/widget/Spinner;
    .locals 0

    .line 1
    iget-object p0, p0, Ltf0;->m:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static synthetic y(Ltf0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ltf0;->z()V

    return-void
.end method


# virtual methods
.method public final B(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_3

    .line 1
    iget-object v0, p0, Ltf0;->m:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    const v0, 0x3c0b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x83

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const v0, 0x3c0c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 5
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x6a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object p2, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x9

    invoke-interface {p2, v0, p1}, Lmg0;->t(ILjava/lang/Object;)V

    :goto_0
    return-void

    .line 7
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f1203f6

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public C(Z)V
    .locals 4

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getSign()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIntentData()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->isSignVerified()Z

    move-result v1

    if-nez v1, :cond_0

    .line 5
    new-instance p1, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {p1}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 6
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v1

    const v3, 0x3c0d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const v1, 0x3c0e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/4 v2, 0x6

    const/16 v3, 0x54

    invoke-direct {v1, v2, v3, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    const p1, 0x3c0f

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-virtual {v2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 13
    iget-object v0, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p0, v0, p1}, Ltf0;->B(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_1
    iget-object p1, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getUpiTransactionMode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ltf0;->B(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final D()V
    .locals 5

    .line 1
    iget-object v0, p0, Ltf0;->A:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Ltf0;->A:Landroid/widget/TextView;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    const v4, 0x3c10

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljg0;->x(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const v3, 0x7f120224

    invoke-virtual {p0, v3, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Ltf0;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Ltf0;->y:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public E(I)V
    .locals 0

    return-void
.end method

.method public final F(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Account;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ltf0;->X:Lla0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lla0;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lla0;-><init>(Landroid/app/Activity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Ltf0;->X:Lla0;

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v0, p1}, Lla0;->c(Ljava/util/ArrayList;)V

    :goto_0
    if-eqz p1, :cond_4

    .line 4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 5
    :cond_1
    iget-object v0, p0, Ltf0;->B:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Ltf0;->n:Landroid/widget/Button;

    iget v1, p0, Ltf0;->d0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v0, p0, Ltf0;->m:Landroid/widget/Spinner;

    iget-object v1, p0, Ltf0;->X:Lla0;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 8
    iget-object v0, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    if-eqz v0, :cond_2

    .line 9
    iget-object v1, p0, Ltf0;->m:Landroid/widget/Spinner;

    iget-object v2, p0, Ltf0;->X:Lla0;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lla0;->b(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_1

    .line 10
    :cond_2
    iget-object v0, p0, Ltf0;->G:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Ltf0;->X:Lla0;

    invoke-virtual {v1}, Lla0;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 11
    iget-object v0, p0, Ltf0;->m:Landroid/widget/Spinner;

    iget-object v1, p0, Ltf0;->G:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_1

    .line 12
    :cond_3
    iget-object v0, p0, Ltf0;->m:Landroid/widget/Spinner;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 13
    :goto_1
    iget-object v0, p0, Ltf0;->m:Landroid/widget/Spinner;

    new-instance v1, Ltf0$f;

    invoke-direct {v1, p0, p1}, Ltf0$f;-><init>(Ltf0;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void

    .line 14
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ltf0;->z()V

    return-void
.end method

.method public final G()V
    .locals 12

    .line 1
    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const v2, 0x3c11

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const v2, 0x3c12

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 5
    new-instance v2, Lcom/olive/upi/transport/model/VpaVerify;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/VpaVerify;-><init>()V

    .line 6
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v4, 0x3c13

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/VpaVerify;->setCustomerid(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setVpa(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    invoke-static {v1}, Lc70;->d(Landroid/content/Context;)Lcom/olive/upi/transport/model/DeviceDetails;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setDevice(Lcom/olive/upi/transport/model/DeviceDetails;)V

    .line 9
    new-instance v1, Lcom/olive/upi/transport/model/PayerInfo;

    invoke-direct {v1}, Lcom/olive/upi/transport/model/PayerInfo;-><init>()V

    .line 10
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v3

    sget-object v4, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v3, v4}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v3

    const/4 v4, 0x6

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_2

    .line 12
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/olive/upi/transport/model/PayerInfo;->setPayervpa(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v6}, Lcom/olive/upi/transport/model/Account;->getAccRefNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/olive/upi/transport/model/PayerInfo;->setAccountnumber(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v3}, Lcom/olive/upi/transport/model/Account;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/olive/upi/transport/model/PayerInfo;->setName(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/VpaVerify;->setPayerInfo(Lcom/olive/upi/transport/model/PayerInfo;)V

    .line 16
    iget-object v1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x4f

    if-eqz v1, :cond_1

    iget-object v1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v1

    const v5, 0x3c14

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v1}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v1

    const v5, 0x3c15

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 17
    :cond_0
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v5, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v5, v4, v3, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v5}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 18
    new-instance v1, Ltf0$a;

    const-wide/16 v8, 0xbb8

    const-wide/16 v10, 0x3e8

    move-object v6, v1

    move-object v7, p0

    invoke-direct/range {v6 .. v11}, Ltf0$a;-><init>(Ltf0;JJ)V

    .line 19
    invoke-virtual {v1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    goto :goto_0

    .line 20
    :cond_1
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v5, Lcom/olive/upi/transport/OliveRequest;

    invoke-direct {v5, v4, v3, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v5}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 21
    :cond_2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Leg0;->i(Landroid/app/Activity;)V

    .line 22
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v0

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-direct {v1, v4, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v5, v1}, Lua0;->b(ZLcom/olive/upi/transport/OliveRequest;)V

    return-void

    .line 23
    :cond_3
    :goto_0
    iget-object v1, p0, Ltf0;->C:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0560

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Ltf0;->m:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->performClick()Z

    :goto_0
    return-void
.end method

.method public onCommonLibResponse(ILjava/lang/Object;)V
    .locals 3

    const/16 v0, 0x13

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 2
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p1

    new-instance v1, Lcom/olive/upi/transport/OliveRequest;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v0, p2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const p3, 0x7f0d00af

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a03a5

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->H:Landroid/widget/RelativeLayout;

    .line 3
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0045

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 4
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a000a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Ltf0;->t:Landroid/widget/LinearLayout;

    .line 5
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0489

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 6
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a04ab

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 7
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a04a6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->u:Landroid/widget/TextView;

    .line 8
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a000c

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    .line 9
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a04b2

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->U:Landroid/widget/TextView;

    .line 10
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a04b3

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->V:Landroid/widget/TextView;

    .line 11
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0483

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->W:Landroid/widget/TextView;

    .line 12
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a04b1

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->N:Landroid/widget/TextView;

    .line 13
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0491

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->O:Landroid/widget/TextView;

    .line 14
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0484

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->P:Landroid/widget/TextView;

    .line 15
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0480

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->Q:Landroid/widget/TextView;

    .line 16
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0482

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->R:Landroid/widget/TextView;

    .line 17
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0481

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->S:Landroid/widget/TextView;

    .line 18
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a047f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->T:Landroid/widget/TextView;

    .line 19
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0015

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->I:Landroid/widget/RelativeLayout;

    .line 20
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0006

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->J:Landroid/widget/RelativeLayout;

    .line 21
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0004

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->M:Landroid/widget/RelativeLayout;

    .line 22
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a000b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->L:Landroid/widget/RelativeLayout;

    .line 23
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a000e

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->K:Landroid/widget/RelativeLayout;

    .line 24
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0424

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Ltf0;->m:Landroid/widget/Spinner;

    .line 25
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a00ef

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Ltf0;->n:Landroid/widget/Button;

    .line 26
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a022a

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ltf0;->r:Landroid/widget/ImageView;

    .line 27
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a04cf

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->p:Landroid/widget/TextView;

    .line 28
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0560

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Ltf0;->s:Landroid/widget/LinearLayout;

    .line 29
    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p2, 0x7f0a0364

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Ltf0;->F:Landroid/widget/RelativeLayout;

    const/16 p2, 0x8

    .line 31
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 32
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a048d

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->y:Landroid/widget/TextView;

    .line 33
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a01bb

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->B:Landroid/widget/TextView;

    .line 34
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a0052

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->v:Landroid/widget/TextView;

    .line 35
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a0487

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->w:Landroid/widget/TextView;

    .line 36
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a04a9

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->D:Landroid/widget/TextView;

    .line 37
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a048e

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->x:Landroid/widget/TextView;

    .line 38
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a04e6

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->A:Landroid/widget/TextView;

    .line 39
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a04b5

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->z:Landroid/widget/TextView;

    .line 40
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a04ce

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->C:Landroid/widget/TextView;

    .line 41
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a0055

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ltf0;->E:Landroid/widget/TextView;

    .line 42
    iget-object p1, p0, Ltf0;->z:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 43
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    const p3, 0x7f0a00f2

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Ltf0;->o:Landroid/widget/Button;

    .line 44
    invoke-virtual {p1, p2}, Landroid/widget/Button;->setVisibility(I)V

    .line 45
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object p1

    iput-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    .line 46
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 47
    iget-object p1, p0, Ltf0;->p:Landroid/widget/TextView;

    iget-object p3, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p3

    invoke-virtual {p3}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    :cond_0
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 49
    iget-object p1, p0, Ltf0;->t:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 50
    iget-object p1, p0, Ltf0;->u:Landroid/widget/TextView;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getGstIn()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    iget-object p1, p0, Ltf0;->H:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 52
    iget-object p1, p0, Ltf0;->U:Landroid/widget/TextView;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    iget-object p1, p0, Ltf0;->V:Landroid/widget/TextView;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceNo()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getQRexpire()Ljava/lang/String;

    move-result-object p1

    .line 55
    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getInvoiceDate()Ljava/lang/String;

    move-result-object p2

    .line 56
    iget-object p3, p0, Ltf0;->W:Landroid/widget/TextView;

    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    iget-object p1, p0, Ltf0;->N:Landroid/widget/TextView;

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object p1, p0, Ltf0;->O:Landroid/widget/TextView;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getGstBrkUp()Ljava/lang/String;

    move-result-object p1

    .line 60
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_8

    const p2, 0x3c16

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 61
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p3

    const v1, 0x3c17

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz p3, :cond_6

    const p2, 0x3c18

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 63
    array-length p2, p1

    move p3, v0

    :goto_0
    if-ge p3, p2, :cond_8

    aget-object v3, p1, p3

    .line 64
    invoke-virtual {v3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 65
    aget-object v4, v3, v0

    const v5, 0x3c19

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 66
    iget-object v4, p0, Ltf0;->K:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 67
    iget-object v4, p0, Ltf0;->R:Landroid/widget/TextView;

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object v4, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    aget-object v3, v3, v2

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/TransactionData;->setIGST(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 69
    :cond_1
    aget-object v4, v3, v0

    const v5, 0x3c1a

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 70
    iget-object v4, p0, Ltf0;->M:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 71
    iget-object v4, p0, Ltf0;->T:Landroid/widget/TextView;

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v4, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    aget-object v3, v3, v2

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/TransactionData;->setCESS(Ljava/lang/String;)V

    goto :goto_1

    .line 73
    :cond_2
    aget-object v4, v3, v0

    const v5, 0x3c1b

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 74
    iget-object v4, p0, Ltf0;->L:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 75
    iget-object v4, p0, Ltf0;->S:Landroid/widget/TextView;

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v4, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    aget-object v3, v3, v2

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/TransactionData;->setGST(Ljava/lang/String;)V

    goto :goto_1

    .line 77
    :cond_3
    aget-object v4, v3, v0

    const v5, 0x3c1c

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 78
    iget-object v4, p0, Ltf0;->I:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 79
    iget-object v4, p0, Ltf0;->P:Landroid/widget/TextView;

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v4, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    aget-object v3, v3, v2

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/TransactionData;->setSGST(Ljava/lang/String;)V

    goto :goto_1

    .line 81
    :cond_4
    aget-object v4, v3, v0

    const v5, 0x3c1d

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 82
    iget-object v4, p0, Ltf0;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 83
    iget-object v4, p0, Ltf0;->Q:Landroid/widget/TextView;

    aget-object v5, v3, v2

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    iget-object v4, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    aget-object v3, v3, v2

    invoke-virtual {v4, v3}, Lcom/olive/upi/transport/model/TransactionData;->setCGST(Ljava/lang/String;)V

    :cond_5
    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto/16 :goto_0

    .line 85
    :cond_6
    iget-object p3, p0, Ltf0;->I:Landroid/widget/RelativeLayout;

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 86
    iget-object p3, p0, Ltf0;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 87
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    .line 88
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    add-int/2addr p2, v2

    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 90
    invoke-virtual {p3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p2

    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    add-int/2addr p2, v2

    .line 92
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p3, p2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 93
    iget-object p3, p0, Ltf0;->Q:Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object p3, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p3, p2}, Lcom/olive/upi/transport/model/TransactionData;->setCGST(Ljava/lang/String;)V

    add-int/2addr v0, v2

    .line 95
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 96
    iget-object p2, p0, Ltf0;->P:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setSGST(Ljava/lang/String;)V

    goto :goto_2

    .line 98
    :cond_7
    iget-object p1, p0, Ltf0;->H:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 99
    :cond_8
    :goto_2
    iget-object p1, p0, Ltf0;->n:Landroid/widget/Button;

    new-instance p2, Ltf0$b;

    invoke-direct {p2, p0}, Ltf0$b;-><init>(Ltf0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    iget-object p1, p0, Ltf0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lxc0;->n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result p1

    const/16 v0, 0x13

    if-eq p1, v0, :cond_5

    const/16 v0, 0x4f

    const/4 v1, 0x1

    if-eq p1, v0, :cond_3

    const/16 v0, 0x54

    if-eq p1, v0, :cond_0

    .line 3
    invoke-static {}, Leg0;->B()V

    .line 4
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->A(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 6
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setSignVerified(Z)V

    .line 7
    iget p1, p0, Ltf0;->e0:I

    const/4 p2, 0x4

    if-ne p1, v1, :cond_1

    .line 8
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x83

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 9
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 v0, 0x6a

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object p1, p0, Lxc0;->b:Lmg0;

    const/16 p2, 0x9

    iget-object v0, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    invoke-interface {p1, p2, v0}, Lmg0;->t(ILjava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_3
    iget-boolean p1, p0, Ltf0;->q:Z

    if-eqz p1, :cond_4

    return-void

    .line 12
    :cond_4
    iput-boolean v1, p0, Ltf0;->q:Z

    .line 13
    invoke-static {}, Leg0;->B()V

    .line 14
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    const p2, 0x7f120213

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    goto :goto_0

    .line 16
    :cond_5
    invoke-static {}, Leg0;->B()V

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    .line 18
    :cond_6
    :goto_0
    invoke-static {}, Leg0;->B()V

    return-void
.end method

.method public onResume()V
    .locals 9

    .line 1
    invoke-super {p0}, Lxc0;->onResume()V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0}, Lqa0;->L()Lcom/olive/upi/transport/model/TransactionData;

    move-result-object v0

    iput-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    .line 3
    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    .line 4
    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_COLLECT_NOTIFICATION:I

    if-ne v0, v1, :cond_0

    const v0, 0x7f120348

    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltf0;->a0:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Ltf0;->b0:Ljava/lang/String;

    goto :goto_1

    .line 7
    :cond_0
    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq v0, v1, :cond_3

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_MERCHANT_PAY:I

    if-ne v0, v1, :cond_2

    const v0, 0x7f120099

    .line 9
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltf0;->a0:Ljava/lang/String;

    const v0, 0x7f120208

    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltf0;->b0:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const v0, 0x7f12040d

    .line 11
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltf0;->a0:Ljava/lang/String;

    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltf0;->b0:Ljava/lang/String;

    goto :goto_1

    :cond_3
    :goto_0
    const v0, 0x7f1203dc

    .line 13
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltf0;->a0:Ljava/lang/String;

    const v0, 0x7f1203dd

    .line 14
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltf0;->b0:Ljava/lang/String;

    .line 15
    :goto_1
    iget-object v0, p0, Lxc0;->b:Lmg0;

    const/16 v1, 0x5a

    new-instance v8, Ltg0;

    iget-object v3, p0, Ltf0;->a0:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Ltg0;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-interface {v0, v1, v8}, Lmg0;->o(ILjava/lang/Object;)V

    const/4 v0, 0x6

    .line 16
    iget-object v1, p0, Ltf0;->a0:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lxc0;->v(ILjava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    invoke-static {v0}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lua0;->u(Lua0$e;)V

    .line 18
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    sget-object v1, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {v0, v1}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltf0;->F(Ljava/util/ArrayList;)V

    .line 19
    invoke-virtual {p0}, Ltf0;->G()V

    .line 20
    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getIntentData()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_4

    const v1, 0x3c1e

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v0, 0x1

    .line 22
    iput v0, p0, Ltf0;->e0:I

    .line 23
    invoke-virtual {p0, v2}, Ltf0;->C(Z)V

    return-void

    .line 24
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    const v1, 0x3c1f

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x2

    .line 25
    iput v0, p0, Ltf0;->e0:I

    .line 26
    invoke-virtual {p0, v2}, Ltf0;->C(Z)V

    :cond_5
    return-void
.end method

.method public onSuccessResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_d

    const/16 v1, 0x13

    if-eq v0, v1, :cond_c

    const/16 v1, 0x4f

    const/4 v2, 0x1

    const v3, 0x3c20

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    const/16 v6, 0x61

    if-eq v0, v1, :cond_4

    const/16 v1, 0x54

    if-eq v0, v1, :cond_3

    if-eq v0, v6, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p1

    iget p2, p0, Lxc0;->g:I

    if-ne p1, p2, :cond_e

    .line 3
    invoke-static {}, Leg0;->B()V

    goto/16 :goto_0

    .line 4
    :cond_0
    invoke-static {}, Leg0;->B()V

    .line 5
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/VerifyMarchantResponse;

    .line 6
    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/VerifyMarchantResponse;->getIsVerifyedMerchant()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setIsVerified(Ljava/lang/String;)V

    .line 7
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getIsVerified()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getIsVerified()Ljava/lang/String;

    move-result-object p1

    const p2, 0x3c21

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 8
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double p2, v0, v4

    if-eqz p2, :cond_1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double p1, p1, v0

    if-lez p1, :cond_e

    .line 11
    iget-object p1, p0, Lxc0;->c:Lz;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v0, 0x3c22

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ltf0$e;

    invoke-direct {v0, p0}, Ltf0$e;-><init>(Ltf0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 12
    :cond_1
    iget-object p1, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getUpiTransactionMode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ltf0;->B(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getUpiTransactionMode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ltf0;->B(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 14
    :cond_3
    invoke-static {}, Leg0;->B()V

    .line 15
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, v2}, Lcom/olive/upi/transport/model/TransactionData;->setSignVerified(Z)V

    .line 16
    iget-object p1, p0, Ltf0;->Z:Lcom/olive/upi/transport/model/Account;

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getUpiTransactionMode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ltf0;->B(Lcom/olive/upi/transport/model/Account;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 17
    :cond_4
    iget-boolean p1, p0, Ltf0;->q:Z

    if-eqz p1, :cond_5

    return-void

    .line 18
    :cond_5
    iput-boolean v2, p0, Ltf0;->q:Z

    .line 19
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 20
    invoke-static {}, Leg0;->B()V

    .line 21
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 22
    iget-object v0, p0, Ltf0;->C:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    .line 24
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    .line 25
    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v2, 0x3c23

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x6

    const v8, 0x3c24

    invoke-static {v8}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v8

    const v9, 0x3c25

    invoke-static {v9}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v9

    if-nez v1, :cond_8

    const v1, 0x3c26

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 27
    :cond_6
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 28
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v7, v6, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 29
    :cond_7
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 30
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 31
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 32
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double p2, v0, v4

    if-eqz p2, :cond_e

    .line 34
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double p1, p1, v0

    if-lez p1, :cond_e

    .line 35
    iget-object p1, p0, Lxc0;->c:Lz;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ltf0$c;

    invoke-direct {v0, p0}, Ltf0$c;-><init>(Ltf0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    .line 36
    :cond_8
    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getQrMedium()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 37
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 38
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    invoke-static {p2}, Lua0;->e(Landroid/app/Activity;)Lua0;

    move-result-object p2

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v7, v6, p1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto/16 :goto_0

    .line 39
    :cond_9
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 40
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getMcccode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/TransactionData;->setMcc(Ljava/lang/String;)V

    .line 41
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 42
    iget-object p1, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/TransactionData;->getAmount()Ljava/lang/Double;

    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double p2, v0, v4

    if-eqz p2, :cond_e

    .line 44
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    cmpl-double p1, p1, v0

    if-lez p1, :cond_e

    .line 45
    iget-object p1, p0, Lxc0;->c:Lz;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcom/olive/upi/transport/TransportConstants;->MAX_AMOUNT_ALLOWED:Ljava/lang/Double;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ltf0$d;

    invoke-direct {v0, p0}, Ltf0$d;-><init>(Ltf0;)V

    invoke-static {p1, p2, v0}, Leg0;->n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V

    return-void

    :cond_a
    const/4 p1, 0x0

    .line 46
    invoke-virtual {p0, p1}, Ltf0;->C(Z)V

    goto :goto_0

    .line 47
    :cond_b
    invoke-static {}, Leg0;->B()V

    .line 48
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 49
    iget-object p2, p0, Ltf0;->C:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    iget-object p2, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/TransactionData;->getBeneVpa()Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/BeneVpa;->setName(Ljava/lang/String;)V

    goto :goto_0

    .line 51
    :cond_c
    invoke-static {}, Leg0;->B()V

    .line 52
    iget-object p1, p0, Ltf0;->y:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x3c27

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getData()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    invoke-virtual {p0}, Ltf0;->D()V

    goto :goto_0

    .line 54
    :cond_d
    invoke-static {}, Leg0;->B()V

    .line 55
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    sget-object p2, Lqa0$c;->e:Lqa0$c;

    invoke-virtual {p1, p2}, Lqa0;->h(Lqa0$c;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ltf0;->F(Ljava/util/ArrayList;)V

    .line 56
    invoke-virtual {p0}, Ltf0;->G()V

    :cond_e
    :goto_0
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltf0;->B:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Ltf0;->Y:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/TransactionData;->getTransactionMode()I

    move-result v0

    .line 3
    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_QR_PAY:I

    if-eq v0, v1, :cond_1

    sget v1, Lcom/olive/upi/transport/model/TransactionData;->MODE_BHARAT_QR_PAY:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Ltf0;->B:Landroid/widget/TextView;

    const v1, 0x7f120050

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Ltf0;->B:Landroid/widget/TextView;

    const v1, 0x7f120051

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 6
    :goto_1
    iget-object v0, p0, Ltf0;->n:Landroid/widget/Button;

    iget v1, p0, Ltf0;->c0:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    return-void
.end method
