.class public final Lyh$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lyh;

.field public final b:Lyh$b;

.field public c:Lxh;

.field public d:I


# direct methods
.method public constructor <init>(Lyh;Lyh$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lyh$c;->a:Lyh;

    .line 3
    iput-object p2, p0, Lyh$c;->b:Lyh$b;

    .line 4
    sget-object p1, Lxh;->c:Lxh;

    iput-object p1, p0, Lyh$c;->c:Lxh;

    return-void
.end method


# virtual methods
.method public a(Lyh$i;ILyh$i;I)Z
    .locals 2

    .line 1
    iget v0, p0, Lyh$c;->d:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lyh$c;->c:Lxh;

    .line 2
    invoke-virtual {p1, v0}, Lyh$i;->D(Lxh;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lyh;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lyh$i;->v()Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x106

    if-ne p2, p1, :cond_1

    const/4 p1, 0x3

    if-ne p4, p1, :cond_1

    if-eqz p3, :cond_1

    .line 4
    invoke-virtual {p3}, Lyh$i;->v()Z

    move-result p1

    xor-int/2addr p1, v1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v1
.end method
