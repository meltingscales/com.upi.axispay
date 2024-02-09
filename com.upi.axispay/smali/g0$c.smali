.class public final Lg0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lo1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public b:Z

.field public final synthetic c:Lg0;


# direct methods
.method public constructor <init>(Lg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0$c;->c:Lg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Li1;Z)V
    .locals 1

    .line 1
    iget-boolean p2, p0, Lg0$c;->b:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    .line 2
    iput-boolean p2, p0, Lg0$c;->b:Z

    .line 3
    iget-object p2, p0, Lg0$c;->c:Lg0;

    iget-object p2, p2, Lg0;->a:Lu2;

    invoke-interface {p2}, Lu2;->h()V

    .line 4
    iget-object p2, p0, Lg0$c;->c:Lg0;

    iget-object p2, p2, Lg0;->c:Landroid/view/Window$Callback;

    if-eqz p2, :cond_1

    const/16 v0, 0x6c

    .line 5
    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lg0$c;->b:Z

    return-void
.end method

.method public c(Li1;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lg0$c;->c:Lg0;

    iget-object v0, v0, Lg0;->c:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    .line 2
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
