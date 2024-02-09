.class public final Lg0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Li1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final synthetic b:Lg0;


# direct methods
.method public constructor <init>(Lg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0$d;->b:Lg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li1;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Li1;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lg0$d;->b:Lg0;

    iget-object v1, v0, Lg0;->c:Landroid/view/Window$Callback;

    if-eqz v1, :cond_1

    .line 2
    iget-object v0, v0, Lg0;->a:Lu2;

    invoke-interface {v0}, Lu2;->b()Z

    move-result v0

    const/16 v1, 0x6c

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lg0$d;->b:Lg0;

    iget-object v0, v0, Lg0;->c:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lg0$d;->b:Lg0;

    iget-object v0, v0, Lg0;->c:Landroid/view/Window$Callback;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lg0$d;->b:Lg0;

    iget-object v0, v0, Lg0;->c:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    :goto_0
    return-void
.end method
