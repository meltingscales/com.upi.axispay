.class public final Lcom/appsflyer/internal/t;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/t$d;,
        Lcom/appsflyer/internal/t$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ı(Landroid/net/NetworkInfo;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Ι(Landroid/content/Context;)Lcom/appsflyer/internal/t$c;
    .locals 13

    const v0, 0x2f16

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const v0, 0x2f17

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/ConnectivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const v0, 0x2f18

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x2f19

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v3, :cond_6

    const/16 v6, 0x15

    .line 2
    :try_start_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-gt v6, v7, :cond_2

    .line 3
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v6

    .line 4
    array-length v7, v6

    :goto_0
    if-ge v8, v7, :cond_6

    aget-object v10, v6, v8

    .line 5
    invoke-virtual {v3, v10}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object v10

    .line 6
    invoke-static {v10}, Lcom/appsflyer/internal/t;->ı(Landroid/net/NetworkInfo;)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 7
    invoke-virtual {v10}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    if-ne v9, v3, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v10}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {v3, v9}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v6

    invoke-static {v6}, Lcom/appsflyer/internal/t;->ı(Landroid/net/NetworkInfo;)Z

    move-result v6

    if-eqz v6, :cond_3

    :goto_1
    move-object v1, v5

    goto :goto_3

    .line 10
    :cond_3
    invoke-virtual {v3, v8}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v6

    invoke-static {v6}, Lcom/appsflyer/internal/t;->ı(Landroid/net/NetworkInfo;)Z

    move-result v6

    if-eqz v6, :cond_4

    :goto_2
    move-object v1, v4

    goto :goto_3

    .line 11
    :cond_4
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 12
    invoke-static {v3}, Lcom/appsflyer/internal/t;->ı(Landroid/net/NetworkInfo;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 13
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v6

    if-ne v9, v6, :cond_5

    goto :goto_1

    .line 14
    :cond_5
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    :goto_3
    const v0, 0x2f1a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 16
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    :try_start_2
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    const/4 v4, 0x2

    .line 19
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result p0

    if-ne v4, p0, :cond_8

    const v0, 0x2f1b

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception p0

    move-object v12, v3

    move-object v3, v2

    move-object v2, v12

    goto :goto_4

    :catchall_1
    move-exception p0

    move-object v3, v2

    :goto_4
    const v0, 0x2f1c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 20
    invoke-static {v4, p0}, Lcom/appsflyer/AFLogger;->afErrorLog(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v12, v3

    move-object v3, v2

    move-object v2, v12

    .line 21
    :cond_8
    :goto_5
    new-instance p0, Lcom/appsflyer/internal/t$c;

    invoke-direct {p0, v1, v2, v3}, Lcom/appsflyer/internal/t$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
