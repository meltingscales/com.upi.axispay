.class public Lnx$a;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnx;->x(I)Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lnx;


# direct methods
.method public constructor <init>(Lnx;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnx$a;->c:Lnx;

    iput p2, p0, Lnx$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget p1, p0, Lnx$a;->b:I

    iget-object v0, p0, Lnx$a;->c:Lnx;

    invoke-static {v0}, Lnx;->w(Lnx;)Lcx;

    move-result-object v0

    invoke-virtual {v0}, Lcx;->x()Lcom/google/android/material/datepicker/Month;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/Month;->c:I

    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/Month;->c(II)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lnx$a;->c:Lnx;

    invoke-static {v0}, Lnx;->w(Lnx;)Lcx;

    move-result-object v0

    invoke-virtual {v0}, Lcx;->v()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/CalendarConstraints;->f(Lcom/google/android/material/datepicker/Month;)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lnx$a;->c:Lnx;

    invoke-static {v0}, Lnx;->w(Lnx;)Lcx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcx;->D(Lcom/google/android/material/datepicker/Month;)V

    .line 5
    iget-object p1, p0, Lnx$a;->c:Lnx;

    invoke-static {p1}, Lnx;->w(Lnx;)Lcx;

    move-result-object p1

    sget-object v0, Lcx$k;->b:Lcx$k;

    invoke-virtual {p1, v0}, Lcx;->E(Lcx$k;)V

    return-void
.end method
