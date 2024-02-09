.class public Ll90$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll90;->y(Ll90$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lpg0;

.field public final synthetic c:Ll90$d;

.field public final synthetic d:Ll90;


# direct methods
.method public constructor <init>(Ll90;Lpg0;Ll90$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll90$b;->d:Ll90;

    iput-object p2, p0, Ll90$b;->b:Lpg0;

    iput-object p3, p0, Ll90$b;->c:Ll90$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Ll90$b;->b:Lpg0;

    invoke-virtual {p1}, Lpg0;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2
    iget-object p1, p0, Ll90$b;->d:Ll90;

    invoke-static {p1}, Ll90;->w(Ll90;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Ll90$b;->c:Ll90$d;

    iget-object p1, p1, Ll90$d;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Ll90$b;->d:Ll90;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ll90;->x(Ll90;Z)Z

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Ll90$b;->d:Ll90;

    invoke-static {p1, v0}, Ll90;->x(Ll90;Z)Z

    .line 6
    iget-object p1, p0, Ll90$b;->c:Ll90$d;

    iget-object p1, p1, Ll90$d;->z:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Ll90$b;->d:Ll90;

    iget-object p1, p1, Ll90;->e:Lng0;

    const/16 v0, 0xca

    iget-object v1, p0, Ll90$b;->b:Lpg0;

    invoke-interface {p1, v0, v1}, Lng0;->s(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
