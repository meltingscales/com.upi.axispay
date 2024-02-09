.class public final Lpm0$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpm0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvl0;)V
    .locals 0

    invoke-direct {p0}, Lpm0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Lpm0;
    .locals 1

    .line 1
    new-instance v0, Lpm0;

    invoke-direct {v0, p1, p2, p3}, Lpm0;-><init>(III)V

    return-object v0
.end method
