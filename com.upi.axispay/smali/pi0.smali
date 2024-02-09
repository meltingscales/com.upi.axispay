.class public final Lpi0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final a:Lpi0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpi0;

    invoke-direct {v0}, Lpi0;-><init>()V

    sput-object v0, Lpi0;->a:Lpi0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const v0, 0x31b2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
