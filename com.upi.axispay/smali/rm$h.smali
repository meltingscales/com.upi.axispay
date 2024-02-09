.class public Lrm$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrm;->m(Landroid/view/ViewGroup;Lhn;Lhn;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lrm$k;

.field private mViewBounds:Lrm$k;


# direct methods
.method public constructor <init>(Lrm;Lrm$k;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lrm$h;->a:Lrm$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 2
    iput-object p2, p0, Lrm$h;->mViewBounds:Lrm$k;

    return-void
.end method
