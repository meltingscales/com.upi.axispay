.class public final enum Ln80$e;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln80$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Ln80$e;

.field public static final enum d:Ln80$e;

.field public static final enum e:Ln80$e;

.field public static final synthetic f:[Ln80$e;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ln80$e;

    const-string v1, "MEMORY"

    const/4 v2, 0x0

    const v3, -0xff0100

    invoke-direct {v0, v1, v2, v3}, Ln80$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ln80$e;->c:Ln80$e;

    .line 2
    new-instance v1, Ln80$e;

    const-string v3, "DISK"

    const/4 v4, 0x1

    const v5, -0xffff01

    invoke-direct {v1, v3, v4, v5}, Ln80$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, Ln80$e;->d:Ln80$e;

    .line 3
    new-instance v3, Ln80$e;

    const-string v5, "NETWORK"

    const/4 v6, 0x2

    const/high16 v7, -0x10000

    invoke-direct {v3, v5, v6, v7}, Ln80$e;-><init>(Ljava/lang/String;II)V

    sput-object v3, Ln80$e;->e:Ln80$e;

    const/4 v5, 0x3

    new-array v5, v5, [Ln80$e;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Ln80$e;->f:[Ln80$e;

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

    .line 2
    iput p3, p0, Ln80$e;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ln80$e;
    .locals 1

    .line 1
    const-class v0, Ln80$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln80$e;

    return-object p0
.end method

.method public static values()[Ln80$e;
    .locals 1

    .line 1
    sget-object v0, Ln80$e;->f:[Ln80$e;

    invoke-virtual {v0}, [Ln80$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln80$e;

    return-object v0
.end method
