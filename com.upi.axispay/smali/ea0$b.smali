.class public Lea0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea0;->w(Lea0$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Recharge;

.field public final synthetic c:Lea0;


# direct methods
.method public constructor <init>(Lea0;Lcom/olive/upi/transport/model/Recharge;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lea0$b;->c:Lea0;

    iput-object p2, p0, Lea0$b;->b:Lcom/olive/upi/transport/model/Recharge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lea0$b;->c:Lea0;

    iget-object p1, p1, Lea0;->e:Lng0;

    iget-object v0, p0, Lea0$b;->b:Lcom/olive/upi/transport/model/Recharge;

    const v1, 0x7f0a054f

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
