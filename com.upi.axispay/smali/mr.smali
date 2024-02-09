.class public final Lmr;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmr$b;,
        Lmr$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lmr$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lmr$a;

    invoke-direct {v0}, Lmr$a;-><init>()V

    invoke-virtual {v0}, Lmr$a;->a()Lmr;

    return-void
.end method

.method public constructor <init>(JLmr$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lmr;->a:J

    .line 3
    iput-object p3, p0, Lmr;->b:Lmr$b;

    return-void
.end method

.method public static c()Lmr$a;
    .locals 1

    .line 1
    new-instance v0, Lmr$a;

    invoke-direct {v0}, Lmr$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x1
    .end annotation

    .line 1
    iget-wide v0, p0, Lmr;->a:J

    return-wide v0
.end method

.method public b()Lmr$b;
    .locals 1
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x3
    .end annotation

    .line 1
    iget-object v0, p0, Lmr;->b:Lmr$b;

    return-object v0
.end method
