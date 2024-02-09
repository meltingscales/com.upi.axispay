.class public final Lokhttp3/internal/graal/TargetPlatform;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation runtime Lcom/oracle/svm/core/annotate/TargetClass;
    value = Lokhttp3/internal/platform/Platform$Companion;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final findPlatform()Lokhttp3/internal/platform/Platform;
    .locals 1
    .annotation runtime Lcom/oracle/svm/core/annotate/Substitute;
    .end annotation

    .line 1
    sget-object v0, Lokhttp3/internal/platform/Jdk9Platform;->Companion:Lokhttp3/internal/platform/Jdk9Platform$Companion;

    invoke-virtual {v0}, Lokhttp3/internal/platform/Jdk9Platform$Companion;->buildIfSupported()Lokhttp3/internal/platform/Jdk9Platform;

    move-result-object v0

    invoke-static {v0}, Lyl0;->c(Ljava/lang/Object;)V

    return-object v0
.end method
