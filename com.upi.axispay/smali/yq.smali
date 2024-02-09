.class public abstract Lyq;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyq$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lyq;
    .locals 4

    .line 1
    new-instance v0, Ltq;

    sget-object v1, Lyq$a;->d:Lyq$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ltq;-><init>(Lyq$a;J)V

    return-object v0
.end method

.method public static d()Lyq;
    .locals 4

    .line 1
    new-instance v0, Ltq;

    sget-object v1, Lyq$a;->e:Lyq$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ltq;-><init>(Lyq$a;J)V

    return-object v0
.end method

.method public static e(J)Lyq;
    .locals 2

    .line 1
    new-instance v0, Ltq;

    sget-object v1, Lyq$a;->b:Lyq$a;

    invoke-direct {v0, v1, p0, p1}, Ltq;-><init>(Lyq$a;J)V

    return-object v0
.end method

.method public static f()Lyq;
    .locals 4

    .line 1
    new-instance v0, Ltq;

    sget-object v1, Lyq$a;->c:Lyq$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ltq;-><init>(Lyq$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lyq$a;
.end method
