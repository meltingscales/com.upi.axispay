.class public Lw90$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw90;->w(Lw90$g;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/MandatesVo;

.field public final synthetic c:Lw90;


# direct methods
.method public constructor <init>(Lw90;Lcom/olive/upi/transport/model/MandatesVo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw90$d;->c:Lw90;

    iput-object p2, p0, Lw90$d;->b:Lcom/olive/upi/transport/model/MandatesVo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lw90$d;->c:Lw90;

    iget-object p1, p1, Lw90;->f:Lng0;

    iget-object v0, p0, Lw90$d;->b:Lcom/olive/upi/transport/model/MandatesVo;

    const v1, 0x7f0a00de

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
