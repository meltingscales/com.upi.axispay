.class public Lcm$b$a;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcm$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Lcm$a;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcm$b$a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcm$b;
    .locals 5

    .line 1
    iget-object v0, p0, Lcm$b$a;->c:Lcm$a;

    if-eqz v0, :cond_3

    .line 2
    iget-object v0, p0, Lcm$b$a;->a:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 3
    iget-boolean v0, p0, Lcm$b$a;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcm$b$a;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const v1, 0x2cc2

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    :goto_0
    new-instance v0, Lcm$b;

    iget-object v1, p0, Lcm$b$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcm$b$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lcm$b$a;->c:Lcm$a;

    iget-boolean v4, p0, Lcm$b$a;->d:Z

    invoke-direct {v0, v1, v2, v3, v4}, Lcm$b;-><init>(Landroid/content/Context;Ljava/lang/String;Lcm$a;Z)V

    return-object v0

    .line 6
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const v1, 0x2cc3

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const v1, 0x2cc4

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lcm$a;)Lcm$b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcm$b$a;->c:Lcm$a;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcm$b$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcm$b$a;->b:Ljava/lang/String;

    return-object p0
.end method
