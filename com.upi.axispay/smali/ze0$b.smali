.class public Lze0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lze0;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lze0;


# direct methods
.method public constructor <init>(Lze0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lze0$b;->b:Lze0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lze0$b;->b:Lze0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-static {p1}, Leg0;->i(Landroid/app/Activity;)V

    .line 3
    iget-object p1, p0, Lze0$b;->b:Lze0;

    invoke-static {p1}, Lze0;->x(Lze0;)V

    .line 4
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    iget-object v1, p0, Lze0$b;->b:Lze0;

    iget-object v1, v1, Lze0;->p:Lcom/olive/upi/transport/model/GetMandate;

    const/16 v2, 0x81

    const/16 v3, 0x4b

    invoke-direct {v0, v2, v3, v1}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    return-void
.end method
