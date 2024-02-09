.class public Lcom/upi/axispay/custom/PinEntryEditText$3;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/PinEntryEditText;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/upi/axispay/custom/PinEntryEditText;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/PinEntryEditText;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText$3;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText$3;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    invoke-virtual {p1}, Ld2;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setSelection(I)V

    const/4 p1, 0x1

    return p1
.end method
