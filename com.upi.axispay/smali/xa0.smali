.class public final synthetic Lxa0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lpc0;

.field public final synthetic c:Lcom/olive/upi/transport/model/Account;


# direct methods
.method public synthetic constructor <init>(Lpc0;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa0;->b:Lpc0;

    iput-object p2, p0, Lxa0;->c:Lcom/olive/upi/transport/model/Account;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lxa0;->b:Lpc0;

    iget-object v1, p0, Lxa0;->c:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0, v1, p1}, Lpc0;->E(Lcom/olive/upi/transport/model/Account;Landroid/view/View;)V

    return-void
.end method
