.class public Ldx$c;
.super Lix;
.source "AxisPay"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldx;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lix<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ldx;


# direct methods
.method public constructor <init>(Ldx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldx$c;->a:Ldx;

    invoke-direct {p0}, Lix;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldx$c;->a:Ldx;

    invoke-static {v0}, Ldx;->n(Ldx;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    iget-object p1, p0, Ldx$c;->a:Ldx;

    invoke-static {p1}, Ldx;->l(Ldx;)V

    .line 2
    iget-object p1, p0, Ldx$c;->a:Ldx;

    invoke-static {p1}, Ldx;->n(Ldx;)Landroid/widget/Button;

    move-result-object p1

    iget-object v0, p0, Ldx$c;->a:Ldx;

    invoke-static {v0}, Ldx;->m(Ldx;)Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/material/datepicker/DateSelector;->r()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method
