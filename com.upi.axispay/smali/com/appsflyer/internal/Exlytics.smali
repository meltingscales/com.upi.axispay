.class public Lcom/appsflyer/internal/Exlytics;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final EXCEPTION_COUNT_KEY:Ljava/lang/String;

.field private static ɩ:Landroid/app/Application;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/appsflyer/internal/Exlytics;

    const v1, 0x118

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get()J
    .locals 4

    .line 1
    sget-object v0, Lcom/appsflyer/internal/Exlytics;->ɩ:Landroid/app/Application;

    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/appsflyer/AppsFlyerLibCore;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-wide/16 v1, 0x0

    const v3, 0x370d

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static increment()V
    .locals 5

    .line 1
    sget-object v0, Lcom/appsflyer/internal/Exlytics;->ɩ:Landroid/app/Application;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/appsflyer/AppsFlyerLibCore;->getSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/appsflyer/internal/Exlytics;->get()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    const v3, 0x370e

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static setContext(Landroid/app/Application;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/appsflyer/internal/Exlytics;->ɩ:Landroid/app/Application;

    return-void
.end method
