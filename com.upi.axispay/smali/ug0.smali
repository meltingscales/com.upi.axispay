.class public final synthetic Lug0;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Landroid/widget/CheckBox;

.field public final synthetic c:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/CheckBox;Landroid/app/Dialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug0;->b:Landroid/widget/CheckBox;

    iput-object p2, p0, Lug0;->c:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lug0;->b:Landroid/widget/CheckBox;

    iget-object v1, p0, Lug0;->c:Landroid/app/Dialog;

    invoke-static {v0, v1, p1}, Lzg0;->a(Landroid/widget/CheckBox;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method
