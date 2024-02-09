.class public Lsm$a;
.super Lcn;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsm;->i0(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public constructor <init>(Lsm;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lsm$a;->a:Landroid/view/View;

    invoke-direct {p0}, Lcn;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lbn;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lsm$a;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lrn;->g(Landroid/view/View;F)V

    .line 2
    iget-object v0, p0, Lsm$a;->a:Landroid/view/View;

    invoke-static {v0}, Lrn;->a(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1, p0}, Lbn;->O(Lbn$f;)Lbn;

    return-void
.end method
