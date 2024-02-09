.class public Lba0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba0;->w(Lba0$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/olive/upi/transport/model/Billers;

.field public final synthetic d:Lba0;


# direct methods
.method public constructor <init>(Lba0;ILcom/olive/upi/transport/model/Billers;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lba0$a;->d:Lba0;

    iput p2, p0, Lba0$a;->b:I

    iput-object p3, p0, Lba0$a;->c:Lcom/olive/upi/transport/model/Billers;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lba0$a;->d:Lba0;

    iget-object p1, p1, Lba0;->e:Lng0;

    if-eqz p1, :cond_0

    .line 2
    iget v0, p0, Lba0$a;->b:I

    iget-object v1, p0, Lba0$a;->c:Lcom/olive/upi/transport/model/Billers;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
