.class public final Lor;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lor$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lor$a;

    invoke-direct {v0}, Lor$a;-><init>()V

    invoke-virtual {v0}, Lor$a;->a()Lor;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lor;->a:J

    .line 3
    iput-wide p3, p0, Lor;->b:J

    return-void
.end method

.method public static c()Lor$a;
    .locals 1

    .line 1
    new-instance v0, Lor$a;

    invoke-direct {v0}, Lor$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x1
    .end annotation

    .line 1
    iget-wide v0, p0, Lor;->a:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x2
    .end annotation

    .line 1
    iget-wide v0, p0, Lor;->b:J

    return-wide v0
.end method
