.class public final enum Lrp$b;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrp$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lrp$b;

.field public static final enum c:Lrp$b;

.field public static final synthetic d:[Lrp$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lrp$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lrp$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lrp$b;->b:Lrp$b;

    .line 2
    new-instance v1, Lrp$b;

    const-string v3, "ANDROID_FIREBASE"

    const/4 v4, 0x1

    const/16 v5, 0x17

    invoke-direct {v1, v3, v4, v5}, Lrp$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lrp$b;->c:Lrp$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lrp$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lrp$b;->d:[Lrp$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lrp$b;
    .locals 1

    .line 1
    const-class v0, Lrp$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrp$b;

    return-object p0
.end method

.method public static values()[Lrp$b;
    .locals 1

    .line 1
    sget-object v0, Lrp$b;->d:[Lrp$b;

    invoke-virtual {v0}, [Lrp$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrp$b;

    return-object v0
.end method
