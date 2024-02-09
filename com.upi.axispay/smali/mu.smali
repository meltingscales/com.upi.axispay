.class public abstract Lmu;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmu$a;
    }
.end annotation


# static fields
.field public static final a:Lmu;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lmu;->a()Lmu$a;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    .line 2
    invoke-virtual {v0, v1, v2}, Lmu$a;->f(J)Lmu$a;

    const/16 v1, 0xc8

    .line 3
    invoke-virtual {v0, v1}, Lmu$a;->d(I)Lmu$a;

    const/16 v1, 0x2710

    .line 4
    invoke-virtual {v0, v1}, Lmu$a;->b(I)Lmu$a;

    const-wide/32 v1, 0x240c8400

    .line 5
    invoke-virtual {v0, v1, v2}, Lmu$a;->c(J)Lmu$a;

    const v1, 0x14000

    .line 6
    invoke-virtual {v0, v1}, Lmu$a;->e(I)Lmu$a;

    .line 7
    invoke-virtual {v0}, Lmu$a;->a()Lmu;

    move-result-object v0

    sput-object v0, Lmu;->a:Lmu;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lmu$a;
    .locals 1

    .line 1
    new-instance v0, Liu$b;

    invoke-direct {v0}, Liu$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()J
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()J
.end method
