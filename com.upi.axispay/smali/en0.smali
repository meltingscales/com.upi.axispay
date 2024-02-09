.class public final enum Len0;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Len0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Len0;

.field public static final enum c:Len0;

.field public static final enum d:Len0;

.field public static final enum e:Len0;

.field public static final synthetic f:[Len0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Len0;

    const-string v1, "PUBLIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Len0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Len0;->b:Len0;

    .line 2
    new-instance v0, Len0;

    const-string v1, "PROTECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Len0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Len0;->c:Len0;

    .line 3
    new-instance v0, Len0;

    const-string v1, "INTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Len0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Len0;->d:Len0;

    .line 4
    new-instance v0, Len0;

    const-string v1, "PRIVATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Len0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Len0;->e:Len0;

    invoke-static {}, Len0;->a()[Len0;

    move-result-object v0

    sput-object v0, Len0;->f:[Len0;

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

.method public static final synthetic a()[Len0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Len0;

    sget-object v1, Len0;->b:Len0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Len0;->c:Len0;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Len0;->d:Len0;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Len0;->e:Len0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Len0;
    .locals 1

    const-class v0, Len0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Len0;

    return-object p0
.end method

.method public static values()[Len0;
    .locals 1

    sget-object v0, Len0;->f:[Len0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Len0;

    return-object v0
.end method
