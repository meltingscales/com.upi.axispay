.class public Lcom/upi/axispay/custom/PinEntryEditText$8;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/PinEntryEditText;->animateBottomUp(Ljava/lang/CharSequence;I)V
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
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText$8;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText$8;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    iget-object v0, p1, Lcom/upi/axispay/custom/PinEntryEditText;->mOnPinEnteredListener:Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;

    invoke-virtual {p1}, Ld2;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/upi/axispay/custom/PinEntryEditText$OnPinEnteredListener;->onPinEntered(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
