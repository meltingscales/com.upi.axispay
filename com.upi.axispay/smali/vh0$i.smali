.class public final Lvh0$i;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/LayoutInflater$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final b:Lkh0;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater$Factory;)V
    .locals 1

    const v0, 0x2127

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lvh0$j;

    invoke-direct {v0, p1}, Lvh0$j;-><init>(Landroid/view/LayoutInflater$Factory;)V

    iput-object v0, p0, Lvh0$i;->b:Lkh0;

    return-void
.end method


# virtual methods
.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    const v0, 0x2128

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2129

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lph0;->h:Lph0$c;

    invoke-virtual {v0}, Lph0$c;->b()Lph0;

    move-result-object v0

    .line 2
    new-instance v9, Llh0;

    .line 3
    iget-object v6, p0, Lvh0$i;->b:Lkh0;

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v1, v9

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 4
    invoke-direct/range {v1 .. v8}, Llh0;-><init>(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Landroid/view/View;Lkh0;ILvl0;)V

    invoke-virtual {v0, v9}, Lph0;->d(Llh0;)Lmh0;

    move-result-object p1

    invoke-virtual {p1}, Lmh0;->e()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
