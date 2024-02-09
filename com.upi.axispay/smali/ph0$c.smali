.class public final Lph0$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final synthetic a:[Lan0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lan0;

    new-instance v1, Lfm0;

    const-class v2, Lph0$c;

    invoke-static {v2}, Lkm0;->a(Ljava/lang/Class;)Lwm0;

    move-result-object v2

    const v3, 0x3728

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x3729

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lfm0;-><init>(Lxm0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkm0;->d(Lem0;)Lcn0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lph0$c;->a:[Lan0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvl0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lph0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lph0$a;
    .locals 1

    .line 1
    new-instance v0, Lph0$a;

    invoke-direct {v0}, Lph0$a;-><init>()V

    return-object v0
.end method

.method public final b()Lph0;
    .locals 1

    .line 1
    invoke-static {}, Lph0;->a()Lph0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lph0$c;->a()Lph0$a;

    move-result-object v0

    invoke-virtual {v0}, Lph0$a;->b()Lph0;

    move-result-object v0

    invoke-static {v0}, Lph0;->b(Lph0;)V

    :goto_0
    return-object v0
.end method

.method public final c(Lph0;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lph0;->b(Lph0;)V

    return-void
.end method
