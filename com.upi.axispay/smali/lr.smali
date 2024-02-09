.class public final Llr;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llr$a;
    }
.end annotation


# instance fields
.field public final a:Lor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llr$a;

    invoke-direct {v0}, Llr$a;-><init>()V

    invoke-virtual {v0}, Llr$a;->a()Llr;

    return-void
.end method

.method public constructor <init>(Lor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llr;->a:Lor;

    return-void
.end method

.method public static b()Llr$a;
    .locals 1

    .line 1
    new-instance v0, Llr$a;

    invoke-direct {v0}, Llr$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lor;
    .locals 1
    .annotation runtime Lcom/google/firebase/encoders/annotations/Encodable$Field;
        name = "storageMetrics"
    .end annotation

    .annotation build Lcom/google/firebase/encoders/proto/Protobuf;
        tag = 0x1
    .end annotation

    .line 1
    iget-object v0, p0, Llr;->a:Lor;

    return-object v0
.end method
