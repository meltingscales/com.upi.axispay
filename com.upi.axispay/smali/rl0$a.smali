.class public Lrl0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrl0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final b:Lrl0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lrl0$a;

    invoke-direct {v0}, Lrl0$a;-><init>()V

    sput-object v0, Lrl0$a;->b:Lrl0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lrl0$a;
    .locals 1

    .line 1
    sget-object v0, Lrl0$a;->b:Lrl0$a;

    return-object v0
.end method
