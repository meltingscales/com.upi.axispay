.class public Lre0$m;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre0;->H(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lre0;


# direct methods
.method public constructor <init>(Lre0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lre0$m;->b:Lre0;

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
    iget-object v0, p0, Lre0$m;->b:Lre0;

    iput p1, v0, Lre0;->x:I

    .line 2
    invoke-static {v0, p1}, Lre0;->y(Lre0;I)V

    return-void
.end method
