.class public final enum Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fabric/sdk/android/services/common/CommonUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Architecture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field public static final enum X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

.field private static final matcher:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v1, "X86_32"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_32:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 2
    new-instance v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v3, "X86_64"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->X86_64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 3
    new-instance v3, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v5, "ARM_UNKNOWN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM_UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 4
    new-instance v5, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v7, "PPC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 5
    new-instance v7, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v9, "PPC64"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->PPC64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 6
    new-instance v9, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v11, "ARMV6"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV6:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 7
    new-instance v11, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v13, "ARMV7"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 8
    new-instance v13, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v15, "UNKNOWN"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 9
    new-instance v15, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v14, "ARMV7S"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARMV7S:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 10
    new-instance v14, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const-string v12, "ARM64"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->ARM64:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    const/16 v12, 0xa

    new-array v12, v12, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    const/4 v1, 0x4

    aput-object v7, v12, v1

    const/4 v2, 0x5

    aput-object v9, v12, v2

    const/4 v2, 0x6

    aput-object v11, v12, v2

    const/4 v2, 0x7

    aput-object v13, v12, v2

    const/16 v2, 0x8

    aput-object v15, v12, v2

    aput-object v14, v12, v10

    .line 11
    sput-object v12, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->$VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    .line 12
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v2, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    const-string v1, "armeabi-v7a"

    .line 13
    invoke-interface {v2, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "armeabi"

    .line 14
    invoke-interface {v2, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "arm64-v8a"

    .line 15
    invoke-interface {v2, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "x86"

    .line 16
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getValue()Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 3

    .line 1
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    invoke-interface {v0, v1, v2}, Lio/fabric/sdk/android/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object v0

    .line 5
    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v1, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->matcher:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    if-nez v0, :cond_1

    .line 7
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->UNKNOWN:Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 1

    .line 1
    const-class v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object p0
.end method

.method public static values()[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;
    .locals 1

    .line 1
    sget-object v0, Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->$VALUES:[Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    invoke-virtual {v0}, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/fabric/sdk/android/services/common/CommonUtils$Architecture;

    return-object v0
.end method
