.class public Lzd$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lge;

.field public final synthetic c:Lzd;


# direct methods
.method public constructor <init>(Lzd;Lge;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd$a;->c:Lzd;

    iput-object p2, p0, Lzd$a;->b:Lge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lzd$a;->b:Lge;

    invoke-virtual {p1}, Lge;->k()Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lzd$a;->b:Lge;

    invoke-virtual {v0}, Lge;->m()V

    .line 3
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lzd$a;->c:Lzd;

    iget-object v0, v0, Lzd;->b:Landroidx/fragment/app/FragmentManager;

    invoke-static {p1, v0}, Lpe;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Lpe;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lpe;->j()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
