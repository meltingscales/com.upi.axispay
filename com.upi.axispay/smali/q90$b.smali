.class public Lq90$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq90;->w(Lq90$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Inbox;

.field public final synthetic c:Lq90;


# direct methods
.method public constructor <init>(Lq90;Lcom/olive/upi/transport/model/Inbox;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq90$b;->c:Lq90;

    iput-object p2, p0, Lq90$b;->b:Lcom/olive/upi/transport/model/Inbox;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lq90$b;->c:Lq90;

    iget-object p1, p1, Lq90;->d:Lng0;

    iget-object v0, p0, Lq90$b;->b:Lcom/olive/upi/transport/model/Inbox;

    const v1, 0x7f0a02a9

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
