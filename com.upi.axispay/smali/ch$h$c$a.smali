.class public Lch$h$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch$h$c;->O(Lch$h$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lch$h$c;


# direct methods
.method public constructor <init>(Lch$h$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$h$c$a;->b:Lch$h$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lch$h$c$a;->b:Lch$h$c;

    iget-object v0, p1, Lch$h$c;->B:Lch$h;

    iget-object v0, v0, Lch$h;->m:Lch;

    iget-object v0, v0, Lch;->d:Lyh;

    iget-object p1, p1, Lch$h$c;->A:Lyh$i;

    invoke-virtual {v0, p1}, Lyh;->q(Lyh$i;)V

    .line 2
    iget-object p1, p0, Lch$h$c$a;->b:Lch$h$c;

    iget-object p1, p1, Lch$h$c;->w:Landroid/widget/ImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lch$h$c$a;->b:Lch$h$c;

    iget-object p1, p1, Lch$h$c;->x:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method
