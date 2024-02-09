.class public Lcom/olive/upi/transport/model/TagList;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public tag:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/NameVal;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTag()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/NameVal;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/olive/upi/transport/model/TagList;->tag:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setTag(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/olive/upi/transport/model/NameVal;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/olive/upi/transport/model/TagList;->tag:Ljava/util/ArrayList;

    return-void
.end method
