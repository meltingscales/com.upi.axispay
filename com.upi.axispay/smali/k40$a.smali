.class public final enum Lk40$a;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk40$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lk40$a;

.field public static final enum c:Lk40$a;

.field public static final enum d:Lk40$a;

.field public static final enum e:Lk40$a;

.field public static final synthetic f:[Lk40$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lk40$a;

    const-string v1, "UNCODABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk40$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk40$a;->b:Lk40$a;

    .line 2
    new-instance v1, Lk40$a;

    const-string v3, "ONE_DIGIT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk40$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk40$a;->c:Lk40$a;

    .line 3
    new-instance v3, Lk40$a;

    const-string v5, "TWO_DIGITS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk40$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk40$a;->d:Lk40$a;

    .line 4
    new-instance v5, Lk40$a;

    const-string v7, "FNC_1"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lk40$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lk40$a;->e:Lk40$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lk40$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lk40$a;->f:[Lk40$a;

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

.method public static valueOf(Ljava/lang/String;)Lk40$a;
    .locals 1

    .line 1
    const-class v0, Lk40$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk40$a;

    return-object p0
.end method

.method public static values()[Lk40$a;
    .locals 1

    .line 1
    sget-object v0, Lk40$a;->f:[Lk40$a;

    invoke-virtual {v0}, [Lk40$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk40$a;

    return-object v0
.end method
