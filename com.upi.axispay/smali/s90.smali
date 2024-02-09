.class public Ls90;
.super Landroid/widget/BaseAdapter;
.source "AxisPay"

# interfaces
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls90$b;,
        Ls90$a;
    }
.end annotation


# instance fields
.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ls90$b;

.field public d:Landroid/view/LayoutInflater;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BeneVpa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    iput-object p2, p0, Ls90;->b:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ls90$b;

    invoke-direct {v0, p0}, Ls90$b;-><init>(Ls90;)V

    iput-object v0, p0, Ls90;->c:Ls90$b;

    .line 4
    iput-object p2, p0, Ls90;->b:Ljava/util/ArrayList;

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Ls90;->d:Landroid/view/LayoutInflater;

    return-void
.end method

.method public static synthetic a(Ls90;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Ls90;->b:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static synthetic b(Ls90;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iput-object p1, p0, Ls90;->b:Ljava/util/ArrayList;

    return-object p1
.end method


# virtual methods
.method public c(I)Lcom/olive/upi/transport/model/BeneVpa;
    .locals 1

    .line 1
    iget-object v0, p0, Ls90;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/BeneVpa;

    :goto_0
    return-object p1
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ls90;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    iget-object v0, p0, Ls90;->c:Ls90$b;

    return-object v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls90;->c(I)Lcom/olive/upi/transport/model/BeneVpa;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    if-nez p2, :cond_0

    .line 1
    iget-object p2, p0, Ls90;->d:Landroid/view/LayoutInflater;

    const p3, 0x7f0d00c4

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 2
    new-instance p3, Ls90$a;

    invoke-direct {p3, p2}, Ls90$a;-><init>(Landroid/view/View;)V

    .line 3
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ls90$a;

    .line 5
    :goto_0
    iget-object v0, p0, Ls90;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/olive/upi/transport/model/BeneVpa;

    .line 6
    iget-object p3, p3, Ls90$a;->a:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getVpa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
