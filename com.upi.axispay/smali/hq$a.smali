.class public final Lhq$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lhq;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhq;

    invoke-direct {v0}, Lhq;-><init>()V

    sput-object v0, Lhq$a;->a:Lhq;

    return-void
.end method

.method public static synthetic a()Lhq;
    .locals 1

    .line 1
    sget-object v0, Lhq$a;->a:Lhq;

    return-object v0
.end method
