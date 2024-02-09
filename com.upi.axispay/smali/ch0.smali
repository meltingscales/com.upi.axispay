.class public final Lch0;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lch0$a;
    }
.end annotation


# static fields
.field public static final e:Lch0$a;

.field public static f:Lch0;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/accounts/Account;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lch0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lch0$a;-><init>(Lvl0;)V

    sput-object v0, Lch0;->e:Lch0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x291

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lch0;->c:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lch0;->d:Ljava/lang/String;

    .line 4
    sput-object p0, Lch0;->f:Lch0;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const v0, 0x292

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x293

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    iput-object v0, p0, Lch0;->c:Ljava/lang/String;

    .line 7
    iput-object v0, p0, Lch0;->d:Ljava/lang/String;

    .line 8
    iput-object p1, p0, Lch0;->a:Landroid/content/Context;

    .line 9
    sput-object p0, Lch0;->f:Lch0;

    return-void
.end method

.method public static final synthetic a()Lch0;
    .locals 1

    .line 1
    sget-object v0, Lch0;->f:Lch0;

    return-object v0
.end method

.method public static final synthetic b(Lch0;)V
    .locals 0

    .line 1
    sput-object p0, Lch0;->f:Lch0;

    return-void
.end method


# virtual methods
.method public final c()Landroid/accounts/Account;
    .locals 6

    .line 1
    iget-object v0, p0, Lch0;->a:Landroid/content/Context;

    const v1, 0x294

    invoke-static {v1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    const v3, 0x295

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const v3, 0x296

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/accounts/AccountManager;

    .line 2
    new-instance v3, Landroid/accounts/Account;

    iget-object v4, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v4, :cond_2

    const v5, 0x7f12008a

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v1, v4, :cond_0

    .line 4
    invoke-virtual {v0, v3, v2, v2}, Landroid/accounts/AccountManager;->addAccountExplicitly(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    sget-object v0, Ln70;->f:Ln70$a;

    invoke-virtual {v0}, Ln70$a;->a()Ln70;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const v4, 0x297

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v1, v2}, Ln70;->w(Ljava/lang/String;IZ)V

    :cond_0
    return-object v3

    .line 6
    :cond_1
    invoke-static {v1}, Lyl0;->t(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v1}, Lyl0;->t(Ljava/lang/String;)V

    throw v2

    .line 7
    :cond_3
    invoke-static {v1}, Lyl0;->t(Ljava/lang/String;)V

    throw v2
.end method

.method public final d()Z
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x17

    if-ge v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lch0;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const v3, 0x298

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_8

    const v4, 0x299

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const v4, 0x29a

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/accounts/AccountManager;

    .line 3
    iget-object v4, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v5, :cond_6

    const v6, 0x7f12008a

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Landroid/accounts/AccountManager;->getAccountsByTypeForPackage(Ljava/lang/String;Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v4

    const v5, 0x29b

    invoke-static {v5}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    array-length v4, v4

    const/4 v5, 0x1

    if-lez v4, :cond_1

    :goto_0
    move v1, v5

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v0

    const v4, 0x29c

    invoke-static {v4}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    array-length v4, v0

    move v7, v1

    :cond_2
    if-ge v7, v4, :cond_5

    aget-object v8, v0, v7

    add-int/lit8 v7, v7, 0x1

    .line 7
    iget-object v9, v8, Landroid/accounts/Account;->name:Ljava/lang/String;

    iget-object v10, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v10, :cond_4

    invoke-virtual {v10, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    iget-object v8, v8, Landroid/accounts/Account;->type:Ljava/lang/String;

    iget-object v9, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_0

    :cond_3
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_1
    return v1

    .line 8
    :cond_6
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V

    throw v2

    .line 9
    :cond_8
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V

    throw v2
.end method

.method public final e()Landroid/accounts/AccountManager;
    .locals 6

    .line 1
    iget-object v1, p0, Lch0;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const v0, 0x29d

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v1, :cond_3

    const v0, 0x29e

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0x29f

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v1, Landroid/accounts/AccountManager;

    .line 2
    :try_start_0
    iget-object v4, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lch0;->a:Landroid/content/Context;

    if-eqz v5, :cond_1

    const v2, 0x7f12008a

    invoke-virtual {v5, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Landroid/accounts/AccountManager;->getAccountsByTypeForPackage(Ljava/lang/String;Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v2

    const v0, 0x2a0

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v3, v2

    if-lez v3, :cond_0

    const/4 v3, 0x0

    .line 4
    aget-object v2, v2, v3

    iput-object v2, p0, Lch0;->b:Landroid/accounts/Account;

    .line 5
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v0, 0x2a1

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v5, v3}, Ln70;->w(Ljava/lang/String;IZ)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lch0;->c()Landroid/accounts/Account;

    move-result-object v2

    iput-object v2, p0, Lch0;->b:Landroid/accounts/Account;

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    throw v2

    :cond_2
    :try_start_1
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    throw v2

    :catch_0
    :goto_0
    return-object v1

    .line 8
    :cond_3
    invoke-static {v3}, Lyl0;->t(Ljava/lang/String;)V

    throw v2
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lch0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lch0;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 4

    const v0, 0x2a2

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2a3

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lyl0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lch0;->e()Landroid/accounts/AccountManager;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lch0;->b:Landroid/accounts/Account;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-virtual {v0, v1, p1}, Landroid/accounts/AccountManager;->getUserData(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v1

    goto :goto_1

    .line 5
    :cond_2
    :goto_0
    iget-object p3, p0, Lch0;->b:Landroid/accounts/Account;

    invoke-virtual {v0, p3, p1, p2}, Landroid/accounts/AccountManager;->setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    :goto_1
    const p3, 0x2a4

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 6
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const v0, 0x2a5

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p3, :cond_3

    .line 7
    invoke-static {p2, v0}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lch0;->c:Ljava/lang/String;

    goto :goto_2

    :cond_3
    const p3, 0x2a6

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    .line 8
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 9
    invoke-static {p2, v0}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lch0;->d:Ljava/lang/String;

    :cond_4
    :goto_2
    return v2
.end method

.method public final i()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lch0;->e()Landroid/accounts/AccountManager;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lch0;->b:Landroid/accounts/Account;

    if-eqz v1, :cond_1

    const v2, 0x2a7

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/accounts/AccountManager;->getUserData(Landroid/accounts/Account;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-static {}, Lcom/olive/upi/transport/service/CryptLibOne;->createAesKey()Ljava/lang/String;

    move-result-object v1

    .line 6
    iget-object v3, p0, Lch0;->b:Landroid/accounts/Account;

    invoke-virtual {v0, v3, v2, v1}, Landroid/accounts/AccountManager;->setUserData(Landroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const v0, 0x2a8

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {v1, v0}, Lyl0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lch0;->d:Ljava/lang/String;

    :cond_1
    return-void
.end method
