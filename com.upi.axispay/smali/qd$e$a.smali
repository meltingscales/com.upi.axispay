.class public Lqd$e$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd$e;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lqd$e;


# direct methods
.method public constructor <init>(Lqd$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqd$e$a;->b:Lqd$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqd$e$a;->b:Lqd$e;

    iget-object v1, v0, Lqd$e;->a:Landroid/view/ViewGroup;

    iget-object v0, v0, Lqd$e;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lqd$e$a;->b:Lqd$e;

    iget-object v0, v0, Lqd$e;->c:Lqd$k;

    invoke-virtual {v0}, Lqd$l;->a()V

    return-void
.end method
