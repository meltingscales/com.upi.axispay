.class public Ltf;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static a(Landroid/view/View;Lef;)V
    .locals 1

    .line 1
    sget v0, Lvf;->view_tree_lifecycle_owner:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method
