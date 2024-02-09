.class public Lpa0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static d:Lpa0;


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Lcom/olive/upi/transport/model/Registration;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lpa0;
    .locals 1

    .line 1
    sget-object v0, Lpa0;->d:Lpa0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lpa0;

    invoke-direct {v0}, Lpa0;-><init>()V

    sput-object v0, Lpa0;->d:Lpa0;

    .line 3
    :cond_0
    sget-object v0, Lpa0;->d:Lpa0;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lpa0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/olive/upi/transport/model/Registration;
    .locals 1

    .line 1
    iget-object v0, p0, Lpa0;->c:Lcom/olive/upi/transport/model/Registration;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lpa0;->a:I

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpa0;->b:Ljava/lang/String;

    return-void
.end method

.method public f(Lcom/olive/upi/transport/model/Registration;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpa0;->c:Lcom/olive/upi/transport/model/Registration;

    return-void
.end method

.method public g(I)V
    .locals 0

    .line 1
    iput p1, p0, Lpa0;->a:I

    return-void
.end method
