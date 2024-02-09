.class public Lvf0$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf0;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lvf0;


# direct methods
.method public constructor <init>(Lvf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvf0$d;->b:Lvf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Leg0;->c()V

    .line 2
    iget-object p1, p0, Lvf0$d;->b:Lvf0;

    iget-object p1, p1, Lxc0;->b:Lmg0;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lmg0;->o(ILjava/lang/Object;)V

    const/4 p1, 0x1

    .line 3
    sput-boolean p1, Lvg0;->b:Z

    .line 4
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x318c

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln70;->e(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lvf0$d;->b:Lvf0;

    invoke-virtual {p1}, Lxc0;->k()Lz;

    move-result-object p1

    invoke-static {p1}, Lzg0;->b(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
