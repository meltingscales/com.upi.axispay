.class public Li30$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li30;->a()Lm30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lk30;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Li30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lk30;Lk30;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lk30;->e()I

    move-result p1

    invoke-virtual {p2}, Lk30;->e()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lk30;

    check-cast p2, Lk30;

    invoke-virtual {p0, p1, p2}, Li30$a;->a(Lk30;Lk30;)I

    move-result p1

    return p1
.end method
