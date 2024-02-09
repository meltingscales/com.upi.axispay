.class public Llm0;
.super Ljava/lang/Object;
.source "AxisPay"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lwm0;
    .locals 1

    .line 1
    new-instance v0, Ltl0;

    invoke-direct {v0, p1}, Ltl0;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;Ljava/lang/String;)Lxm0;
    .locals 1

    .line 1
    new-instance v0, Ldm0;

    invoke-direct {v0, p1, p2}, Ldm0;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(Lam0;)Lzm0;
    .locals 0

    return-object p1
.end method

.method public d(Lem0;)Lcn0;
    .locals 0

    return-object p1
.end method

.method public e(Lwl0;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const v0, 0x35be

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public f(Lzl0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Llm0;->e(Lwl0;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
