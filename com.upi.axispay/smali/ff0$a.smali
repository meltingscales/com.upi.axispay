.class public Lff0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lff0;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/app/AlertDialog;

.field public final synthetic c:Lff0;


# direct methods
.method public constructor <init>(Lff0;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lff0$a;->c:Lff0;

    iput-object p2, p0, Lff0$a;->b:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lff0$a;->b:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    .line 2
    invoke-static {}, Lqa0;->v()Lqa0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lqa0;->u0(Lcom/olive/upi/transport/model/TransactionData;)V

    .line 3
    iget-object p1, p0, Lff0$a;->c:Lff0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v1, 0xb

    invoke-interface {p1, v1, v0}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method
