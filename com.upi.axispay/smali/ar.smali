.class public Lar;
.super Ljava/lang/Object;
.source "AxisPay"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lzu;

.field public final c:Lzu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lzu;Lzu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lar;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lar;->b:Lzu;

    .line 4
    iput-object p3, p0, Lar;->c:Lzu;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lzq;
    .locals 3

    .line 1
    iget-object v0, p0, Lar;->a:Landroid/content/Context;

    iget-object v1, p0, Lar;->b:Lzu;

    iget-object v2, p0, Lar;->c:Lzu;

    invoke-static {v0, v1, v2, p1}, Lzq;->a(Landroid/content/Context;Lzu;Lzu;Ljava/lang/String;)Lzq;

    move-result-object p1

    return-object p1
.end method
