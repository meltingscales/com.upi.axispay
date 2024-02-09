.class public Lcom/appsflyer/Foreground;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/Foreground$Listener;
    }
.end annotation


# static fields
.field public static CHECK_DELAY:J

.field public static listener:Lcom/appsflyer/Foreground$Listener;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/appsflyer/Foreground;

    const v1, 0x16d

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Ι(Landroid/content/Context;Lcom/appsflyer/Foreground$Listener;)V
    .locals 1

    .line 1
    sput-object p1, Lcom/appsflyer/Foreground;->listener:Lcom/appsflyer/Foreground$Listener;

    .line 2
    new-instance v0, Lcom/appsflyer/Foreground$5;

    invoke-direct {v0, p1}, Lcom/appsflyer/Foreground$5;-><init>(Lcom/appsflyer/Foreground$Listener;)V

    .line 3
    instance-of p1, p0, Landroid/app/Activity;

    if-eqz p1, :cond_0

    move-object p1, p0

    check-cast p1, Landroid/app/Activity;

    invoke-interface {v0, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityResumed(Landroid/app/Activity;)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
