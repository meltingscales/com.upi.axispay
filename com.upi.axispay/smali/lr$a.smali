.class public final Llr$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lor;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Llr$a;->a:Lor;

    return-void
.end method


# virtual methods
.method public a()Llr;
    .locals 2

    .line 1
    new-instance v0, Llr;

    iget-object v1, p0, Llr$a;->a:Lor;

    invoke-direct {v0, v1}, Llr;-><init>(Lor;)V

    return-object v0
.end method

.method public b(Lor;)Llr$a;
    .locals 0

    .line 1
    iput-object p1, p0, Llr$a;->a:Lor;

    return-object p0
.end method
