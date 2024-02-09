.class public interface abstract Lio/fabric/sdk/android/services/network/PinningInfoProvider;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final PIN_CREATION_TIME_UNDEFINED:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lio/fabric/sdk/android/services/network/PinningInfoProvider;

    const v1, 0x180

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method


# virtual methods
.method public abstract getKeyStorePassword()Ljava/lang/String;
.end method

.method public abstract getKeyStoreStream()Ljava/io/InputStream;
.end method

.method public abstract getPinCreationTimeInMillis()J
.end method

.method public abstract getPins()[Ljava/lang/String;
.end method
