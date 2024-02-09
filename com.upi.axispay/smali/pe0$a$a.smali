.class public Lpe0$a$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpe0$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lpe0$a;


# direct methods
.method public constructor <init>(Lpe0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpe0$a$a;->b:Lpe0$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v1, p0, Lpe0$a$a;->b:Lpe0$a;

    iget-object v1, v1, Lpe0$a;->d:Lpe0;

    invoke-virtual {v1}, Lxc0;->k()Lz;

    move-result-object v1

    iget-object v2, p0, Lpe0$a$a;->b:Lpe0$a;

    iget-object v2, v2, Lpe0$a;->d:Lpe0;

    const v3, 0x7f1201dc

    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Leg0;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v1, p0, Lpe0$a$a;->b:Lpe0$a;

    iget-object v1, v1, Lpe0$a;->b:Ljava/lang/String;

    const v0, 0x23ad

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 4
    iget-object v2, p0, Lpe0$a$a;->b:Lpe0$a;

    iget-object v3, v2, Lpe0$a;->b:Ljava/lang/String;

    iget-object v2, v2, Lpe0$a;->d:Lpe0;

    invoke-virtual {v2}, Lxc0;->k()Lz;

    move-result-object v2

    iget-object v4, p0, Lpe0$a$a;->b:Lpe0$a;

    iget-object v4, v4, Lpe0$a;->d:Lpe0;

    iget v4, v4, Lpe0;->w:I

    invoke-static {v3, v2, v4}, Ljg0;->e(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 5
    iget-object v3, p0, Lpe0$a$a;->b:Lpe0$a;

    iget-object v3, v3, Lpe0$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    new-instance v2, Lcom/olive/upi/transport/model/IntentData;

    invoke-direct {v2}, Lcom/olive/upi/transport/model/IntentData;-><init>()V

    .line 7
    sget-object v3, Ln70;->f:Ln70$a;

    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v4

    const v0, 0x23ae

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/olive/upi/transport/model/IntentData;->setAppId(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v3}, Ln70$a;->a()Ln70;

    move-result-object v3

    const v0, 0x23af

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/olive/upi/transport/model/IntentData;->setCustomerId(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/IntentData;->setData(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v2, v1}, Lcom/olive/upi/transport/model/IntentData;->setIntentData(Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lua0;->d()Lua0;

    move-result-object v1

    new-instance v3, Lcom/olive/upi/transport/OliveRequest;

    const/16 v4, 0x37

    const/16 v5, 0x53

    invoke-direct {v3, v4, v5, v2}, Lcom/olive/upi/transport/OliveRequest;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Lua0;->q(Lcom/olive/upi/transport/OliveRequest;)V
    :try_end_0
    .catch Ld30; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 12
    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 13
    :catch_1
    invoke-static {}, Leg0;->B()V

    :goto_0
    return-void
.end method
