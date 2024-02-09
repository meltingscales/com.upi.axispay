.class public final Lbv$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lbv;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbv;

    invoke-direct {v0}, Lbv;-><init>()V

    sput-object v0, Lbv$a;->a:Lbv;

    return-void
.end method

.method public static synthetic a()Lbv;
    .locals 1

    .line 1
    sget-object v0, Lbv$a;->a:Lbv;

    return-object v0
.end method
