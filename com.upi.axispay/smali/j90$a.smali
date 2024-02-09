.class public Lj90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj90;->w(Lj90$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/olive/upi/transport/model/Collectbeneblock;

.field public final synthetic c:Lj90;


# direct methods
.method public constructor <init>(Lj90;Lcom/olive/upi/transport/model/Collectbeneblock;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj90$a;->c:Lj90;

    iput-object p2, p0, Lj90$a;->b:Lcom/olive/upi/transport/model/Collectbeneblock;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lj90$a;->c:Lj90;

    iget-object p1, p1, Lj90;->f:Lng0;

    iget-object v0, p0, Lj90$a;->b:Lcom/olive/upi/transport/model/Collectbeneblock;

    const v1, 0x7f0a00fd

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
