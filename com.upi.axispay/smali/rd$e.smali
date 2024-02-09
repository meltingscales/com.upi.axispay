.class public Lrd$e;
.super Lud;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd;->createFragmentContainer()Lud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lud;

.field public final synthetic b:Lrd;


# direct methods
.method public constructor <init>(Lrd;Lud;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrd$e;->b:Lrd;

    iput-object p2, p0, Lrd$e;->a:Lud;

    invoke-direct {p0}, Lud;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lrd$e;->a:Lud;

    invoke-virtual {v0}, Lud;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lrd$e;->a:Lud;

    invoke-virtual {v0, p1}, Lud;->d(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lrd$e;->b:Lrd;

    invoke-virtual {v0, p1}, Lrd;->onFindViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrd$e;->a:Lud;

    invoke-virtual {v0}, Lud;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lrd$e;->b:Lrd;

    invoke-virtual {v0}, Lrd;->onHasView()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
