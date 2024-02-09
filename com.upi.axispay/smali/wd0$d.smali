.class public Lwd0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd0;->A(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lwd0;


# direct methods
.method public constructor <init>(Lwd0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwd0$d;->c:Lwd0;

    iput-object p2, p0, Lwd0$d;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    if-nez p3, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object p1, p0, Lwd0$d;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/Account;

    .line 2
    iget-object p2, p0, Lwd0$d;->c:Lwd0;

    iput p3, p2, Lwd0;->C:I

    if-eqz p1, :cond_1

    .line 3
    iput-object p1, p2, Lwd0;->B:Lcom/olive/upi/transport/model/Account;

    .line 4
    iget-object p2, p2, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

    .line 5
    iget-object p2, p0, Lwd0$d;->c:Lwd0;

    iget-object p2, p2, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getMaskedAccnumber()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/MandateTransactionData;->setDebitAccountNo(Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p2

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getIin()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lqa0;->e(Ljava/lang/String;)Lcom/olive/upi/transport/model/Bank;

    .line 7
    :cond_1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lwd0$d;->c:Lwd0;

    iget-object p2, p2, Lwd0;->u:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1, p2}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
