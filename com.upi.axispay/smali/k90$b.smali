.class public Lk90$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk90;->w(Lk90$e;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/olive/upi/transport/model/BeneVpa;

.field public final synthetic d:Lk90;


# direct methods
.method public constructor <init>(Lk90;ILcom/olive/upi/transport/model/BeneVpa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk90$b;->d:Lk90;

    iput p2, p0, Lk90$b;->b:I

    iput-object p3, p0, Lk90$b;->c:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lk90$b;->d:Lk90;

    iget-object v0, v0, Lk90;->e:Lng0;

    if-eqz v0, :cond_0

    .line 2
    iget v1, p0, Lk90$b;->b:I

    iget-object v2, p0, Lk90$b;->c:Lcom/olive/upi/transport/model/BeneVpa;

    invoke-interface {v0, v1, v2, p1}, Lng0;->a(ILjava/lang/Object;Landroid/view/View;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
