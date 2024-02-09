.class public Luy$b;
.super Lwy;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luy;->g(Landroid/content/Context;Landroid/text/TextPaint;Lwy;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/text/TextPaint;

.field public final synthetic b:Lwy;

.field public final synthetic c:Luy;


# direct methods
.method public constructor <init>(Luy;Landroid/text/TextPaint;Lwy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luy$b;->c:Luy;

    iput-object p2, p0, Luy$b;->a:Landroid/text/TextPaint;

    iput-object p3, p0, Luy$b;->b:Lwy;

    invoke-direct {p0}, Lwy;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Luy$b;->b:Lwy;

    invoke-virtual {v0, p1}, Lwy;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Luy$b;->c:Luy;

    iget-object v1, p0, Luy$b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, p1}, Luy;->l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 2
    iget-object v0, p0, Luy$b;->b:Lwy;

    invoke-virtual {v0, p1, p2}, Lwy;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
