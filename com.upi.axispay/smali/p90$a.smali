.class public Lp90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp90;->h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Banner;

.field public final synthetic c:Lp90;


# direct methods
.method public constructor <init>(Lp90;Lcom/olive/upi/transport/model/Banner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp90$a;->c:Lp90;

    iput-object p2, p0, Lp90$a;->b:Lcom/olive/upi/transport/model/Banner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lp90$a;->c:Lp90;

    iget-object p1, p1, Lp90;->c:Lng0;

    iget-object v0, p0, Lp90$a;->b:Lcom/olive/upi/transport/model/Banner;

    const v1, 0x7f0a0226

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
