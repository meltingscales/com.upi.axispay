.class public Lv1$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lfc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Lv1;


# direct methods
.method public constructor <init>(Lv1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv1$a;->c:Lv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lv1$a;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lv1$a;->a:Z

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lv1$a;->a:Z

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lv1$a;->c:Lv1;

    const/4 v0, 0x0

    iput-object v0, p1, Lv1;->g:Lec;

    .line 3
    iget v0, p0, Lv1$a;->b:I

    invoke-static {p1, v0}, Lv1;->b(Lv1;I)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lv1$a;->c:Lv1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lv1;->a(Lv1;I)V

    .line 2
    iput-boolean v0, p0, Lv1$a;->a:Z

    return-void
.end method

.method public d(Lec;I)Lv1$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1$a;->c:Lv1;

    iput-object p1, v0, Lv1;->g:Lec;

    .line 2
    iput p2, p0, Lv1$a;->b:I

    return-object p0
.end method
