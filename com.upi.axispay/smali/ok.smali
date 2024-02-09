.class public abstract Lok;
.super Lhl;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lhl;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lbl;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhl;-><init>(Lbl;)V

    return-void
.end method


# virtual methods
.method public abstract g(Lfm;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfm;",
            "TT;)V"
        }
    .end annotation
.end method

.method public final h(Ljava/lang/Object;)J
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)J"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lhl;->a()Lfm;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, p1}, Lok;->g(Lfm;Ljava/lang/Object;)V

    .line 3
    invoke-interface {v0}, Lfm;->L()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p0, v0}, Lhl;->f(Lfm;)V

    return-wide v1

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lhl;->f(Lfm;)V

    .line 5
    throw p1
.end method
