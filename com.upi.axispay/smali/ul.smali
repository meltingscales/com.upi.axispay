.class public final Lul;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a(Landroid/view/View;Ltl;)V
    .locals 1

    .line 1
    sget v0, Lrl;->view_tree_saved_state_registry_owner:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
