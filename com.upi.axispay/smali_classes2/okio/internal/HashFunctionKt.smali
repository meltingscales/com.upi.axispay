.class public final Lokio/internal/HashFunctionKt;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public static final newHashFunction(Ljava/lang/String;)Lokio/internal/HashFunction;
    .locals 1

    const v0, 0x24e2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lokio/internal/HashFunctionKt$newHashFunction$1;

    invoke-direct {v0, p0}, Lokio/internal/HashFunctionKt$newHashFunction$1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
