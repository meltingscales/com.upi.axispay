.class public Lf1$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf1$c;->e(Li1;Landroid/view/MenuItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lf1$d;

.field public final synthetic c:Landroid/view/MenuItem;

.field public final synthetic d:Li1;

.field public final synthetic e:Lf1$c;


# direct methods
.method public constructor <init>(Lf1$c;Lf1$d;Landroid/view/MenuItem;Li1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf1$c$a;->e:Lf1$c;

    iput-object p2, p0, Lf1$c$a;->b:Lf1$d;

    iput-object p3, p0, Lf1$c$a;->c:Landroid/view/MenuItem;

    iput-object p4, p0, Lf1$c$a;->d:Li1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf1$c$a;->b:Lf1$d;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lf1$c$a;->e:Lf1$c;

    iget-object v1, v1, Lf1$c;->b:Lf1;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lf1;->B:Z

    .line 3
    iget-object v0, v0, Lf1$d;->b:Li1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Li1;->e(Z)V

    .line 4
    iget-object v0, p0, Lf1$c$a;->e:Lf1$c;

    iget-object v0, v0, Lf1$c;->b:Lf1;

    iput-boolean v1, v0, Lf1;->B:Z

    .line 5
    :cond_0
    iget-object v0, p0, Lf1$c$a;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf1$c$a;->c:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lf1$c$a;->d:Li1;

    iget-object v1, p0, Lf1$c$a;->c:Landroid/view/MenuItem;

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Li1;->N(Landroid/view/MenuItem;I)Z

    :cond_1
    return-void
.end method
