.class public Lcom/crashlytics/android/core/CrashlyticsController$25;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/crashlytics/android/core/CrashlyticsController$CodedOutputStreamWriteAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/CrashlyticsController;->writeSessionUser(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/crashlytics/android/core/CrashlyticsController;

.field public final synthetic val$userMetaData:Lcom/crashlytics/android/core/UserMetaData;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/CrashlyticsController;Lcom/crashlytics/android/core/UserMetaData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashlyticsController$25;->this$0:Lcom/crashlytics/android/core/CrashlyticsController;

    iput-object p2, p0, Lcom/crashlytics/android/core/CrashlyticsController$25;->val$userMetaData:Lcom/crashlytics/android/core/UserMetaData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public writeTo(Lcom/crashlytics/android/core/CodedOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/crashlytics/android/core/CrashlyticsController$25;->val$userMetaData:Lcom/crashlytics/android/core/UserMetaData;

    iget-object v1, v0, Lcom/crashlytics/android/core/UserMetaData;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/crashlytics/android/core/UserMetaData;->name:Ljava/lang/String;

    iget-object v0, v0, Lcom/crashlytics/android/core/UserMetaData;->email:Ljava/lang/String;

    invoke-static {p1, v1, v2, v0}, Lcom/crashlytics/android/core/SessionProtobufHelper;->writeSessionUser(Lcom/crashlytics/android/core/CodedOutputStream;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
