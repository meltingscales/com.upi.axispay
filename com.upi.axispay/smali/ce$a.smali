.class public Lce$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lqf$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lce;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
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
    .locals 1
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
    new-instance p1, Lce;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lce;-><init>(Z)V

    return-object p1
.end method