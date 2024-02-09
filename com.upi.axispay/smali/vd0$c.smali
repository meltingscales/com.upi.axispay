.class public Lvd0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd0;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvd0;


# direct methods
.method public constructor <init>(Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvd0$c;->a:Lvd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    iget-object p1, p0, Lvd0$c;->a:Lvd0;

    iget-object p1, p1, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    const p2, 0x636

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lvd0$c;->a:Lvd0;

    iget-object p1, p1, Lvd0;->r:Lcom/olive/upi/transport/model/MandateTransactionData;

    const p2, 0x637

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/olive/upi/transport/model/MandateTransactionData;->setAmountRule(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
