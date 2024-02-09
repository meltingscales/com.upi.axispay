.class public final Lyf$c$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lqf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyf$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lpf;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lpf;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    new-instance p1, Lyf$c;

    invoke-direct {p1}, Lyf$c;-><init>()V

    return-object p1
.end method
