.class public final enum Ln80$f;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln80$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ln80$f;

.field public static final enum c:Ln80$f;

.field public static final enum d:Ln80$f;

.field public static final synthetic e:[Ln80$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ln80$f;

    const-string v1, "LOW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln80$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln80$f;->b:Ln80$f;

    .line 2
    new-instance v1, Ln80$f;

    const-string v3, "NORMAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ln80$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ln80$f;->c:Ln80$f;

    .line 3
    new-instance v3, Ln80$f;

    const-string v5, "HIGH"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ln80$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ln80$f;->d:Ln80$f;

    const/4 v5, 0x3

    new-array v5, v5, [Ln80$f;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Ln80$f;->e:[Ln80$f;

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

.method public static valueOf(Ljava/lang/String;)Ln80$f;
    .locals 1

    .line 1
    const-class v0, Ln80$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln80$f;

    return-object p0
.end method

.method public static values()[Ln80$f;
    .locals 1

    .line 1
    sget-object v0, Ln80$f;->e:[Ln80$f;

    invoke-virtual {v0}, [Ln80$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln80$f;

    return-object v0
.end method
