.class public Lt1;
.super Li1;
.source "AxisPay"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public B:Li1;

.field public C:Lk1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li1;Lk1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li1;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lt1;->B:Li1;

    .line 3
    iput-object p3, p0, Lt1;->C:Lk1;

    return-void
.end method


# virtual methods
.method public F()Li1;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0}, Li1;->F()Li1;

    move-result-object v0

    return-object v0
.end method

.method public H()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0}, Li1;->H()Z

    move-result v0

    return v0
.end method

.method public I()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0}, Li1;->I()Z

    move-result v0

    return v0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0}, Li1;->J()Z

    move-result v0

    return v0
.end method

.method public V(Li1$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0, p1}, Li1;->V(Li1$a;)V

    return-void
.end method

.method public f(Lk1;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0, p1}, Li1;->f(Lk1;)Z

    move-result p1

    return p1
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->C:Lk1;

    return-object v0
.end method

.method public h(Li1;Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Li1;->h(Li1;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lt1;->B:Li1;

    .line 2
    invoke-virtual {v0, p1, p2}, Li1;->h(Li1;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public i0()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    return-object v0
.end method

.method public m(Lk1;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0, p1}, Li1;->m(Lk1;)Z

    move-result p1

    return p1
.end method

.method public setGroupDividerEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0, p1}, Li1;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Li1;->Y(I)Li1;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Li1;->Z(Landroid/graphics/drawable/Drawable;)Li1;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Li1;->b0(I)Li1;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Li1;->c0(Ljava/lang/CharSequence;)Li1;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Li1;->d0(Landroid/view/View;)Li1;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, Lt1;->C:Lk1;

    invoke-virtual {v0, p1}, Lk1;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->C:Lk1;

    invoke-virtual {v0, p1}, Lk1;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setQwertyMode(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt1;->B:Li1;

    invoke-virtual {v0, p1}, Li1;->setQwertyMode(Z)V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lt1;->C:Lk1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lk1;->getItemId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Li1;->v()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x4b5

    invoke-static {v2}, Lmyunmn/ao;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
