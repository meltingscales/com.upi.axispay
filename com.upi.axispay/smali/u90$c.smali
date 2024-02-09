.class public Lu90$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu90;->w(Lu90$h;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/olive/upi/transport/model/Account;

.field public final synthetic d:Lu90;


# direct methods
.method public constructor <init>(Lu90;ILcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu90$c;->d:Lu90;

    iput p2, p0, Lu90$c;->b:I

    iput-object p3, p0, Lu90$c;->c:Lcom/olive/upi/transport/model/Account;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lu90$c;->d:Lu90;

    iget v0, p0, Lu90$c;->b:I

    iput v0, p1, Lu90;->e:I

    .line 2
    iget-object p1, p1, Lu90;->d:Lng0;

    iget-object v0, p0, Lu90$c;->c:Lcom/olive/upi/transport/model/Account;

    const v1, 0x7f0a0050

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
