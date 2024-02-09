.class public Lzz$h;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzz;->G(Landroid/widget/AutoCompleteTextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/AutoCompleteTextView;

.field public final synthetic c:Lzz;


# direct methods
.method public constructor <init>(Lzz;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzz$h;->c:Lzz;

    iput-object p2, p0, Lzz$h;->b:Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lzz$h;->c:Lzz;

    invoke-static {p1}, Lzz;->j(Lzz;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lzz$h;->c:Lzz;

    invoke-static {p1, p2}, Lzz;->p(Lzz;Z)Z

    .line 4
    :cond_0
    iget-object p1, p0, Lzz$h;->c:Lzz;

    iget-object v0, p0, Lzz$h;->b:Landroid/widget/AutoCompleteTextView;

    invoke-static {p1, v0}, Lzz;->q(Lzz;Landroid/widget/AutoCompleteTextView;)V

    :cond_1
    return p2
.end method
