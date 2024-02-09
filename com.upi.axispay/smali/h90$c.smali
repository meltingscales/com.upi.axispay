.class public Lh90$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh90;->w(Lh90$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Account;

.field public final synthetic c:Lh90;


# direct methods
.method public constructor <init>(Lh90;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh90$c;->c:Lh90;

    iput-object p2, p0, Lh90$c;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lh90$c;->c:Lh90;

    iget-object p1, p1, Lh90;->f:Lng0;

    iget-object v0, p0, Lh90$c;->b:Lcom/olive/upi/transport/model/Account;

    const v1, 0x7f0a0270

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
