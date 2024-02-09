.class public Lj0$b;
.super Lgc;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lj0;


# direct methods
.method public constructor <init>(Lj0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj0$b;->a:Lj0;

    invoke-direct {p0}, Lgc;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lj0$b;->a:Lj0;

    const/4 v0, 0x0

    iput-object v0, p1, Lj0;->v:La1;

    .line 2
    iget-object p1, p1, Lj0;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
