.class public final enum Ld7$g;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld7$g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ld7$g;

.field public static final enum c:Ld7$g;

.field public static final enum d:Ld7$g;

.field public static final enum e:Ld7$g;

.field public static final synthetic f:[Ld7$g;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ld7$g;

    const-string v1, "UNDEFINED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld7$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld7$g;->b:Ld7$g;

    .line 2
    new-instance v1, Ld7$g;

    const-string v3, "SETUP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ld7$g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld7$g;->c:Ld7$g;

    .line 3
    new-instance v3, Ld7$g;

    const-string v5, "MOVING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ld7$g;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ld7$g;->d:Ld7$g;

    .line 4
    new-instance v5, Ld7$g;

    const-string v7, "FINISHED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ld7$g;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ld7$g;->e:Ld7$g;

    const/4 v7, 0x4

    new-array v7, v7, [Ld7$g;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Ld7$g;->f:[Ld7$g;

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

.method public static valueOf(Ljava/lang/String;)Ld7$g;
    .locals 1

    .line 1
    const-class v0, Ld7$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld7$g;

    return-object p0
.end method

.method public static values()[Ld7$g;
    .locals 1

    .line 1
    sget-object v0, Ld7$g;->f:[Ld7$g;

    invoke-virtual {v0}, [Ld7$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld7$g;

    return-object v0
.end method
