.class public Lpe$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpe;->a(Lpe$e$c;Lpe$e$b;Lge;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lpe$d;

.field public final synthetic c:Lpe;


# direct methods
.method public constructor <init>(Lpe;Lpe$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpe$a;->c:Lpe;

    iput-object p2, p0, Lpe$a;->b:Lpe$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lpe$a;->c:Lpe;

    iget-object v0, v0, Lpe;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lpe$a;->b:Lpe$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lpe$a;->b:Lpe$d;

    invoke-virtual {v0}, Lpe$e;->e()Lpe$e$c;

    move-result-object v0

    iget-object v1, p0, Lpe$a;->b:Lpe$d;

    invoke-virtual {v1}, Lpe$e;->f()Landroidx/fragment/app/Fragment;

    move-result-object v1

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v0, v1}, Lpe$e$c;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
