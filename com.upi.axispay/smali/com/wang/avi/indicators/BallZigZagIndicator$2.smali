.class public Lcom/wang/avi/indicators/BallZigZagIndicator$2;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/wang/avi/indicators/BallZigZagIndicator;->onCreateAnimators()Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/wang/avi/indicators/BallZigZagIndicator;

.field public final synthetic val$index:I


# direct methods
.method public constructor <init>(Lcom/wang/avi/indicators/BallZigZagIndicator;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/wang/avi/indicators/BallZigZagIndicator$2;->this$0:Lcom/wang/avi/indicators/BallZigZagIndicator;

    iput p2, p0, Lcom/wang/avi/indicators/BallZigZagIndicator$2;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/wang/avi/indicators/BallZigZagIndicator$2;->this$0:Lcom/wang/avi/indicators/BallZigZagIndicator;

    iget-object v0, v0, Lcom/wang/avi/indicators/BallZigZagIndicator;->translateY:[F

    iget v1, p0, Lcom/wang/avi/indicators/BallZigZagIndicator$2;->val$index:I

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    aput p1, v0, v1

    .line 2
    iget-object p1, p0, Lcom/wang/avi/indicators/BallZigZagIndicator$2;->this$0:Lcom/wang/avi/indicators/BallZigZagIndicator;

    invoke-virtual {p1}, Lcom/wang/avi/Indicator;->postInvalidate()V

    return-void
.end method
