.class public final Lvh0$b;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final synthetic a:[Lan0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lan0;

    new-instance v1, Lfm0;

    const-class v2, Lvh0$b;

    invoke-static {v2}, Lkm0;->a(Ljava/lang/Class;)Lwm0;

    move-result-object v2

    const v3, 0x217a

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x217b

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lfm0;-><init>(Lxm0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkm0;->d(Lem0;)Lcn0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lvh0$b;->a:[Lan0;

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
    invoke-direct {p0}, Lvh0$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lvh0$b;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lvh0$b;->b()Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/lang/reflect/Field;
    .locals 3

    invoke-static {}, Lvh0;->c()Lci0;

    move-result-object v0

    sget-object v1, Lvh0;->h:Lvh0$b;

    sget-object v1, Lvh0$b;->a:[Lan0;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0}, Lci0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    return-object v0
.end method
