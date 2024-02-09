.class public final Luu;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lhr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhr<",
        "Ltu;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lzu;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lmu;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Lvu;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lwh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwh0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lmu;",
            ">;",
            "Lwh0<",
            "Lvu;",
            ">;",
            "Lwh0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Luu;->a:Lwh0;

    .line 3
    iput-object p2, p0, Luu;->b:Lwh0;

    .line 4
    iput-object p3, p0, Luu;->c:Lwh0;

    .line 5
    iput-object p4, p0, Luu;->d:Lwh0;

    .line 6
    iput-object p5, p0, Luu;->e:Lwh0;

    return-void
.end method

.method public static a(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)Luu;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lzu;",
            ">;",
            "Lwh0<",
            "Lmu;",
            ">;",
            "Lwh0<",
            "Lvu;",
            ">;",
            "Lwh0<",
            "Ljava/lang/String;",
            ">;)",
            "Luu;"
        }
    .end annotation

    .line 1
    new-instance v6, Luu;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Luu;-><init>(Lwh0;Lwh0;Lwh0;Lwh0;Lwh0;)V

    return-object v6
.end method

.method public static c(Lzu;Lzu;Ljava/lang/Object;Ljava/lang/Object;Lfr;)Ltu;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzu;",
            "Lzu;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lfr<",
            "Ljava/lang/String;",
            ">;)",
            "Ltu;"
        }
    .end annotation

    .line 1
    new-instance v6, Ltu;

    move-object v3, p2

    check-cast v3, Lmu;

    move-object v4, p3

    check-cast v4, Lvu;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ltu;-><init>(Lzu;Lzu;Lmu;Lvu;Lfr;)V

    return-object v6
.end method


# virtual methods
.method public b()Ltu;
    .locals 5

    .line 1
    iget-object v0, p0, Luu;->a:Lwh0;

    invoke-interface {v0}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzu;

    iget-object v1, p0, Luu;->b:Lwh0;

    invoke-interface {v1}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzu;

    iget-object v2, p0, Luu;->c:Lwh0;

    invoke-interface {v2}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Luu;->d:Lwh0;

    invoke-interface {v3}, Lwh0;->get()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Luu;->e:Lwh0;

    invoke-static {v4}, Lgr;->a(Lwh0;)Lfr;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Luu;->c(Lzu;Lzu;Ljava/lang/Object;Ljava/lang/Object;Lfr;)Ltu;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Luu;->b()Ltu;

    move-result-object v0

    return-object v0
.end method
