.class public Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/crashlytics/android/core/CrashPromptDialog$AlwaysSendCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;->canSendReports()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;


# direct methods
.method public constructor <init>(Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck$1;->this$0:Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public sendUserReportsWithoutPrompting(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck$1;->this$0:Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;

    invoke-static {v0}, Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;->access$2100(Lcom/crashlytics/android/core/CrashlyticsController$PrivacyDialogCheck;)Lcom/crashlytics/android/core/PreferenceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/crashlytics/android/core/PreferenceManager;->setShouldAlwaysSendReports(Z)V

    return-void
.end method
