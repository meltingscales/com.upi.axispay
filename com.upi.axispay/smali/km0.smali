.class public Lkm0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static final a:Llm0;

.field public static final b:[Lwm0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const v2, 0x38e2

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llm0;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Llm0;

    invoke-direct {v0}, Llm0;-><init>()V

    :goto_0
    sput-object v0, Lkm0;->a:Llm0;

    const/4 v0, 0x0

    new-array v0, v0, [Lwm0;

    .line 4
    sput-object v0, Lkm0;->b:[Lwm0;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lwm0;
    .locals 1

    .line 1
    sget-object v0, Lkm0;->a:Llm0;

    invoke-virtual {v0, p0}, Llm0;->a(Ljava/lang/Class;)Lwm0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lxm0;
    .locals 2

    .line 1
    sget-object v0, Lkm0;->a:Llm0;

    const v1, 0x38e3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Llm0;->b(Ljava/lang/Class;Ljava/lang/String;)Lxm0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lam0;)Lzm0;
    .locals 1

    .line 1
    sget-object v0, Lkm0;->a:Llm0;

    invoke-virtual {v0, p0}, Llm0;->c(Lam0;)Lzm0;

    return-object p0
.end method

.method public static d(Lem0;)Lcn0;
    .locals 1

    .line 1
    sget-object v0, Lkm0;->a:Llm0;

    invoke-virtual {v0, p0}, Llm0;->d(Lem0;)Lcn0;

    return-object p0
.end method

.method public static e(Lzl0;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lkm0;->a:Llm0;

    invoke-virtual {v0, p0}, Llm0;->f(Lzl0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
