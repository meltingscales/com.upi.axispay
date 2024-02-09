.class public final Lxj0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lyj0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxj0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lyj0$b<",
        "Lxj0;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic a:Lxj0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxj0$a;

    invoke-direct {v0}, Lxj0$a;-><init>()V

    sput-object v0, Lxj0$a;->a:Lxj0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
