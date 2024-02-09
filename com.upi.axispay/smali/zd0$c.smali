.class public Lzd0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lzd0;


# direct methods
.method public constructor <init>(Lzd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzd0$c;->b:Lzd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Lsg0;

    invoke-direct {p1}, Lsg0;-><init>()V

    .line 2
    iget-object v0, p0, Lzd0$c;->b:Lzd0;

    iget-object v0, v0, Lzd0;->p:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lsg0;->b(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lzd0$c;->b:Lzd0;

    iget-object v0, v0, Lzd0;->o:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lsg0;->c(Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lqa0;->f0(Lsg0;)V

    .line 5
    iget-object p1, p0, Lzd0$c;->b:Lzd0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v0, 0x75

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
