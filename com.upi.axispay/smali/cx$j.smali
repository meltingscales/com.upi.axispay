.class public Lcx$j;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcx;->t(Landroid/view/View;Lhx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lhx;

.field public final synthetic c:Lcx;


# direct methods
.method public constructor <init>(Lcx;Lhx;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcx$j;->c:Lcx;

    iput-object p2, p0, Lcx$j;->b:Lhx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcx$j;->c:Lcx;

    invoke-virtual {p1}, Lcx;->A()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->b2()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcx$j;->c:Lcx;

    iget-object v1, p0, Lcx$j;->b:Lhx;

    invoke-virtual {v1, p1}, Lhx;->x(I)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcx;->D(Lcom/google/android/material/datepicker/Month;)V

    :cond_0
    return-void
.end method
