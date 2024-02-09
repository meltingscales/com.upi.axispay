.class public Lg9$a;
.super Loa$c;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lb9$c;


# direct methods
.method public constructor <init>(Lb9$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loa$c;-><init>()V

    .line 2
    iput-object p1, p0, Lg9$a;->a:Lb9$c;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg9$a;->a:Lb9$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lb9$c;->d(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg9$a;->a:Lb9$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lb9$c;->e(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
