.class public Lic$j;
.super Lic$i;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public o:Le9;

.field public p:Le9;

.field public q:Le9;


# direct methods
.method public constructor <init>(Lic;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lic$i;-><init>(Lic;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lic$j;->o:Le9;

    .line 3
    iput-object p1, p0, Lic$j;->p:Le9;

    .line 4
    iput-object p1, p0, Lic$j;->q:Le9;

    return-void
.end method

.method public constructor <init>(Lic;Lic$j;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lic$i;-><init>(Lic;Lic$i;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lic$j;->o:Le9;

    .line 7
    iput-object p1, p0, Lic$j;->p:Le9;

    .line 8
    iput-object p1, p0, Lic$j;->q:Le9;

    return-void
.end method


# virtual methods
.method public h()Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$j;->p:Le9;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    .line 3
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Le9;->d(Landroid/graphics/Insets;)Le9;

    move-result-object v0

    iput-object v0, p0, Lic$j;->p:Le9;

    .line 4
    :cond_0
    iget-object v0, p0, Lic$j;->p:Le9;

    return-object v0
.end method

.method public j()Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$j;->o:Le9;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Le9;->d(Landroid/graphics/Insets;)Le9;

    move-result-object v0

    iput-object v0, p0, Lic$j;->o:Le9;

    .line 3
    :cond_0
    iget-object v0, p0, Lic$j;->o:Le9;

    return-object v0
.end method

.method public l()Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$j;->q:Le9;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, Le9;->d(Landroid/graphics/Insets;)Le9;

    move-result-object v0

    iput-object v0, p0, Lic$j;->q:Le9;

    .line 3
    :cond_0
    iget-object v0, p0, Lic$j;->q:Le9;

    return-object v0
.end method

.method public m(IIII)Lic;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Lic;->w(Landroid/view/WindowInsets;)Lic;

    move-result-object p1

    return-object p1
.end method

.method public s(Le9;)V
    .locals 0

    return-void
.end method
