.class public Lcom/upi/axispay/custom/PinEntryView$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/PinEntryView;->addViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/upi/axispay/custom/PinEntryView;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/PinEntryView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {p1}, Lcom/upi/axispay/custom/PinEntryView;->access$000(Lcom/upi/axispay/custom/PinEntryView;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {v2}, Lcom/upi/axispay/custom/PinEntryView;->access$100(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 3
    iget-object v2, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz p2, :cond_0

    iget-object v4, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {v4}, Lcom/upi/axispay/custom/PinEntryView;->access$200(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result v4

    if-eq v4, v3, :cond_1

    iget-object v4, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    .line 4
    invoke-static {v4}, Lcom/upi/axispay/custom/PinEntryView;->access$200(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    if-eq v1, p1, :cond_1

    iget-object v4, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    .line 5
    invoke-static {v4}, Lcom/upi/axispay/custom/PinEntryView;->access$100(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result v4

    sub-int/2addr v4, v3

    if-ne v1, v4, :cond_0

    iget-object v4, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {v4}, Lcom/upi/axispay/custom/PinEntryView;->access$100(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result v4

    if-ne p1, v4, :cond_0

    goto :goto_1

    :cond_0
    move v3, v0

    .line 6
    :cond_1
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setSelected(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {v0}, Lcom/upi/axispay/custom/PinEntryView;->access$000(Lcom/upi/axispay/custom/PinEntryView;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 8
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {p1}, Lcom/upi/axispay/custom/PinEntryView;->access$300(Lcom/upi/axispay/custom/PinEntryView;)Landroid/view/View$OnFocusChangeListener;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {p1}, Lcom/upi/axispay/custom/PinEntryView;->access$300(Lcom/upi/axispay/custom/PinEntryView;)Landroid/view/View$OnFocusChangeListener;

    move-result-object p1

    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryView$1;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-interface {p1, v0, p2}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    :cond_3
    return-void
.end method
