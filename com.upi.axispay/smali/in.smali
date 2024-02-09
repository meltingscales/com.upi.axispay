.class public Lin;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Lo4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo4<",
            "Landroid/view/View;",
            "Lhn;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lr4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr4<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lo4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo4<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lo4;

    invoke-direct {v0}, Lo4;-><init>()V

    iput-object v0, p0, Lin;->a:Lo4;

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lin;->b:Landroid/util/SparseArray;

    .line 4
    new-instance v0, Lr4;

    invoke-direct {v0}, Lr4;-><init>()V

    iput-object v0, p0, Lin;->c:Lr4;

    .line 5
    new-instance v0, Lo4;

    invoke-direct {v0}, Lo4;-><init>()V

    iput-object v0, p0, Lin;->d:Lo4;

    return-void
.end method
