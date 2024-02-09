.class public final Li60;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li60$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li60$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Li60$b;->a(Li60$b;)I

    .line 4
    invoke-static {p1}, Li60$b;->b(Li60$b;)I

    .line 5
    invoke-static {p1}, Li60$b;->l(Li60$b;)I

    .line 6
    invoke-static {p1}, Li60$b;->m(Li60$b;)Landroid/graphics/drawable/Drawable;

    .line 7
    invoke-static {p1}, Li60$b;->n(Li60$b;)Landroid/graphics/drawable/Drawable;

    .line 8
    invoke-static {p1}, Li60$b;->o(Li60$b;)Landroid/graphics/drawable/Drawable;

    .line 9
    invoke-static {p1}, Li60$b;->p(Li60$b;)Z

    .line 10
    invoke-static {p1}, Li60$b;->q(Li60$b;)Z

    .line 11
    invoke-static {p1}, Li60$b;->r(Li60$b;)Z

    .line 12
    invoke-static {p1}, Li60$b;->s(Li60$b;)Lm60;

    .line 13
    invoke-static {p1}, Li60$b;->c(Li60$b;)Landroid/graphics/BitmapFactory$Options;

    .line 14
    invoke-static {p1}, Li60$b;->d(Li60$b;)I

    .line 15
    invoke-static {p1}, Li60$b;->e(Li60$b;)Z

    .line 16
    invoke-static {p1}, Li60$b;->f(Li60$b;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Li60;->a:Ljava/lang/Object;

    .line 17
    invoke-static {p1}, Li60$b;->g(Li60$b;)Lx60;

    .line 18
    invoke-static {p1}, Li60$b;->h(Li60$b;)Lx60;

    .line 19
    invoke-static {p1}, Li60$b;->i(Li60$b;)Ls60;

    .line 20
    invoke-static {p1}, Li60$b;->j(Li60$b;)Landroid/os/Handler;

    .line 21
    invoke-static {p1}, Li60$b;->k(Li60$b;)Z

    return-void
.end method

.method public synthetic constructor <init>(Li60$b;Li60$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li60;-><init>(Li60$b;)V

    return-void
.end method

.method public static a()Li60;
    .locals 1

    .line 1
    new-instance v0, Li60$b;

    invoke-direct {v0}, Li60$b;-><init>()V

    invoke-virtual {v0}, Li60$b;->t()Li60;

    move-result-object v0

    return-object v0
.end method
