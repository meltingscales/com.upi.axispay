.class public Lp60$c;
.super Lp60$b;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp60;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp60<",
        "TE;>.b;"
    }
.end annotation


# instance fields
.field public final synthetic f:Lp60;


# direct methods
.method public constructor <init>(Lp60;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp60$c;->f:Lp60;

    invoke-direct {p0, p1}, Lp60$b;-><init>(Lp60;)V

    return-void
.end method

.method public synthetic constructor <init>(Lp60;Lp60$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lp60$c;-><init>(Lp60;)V

    return-void
.end method


# virtual methods
.method public b()Lp60$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp60$d<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lp60$c;->f:Lp60;

    iget-object v0, v0, Lp60;->b:Lp60$d;

    return-object v0
.end method

.method public c(Lp60$d;)Lp60$d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp60$d<",
            "TE;>;)",
            "Lp60$d<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p1, Lp60$d;->c:Lp60$d;

    return-object p1
.end method
