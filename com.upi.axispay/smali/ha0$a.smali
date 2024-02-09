.class public Lha0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lha0;->w(Lha0$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/RecentBPTHistory;

.field public final synthetic c:Lha0;


# direct methods
.method public constructor <init>(Lha0;Lcom/olive/upi/transport/model/RecentBPTHistory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lha0$a;->c:Lha0;

    iput-object p2, p0, Lha0$a;->b:Lcom/olive/upi/transport/model/RecentBPTHistory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lha0$a;->c:Lha0;

    iget-object p1, p1, Lha0;->f:Lng0;

    iget-object v0, p0, Lha0$a;->b:Lcom/olive/upi/transport/model/RecentBPTHistory;

    const v1, 0x7f0a03bc

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
