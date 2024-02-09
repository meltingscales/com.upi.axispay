.class public final Lpr;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpr$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpr$a;

    invoke-direct {v0}, Lpr$a;-><init>()V

    invoke-virtual {v0}, Lpr$a;->a()Lpr;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lpr;->a:J

    .line 3
    iput-wide p3, p0, Lpr;->b:J

    return-void
.end method

.method public static c()Lpr$a;
    .locals 1

    .line 1
    new-instance v0, Lpr$a;

    invoke-direct {v0}, Lpr$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x2
    .end annotation

    .line 1
    iget-wide v0, p0, Lpr;->b:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x1
    .end annotation

    .line 1
    iget-wide v0, p0, Lpr;->a:J

    return-wide v0
.end method
