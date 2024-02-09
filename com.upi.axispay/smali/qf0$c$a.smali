.class public Lqf0$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqf0$c;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Account;

.field public final synthetic c:Lqf0$c;


# direct methods
.method public constructor <init>(Lqf0$c;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqf0$c$a;->c:Lqf0$c;

    iput-object p2, p0, Lqf0$c$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lqf0$c$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/Account;->getStatus()Ljava/lang/String;

    move-result-object p1

    const v0, 0x17fc

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object p1

    new-instance v0, Lcom/olive/upi/transport/OliveRequest;

    const/16 v1, 0x3f

    const/16 v2, 0x207

    iget-object v3, p0, Lqf0$c$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {v0, v1, v2, v3}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V

    .line 3
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 4
    iget-object v0, p0, Lqf0$c$a;->c:Lqf0$c;

    iget-object v0, v0, Lqf0$c;->c:Lqf0;

    const v1, 0x7f12041e

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x17fd

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lqf0$c$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-virtual {v0}, Lcom/olive/upi/transport/model/Account;->getBankName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljg0;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x17fe

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lqf0$c$a;->c:Lqf0$c;

    iget-object v0, v0, Lqf0$c;->c:Lqf0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v0

    const v1, 0x17ff

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lah0;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lqf0$c$a;->c:Lqf0$c;

    iget-object p1, p1, Lqf0$c;->c:Lqf0;

    iget-object v0, p0, Lqf0$c$a;->b:Lcom/olive/upi/transport/model/Account;

    invoke-static {p1, v0}, Lqf0;->y(Lqf0;Lcom/olive/upi/transport/model/Account;)V

    :goto_0
    return-void
.end method
