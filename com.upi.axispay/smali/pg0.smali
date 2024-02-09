.class public Lpg0;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:Z

.field public e:I

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lpg0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lpg0;->e:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, Lpg0;->e:I

    .line 11
    iput-object p2, p0, Lpg0;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IZ)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lpg0;->e:I

    .line 5
    iput-object p2, p0, Lpg0;->a:Ljava/lang/String;

    .line 6
    iput p3, p0, Lpg0;->b:I

    .line 7
    iput-boolean p4, p0, Lpg0;->c:Z

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lpg0;->d:Z

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IZZ)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lpg0;->e:I

    .line 14
    iput-object p2, p0, Lpg0;->a:Ljava/lang/String;

    .line 15
    iput p3, p0, Lpg0;->b:I

    .line 16
    iput-boolean p4, p0, Lpg0;->c:Z

    .line 17
    iput-boolean p5, p0, Lpg0;->d:Z

    return-void
.end method


# virtual methods
.method public a(Lpg0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lpg0;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpg0;->f:Ljava/util/ArrayList;

    .line 2
    :cond_0
    iget-object v0, p0, Lpg0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lpg0;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lpg0;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lpg0;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lpg0;->e:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lpg0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lpg0;->d:Z

    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lpg0;->c:Z

    return v0
.end method
