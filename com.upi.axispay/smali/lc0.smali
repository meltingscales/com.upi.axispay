.class public final synthetic Llc0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lze0;

.field public final synthetic c:Landroid/app/Dialog;

.field public final synthetic d:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;


# direct methods
.method public synthetic constructor <init>(Lze0;Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llc0;->b:Lze0;

    iput-object p2, p0, Llc0;->c:Landroid/app/Dialog;

    iput-object p3, p0, Llc0;->d:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Llc0;->b:Lze0;

    iget-object v1, p0, Llc0;->c:Landroid/app/Dialog;

    iget-object v2, p0, Llc0;->d:Lcom/olive/upi/transport/model/AuthorizeMandateRequest;

    invoke-virtual {v0, v1, v2, p1}, Lze0;->C(Landroid/app/Dialog;Lcom/olive/upi/transport/model/AuthorizeMandateRequest;Landroid/view/View;)V

    return-void
.end method
