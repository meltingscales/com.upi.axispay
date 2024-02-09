.class public Lux$c;
.super Lzv;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lux;->h(Law;FFF)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lux;


# direct methods
.method public constructor <init>(Lux;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lux$c;->d:Lux;

    invoke-direct {p0}, Lzv;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FLandroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lux$c;->d:Lux;

    invoke-static {v0, p1}, Lux;->c(Lux;F)F

    .line 2
    invoke-super {p0, p1, p2, p3}, Lzv;->a(FLandroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object p1

    return-object p1
.end method
