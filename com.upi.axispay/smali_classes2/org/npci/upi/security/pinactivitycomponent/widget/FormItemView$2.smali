.class public Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->i(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;


# direct methods
.method public constructor <init>(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)V
    .locals 0

    iput-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p1}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->m(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;

    move-result-object p1

    iget-object p2, p0, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$2;->b:Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;

    invoke-static {p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;->p(Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView;)I

    move-result p2

    invoke-interface {p1, p2}, Lorg/npci/upi/security/pinactivitycomponent/widget/FormItemView$a;->b(I)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
