.class public Ls1$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ls1;


# direct methods
.method public constructor <init>(Ls1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1$a;->b:Ls1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1$a;->b:Ls1;

    invoke-virtual {v0}, Ls1;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ls1$a;->b:Ls1;

    iget-object v0, v0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->B()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Ls1$a;->b:Ls1;

    iget-object v0, v0, Ls1;->o:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Ls1$a;->b:Ls1;

    iget-object v0, v0, Ls1;->j:Lc3;

    invoke-virtual {v0}, La3;->a()V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Ls1$a;->b:Ls1;

    invoke-virtual {v0}, Ls1;->dismiss()V

    :cond_2
    :goto_1
    return-void
.end method
