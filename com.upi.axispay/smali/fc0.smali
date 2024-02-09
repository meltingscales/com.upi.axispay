.class public final synthetic Lfc0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lce0;

.field public final synthetic c:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Lce0;Landroid/app/Dialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc0;->b:Lce0;

    iput-object p2, p0, Lfc0;->c:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lfc0;->b:Lce0;

    iget-object v1, p0, Lfc0;->c:Landroid/app/Dialog;

    invoke-virtual {v0, v1, p1}, Lce0;->A(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method
