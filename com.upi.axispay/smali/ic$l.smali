.class public Lic$l;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "l"
.end annotation


# static fields
.field public static final b:Lic;


# instance fields
.field public final a:Lic;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lic$b;

    invoke-direct {v0}, Lic$b;-><init>()V

    .line 2
    invoke-virtual {v0}, Lic$b;->a()Lic;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lic;->a()Lic;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lic;->b()Lic;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lic;->c()Lic;

    move-result-object v0

    sput-object v0, Lic$l;->b:Lic;

    return-void
.end method

.method public constructor <init>(Lic;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lic$l;->a:Lic;

    return-void
.end method


# virtual methods
.method public a()Lic;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$l;->a:Lic;

    return-object v0
.end method

.method public b()Lic;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$l;->a:Lic;

    return-object v0
.end method

.method public c()Lic;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$l;->a:Lic;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(Lic;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lic$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Lic$l;

    .line 3
    invoke-virtual {p0}, Lic$l;->o()Z

    move-result v1

    invoke-virtual {p1}, Lic$l;->o()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 4
    invoke-virtual {p0}, Lic$l;->n()Z

    move-result v1

    invoke-virtual {p1}, Lic$l;->n()Z

    move-result v3

    if-ne v1, v3, :cond_2

    .line 5
    invoke-virtual {p0}, Lic$l;->k()Le9;

    move-result-object v1

    invoke-virtual {p1}, Lic$l;->k()Le9;

    move-result-object v3

    invoke-static {v1, v3}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p0}, Lic$l;->i()Le9;

    move-result-object v1

    invoke-virtual {p1}, Lic$l;->i()Le9;

    move-result-object v3

    invoke-static {v1, v3}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p0}, Lic$l;->f()Lhb;

    move-result-object v1

    invoke-virtual {p1}, Lic$l;->f()Lhb;

    move-result-object p1

    invoke-static {v1, p1}, Lya;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f()Lhb;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(I)Le9;
    .locals 0

    .line 1
    sget-object p1, Le9;->e:Le9;

    return-object p1
.end method

.method public h()Le9;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lic$l;->k()Le9;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Lic$l;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lic$l;->n()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lic$l;->k()Le9;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 2
    invoke-virtual {p0}, Lic$l;->i()Le9;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Lic$l;->f()Lhb;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 3
    invoke-static {v0}, Lya;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Le9;
    .locals 1

    .line 1
    sget-object v0, Le9;->e:Le9;

    return-object v0
.end method

.method public j()Le9;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lic$l;->k()Le9;

    move-result-object v0

    return-object v0
.end method

.method public k()Le9;
    .locals 1

    .line 1
    sget-object v0, Le9;->e:Le9;

    return-object v0
.end method

.method public l()Le9;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lic$l;->k()Le9;

    move-result-object v0

    return-object v0
.end method

.method public m(IIII)Lic;
    .locals 0

    .line 1
    sget-object p1, Lic$l;->b:Lic;

    return-object p1
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p([Le9;)V
    .locals 0

    return-void
.end method

.method public q(Le9;)V
    .locals 0

    return-void
.end method

.method public r(Lic;)V
    .locals 0

    return-void
.end method

.method public s(Le9;)V
    .locals 0

    return-void
.end method
