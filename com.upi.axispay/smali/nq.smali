.class public final Lnq;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lzo;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lzo<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Llq;

.field public final b:Ljava/lang/String;

.field public final c:Lvo;

.field public final d:Lyo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyo<",
            "TT;[B>;"
        }
    .end annotation
.end field

.field public final e:Loq;


# direct methods
.method public constructor <init>(Llq;Ljava/lang/String;Lvo;Lyo;Loq;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llq;",
            "Ljava/lang/String;",
            "Lvo;",
            "Lyo<",
            "TT;[B>;",
            "Loq;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnq;->a:Llq;

    .line 3
    iput-object p2, p0, Lnq;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lnq;->c:Lvo;

    .line 5
    iput-object p4, p0, Lnq;->d:Lyo;

    .line 6
    iput-object p5, p0, Lnq;->e:Loq;

    return-void
.end method


# virtual methods
.method public a(Lwo;Lbp;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwo<",
            "TT;>;",
            "Lbp;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnq;->e:Loq;

    .line 2
    invoke-static {}, Lkq;->a()Lkq$a;

    move-result-object v1

    iget-object v2, p0, Lnq;->a:Llq;

    .line 3
    invoke-virtual {v1, v2}, Lkq$a;->e(Llq;)Lkq$a;

    .line 4
    invoke-virtual {v1, p1}, Lkq$a;->c(Lwo;)Lkq$a;

    iget-object p1, p0, Lnq;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {v1, p1}, Lkq$a;->f(Ljava/lang/String;)Lkq$a;

    iget-object p1, p0, Lnq;->d:Lyo;

    .line 6
    invoke-virtual {v1, p1}, Lkq$a;->d(Lyo;)Lkq$a;

    iget-object p1, p0, Lnq;->c:Lvo;

    .line 7
    invoke-virtual {v1, p1}, Lkq$a;->b(Lvo;)Lkq$a;

    .line 8
    invoke-virtual {v1}, Lkq$a;->a()Lkq;

    move-result-object p1

    .line 9
    invoke-interface {v0, p1, p2}, Loq;->a(Lkq;Lbp;)V

    return-void
.end method
