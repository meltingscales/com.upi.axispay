.class public abstract Lm8$f;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation


# instance fields
.field public a:Lm8$e;

.field public b:Ljava/lang/CharSequence;

.field public c:Ljava/lang/CharSequence;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lm8$f;->d:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm8$f;->d:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lm8$f;->c:Ljava/lang/CharSequence;

    const v1, 0x1de4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lm8$f;->b:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    const v1, 0x1de5

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 5
    :cond_1
    invoke-virtual {p0}, Lm8$f;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, 0x1de6

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public abstract b(Ll8;)V
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public d(Ll8;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Ll8;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public f(Ll8;)Landroid/widget/RemoteViews;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public g(Lm8$e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm8$f;->a:Lm8$e;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lm8$f;->a:Lm8$e;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Lm8$e;->s(Lm8$f;)Lm8$e;

    :cond_0
    return-void
.end method
