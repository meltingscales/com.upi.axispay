.class public Ltd0$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/LayoutInflater;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Ltd0;


# direct methods
.method public constructor <init>(Ltd0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltd0$c;->d:Ltd0;

    iput-object p2, p0, Ltd0$c;->b:Landroid/view/LayoutInflater;

    iput-object p3, p0, Ltd0$c;->c:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    invoke-virtual {p1}, Lqa0;->z()Lcom/olive/upi/transport/model/MandateTransactionData;

    move-result-object p1

    invoke-static {p1}, Lig0;->a(Lcom/olive/upi/transport/model/MandateTransactionData;)Ljava/lang/String;

    move-result-object p1

    .line 2
    :try_start_0
    iget-object v0, p0, Ltd0$c;->d:Ltd0;

    invoke-virtual {v0}, Lxc0;->k()Lz;

    move-result-object v1

    const/16 v2, 0xfa

    invoke-static {p1, v1, v2}, Ljg0;->e(Ljava/lang/String;Landroid/content/Context;I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, v0, Ltd0;->G:Landroid/graphics/Bitmap;

    .line 3
    iget-object p1, p0, Ltd0$c;->d:Ltd0;

    iget-object v0, p0, Ltd0$c;->b:Landroid/view/LayoutInflater;

    iget-object v1, p0, Ltd0$c;->c:Landroid/view/ViewGroup;

    invoke-static {p1, v0, v1}, Ltd0;->x(Ltd0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 4
    iget-object p1, p0, Ltd0$c;->d:Ltd0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Ltd0$c;->d:Ltd0;

    iget-object v0, v0, Ltd0;->H:Landroid/graphics/Bitmap;

    invoke-static {p1, v0}, Lyg0;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;
    :try_end_0
    .catch Ld30; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
