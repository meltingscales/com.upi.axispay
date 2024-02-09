.class public Ldy;
.super Li1;
.source "AxisPay"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Li1;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Li1;->a(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    check-cast p1, Lk1;

    .line 2
    new-instance p2, Lfy;

    invoke-virtual {p0}, Li1;->w()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3, p0, p1}, Lfy;-><init>(Landroid/content/Context;Ldy;Lk1;)V

    .line 3
    invoke-virtual {p1, p2}, Lk1;->x(Lt1;)V

    return-object p2
.end method
