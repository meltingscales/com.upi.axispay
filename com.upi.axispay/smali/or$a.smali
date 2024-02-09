.class public final Lor$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lor;
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
    iput-wide v0, p0, Lor$a;->a:J

    .line 3
    iput-wide v0, p0, Lor$a;->b:J

    return-void
.end method


# virtual methods
.method public a()Lor;
    .locals 5

    .line 1
    new-instance v0, Lor;

    iget-wide v1, p0, Lor$a;->a:J

    iget-wide v3, p0, Lor$a;->b:J

    invoke-direct {v0, v1, v2, v3, v4}, Lor;-><init>(JJ)V

    return-object v0
.end method

.method public b(J)Lor$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lor$a;->a:J

    return-object p0
.end method

.method public c(J)Lor$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Lor$a;->b:J

    return-object p0
.end method
