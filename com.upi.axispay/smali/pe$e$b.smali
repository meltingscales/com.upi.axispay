.class public final enum Lpe$e$b;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpe$e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lpe$e$b;

.field public static final enum c:Lpe$e$b;

.field public static final enum d:Lpe$e$b;

.field public static final synthetic e:[Lpe$e$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lpe$e$b;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpe$e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpe$e$b;->b:Lpe$e$b;

    .line 2
    new-instance v1, Lpe$e$b;

    const-string v3, "ADDING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lpe$e$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lpe$e$b;->c:Lpe$e$b;

    .line 3
    new-instance v3, Lpe$e$b;

    const-string v5, "REMOVING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lpe$e$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lpe$e$b;->d:Lpe$e$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lpe$e$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lpe$e$b;->e:[Lpe$e$b;

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

.method public static valueOf(Ljava/lang/String;)Lpe$e$b;
    .locals 1

    .line 1
    const-class v0, Lpe$e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpe$e$b;

    return-object p0
.end method

.method public static values()[Lpe$e$b;
    .locals 1

    .line 1
    sget-object v0, Lpe$e$b;->e:[Lpe$e$b;

    invoke-virtual {v0}, [Lpe$e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpe$e$b;

    return-object v0
.end method
