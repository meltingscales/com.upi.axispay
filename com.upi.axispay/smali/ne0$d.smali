.class public Lne0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lne0;->onFailureResponse(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lne0;


# direct methods
.method public constructor <init>(Lne0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lne0$d;->b:Lne0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lne0$d;->b:Lne0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x132

    invoke-interface {p1, v1, v0}, Lmg0;->o(ILjava/lang/Object;)V

    return-void
.end method
