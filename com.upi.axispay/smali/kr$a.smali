.class public final Lkr$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lpr;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnr;",
            ">;"
        }
    .end annotation
.end field

.field public c:Llr;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lkr$a;->a:Lpr;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lkr$a;->b:Ljava/util/List;

    .line 4
    iput-object v0, p0, Lkr$a;->c:Llr;

    const v0, 0x2d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    iput-object v0, p0, Lkr$a;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lnr;)Lkr$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lkr$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Lkr;
    .locals 5

    .line 1
    new-instance v0, Lkr;

    iget-object v1, p0, Lkr$a;->a:Lpr;

    iget-object v2, p0, Lkr$a;->b:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lkr$a;->c:Llr;

    iget-object v4, p0, Lkr$a;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lkr;-><init>(Lpr;Ljava/util/List;Llr;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lkr$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lkr$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d(Llr;)Lkr$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lkr$a;->c:Llr;

    return-object p0
.end method

.method public e(Lpr;)Lkr$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lkr$a;->a:Lpr;

    return-object p0
.end method
