.class public final Lcom/google/android/gms/tagmanager/zzfo;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/tagmanager/TagManager;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/TagManager;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfo;->zza:Lcom/google/android/gms/tagmanager/TagManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x14

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzfo;->zza:Lcom/google/android/gms/tagmanager/TagManager;

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/TagManager;->dispatch()V

    :cond_0
    return-void
.end method
