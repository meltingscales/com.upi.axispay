.class public final enum Lwp;
.super Ljava/lang/Enum;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwp;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lwp;

.field public static final enum c:Lwp;

.field public static final enum d:Lwp;

.field public static final enum e:Lwp;

.field public static final enum f:Lwp;

.field public static final enum g:Lwp;

.field public static final h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lwp;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic i:[Lwp;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lwp;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lwp;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwp;->b:Lwp;

    .line 2
    new-instance v1, Lwp;

    const-string v3, "UNMETERED_ONLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lwp;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lwp;->c:Lwp;

    .line 3
    new-instance v3, Lwp;

    const-string v5, "UNMETERED_OR_DAILY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lwp;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lwp;->d:Lwp;

    .line 4
    new-instance v5, Lwp;

    const-string v7, "FAST_IF_RADIO_AWAKE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lwp;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lwp;->e:Lwp;

    .line 5
    new-instance v7, Lwp;

    const-string v9, "NEVER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lwp;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lwp;->f:Lwp;

    .line 6
    new-instance v9, Lwp;

    const-string v11, "UNRECOGNIZED"

    const/4 v12, 0x5

    const/4 v13, -0x1

    invoke-direct {v9, v11, v12, v13}, Lwp;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lwp;->g:Lwp;

    const/4 v11, 0x6

    new-array v11, v11, [Lwp;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lwp;->i:[Lwp;

    .line 8
    new-instance v11, Landroid/util/SparseArray;

    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    sput-object v11, Lwp;->h:Landroid/util/SparseArray;

    .line 9
    invoke-virtual {v11, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 10
    invoke-virtual {v11, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 11
    invoke-virtual {v11, v6, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 12
    invoke-virtual {v11, v8, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 13
    invoke-virtual {v11, v10, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 14
    invoke-virtual {v11, v13, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

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

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwp;
    .locals 1

    .line 1
    const-class v0, Lwp;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwp;

    return-object p0
.end method

.method public static values()[Lwp;
    .locals 1

    .line 1
    sget-object v0, Lwp;->i:[Lwp;

    invoke-virtual {v0}, [Lwp;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwp;

    return-object v0
.end method