.class public Lic$k;
.super Lic$j;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# static fields
.field public static final r:Lic;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    invoke-static {v0}, Lic;->w(Landroid/view/WindowInsets;)Lic;

    move-result-object v0

    sput-object v0, Lic$k;->r:Lic;

    return-void
.end method

.method public constructor <init>(Lic;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lic$j;-><init>(Lic;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lic;Lic$k;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lic$j;-><init>(Lic;Lic$j;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public g(I)Le9;
    .locals 1

    .line 1
    iget-object v0, p0, Lic$g;->c:Landroid/view/WindowInsets;

    .line 2
    invoke-static {p1}, Lic$n;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    .line 3
    invoke-static {p1}, Le9;->d(Landroid/graphics/Insets;)Le9;

    move-result-object p1

    return-object p1
.end method
