.class public Lke$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke;->m(Lme;Landroid/view/ViewGroup;Landroid/view/View;Lo4;Lke$h;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroidx/fragment/app/Fragment;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Z

.field public final synthetic e:Lo4;

.field public final synthetic f:Landroid/view/View;

.field public final synthetic g:Lme;

.field public final synthetic h:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLo4;Landroid/view/View;Lme;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lke$e;->b:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Lke$e;->c:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Lke$e;->d:Z

    iput-object p4, p0, Lke$e;->e:Lo4;

    iput-object p5, p0, Lke$e;->f:Landroid/view/View;

    iput-object p6, p0, Lke$e;->g:Lme;

    iput-object p7, p0, Lke$e;->h:Landroid/graphics/Rect;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lke$e;->b:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lke$e;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v2, p0, Lke$e;->d:Z

    iget-object v3, p0, Lke$e;->e:Lo4;

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lke;->f(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLo4;Z)V

    .line 2
    iget-object v0, p0, Lke$e;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lke$e;->g:Lme;

    iget-object v2, p0, Lke$e;->h:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Lme;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method
