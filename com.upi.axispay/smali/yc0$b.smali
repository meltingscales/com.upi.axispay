.class public Lyc0$b;
.super Ljava/lang/Object;
.source "AxisPay"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayout$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyc0;->E(Landroidx/viewpager/widget/ViewPager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lyc0;


# direct methods
.method public constructor <init>(Lyc0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc0$b;->a:Lyc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 0

    return-void
.end method

.method public c(Lcom/google/android/material/tabs/TabLayout$g;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyc0$b;->a:Lyc0;

    invoke-static {v0}, Lyc0;->y(Lyc0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    iget-object v2, p0, Lyc0$b;->a:Lyc0;

    iget-object v2, v2, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v1, v2, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 2
    iget-object v0, p0, Lyc0$b;->a:Lyc0;

    invoke-static {v0}, Lyc0;->y(Lyc0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    iget-object v2, p0, Lyc0$b;->a:Lyc0;

    iget-object v2, v2, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 3
    iget-object v0, p0, Lyc0$b;->a:Lyc0;

    invoke-static {v0}, Lyc0;->y(Lyc0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    iget-object v3, p0, Lyc0$b;->a:Lyc0;

    iget-object v3, v3, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 4
    iget-object v0, p0, Lyc0$b;->a:Lyc0;

    invoke-static {v0}, Lyc0;->y(Lyc0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout;->x(I)Lcom/google/android/material/tabs/TabLayout$g;

    move-result-object v0

    iget-object v3, p0, Lyc0$b;->a:Lyc0;

    iget-object v3, v3, Lyc0;->l:[Ljava/lang/Integer;

    aget-object v2, v3, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/tabs/TabLayout$g;->p(I)Lcom/google/android/material/tabs/TabLayout$g;

    .line 5
    iget-object v0, p0, Lyc0$b;->a:Lyc0;

    invoke-static {v0}, Lyc0;->y(Lyc0;)Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$g;->g()I

    move-result p1

    invoke-static {v0, p1, v1}, Ljg0;->T(Lcom/google/android/material/tabs/TabLayout;II)V

    return-void
.end method
