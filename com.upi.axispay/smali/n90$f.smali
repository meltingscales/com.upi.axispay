.class public Ln90$f;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln90;->h(Landroid/view/ViewGroup;I)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Account;

.field public final synthetic c:Ln90;


# direct methods
.method public constructor <init>(Ln90;Lcom/olive/upi/transport/model/Account;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln90$f;->c:Ln90;

    iput-object p2, p0, Ln90$f;->b:Lcom/olive/upi/transport/model/Account;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ln90$f;->c:Ln90;

    iget-object p1, p1, Ln90;->d:Lng0;

    iget-object v0, p0, Ln90$f;->b:Lcom/olive/upi/transport/model/Account;

    const v1, 0x7f0a0261

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
