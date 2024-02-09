.class public final Lcom/google/android/gms/analytics/zze;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xe
.end annotation


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/analytics/GoogleAnalytics;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/analytics/GoogleAnalytics;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/analytics/zze;->zza:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/zze;->zza:Lcom/google/android/gms/analytics/GoogleAnalytics;

    .line 1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->zzh(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/zze;->zza:Lcom/google/android/gms/analytics/GoogleAnalytics;

    .line 1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->zzi(Landroid/app/Activity;)V

    return-void
.end method
