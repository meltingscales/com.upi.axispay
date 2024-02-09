.class public Ll90$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll90;->y(Ll90$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lpg0;

.field public final synthetic c:Ll90;


# direct methods
.method public constructor <init>(Ll90;Lpg0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll90$a;->c:Ll90;

    iput-object p2, p0, Ll90$a;->b:Lpg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ll90$a;->c:Ll90;

    iget-object p1, p1, Ll90;->e:Lng0;

    iget-object v0, p0, Ll90$a;->b:Lpg0;

    const/16 v1, 0xca

    invoke-interface {p1, v1, v0}, Lng0;->s(ILjava/lang/Object;)V

    return-void
.end method
