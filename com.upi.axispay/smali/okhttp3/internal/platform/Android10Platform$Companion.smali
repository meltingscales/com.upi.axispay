.class public final Lokhttp3/internal/platform/Android10Platform$Companion;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/platform/Android10Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvl0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lokhttp3/internal/platform/Android10Platform$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildIfSupported()Lokhttp3/internal/platform/Platform;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/platform/Android10Platform$Companion;->isSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lokhttp3/internal/platform/Android10Platform;

    invoke-direct {v0}, Lokhttp3/internal/platform/Android10Platform;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final isSupported()Z
    .locals 1

    .line 1
    invoke-static {}, Lokhttp3/internal/platform/Android10Platform;->access$isSupported$cp()Z

    move-result v0

    return v0
.end method
