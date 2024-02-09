.class public Lmyunmn/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Lmyunmn/b;


# direct methods
.method public constructor <init>(Lmyunmn/b;)V
    .locals 0

    iput-object p1, p0, Lmyunmn/aw;->a:Lmyunmn/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p2, p0, Lmyunmn/aw;->a:Lmyunmn/b;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lmyunmn/b;->a(Lmyunmn/b;Z)V

    iget-object p2, p0, Lmyunmn/aw;->a:Lmyunmn/b;

    invoke-virtual {p2}, Lmyunmn/b;->n()V

    iget-object p2, p0, Lmyunmn/aw;->a:Lmyunmn/b;

    invoke-static {p2}, Lmyunmn/b;->b(Lmyunmn/b;)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
