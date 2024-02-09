.class public Lbn$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbn;->R(Landroid/animation/Animator;Lo4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo4;

.field public final synthetic b:Lbn;


# direct methods
.method public constructor <init>(Lbn;Lo4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbn$b;->b:Lbn;

    iput-object p2, p0, Lbn$b;->a:Lo4;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbn$b;->a:Lo4;

    invoke-virtual {v0, p1}, Lu4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lbn$b;->b:Lbn;

    iget-object v0, v0, Lbn;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbn$b;->b:Lbn;

    iget-object v0, v0, Lbn;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
