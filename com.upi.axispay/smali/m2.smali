.class public final Lm2;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm2$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/View;)Lqc$c;
    .locals 1

    .line 1
    new-instance v0, Lm2$a;

    invoke-direct {v0, p0}, Lm2$a;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public static b(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x18

    if-lt v0, v2, :cond_4

    .line 2
    invoke-virtual {p1}, Landroid/view/DragEvent;->getLocalState()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    .line 3
    invoke-static {p0}, Lac;->F(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    invoke-static {p0}, Lm2;->d(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x2c26

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const p1, 0x2c27

    invoke-static {p1}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 6
    :cond_1
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 7
    instance-of p0, p0, Landroid/widget/TextView;

    xor-int/2addr p0, v3

    return p0

    .line 8
    :cond_2
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    .line 9
    instance-of v1, p0, Landroid/widget/TextView;

    if-eqz v1, :cond_3

    .line 10
    check-cast p0, Landroid/widget/TextView;

    invoke-static {p1, p0, v0}, Lm2$b;->a(Landroid/view/DragEvent;Landroid/widget/TextView;Landroid/app/Activity;)Z

    move-result p0

    goto :goto_0

    .line 11
    :cond_3
    invoke-static {p1, p0, v0}, Lm2$b;->b(Landroid/view/DragEvent;Landroid/view/View;Landroid/app/Activity;)Z

    move-result p0

    :goto_0
    return p0

    :cond_4
    :goto_1
    return v1
.end method

.method public static c(Landroid/widget/TextView;I)Z
    .locals 5

    const/4 v0, 0x0

    const v1, 0x1020022

    if-eq p1, v1, :cond_0

    const v2, 0x1020031

    if-ne p1, v2, :cond_1

    .line 1
    :cond_0
    invoke-static {p0}, Lac;->F(Landroid/view/View;)[Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    :cond_1
    return v0

    .line 2
    :cond_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x2c28

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ClipboardManager;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_0

    .line 3
    :cond_3
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v2

    :goto_0
    const/4 v3, 0x1

    if-eqz v2, :cond_5

    .line 4
    invoke-virtual {v2}, Landroid/content/ClipData;->getItemCount()I

    move-result v4

    if-lez v4, :cond_5

    .line 5
    new-instance v4, Lgb$a;

    invoke-direct {v4, v2, v3}, Lgb$a;-><init>(Landroid/content/ClipData;I)V

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    move v0, v3

    .line 6
    :goto_1
    invoke-virtual {v4, v0}, Lgb$a;->c(I)Lgb$a;

    .line 7
    invoke-virtual {v4}, Lgb$a;->a()Lgb;

    move-result-object p1

    .line 8
    invoke-static {p0, p1}, Lac;->g0(Landroid/view/View;Lgb;)Lgb;

    :cond_5
    return v3
.end method

.method public static d(Landroid/view/View;)Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    .line 2
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 3
    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 4
    check-cast p0, Landroid/app/Activity;

    return-object p0

    .line 5
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
