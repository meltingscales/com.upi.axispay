.class public final Lmr$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Lmr$b;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lmr$a;->a:J

    .line 3
    sget-object v0, Lmr$b;->c:Lmr$b;

    iput-object v0, p0, Lmr$a;->b:Lmr$b;

    return-void
.end method


# virtual methods
.method public a()Lmr;
    .locals 4

    .line 1
    new-instance v0, Lmr;

    iget-wide v1, p0, Lmr$a;->a:J

    iget-object v3, p0, Lmr$a;->b:Lmr$b;

    invoke-direct {v0, v1, v2, v3}, Lmr;-><init>(JLmr$b;)V

    return-object v0
.end method

.method public b(J)Lmr$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lmr$a;->a:J

    return-object p0
.end method

.method public c(Lmr$b;)Lmr$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lmr$a;->b:Lmr$b;

    return-object p0
.end method
