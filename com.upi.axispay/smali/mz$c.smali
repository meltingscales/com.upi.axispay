.class public final Lmz$c;
.super Ljava/lang/Object;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Llz;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/RectF;

.field public final d:Lmz$b;

.field public final e:F


# direct methods
.method public constructor <init>(Llz;FLandroid/graphics/RectF;Lmz$b;Landroid/graphics/Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p4, p0, Lmz$c;->d:Lmz$b;

    .line 3
    iput-object p1, p0, Lmz$c;->a:Llz;

    .line 4
    iput p2, p0, Lmz$c;->e:F

    .line 5
    iput-object p3, p0, Lmz$c;->c:Landroid/graphics/RectF;

    .line 6
    iput-object p5, p0, Lmz$c;->b:Landroid/graphics/Path;

    return-void
.end method
