.class public Lqe0$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqe0;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lqe0;


# direct methods
.method public constructor <init>(Lqe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqe0$e;->b:Lqe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lqe0$e;->b:Lqe0;

    iget-object p1, p1, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    .line 2
    iget-object p1, p0, Lqe0$e;->b:Lqe0;

    const/4 v0, 0x0

    iput-object v0, p1, Lqe0;->y:Lcom/upi/axispay/custom/LoginPopupFragment;

    .line 3
    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lqe0$e;->b:Lqe0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :cond_0
    return-void
.end method
