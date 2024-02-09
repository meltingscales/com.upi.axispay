.class public final Lcom/appsflyer/internal/a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/a$d;,
        Lcom/appsflyer/internal/a$e;
    }
.end annotation


# instance fields
.field private ɩ:Landroid/content/IntentFilter;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    const v1, 0x2c97

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/appsflyer/internal/a;->ɩ:Landroid/content/IntentFilter;

    return-void
.end method


# virtual methods
.method public final ι(Landroid/content/Context;)Lcom/appsflyer/internal/a$e;
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    :try_start_0
    iget-object v3, p0, Lcom/appsflyer/internal/a;->ɩ:Landroid/content/IntentFilter;

    invoke-virtual {p1, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_5

    const v0, 0x2c98

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    .line 2
    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ne v6, v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_4

    const v0, 0x2c99

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    if-eq v3, v5, :cond_3

    if-eq v3, v6, :cond_2

    const/4 v5, 0x4

    if-eq v3, v5, :cond_1

    const v0, 0x2c9a    # 1.6E-41f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const v0, 0x2c9b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const v0, 0x2c9c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    const v0, 0x2c9d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    const v0, 0x2c9e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    const v0, 0x2c9f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 4
    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const v0, 0x2ca0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 5
    invoke-virtual {p1, v5, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v3, :cond_5

    if-eq v4, p1, :cond_5

    const/high16 v2, 0x42c80000    # 100.0f

    int-to-float v3, v3

    mul-float/2addr v3, v2

    int-to-float p1, p1

    div-float/2addr v3, p1

    move v2, v3

    .line 6
    :catchall_0
    :cond_5
    new-instance p1, Lcom/appsflyer/internal/a$e;

    invoke-direct {p1, v2, v1}, Lcom/appsflyer/internal/a$e;-><init>(FLjava/lang/String;)V

    return-object p1
.end method
