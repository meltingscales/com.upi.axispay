.class public final synthetic Lbc0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lqd0;

.field public final synthetic c:Lcom/olive/upi/transport/model/Inbox;


# direct methods
.method public synthetic constructor <init>(Lqd0;Lcom/olive/upi/transport/model/Inbox;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbc0;->b:Lqd0;

    iput-object p2, p0, Lbc0;->c:Lcom/olive/upi/transport/model/Inbox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lbc0;->b:Lqd0;

    iget-object v1, p0, Lbc0;->c:Lcom/olive/upi/transport/model/Inbox;

    invoke-virtual {v0, v1, p1}, Lqd0;->z(Lcom/olive/upi/transport/model/Inbox;Landroid/view/View;)V

    return-void
.end method
