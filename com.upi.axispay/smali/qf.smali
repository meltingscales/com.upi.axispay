.class public Lqf;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf$a;,
        Lqf$d;,
        Lqf$c;,
        Lqf$e;,
        Lqf$b;
    }
.end annotation


# instance fields
.field public final a:Lqf$b;

.field public final b:Lrf;


# direct methods
.method public constructor <init>(Lrf;Lqf$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lqf;->a:Lqf$b;

    .line 3
    iput-object p1, p0, Lqf;->b:Lrf;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lpf;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lpf;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0xaa

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lqf;->b(Ljava/lang/String;Ljava/lang/Class;)Lpf;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const v0, 0xab

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Class;)Lpf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lpf;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lqf;->b:Lrf;

    invoke-virtual {v0, p1}, Lrf;->b(Ljava/lang/String;)Lpf;

    move-result-object v0

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object p1, p0, Lqf;->a:Lqf$b;

    instance-of p2, p1, Lqf$e;

    if-eqz p2, :cond_0

    .line 4
    check-cast p1, Lqf$e;

    invoke-virtual {p1, v0}, Lqf$e;->b(Lpf;)V

    :cond_0
    return-object v0

    .line 5
    :cond_1
    iget-object v0, p0, Lqf;->a:Lqf$b;

    instance-of v1, v0, Lqf$c;

    if-eqz v1, :cond_2

    .line 6
    check-cast v0, Lqf$c;

    invoke-virtual {v0, p1, p2}, Lqf$c;->c(Ljava/lang/String;Ljava/lang/Class;)Lpf;

    move-result-object p2

    goto :goto_0

    .line 7
    :cond_2
    invoke-interface {v0, p2}, Lqf$b;->a(Ljava/lang/Class;)Lpf;

    move-result-object p2

    .line 8
    :goto_0
    iget-object v0, p0, Lqf;->b:Lrf;

    invoke-virtual {v0, p1, p2}, Lrf;->d(Ljava/lang/String;Lpf;)V

    return-object p2
.end method
