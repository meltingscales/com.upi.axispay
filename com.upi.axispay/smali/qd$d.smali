.class public Lqd$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Laa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd;->w(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/animation/Animator;


# direct methods
.method public constructor <init>(Lqd;Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lqd$d;->a:Landroid/animation/Animator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqd$d;->a:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    return-void
.end method