.class public Lfn$b;
.super Lcn;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lfn;


# direct methods
.method public constructor <init>(Lfn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcn;-><init>()V

    .line 2
    iput-object p1, p0, Lfn$b;->a:Lfn;

    return-void
.end method


# virtual methods
.method public a(Lbn;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lfn$b;->a:Lfn;

    iget-boolean v0, p1, Lfn;->N:Z

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lbn;->Z()V

    .line 3
    iget-object p1, p0, Lfn$b;->a:Lfn;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lfn;->N:Z

    :cond_0
    return-void
.end method

.method public e(Lbn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lfn$b;->a:Lfn;

    iget v1, v0, Lfn;->M:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lfn;->M:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lfn;->N:Z

    .line 3
    invoke-virtual {v0}, Lbn;->o()V

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Lbn;->O(Lbn$f;)Lbn;

    return-void
.end method
