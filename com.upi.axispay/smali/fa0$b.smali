.class public Lfa0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


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
    iput-object p1, p0, Lfa0$b;->c:Lfa0;

    iput-object p2, p0, Lfa0$b;->b:Lcom/olive/upi/transport/model/TranHistory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lfa0$b;->c:Lfa0;

    iget-object v0, v0, Lfa0;->e:Lng0;

    iget-object v1, p0, Lfa0$b;->b:Lcom/olive/upi/transport/model/TranHistory;

    const v2, 0x7f0a03ad

    invoke-interface {v0, v2, v1, p1}, Lng0;->a(ILjava/lang/Object;Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
