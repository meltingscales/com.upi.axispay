.class public final Lph0;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lph0$a;,
        Lph0$c;
    }
.end annotation


# static fields
.field public static f:Lph0;

.field public static final g:Lci0;

.field public static final h:Lph0$c;


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

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnh0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lph0$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lph0$c;-><init>(Lvl0;)V

    sput-object v0, Lph0;->h:Lph0$c;

    .line 1
    sget-object v0, Lph0$b;->b:Lph0$b;

    invoke-static {v0}, Ldi0;->b(Lsk0;)Lci0;

    move-result-object v0

    sput-object v0, Lph0;->g:Lci0;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnh0;",
            ">;ZZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lph0;->b:Ljava/util/List;

    iput-boolean p2, p0, Lph0;->c:Z

    iput-boolean p3, p0, Lph0;->d:Z

    iput-boolean p4, p0, Lph0;->e:Z

    .line 2
    new-instance p2, Lrh0;

    invoke-direct {p2}, Lrh0;-><init>()V

    invoke-static {p1, p2}, Lij0;->D(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lij0;->K(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lph0;->a:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZZZLvl0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Lph0;-><init>(Ljava/util/List;ZZZ)V

    return-void
.end method

.method public static final synthetic a()Lph0;
    .locals 1

    .line 1
    sget-object v0, Lph0;->f:Lph0;

    return-object v0
.end method

.method public static final synthetic b(Lph0;)V
    .locals 0

    .line 1
    sput-object p0, Lph0;->f:Lph0;

    return-void
.end method

.method public static final c()Lph0$a;
    .locals 1

    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0}, Lph0$c;->a()Lph0$a;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Lph0;)V
    .locals 1

    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0, p0}, Lph0$c;->c(Lph0;)V

    return-void
.end method


# virtual methods
.method public final d(Llh0;)Lmh0;
    .locals 3

    const v0, 0x33db

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lsh0;

    iget-object v1, p0, Lph0;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p1}, Lsh0;-><init>(Ljava/util/List;ILlh0;)V

    .line 2
    invoke-virtual {v0, p1}, Lsh0;->a(Llh0;)Lmh0;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph0;->d:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph0;->c:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lph0;->e:Z

    return v0
.end method
