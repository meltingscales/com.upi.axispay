.class public final Lou$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lou;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lou;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lou;

    invoke-direct {v0}, Lou;-><init>()V

    sput-object v0, Lou$a;->a:Lou;

    return-void
.end method

.method public static synthetic a()Lou;
    .locals 1

    .line 1
    sget-object v0, Lou$a;->a:Lou;

    return-object v0
.end method
