.class public Lcom/upi/axispay/custom/FloatingInputLayout$1;
.super Landroid/text/method/NumberKeyListener;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/upi/axispay/custom/FloatingInputLayout;->setInputTypeData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/upi/axispay/custom/FloatingInputLayout;


# direct methods
.method public constructor <init>(Lcom/upi/axispay/custom/FloatingInputLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/upi/axispay/custom/FloatingInputLayout$1;->this$0:Lcom/upi/axispay/custom/FloatingInputLayout;

    invoke-direct {p0}, Landroid/text/method/NumberKeyListener;-><init>()V

    return-void
.end method


# virtual methods
.method public getAcceptedChars()[C
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [C

    return-object v0
.end method

.method public getInputType()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
