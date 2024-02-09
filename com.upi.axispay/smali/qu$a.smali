.class public final Lqu$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lqu;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lqu;

    invoke-direct {v0}, Lqu;-><init>()V

    sput-object v0, Lqu$a;->a:Lqu;

    return-void
.end method

.method public static synthetic a()Lqu;
    .locals 1

    .line 1
    sget-object v0, Lqu$a;->a:Lqu;

    return-object v0
.end method
