.class public final enum Lio/fabric/sdk/android/services/network/HttpMethod;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/fabric/sdk/android/services/network/HttpMethod;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/fabric/sdk/android/services/network/HttpMethod;

.field public static final enum DELETE:Lio/fabric/sdk/android/services/network/HttpMethod;

.field public static final enum GET:Lio/fabric/sdk/android/services/network/HttpMethod;

.field public static final enum POST:Lio/fabric/sdk/android/services/network/HttpMethod;

.field public static final enum PUT:Lio/fabric/sdk/android/services/network/HttpMethod;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lio/fabric/sdk/android/services/network/HttpMethod;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/fabric/sdk/android/services/network/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/fabric/sdk/android/services/network/HttpMethod;->GET:Lio/fabric/sdk/android/services/network/HttpMethod;

    .line 2
    new-instance v1, Lio/fabric/sdk/android/services/network/HttpMethod;

    const-string v3, "POST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/fabric/sdk/android/services/network/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/fabric/sdk/android/services/network/HttpMethod;->POST:Lio/fabric/sdk/android/services/network/HttpMethod;

    .line 3
    new-instance v3, Lio/fabric/sdk/android/services/network/HttpMethod;

    const-string v5, "PUT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/fabric/sdk/android/services/network/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/fabric/sdk/android/services/network/HttpMethod;->PUT:Lio/fabric/sdk/android/services/network/HttpMethod;

    .line 4
    new-instance v5, Lio/fabric/sdk/android/services/network/HttpMethod;

    const-string v7, "DELETE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lio/fabric/sdk/android/services/network/HttpMethod;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lio/fabric/sdk/android/services/network/HttpMethod;->DELETE:Lio/fabric/sdk/android/services/network/HttpMethod;

    const/4 v7, 0x4

    new-array v7, v7, [Lio/fabric/sdk/android/services/network/HttpMethod;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lio/fabric/sdk/android/services/network/HttpMethod;->$VALUES:[Lio/fabric/sdk/android/services/network/HttpMethod;

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

.method public static valueOf(Ljava/lang/String;)Lio/fabric/sdk/android/services/network/HttpMethod;
    .locals 1

    .line 1
    const-class v0, Lio/fabric/sdk/android/services/network/HttpMethod;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/fabric/sdk/android/services/network/HttpMethod;

    return-object p0
.end method

.method public static values()[Lio/fabric/sdk/android/services/network/HttpMethod;
    .locals 1

    .line 1
    sget-object v0, Lio/fabric/sdk/android/services/network/HttpMethod;->$VALUES:[Lio/fabric/sdk/android/services/network/HttpMethod;

    invoke-virtual {v0}, [Lio/fabric/sdk/android/services/network/HttpMethod;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/fabric/sdk/android/services/network/HttpMethod;

    return-object v0
.end method
