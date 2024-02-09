.class public final enum Lws$c;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lws;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lws$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lws$c;

.field public static final enum c:Lws$c;

.field public static final enum d:Lws$c;

.field public static final synthetic e:[Lws$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lws$c;

    const-string v1, "NETWORK_UNMETERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lws$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lws$c;->b:Lws$c;

    .line 2
    new-instance v1, Lws$c;

    const-string v3, "DEVICE_IDLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lws$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lws$c;->c:Lws$c;

    .line 3
    new-instance v3, Lws$c;

    const-string v5, "DEVICE_CHARGING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lws$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lws$c;->d:Lws$c;

    const/4 v5, 0x3

    new-array v5, v5, [Lws$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lws$c;->e:[Lws$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
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

.method public static valueOf(Ljava/lang/String;)Lws$c;
    .locals 1

    .line 1
    const-class v0, Lws$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lws$c;

    return-object p0
.end method

.method public static values()[Lws$c;
    .locals 1

    .line 1
    sget-object v0, Lws$c;->e:[Lws$c;

    invoke-virtual {v0}, [Lws$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lws$c;

    return-object v0
.end method
