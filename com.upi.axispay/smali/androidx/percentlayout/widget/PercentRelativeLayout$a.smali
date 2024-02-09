.class public Landroidx/percentlayout/widget/PercentRelativeLayout$a;
.super Landroid/widget/RelativeLayout$LayoutParams;
.source "AxisPay"

# interfaces
.implements Lri$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/percentlayout/widget/PercentRelativeLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public b:Lri$a;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-static {p1, p2}, Lri;->c(Landroid/content/Context;Landroid/util/AttributeSet;)Lri$a;

    move-result-object p1

    iput-object p1, p0, Landroidx/percentlayout/widget/PercentRelativeLayout$a;->b:Lri$a;

    return-void
.end method


# virtual methods
.method public a()Lri$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentRelativeLayout$a;->b:Lri$a;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lri$a;

    invoke-direct {v0}, Lri$a;-><init>()V

    iput-object v0, p0, Landroidx/percentlayout/widget/PercentRelativeLayout$a;->b:Lri$a;

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/percentlayout/widget/PercentRelativeLayout$a;->b:Lri$a;

    return-object v0
.end method

.method public setBaseAttributes(Landroid/content/res/TypedArray;II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lri;->b(Landroid/view/ViewGroup$LayoutParams;Landroid/content/res/TypedArray;II)V

    return-void
.end method
