.class public final Lcom/google/firebase/messaging/zzb;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field private final zzag:Landroid/content/Context;

.field private final zzco:Landroid/os/Bundle;

.field private final zzdy:Ljava/util/concurrent/Executor;

.field private final zzdz:Lcom/google/firebase/messaging/zza;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Lcom/google/firebase/messaging/zzb;->zzdy:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p1, p0, Lcom/google/firebase/messaging/zzb;->zzag:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/google/firebase/messaging/zzb;->zzco:Landroid/os/Bundle;

    .line 5
    new-instance p2, Lcom/google/firebase/messaging/zza;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/firebase/messaging/zza;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/firebase/messaging/zzb;->zzdz:Lcom/google/firebase/messaging/zza;

    return-void
.end method


# virtual methods
.method public final zzas()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/zzb;->zzco:Landroid/os/Bundle;

    const-string v1, "gcm.n.noui"

    invoke-static {v0, v1}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/messaging/zzb;->zzag:Landroid/content/Context;

    const-string v2, "keyguard"

    .line 3
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    .line 4
    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_3

    .line 5
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastLollipop()Z

    move-result v0

    if-nez v0, :cond_1

    const-wide/16 v3, 0xa

    .line 6
    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    .line 7
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 8
    iget-object v3, p0, Lcom/google/firebase/messaging/zzb;->zzag:Landroid/content/Context;

    const-string v4, "activity"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager;

    .line 9
    invoke-virtual {v3}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 10
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 11
    iget v5, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v5, v0, :cond_2

    .line 12
    iget v0, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v3, 0x64

    if-ne v0, v3, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    if-eqz v0, :cond_4

    return v2

    .line 13
    :cond_4
    iget-object v0, p0, Lcom/google/firebase/messaging/zzb;->zzco:Landroid/os/Bundle;

    const-string v3, "gcm.n.image"

    invoke-static {v0, v3}, Lcom/google/firebase/messaging/zza;->zza(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/google/firebase/messaging/zze;->zzo(Ljava/lang/String;)Lcom/google/firebase/messaging/zze;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v3, p0, Lcom/google/firebase/messaging/zzb;->zzdy:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v3}, Lcom/google/firebase/messaging/zze;->zza(Ljava/util/concurrent/Executor;)V

    .line 16
    :cond_5
    iget-object v3, p0, Lcom/google/firebase/messaging/zzb;->zzdz:Lcom/google/firebase/messaging/zza;

    iget-object v4, p0, Lcom/google/firebase/messaging/zzb;->zzco:Landroid/os/Bundle;

    .line 17
    invoke-virtual {v3, v4}, Lcom/google/firebase/messaging/zza;->zzf(Landroid/os/Bundle;)Lcom/google/firebase/messaging/zzc;

    move-result-object v3

    .line 18
    iget-object v4, v3, Lcom/google/firebase/messaging/zzc;->zzea:Lm8$e;

    const-string v5, "FirebaseMessaging"

    if-eqz v0, :cond_6

    .line 19
    :try_start_0
    invoke-virtual {v0}, Lcom/google/firebase/messaging/zze;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v6

    const-wide/16 v7, 0x5

    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v6, v7, v8, v9}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    .line 20
    invoke-virtual {v4, v6}, Lm8$e;->n(Landroid/graphics/Bitmap;)Lm8$e;

    .line 21
    new-instance v7, Lm8$b;

    invoke-direct {v7}, Lm8$b;-><init>()V

    invoke-virtual {v7, v6}, Lm8$b;->i(Landroid/graphics/Bitmap;)Lm8$b;

    const/4 v6, 0x0

    invoke-virtual {v7, v6}, Lm8$b;->h(Landroid/graphics/Bitmap;)Lm8$b;

    invoke-virtual {v4, v7}, Lm8$e;->s(Lm8$f;)Lm8$e;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v4, "Failed to download image in time, showing notification without it"

    .line 22
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    invoke-virtual {v0}, Lcom/google/firebase/messaging/zze;->close()V

    goto :goto_1

    :catch_1
    const-string v4, "Interrupted while downloading image, showing notification without it"

    .line 24
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    invoke-virtual {v0}, Lcom/google/firebase/messaging/zze;->close()V

    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :catch_2
    :cond_6
    :goto_1
    const/4 v0, 0x3

    .line 27
    invoke-static {v5, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    .line 28
    iget-object v0, p0, Lcom/google/firebase/messaging/zzb;->zzag:Landroid/content/Context;

    const-string v4, "notification"

    .line 29
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 30
    iget-object v4, v3, Lcom/google/firebase/messaging/zzc;->tag:Ljava/lang/String;

    iget-object v3, v3, Lcom/google/firebase/messaging/zzc;->zzea:Lm8$e;

    invoke-virtual {v3}, Lm8$e;->b()Landroid/app/Notification;

    move-result-object v3

    invoke-virtual {v0, v4, v2, v3}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    return v1
.end method
