.class public Lre0$g;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre0;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/Spinner;

.field public final synthetic c:Landroid/widget/Spinner;

.field public final synthetic d:Lre0;


# direct methods
.method public constructor <init>(Lre0;Landroid/widget/Spinner;Landroid/widget/Spinner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lre0$g;->d:Lre0;

    iput-object p2, p0, Lre0$g;->b:Landroid/widget/Spinner;

    iput-object p3, p0, Lre0$g;->c:Landroid/widget/Spinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 3
    sget-object p2, Lqa0$e;->b:Lqa0$e;

    .line 4
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    const/4 p5, 0x1

    const v0, 0x7f120391

    const v1, 0x7f120062

    const v2, 0x7f120425

    if-eq p3, p5, :cond_2

    const/4 p5, 0x2

    if-eq p3, p5, :cond_1

    const/4 p5, 0x3

    if-eq p3, p5, :cond_0

    .line 5
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object p3, p0, Lre0$g;->d:Lre0;

    iget-object p5, p3, Lre0;->m:Ljava/util/HashSet;

    invoke-virtual {p3, p2, p5}, Lre0;->C(Lqa0$e;Ljava/util/HashSet;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 9
    :cond_0
    sget-object p2, Lqa0$e;->e:Lqa0$e;

    .line 10
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object p3, p0, Lre0$g;->d:Lre0;

    iget-object p5, p3, Lre0;->m:Ljava/util/HashSet;

    invoke-virtual {p3, p2, p5}, Lre0;->C(Lqa0$e;Ljava/util/HashSet;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 12
    :cond_1
    sget-object p2, Lqa0$e;->d:Lqa0$e;

    .line 13
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object p3, p0, Lre0$g;->d:Lre0;

    iget-object p5, p3, Lre0;->m:Ljava/util/HashSet;

    invoke-virtual {p3, p2, p5}, Lre0;->C(Lqa0$e;Ljava/util/HashSet;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 15
    :cond_2
    sget-object p2, Lqa0$e;->c:Lqa0$e;

    .line 16
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    iget-object p3, p0, Lre0$g;->d:Lre0;

    iget-object p5, p3, Lre0;->m:Ljava/util/HashSet;

    invoke-virtual {p3, p2, p5}, Lre0;->C(Lqa0$e;Ljava/util/HashSet;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 20
    :goto_0
    new-instance p2, Landroid/widget/ArrayAdapter;

    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3}, Lxc0;->k()Lz;

    move-result-object p3

    const p5, 0x1090008

    invoke-direct {p2, p3, p5, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const p1, 0x1090009

    .line 21
    invoke-virtual {p2, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 22
    iget-object p3, p0, Lre0$g;->b:Landroid/widget/Spinner;

    invoke-virtual {p3, p2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 23
    new-instance p2, Landroid/widget/ArrayAdapter;

    iget-object p3, p0, Lre0$g;->d:Lre0;

    invoke-virtual {p3}, Lxc0;->k()Lz;

    move-result-object p3

    invoke-direct {p2, p3, p5, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 24
    invoke-virtual {p2, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 25
    iget-object p1, p0, Lre0$g;->c:Landroid/widget/Spinner;

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
