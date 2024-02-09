.class public Lqa0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqa0;->N(Lqa0$e;)Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/olive/upi/transport/model/BeneVpa;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lqa0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/olive/upi/transport/model/BeneVpa;Lcom/olive/upi/transport/model/BeneVpa;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/olive/upi/transport/model/BeneVpa;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/olive/upi/transport/model/BeneVpa;

    check-cast p2, Lcom/olive/upi/transport/model/BeneVpa;

    invoke-virtual {p0, p1, p2}, Lqa0$a;->a(Lcom/olive/upi/transport/model/BeneVpa;Lcom/olive/upi/transport/model/BeneVpa;)I

    move-result p1

    return p1
.end method
