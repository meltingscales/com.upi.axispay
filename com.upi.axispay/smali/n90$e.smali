.class public Ln90$e;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln90;->h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/olive/upi/transport/model/Account;

.field public final synthetic d:Landroid/widget/ImageView;

.field public final synthetic e:Ln90;


# direct methods
.method public constructor <init>(Ln90;ILcom/olive/upi/transport/model/Account;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln90$e;->e:Ln90;

    iput p2, p0, Ln90$e;->b:I

    iput-object p3, p0, Ln90$e;->c:Lcom/olive/upi/transport/model/Account;

    iput-object p4, p0, Ln90$e;->d:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Ln90$e;->e:Ln90;

    iget v0, p0, Ln90$e;->b:I

    iput v0, p1, Ln90;->c:I

    .line 2
    iget-object p1, p1, Ln90;->d:Lng0;

    iget-object v1, p0, Ln90$e;->c:Lcom/olive/upi/transport/model/Account;

    const v2, 0x7f0a04d3

    invoke-interface {p1, v2, v0, v1}, Lng0;->e(IILjava/lang/Object;)V

    .line 3
    iget-object p1, p0, Ln90$e;->d:Landroid/widget/ImageView;

    iget-object v0, p0, Ln90$e;->e:Ln90;

    invoke-virtual {v0}, Ln90;->t()Landroid/view/animation/RotateAnimation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
