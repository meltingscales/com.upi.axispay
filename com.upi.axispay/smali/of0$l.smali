.class public Lof0$l;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lof0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lof0;


# direct methods
.method public constructor <init>(Lof0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lof0$l;->b:Lof0;

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
    iget-object p1, p0, Lof0$l;->b:Lof0;

    iget-object p2, p1, Lof0;->E:Lla0;

    invoke-virtual {p2, p3}, Lla0;->a(I)Lcom/olive/upi/transport/model/Account;

    move-result-object p2

    iput-object p2, p1, Lof0;->F:Lcom/olive/upi/transport/model/Account;

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    iget-object p2, p0, Lof0$l;->b:Lof0;

    iget-object p2, p2, Lof0;->F:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/Account;->getVpa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqa0;->d(Ljava/lang/String;)Lcom/olive/upi/transport/model/Account;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lof0$l;->b:Lof0;

    iget-object p2, p2, Lof0;->l:Lcom/olive/upi/transport/model/TransactionData;

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
