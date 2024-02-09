.class public Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lio/fabric/sdk/android/services/concurrency/internal/RetryPolicy;


# instance fields
.field private final maxRetries:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;->maxRetries:I

    return-void
.end method


# virtual methods
.method public shouldRetry(ILjava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget p2, p0, Lio/fabric/sdk/android/services/concurrency/internal/DefaultRetryPolicy;->maxRetries:I

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
