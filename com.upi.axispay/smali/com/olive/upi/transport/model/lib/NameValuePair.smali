.class public Lcom/olive/upi/transport/model/lib/NameValuePair;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public name:Ljava/lang/String;

.field public value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/olive/upi/transport/model/lib/NameValuePair;->name:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/olive/upi/transport/model/lib/NameValuePair;->value:Ljava/lang/String;

    return-void
.end method
