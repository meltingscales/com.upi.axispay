.class public final Lcom/appsflyer/internal/w;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/model/event/BackgroundEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/appsflyer/AFEvent;->weakContext()Lcom/appsflyer/AFEvent;

    move-result-object p1

    check-cast p1, Lcom/appsflyer/internal/model/event/BackgroundEvent;

    iput-object p1, p0, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/appsflyer/internal/w;->ǃ()Ljava/net/HttpURLConnection;

    return-void
.end method

.method public final ǃ()Ljava/net/HttpURLConnection;
    .locals 18

    move-object/from16 v1, p0

    const v17, 0x2f2d

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 1
    iget-object v0, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v0}, Lcom/appsflyer/AFEvent;->urlString()Ljava/lang/String;

    move-result-object v3

    .line 2
    iget-object v0, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v0}, Lcom/appsflyer/internal/model/event/BackgroundEvent;->body()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v4, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v4}, Lcom/appsflyer/internal/model/event/BackgroundEvent;->trackingStopped()Z

    move-result v4

    .line 4
    iget-object v5, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v5}, Lcom/appsflyer/internal/model/event/BackgroundEvent;->readResponse()Z

    move-result v5

    .line 5
    iget-object v6, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v6}, Lcom/appsflyer/internal/model/event/BackgroundEvent;->proxyMode()Z

    move-result v6

    .line 6
    iget-object v7, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v7}, Lcom/appsflyer/AFEvent;->isEncrypt()Z

    move-result v7

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v4, :cond_0

    return-object v9

    :cond_0
    const/4 v4, 0x0

    const/4 v10, 0x1

    .line 8
    :try_start_0
    new-instance v11, Ljava/net/URL;

    invoke-direct {v11, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    if-eqz v6, :cond_2

    .line 9
    invoke-static {}, Lcom/appsflyer/internal/ae;->ǃ()Lcom/appsflyer/internal/ae;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    const v17, 0x2f2e

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    new-array v15, v10, [Ljava/lang/String;

    aput-object v0, v15, v4

    .line 10
    invoke-virtual {v12, v14, v13, v15}, Lcom/appsflyer/internal/ae;->ǃ(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const v17, 0x2f2f

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    .line 11
    invoke-virtual {v0, v12}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v12

    array-length v12, v12

    .line 12
    new-instance v13, Ljava/lang/StringBuilder;

    const v17, 0x2f30

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const v17, 0x2f31

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const v17, 0x2f32

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-le v12, v10, :cond_1

    const v17, 0x2f33

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    :cond_1
    move-object v12, v2

    :goto_0
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v17, 0x2f34

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/ag;->Ι(Ljava/lang/String;)V

    :cond_2
    const v17, 0x2f35

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 14
    invoke-virtual {v11}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/16 v0, 0x7530

    .line 15
    :try_start_1
    invoke-virtual {v12, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 16
    invoke-virtual {v12, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const v17, 0x2f36

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 17
    invoke-virtual {v12, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v12, v10}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 19
    invoke-virtual {v12, v10}, Ljava/net/URLConnection;->setDoOutput(Z)V

    const v17, 0x2f37

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v7, :cond_3

    const v17, 0x2f38

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    :cond_3
    const v17, 0x2f39

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    .line 20
    :goto_1
    invoke-virtual {v12, v0, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v12}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v7, :cond_6

    .line 22
    iget-object v7, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v7}, Lcom/appsflyer/AFEvent;->key()Ljava/lang/String;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-array v13, v10, [Ljava/lang/Object;

    aput-object v7, v13, v4

    const/16 v7, 0x18

    invoke-static {v7, v4, v7}, Lcom/appsflyer/internal/e;->ı(ICI)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Class;

    const v17, 0x2f3a

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v15

    new-array v7, v10, [Ljava/lang/Class;

    const-class v16, Ljava/lang/String;

    aput-object v16, v7, v4

    invoke-virtual {v14, v15, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v9, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-array v9, v10, [Ljava/lang/Object;

    aput-object v8, v9, v4

    const/16 v8, 0x18

    invoke-static {v8, v4, v8}, Lcom/appsflyer/internal/e;->ı(ICI)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Class;

    const v17, 0x2f3b

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v13

    new-array v14, v10, [Ljava/lang/Class;

    const-class v15, [B

    aput-object v15, v14, v4

    invoke-virtual {v8, v13, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v7, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, [B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_4

    throw v4

    :cond_4
    throw v0

    :catchall_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_5

    throw v4

    :cond_5
    throw v0

    :cond_6
    :goto_2
    invoke-virtual {v0, v8}, Ljava/io/OutputStream;->write([B)V

    .line 23
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 24
    invoke-virtual {v12}, Ljava/net/URLConnection;->connect()V

    .line 25
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    if-eqz v5, :cond_7

    .line 26
    invoke-static {}, Lcom/appsflyer/AppsFlyerLibCore;->getInstance()Lcom/appsflyer/AppsFlyerLibCore;

    move-result-object v5

    invoke-virtual {v5, v12}, Lcom/appsflyer/AppsFlyerLibCore;->ǃ(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v2

    :cond_7
    if-eqz v6, :cond_8

    .line 27
    invoke-static {}, Lcom/appsflyer/internal/ae;->ǃ()Lcom/appsflyer/internal/ae;

    move-result-object v5

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const v17, 0x2f3c

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/String;

    .line 28
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v4

    aput-object v2, v8, v10

    invoke-virtual {v5, v7, v6, v8}, Lcom/appsflyer/internal/ae;->ǃ(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    :cond_8
    const/16 v5, 0xc8

    if-ne v0, v5, :cond_9

    const v17, 0x2f3d

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 29
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    .line 30
    iget-object v0, v1, Lcom/appsflyer/internal/w;->ı:Lcom/appsflyer/internal/model/event/BackgroundEvent;

    invoke-virtual {v0}, Lcom/appsflyer/AFEvent;->context()Landroid/content/Context;

    move-result-object v0

    .line 31
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/appsflyer/AppsFlyerLibCore;->REGISTER_URL:Ljava/lang/String;

    invoke-static {v6}, Lcom/appsflyer/ServerConfigHandler;->getUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    if-eqz v0, :cond_a

    .line 32
    invoke-static {v0}, Lcom/appsflyer/AppsFlyerLibCore;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const v17, 0x2f3e

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 33
    invoke-interface {v0, v5, v10}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 34
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const v17, 0x2f3f

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afDebugLog(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v9, v12

    goto :goto_3

    :catchall_3
    move-exception v0

    .line 36
    :goto_3
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const v17, 0x2f40

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v12, v9

    :cond_9
    move v4, v10

    .line 37
    :cond_a
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    const v17, 0x2f41

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v4, :cond_b

    const v17, 0x2f42

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_b
    const v17, 0x2f43

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    :goto_5
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v17, 0x2f44

    invoke-static/range {v17 .. v17}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/AFLogger;->afInfoLog(Ljava/lang/String;)V

    return-object v12
.end method
