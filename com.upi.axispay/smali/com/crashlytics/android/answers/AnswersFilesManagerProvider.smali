.class public Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final SESSION_ANALYTICS_FILE_NAME:Ljava/lang/String;

.field public static final SESSION_ANALYTICS_TO_SEND_DIR:Ljava/lang/String;


# instance fields
.field public final context:Landroid/content/Context;

.field public final fileStore:Lio/fabric/sdk/android/services/persistence/FileStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;

    const v1, 0xa7

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/fabric/sdk/android/services/persistence/FileStore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;->fileStore:Lio/fabric/sdk/android/services/persistence/FileStore;

    return-void
.end method


# virtual methods
.method public getAnalyticsFilesManager()Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 2
    new-instance v0, Lcom/crashlytics/android/answers/SessionEventTransform;

    invoke-direct {v0}, Lcom/crashlytics/android/answers/SessionEventTransform;-><init>()V

    .line 3
    new-instance v1, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;

    invoke-direct {v1}, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;->fileStore:Lio/fabric/sdk/android/services/persistence/FileStore;

    invoke-interface {v2}, Lio/fabric/sdk/android/services/persistence/FileStore;->getFilesDir()Ljava/io/File;

    move-result-object v2

    .line 5
    new-instance v3, Lio/fabric/sdk/android/services/events/GZIPQueueFileEventStorage;

    iget-object v4, p0, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;->context:Landroid/content/Context;

    const v5, 0x2b7

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x2b8

    invoke-static {v6}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v2, v5, v6}, Lio/fabric/sdk/android/services/events/GZIPQueueFileEventStorage;-><init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance v2, Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;

    iget-object v4, p0, Lcom/crashlytics/android/answers/AnswersFilesManagerProvider;->context:Landroid/content/Context;

    invoke-direct {v2, v4, v0, v1, v3}, Lcom/crashlytics/android/answers/SessionAnalyticsFilesManager;-><init>(Landroid/content/Context;Lcom/crashlytics/android/answers/SessionEventTransform;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;Lio/fabric/sdk/android/services/events/EventsStorage;)V

    return-object v2

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const v1, 0x2b9

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
