.class public Lk90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk90;->w(Lk90$e;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/BeneVpa;

.field public final synthetic c:Lk90;


# direct methods
.method public constructor <init>(Lk90;Lcom/olive/upi/transport/model/BeneVpa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk90$a;->c:Lk90;

    iput-object p2, p0, Lk90$a;->b:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lk90$a;->c:Lk90;

    iget-object p1, p1, Lk90;->e:Lng0;

    if-eqz p1, :cond_0

    const v0, 0x7f0a00ad

    .line 2
    iget-object v1, p0, Lk90$a;->b:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
