.class public final Lhh0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final a:Lhh0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhh0;

    invoke-direct {v0}, Lhh0;-><init>()V

    sput-object v0, Lhh0;->a:Lhh0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lgh0;)V
    .locals 1

    const v0, 0x816

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x817

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1, p2}, Lmyunmn/T;->a(Landroid/content/Context;Lmyunmn/f;)V

    return-void
.end method

.method public final b(Lgh0;)V
    .locals 1

    const v0, 0x818

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lmyunmn/T;->a(Lmyunmn/f;)V

    return-void
.end method
