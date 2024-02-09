.class public final Lqh0;
.super Landroid/content/ContextWrapper;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqh0$a;
    }
.end annotation


# static fields
.field public static final synthetic b:[Lan0;

.field public static final c:Lqh0$a;


# instance fields
.field public final a:Lci0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lan0;

    new-instance v1, Lfm0;

    const-class v2, Lqh0;

    invoke-static {v2}, Lkm0;->a(Ljava/lang/Class;)Lwm0;

    move-result-object v2

    const v3, 0x1fee

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x1fef

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Lfm0;-><init>(Lxm0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkm0;->d(Lem0;)Lcn0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lqh0;->b:[Lan0;

    new-instance v0, Lqh0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqh0$a;-><init>(Lvl0;)V

    sput-object v0, Lqh0;->c:Lqh0$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 2
    sget-object p1, Lei0;->d:Lei0;

    new-instance v0, Lqh0$b;

    invoke-direct {v0, p0}, Lqh0$b;-><init>(Lqh0;)V

    invoke-static {p1, v0}, Ldi0;->a(Lei0;Lsk0;)Lci0;

    move-result-object p1

    iput-object p1, p0, Lqh0;->a:Lci0;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lvl0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lqh0;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final b(Landroid/content/Context;)Landroid/content/ContextWrapper;
    .locals 1

    sget-object v0, Lqh0;->c:Lqh0$a;

    invoke-virtual {v0, p0}, Lqh0$a;->a(Landroid/content/Context;)Landroid/content/ContextWrapper;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lvh0;
    .locals 3

    iget-object v0, p0, Lqh0;->a:Lci0;

    sget-object v1, Lqh0;->b:[Lan0;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0}, Lci0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh0;

    return-object v0
.end method

.method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const v0, 0x1ff0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1ff1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1
    invoke-static {v0, p1}, Lyl0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lqh0;->a()Lvh0;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
