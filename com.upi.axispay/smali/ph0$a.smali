.class public final Lph0$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnh0;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lph0$a;->a:Ljava/util/List;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lph0$a;->b:Z

    .line 4
    iput-boolean v0, p0, Lph0$a;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Lnh0;)Lph0$a;
    .locals 1

    const v0, 0x3738

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lph0$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b()Lph0;
    .locals 7

    .line 1
    new-instance v6, Lph0;

    .line 2
    iget-object v0, p0, Lph0$a;->a:Ljava/util/List;

    invoke-static {v0}, Lij0;->I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    .line 3
    iget-boolean v2, p0, Lph0$a;->b:Z

    .line 4
    iget-boolean v3, p0, Lph0$a;->c:Z

    .line 5
    iget-boolean v4, p0, Lph0$a;->d:Z

    const/4 v5, 0x0

    move-object v0, v6

    .line 6
    invoke-direct/range {v0 .. v5}, Lph0;-><init>(Ljava/util/List;ZZZLvl0;)V

    return-object v6
.end method
