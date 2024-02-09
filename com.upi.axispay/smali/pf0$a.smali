.class public Lpf0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lpf0;


# direct methods
.method public constructor <init>(Lpf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpf0$a;->a:Lpf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 5

    const p1, 0x7f0a01f7

    const v0, 0x7f060193

    const v1, 0x7f060030

    const v2, 0x7f080092

    const v3, 0x7f08006b

    const v4, 0x7f0a0101

    if-ne p2, v4, :cond_0

    .line 1
    invoke-static {}, Lsf0;->y()Lsf0;

    move-result-object p2

    .line 2
    iget-object v4, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v4}, Lpf0;->x(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 3
    iget-object v3, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v3}, Lpf0;->y(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 4
    iget-object v2, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v2}, Lpf0;->x(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v2

    iget-object v3, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 5
    iget-object v1, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v1}, Lpf0;->y(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v1

    iget-object v2, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 6
    iget-object v0, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object v0

    .line 7
    iget-object v1, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v1, p2}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 8
    invoke-virtual {v0, p1, p2}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 9
    invoke-virtual {v0}, Lje;->k()I

    goto :goto_0

    :cond_0
    const v4, 0x7f0a00e5

    if-ne p2, v4, :cond_1

    .line 10
    invoke-static {}, Lve0;->y()Lve0;

    move-result-object p2

    .line 11
    iget-object v4, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v4}, Lpf0;->y(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 12
    iget-object v3, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v3}, Lpf0;->y(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v3

    iget-object v4, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 13
    iget-object v1, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v1}, Lpf0;->x(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/RadioButton;->setBackgroundResource(I)V

    .line 14
    iget-object v1, p0, Lpf0$a;->a:Lpf0;

    invoke-static {v1}, Lpf0;->x(Lpf0;)Landroid/widget/RadioButton;

    move-result-object v1

    iget-object v2, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 15
    iget-object v0, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lpf0$a;->a:Lpf0;

    invoke-virtual {v1, p2}, Lxc0;->t(Landroidx/fragment/app/Fragment;)V

    .line 17
    invoke-virtual {v0, p1, p2}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 18
    invoke-virtual {v0}, Lje;->k()I

    :cond_1
    :goto_0
    return-void
.end method
