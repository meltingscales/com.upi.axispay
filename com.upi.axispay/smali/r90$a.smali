.class public Lr90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr90;->w(Lr90$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lrg0;

.field public final synthetic c:Lr90;


# direct methods
.method public constructor <init>(Lr90;Lrg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr90$a;->c:Lr90;

    iput-object p2, p0, Lr90$a;->b:Lrg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lr90$a;->c:Lr90;

    iget-object p1, p1, Lr90;->f:Lng0;

    if-eqz p1, :cond_0

    const v0, 0x7f0a020c

    .line 2
    iget-object v1, p0, Lr90$a;->b:Lrg0;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
