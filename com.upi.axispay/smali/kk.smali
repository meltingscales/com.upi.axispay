.class public final Lkk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm$c;


# instance fields
.field public final a:Lcm$c;

.field public final b:Lik;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(Lcm$c;Lik;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkk;->a:Lcm$c;

    .line 3
    iput-object p2, p0, Lkk;->b:Lik;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcm$b;)Lcm;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkk;->b(Lcm$b;)Ljk;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcm$b;)Ljk;
    .locals 2

    .line 1
    new-instance v0, Ljk;

    iget-object v1, p0, Lkk;->a:Lcm$c;

    invoke-interface {v1, p1}, Lcm$c;->a(Lcm$b;)Lcm;

    move-result-object p1

    iget-object v1, p0, Lkk;->b:Lik;

    invoke-direct {v0, p1, v1}, Ljk;-><init>(Lcm;Lik;)V

    return-object v0
.end method
