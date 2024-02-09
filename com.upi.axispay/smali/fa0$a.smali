.class public Lfa0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfa0;->y(Lfa0$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/TranHistory;

.field public final synthetic c:Lfa0;


# direct methods
.method public constructor <init>(Lfa0;Lcom/olive/upi/transport/model/TranHistory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfa0$a;->c:Lfa0;

    iput-object p2, p0, Lfa0$a;->b:Lcom/olive/upi/transport/model/TranHistory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lfa0$a;->c:Lfa0;

    iget-object p1, p1, Lfa0;->e:Lng0;

    if-eqz p1, :cond_0

    const v0, 0x7f0a03ad

    .line 2
    iget-object v1, p0, Lfa0$a;->b:Lcom/olive/upi/transport/model/TranHistory;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
