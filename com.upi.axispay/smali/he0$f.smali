.class public Lhe0$f;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhe0;->Q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhe0;


# direct methods
.method public constructor <init>(Lhe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhe0$f;->a:Lhe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 2
    iget-object v0, p0, Lhe0$f;->a:Lhe0;

    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-static {v0, p1}, Lhe0;->K(Lhe0;I)I

    .line 3
    iget-object p1, p0, Lhe0$f;->a:Lhe0;

    invoke-static {p1}, Lhe0;->L(Lhe0;)Ljava/util/List;

    move-result-object p1

    iget-object p2, p0, Lhe0$f;->a:Lhe0;

    invoke-static {p2}, Lhe0;->J(Lhe0;)I

    move-result p2

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/SubscriptionInfo;

    invoke-virtual {p1}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result p1

    .line 4
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    const v0, 0x2748

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Ln70;->v(Ljava/lang/String;I)V

    return-void
.end method
