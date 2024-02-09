.class public Lne0$h;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lne0;->D(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lne0;


# direct methods
.method public constructor <init>(Lne0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lne0$h;->b:Lne0;

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
    iget-object v0, p0, Lne0$h;->b:Lne0;

    iput p1, v0, Lne0;->l:I

    .line 2
    invoke-static {v0}, Lne0;->y(Lne0;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lne0;->z(Lne0;ILjava/util/ArrayList;)V

    return-void
.end method
