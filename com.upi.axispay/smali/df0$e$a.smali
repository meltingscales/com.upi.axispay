.class public Ldf0$e$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf0$e;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ldf0$e;


# direct methods
.method public constructor <init>(Ldf0$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldf0$e$a;->b:Ldf0$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v1, p0, Ldf0$e$a;->b:Ldf0$e;

    iget-object v1, v1, Ldf0$e;->d:Ldf0;

    invoke-virtual {v1}, Lxc0;->k()Lz;

    move-result-object v1

    iget-object v2, p0, Ldf0$e$a;->b:Ldf0$e;

    iget-object v2, v2, Ldf0$e;->d:Ldf0;

    const v3, 0x7f1201dc

    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v1, p0, Ldf0$e$a;->b:Ldf0$e;

    iget-object v1, v1, Ldf0$e;->b:Ljava/lang/String;

    const v0, 0x3d9c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 5
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x3d9d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x3d9e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x37

    const/16 v5, 0x53

    invoke-direct {v3, v4, v5, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :catch_0
    :try_start_1
    iget-object v1, p0, Ldf0$e$a;->b:Ldf0$e;

    iget-object v2, v1, Ldf0$e;->b:Ljava/lang/String;

    iget-object v1, v1, Ldf0$e;->d:Ldf0;

    invoke-virtual {v1}, Lxc0;->k()Lz;

    move-result-object v1

    const/16 v3, 0xfa

    invoke-static {v2, v1, v3}, Ljg0;->e(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 11
    iget-object v2, p0, Ldf0$e$a;->b:Ldf0$e;

    iget-object v2, v2, Ldf0$e;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 12
    iget-object v2, p0, Ldf0$e$a;->b:Ldf0$e;

    iget-object v2, v2, Ldf0$e;->d:Ldf0;

    iput-object v1, v2, Ldf0;->m:Landroid/graphics/Bitmap;

    .line 13
    invoke-static {}, Leg0;->B()V
    :try_end_1
    .catch Ld30; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 14
    :catch_1
    invoke-static {}, Leg0;->B()V

    :goto_0
    return-void
.end method
