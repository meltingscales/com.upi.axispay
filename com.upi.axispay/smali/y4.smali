.class public Ly4;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Lb5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5<",
            "Lx4;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lb5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5<",
            "Lx4;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lb5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb5<",
            "Le5;",
            ">;"
        }
    .end annotation
.end field

.field public d:[Le5;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc5;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lc5;-><init>(I)V

    iput-object v0, p0, Ly4;->a:Lb5;

    .line 3
    new-instance v0, Lc5;

    invoke-direct {v0, v1}, Lc5;-><init>(I)V

    iput-object v0, p0, Ly4;->b:Lb5;

    .line 4
    new-instance v0, Lc5;

    invoke-direct {v0, v1}, Lc5;-><init>(I)V

    iput-object v0, p0, Ly4;->c:Lb5;

    const/16 v0, 0x20

    new-array v0, v0, [Le5;

    .line 5
    iput-object v0, p0, Ly4;->d:[Le5;

    return-void
.end method
