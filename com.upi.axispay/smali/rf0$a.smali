.class public Lrf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lrf0;


# direct methods
.method public constructor <init>(Lrf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrf0$a;->b:Lrf0;

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

    .line 1
    iget-object p1, p0, Lrf0$a;->b:Lrf0;

    iget-object p2, p1, Lrf0;->M:Lla0;

    invoke-virtual {p2, p3}, Lla0;->a(I)Lcom/olive/upi/transport/model/Account;

    move-result-object p2

    iput-object p2, p1, Lrf0;->N:Lcom/olive/upi/transport/model/Account;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lrf0$a;->b:Lrf0;

    iget-object p2, p2, Lrf0;->N:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lrf0$a;->b:Lrf0;

    iget-object p2, p2, Lrf0;->s:Lcom/olive/upi/transport/model/TransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setAccount(Lcom/olive/upi/transport/model/Account;)V

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
