.class public Lsd0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lsd0;


# direct methods
.method public constructor <init>(Lsd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsd0$a;->b:Lsd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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
    iget-object p1, p0, Lsd0$a;->b:Lsd0;

    iget-object p1, p1, Lsd0;->B:Ls90;

    invoke-virtual {p1, p3}, Ls90;->c(I)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->q:Landroid/widget/LinearLayout;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->r:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    invoke-static {p2}, Lsd0;->x(Lsd0;)Landroid/widget/Button;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setVisibility(I)V

    .line 5
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->s:Landroid/widget/TextView;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->p:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    invoke-static {p2}, Lsd0;->y(Lsd0;)Landroid/widget/Button;

    move-result-object p2

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setVisibility(I)V

    .line 9
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->u:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->t:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->x:Landroid/widget/CheckBox;

    invoke-virtual {p2, p3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 13
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p3, p2, Lsd0;->w:Lcom/upi/axispay/custom/CustomAutoComplete;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p3, p2}, Ljg0;->C(Landroid/view/View;Landroid/content/Context;)V

    .line 14
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/olive/upi/transport/model/TransactionData;->setPayeeName(Ljava/lang/String;)V

    .line 15
    iget-object p2, p0, Lsd0$a;->b:Lsd0;

    iget-object p2, p2, Lsd0;->A:Lcom/olive/upi/transport/model/MandateTransactionData;

    invoke-virtual {p2, p1}, Lcom/olive/upi/transport/model/TransactionData;->setBeneVpa(Lcom/olive/upi/transport/model/BeneVpa;)V

    return-void
.end method
