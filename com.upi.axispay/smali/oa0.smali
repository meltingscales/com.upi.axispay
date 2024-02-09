.class public Loa0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static k:Loa0;


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCategory;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCircle;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerField;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:I

.field public h:I

.field public i:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

.field public j:Ljava/lang/Double;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f()Loa0;
    .locals 1

    .line 1
    sget-object v0, Loa0;->k:Loa0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Loa0;

    invoke-direct {v0}, Loa0;-><init>()V

    sput-object v0, Loa0;->k:Loa0;

    .line 3
    :cond_0
    sget-object v0, Loa0;->k:Loa0;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCategory;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loa0;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerField;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loa0;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()Lcom/olive/upi/transport/model/BillerRegEnqResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Loa0;->i:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    return-object v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loa0;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public e()Ljava/lang/Double;
    .locals 1

    .line 1
    iget-object v0, p0, Loa0;->j:Ljava/lang/Double;

    return-object v0
.end method

.method public g()Ljava/util/Hashtable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Loa0;->e:Ljava/util/Hashtable;

    return-object v0
.end method

.method public h()Lcom/olive/upi/transport/model/Billers;
    .locals 2

    .line 1
    iget v0, p0, Loa0;->g:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Loa0;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Loa0;->b:Ljava/util/ArrayList;

    iget v1, p0, Loa0;->g:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/Billers;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public i()Lcom/olive/upi/transport/model/BillerCategory;
    .locals 2

    .line 1
    iget v0, p0, Loa0;->f:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Loa0;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Loa0;->a:Ljava/util/ArrayList;

    iget v1, p0, Loa0;->f:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerCategory;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public j()Lcom/olive/upi/transport/model/BillerCircle;
    .locals 2

    .line 1
    iget-object v0, p0, Loa0;->c:Ljava/util/ArrayList;

    iget v1, p0, Loa0;->h:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/olive/upi/transport/model/BillerCircle;

    return-object v0
.end method

.method public k(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCategory;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Loa0;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public l(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerField;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Loa0;->d:Ljava/util/ArrayList;

    return-void
.end method

.method public m(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/BillerCircle;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Loa0;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public n(Lcom/olive/upi/transport/model/BillerRegEnqResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Loa0;->i:Lcom/olive/upi/transport/model/BillerRegEnqResponse;

    return-void
.end method

.method public o(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/Billers;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Loa0;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public p(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Loa0;->j:Ljava/lang/Double;

    return-void
.end method

.method public q(Ljava/util/Hashtable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Loa0;->e:Ljava/util/Hashtable;

    return-void
.end method

.method public r(I)V
    .locals 0

    .line 1
    iput p1, p0, Loa0;->g:I

    return-void
.end method

.method public s(I)V
    .locals 0

    .line 1
    iput p1, p0, Loa0;->f:I

    return-void
.end method

.method public t(I)V
    .locals 0

    .line 1
    iput p1, p0, Loa0;->h:I

    return-void
.end method
