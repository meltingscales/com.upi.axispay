.class public Lga0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga0;->w(Lga0$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/BbpsHistory;

.field public final synthetic c:Lga0;


# direct methods
.method public constructor <init>(Lga0;Lcom/olive/upi/transport/model/BbpsHistory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lga0$a;->c:Lga0;

    iput-object p2, p0, Lga0$a;->b:Lcom/olive/upi/transport/model/BbpsHistory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lga0$a;->c:Lga0;

    iget-object p1, p1, Lga0;->f:Lng0;

    iget-object v0, p0, Lga0$a;->b:Lcom/olive/upi/transport/model/BbpsHistory;

    const v1, 0x7f0a03bc

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
