.class public abstract Llq;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llq$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Llq$a;
    .locals 2

    .line 1
    new-instance v0, Laq$b;

    invoke-direct {v0}, Laq$b;-><init>()V

    sget-object v1, Lxo;->b:Lxo;

    invoke-virtual {v0, v1}, Laq$b;->d(Lxo;)Llq$a;

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()[B
.end method

.method public abstract d()Lxo;
.end method

.method public e()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Llq;->c()[B

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(Lxo;)Llq;
    .locals 2

    .line 1
    invoke-static {}, Llq;->a()Llq$a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Llq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llq$a;->b(Ljava/lang/String;)Llq$a;

    .line 3
    invoke-virtual {v0, p1}, Llq$a;->d(Lxo;)Llq$a;

    .line 4
    invoke-virtual {p0}, Llq;->c()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Llq$a;->c([B)Llq$a;

    .line 5
    invoke-virtual {v0}, Llq$a;->a()Llq;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Llq;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 2
    invoke-virtual {p0}, Llq;->d()Lxo;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 3
    invoke-virtual {p0}, Llq;->c()[B

    move-result-object v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const v1, 0x30de

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Llq;->c()[B

    move-result-object v1

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    :goto_0
    aput-object v1, v0, v2

    const v1, 0x30df

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
