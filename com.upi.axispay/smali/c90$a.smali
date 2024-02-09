.class public Lc90$a;
.super Landroid/content/BroadcastReceiver;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lc90;


# direct methods
.method public constructor <init>(Lc90;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc90$a;->a:Lc90;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p2, :cond_8

    .line 1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const v1, 0x1da8

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 4
    iget-object p1, p0, Lc90$a;->a:Lc90;

    iget p1, p1, Lc90;->r:I

    const/16 v0, 0x16

    if-ne p1, v0, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    const p2, 0x1da9

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const p1, 0x1daa

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    .line 7
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const p2, 0x1dab

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    const p2, 0x1dac

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    .line 8
    :cond_3
    iget-object p1, p0, Lc90$a;->a:Lc90;

    iget p2, p1, Lc90;->u:I

    invoke-virtual {p1, p2}, Lc90;->b0(I)V

    goto :goto_1

    .line 9
    :cond_4
    iget-object p1, p0, Lc90$a;->a:Lc90;

    iget p2, p1, Lc90;->v:I

    invoke-virtual {p1, p2}, Lc90;->b0(I)V

    goto :goto_1

    :cond_5
    const p2, 0x1dad

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    const p2, 0x1dae

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    .line 11
    :cond_6
    invoke-static {p1}, Lc70;->n(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x1

    .line 12
    sput-boolean p1, Lc90;->C:Z

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    .line 13
    sput-boolean p1, Lc90;->C:Z

    :cond_8
    :goto_1
    return-void
.end method
