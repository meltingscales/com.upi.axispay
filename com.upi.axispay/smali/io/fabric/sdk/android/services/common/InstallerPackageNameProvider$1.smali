.class public Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lio/fabric/sdk/android/services/cache/ValueLoader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/fabric/sdk/android/services/cache/ValueLoader<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;


# direct methods
.method public constructor <init>(Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;->this$0:Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic load(Landroid/content/Context;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/fabric/sdk/android/services/common/InstallerPackageNameProvider$1;->load(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public load(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const p1, 0x2b32

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method