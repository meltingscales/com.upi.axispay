.class public Lzd0;
.super Lxc0;
.source "AxisPay"


# instance fields
.field public l:Landroid/view/View;

.field public m:Landroid/widget/Button;

.field public n:[Ljava/lang/String;

.field public o:Landroid/widget/Spinner;

.field public p:Landroid/widget/Spinner;

.field public q:[Ljava/lang/String;

.field public r:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lxc0;-><init>()V

    const v0, 0x2a50

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2a51

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2a52

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 2
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lzd0;->q:[Ljava/lang/String;

    const v0, 0x2a53

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x2a54

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x2a55

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x2a56

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x2a57

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 3
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lzd0;->r:[Ljava/lang/String;

    return-void
.end method

.method public static x()Lzd0;
    .locals 1

    .line 1
    new-instance v0, Lzd0;

    invoke-direct {v0}, Lzd0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const p3, 0x7f0d0085

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lzd0;->l:Landroid/view/View;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f030007

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lzd0;->n:[Ljava/lang/String;

    .line 3
    iget-object p1, p0, Lzd0;->l:Landroid/view/View;

    const p2, 0x7f0a0444

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kofigyan/stateprogressbar/StateProgressBar;

    .line 4
    iget-object p2, p0, Lzd0;->n:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/kofigyan/stateprogressbar/StateProgressBar;->setStateDescriptionData([Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lzd0;->l:Landroid/view/View;

    const p2, 0x7f0a00db

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lzd0;->m:Landroid/widget/Button;

    .line 6
    iget-object p1, p0, Lzd0;->l:Landroid/view/View;

    const p2, 0x7f0a0115

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    .line 7
    iget-object p1, p0, Lzd0;->m:Landroid/widget/Button;

    const p2, 0x7f080096

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 8
    iget-object p1, p0, Lzd0;->l:Landroid/view/View;

    const p2, 0x7f0a0427

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lzd0;->o:Landroid/widget/Spinner;

    .line 9
    iget-object p1, p0, Lzd0;->l:Landroid/view/View;

    const p2, 0x7f0a0420

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Lzd0;->p:Landroid/widget/Spinner;

    .line 10
    new-instance p1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object p2

    iget-object p3, p0, Lzd0;->q:[Ljava/lang/String;

    const v0, 0x1090008

    invoke-direct {p1, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const p2, 0x1090009

    .line 11
    invoke-virtual {p1, p2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 12
    new-instance p3, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v1

    iget-object v2, p0, Lzd0;->r:[Ljava/lang/String;

    invoke-direct {p3, v1, v0, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p3, p2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 14
    iget-object p2, p0, Lzd0;->o:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 15
    iget-object p1, p0, Lzd0;->p:Landroid/widget/Spinner;

    invoke-virtual {p1, p3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 16
    iget-object p1, p0, Lzd0;->o:Landroid/widget/Spinner;

    new-instance p2, Lzd0$a;

    invoke-direct {p2, p0}, Lzd0$a;-><init>(Lzd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 17
    iget-object p1, p0, Lzd0;->p:Landroid/widget/Spinner;

    new-instance p2, Lzd0$b;

    invoke-direct {p2, p0}, Lzd0$b;-><init>(Lzd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 18
    iget-object p1, p0, Lzd0;->m:Landroid/widget/Button;

    new-instance p2, Lzd0$c;

    invoke-direct {p2, p0}, Lzd0$c;-><init>(Lzd0;)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object p1, p0, Lzd0;->l:Landroid/view/View;

    return-object p1
.end method

.method public onResume()V
    .locals 2

    const v0, 0x7f1203bc

    .line 1
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x74

    invoke-virtual {p0, v1, v0}, Lxc0;->v(ILjava/lang/String;)V

    .line 2
    invoke-super {p0}, Lxc0;->onResume()V

    return-void
.end method
