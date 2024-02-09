.class public Lxc0;
.super Landroidx/fragment/app/Fragment;
.source "AxisPay"


# instance fields
.field public b:Lmg0;

.field public c:Lz;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Landroid/app/Activity;

.field public k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const v0, 0x401

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 2
    iput-object v0, p0, Lxc0;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public j(Ljava/lang/String;I)Z
    .locals 4

    const/4 v1, 0x0

    .line 1
    :try_start_0
    iput p2, p0, Lxc0;->e:I

    .line 2
    iget v2, p0, Lxc0;->f:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, p0, Lxc0;->f:I

    .line 3
    iget-object v2, p0, Lxc0;->c:Lz;

    invoke-static {v2, p1}, Lt8;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    iget-object v2, p0, Lxc0;->c:Lz;

    invoke-static {v2, p1}, Ld8;->p(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    const v0, 0x402

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ln70;->e(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p0, p2}, Lxc0;->l(I)V

    goto :goto_0

    :cond_0
    new-array p2, v3, [Ljava/lang/String;

    aput-object p1, p2, v1

    const/16 p1, 0x64

    .line 7
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return v1

    .line 8
    :cond_2
    invoke-virtual {p0, p2}, Lxc0;->l(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    return v1
.end method

.method public k()Lz;
    .locals 1

    .line 1
    iget-object v0, p0, Lxc0;->c:Lz;

    return-object v0
.end method

.method public l(I)V
    .locals 0

    return-void
.end method

.method public m(I)V
    .locals 0

    return-void
.end method

.method public n(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;)Z
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lxc0;->o(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;Z)Z

    move-result p1

    return p1
.end method

.method public o(Lcom/olive/upi/transport/OliveRequest;Lcom/olive/upi/transport/api/Result;Z)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lxc0;->k()Lz;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getRequestType()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_1

    .line 3
    invoke-static {}, Lc70;->q()V

    :cond_1
    const v0, 0x7f120008

    const/4 v2, 0x1

    if-eqz p2, :cond_d

    .line 4
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_2

    const p3, 0x403

    invoke-static {p3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getCode()Ljava/lang/String;

    move-result-object p3

    :goto_0
    const v3, 0x404

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 6
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p2

    iget p3, p0, Lxc0;->g:I

    if-ne p2, p3, :cond_3

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->isBackgroundCall()Z

    move-result p1

    if-nez p1, :cond_3

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    const p2, 0x7f1204b8

    invoke-static {p1, p2}, Leg0;->x(Landroid/view/View;I)V

    :cond_3
    return v2

    :cond_4
    const v3, 0x405

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    const p2, 0x7f1204b7

    invoke-static {p1, p2}, Leg0;->x(Landroid/view/View;I)V

    .line 10
    invoke-static {}, Lc70;->q()V

    goto/16 :goto_1

    :cond_5
    const v3, 0x406

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 12
    invoke-static {}, Lc70;->q()V

    goto/16 :goto_1

    :cond_6
    const v3, 0x407

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 13
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    const p2, 0x7f1202fd

    invoke-static {p1, p2}, Leg0;->x(Landroid/view/View;I)V

    return v2

    :cond_7
    const v3, 0x408

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 16
    invoke-static {}, Leg0;->B()V

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v4

    const p1, 0x7f12042c

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f12042b

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    const p1, 0x7f120233

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lxc0$a;

    invoke-direct {v8, p0}, Lxc0$a;-><init>(Lxc0;)V

    new-instance v9, Lxc0$b;

    invoke-direct {v9, p0}, Lxc0$b;-><init>(Lxc0;)V

    invoke-static/range {v4 .. v9}, Leg0;->p(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return v2

    :cond_8
    const v3, 0x409

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 18
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 19
    invoke-static {}, Leg0;->B()V

    return v2

    .line 20
    :cond_9
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p3

    iget v3, p0, Lxc0;->g:I

    if-ne p3, v3, :cond_c

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->isBackgroundCall()Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_2

    .line 21
    :cond_a
    invoke-virtual {p2}, Lcom/olive/upi/transport/api/Result;->getResult()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_b

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    return v2

    :cond_b
    :goto_1
    return v1

    :cond_c
    :goto_2
    return v2

    .line 23
    :cond_d
    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->getInitiator()I

    move-result p2

    iget v1, p0, Lxc0;->g:I

    if-ne p2, v1, :cond_f

    invoke-virtual {p1}, Lcom/olive/upi/transport/OliveRequest;->isBackgroundCall()Z

    move-result p1

    if-eqz p1, :cond_e

    goto :goto_3

    :cond_e
    if-eqz p3, :cond_f

    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Leg0;->m(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_f
    :goto_3
    return v2

    .line 25
    :cond_10
    :goto_4
    invoke-virtual {p0}, Lxc0;->r()V

    return v1
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 2
    check-cast p1, Lz;

    iput-object p1, p0, Lxc0;->c:Lz;

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 3
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 4
    instance-of v0, p1, Lmg0;

    if-eqz v0, :cond_0

    .line 5
    check-cast p1, Lmg0;

    iput-object p1, p0, Lxc0;->b:Lmg0;

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lxc0;->h:Z

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object p1

    iput-object p1, p0, Lxc0;->j:Landroid/app/Activity;

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lxc0;->h:Z

    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lxc0;->b:Lmg0;

    .line 3
    iput-object v0, p0, Lxc0;->c:Lz;

    return-void
.end method

.method public onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lxc0;->h:Z

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    if-eqz p2, :cond_2

    .line 1
    array-length p1, p2

    if-lez p1, :cond_2

    if-eqz p3, :cond_2

    array-length p1, p3

    if-lez p1, :cond_2

    .line 2
    array-length p1, p3

    const v0, 0x40a

    invoke-static {v0}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v0

    if-lez p1, :cond_0

    const/4 p1, 0x0

    aget p3, p3, p1

    if-nez p3, :cond_0

    .line 3
    iget p2, p0, Lxc0;->e:I

    invoke-virtual {p0, p2}, Lxc0;->m(I)V

    .line 4
    sget-object p2, Ln70;->f:Ln70$a;

    invoke-virtual {p2}, Ln70$a;->a()Ln70;

    move-result-object p2

    invoke-virtual {p2, v0, p1}, Ln70;->A(Ljava/lang/String;Z)V

    goto :goto_0

    .line 5
    :cond_0
    iget p1, p0, Lxc0;->f:I

    const/4 p3, 0x2

    const/4 v1, 0x1

    if-ge p1, p3, :cond_1

    add-int/2addr p1, v1

    .line 6
    iput p1, p0, Lxc0;->f:I

    const/16 p1, 0x64

    .line 7
    invoke-virtual {p0, p2, p1}, Landroidx/fragment/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 8
    :cond_1
    sget-object p1, Ln70;->f:Ln70$a;

    invoke-virtual {p1}, Ln70$a;->a()Ln70;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Ln70;->A(Ljava/lang/String;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lxc0;->c:Lz;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Lsd;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isDetached()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lxc0;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 4
    invoke-static {}, Ly80;->b()Ly80;

    move-result-object v0

    sget-object v1, Ly80$b;->b:Ly80$b;

    invoke-virtual {v0, v1}, Ly80;->a(Ly80$b;)Lcom/google/android/gms/analytics/Tracker;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;

    invoke-direct {v1}, Lcom/google/android/gms/analytics/HitBuilders$ScreenViewBuilder;-><init>()V

    .line 6
    iget-object v2, p0, Lxc0;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/analytics/Tracker;->setScreenName(Ljava/lang/String;)V

    .line 7
    sget-object v2, Ln70;->f:Ln70$a;

    invoke-virtual {v2}, Ln70$a;->a()Ln70;

    move-result-object v2

    const v3, 0x40b

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln70;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljg0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v3, 0x40c

    invoke-static {v3}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/analytics/HitBuilders$HitBuilder;->build()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    .line 9
    :cond_1
    iget-object v0, p0, Lxc0;->b:Lmg0;

    iget v1, p0, Lxc0;->g:I

    iget-object v2, p0, Lxc0;->d:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lmg0;->m(ILjava/lang/String;)V

    return-void

    .line 10
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lxc0;->r()V

    return-void
.end method

.method public p(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Lxc0;->f:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lxc0;->f:I

    new-array v0, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/16 p1, 0x64

    .line 2
    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exit(I)V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 2
    iput-boolean p1, p0, Lxc0;->i:Z

    return-void
.end method

.method public t(Landroidx/fragment/app/Fragment;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Landroid/transition/Fade;

    invoke-direct {v0}, Landroid/transition/Fade;-><init>()V

    const-wide/16 v1, 0x12c

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/transition/Fade;->setDuration(J)Landroid/transition/Transition;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setExitTransition(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setEnterTransition(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public u(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxc0;->g:I

    return-void
.end method

.method public v(ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lxc0;->d:Ljava/lang/String;

    .line 2
    iput p1, p0, Lxc0;->g:I

    return-void
.end method

.method public w(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxc0;->d:Ljava/lang/String;

    return-void
.end method
