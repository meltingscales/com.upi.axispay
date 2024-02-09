.class public final enum Li7$b;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li7$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Li7$b;

.field public static final enum c:Li7$b;

.field public static final enum d:Li7$b;

.field public static final enum e:Li7$b;

.field public static final enum f:Li7$b;

.field public static final enum g:Li7$b;

.field public static final enum h:Li7$b;

.field public static final enum i:Li7$b;

.field public static final synthetic j:[Li7$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Li7$b;

    const-string v1, "INT_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li7$b;->b:Li7$b;

    .line 2
    new-instance v1, Li7$b;

    const-string v3, "FLOAT_TYPE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Li7$b;->c:Li7$b;

    .line 3
    new-instance v3, Li7$b;

    const-string v5, "COLOR_TYPE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Li7$b;->d:Li7$b;

    .line 4
    new-instance v5, Li7$b;

    const-string v7, "COLOR_DRAWABLE_TYPE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Li7$b;->e:Li7$b;

    .line 5
    new-instance v7, Li7$b;

    const-string v9, "STRING_TYPE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Li7$b;->f:Li7$b;

    .line 6
    new-instance v9, Li7$b;

    const-string v11, "BOOLEAN_TYPE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Li7$b;->g:Li7$b;

    .line 7
    new-instance v11, Li7$b;

    const-string v13, "DIMENSION_TYPE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Li7$b;->h:Li7$b;

    .line 8
    new-instance v13, Li7$b;

    const-string v15, "REFERENCE_TYPE"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Li7$b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Li7$b;->i:Li7$b;

    const/16 v15, 0x8

    new-array v15, v15, [Li7$b;

    aput-object v0, v15, v2

    aput-object v1, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    aput-object v9, v15, v12

    const/4 v0, 0x6

    aput-object v11, v15, v0

    aput-object v13, v15, v14

    .line 9
    sput-object v15, Li7$b;->j:[Li7$b;

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

.method public static valueOf(Ljava/lang/String;)Li7$b;
    .locals 1

    .line 1
    const-class v0, Li7$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li7$b;

    return-object p0
.end method

.method public static values()[Li7$b;
    .locals 1

    .line 1
    sget-object v0, Li7$b;->j:[Li7$b;

    invoke-virtual {v0}, [Li7$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li7$b;

    return-object v0
.end method
