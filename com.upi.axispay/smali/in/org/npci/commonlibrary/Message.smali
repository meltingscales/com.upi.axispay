.class public Lin/org/npci/commonlibrary/Message;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private data:Lin/org/npci/commonlibrary/Data;

.field private subType:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lin/org/npci/commonlibrary/Message;

    const v1, 0x16c

    invoke-static {v0, v1}, Lmyunmn/ao;->a(Ljava/lang/Class;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lin/org/npci/commonlibrary/Data;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lin/org/npci/commonlibrary/Message;->type:Ljava/lang/String;

    iput-object p2, p0, Lin/org/npci/commonlibrary/Message;->subType:Ljava/lang/String;

    iput-object p3, p0, Lin/org/npci/commonlibrary/Message;->data:Lin/org/npci/commonlibrary/Data;

    return-void
.end method


# virtual methods
.method public a()Lin/org/npci/commonlibrary/Data;
    .locals 1

    iget-object v0, p0, Lin/org/npci/commonlibrary/Message;->data:Lin/org/npci/commonlibrary/Data;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lin/org/npci/commonlibrary/Message;->subType:Ljava/lang/String;

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lin/org/npci/commonlibrary/Message;->type:Ljava/lang/String;

    return-void
.end method
