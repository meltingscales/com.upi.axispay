.class public Lch$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lch;


# direct methods
.method public constructor <init>(Lch;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lch$c;->b:Lch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lch$c;->b:Lch;

    iget-object p1, p1, Lch;->g:Lyh$i;

    invoke-virtual {p1}, Lyh$i;->B()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lch$c;->b:Lch;

    iget-object p1, p1, Lch;->d:Lyh;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lyh;->r(I)V

    .line 3
    :cond_0
    iget-object p1, p0, Lch$c;->b:Lch;

    invoke-virtual {p1}, Lc0;->dismiss()V

    return-void
.end method
