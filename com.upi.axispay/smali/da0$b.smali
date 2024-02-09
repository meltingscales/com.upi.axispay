.class public Lda0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda0;->w(Lda0$f;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/PendingReqVo;

.field public final synthetic c:Lda0;


# direct methods
.method public constructor <init>(Lda0;Lcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lda0$b;->c:Lda0;

    iput-object p2, p0, Lda0$b;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lda0$b;->c:Lda0;

    iget-object p1, p1, Lda0;->e:Lng0;

    iget-object v0, p0, Lda0$b;->b:Lcom/olive/upi/transport/model/PendingReqVo;

    const v1, 0x7f0a00d2

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
