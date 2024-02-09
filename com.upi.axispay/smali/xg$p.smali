.class public final Lxg$p;
.super Lyh$b;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "p"
.end annotation


# instance fields
.field public final synthetic a:Lxg;


# direct methods
.method public constructor <init>(Lxg;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxg$p;->a:Lxg;

    invoke-direct {p0}, Lyh$b;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lyh;Lyh$i;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lxg$p;->a:Lxg;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lxg;->H(Z)V

    return-void
.end method

.method public k(Lyh;Lyh$i;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lxg$p;->a:Lxg;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lxg;->H(Z)V

    return-void
.end method

.method public m(Lyh;Lyh$i;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lxg$p;->a:Lxg;

    iget-object p1, p1, Lxg;->R:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    .line 2
    invoke-virtual {p2}, Lyh$i;->r()I

    move-result v0

    .line 3
    sget-boolean v1, Lxg;->q0:Z

    if-eqz v1, :cond_0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x32c3

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    :cond_0
    if-eqz p1, :cond_1

    .line 5
    iget-object v1, p0, Lxg$p;->a:Lxg;

    iget-object v1, v1, Lxg;->M:Lyh$i;

    if-eq v1, p2, :cond_1

    .line 6
    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_1
    return-void
.end method
