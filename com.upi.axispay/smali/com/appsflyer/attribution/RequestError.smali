.class public Lcom/appsflyer/attribution/RequestError;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static EVENT_TIMEOUT:I

.field public static NETWORK_FAILURE:I

.field public static NO_DEV_KEY:I

.field public static RESPONSE_CODE_FAILURE:I

.field public static STOP_TRACKING:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/appsflyer/attribution/RequestError;

    const v1, 0xf7

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
