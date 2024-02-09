.class public Lrd0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrd0;


# direct methods
.method public constructor <init>(Lrd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd0$b;->a:Lrd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p1, 0x6

    if-eqz p3, :cond_0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p3

    const/16 v0, 0x42

    if-eq p3, v0, :cond_1

    :cond_0
    if-ne p2, p1, :cond_2

    .line 2
    :cond_1
    iget-object p2, p0, Lrd0$b;->a:Lrd0;

    iget-object p2, p2, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/PinEntryView;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-ne p2, p1, :cond_2

    .line 3
    iget-object p1, p0, Lrd0$b;->a:Lrd0;

    iget-object p2, p1, Lrd0;->r:Lcom/upi/axispay/custom/PinEntryView;

    invoke-virtual {p2}, Lcom/upi/axispay/custom/PinEntryView;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lrd0;->x(Lrd0;Ljava/lang/String;)V

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
