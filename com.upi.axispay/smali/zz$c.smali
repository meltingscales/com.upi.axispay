.class public Lzz$c;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lzz;


# direct methods
.method public constructor <init>(Lzz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzz$c;->a:Lzz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lzz$c;->a:Lzz;

    iget-object p1, p1, La00;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1, p2}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconActivated(Z)V

    if-nez p2, :cond_0

    .line 2
    iget-object p1, p0, Lzz$c;->a:Lzz;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lzz;->o(Lzz;Z)V

    .line 3
    iget-object p1, p0, Lzz$c;->a:Lzz;

    invoke-static {p1, p2}, Lzz;->p(Lzz;Z)Z

    :cond_0
    return-void
.end method
