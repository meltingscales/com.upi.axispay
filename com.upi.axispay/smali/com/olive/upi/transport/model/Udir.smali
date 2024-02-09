.class public Lcom/olive/upi/transport/model/Udir;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public amtCredit:Ljava/lang/String;

.field public amtDebited:Ljava/lang/String;

.field public complaintInProcess:Z

.field public complaintResolved:Z

.field public isChkTxnInitiated:Z

.field public isComplaintRaised:Z

.field public reasons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/olive/upi/transport/model/UdirReasons;",
            ">;"
        }
    .end annotation
.end field

.field public txnComplete:Ljava/lang/String;

.field public txnInitiated:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/olive/upi/transport/model/Udir;->isComplaintRaised:Z

    .line 3
    iput-boolean v0, p0, Lcom/olive/upi/transport/model/Udir;->isChkTxnInitiated:Z

    .line 4
    iput-boolean v0, p0, Lcom/olive/upi/transport/model/Udir;->complaintInProcess:Z

    .line 5
    iput-boolean v0, p0, Lcom/olive/upi/transport/model/Udir;->complaintResolved:Z

    return-void
.end method
