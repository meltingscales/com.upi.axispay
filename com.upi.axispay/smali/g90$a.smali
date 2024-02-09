.class public Lg90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg90;->w(Lg90$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Bank;

.field public final synthetic c:Lg90;


# direct methods
.method public constructor <init>(Lg90;Lcom/olive/upi/transport/model/Bank;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg90$a;->c:Lg90;

    iput-object p2, p0, Lg90$a;->b:Lcom/olive/upi/transport/model/Bank;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lg90$a;->c:Lg90;

    iget-object p1, p1, Lg90;->f:Lng0;

    if-eqz p1, :cond_0

    const v0, 0x7f0a00a0

    .line 2
    iget-object v1, p0, Lg90$a;->b:Lcom/olive/upi/transport/model/Bank;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
