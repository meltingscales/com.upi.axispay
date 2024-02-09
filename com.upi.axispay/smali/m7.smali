.class public Lm7;
.super Landroid/view/ViewGroup;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm7$a;
    }
.end annotation


# instance fields
.field public b:Ll7;


# virtual methods
.method public a()Lm7$a;
    .locals 2

    .line 1
    new-instance v0, Lm7$a;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lm7$a;-><init>(II)V

    return-object v0
.end method

.method public b(Landroid/util/AttributeSet;)Lm7$a;
    .locals 2

    .line 1
    new-instance v0, Lm7$a;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lm7$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm7;->a()Lm7$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm7;->b(Landroid/util/AttributeSet;)Lm7$a;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getConstraintSet()Ll7;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7;->b:Ll7;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ll7;

    invoke-direct {v0}, Ll7;-><init>()V

    iput-object v0, p0, Lm7;->b:Ll7;

    .line 3
    :cond_0
    iget-object v0, p0, Lm7;->b:Ll7;

    invoke-virtual {v0, p0}, Ll7;->h(Lm7;)V

    .line 4
    iget-object v0, p0, Lm7;->b:Ll7;

    return-object v0
.end method

.method public onLayout(ZIIII)V
    .locals 0

    return-void
.end method
