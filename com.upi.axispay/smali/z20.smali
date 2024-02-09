.class public final Lz20;
.super Lb30;
.source "AxisPay"


# static fields
.field public static final d:Lz20;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz20;

    invoke-direct {v0}, Lz20;-><init>()V

    .line 2
    sput-object v0, Lz20;->d:Lz20;

    sget-object v1, Lb30;->c:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb30;-><init>()V

    return-void
.end method

.method public static a()Lz20;
    .locals 1

    .line 1
    sget-boolean v0, Lb30;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lz20;

    invoke-direct {v0}, Lz20;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Lz20;->d:Lz20;

    return-object v0
.end method
