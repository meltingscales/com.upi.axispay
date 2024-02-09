.class public final Lv40;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lc30;


# instance fields
.field public final a:Lq40;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lq40;

    invoke-direct {v0}, Lq40;-><init>()V

    iput-object v0, p0, Lv40;->a:Lq40;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lw20;IILjava/util/Map;)Ln30;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lw20;",
            "II",
            "Ljava/util/Map<",
            "Ly20;",
            "*>;)",
            "Ln30;"
        }
    .end annotation

    .line 1
    sget-object v0, Lw20;->p:Lw20;

    if-ne p2, v0, :cond_0

    .line 2
    iget-object v1, p0, Lv40;->a:Lq40;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const p2, 0x2334

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lw20;->i:Lw20;

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lu40;->a(Ljava/lang/String;Lw20;IILjava/util/Map;)Ln30;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const p3, 0x2335

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
