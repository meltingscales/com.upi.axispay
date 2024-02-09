.class public final Lph0$b;
.super Lzl0;
.source "AxisPay"

# interfaces
.implements Lsk0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzl0;",
        "Lsk0<",
        "Luh0;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lph0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lph0$b;

    invoke-direct {v0}, Lph0$b;-><init>()V

    sput-object v0, Lph0$b;->b:Lph0$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lzl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Luh0;
    .locals 1

    .line 1
    new-instance v0, Luh0;

    invoke-direct {v0}, Luh0;-><init>()V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lph0$b;->b()Luh0;

    move-result-object v0

    return-object v0
.end method
