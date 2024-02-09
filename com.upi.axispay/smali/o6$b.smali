.class public final enum Lo6$b;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo6$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lo6$b;

.field public static final enum c:Lo6$b;

.field public static final enum d:Lo6$b;

.field public static final enum e:Lo6$b;

.field public static final synthetic f:[Lo6$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lo6$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo6$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo6$b;->b:Lo6$b;

    new-instance v1, Lo6$b;

    const-string v3, "START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo6$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo6$b;->c:Lo6$b;

    new-instance v3, Lo6$b;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo6$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo6$b;->d:Lo6$b;

    new-instance v5, Lo6$b;

    const-string v7, "CENTER"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lo6$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo6$b;->e:Lo6$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lo6$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lo6$b;->f:[Lo6$b;

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

.method public static valueOf(Ljava/lang/String;)Lo6$b;
    .locals 1

    .line 1
    const-class v0, Lo6$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo6$b;

    return-object p0
.end method

.method public static values()[Lo6$b;
    .locals 1

    .line 1
    sget-object v0, Lo6$b;->f:[Lo6$b;

    invoke-virtual {v0}, [Lo6$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo6$b;

    return-object v0
.end method
