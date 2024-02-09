.class public final enum Lm60;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm60;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lm60;

.field public static final enum c:Lm60;

.field public static final enum d:Lm60;

.field public static final enum e:Lm60;

.field public static final enum f:Lm60;

.field public static final enum g:Lm60;

.field public static final synthetic h:[Lm60;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lm60;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm60;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm60;->b:Lm60;

    .line 2
    new-instance v1, Lm60;

    const-string v3, "NONE_SAFE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lm60;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lm60;->c:Lm60;

    .line 3
    new-instance v3, Lm60;

    const-string v5, "IN_SAMPLE_POWER_OF_2"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lm60;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lm60;->d:Lm60;

    .line 4
    new-instance v5, Lm60;

    const-string v7, "IN_SAMPLE_INT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lm60;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lm60;->e:Lm60;

    .line 5
    new-instance v7, Lm60;

    const-string v9, "EXACTLY"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lm60;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lm60;->f:Lm60;

    .line 6
    new-instance v9, Lm60;

    const-string v11, "EXACTLY_STRETCHED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lm60;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lm60;->g:Lm60;

    const/4 v11, 0x6

    new-array v11, v11, [Lm60;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lm60;->h:[Lm60;

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

.method public static valueOf(Ljava/lang/String;)Lm60;
    .locals 1

    .line 1
    const-class v0, Lm60;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm60;

    return-object p0
.end method

.method public static values()[Lm60;
    .locals 1

    .line 1
    sget-object v0, Lm60;->h:[Lm60;

    invoke-virtual {v0}, [Lm60;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm60;

    return-object v0
.end method
