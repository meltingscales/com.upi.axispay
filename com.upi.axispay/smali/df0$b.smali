.class public Ldf0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/LayoutInflater;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Ldf0;


# direct methods
.method public constructor <init>(Ldf0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldf0$b;->d:Ldf0;

    iput-object p2, p0, Ldf0$b;->b:Landroid/view/LayoutInflater;

    iput-object p3, p0, Ldf0$b;->c:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ldf0$b;->d:Ldf0;

    iget-object v0, p0, Ldf0$b;->b:Landroid/view/LayoutInflater;

    iget-object v1, p0, Ldf0$b;->c:Landroid/view/ViewGroup;

    invoke-static {p1, v0, v1}, Ldf0;->x(Ldf0;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 2
    iget-object p1, p0, Ldf0$b;->d:Ldf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    iget-object v0, p0, Ldf0$b;->d:Ldf0;

    iget-object v0, v0, Ldf0;->n:Landroid/graphics/Bitmap;

    invoke-static {p1, v0}, Lyg0;->c(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;

    return-void
.end method
