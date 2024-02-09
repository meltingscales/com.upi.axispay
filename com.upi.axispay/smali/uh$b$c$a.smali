.class public final Luh$b$c$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh$b$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lsh;

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Lsh;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Luh$b$c$a;->b:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Luh$b$c$a;->c:Z

    .line 4
    iput-boolean v0, p0, Luh$b$c$a;->d:Z

    .line 5
    iput-boolean v0, p0, Luh$b$c$a;->e:Z

    .line 6
    iput-object p1, p0, Luh$b$c$a;->a:Lsh;

    return-void
.end method


# virtual methods
.method public a()Luh$b$c;
    .locals 7

    .line 1
    new-instance v6, Luh$b$c;

    iget-object v1, p0, Luh$b$c$a;->a:Lsh;

    iget v2, p0, Luh$b$c$a;->b:I

    iget-boolean v3, p0, Luh$b$c$a;->c:Z

    iget-boolean v4, p0, Luh$b$c$a;->d:Z

    iget-boolean v5, p0, Luh$b$c$a;->e:Z

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Luh$b$c;-><init>(Lsh;IZZZ)V

    return-object v6
.end method

.method public b(Z)Luh$b$c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Luh$b$c$a;->d:Z

    return-object p0
.end method

.method public c(Z)Luh$b$c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Luh$b$c$a;->e:Z

    return-object p0
.end method

.method public d(Z)Luh$b$c$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Luh$b$c$a;->c:Z

    return-object p0
.end method

.method public e(I)Luh$b$c$a;
    .locals 0

    .line 1
    iput p1, p0, Luh$b$c$a;->b:I

    return-object p0
.end method
