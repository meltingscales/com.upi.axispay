.class public Lcom/appsflyer/internal/referrer/HuaweiReferrer;
.super Lcom/appsflyer/internal/referrer/Referrer;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/referrer/Referrer;-><init>()V

    return-void
.end method


# virtual methods
.method public start(Landroid/content/Context;Ljava/lang/Runnable;)V
    .locals 7

    .line 1
    new-instance v6, Lcom/appsflyer/internal/referrer/HuaweiReferrer$3;

    const v0, 0x15c2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x15c3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v4

    const v3, 0x15c4

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/referrer/HuaweiReferrer$3;-><init>(Lcom/appsflyer/internal/referrer/HuaweiReferrer;Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 2
    invoke-static {}, Lcom/appsflyer/AppsFlyerLibCore;->getInstance()Lcom/appsflyer/AppsFlyerLibCore;

    move-result-object p2

    .line 3
    invoke-static {p1}, Lcom/appsflyer/AppsFlyerLibCore;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lcom/appsflyer/AppsFlyerLibCore;->getLaunchCounter(Landroid/content/SharedPreferences;Z)I

    move-result p2

    const/4 v0, 0x2

    if-ge p2, v0, :cond_0

    .line 4
    invoke-virtual {v6}, Lcom/appsflyer/internal/ContentFetcher;->valid()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {v6}, Lcom/appsflyer/internal/ContentFetcher;->start()V

    .line 6
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/referrer/Referrer;->ι(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
