.class public Ldx$d;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx;->y(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ldx;


# direct methods
.method public constructor <init>(Ldx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldx$d;->b:Ldx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Ldx$d;->b:Ldx;

    invoke-static {p1}, Ldx;->n(Ldx;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Ldx$d;->b:Ldx;

    invoke-static {v0}, Ldx;->m(Ldx;)Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/material/datepicker/DateSelector;->r()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 2
    iget-object p1, p0, Ldx$d;->b:Ldx;

    invoke-static {p1}, Ldx;->o(Ldx;)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    .line 3
    iget-object p1, p0, Ldx$d;->b:Ldx;

    invoke-static {p1}, Ldx;->o(Ldx;)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v0

    invoke-static {p1, v0}, Ldx;->p(Ldx;Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 4
    iget-object p1, p0, Ldx$d;->b:Ldx;

    invoke-static {p1}, Ldx;->q(Ldx;)V

    return-void
.end method
