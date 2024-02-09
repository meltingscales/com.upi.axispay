.class public Lcx$f;
.super Leb;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcx;->t(Landroid/view/View;Lhx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lcx;


# direct methods
.method public constructor <init>(Lcx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcx$f;->d:Lcx;

    invoke-direct {p0}, Leb;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Llc;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Leb;->g(Landroid/view/View;Llc;)V

    .line 2
    iget-object p1, p0, Lcx$f;->d:Lcx;

    .line 3
    invoke-static {p1}, Lcx;->q(Lcx;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcx$f;->d:Lcx;

    sget v0, Lqv;->mtrl_picker_toggle_to_year_selection:I

    .line 4
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcx$f;->d:Lcx;

    sget v0, Lqv;->mtrl_picker_toggle_to_day_selection:I

    .line 5
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 6
    :goto_0
    invoke-virtual {p2, p1}, Llc;->l0(Ljava/lang/CharSequence;)V

    return-void
.end method
