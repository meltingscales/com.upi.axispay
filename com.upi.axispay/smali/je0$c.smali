.class public Lje0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lje0;


# direct methods
.method public constructor <init>(Lje0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lje0$c;->b:Lje0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lje0$c;->b:Lje0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    sget-object v0, Lje0;->H:Lcom/olive/upi/transport/model/Account;

    const/16 v1, 0x3c

    invoke-interface {p1, v1, v0}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
