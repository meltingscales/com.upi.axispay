.class public final Lkr;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkr$a;
    }
.end annotation


# instance fields
.field public final a:Lpr;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnr;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Llr;

.field public final d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkr$a;

    invoke-direct {v0}, Lkr$a;-><init>()V

    invoke-virtual {v0}, Lkr$a;->b()Lkr;

    return-void
.end method

.method public constructor <init>(Lpr;Ljava/util/List;Llr;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpr;",
            "Ljava/util/List<",
            "Lnr;",
            ">;",
            "Llr;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkr;->a:Lpr;

    .line 3
    iput-object p2, p0, Lkr;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lkr;->c:Llr;

    .line 5
    iput-object p4, p0, Lkr;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Lkr$a;
    .locals 1

    .line 1
    new-instance v0, Lkr$a;

    invoke-direct {v0}, Lkr$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x4
    .end annotation

    .line 1
    iget-object v0, p0, Lkr;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Llr;
    .locals 1
    .annotation runtime Lcom/google/firebase/encoders/annotations/Encodable$Field;
        name = "globalMetrics"
    .end annotation

    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x3
    .end annotation

    .line 1
    iget-object v0, p0, Lkr;->c:Llr;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation runtime Lcom/google/firebase/encoders/annotations/Encodable$Field;
        name = "logSourceMetrics"
    .end annotation

    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x2
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnr;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkr;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lpr;
    .locals 1
    .annotation runtime Lcom/google/firebase/encoders/annotations/Encodable$Field;
        name = "window"
    .end annotation

    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x1
    .end annotation

    .line 1
    iget-object v0, p0, Lkr;->a:Lpr;

    return-object v0
.end method

.method public f()[B
    .locals 1

    .line 1
    invoke-static {p0}, Liq;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
