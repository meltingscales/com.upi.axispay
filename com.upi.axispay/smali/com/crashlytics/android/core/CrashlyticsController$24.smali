.class public Lcom/crashlytics/android/core/CrashlyticsController$24;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/crashlytics/android/core/CrashlyticsController$FileOutputStreamWriteAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/CrashlyticsController;->writeSessionDevice(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/crashlytics/android/core/CrashlyticsController;

.field public final synthetic val$arch:I

.field public final synthetic val$availableProcessors:I

.field public final synthetic val$diskSpace:J

.field public final synthetic val$ids:Ljava/util/Map;

.field public final synthetic val$isEmulator:Z

.field public final synthetic val$state:I

.field public final synthetic val$totalRam:J


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/CrashlyticsController;IIJJZLjava/util/Map;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->this$0:Lcom/crashlytics/android/core/CrashlyticsController;

    iput p2, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$arch:I

    iput p3, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$availableProcessors:I

    iput-wide p4, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$totalRam:J

    iput-wide p6, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$diskSpace:J

    iput-boolean p8, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$isEmulator:Z

    iput-object p9, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$ids:Ljava/util/Map;

    iput p10, p0, Lcom/crashlytics/android/core/CrashlyticsController$24;->val$state:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public writeTo(Ljava/io/FileOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Lcom/crashlytics/android/core/CrashlyticsController$24$1;

    invoke-direct {v1, p0}, Lcom/crashlytics/android/core/CrashlyticsController$24$1;-><init>(Lcom/crashlytics/android/core/CrashlyticsController$24;)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 3
    invoke-virtual {p1, v0}, Ljava/io/FileOutputStream;->write([B)V

    return-void
.end method
