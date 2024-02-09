.class public final enum Ly20;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly20;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ly20;

.field public static final enum c:Ly20;

.field public static final enum d:Ly20;

.field public static final enum e:Ly20;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum f:Ly20;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum g:Ly20;

.field public static final enum h:Ly20;

.field public static final enum i:Ly20;

.field public static final enum j:Ly20;

.field public static final enum k:Ly20;

.field public static final enum l:Ly20;

.field public static final enum m:Ly20;

.field public static final enum n:Ly20;

.field public static final synthetic o:[Ly20;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Ly20;

    const-string v1, "ERROR_CORRECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly20;->b:Ly20;

    .line 2
    new-instance v1, Ly20;

    const-string v3, "CHARACTER_SET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly20;->c:Ly20;

    .line 3
    new-instance v3, Ly20;

    const-string v5, "DATA_MATRIX_SHAPE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly20;->d:Ly20;

    .line 4
    new-instance v5, Ly20;

    const-string v7, "MIN_SIZE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ly20;->e:Ly20;

    .line 5
    new-instance v7, Ly20;

    const-string v9, "MAX_SIZE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ly20;->f:Ly20;

    .line 6
    new-instance v9, Ly20;

    const-string v11, "MARGIN"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ly20;->g:Ly20;

    .line 7
    new-instance v11, Ly20;

    const-string v13, "PDF417_COMPACT"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ly20;->h:Ly20;

    .line 8
    new-instance v13, Ly20;

    const-string v15, "PDF417_COMPACTION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ly20;->i:Ly20;

    .line 9
    new-instance v15, Ly20;

    const-string v14, "PDF417_DIMENSIONS"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v15, Ly20;->j:Ly20;

    .line 10
    new-instance v14, Ly20;

    const-string v12, "AZTEC_LAYERS"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ly20;->k:Ly20;

    .line 11
    new-instance v12, Ly20;

    const-string v10, "QR_VERSION"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v12, Ly20;->l:Ly20;

    .line 12
    new-instance v10, Ly20;

    const-string v8, "QR_MASK_PATTERN"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v10, Ly20;->m:Ly20;

    .line 13
    new-instance v8, Ly20;

    const-string v6, "GS1_FORMAT"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, Ly20;-><init>(Ljava/lang/String;I)V

    sput-object v8, Ly20;->n:Ly20;

    const/16 v6, 0xd

    new-array v6, v6, [Ly20;

    aput-object v0, v6, v2

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v7, v6, v0

    const/4 v0, 0x5

    aput-object v9, v6, v0

    const/4 v0, 0x6

    aput-object v11, v6, v0

    const/4 v0, 0x7

    aput-object v13, v6, v0

    const/16 v0, 0x8

    aput-object v15, v6, v0

    const/16 v0, 0x9

    aput-object v14, v6, v0

    const/16 v0, 0xa

    aput-object v12, v6, v0

    const/16 v0, 0xb

    aput-object v10, v6, v0

    aput-object v8, v6, v4

    .line 14
    sput-object v6, Ly20;->o:[Ly20;

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

.method public static valueOf(Ljava/lang/String;)Ly20;
    .locals 1

    .line 1
    const-class v0, Ly20;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly20;

    return-object p0
.end method

.method public static values()[Ly20;
    .locals 1

    .line 1
    sget-object v0, Ly20;->o:[Ly20;

    invoke-virtual {v0}, [Ly20;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly20;

    return-object v0
.end method
