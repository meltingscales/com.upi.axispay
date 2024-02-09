.class public Lbh$d$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:I


# direct methods
.method public constructor <init>(Lbh$d;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lbh$d$b;->a:Ljava/lang/Object;

    .line 3
    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lbh$d$b;->b:I

    goto :goto_0

    .line 5
    :cond_0
    instance-of p1, p2, Lyh$i;

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    .line 6
    iput p1, p0, Lbh$d$b;->b:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lbh$d$b;->b:I

    const p1, 0x11a0

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    const p2, 0x11a1

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 8
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbh$d$b;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget v0, p0, Lbh$d$b;->b:I

    return v0
.end method
