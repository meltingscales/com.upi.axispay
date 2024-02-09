.class public Lhz$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lmz$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhz;-><init>(Lhz$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhz;


# direct methods
.method public constructor <init>(Lhz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhz$a;->a:Lhz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lnz;Landroid/graphics/Matrix;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhz$a;->a:Lhz;

    invoke-static {v0}, Lhz;->b(Lhz;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lnz;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    .line 2
    iget-object v0, p0, Lhz$a;->a:Lhz;

    invoke-static {v0}, Lhz;->d(Lhz;)[Lnz$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lnz;->f(Landroid/graphics/Matrix;)Lnz$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lnz;Landroid/graphics/Matrix;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhz$a;->a:Lhz;

    invoke-static {v0}, Lhz;->b(Lhz;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lnz;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    .line 2
    iget-object v0, p0, Lhz$a;->a:Lhz;

    invoke-static {v0}, Lhz;->c(Lhz;)[Lnz$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lnz;->f(Landroid/graphics/Matrix;)Lnz$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
