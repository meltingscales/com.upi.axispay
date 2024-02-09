.class public Lxy;
.super Landroid/graphics/drawable/Drawable;
.source "AxisPay"

# interfaces
.implements Loz;
.implements Lp9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxy$b;
    }
.end annotation


# instance fields
.field public b:Lxy$b;


# direct methods
.method public constructor <init>(Llz;)V
    .locals 2

    .line 2
    new-instance v0, Lxy$b;

    new-instance v1, Lhz;

    invoke-direct {v1, p1}, Lhz;-><init>(Llz;)V

    invoke-direct {v0, v1}, Lxy$b;-><init>(Lhz;)V

    invoke-direct {p0, v0}, Lxy;-><init>(Lxy$b;)V

    return-void
.end method

.method public constructor <init>(Lxy$b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 4
    iput-object p1, p0, Lxy;->b:Lxy$b;

    return-void
.end method

.method public synthetic constructor <init>(Lxy$b;Lxy$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxy;-><init>(Lxy$b;)V

    return-void
.end method


# virtual methods
.method public a()Lxy;
    .locals 2

    .line 1
    new-instance v0, Lxy$b;

    iget-object v1, p0, Lxy;->b:Lxy$b;

    invoke-direct {v0, v1}, Lxy$b;-><init>(Lxy$b;)V

    .line 2
    iput-object v0, p0, Lxy;->b:Lxy$b;

    return-object p0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-boolean v1, v0, Lxy$b;->b:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0}, Lhz;->getOpacity()I

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mutate()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxy;->a()Lxy;

    return-object p0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onStateChange([I)Z
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lxy;->b:Lxy$b;

    iget-object v1, v1, Lxy$b;->a:Lhz;

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v0, v2

    .line 3
    :cond_0
    invoke-static {p1}, Lyy;->e([I)Z

    move-result p1

    .line 4
    iget-object v1, p0, Lxy;->b:Lxy$b;

    iget-boolean v3, v1, Lxy$b;->b:Z

    if-eq v3, p1, :cond_1

    .line 5
    iput-boolean p1, v1, Lxy$b;->b:Z

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    return v2
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->setAlpha(I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setShapeAppearanceModel(Llz;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->setShapeAppearanceModel(Llz;)V

    return-void
.end method

.method public setTint(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lxy;->b:Lxy$b;

    iget-object v0, v0, Lxy$b;->a:Lhz;

    invoke-virtual {v0, p1}, Lhz;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method
