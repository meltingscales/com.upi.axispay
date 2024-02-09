.class public Lyc0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyc0;->E(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lyc0;


# direct methods
.method public constructor <init>(Lyc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc0$a;->b:Lyc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyc0$a;->b:Lyc0;

    iput p1, v0, Lyc0;->o:I

    .line 2
    iget-object v1, v0, Lyc0;->p:Ljava/util/ArrayList;

    invoke-static {v0, p1, v1}, Lyc0;->x(Lyc0;ILjava/util/ArrayList;)V

    return-void
.end method
