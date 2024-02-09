.class public final La30;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lc30;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ld30;
        }
    .end annotation

    .line 1
    sget-object v0, La30$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const p3, 0x124f

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :pswitch_0
    new-instance v0, Le30;

    invoke-direct {v0}, Le30;-><init>()V

    goto :goto_0

    .line 4
    :pswitch_1
    new-instance v0, Ls30;

    invoke-direct {v0}, Ls30;-><init>()V

    goto :goto_0

    .line 5
    :pswitch_2
    new-instance v0, Li40;

    invoke-direct {v0}, Li40;-><init>()V

    goto :goto_0

    .line 6
    :pswitch_3
    new-instance v0, La50;

    invoke-direct {v0}, La50;-><init>()V

    goto :goto_0

    .line 7
    :pswitch_4
    new-instance v0, Ls40;

    invoke-direct {v0}, Ls40;-><init>()V

    goto :goto_0

    .line 8
    :pswitch_5
    new-instance v0, Lk40;

    invoke-direct {v0}, Lk40;-><init>()V

    goto :goto_0

    .line 9
    :pswitch_6
    new-instance v0, Lo40;

    invoke-direct {v0}, Lo40;-><init>()V

    goto :goto_0

    .line 10
    :pswitch_7
    new-instance v0, Lm40;

    invoke-direct {v0}, Lm40;-><init>()V

    goto :goto_0

    .line 11
    :pswitch_8
    new-instance v0, Li50;

    invoke-direct {v0}, Li50;-><init>()V

    goto :goto_0

    .line 12
    :pswitch_9
    new-instance v0, Lv40;

    invoke-direct {v0}, Lv40;-><init>()V

    goto :goto_0

    .line 13
    :pswitch_a
    new-instance v0, Lq40;

    invoke-direct {v0}, Lq40;-><init>()V

    goto :goto_0

    .line 14
    :pswitch_b
    new-instance v0, Lz40;

    invoke-direct {v0}, Lz40;-><init>()V

    goto :goto_0

    .line 15
    :pswitch_c
    new-instance v0, Lr40;

    invoke-direct {v0}, Lr40;-><init>()V

    :goto_0
    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    .line 16
    invoke-interface/range {v1 .. v6}, Lc30;->a(Ljava/lang/String;Lw20;IILjava/util/Map;)Ln30;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
