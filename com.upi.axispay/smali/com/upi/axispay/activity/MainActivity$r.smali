.class public Lcom/upi/axispay/activity/MainActivity$r;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/activity/MainActivity;->v0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/upi/axispay/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/activity/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

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
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    iput p3, p1, Lcom/upi/axispay/activity/MainActivity;->V:I

    .line 2
    invoke-static {p1}, Ld70;->e(Landroid/content/Context;)Ld70;

    move-result-object p1

    invoke-virtual {p1}, Ld70;->f()Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    iget p2, p2, Lcom/upi/axispay/activity/MainActivity;->V:I

    const/4 p4, 0x1

    if-eq p2, p4, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x4ad

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/activity/MainActivity;->D0(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    iget-object p3, p1, Lcom/upi/axispay/activity/MainActivity;->U:Landroid/widget/Spinner;

    iget p1, p1, Lcom/upi/axispay/activity/MainActivity;->V:I

    invoke-virtual {p3, p1, p4}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 7
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/activity/MainActivity;->i0(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const p2, 0x4ae

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 8
    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 9
    :cond_3
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/activity/MainActivity;->D0(Ljava/lang/String;)V

    .line 10
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    iget-object p1, p1, Lcom/upi/axispay/activity/MainActivity;->U:Landroid/widget/Spinner;

    invoke-virtual {p1, p3, p4}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 11
    iget-object p1, p0, Lcom/upi/axispay/activity/MainActivity$r;->b:Lcom/upi/axispay/activity/MainActivity;

    invoke-virtual {p1, p2}, Lcom/upi/axispay/activity/MainActivity;->i0(Ljava/lang/String;)V

    :goto_0
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
