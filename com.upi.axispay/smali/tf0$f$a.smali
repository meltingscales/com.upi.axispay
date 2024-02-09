.class public Ltf0$f$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltf0$f;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Account;

.field public final synthetic c:Ltf0$f;


# direct methods
.method public constructor <init>(Ltf0$f;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltf0$f$a;->c:Ltf0$f;

    iput-object p2, p0, Ltf0$f$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Ltf0$f$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    const v0, 0x3a72

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 3
    iget-object v0, p0, Ltf0$f$a;->c:Ltf0$f;

    iget-object v0, v0, Ltf0$f;->c:Ltf0;

    iget-object v0, v0, Ltf0;->b0:Ljava/lang/String;

    const v1, 0x3a73

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Ltf0$f$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x3a74

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Ltf0$f$a;->c:Ltf0$f;

    iget-object v0, v0, Ltf0$f;->c:Ltf0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x3a75

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    .line 6
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/4 v1, 0x6

    const/16 v2, 0x207

    iget-object v3, p0, Ltf0$f$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Ltf0$f$a;->c:Ltf0$f;

    iget-object p1, p1, Ltf0$f;->c:Ltf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    const v0, 0x3a76

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
