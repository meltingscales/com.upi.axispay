.class public final Lxk;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm$c;


# instance fields
.field public final a:Lcm$c;

.field public final b:Lbl$f;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>(Lcm$c;Lbl$f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxk;->a:Lcm$c;

    .line 3
    iput-object p2, p0, Lxk;->b:Lbl$f;

    .line 4
    iput-object p3, p0, Lxk;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Lcm$b;)Lcm;
    .locals 3

    .line 1
    new-instance v0, Lwk;

    iget-object v1, p0, Lxk;->a:Lcm$c;

    invoke-interface {v1, p1}, Lcm$c;->a(Lcm$b;)Lcm;

    move-result-object p1

    iget-object v1, p0, Lxk;->b:Lbl$f;

    iget-object v2, p0, Lxk;->c:Ljava/util/concurrent/Executor;

    invoke-direct {v0, p1, v1, v2}, Lwk;-><init>(Lcm;Lbl$f;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
