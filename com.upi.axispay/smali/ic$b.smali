.class public final Lic$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lic$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lic$e;

    invoke-direct {v0}, Lic$e;-><init>()V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Lic$d;

    invoke-direct {v0}, Lic$d;-><init>()V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Lic$c;

    invoke-direct {v0}, Lic$c;-><init>()V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Lic$f;

    invoke-direct {v0}, Lic$f;-><init>()V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lic;)V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 9
    new-instance v0, Lic$e;

    invoke-direct {v0, p1}, Lic$e;-><init>(Lic;)V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 10
    new-instance v0, Lic$d;

    invoke-direct {v0, p1}, Lic$d;-><init>(Lic;)V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    .line 11
    new-instance v0, Lic$c;

    invoke-direct {v0, p1}, Lic$c;-><init>(Lic;)V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    goto :goto_0

    .line 12
    :cond_2
    new-instance v0, Lic$f;

    invoke-direct {v0, p1}, Lic$f;-><init>(Lic;)V

    iput-object v0, p0, Lic$b;->a:Lic$f;

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Lic;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$b;->a:Lic$f;

    invoke-virtual {v0}, Lic$f;->b()Lic;

    move-result-object v0

    return-object v0
.end method

.method public b(Le9;)Lic$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic$b;->a:Lic$f;

    invoke-virtual {v0, p1}, Lic$f;->d(Le9;)V

    return-object p0
.end method

.method public c(Le9;)Lic$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lic$b;->a:Lic$f;

    invoke-virtual {v0, p1}, Lic$f;->f(Le9;)V

    return-object p0
.end method
