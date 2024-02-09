.class public Lz90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz90;->x(Lz90$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/olive/upi/transport/model/PendingReqVo;

.field public final synthetic d:Lz90;


# direct methods
.method public constructor <init>(Lz90;ILcom/olive/upi/transport/model/PendingReqVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz90$a;->d:Lz90;

    iput p2, p0, Lz90$a;->b:I

    iput-object p3, p0, Lz90$a;->c:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lz90$a;->d:Lz90;

    iget-object p1, p1, Lz90;->d:Lng0;

    iget v0, p0, Lz90$a;->b:I

    iget-object v1, p0, Lz90$a;->c:Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
