.class public final Ljc;
.super Landroid/text/style/ClickableSpan;
.source "AxisPay"


# instance fields
.field public final b:I

.field public final c:Llc;

.field public final d:I


# direct methods
.method public constructor <init>(ILlc;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    iput p1, p0, Ljc;->b:I

    .line 3
    iput-object p2, p0, Ljc;->c:Llc;

    .line 4
    iput p3, p0, Ljc;->d:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 2
    iget v0, p0, Ljc;->b:I

    const v1, 0x2619

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 3
    iget-object v0, p0, Ljc;->c:Llc;

    iget v1, p0, Ljc;->d:I

    invoke-virtual {v0, v1, p1}, Llc;->Q(ILandroid/os/Bundle;)Z

    return-void
.end method
