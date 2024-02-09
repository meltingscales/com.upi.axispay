.class public final Lid$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljd$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljd$b<",
        "Lv4<",
        "Llc;",
        ">;",
        "Llc;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv4;

    invoke-virtual {p0, p1, p2}, Lid$b;->c(Lv4;I)Llc;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lv4;

    invoke-virtual {p0, p1}, Lid$b;->d(Lv4;)I

    move-result p1

    return p1
.end method

.method public c(Lv4;I)Llc;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv4<",
            "Llc;",
            ">;I)",
            "Llc;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Lv4;->k(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llc;

    return-object p1
.end method

.method public d(Lv4;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv4<",
            "Llc;",
            ">;)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lv4;->j()I

    move-result p1

    return p1
.end method
