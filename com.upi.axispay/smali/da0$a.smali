.class public Lda0$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda0;->A(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/olive/upi/transport/model/PendingReqVo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lda0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/olive/upi/transport/model/PendingReqVo;Lcom/olive/upi/transport/model/PendingReqVo;)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object p1

    const v0, 0x2618

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    .line 2
    invoke-virtual {p2}, Lcom/olive/upi/transport/model/PendingReqVo;->getExpdate()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Ljg0;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 4
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    cmp-long p1, v1, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, -0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/olive/upi/transport/model/PendingReqVo;

    check-cast p2, Lcom/olive/upi/transport/model/PendingReqVo;

    invoke-virtual {p0, p1, p2}, Lda0$a;->a(Lcom/olive/upi/transport/model/PendingReqVo;Lcom/olive/upi/transport/model/PendingReqVo;)I

    move-result p1

    return p1
.end method
