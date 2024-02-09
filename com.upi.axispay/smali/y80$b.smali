.class public final enum Ly80$b;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly80;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly80$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ly80$b;

.field public static final synthetic c:[Ly80$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly80$b;

    const-string v1, "APP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly80$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly80$b;->b:Ly80$b;

    const/4 v1, 0x1

    new-array v1, v1, [Ly80$b;

    aput-object v0, v1, v2

    .line 2
    sput-object v1, Ly80$b;->c:[Ly80$b;

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

.method public static valueOf(Ljava/lang/String;)Ly80$b;
    .locals 1

    .line 1
    const-class v0, Ly80$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly80$b;

    return-object p0
.end method

.method public static values()[Ly80$b;
    .locals 1

    .line 1
    sget-object v0, Ly80$b;->c:[Ly80$b;

    invoke-virtual {v0}, [Ly80$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly80$b;

    return-object v0
.end method
