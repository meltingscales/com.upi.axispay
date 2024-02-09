.class public Lqc0;
.super Lxc0;
.source "AxisPay"


# instance fields
.field public l:Landroid/content/Context;

.field public m:Landroid/widget/RadioButton;

.field public n:Landroid/widget/RadioButton;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    return-void
.end method

.method public static synthetic x(Lqc0;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc0;->l:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic y(Lqc0;)Landroid/widget/RadioButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc0;->m:Landroid/widget/RadioButton;

    return-object p0
.end method

.method public static synthetic z(Lqc0;)Landroid/widget/RadioButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lqc0;->n:Landroid/widget/RadioButton;

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0d0061

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p2

    iput-object p2, p0, Lqc0;->l:Landroid/content/Context;

    const p2, 0x7f0a0101

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioButton;

    iput-object p2, p0, Lqc0;->m:Landroid/widget/RadioButton;

    const p2, 0x7f0a00e5

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioButton;

    iput-object p2, p0, Lqc0;->n:Landroid/widget/RadioButton;

    const p2, 0x7f0a03b1

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioGroup;

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/fragment/app/FragmentManager;->n()Lje;

    move-result-object p3

    .line 7
    invoke-static {}, Lsc0;->z()Lsc0;

    move-result-object v0

    const v1, 0x7f0a01f7

    invoke-virtual {p3, v1, v0}, Lje;->r(ILandroidx/fragment/app/Fragment;)Lje;

    .line 8
    invoke-virtual {p3}, Lje;->j()I

    .line 9
    new-instance p3, Lqc0$a;

    invoke-direct {p3, p0}, Lqc0$a;-><init>(Lqc0;)V

    invoke-virtual {p2, p3}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    return-object p1
.end method
