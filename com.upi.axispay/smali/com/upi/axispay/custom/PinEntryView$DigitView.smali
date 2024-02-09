.class public Lcom/upi/axispay/custom/PinEntryView$DigitView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/upi/axispay/custom/PinEntryView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DigitView"
.end annotation


# instance fields
.field private paint:Landroid/graphics/Paint;

.field public final synthetic this$0:Lcom/upi/axispay/custom/PinEntryView;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/PinEntryView;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/upi/axispay/custom/PinEntryView$DigitView;-><init>(Lcom/upi/axispay/custom/PinEntryView;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Lcom/upi/axispay/custom/PinEntryView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/upi/axispay/custom/PinEntryView$DigitView;-><init>(Lcom/upi/axispay/custom/PinEntryView;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Lcom/upi/axispay/custom/PinEntryView;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/upi/axispay/custom/PinEntryView$DigitView;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    .line 4
    invoke-direct {p0, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/upi/axispay/custom/PinEntryView$DigitView;->paint:Landroid/graphics/Paint;

    .line 6
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iget-object p2, p0, Lcom/upi/axispay/custom/PinEntryView$DigitView;->paint:Landroid/graphics/Paint;

    invoke-static {p1}, Lcom/upi/axispay/custom/PinEntryView;->access$600(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/TextView;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/upi/axispay/custom/PinEntryView$DigitView;->this$0:Lcom/upi/axispay/custom/PinEntryView;

    invoke-static {v1}, Lcom/upi/axispay/custom/PinEntryView;->access$700(Lcom/upi/axispay/custom/PinEntryView;)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v3, v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getWidth()I

    move-result v0

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getHeight()I

    move-result v0

    int-to-float v5, v0

    iget-object v6, p0, Lcom/upi/axispay/custom/PinEntryView$DigitView;->paint:Landroid/graphics/Paint;

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method
