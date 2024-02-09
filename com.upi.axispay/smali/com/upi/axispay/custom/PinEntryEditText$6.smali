.class public Lcom/upi/axispay/custom/PinEntryEditText$6;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


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

.field public final synthetic val$start:I


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/PinEntryEditText;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText$6;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    iput p2, p0, Lcom/upi/axispay/custom/PinEntryEditText$6;->val$start:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    .line 2
    iget-object v0, p0, Lcom/upi/axispay/custom/PinEntryEditText$6;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    iget-object v0, v0, Lcom/upi/axispay/custom/PinEntryEditText;->mCharBottom:[F

    iget v1, p0, Lcom/upi/axispay/custom/PinEntryEditText$6;->val$start:I

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    aput p1, v0, v1

    .line 3
    iget-object p1, p0, Lcom/upi/axispay/custom/PinEntryEditText$6;->this$0:Lcom/upi/axispay/custom/PinEntryEditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->invalidate()V

    return-void
.end method
