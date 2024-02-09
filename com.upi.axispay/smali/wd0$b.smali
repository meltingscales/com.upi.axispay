.class public Lwd0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lwd0;


# direct methods
.method public constructor <init>(Lwd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwd0$b;->b:Lwd0;

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

    const/4 p1, 0x0

    if-nez p3, :cond_0

    .line 1
    iget-object p2, p0, Lwd0$b;->b:Lwd0;

    iget-object p2, p2, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_0
    const/4 p2, 0x1

    if-ne p3, p2, :cond_1

    .line 2
    iget-object p2, p0, Lwd0$b;->b:Lwd0;

    iget-object p2, p2, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_1
    const/4 p2, 0x2

    if-ne p3, p2, :cond_2

    .line 3
    iget-object p2, p0, Lwd0$b;->b:Lwd0;

    iget-object p2, p2, Lwd0;->q:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_2
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
