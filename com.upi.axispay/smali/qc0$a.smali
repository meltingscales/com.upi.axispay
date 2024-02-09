.class public Lqc0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqc0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lqc0;


# direct methods
.method public constructor <init>(Lqc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqc0$a;->a:Lqc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 3

    const p1, 0x7f0a01f7

    const v0, 0x7f060066

    const v1, 0x7f060193

    const v2, 0x7f0a0101

    if-ne p2, v2, :cond_0

    .line 1
    iget-object p2, p0, Lqc0$a;->a:Lqc0;

    invoke-static {p2}, Lqc0;->y(Lqc0;)Landroid/widget/RadioButton;

    move-result-object p2

    iget-object v2, p0, Lqc0$a;->a:Lqc0;

    invoke-static {v2}, Lqc0;->x(Lqc0;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 2
    iget-object p2, p0, Lqc0$a;->a:Lqc0;

    invoke-static {p2}, Lqc0;->z(Lqc0;)Landroid/widget/RadioButton;

    move-result-object p2

    iget-object v1, p0, Lqc0$a;->a:Lqc0;

    invoke-static {v1}, Lqc0;->x(Lqc0;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 3
    iget-object p2, p0, Lqc0$a;->a:Lqc0;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p2

    .line 4
    invoke-static {}, Lsc0;->z()Lsc0;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 5
    invoke-virtual {p2}, Lje;->j()I

    goto :goto_0

    :cond_0
    const v2, 0x7f0a00e5

    if-ne p2, v2, :cond_1

    .line 6
    iget-object p2, p0, Lqc0$a;->a:Lqc0;

    invoke-static {p2}, Lqc0;->y(Lqc0;)Landroid/widget/RadioButton;

    move-result-object p2

    iget-object v2, p0, Lqc0$a;->a:Lqc0;

    invoke-static {v2}, Lqc0;->x(Lqc0;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 7
    iget-object p2, p0, Lqc0$a;->a:Lqc0;

    invoke-static {p2}, Lqc0;->z(Lqc0;)Landroid/widget/RadioButton;

    move-result-object p2

    iget-object v0, p0, Lqc0$a;->a:Lqc0;

    invoke-static {v0}, Lqc0;->x(Lqc0;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lt8;->d(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/RadioButton;->setTextColor(I)V

    .line 8
    iget-object p2, p0, Lqc0$a;->a:Lqc0;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p2

    .line 9
    invoke-static {}, Lrc0;->B()Lrc0;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 10
    invoke-virtual {p2}, Lje;->j()I

    :cond_1
    :goto_0
    return-void
.end method
