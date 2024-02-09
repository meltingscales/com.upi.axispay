.class public final Lch0$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lch0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvl0;)V
    .locals 0

    invoke-direct {p0}, Lch0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lch0;
    .locals 2

    .line 1
    invoke-static {}, Lch0;->a()Lch0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lch0;

    invoke-direct {v0}, Lch0;-><init>()V

    invoke-static {v0}, Lch0;->b(Lch0;)V

    .line 2
    :cond_0
    invoke-static {}, Lch0;->a()Lch0;

    move-result-object v0

    const v1, 0x2ca1

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Lch0;
    .locals 1

    const v0, 0x2ca2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lch0;->a()Lch0;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lch0;

    invoke-direct {v0, p1}, Lch0;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lch0;->b(Lch0;)V

    .line 2
    :cond_0
    invoke-static {}, Lch0;->a()Lch0;

    move-result-object p1

    const v0, 0x2ca3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object p1
.end method
