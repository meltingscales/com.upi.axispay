.class public Lfd0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lfd0;


# direct methods
.method public constructor <init>(Lfd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfd0$a;->b:Lfd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Lna0;

    invoke-direct {p1}, Lna0;-><init>()V

    .line 2
    iget-object v0, p0, Lfd0$a;->b:Lfd0;

    iget-object v0, v0, Lfd0;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lna0;->e(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lfd0$a;->b:Lfd0;

    iget-object v0, v0, Lxc0;->b:Lmg0;

    const/16 v1, 0x45

    invoke-interface {v0, v1, p1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
