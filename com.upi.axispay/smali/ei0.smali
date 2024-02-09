.class public final enum Lei0;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lei0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lei0;

.field public static final enum c:Lei0;

.field public static final enum d:Lei0;

.field public static final synthetic e:[Lei0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lei0;

    const-string v1, "SYNCHRONIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lei0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei0;->b:Lei0;

    .line 2
    new-instance v0, Lei0;

    const-string v1, "PUBLICATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lei0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei0;->c:Lei0;

    .line 3
    new-instance v0, Lei0;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lei0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lei0;->d:Lei0;

    invoke-static {}, Lei0;->a()[Lei0;

    move-result-object v0

    sput-object v0, Lei0;->e:[Lei0;

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

.method public static final synthetic a()[Lei0;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lei0;

    sget-object v1, Lei0;->b:Lei0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lei0;->c:Lei0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lei0;->d:Lei0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lei0;
    .locals 1

    const-class v0, Lei0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lei0;

    return-object p0
.end method

.method public static values()[Lei0;
    .locals 1

    sget-object v0, Lei0;->e:[Lei0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lei0;

    return-object v0
.end method
