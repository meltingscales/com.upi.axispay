.class public Leg0;
.super Ljava/lang/Object;
.source "AxisPay"


# static fields
.field public static a:Landroid/app/Dialog;

.field public static b:Landroid/app/Dialog;

.field public static c:Lb70;

.field public static d:Landroid/app/DialogFragment;

.field public static e:Landroid/app/DialogFragment;

.field public static f:Lcom/upi/axispay/custom/LoginPopupFragment;


# direct methods
.method public static A(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d003e

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0505

    .line 3
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 4
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    new-instance p1, Landroid/widget/Toast;

    invoke-direct {p1, p0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x0

    .line 6
    invoke-virtual {p1, p0}, Landroid/widget/Toast;->setDuration(I)V

    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    .line 8
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static B()V
    .locals 1

    .line 1
    sget-object v0, Leg0;->c:Lb70;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 3
    sput-object v0, Leg0;->c:Lb70;

    return-void
.end method

.method public static C(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    sget-object v0, Leg0;->c:Lb70;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const p1, 0x7f120365

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lb70;->setMessage(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method

.method public static a()V
    .locals 1

    .line 1
    sget-object v0, Leg0;->b:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    sput-object v0, Leg0;->b:Landroid/app/Dialog;

    :cond_0
    return-void
.end method

.method public static b()V
    .locals 1

    .line 1
    sget-object v0, Leg0;->b:Landroid/app/Dialog;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public static declared-synchronized c()V
    .locals 3

    const-class v0, Leg0;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Leg0;->d:Landroid/app/DialogFragment;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/DialogFragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    sget-object v1, Leg0;->d:Landroid/app/DialogFragment;

    invoke-virtual {v1}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 3
    sput-object v2, Leg0;->d:Landroid/app/DialogFragment;

    .line 4
    :cond_0
    sput-object v2, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static d()V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Leg0;->f:Lcom/upi/axispay/custom/LoginPopupFragment;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static e()V
    .locals 1

    .line 1
    sget-object v0, Leg0;->e:Landroid/app/DialogFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/DialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Leg0;->e:Landroid/app/DialogFragment;

    invoke-virtual {v0}, Landroid/app/DialogFragment;->dismissAllowingStateLoss()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    sput-object v0, Leg0;->e:Landroid/app/DialogFragment;

    return-void
.end method

.method public static f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 4
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 5
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 6
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    .line 7
    :cond_2
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 8
    :cond_3
    :goto_0
    invoke-static {}, Leg0;->B()V

    .line 9
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 11
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const/4 p0, 0x0

    .line 12
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 13
    invoke-virtual {v0, p3, p4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 14
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    sput-object p0, Leg0;->a:Landroid/app/Dialog;

    .line 15
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public static g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 4
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 6
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    .line 7
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 8
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    .line 9
    :cond_2
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 10
    :cond_3
    :goto_0
    invoke-static {}, Leg0;->B()V

    .line 11
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 12
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_4

    .line 13
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 14
    :cond_4
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 15
    invoke-virtual {v0, p5, p6}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 16
    invoke-virtual {v0, p3, p4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 17
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    sput-object p0, Leg0;->a:Landroid/app/Dialog;

    .line 18
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public static h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-static {}, Leg0;->B()V

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 4
    :cond_2
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    if-eqz v0, :cond_4

    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 6
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_3

    .line 7
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 8
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 9
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    .line 10
    :cond_3
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    sget-object v0, Leg0;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 12
    :cond_4
    :goto_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 13
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 14
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const p0, 0x7f12031d

    .line 15
    new-instance p1, Leg0$a;

    invoke-direct {p1}, Leg0$a;-><init>()V

    invoke-virtual {v0, p0, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 16
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    sput-object p0, Leg0;->a:Landroid/app/Dialog;

    .line 17
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public static i(Landroid/app/Activity;)V
    .locals 1

    if-eqz p0, :cond_0

    const v0, 0x7f120365

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Leg0;->j(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static j(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    sget-object v0, Leg0;->c:Lb70;

    if-nez v0, :cond_2

    .line 3
    new-instance v0, Lb70;

    invoke-direct {v0, p0}, Lb70;-><init>(Landroid/content/Context;)V

    sput-object v0, Leg0;->c:Lb70;

    const/4 p0, 0x0

    .line 4
    invoke-virtual {v0, p0}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 5
    sget-object p0, Leg0;->c:Lb70;

    invoke-virtual {p0}, Landroid/app/ProgressDialog;->show()V

    .line 6
    sget-object p0, Leg0;->c:Lb70;

    invoke-virtual {p0, p1}, Lb70;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 7
    :cond_2
    invoke-virtual {v0, p1}, Lb70;->setMessage(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public static declared-synchronized k(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 3

    const-class v0, Leg0;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 1
    monitor-exit v0

    return-void

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Leg0;->b:Landroid/app/Dialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    .line 3
    :cond_1
    :try_start_1
    new-instance v1, Landroid/app/Dialog;

    invoke-direct {v1, p0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    sput-object v1, Leg0;->b:Landroid/app/Dialog;

    const p0, 0x7f0d0149

    .line 4
    invoke-virtual {v1, p0}, Landroid/app/Dialog;->setContentView(I)V

    .line 5
    sget-object p0, Leg0;->b:Landroid/app/Dialog;

    const v1, 0x7f0a01d0

    invoke-virtual {p0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    .line 6
    sget-object v1, Leg0;->b:Landroid/app/Dialog;

    const v2, 0x7f0a0146

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {v1, p3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-virtual {p0, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-virtual {v1, p4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    sget-object p0, Leg0;->b:Landroid/app/Dialog;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 12
    sget-object p0, Leg0;->b:Landroid/app/Dialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    .line 13
    :catch_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    .line 3
    invoke-virtual {p0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p0

    new-instance p1, Leg0$g;

    invoke-direct {p1, p3}, Leg0$g;-><init>(Landroid/view/View$OnClickListener;)V

    const p2, 0x2749

    invoke-static {p2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-virtual {p0, p2, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 5
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public static m(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 7

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {}, Leg0;->B()V

    const v0, 0x7f12005c

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f12031e

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Leg0$b;

    invoke-direct {v5}, Leg0$b;-><init>()V

    new-instance v6, Leg0$c;

    invoke-direct {v6}, Leg0$c;-><init>()V

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static n(Landroid/app/Activity;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 7

    const v0, 0x7f12005c

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v0, 0x7f12031e

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Leg0$d;

    invoke-direct {v6}, Leg0$d;-><init>()V

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    invoke-static/range {v1 .. v6}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static o(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 6

    .line 1
    new-instance v5, Leg0$e;

    invoke-direct {v5}, Leg0$e;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static declared-synchronized p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
    .locals 2

    const-class v0, Leg0;

    monitor-enter v0

    if-nez p0, :cond_0

    .line 1
    monitor-exit v0

    return-void

    .line 2
    :cond_0
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_1
    :try_start_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    .line 5
    monitor-exit v0

    return-void

    .line 6
    :cond_2
    :try_start_2
    sget-object v1, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    .line 7
    monitor-exit v0

    return-void

    .line 8
    :cond_3
    :try_start_3
    invoke-static {}, Lcom/upi/axispay/custom/SingleButtonDialog;->newInstance()Lcom/upi/axispay/custom/SingleButtonDialog;

    move-result-object v1

    .line 9
    invoke-virtual {v1, p1}, Lcom/upi/axispay/custom/SingleButtonDialog;->setTitle(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v1, p2}, Lcom/upi/axispay/custom/SingleButtonDialog;->setMessage(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v1, p4}, Lcom/upi/axispay/custom/SingleButtonDialog;->setOkListner(Landroid/view/View$OnClickListener;)V

    .line 12
    invoke-virtual {v1, p3}, Lcom/upi/axispay/custom/SingleButtonDialog;->setOkBtnText(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v1, p5}, Lcom/upi/axispay/custom/SingleButtonDialog;->setCancelListner(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 14
    invoke-virtual {v1, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 16
    sput-object v1, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 17
    :catch_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static q(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V
    .locals 7

    if-eqz p5, :cond_0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p4

    .line 1
    invoke-static/range {v0 .. v5}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 2
    :cond_0
    new-instance v6, Leg0$f;

    invoke-direct {v6}, Leg0$f;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v1 .. v6}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public static r(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 3
    :cond_2
    :try_start_0
    invoke-static {}, Leg0;->c()V

    .line 4
    sget-object v0, Leg0;->d:Landroid/app/DialogFragment;

    if-eqz v0, :cond_3

    return-void

    .line 5
    :cond_3
    invoke-static {}, Lcom/upi/axispay/custom/DoubleButtonDialog;->newInstance()Lcom/upi/axispay/custom/DoubleButtonDialog;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setTitle(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, p2}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setMessage(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, p4}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setOkListner(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-virtual {v0, p6}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setCancelListner(Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-virtual {v0, p3}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setOkBtnText(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0, p5}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setCancelBtnText(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 13
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 14
    sput-object v0, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static s(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Z)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 3
    :cond_2
    :try_start_0
    invoke-static {}, Leg0;->c()V

    .line 4
    sget-object v0, Leg0;->d:Landroid/app/DialogFragment;

    if-eqz v0, :cond_3

    return-void

    .line 5
    :cond_3
    invoke-static {}, Lcom/upi/axispay/custom/DoubleButtonDialog;->newInstance()Lcom/upi/axispay/custom/DoubleButtonDialog;

    move-result-object v0

    .line 6
    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setTitle(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, p2}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setMessage(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, p4}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setOkListner(Landroid/view/View$OnClickListener;)V

    .line 9
    invoke-virtual {v0, p6}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setCancelListner(Landroid/view/View$OnClickListener;)V

    .line 10
    invoke-virtual {v0, p3}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setOkBtnText(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0, p5}, Lcom/upi/axispay/custom/DoubleButtonDialog;->setCancelBtnText(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 12
    invoke-virtual {v0, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 13
    invoke-virtual {v0, p7}, Lcom/upi/axispay/custom/DoubleButtonDialog;->imageHide(Z)V

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 15
    sput-object v0, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static t(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 3
    :cond_2
    :try_start_0
    invoke-static {}, Lcom/upi/axispay/custom/FooterCloseDialog;->newInstance()Lcom/upi/axispay/custom/FooterCloseDialog;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/FooterCloseDialog;->setTitle(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p2}, Lcom/upi/axispay/custom/FooterCloseDialog;->setMessage(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p3}, Lcom/upi/axispay/custom/FooterCloseDialog;->setFooter(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {v0, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 9
    sput-object v0, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static u(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroid/view/View$OnClickListener;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 3
    :cond_2
    :try_start_0
    invoke-static {}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->newInstance()Lcom/upi/axispay/custom/SingleButtonImageDialog;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->setTitle(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, p2}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->setMessage(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, p3}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->setIconRequired(Z)V

    .line 7
    invoke-virtual {v0, p4}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->setOkBtnText(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0, p5}, Lcom/upi/axispay/custom/SingleButtonImageDialog;->setOkListner(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 9
    invoke-virtual {v0, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 11
    sput-object v0, Leg0;->d:Landroid/app/DialogFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static v(Landroid/app/Activity;ILjava/lang/String;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    return-void

    .line 3
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 4
    :cond_3
    :try_start_0
    invoke-static {}, Leg0;->c()V

    .line 5
    invoke-static {p1}, Lcom/upi/axispay/custom/LoginPopupFragment;->newInstance(I)Lcom/upi/axispay/custom/LoginPopupFragment;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/app/DialogFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    .line 7
    :cond_4
    invoke-virtual {p1, p2}, Lcom/upi/axispay/custom/LoginPopupFragment;->setMessage(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 8
    invoke-virtual {p1, p2}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 10
    sput-object p1, Leg0;->f:Lcom/upi/axispay/custom/LoginPopupFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static w(Landroid/app/Activity;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
    .locals 2

    if-eqz p0, :cond_2

    .line 1
    sget-object v0, Leg0;->e:Landroid/app/DialogFragment;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    :try_start_0
    invoke-static {}, Leg0;->c()V

    .line 3
    invoke-static {}, Leg0;->e()V

    .line 4
    invoke-static {}, Lcom/upi/axispay/custom/RateAppDialog;->newInstance()Lcom/upi/axispay/custom/RateAppDialog;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/DialogFragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 6
    :cond_1
    invoke-virtual {v0, p1}, Lcom/upi/axispay/custom/RateAppDialog;->setRateNow(Landroid/view/View$OnClickListener;)V

    .line 7
    invoke-virtual {v0, p2}, Lcom/upi/axispay/custom/RateAppDialog;->setRemindLater(Landroid/view/View$OnClickListener;)V

    const/4 p1, 0x0

    .line 8
    invoke-virtual {v0, p1}, Landroid/app/DialogFragment;->setCancelable(Z)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    .line 10
    sput-object v0, Leg0;->e:Landroid/app/DialogFragment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public static x(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/google/android/material/snackbar/Snackbar;->X(Landroid/view/View;II)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->B()Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0418

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/Snackbar;->N()V

    return-void
.end method

.method public static y(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Leg0;->B()V

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Lcom/google/android/material/snackbar/Snackbar;->Y(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->B()Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0418

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 6
    invoke-virtual {p0}, Lcom/google/android/material/snackbar/Snackbar;->N()V

    return-void
.end method

.method public static z(Landroid/content/Context;I)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    const/16 p1, 0x11

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Landroid/widget/Toast;->setGravity(III)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method
