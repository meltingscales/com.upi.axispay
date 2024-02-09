.class public Lbh$d$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbh$d$c;->O(Lbh$d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lyh$i;

.field public final synthetic c:Lbh$d$c;


# direct methods
.method public constructor <init>(Lbh$d$c;Lyh$i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbh$d$c$a;->c:Lbh$d$c;

    iput-object p2, p0, Lbh$d$c$a;->b:Lyh$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lbh$d$c$a;->c:Lbh$d$c;

    iget-object p1, p1, Lbh$d$c;->z:Lbh$d;

    iget-object p1, p1, Lbh$d;->j:Lbh;

    iget-object v0, p0, Lbh$d$c$a;->b:Lyh$i;

    iput-object v0, p1, Lbh;->m:Lyh$i;

    .line 2
    invoke-virtual {v0}, Lyh$i;->H()V

    .line 3
    iget-object p1, p0, Lbh$d$c$a;->c:Lbh$d$c;

    iget-object p1, p1, Lbh$d$c;->w:Landroid/widget/ImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lbh$d$c$a;->c:Lbh$d$c;

    iget-object p1, p1, Lbh$d$c;->x:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    return-void
.end method
