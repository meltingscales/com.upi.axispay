.class public Lic$f;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:Lic;

.field public b:[Le9;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lic;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lic;-><init>(Lic;)V

    invoke-direct {p0, v0}, Lic$f;-><init>(Lic;)V

    return-void
.end method

.method public constructor <init>(Lic;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lic$f;->a:Lic;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lic$f;->b:[Le9;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    .line 2
    invoke-static {v1}, Lic$m;->a(I)I

    move-result v2

    aget-object v0, v0, v2

    .line 3
    iget-object v2, p0, Lic$f;->b:[Le9;

    const/4 v3, 0x2

    invoke-static {v3}, Lic$m;->a(I)I

    move-result v4

    aget-object v2, v2, v4

    if-nez v2, :cond_0

    .line 4
    iget-object v2, p0, Lic$f;->a:Lic;

    invoke-virtual {v2, v3}, Lic;->f(I)Le9;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lic$f;->a:Lic;

    invoke-virtual {v0, v1}, Lic;->f(I)Le9;

    move-result-object v0

    .line 6
    :cond_1
    invoke-static {v0, v2}, Le9;->a(Le9;Le9;)Le9;

    move-result-object v0

    invoke-virtual {p0, v0}, Lic$f;->f(Le9;)V

    .line 7
    iget-object v0, p0, Lic$f;->b:[Le9;

    const/16 v1, 0x10

    invoke-static {v1}, Lic$m;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p0, v0}, Lic$f;->e(Le9;)V

    .line 9
    :cond_2
    iget-object v0, p0, Lic$f;->b:[Le9;

    const/16 v1, 0x20

    invoke-static {v1}, Lic$m;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {p0, v0}, Lic$f;->c(Le9;)V

    .line 11
    :cond_3
    iget-object v0, p0, Lic$f;->b:[Le9;

    const/16 v1, 0x40

    invoke-static {v1}, Lic$m;->a(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {p0, v0}, Lic$f;->g(Le9;)V

    :cond_4
    return-void
.end method

.method public b()Lic;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lic$f;->a()V

    .line 2
    iget-object v0, p0, Lic$f;->a:Lic;

    return-object v0
.end method

.method public c(Le9;)V
    .locals 0

    return-void
.end method

.method public d(Le9;)V
    .locals 0

    return-void
.end method

.method public e(Le9;)V
    .locals 0

    return-void
.end method

.method public f(Le9;)V
    .locals 0

    return-void
.end method

.method public g(Le9;)V
    .locals 0

    return-void
.end method
