.class public Lo90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo90;->x(Lo90$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/BillerCategory;

.field public final synthetic c:I

.field public final synthetic d:Lo90;


# direct methods
.method public constructor <init>(Lo90;Lcom/olive/upi/transport/model/BillerCategory;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo90$a;->d:Lo90;

    iput-object p2, p0, Lo90$a;->b:Lcom/olive/upi/transport/model/BillerCategory;

    iput p3, p0, Lo90$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lo90$a;->b:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BillerCategory;->getFixedCategory()I

    move-result p1

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    iget v0, p0, Lo90$a;->c:I

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, v0}, Loa0;->s(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Loa0;->f()Loa0;

    move-result-object p1

    iget v0, p0, Lo90$a;->c:I

    invoke-virtual {p1, v0}, Loa0;->s(I)V

    .line 4
    :goto_0
    iget-object p1, p0, Lo90$a;->d:Lo90;

    iget-object p1, p1, Lo90;->f:Lng0;

    const v0, 0x7f0a00b2

    iget-object v1, p0, Lo90$a;->b:Lcom/olive/upi/transport/model/BillerCategory;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
