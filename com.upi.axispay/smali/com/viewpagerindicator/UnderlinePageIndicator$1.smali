.class public Lcom/viewpagerindicator/UnderlinePageIndicator$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/viewpagerindicator/UnderlinePageIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;


# direct methods
.method public constructor <init>(Lcom/viewpagerindicator/UnderlinePageIndicator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    invoke-static {v0}, Lcom/viewpagerindicator/UnderlinePageIndicator;->access$000(Lcom/viewpagerindicator/UnderlinePageIndicator;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    invoke-static {v0}, Lcom/viewpagerindicator/UnderlinePageIndicator;->access$100(Lcom/viewpagerindicator/UnderlinePageIndicator;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    iget-object v1, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    invoke-static {v1}, Lcom/viewpagerindicator/UnderlinePageIndicator;->access$200(Lcom/viewpagerindicator/UnderlinePageIndicator;)I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    invoke-static {v1}, Lcom/viewpagerindicator/UnderlinePageIndicator;->access$100(Lcom/viewpagerindicator/UnderlinePageIndicator;)Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 4
    iget-object v1, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    if-lez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/viewpagerindicator/UnderlinePageIndicator$1;->this$0:Lcom/viewpagerindicator/UnderlinePageIndicator;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method
