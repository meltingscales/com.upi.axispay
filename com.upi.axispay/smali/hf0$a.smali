.class public Lhf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhf0;->D(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lhf0;


# direct methods
.method public constructor <init>(Lhf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhf0$a;->b:Lhf0;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lhf0$a;->b:Lhf0;

    iput p1, v0, Lhf0;->m:I

    .line 2
    invoke-static {v0, p1}, Lhf0;->x(Lhf0;I)V

    return-void
.end method
