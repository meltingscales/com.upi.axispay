.class public Lmf0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmf0;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/AlertDialog;

.field public final synthetic c:Lmf0;


# direct methods
.method public constructor <init>(Lmf0;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmf0$d;->c:Lmf0;

    iput-object p2, p0, Lmf0$d;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lmf0$d;->b:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    .line 2
    iget-object p1, p0, Lmf0$d;->c:Lmf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->t(ILjava/lang/Object;)V

    return-void
.end method
