.class public final Lim;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcm$c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lmyunmn/z;->a()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcm$b;)Lcm;
    .locals 4

    .line 1
    new-instance v0, Lhm;

    iget-object v1, p1, Lcm$b;->a:Landroid/content/Context;

    iget-object v2, p1, Lcm$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lcm$b;->c:Lcm$a;

    iget-boolean p1, p1, Lcm$b;->d:Z

    invoke-direct {v0, v1, v2, v3, p1}, Lhm;-><init>(Landroid/content/Context;Ljava/lang/String;Lcm$a;Z)V

    return-object v0
.end method
