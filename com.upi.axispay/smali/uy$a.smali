.class public Luy$a;
.super Lb9$c;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luy;->h(Landroid/content/Context;Lwy;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwy;

.field public final synthetic b:Luy;


# direct methods
.method public constructor <init>(Luy;Lwy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Luy$a;->b:Luy;

    iput-object p2, p0, Luy$a;->a:Lwy;

    invoke-direct {p0}, Lb9$c;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Luy$a;->b:Luy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Luy;->c(Luy;Z)Z

    .line 2
    iget-object v0, p0, Luy$a;->a:Lwy;

    invoke-virtual {v0, p1}, Lwy;->a(I)V

    return-void
.end method

.method public e(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Luy$a;->b:Luy;

    iget v1, v0, Luy;->d:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Luy;->b(Luy;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2
    iget-object p1, p0, Luy$a;->b:Luy;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Luy;->c(Luy;Z)Z

    .line 3
    iget-object p1, p0, Luy$a;->a:Lwy;

    iget-object v0, p0, Luy$a;->b:Luy;

    invoke-static {v0}, Luy;->a(Luy;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lwy;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
