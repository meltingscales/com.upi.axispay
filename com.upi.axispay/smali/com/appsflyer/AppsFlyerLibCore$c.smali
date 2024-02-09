.class public final Lcom/appsflyer/AppsFlyerLibCore$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/AppsFlyerLibCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field private final Ι:Lcom/appsflyer/AFEvent;

.field private synthetic ι:Lcom/appsflyer/AppsFlyerLibCore;


# direct methods
.method private constructor <init>(Lcom/appsflyer/AppsFlyerLibCore;Lcom/appsflyer/AFEvent;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p2}, Lcom/appsflyer/AFEvent;->weakContext()Lcom/appsflyer/AFEvent;

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/appsflyer/AppsFlyerLibCore;Lcom/appsflyer/AFEvent;B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/AppsFlyerLibCore$c;-><init>(Lcom/appsflyer/AppsFlyerLibCore;Lcom/appsflyer/AFEvent;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v1}, Lcom/appsflyer/AFEvent;->params()Ljava/util/Map;

    move-result-object v1

    .line 2
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v2}, Lcom/appsflyer/AFEvent;->Ι()Z

    move-result v2

    .line 3
    iget-object v3, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v3}, Lcom/appsflyer/AFEvent;->urlString()Ljava/lang/String;

    move-result-object v3

    .line 4
    iget-object v4, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    .line 5
    iget v5, v4, Lcom/appsflyer/AFEvent;->ӏ:I

    .line 6
    invoke-virtual {v4}, Lcom/appsflyer/AFEvent;->context()Landroid/content/Context;

    move-result-object v4

    .line 7
    iget-object v6, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-virtual {v6}, Lcom/appsflyer/AppsFlyerLib;->isTrackingStopped()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8
    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v1}, Lcom/appsflyer/AFEvent;->getRequestListener()Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9
    sget v2, Lcom/appsflyer/attribution/RequestError;->STOP_TRACKING:I

    sget-object v3, Lcom/appsflyer/internal/attribution/RequestErrorMessage;->STOP_TRACKING:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lcom/appsflyer/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    const/4 v6, 0x0

    new-array v7, v6, [B

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v2, :cond_9

    if-gt v5, v8, :cond_9

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    iget-object v10, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v10}, Lcom/appsflyer/AppsFlyerLibCore;->ɹ(Lcom/appsflyer/AppsFlyerLibCore;)Z

    move-result v10

    if-eqz v10, :cond_2

    const v0, 0x1f13

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 12
    iget-object v11, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v11}, Lcom/appsflyer/AppsFlyerLibCore;->Ɩ(Lcom/appsflyer/AppsFlyerLibCore;)Lcom/appsflyer/internal/referrer/GoogleReferrer;

    move-result-object v11

    iget-object v11, v11, Lcom/appsflyer/internal/referrer/GoogleReferrer;->oldMap:Ljava/util/Map;

    invoke-interface {v1, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    invoke-static {v4}, Lcom/appsflyer/AppsFlyerLibCore;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v10

    .line 14
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    const v0, 0x1f14

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 15
    invoke-interface {v10, v11, v9}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    .line 16
    invoke-interface {v10}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 17
    iget-object v10, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v10}, Lcom/appsflyer/AppsFlyerLibCore;->Ɩ(Lcom/appsflyer/AppsFlyerLibCore;)Lcom/appsflyer/internal/referrer/GoogleReferrer;

    move-result-object v10

    iget-object v10, v10, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_2
    sget-object v10, Lcom/appsflyer/AppsFlyerLibCore$10;->ɩ:[I

    iget-object v11, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v11}, Lcom/appsflyer/AppsFlyerLibCore;->і(Lcom/appsflyer/AppsFlyerLibCore;)Lcom/appsflyer/internal/referrer/HuaweiReferrer;

    move-result-object v11

    invoke-virtual {v11}, Lcom/appsflyer/internal/referrer/Referrer;->getState()Lcom/appsflyer/internal/referrer/Referrer$State;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    if-eq v10, v9, :cond_4

    if-eq v10, v8, :cond_3

    goto :goto_0

    :cond_3
    if-ne v5, v8, :cond_5

    .line 19
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    const v0, 0x1f15

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v0, 0x1f16

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 20
    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x1f17

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    const v0, 0x1f18

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    .line 21
    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance v10, Lcom/appsflyer/internal/referrer/MandatoryFields;

    invoke-direct {v10}, Lcom/appsflyer/internal/referrer/MandatoryFields;-><init>()V

    invoke-interface {v5, v10}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 23
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 24
    :cond_4
    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v5}, Lcom/appsflyer/AppsFlyerLibCore;->і(Lcom/appsflyer/AppsFlyerLibCore;)Lcom/appsflyer/internal/referrer/HuaweiReferrer;

    move-result-object v5

    iget-object v5, v5, Lcom/appsflyer/internal/referrer/Referrer;->map:Ljava/util/Map;

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    :cond_5
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    const v0, 0x1f19

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    :cond_6
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v2}, Lcom/appsflyer/AppsFlyerLibCore;->ι(Lcom/appsflyer/AppsFlyerLibCore;)Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_7

    const v0, 0x1f1a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 27
    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v5}, Lcom/appsflyer/AppsFlyerLibCore;->ι(Lcom/appsflyer/AppsFlyerLibCore;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_7
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v2}, Lcom/appsflyer/AppsFlyerLibCore;->Ӏ(Lcom/appsflyer/AppsFlyerLibCore;)Z

    move-result v2

    if-eqz v2, :cond_8

    const v0, 0x1f1b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 29
    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v5}, Lcom/appsflyer/AppsFlyerLibCore;->ı(Lcom/appsflyer/AppsFlyerLibCore;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 30
    :cond_8
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v2}, Lcom/appsflyer/AppsFlyerLibCore;->І(Lcom/appsflyer/AppsFlyerLibCore;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 31
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-static {v2, v5}, Lcom/appsflyer/AppsFlyerLibCore;->ɩ(Lcom/appsflyer/AppsFlyerLibCore;Ljava/util/Map;)Ljava/util/Map;

    .line 32
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v2}, Lcom/appsflyer/AppsFlyerLibCore;->ı(Lcom/appsflyer/AppsFlyerLibCore;)Ljava/util/Map;

    move-result-object v2

    const v0, 0x1f1c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v0, 0x1f1d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v5, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x1f1e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 33
    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    invoke-static {v5}, Lcom/appsflyer/AppsFlyerLibCore;->ı(Lcom/appsflyer/AppsFlyerLibCore;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v1, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_9
    :goto_1
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    instance-of v2, v2, Lcom/appsflyer/internal/model/event/AdRevenue;

    if-nez v2, :cond_a

    .line 35
    new-instance v2, Lcom/appsflyer/internal/b$a;

    invoke-direct {v2, v1, v4}, Lcom/appsflyer/internal/b$a;-><init>(Ljava/util/Map;Landroid/content/Context;)V

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_a
    const/4 v2, 0x0

    .line 36
    :try_start_0
    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    instance-of v10, v5, Lcom/appsflyer/internal/model/event/AdRevenue;

    if-eqz v10, :cond_b

    const v0, 0x1f1f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 37
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    goto :goto_2

    :cond_b
    const v0, 0x1f20

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v10

    .line 38
    invoke-interface {v1, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 39
    :goto_2
    invoke-virtual {v5, v10}, Lcom/appsflyer/AFEvent;->key(Ljava/lang/String;)Lcom/appsflyer/AFEvent;

    .line 40
    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 41
    :try_start_1
    iget-object v5, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-array v10, v9, [Ljava/lang/Object;

    aput-object v5, v10, v6

    const/16 v5, 0x30

    const/16 v11, 0x738f

    const/16 v12, 0x18

    invoke-static {v5, v11, v12}, Lcom/appsflyer/internal/e;->ı(ICI)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    const v0, 0x1f21

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v11

    new-array v12, v9, [Ljava/lang/Class;

    const-class v13, Lcom/appsflyer/AFEvent;

    aput-object v13, v12, v6

    invoke-virtual {v5, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v2, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 43
    :try_start_4
    iget-object v1, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->ι:Lcom/appsflyer/AppsFlyerLibCore;

    iget-object v6, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v6, v5}, Lcom/appsflyer/AFEvent;->post([B)Lcom/appsflyer/AFEvent;

    move-result-object v6

    invoke-static {v1, v6}, Lcom/appsflyer/AppsFlyerLibCore;->ǃ(Lcom/appsflyer/AppsFlyerLibCore;Lcom/appsflyer/AFEvent;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    return-void

    :catch_0
    move-exception v1

    move-object v7, v5

    goto :goto_4

    :catchall_0
    move-exception v6

    move-object v7, v5

    goto :goto_3

    :catchall_1
    move-exception v5

    .line 44
    :try_start_5
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_c

    throw v6

    :cond_c
    throw v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v6

    .line 45
    :goto_3
    :try_start_6
    monitor-exit v1

    throw v6
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v2}, Lcom/appsflyer/AFEvent;->getRequestListener()Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 48
    sget v3, Lcom/appsflyer/attribution/RequestError;->NETWORK_FAILURE:I

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Lcom/appsflyer/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    :cond_d
    return-void

    :catch_1
    move-exception v1

    :goto_4
    const v0, 0x1f22

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 49
    invoke-static {v5, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz v7, :cond_12

    if-eqz v4, :cond_12

    const v0, 0x1f23

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 50
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_12

    .line 51
    invoke-static {}, Lcom/appsflyer/internal/aa;->ı()Lcom/appsflyer/internal/aa;

    new-instance v5, Lcom/appsflyer/internal/i;

    const v0, 0x1f24

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v3, v7, v6}, Lcom/appsflyer/internal/i;-><init>(Ljava/lang/String;[BLjava/lang/String;)V

    .line 52
    :try_start_7
    invoke-static {v4}, Lcom/appsflyer/internal/aa;->ǃ(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_e

    .line 54
    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    goto/16 :goto_6

    .line 55
    :cond_e
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 56
    array-length v3, v3

    const/16 v6, 0x28

    if-le v3, v6, :cond_f

    const v0, 0x1f25

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_f
    const v0, 0x1f26

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 58
    invoke-static {v3}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 59
    new-instance v3, Ljava/io/File;

    invoke-static {v4}, Lcom/appsflyer/internal/aa;->ǃ(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 61
    new-instance v4, Ljava/io/OutputStreamWriter;

    new-instance v6, Ljava/io/FileOutputStream;

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v3, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    invoke-direct {v4, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    const v0, 0x1f27

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 62
    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 63
    iget-object v2, v5, Lcom/appsflyer/internal/i;->ɩ:Ljava/lang/String;

    .line 64
    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const/16 v2, 0xa

    .line 65
    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(I)V

    const v0, 0x1f28

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-virtual {v4, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 67
    iget-object v3, v5, Lcom/appsflyer/internal/i;->Ι:Ljava/lang/String;

    .line 68
    invoke-virtual {v4, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(I)V

    const v0, 0x1f29

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 70
    invoke-virtual {v4, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v5}, Lcom/appsflyer/internal/i;->Ι()[B

    move-result-object v3

    invoke-static {v3, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v4, v2}, Ljava/io/Writer;->write(I)V

    .line 73
    invoke-virtual {v4}, Ljava/io/Writer;->flush()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 74
    :try_start_9
    invoke-virtual {v4}, Ljava/io/Writer;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_6

    :catchall_4
    move-exception v1

    move-object v2, v4

    goto :goto_7

    :catch_2
    move-exception v3

    move-object v2, v4

    goto :goto_5

    :catchall_5
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v3

    :goto_5
    :try_start_a
    const v0, 0x1f2a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 75
    invoke-static {v4, v3}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    if-eqz v2, :cond_10

    .line 76
    :try_start_b
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_4

    goto :goto_6

    :catch_4
    move-exception v2

    .line 77
    invoke-static {v2}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/Throwable;)V

    .line 78
    :cond_10
    :goto_6
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :goto_7
    if-eqz v2, :cond_11

    .line 79
    :try_start_c
    invoke-virtual {v2}, Ljava/io/Writer;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    goto :goto_8

    :catch_5
    move-exception v2

    .line 80
    invoke-static {v2}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/Throwable;)V

    .line 81
    :cond_11
    :goto_8
    throw v1

    .line 82
    :cond_12
    :goto_9
    iget-object v2, p0, Lcom/appsflyer/AppsFlyerLibCore$c;->Ι:Lcom/appsflyer/AFEvent;

    invoke-virtual {v2}, Lcom/appsflyer/AFEvent;->getRequestListener()Lcom/appsflyer/attribution/AppsFlyerRequestListener;

    move-result-object v2

    if-eqz v2, :cond_13

    .line 83
    sget v3, Lcom/appsflyer/attribution/RequestError;->NETWORK_FAILURE:I

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/appsflyer/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    .line 84
    :cond_13
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/appsflyer/AppsFlyerLibCore$InstallAttributionIdFetcher;->ı(Ljava/lang/String;)V

    return-void
.end method
