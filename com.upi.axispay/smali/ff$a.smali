.class public Lff$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lbf$c;

.field public b:Lcf;


# direct methods
.method public constructor <init>(Ldf;Lbf$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lhf;->f(Ljava/lang/Object;)Lcf;

    move-result-object p1

    iput-object p1, p0, Lff$a;->b:Lcf;

    .line 3
    iput-object p2, p0, Lff$a;->a:Lbf$c;

    return-void
.end method


# virtual methods
.method public a(Lef;Lbf$b;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lbf$b;->b()Lbf$c;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lff$a;->a:Lbf$c;

    invoke-static {v1, v0}, Lff;->k(Lbf$c;Lbf$c;)Lbf$c;

    move-result-object v1

    iput-object v1, p0, Lff$a;->a:Lbf$c;

    .line 3
    iget-object v1, p0, Lff$a;->b:Lcf;

    invoke-interface {v1, p1, p2}, Lcf;->d(Lef;Lbf$b;)V

    .line 4
    iput-object v0, p0, Lff$a;->a:Lbf$c;

    return-void
.end method
