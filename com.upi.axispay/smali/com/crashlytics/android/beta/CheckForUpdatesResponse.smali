.class public Lcom/crashlytics/android/beta/CheckForUpdatesResponse;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final buildVersion:Ljava/lang/String;

.field public final displayVersion:Ljava/lang/String;

.field public final instanceId:Ljava/lang/String;

.field public final packageName:Ljava/lang/String;

.field public final url:Ljava/lang/String;

.field public final versionString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/crashlytics/android/beta/CheckForUpdatesResponse;->url:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/crashlytics/android/beta/CheckForUpdatesResponse;->versionString:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/crashlytics/android/beta/CheckForUpdatesResponse;->displayVersion:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/crashlytics/android/beta/CheckForUpdatesResponse;->buildVersion:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/crashlytics/android/beta/CheckForUpdatesResponse;->packageName:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/crashlytics/android/beta/CheckForUpdatesResponse;->instanceId:Ljava/lang/String;

    return-void
.end method
