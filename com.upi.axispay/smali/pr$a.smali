.class public final Lpr$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lpr$a;->a:J

    .line 3
    iput-wide v0, p0, Lpr$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Lpr;
    .locals 5

    .line 1
    new-instance v0, Lpr;

    iget-wide v1, p0, Lpr$a;->a:J

    iget-wide v3, p0, Lpr$a;->b:J

    invoke-direct {v0, v1, v2, v3, v4}, Lpr;-><init>(JJ)V

    return-object v0
.end method

.method public b(J)Lpr$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lpr$a;->b:J

    return-object p0
.end method

.method public c(J)Lpr$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lpr$a;->a:J

    return-object p0
.end method
