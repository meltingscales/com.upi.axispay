.class public Lja0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja0;->w(Lja0$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lja0$b;


# direct methods
.method public constructor <init>(Lja0;Lja0$b;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lja0$a;->b:Lja0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lja0$a;->b:Lja0$b;

    iget-object p1, p1, Lja0$b;->w:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lja0$a;->b:Lja0$b;

    iget-object p1, p1, Lja0$b;->x:Landroid/widget/ImageView;

    const v0, 0x7f0801d1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    return-void
.end method
