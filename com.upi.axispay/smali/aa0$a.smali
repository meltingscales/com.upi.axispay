.class public Laa0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa0;->w(Laa0$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/BannerOffersVo;

.field public final synthetic c:Laa0;


# direct methods
.method public constructor <init>(Laa0;Lcom/olive/upi/transport/model/BannerOffersVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laa0$a;->c:Laa0;

    iput-object p2, p0, Laa0$a;->b:Lcom/olive/upi/transport/model/BannerOffersVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Laa0$a;->c:Laa0;

    iget-object p1, p1, Laa0;->f:Lng0;

    iget-object v0, p0, Laa0$a;->b:Lcom/olive/upi/transport/model/BannerOffersVo;

    const v1, 0x7f0a022b

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
