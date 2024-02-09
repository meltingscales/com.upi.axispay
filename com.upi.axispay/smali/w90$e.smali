.class public Lw90$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw90;->w(Lw90$g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lw90$g;

.field public final synthetic c:Z

.field public final synthetic d:I

.field public final synthetic e:Lw90;


# direct methods
.method public constructor <init>(Lw90;Lw90$g;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw90$e;->e:Lw90;

    iput-object p2, p0, Lw90$e;->b:Lw90$g;

    iput-boolean p3, p0, Lw90$e;->c:Z

    iput p4, p0, Lw90$e;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lw90$e;->b:Lw90$g;

    iget-object p1, p1, Lw90$g;->G:Landroid/widget/Button;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lw90$e;->e:Lw90;

    iget-boolean v0, p0, Lw90$e;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lw90$e;->d:I

    :goto_0
    iput v0, p1, Lw90;->h:I

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->j()V

    return-void
.end method
