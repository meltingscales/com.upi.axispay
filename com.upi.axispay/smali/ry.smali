.class public final Lry;
.super Lwy;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lry$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/Typeface;

.field public final b:Lry$a;

.field public c:Z


# direct methods
.method public constructor <init>(Lry$a;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwy;-><init>()V

    .line 2
    iput-object p2, p0, Lry;->a:Landroid/graphics/Typeface;

    .line 3
    iput-object p1, p0, Lry;->b:Lry$a;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lry;->a:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, Lry;->d(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lry;->d(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lry;->c:Z

    return-void
.end method

.method public final d(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lry;->c:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lry;->b:Lry$a;

    invoke-interface {v0, p1}, Lry$a;->a(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
