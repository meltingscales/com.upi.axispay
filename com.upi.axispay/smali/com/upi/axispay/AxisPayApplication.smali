.class public Lcom/upi/axispay/AxisPayApplication;
.super Lmyunmn/as;
.source "AxisPay"


# instance fields
.field public b:Leh0;

.field public c:Lcom/appsflyer/AppsFlyerConversionListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmyunmn/as;-><init>()V

    .line 2
    new-instance v0, Lcom/upi/axispay/AxisPayApplication$a;

    invoke-direct {v0, p0}, Lcom/upi/axispay/AxisPayApplication$a;-><init>(Lcom/upi/axispay/AxisPayApplication;)V

    iput-object v0, p0, Lcom/upi/axispay/AxisPayApplication;->c:Lcom/appsflyer/AppsFlyerConversionListener;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lxg0;->b(Landroid/content/Context;)Landroid/content/Context;

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0, p1}, Ln70$a;->b(Landroid/content/Context;)Ln70;

    .line 2
    invoke-static {p1}, Lxg0;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Lmyunmn/as;->attachBaseContext(Landroid/content/Context;)V

    .line 3
    invoke-static {p0}, Lki;->l(Landroid/content/Context;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    invoke-static {p0}, Lxg0;->b(Landroid/content/Context;)Landroid/content/Context;

    return-void
.end method

.method public onCreate()V
    .locals 7

    .line 1
    invoke-super {p0}, Lmyunmn/as;->onCreate()V

    const/4 v0, 0x1

    new-array v1, v0, [Lio/fabric/sdk/android/Kit;

    .line 2
    new-instance v2, Lcom/crashlytics/android/Crashlytics;

    invoke-direct {v2}, Lcom/crashlytics/android/Crashlytics;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0, v1}, Lio/fabric/sdk/android/Fabric;->with(Landroid/content/Context;[Lio/fabric/sdk/android/Kit;)Lio/fabric/sdk/android/Fabric;

    .line 3
    invoke-static {p0}, Ld70;->e(Landroid/content/Context;)Ld70;

    .line 4
    invoke-static {p0}, Ly80;->c(Landroid/content/Context;)V

    .line 5
    invoke-static {}, Lph0;->c()Lph0$a;

    move-result-object v1

    new-instance v2, Lio/github/inflationx/calligraphy3/CalligraphyInterceptor;

    new-instance v4, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;

    invoke-direct {v4}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;-><init>()V

    .line 6
    invoke-virtual {p0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f1201ce

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;->setDefaultFontPath(Ljava/lang/String;)Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;

    move-result-object v4

    const v5, 0x7f0401ab

    .line 7
    invoke-virtual {v4, v5}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;->setFontAttrId(I)Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;

    move-result-object v4

    .line 8
    invoke-virtual {v4}, Lio/github/inflationx/calligraphy3/CalligraphyConfig$Builder;->build()Lio/github/inflationx/calligraphy3/CalligraphyConfig;

    move-result-object v4

    invoke-direct {v2, v4}, Lio/github/inflationx/calligraphy3/CalligraphyInterceptor;-><init>(Lio/github/inflationx/calligraphy3/CalligraphyConfig;)V

    .line 9
    invoke-virtual {v1, v2}, Lph0$a;->a(Lnh0;)Lph0$a;

    .line 10
    invoke-virtual {v1}, Lph0$a;->b()Lph0;

    move-result-object v1

    .line 11
    invoke-static {v1}, Lph0;->e(Lph0;)V

    .line 12
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    const v2, 0x3778

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lcom/appsflyer/AppsFlyerLib;->startTracking(Landroid/content/Context;Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/appsflyer/AppsFlyerLib;->setDebugLog(Z)V

    .line 14
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    iget-object v3, p0, Lcom/upi/axispay/AxisPayApplication;->c:Lcom/appsflyer/AppsFlyerConversionListener;

    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/appsflyer/AppsFlyerLib;->init(Ljava/lang/String;Lcom/appsflyer/AppsFlyerConversionListener;Landroid/content/Context;)Lcom/appsflyer/AppsFlyerLib;

    .line 15
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/appsflyer/AppsFlyerLib;->startTracking(Landroid/content/Context;)V

    .line 16
    new-instance v1, Li60$b;

    invoke-direct {v1}, Li60$b;-><init>()V

    .line 17
    invoke-virtual {v1, v0}, Li60$b;->v(Z)Li60$b;

    invoke-virtual {v1, v0}, Li60$b;->u(Z)Li60$b;

    sget-object v0, Lm60;->f:Lm60;

    .line 18
    invoke-virtual {v1, v0}, Li60$b;->x(Lm60;)Li60$b;

    new-instance v0, Lt60;

    const/16 v2, 0x12c

    invoke-direct {v0, v2}, Lt60;-><init>(I)V

    .line 19
    invoke-virtual {v1, v0}, Li60$b;->w(Ls60;)Li60$b;

    invoke-virtual {v1}, Li60$b;->t()Li60;

    move-result-object v0

    .line 20
    new-instance v1, Lk60$b;

    .line 21
    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lk60$b;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-virtual {v1, v0}, Lk60$b;->u(Li60;)Lk60$b;

    new-instance v0, Lg60;

    invoke-direct {v0}, Lg60;-><init>()V

    .line 23
    invoke-virtual {v1, v0}, Lk60$b;->x(Ld60;)Lk60$b;

    const/high16 v0, 0x6400000

    .line 24
    invoke-virtual {v1, v0}, Lk60$b;->v(I)Lk60$b;

    invoke-virtual {v1}, Lk60$b;->t()Lk60;

    move-result-object v0

    .line 25
    invoke-static {}, Lj60;->a()Lj60;

    move-result-object v1

    invoke-virtual {v1, v0}, Lj60;->b(Lk60;)V

    .line 26
    new-instance v0, Landroid/os/StrictMode$VmPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>()V

    .line 27
    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 28
    sget-object v0, Lch0;->e:Lch0$a;

    invoke-virtual {v0, p0}, Lch0$a;->b(Landroid/content/Context;)Lch0;

    move-result-object v0

    .line 29
    sget-object v1, Ln70;->f:Ln70$a;

    invoke-virtual {v1, p0}, Ln70$a;->b(Landroid/content/Context;)Ln70;

    .line 30
    invoke-virtual {v0}, Lch0;->i()V

    .line 31
    new-instance v0, Leh0;

    invoke-direct {v0, p0}, Leh0;-><init>(Landroid/app/Application;)V

    iput-object v0, p0, Lcom/upi/axispay/AxisPayApplication;->b:Leh0;

    .line 32
    invoke-virtual {v0}, Leh0;->b()V

    return-void
.end method
