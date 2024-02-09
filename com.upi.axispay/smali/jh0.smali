.class public Ljh0;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljh0;->b:I

    .line 3
    iput v0, p0, Ljh0;->c:I

    .line 4
    iput-object p1, p0, Ljh0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Ljh0;->b:I

    iput v0, p0, Ljh0;->c:I

    add-int v1, v0, p1

    .line 2
    iput v1, p0, Ljh0;->b:I

    .line 3
    iget-object v1, p0, Ljh0;->a:Ljava/lang/String;

    add-int/2addr p1, v0

    invoke-virtual {v1, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Z
    .locals 1

    .line 1
    iget v0, p0, Ljh0;->b:I

    add-int/2addr v0, p1

    iget-object p1, p0, Ljh0;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-gt v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
